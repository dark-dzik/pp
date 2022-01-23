package a;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Cup extends WaterContainer {

    public Cup(int maximumCapacity, int currentWaterAmount) {
        super(maximumCapacity, currentWaterAmount);
    }
}
