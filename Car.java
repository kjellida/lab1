import java.awt.*;

public abstract class Car implements Movable {
    private final int nrDoors; // Number of doors on the car
    protected final double enginePower; // Engine power of the car
    protected double currentSpeed; // The current speed of the car
    protected Color color; // Color of the car
    private final String modelName;
    protected Point pos = new Point(0, 0);
    protected int direction = 0;
    protected final int weight;

   // protected boolean engineIsOn = false;


    public Car(int nrDoors, Color color, double enginePower, String modelName, int weight) {
        this.nrDoors = nrDoors;
        this.color = color;
        this.enginePower = enginePower;
        this.modelName = modelName;
        this.weight = weight;
    }

    protected abstract double speedFactor();

    protected int getNrDoors(){
        return nrDoors;
    }

    public double getEnginePower(){
        return enginePower;
    }

    public double getCurrentSpeed(){
        return currentSpeed;
    }

    public Color getColor(){
        return color;
    }

    public void setColor(Color clr){
        color = clr;
    }

    public void startEngine(){
        if(currentSpeed == 0) {
            currentSpeed = 0.1;
            //engineIsOn = true;
        }
    }

    public void stopEngine(){
        currentSpeed = 0;
        //engineIsOn = false;
    }

    protected void incrementSpeed(double amount) {
            currentSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount, enginePower);
    }

    protected void decrementSpeed(double amount) {
        double speed = Math.max(getCurrentSpeed() - speedFactor() * amount,0);
        if (speed <= enginePower){
            currentSpeed = speed;
        }
    }

    public void gas(double amount){
        if (amount >= 0 && amount <= 1 && getCurrentSpeed() >= 0.1) {
            incrementSpeed(amount);
            }
    }

    public void brake(double amount) {
        if (amount >= 0 && amount <= 1) {
            decrementSpeed(amount);
        }
    }

    @Override
    public void move() {
        double speed = getCurrentSpeed();

        if (direction == 0){
           pos.setLocation(pos.getX() + speed, pos.getY());
        } else if (direction == 1) {
            pos.setLocation(pos.getX(), pos.getY() + speed);
        } else if (direction == 2){
           pos.setLocation(pos.getX() - speed, pos.getY());
        } else if (direction == 3){
            pos.setLocation(pos.getX(), pos.getY() - speed);
        }



    }

    @Override
    public void turnLeft() {
        direction = (direction + 1) % 4;
    }

    @Override
    public void turnRight() {
        direction = (direction - 1) % 4;
    }


}
