import java.util.ArrayList;
import java.util.List;

public class CarModel implements ActionObserver {
    ArrayList<Car> cars = new ArrayList<>();

    ArrayList<CarObserver> observers = new ArrayList<>();


    public void gas(int amount) {
            double gas = ((double) amount) / 100;
            for (Car car : cars) {
                car.gas(gas);
            }
        }

        public void brake(int amount) {
            double brake = ((double) amount) / 100;
            for (Car car : cars) {
                car.brake(brake);
            }
        }

        public void turboOn() {
            for (Car car : cars) {
                if (car instanceof Saab95) {
                    ((Saab95) car).setTurboOn();
                }
            }

        }

       public void turboOff() {
            for (Car car : cars) {
                if (car instanceof Saab95) {
                    ((Saab95) car).setTurboOff();
                }
            }
        }


        public void liftBed(){
        for (Car car : cars) {
                if (car instanceof Scania) {
                    ((Scania) car).raisePlatform();
                }
            }
        }




        public void lowerBed(){
            for (Car car : cars) {
                if (car instanceof Scania) {
                    ((Scania) car).lowerPlatform();
                }
            }
        }

        public void startAll(){
            for (Car car : cars) {
                car.startEngine();
            }


        }

        public void stopAll(){
            for (Car car : cars) {
                car.stopEngine();
            }

        }

        public void addCar(){
            Car c = CarFactory.createRandomCar();
            if(cars.size() < 10 ) {
                cars.add(c);
            }

        }


    public void addObserver(CarObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(CarObserver observer) {
        observers.remove(observer);
    }

    public void notifyCarRemoved(Car removedCar) {
        for (CarObserver observer : observers) {
            observer.carRemoved(removedCar);
        }
    }

    public void removeCar() {
       if (!cars.isEmpty()) {
            Car removedCar = cars.remove(0);
            notifyCarRemoved(removedCar);
        }
    }





}
