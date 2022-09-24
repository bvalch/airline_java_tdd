public class Psngr {


    private final String name;
    private final int numBags;
    private String flightNumber;
    private int seatNumber;

    public Psngr(String name,int numBags){
        this.name=name;
        this.numBags=numBags;
        this.flightNumber=null;
        this.seatNumber = 0;
    }
    public String getName(){
        return this.name;
    }
    public int getNumBags(){
        return this.numBags;
    }

    public void assignFlightNum(String flightNum){
        this.flightNumber=flightNum;
    }
    public String getFlightNumber(){
        return this.flightNumber;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }
}
