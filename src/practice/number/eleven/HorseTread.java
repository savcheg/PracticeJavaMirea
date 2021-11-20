package practice.number.eleven;

public class HorseTread implements Runnable {
    private Horse horse;
    private static final int loopDistance = 10;

    public HorseTread() {
        this.horse = new Horse();
    }

    private synchronized void goHorse() {
        this.horse.incrementDistance();
    }

    @Override
    public void run() {
        while (this.horse.getDistance() < loopDistance){
            goHorse();
        }
        System.out.println(this.horse);
    }
}
