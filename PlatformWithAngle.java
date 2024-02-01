public class PlatformWithAngle  {

    int platformAngle = 0;
    final int MAX_PLATFORM_ANGLE; //= 70; //om jag har en lika funktion men olika max angle

    public PlatformWithAngle(int MAX_PLATFORM_ANGLE){
        this.MAX_PLATFORM_ANGLE = MAX_PLATFORM_ANGLE;
    }

    public int getPlatformAngle(){
        return platformAngle;
    }

    void raise(){
        int amount = 5;
        if (platformAngle < MAX_PLATFORM_ANGLE) {
            platformAngle += amount;
        }
    }

    public void lower(){
        int amount = 5;
        if (platformAngle > 0) {
            platformAngle -= amount;
        }
    }



}
