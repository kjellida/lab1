public class Main {

    public static void main (String[]args){

        CarModel cc = GraphicsFactory.createCarModel();

        CarView frame = GraphicsFactory.createCarView("CarSim 1.0", cc);

        cc.cars.add(CarFactory.createVolvo(new Point(0, 0)));
        cc.cars.add(CarFactory.createSaab(new Point(0, 100)));
        cc.cars.add(CarFactory.createScania(new Point(0, 200)));

        cc.addObserver(frame.drawPanel);  //inte så bra


        CarController carController = new CarController(frame, cc.cars);
        carController.start();

    }




}
