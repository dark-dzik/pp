package a;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Kettle extends WaterContainer {

    private static final long WATER_BOILING_TIME = 10000;

    private boolean boilingWater;

    public Kettle(int maximumCapacity, int currentWaterAmount) {
        super(maximumCapacity, currentWaterAmount);
    }

    public boolean isBoilingWater() {
        return boilingWater;
    }

    public void boilWater() throws InterruptedException {
        log.info("Kettle starts boiling water.");
        boilingWater = true;
        Thread.sleep(WATER_BOILING_TIME);
        boilingWater = false;
        log.info("Kettle has boiled the water.");
    }

}
