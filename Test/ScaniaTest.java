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

        truckScania.lowerPlatform(50);
        truckScania.incrementSpeed(1);
        double expectedSpeed = truckScania.speedFactor() * 1;

        assertEquals(expectedSpeed, truckScania.getCurrentSpeed());

        //truckScania.platformAngle = 0;
       // truckScania.incrementSpeed(1);
      //  assertEquals(3.1, );

        /*truckScania.raisePlatform(50);
    truckScania.startEngine();
    truckScania.incrementSpeed(1);

    // Assert that the speed is still 0 since the platform is raised
    assertEquals(0, truckScania.getCurrentSpeed());

    // Lower the platform and test again
    truckScania.lowerPlatform(50);
    truckScania.incrementSpeed(1);

    // Assert the expected speed when the platform is lowered
    double expectedSpeed = truckScania.speedFactor() * 1;
    assertEquals(expectedSpeed, truckScania.getCurrentSpeed());
}*/

    }
}