public class PlatformTwoStates {
    private boolean platformRaised;
    private static final int MAX_CARS_ON_TRANSPORTER = 6;

    private static final int MAX_CAR_WEIGHT = 200;

    void raise(){
        platformRaised = true;
    }

    void lower(){
        platformRaised = false;
    }



}
