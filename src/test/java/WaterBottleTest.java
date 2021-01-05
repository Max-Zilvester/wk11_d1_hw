import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void setUp(){
        waterBottle = new WaterBottle(100);
    }

    @Test
    public void hasVolume() {
        WaterBottle waterBottle = new WaterBottle(100);
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void lessVolumeBy10() {
        WaterBottle ReducedWaterBottle = new WaterBottle(90);
        assertEquals(90, ReducedWaterBottle.getVolume());
    }

    @Test
    public void volumeTo0() {
        WaterBottle EmptyWaterBottle = new WaterBottle(0);
        assertEquals(0, EmptyWaterBottle.getVolume());
    }

    @Test
    public void volumeTo100() {
        WaterBottle FillWaterBottle = new WaterBottle(100);
        assertEquals(100, FillWaterBottle.getVolume());
    }
}
