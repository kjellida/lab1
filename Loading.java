import java.util.ArrayDeque;
import java.util.Deque;

public class Loading {

    protected Deque<Car> carStack = new ArrayDeque<>();

    protected void load(Car car) {
        carStack.push(car);
    }

    protected Car unload (){
        if (!carStack.isEmpty()) {
            Car car = carStack.pop();
            return car;
        }
       return null; //meeeh
    }

}
