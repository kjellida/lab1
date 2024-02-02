import java.util.ArrayList;
import java.util.Optional;

public class CarShop <T extends Car> {

    private final int maxCapacity;
    protected ArrayList <T> carsInShop = new ArrayList<>();


    public CarShop(int maxCapacity){
        this.maxCapacity = maxCapacity;
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

}
