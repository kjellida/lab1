public class CarShopFactory {
    CarShop createCarshop(int x, Point location){
        return new CarShop(x, location);
    }
}
