public class CarShopFactory {
    static CarShop createCarshop(int x, Point location){
        return new CarShop(x, location);
    }
}
