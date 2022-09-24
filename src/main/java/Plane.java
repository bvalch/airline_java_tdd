import java.util.ArrayList;


public class Plane {
    private final PlaneType planeType;
    private final int capacity;
    private final int totalWeight;
    private final ArrayList<Integer> seats;

    public Plane(PlaneType planeType){
        this.planeType=planeType;
        this.capacity= planeType.getCapacity();
        this.totalWeight= planeType.getTotalWeight();
        this.seats = new ArrayList<>();
    }

    public PlaneType getPlaneType() {
        return planeType;
    }
    public int getCapacity(){
        return this.capacity;
    }
    public int getTotalWeight(){
        return this.totalWeight;
    }
    public void addRandomSeat(int seat){
        this.seats.add(seat);

    }
    public ArrayList<Integer> getSeatsArray(){
        return this.seats;
    }

}
