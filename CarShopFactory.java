public class CarShopFactory {
    static CarShop <Car>  createCarshop(int x, Point location){
        return new CarShop<>(x, location);
    }
}
