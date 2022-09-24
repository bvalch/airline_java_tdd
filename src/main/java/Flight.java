import java.util.ArrayList;
import java.util.Random;

public class Flight {

    private Pilot pilot;
    private ArrayList<CabinCrew> cabinCrew;
    private Plane plane;
    private String flightNum;
    private String destination;
    private String origin;
    private String departureTime;
    private ArrayList<Psngr> psngrs;

    public Flight(Pilot pilot, Plane plane, String flightNum, String destination, String origin, String departureTime) {
        this.pilot = pilot;
        this.cabinCrew = new ArrayList<>();
        this.plane = plane;
        this.flightNum = flightNum;
        this.destination = destination;
        this.origin = origin;
        this.departureTime = departureTime;
        this.psngrs = new ArrayList<Psngr>();

    }

    public int getAvaliableSeats() {
        return this.plane.getCapacity() - this.psngrs.size();
    }

    public void addCrew(CabinCrew crew) {
        this.cabinCrew.add(crew);
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
        int random = new Random().nextInt(this.plane.getCapacity() - 0) + 1;
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
        for (int i = 0; i < cabinCrew.size(); i++) {
            namesOfCabinCrew.add(cabinCrew.get(i).getName());
        }
        return namesOfCabinCrew;
    }

    public int getCrewSize() {
        return this.cabinCrew.size();
    }

    public ArrayList<String> getPsngrNames() {
        ArrayList<String> namesOfPsngrs = new ArrayList<>();
        for (int i = 0; i < psngrs.size(); i++) {
            namesOfPsngrs.add(psngrs.get(i).getName());
        }
        return namesOfPsngrs;
    }

    public String crewSpeaks(CabinCrew crew) {
        ArrayList<String> namesOfPsngrs = new ArrayList<>();
        for (int i = 0; i < this.psngrs.size(); i++) {
            namesOfPsngrs.add(psngrs.get(i).getName());
        }
        String psngrNamesString = String.join(", ", namesOfPsngrs);
        return crew.getRankType().toString() + " " + crew.getName() + " here." + "Can I ask " + psngrNamesString + " to stop causing trouble?";

    }

    public int getNumOfPsngrs() {
        return this.psngrs.size();
    }

    public void removePsngr(String name) {
        Psngr psngrToRemove = null;
        for (int i = 0; i < this.psngrs.size(); i++) {
            if (this.psngrs.get(i).getName() == name) {
                psngrToRemove = this.psngrs.get(i);
            }
        }
        this.psngrs.remove(psngrToRemove);
    }


}

