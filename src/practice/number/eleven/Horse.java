package practice.number.eleven;

public class Horse {
    private static int idCount = 0;

    private int id;
    private int distance = 0;

    public Horse() {
        this.id = ++idCount;
    }

    public void incrementDistance() {
        distance++;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "id=" + id +
                '}';
    }
}
