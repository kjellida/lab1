import java.util.ArrayDeque;
import java.util.Deque;

public class PlatformTwoStates {
    boolean platformRaised;
    Deque<Car> carStack = new ArrayDeque<>();
    final int MAX_CARS_ON_TRANSPORTER; //= 6;
    final int MAX_CAR_WEIGHT; // = 200;

    public PlatformTwoStates(int MAX_CARS_ON_TRANSPORTER, int MAX_CAR_WEIGHT){
        this.MAX_CARS_ON_TRANSPORTER = MAX_CARS_ON_TRANSPORTER;
        this.MAX_CAR_WEIGHT = MAX_CAR_WEIGHT;
    }

    void raise(){
        platformRaised = true;
    }

    void lower(){
        platformRaised = false;
    }




}
