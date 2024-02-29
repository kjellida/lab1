import java.util.ArrayList;





/*
* This class represents the Controller part in the MVC pattern.
* It's responsibilities is to listen to the View and responds in a appropriate manner by
* modifying the model state and the updating the view.
 */

public class CarModel implements ActionObserver {
    ArrayList<Car> cars = new ArrayList<>();

        // Calls the gas method for each car once

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

        public void removeCar(){
             cars.removeFirst();


        }



}
