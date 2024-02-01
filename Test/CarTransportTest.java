import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTransportTest {

    static CarTransport cart;

    @BeforeEach
    public void init(){
        cart = new CarTransport();

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

    }

    @Test
    void unloadCartransport() {
        Car saab = new Saab95();
        cart.loadCartransport(saab);
        cart.unloadCartransport();

        double x = cart.pos.getX() + 1;
        double y = cart.pos.getY() + 1;

        assertEquals(x, saab.pos.getX());
        assertEquals(y, saab.pos.getY());

    }

    @Test
    void checkPos() {
    }

    @Test
    void move() {
        Car volvo = new Volvo240();

        //cart.lowerPlatform();
        cart.loadCartransport(volvo);
        //cart.raisePlatform();

        cart.startEngine();

        double x = cart.pos.getX();
        double y = cart.pos.getY();
        cart.move();

        double expectedX = x + cart.getCurrentSpeed();
        double expectedY = y;


        assertEquals(expectedX, cart.pos.getX());
        assertEquals(expectedY, cart.pos.getY());

        assertEquals(volvo.pos, cart.pos);



    }
}