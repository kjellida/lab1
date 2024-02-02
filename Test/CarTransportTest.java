import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTransportTest {

    static CarTransport carTransport;

    @BeforeEach
    public void init(){
        carTransport = new CarTransport();
    }

    @Test
    void speedFactor() {
    }

    @Test
    void raisePlatform() {

    }

    @Test
    void lowerPlatform() {
    }

    @Test
    void loadCartransport() {
        Scania scania = new Scania();
        carTransport.loadCartransport(scania);

        assertFalse(carTransport.carStack.contains(scania));

        Car saab = new Saab95();
        carTransport.loadCartransport(saab);

        assertTrue(carTransport.carStack.contains(saab));

    }

    @Test
    void unloadCartransport() {
        Car saab = new Saab95();
        carTransport.loadCartransport(saab);
        carTransport.unloadCartransport();

        assertFalse(carTransport.carStack.contains(saab));

        double x = carTransport.pos.getX() + 1;
        double y = carTransport.pos.getY() + 1;

        assertEquals(x, saab.pos.getX());
        assertEquals(y, saab.pos.getY());

    }

    @Test
    void checkPos() {
    }

    @Test
    void move() {
        Car volvo = new Volvo240();

        carTransport.loadCartransport(volvo);
        carTransport.raisePlatform();

        carTransport.startEngine();

        double x = carTransport.pos.getX();
        double y = carTransport.pos.getY();
        carTransport.move();

        double expectedX = x + carTransport.getCurrentSpeed();
        double expectedY = y;


        assertEquals(expectedX, carTransport.pos.getX());
        assertEquals(expectedY, carTransport.pos.getY());

        assertEquals(volvo.pos, carTransport.pos);



    }
}