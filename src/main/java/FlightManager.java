public class FlightManager {
    private Flight flight;

    public FlightManager(Flight flight) {
        this.flight=flight;
    }

    public Flight getFlight() {
        return this.flight;
    }
    public int getTotalBagageCapacity(){
        return this.flight.getPlane().getTotalWeight()/2;
    }
    public int getMaxBagWeight(){
        return getTotalBagageCapacity()/this.flight.getPlane().getCapacity();
    }
    public int getTotalWeightOfBags(){
        return getMaxBagWeight()*this.flight.getNumOfPsngrs();
    }
    public int getRemainingCapacity(){
        return getTotalBagageCapacity()-getTotalWeightOfBags();
    }
}


