package hashmap;

public interface Player {
   public abstract void start();
   // void start();
    int x=16;
    public void pause();
    public void stop();

    default public void next() {
        System.out.println("player next ");
    }


}
