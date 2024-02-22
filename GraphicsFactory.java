public class GraphicsFactory {

    static CarController createCarController(){
        return new CarController();
    }

    static CarView createCarView(String framename, CarController cc){
        return new CarView(framename, cc);
    }

    static DrawPanel createDrawPanel(int x, int y){
        return new DrawPanel(x, y);
    }
}

