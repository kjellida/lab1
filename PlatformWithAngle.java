public class PlatformWithAngle  {

    protected int platformAngle = 0;
    private final int maxAngle;

    public PlatformWithAngle(int maxAngle){
        this.maxAngle = maxAngle;
    }

    public int getPlatformAngle(){
        return platformAngle;
    }

    protected void raise(){
        int amount = 5;
        if (platformAngle < maxAngle) {
            platformAngle += amount;
        }
    }

    protected void lower(){
        int amount = 5;
        if (platformAngle > 0) {
            platformAngle -= amount;
        }
    }



}
