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
        truckScania.raisePlatform();
        int expAngle = 5;

        assertEquals(expAngle, truckScania.platform.getPlatformAngle());

        truckScania.raisePlatform();
        assertEquals(10,truckScania.platform.getPlatformAngle());
    }

    @Test
    void lowerPlatform() {
        truckScania.platform.platformAngle = 70;
        truckScania.lowerPlatform();
        assertEquals(65, truckScania.platform.getPlatformAngle());

    }

    @Test
    void incrementSpeed() {
        //truckScania.startEngine();
        truckScania.raisePlatform();
        truckScania.startEngine();
        truckScania.incrementSpeed(1);

        assertEquals(0,truckScania.getCurrentSpeed());

        truckScania.lowerPlatform();
        truckScania.incrementSpeed(1);
        double expectedSpeed = truckScania.speedFactor() * 1;

        assertEquals(expectedSpeed, truckScania.getCurrentSpeed());



    }
}