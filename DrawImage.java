import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.HashMap;

public class DrawImage {

  /*  HashMap<Car, BufferedImage> carImages = new HashMap<Car, BufferedImage>();
    HashMap<Car, Point> carPositions = new HashMap<Car, Point>();
    BufferedImage volvoWorkshopImage;

    // To keep track of a single car's position
    Point volvoPoint = new Point(0,0);
    Point saabPoint = new Point(0,100);
    Point scaniaPoint = new Point(0, 200);
    Point volvoWorkshopPoint = new Point(500,0);

    public DrawImage(){

    }

    public void createImage(Car car) {
        try {
            if (car instanceof Volvo240) {
                carImages.put(car, ImageIO.read(DrawPanel.class.getResourceAsStream("pics/Volvo240.jpg")));
                carPositions.put(car, volvoPoint);
            } else if (car instanceof Saab95) {
                carImages.put(car, ImageIO.read(DrawPanel.class.getResourceAsStream("pics/Saab95.jpg")));
                carPositions.put(car, saabPoint);
            } else if (car instanceof Scania) {
                carImages.put(car, ImageIO.read(DrawPanel.class.getResourceAsStream("pics/Scania.jpg")));
                carPositions.put(car, scaniaPoint);
            }


            volvoWorkshopImage = ImageIO.read(DrawPanel.class.getResourceAsStream("pics/VolvoBrand.jpg"));
            // Update the car's initial position
        } catch (IOException ex) {
        }
    }


    protected void paintC(Graphics g) {
        for (Car car : carImages.keySet()) {
            Point carPoint = carPositions.get(car);
            BufferedImage carImage = carImages.get(car);
            if(carPoint != null && carImage != null) {
                g.drawImage(carImage, (int)carPoint.getX(), (int) carPoint.getY(), null);
            }
        }
        g.drawImage(volvoWorkshopImage, (int)volvoWorkshopPoint.getX(), (int)volvoWorkshopPoint.getY(), null);
    }*/

    private BufferedImage volvoImage;
    private BufferedImage saabImage;
    private BufferedImage scaniaImage;
    private BufferedImage volvoWorkshopImage;

    public DrawImage() {
        try {
            volvoImage = ImageIO.read(getClass().getResourceAsStream("pics/Volvo240.jpg"));
            saabImage = ImageIO.read(getClass().getResourceAsStream("pics/Saab95.jpg"));
            scaniaImage = ImageIO.read(getClass().getResourceAsStream("pics/Scania.jpg"));
            volvoWorkshopImage = ImageIO.read(getClass().getResourceAsStream("pics/VolvoBrand.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void drawCar(Graphics g, Car car, Point position) {
        BufferedImage image = null;
        if (car instanceof Volvo240) {
            image = volvoImage;
        } else if (car instanceof Saab95) {
            image = saabImage;
        } else if (car instanceof Scania) {
            image = scaniaImage;
        }

        if (image != null && position != null) {
            g.drawImage(image, (int) position.getX(), (int) position.getY(), null);
        }
    }

    public void drawWorkshop(Graphics g, Point position) {
        if (volvoWorkshopImage != null && position != null) {
            g.drawImage(volvoWorkshopImage, (int) position.getX(), (int) position.getY(), null);
        }
    }

    //
}
