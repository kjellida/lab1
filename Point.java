public class Point {
    private double x;
    private double y;

    public Point (double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return this.x;
    }


    public double getY(){
        return this.y;
    }


    public void setLocation(double x, double y) {

        this.x = x;  // bättre att göra ny point och sätta värdet mha den förra, ska göra immutalble
        this.y = y;
    }
}
