import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScaniaTest {
    static Scania truckScania;
    @BeforeEach
    public void init(){
        truckScania = new Scania();

    }

    @Test
    void speedFactor() {
    }

    @Test
    void getPlatformAngle() {

    }

    @Test
    void raisePlatform() {
        truckScania.raisePlatform(10);
        int expAngle = 10;

        assertEquals(expAngle, truckScania.getPlatformAngle());

        truckScania.raisePlatform(50);
        assertEquals(60,truckScania.getPlatformAngle());
    }

    @Test
    void lowerPlatform() {
        truckScania.platformAngle = 70;
        truckScania.lowerPlatform(40);
        assertEquals(30, truckScania.getPlatformAngle());

    }

    @Test
    void incrementSpeed() {
        //truckScania.startEngine();
        truckScania.raisePlatform(50);
        truckScania.startEngine();
        truckScania.incrementSpeed(1);
        assertEquals(0,truckScania.getCurrentSpeed());

        //truckScania.platformAngle = 0;
       // truckScania.incrementSpeed(1);
      //  assertEquals(3.1, );

    }
}