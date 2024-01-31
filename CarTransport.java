import java.awt.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class CarTransport extends Car{

    boolean platformRaised;
    Deque<Car> carStack = new ArrayDeque<>();
    //List<Car> carlist2 = new ArrayList<>();

    public CarTransport(){
        super(2, Color.blue,200, "CarTransport", 500);
        platformRaised = false;

        stopEngine();
    }

    @Override
    protected double speedFactor() {
        return enginePower * 0.01;
    }

    void raisePlatform(){
        platformRaised = true;
    }

    void lowerPlatform() {
        if (getCurrentSpeed() == 0) {
            platformRaised = false;
        }
    }

    void loadCartransport(Car car){
        if (carStack.size() < 6 && !platformRaised && car.weight < 200 && checkPos(car) < 1){
            carStack.push(car);
        }


        // måste sätta size gräns här
        // nåt med pos
    }

    void unloadCartransport(){
        if(!platformRaised && !carStack.isEmpty()){
           Car carR = carStack.pop();
           carR.pos.setLocation(this.pos.getX() + 1,this.pos.getY() + 1);

        }


        // nåt med pos
    }

    double checkPos(Car car) {
       double newY = this.pos.getY() - car.pos.getY();
       double newX = this.pos.getX() - car.pos.getX();

       double distance = Math.sqrt(newX * newX + newY * newY);

       return distance;

    }

    @Override
    public void move() {
        super.move();
        for(Car car : carStack){
            car.pos = this.pos;
        }



    }

}
