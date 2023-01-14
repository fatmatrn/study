package hashmap;

public interface Radio {
    int x=15;
    public void startRadio();
    public void stopRadio();

    default public void next() {
        System.out.println("radio  next method");
    }
}
