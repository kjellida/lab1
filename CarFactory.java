
import java.util.Random;
public class CarFactory {

   static Car createVolvo(Point position){
       Car car = new Volvo240();
       car.pos = position;

       return car;
   }

   static Car createSaab(Point position){
       Car car = new Saab95();
       car.pos = position;
       return car;
   }

   static Car createScania(Point position){
       Car car = new Scania();
       car.pos = position;
       return car;
   }

    private static final Random random = new Random();

    static Car createRandomCar() {
        int randomCarType = random.nextInt(3); // Assuming 3 types of cars: Volvo240, Saab95, Scania
        int randomX = random.nextInt(500 ); // Generate random x-coordinate within simulation area
        int randomY = random.nextInt(500); // Generate random y-coordinate within simulation area

        Car car;
        switch (randomCarType) {
            case 0:
                car = createVolvo(new Point(randomX, randomY));
                break;
            case 1:
                car = createSaab(new Point(randomX, randomY));
                break;
            case 2:
                car = createScania(new Point(randomX, randomY));
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + randomCarType);
        }

        return car;
    }








}
