package b;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Kettle extends WaterContainer {

    private static final long WATER_BOILING_TIME = 10000;

    public Kettle(int maximumCapacity, int currentWaterAmount) {
        super(maximumCapacity, currentWaterAmount);
    }

    public void fillAndBoil() throws InterruptedException {
        log.info("Kettle starts boiling water.");
        Thread.sleep(WATER_BOILING_TIME);
        this.fill();
        log.info("Kettle has boiled the water.");
    }

}
