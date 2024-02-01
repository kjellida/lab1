import java.util.ArrayList;

public class CarShop <T extends Car> {

    public int maxCapacity;
    //final ArrayList <T> carModels; //måste ändra varje gång?
    ArrayList <T> carsInShop = new ArrayList<>();


    public CarShop(int maxCapacity /*ArrayList<Car> carModels*/){
        this.maxCapacity = maxCapacity;
        //this.carModels = new ArrayList<>();;
    }


    public void addCar(T car){
        if(carsInShop.size() < maxCapacity /*&& carModels.contains(car)*/){
            carsInShop.add(car);
        }
    }

    public void retrieveCar() {
        if(!carsInShop.isEmpty()){
            carsInShop.remove(0);
        }
    }


}
