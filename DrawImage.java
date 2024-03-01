import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.HashMap;

public class DrawImage {

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
           // g.drawImage(volvoWorkshopImage, (int) shop.location.getX(), (int) shop.location.getY(), null);
            g.drawImage(volvoWorkshopImage, (int) position.getX(), (int) position.getY(), null);

        }
    }

}
