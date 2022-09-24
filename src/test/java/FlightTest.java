import org.junit.Before;
import org.junit.Test;



import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight1;
    Pilot pilot1 = new Pilot("Sunny",RankType.CAPTAIN,"Licence6996");
    CabinCrew flightAttendant=new CabinCrew("Poe",RankType.FLIGHT_ATTENDANT);
    CabinCrew flightPurser = new CabinCrew("Butch",RankType.PURSER);
    CabinCrew firstOfficer = new CabinCrew("BigMan",RankType.FIRST_OFFICER);
    Plane plane1 = new Plane(PlaneType.DEATHBOX999);
    Psngr psngr1 = new Psngr("Willy",3);
    Psngr psngr2 = new Psngr("Olaf",2);
    Psngr psngr3 = new Psngr("Billy",9);
    Psngr psngr4 = new Psngr("Rex",5);

    @Before
    public void before(){
        flight1 = new Flight(pilot1,plane1,"DB777","SOH","NOH","Today");
        flight1.addCrew(flightAttendant);
        flight1.addCrew(flightPurser);
        flight1.addCrew(firstOfficer);
        flight1.addPsngr(psngr1);
        flight1.addPsngr(psngr2);
        flight1.addPsngr(psngr3);
        flight1.addPsngr(psngr4);
        pilot1.getAssignedToAPlane(plane1);

    }
    @Test
    public void flightHasPlane(){
        assertEquals(plane1,flight1.getPlane());
    }
    @Test
    public void flightHasAPilot(){
        assertEquals(pilot1,flight1.getPilot());
    }

    @Test
    public void flightHasCrew(){
        assertEquals("[Poe, Butch, BigMan]",flight1.getCrew().toString());
    }
    @Test
    public void flightCanAddMoreCrew(){
        CabinCrew flightAttendantTest=new CabinCrew("Poe",RankType.FLIGHT_ATTENDANT);
        flight1.addCrew(flightAttendantTest);
        assertEquals(4,flight1.getCrewSize());
    }

    @Test
    public void flightHasPsngrs(){
        assertEquals("[Willy, Olaf, Billy, Rex]",flight1.getPsngrNames().toString());
    }
    @Test
    public void canAddMorePsngrs(){
        Psngr psngr5 = new Psngr("Marley",5);
        flight1.addPsngr(psngr5);
        assertEquals(5, flight1.getNumOfPsngrs());
    }
    @Test
    public void cantAddPsngrsIfPlaneFull(){
        Psngr psngr5 = new Psngr("Marley",5);
        Psngr psngr6 = new Psngr("GetOut",5);
        flight1.addPsngr(psngr5);
        flight1.addPsngr(psngr6);
        assertEquals(5,flight1.getNumOfPsngrs());
    }
    @Test
    public void flightReturnsAvaliableSeatCount(){
        assertEquals(1,flight1.getAvaliableSeats());
    }
    @Test
    public void canRemovePsngrsByName(){
        flight1.removePsngr("Willy");
        assertEquals("[Olaf, Billy, Rex]",flight1.getPsngrNames().toString());
    }
    @Test
    public void attendantTellsOffPassangers(){
        assertEquals("FLIGHT_ATTENDANT Poe here.Can I ask Willy, Olaf, Billy, Rex to stop causing trouble?",flight1.crewSpeaks(flightAttendant));
    }

    @Test
    public void getTheArrayOfSeatsFromPlane(){
        assertEquals(4,plane1.getSeatsArray().size());
    }
    @Test
    public void flightHasAFlightNum(){
        assertEquals("DB777",flight1.getFlightNum());
    }
    @Test
    public void hasOrigin() {
        assertEquals("NOH",flight1.getOrigin());
    }
    @Test
    public void hasDestination(){
        assertEquals("SOH",flight1.getDestination());

    }
    @Test
    public void hasDepartureTime(){
        assertEquals("Today",flight1.getDepartureTime());
    }


}
