import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarShopTest {

    static CarShop <Saab95> saabCarShop;

    @BeforeEach
    public void init(){
        saabCarShop= new CarShop<>(10, new Point(200,200));

    }
// hello
    @Test
    void addCar() {
        Car volvo = new Volvo240();
        //saabCarShop.addCar(volvo);

        Saab95 saab = new Saab95();
        saabCarShop.addCar(saab);

        assertTrue(saabCarShop.carsInShop.contains(saab));

    }

    @Test
    void retrieveCar() {
        Car volvo = new Volvo240();
        //saabCarShop.retrieveCar(volvo);

        Saab95 saab = new Saab95();

        saabCarShop.addCar(saab);
        saabCarShop.retrieveCar();

        assertFalse(saabCarShop.carsInShop.contains(saab));

    }
}