public interface CarControl {
        void gas(int amount);
        void brake(int amount);
        void turboOn();
        void turboOff();
        void liftBed();
        void lowerBed();
        void startAll();
        void stopAll();

}
