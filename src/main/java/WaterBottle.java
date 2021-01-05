public class WaterBottle {
    private int volume;

    public WaterBottle(int volume) {
        this.volume = volume;
    }

    public int getVolume(){
        return this.volume;
    }

    public int getReducedWaterBottle(){
        return this.volume - 10;
    }

    public int getEmptyWaterBottle() {
        return this.volume - 100;
    }

    public int getFullWaterBottle() {
        return this.volume + 100;
    }
}
