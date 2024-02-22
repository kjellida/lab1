public class CarFactory {

   static Car createVolvo(Point position){      //position
       Car car = new Volvo240();
       car.pos = position;

       return car;
   }

   static Car createSaab(Point position){
       Car car = new Saab95();
       car.pos = position;
       return car;
   }

   static Car createScania(Point position){
       Car car = new Scania();
       car.pos = position;
       return car;
   }



}
