package pl.kodu.akademia;

import static pl.kodu.akademia.Constants.*;

public class MyWater {

    private int largeBottlesCount = 0;
    private int mediumBottlesCount = 0;
    private int smallBottlesCount = 0;

    public MyWater() {
    }

    public void addLarge(int pieces) {
        this.largeBottlesCount += pieces;
    }

    public void addMedium(int pieces) {
        this.mediumBottlesCount += pieces;
    }

    public void addSmall(int pieces) {
        this.smallBottlesCount += pieces;
    }

    public double getTotalAmount() {
        return this.largeBottlesCount * LARGE_BOTTLE_VOLUME
                + this.mediumBottlesCount * MEDIUM_BOTTLE_VOLUME
                + this.smallBottlesCount * SMALL_BOTTLE_VOLUME;
    }

    public int getLargeBottlesCount() {
        return largeBottlesCount;
    }

    public int getMediumBottlesCount() {
        return mediumBottlesCount;
    }

    public int getSmallBottlesCount() {
        return smallBottlesCount;
    }

    public double getSmallBottleVolume() {
        return SMALL_BOTTLE_VOLUME;
    }

    public double getMediumBottleVolume() {
        return MEDIUM_BOTTLE_VOLUME;
    }

    public double getLargeBottleVolume() {
        return LARGE_BOTTLE_VOLUME;
    }
}
