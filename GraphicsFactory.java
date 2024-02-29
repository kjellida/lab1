public class GraphicsFactory {

    static CarModel createCarModel(){
        return new CarModel();
    }

    static CarView createCarView(String framename, CarModel cc){
        return new CarView(framename, cc);
    }

    static DrawPanel createDrawPanel(int x, int y){
        return new DrawPanel(x, y);
    }
}

