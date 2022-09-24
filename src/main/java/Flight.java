import java.util.ArrayList;
import java.util.Random;

public class Flight {

    private final Pilot pilot;
    private final ArrayList<CabinCrew> cabinCrew;
    private final Plane plane;
    private final String flightNum;
    private final String destination;
    private final String origin;
    private final String departureTime;
    private final ArrayList<Psngr> psngrs;

    public Flight(Pilot pilot, Plane plane, String flightNum, String destination, String origin, String departureTime) {
        this.pilot = pilot;
        this.cabinCrew = new ArrayList<>();
        this.plane = plane;
        this.flightNum = flightNum;
        this.destination = destination;
        this.origin = origin;
        this.departureTime = departureTime;
        this.psngrs = new ArrayList<>();

    }

    public int getAvaliableSeats() {
        return this.plane.getCapacity() - this.psngrs.size();
    }

    public void addCrew(CabinCrew crew) {
        this.cabinCrew.add(crew);
    }
    public Pilot getPilot(){
        return this.pilot;
    }

    public void addPsngr(Psngr psngr) {
        if (this.psngrs.size() < this.plane.getCapacity()) {
            psngr.assignFlightNum(this.flightNum);

            int randomSeat = generateRandomSeat();
            this.plane.addRandomSeat(randomSeat);
            psngr.setSeatNumber(randomSeat);
            this.psngrs.add(psngr);
        }

    }


    public int generateRandomSeat() {
        int random = new Random().nextInt(this.plane.getCapacity()) + 1;
        while (checkifSeatUnique(random)) {
            random = generateRandomSeat();
        }
        return random;
    }

    public boolean checkifSeatUnique(int seat) {
        return this.plane.getSeatsArray().contains(seat);
    }


    public Plane getPlane() {
        return this.plane;
    }

    public ArrayList<String> getCrew() {
        ArrayList<String> namesOfCabinCrew = new ArrayList<>();
        for (CabinCrew crew : cabinCrew) {
            namesOfCabinCrew.add(crew.getName());
        }
        return namesOfCabinCrew;
    }

    public int getCrewSize() {
        return this.cabinCrew.size();
    }

    public ArrayList<String> getPsngrNames() {
        ArrayList<String> namesOfPsngrs = new ArrayList<>();
        for (Psngr psngr : psngrs) {
            namesOfPsngrs.add(psngr.getName());
        }
        return namesOfPsngrs;
    }

    public String crewSpeaks(CabinCrew crew) {
        ArrayList<String> namesOfPsngrs = new ArrayList<>();
        for (Psngr psngr : this.psngrs) {
            namesOfPsngrs.add(psngr.getName());
        }
        String psngrNamesString = String.join(", ", namesOfPsngrs);
        return crew.getRankType().toString() + " " + crew.getName() + " here." + "Can I ask " + psngrNamesString + " to stop causing trouble?";

    }

    public int getNumOfPsngrs() {
        return this.psngrs.size();
    }

    public void removePsngr(String name) {
        Psngr psngrToRemove = null;
        for (Psngr psngr : this.psngrs) {
            if (psngr.getName().equals(name)) {
                psngrToRemove = psngr;
            }
        }
        this.psngrs.remove(psngrToRemove);
    }

    public String getFlightNum() {
        return flightNum;
    }

    public String getDestination() {
        return destination;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDepartureTime() {
        return departureTime;
    }
}

