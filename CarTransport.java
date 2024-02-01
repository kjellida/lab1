import java.awt.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class CarTransport extends Car{

    //private boolean platformRaised;
    //private Deque <Car> carStack = new ArrayDeque<>();
    //private static final int MAX_CARS_ON_TRANSPORTER = 6;
  //  private static final int MAX_CAR_WEIGHT = 200;

    PlatformTwoStates platform;



    public CarTransport(){
        super(2, Color.blue,200, "CarTransport", 500);
        platform = new PlatformTwoStates(6,200);
        platform.platformRaised = false;
        stopEngine();
    }

    @Override
    protected double speedFactor() {
        return enginePower * 0.01;
    }

    void raisePlatform(){
        platform.raise();
    }

    void lowerPlatform() {
        if (getCurrentSpeed() == 0) {
            platform.lower();
        }
    }

    void loadCartransport(Car car){
        if (platform.carStack.size() < platform.MAX_CARS_ON_TRANSPORTER && !platform.platformRaised && car.weight < platform.MAX_CAR_WEIGHT && checkPos(car) < 1){
            platform.carStack.push(car);
        }
    }

    void unloadCartransport(){
        if(!platform.platformRaised && !platform.carStack.isEmpty()){
           Car carR = platform.carStack.pop();
           carR.pos.setLocation(this.pos.getX() + 1,this.pos.getY() + 1);

        }

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
        for(Car car : platform.carStack){
            car.pos = this.pos;
        }

    }

    @Override
    public void startEngine(){
        if(platform.platformRaised) {
            currentSpeed = 0.1;
        }
    }

}
