package a;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.math3.random.RandomDataGenerator;

@Slf4j
public class Dweller extends Thread {

    private static final long MIN_ACTION_TIME = 100;

    private static final long MAX_ACTION_TIME = 1000;

    private final Kettle kettle;

    private final Cup cup;

    private int refillsAmount;

    public Dweller(String dwellerName, Kettle kettle, Cup cup, int refillsAmount) {
        super(dwellerName);
        this.kettle = kettle;
        this.cup = cup;
        this.refillsAmount = refillsAmount;
    }

    private void drink() {
        int availableAmount = cup.getCurrentWaterAmount();
        int drankAmount = new RandomDataGenerator().nextInt(1, availableAmount);
        cup.setCurrentWaterAmount(availableAmount - drankAmount);
        log.info("{} takes a sip, drank amount: {}", this.getName(), drankAmount);
    }

    private boolean canFillKettle() {
        return !kettle.isBoilingWater() && kettle.getCurrentWaterAmount() == 0;
    }

    private boolean canPourFromKettle() {
        return !kettle.isBoilingWater() && kettle.getCurrentWaterAmount() > 0;
    }

    private boolean canDrinkFromCup() {
        return cup.getCurrentWaterAmount() > 0;
    }

    private void fillKettle() {
        log.info("{} fills kettle.", this.getName());
        kettle.fill();
    }

    private void boilKettle() throws InterruptedException {
        log.info("{} boils kettle.", this.getName());
        kettle.boilWater();
    }

    private void fillCup() {
        int availableAmountInKettle = kettle.getCurrentWaterAmount();
        log.info("{} wants to fill cup, available amount in kettle: {}", this.getName(), availableAmountInKettle);
        if(availableAmountInKettle < cup.getMaximumCapacity()) {
            cup.setCurrentWaterAmount(availableAmountInKettle);
            kettle.setCurrentWaterAmount(0);
        } else {
            cup.fill();
            kettle.setCurrentWaterAmount(availableAmountInKettle - cup.getMaximumCapacity());
        }
        log.info("{} filled cup, current amount in kettle: {}", this.getName(), kettle.getCurrentWaterAmount());
    }

    private long pickRandomActionTime() {
        return new RandomDataGenerator().nextLong(MIN_ACTION_TIME, MAX_ACTION_TIME);
    }

    @Override
    public void run() {
        log.info("{} is thirsty.", this.getName());
        while(refillsAmount > 0 || canDrinkFromCup()) {
            try {
                Thread.sleep(pickRandomActionTime());

                if(canDrinkFromCup()) {
                    drink();
                    continue;
                }

                if(canPourFromKettle()) {
                    fillCup();
                    refillsAmount--;
                    continue;
                }

                if(canFillKettle()) {
                    fillKettle();
                    boilKettle();
                    continue;
                }

            } catch (InterruptedException e) {
                log.error("{} has thrown an error.", this.getName());
                e.printStackTrace();
            }
        }
        log.info("{} drank last refill.", this.getName());
    }
}
