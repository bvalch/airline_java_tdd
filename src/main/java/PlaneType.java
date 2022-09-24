import java.util.HashSet;

public enum PlaneType {

    BOEING747(20, 500),
    DEATHBOX999(5, 600),
    MOONPLANE1337(40, 700);

    private final int capacity;
    private final int totalWeight;


    PlaneType(int capacity, int totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getTotalWeight() {
        return this.totalWeight;
    }



}
