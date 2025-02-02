import java.awt.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class CarTransport extends Car implements HasPlatform{
    protected PlatformTwoStates platform;
    protected Loading loading;
    protected final int maxCarsOnPlatform = 6;
    protected final int maxCarWeight = 200;

    public CarTransport(){
        super(2, Color.blue,200, "CarTransport", 500);
        platform = new PlatformTwoStates();
        platform.platformRaised = false;
        loading = new Loading();
        stopEngine();
    }

    @Override
    protected double speedFactor() {
        return enginePower * 0.01;
    }

    @Override
    public void raisePlatform(){
        platform.raise();
    }
    @Override
    public void lowerPlatform() {
        if (getCurrentSpeed() == 0) {
            platform.lower();
        }
    }

    public void loadCartransport(Car car){
        if (loading.carStack.size() < maxCarsOnPlatform && !platform.platformRaised && car.weight < maxCarWeight && checkPos(car) < 1){
            loading.load(car); //ta bort car car?

        }
    }

    public void unloadCartransport(){
        if(!platform.platformRaised && !loading.carStack.isEmpty()){
           Car car = loading.unload();
           car.pos.setLocation(this.pos.getX() + 1,this.pos.getY() + 1);


        }

    }

    protected double checkPos(Car car) {
       double newY = this.pos.getY() - car.pos.getY();
       double newX = this.pos.getX() - car.pos.getX();

       double distance = Math.sqrt(newX * newX + newY * newY);

       return distance;

    }

    @Override
    public void move() {
        super.move();
        for(Car car : loading.carStack){
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
