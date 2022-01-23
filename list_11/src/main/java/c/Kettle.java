package c;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Kettle extends WaterContainer {

    private static final long WATER_POURING_TIME = 2000;

    private static final long WATER_BOILING_TIME = 10000;

    public Kettle(int maximumCapacity, int currentWaterAmount) {
        super(maximumCapacity, currentWaterAmount);
    }

    public synchronized void fillAndBoil() throws InterruptedException {
        if(this.getCurrentWaterAmount() > 0) {
            log.info("Kettle contains boiled water.");
            return;
        }

        log.info("Kettle starts boiling water.");
        Thread.sleep(WATER_BOILING_TIME);
        this.fill();
        log.info("Kettle has boiled the water.");
    }

}
