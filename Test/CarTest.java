import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    static Car carVolvo;
    static Car carSaab;

    @BeforeAll
    public static void init(){
        carVolvo = new Volvo240();
        carSaab = new Saab95();

    }

    @Test
    void getNrDoors() {
    }

    @Test
    void getEnginePower() {
    }

    @Test
    void getCurrentSpeed() {

    }

    @Test
    void getColor() {
    }

    @Test
    void setColor() {
    }


    @Test
    void startEngine() {
        carVolvo.startEngine();
        double expectedSpeed = 0.1;
        assertEquals(expectedSpeed, carVolvo.getCurrentSpeed());
    }



    @Test
    void stopEngine() {
        carVolvo.startEngine();
        carVolvo.stopEngine();
        double expectedSpeed = 0;
        assertEquals(expectedSpeed, carVolvo.getCurrentSpeed());
    }

    @Test
    void speedFactor() {
        double expectedSpeedFactor = 1.25 * 0.01 * 100;
        assertEquals(expectedSpeedFactor, carVolvo.speedFactor());


        double expectedSpeedFactor2 =  125 * 0.01 * 1;
        assertEquals(expectedSpeedFactor2,carSaab.speedFactor());
    }

    @Test
    void incrementSpeed() {
        carVolvo.startEngine();
        double amount = 0.5;

        carVolvo.incrementSpeed(amount);
        double expectedSpeed = Math.min(0.1 + carVolvo.speedFactor() * amount, carVolvo.getEnginePower());
        assertEquals(expectedSpeed, carVolvo.getCurrentSpeed());
    }

    @Test
    void decrementSpeed() {
        carVolvo.startEngine();
        double amount = 0.5;

        carVolvo.decrementSpeed(amount);
        double currentSpeed = Math.max(0.1 - carVolvo.speedFactor() * amount,0);
        assertEquals(currentSpeed, carVolvo.getCurrentSpeed());
    }

    @Test
    void gas() {
        carVolvo.startEngine();
        double amount = 0.5;
        carVolvo.gas(amount);

        double currentSpeed = Math.min(0.1 + carVolvo.speedFactor() * amount,carVolvo.enginePower);

        assertEquals(currentSpeed, carVolvo.getCurrentSpeed());

        carVolvo.gas(0.1);
        assertTrue(carVolvo.getCurrentSpeed() > currentSpeed );


    }

    @Test
    void brake() {
        carVolvo.startEngine();
        double amount = 0.05;
        carVolvo.brake(amount);

        double currentSpeed = Math.max(0.1 - carVolvo.speedFactor() * amount,0);
        assertEquals(currentSpeed, carVolvo.getCurrentSpeed());

        carVolvo.brake(0.08);
        assertTrue(carVolvo.getCurrentSpeed() < currentSpeed);


    }

    @Test
    void move() {

        carSaab.startEngine();

        double x = carSaab.pos.getX();
        double y = carSaab.pos.getY();
        carSaab.move();

        double expectedX = x + carSaab.getCurrentSpeed();
        double expectedY = y;


        assertEquals(expectedX, carSaab.pos.getX());
        assertEquals(expectedY, carSaab.pos.getY());

    }

    @Test
    void turnLeft() {
        int initialDir = carVolvo.direction;
        carVolvo.turnLeft();

        int expectedDir = (initialDir + 1) % 4;

        assertEquals(expectedDir, carVolvo.direction);

        carVolvo.turnLeft();
        int exp2 = (expectedDir + 1) % 4;

        assertEquals(exp2, carVolvo.direction);


    }

    @Test
    void turnRight() {

        int initialDir = carVolvo.direction;
        carVolvo.turnRight();

        int expectedDir = (initialDir - 1) % 4;

        assertEquals(expectedDir, carVolvo.direction);
    }
}