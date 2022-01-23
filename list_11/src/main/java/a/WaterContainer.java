package a;

public abstract class WaterContainer {

    private final int maximumCapacity;

    private int currentWaterAmount;

    public WaterContainer(int maximumCapacity, int currentWaterAmount) {
        this.maximumCapacity = maximumCapacity;
        this.currentWaterAmount = currentWaterAmount;
    }

    public int getMaximumCapacity() {
        return maximumCapacity;
    }

    public int getCurrentWaterAmount() {
        return currentWaterAmount;
    }

    public void setCurrentWaterAmount(int currentWaterAmount) {
        this.currentWaterAmount = currentWaterAmount;
    }

    public void fill() {
        currentWaterAmount = maximumCapacity;
    }
}
