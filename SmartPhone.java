package hashmap;

public class SmartPhone implements GPS,Player,Radio{

    @Override
    public void getCoordinates() {
        System.out.println("smartphone coordinate");
    }

    @Override
    public void start() {
        System.out.println("smartPhone  player start");
    }

    @Override
    public void pause() {
        System.out.println("smartPhone player pasue");
    }

    @Override
    public void stop() {
        System.out.println("smartPhone player stop");
    }

    @Override
    public void next() {
    Radio.super.next();

    }

    @Override
    public void startRadio() {
        System.out.println("radio start");
    }

    @Override
    public void stopRadio() {
        System.out.println("radio stop");
    }
}
