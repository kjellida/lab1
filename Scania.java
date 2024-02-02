
import java.awt.*;
public class Scania extends Car implements HasPlatform{
    protected PlatformWithAngle platform;

    public Scania(){
        super(2, Color.pink, 200,"Scania",300);
        platform = new PlatformWithAngle(70);
        stopEngine();

    }

    @Override
    protected double speedFactor() {
        return enginePower * 0.01;
    }

    @Override
    public void raisePlatform(){
        if(getCurrentSpeed() == 0) {
            platform.raise();
        }
    }

    @Override
    public void lowerPlatform(){
        if(getCurrentSpeed() == 0) {
           platform.lower();
        }
    }


    @Override
     public void startEngine(){
        if(platform.getPlatformAngle() == 0) {
            currentSpeed = 0.1;
        }
    }

    @Override
    protected void incrementSpeed(double amount) {
        if(platform.getPlatformAngle() == 0) {
            currentSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount, enginePower);
        }
    }

}
