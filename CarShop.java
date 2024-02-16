import java.util.ArrayList;
import java.util.Optional;

public class CarShop <T extends Car> {

    private final int maxCapacity;
    protected ArrayList <T> carsInShop = new ArrayList<>();

    Point location = new Point();


    public CarShop(int maxCapacity, Point location){
        this.maxCapacity = maxCapacity;
        this.location = location;
    }


    public void addCar(T car){
        if(carsInShop.size() < maxCapacity){
            carsInShop.add(car);
        }
    }

    public Optional<T> retrieveCar() {
        if (!carsInShop.isEmpty()) {
            return Optional.ofNullable(carsInShop.remove(0));
        }
        return Optional.empty();
    }


    boolean isWithinWorkshopRadius(Point carPosition, Point workshopPosition, int radius) {

        double newY = carPosition.getY() - workshopPosition.getY();
        double newX = carPosition.getX() - workshopPosition.getX();

        double distance = Math.sqrt(newX * newX + newY * newY);

        return distance <= radius;
    }

}
