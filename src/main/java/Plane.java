import java.util.ArrayList;
import java.util.Random;

public class Plane {

    private PlaneType planeType;

    private int capacity;
    private int totalWeight;
    private ArrayList<Integer> seats;

    public Plane(PlaneType planeType){
        this.planeType=planeType;
        this.capacity= planeType.getCapacity();
        this.totalWeight= planeType.getTotalWeight();
        this.seats = new ArrayList<Integer>();
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
    public ArrayList getSeatsArray(){
        return this.seats;
    }

}
