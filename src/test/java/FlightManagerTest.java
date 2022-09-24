import org.junit.Before;
import org.junit.Test;



import static org.junit.Assert.assertEquals;

public class FlightManagerTest {
    FlightManager flightManager1;
    Flight flight1;
    Pilot pilot1 = new Pilot("Sunny", RankType.CAPTAIN, "Licence6996");
    Plane plane1 = new Plane(PlaneType.MOONPLANE1337);
    Psngr psngr1 = new Psngr("Willy", 3);
    Psngr psngr2 = new Psngr("Olaf", 2);
    Psngr psngr3 = new Psngr("Billy", 9);
    Psngr psngr4 = new Psngr("Rex", 5);

    @Before
    public void before() {
        flight1 = new Flight(pilot1, plane1, "DB777", "SOH", "NOH", "Today");
        flight1.addPsngr(psngr1);
        flight1.addPsngr(psngr2);
        flight1.addPsngr(psngr3);
        flight1.addPsngr(psngr4);
        flightManager1 = new FlightManager(flight1);

    }
    @Test
    public void flightManagerHasAFlightToManage(){
        assertEquals(flight1,flightManager1.getFlight());
    }
    @Test
    public void hasTotalBagageCapacity(){
        assertEquals(350,flightManager1.getTotalBagageCapacity());
    }
    @Test
    public void planeHasMaxBagWeight(){
        assertEquals(8,flightManager1.getMaxBagWeight());
    }
    @Test
    public void totalWeightOfBagsForThisFlight(){
        assertEquals(32,flightManager1.getTotalWeightOfBags());
    }
    @Test
    public void getRemainingCapacityForBagagge(){
        assertEquals(318,flightManager1.getRemainingCapacity());
    }
    @Test
    public void psngrHasBeenAsignedToThisFlight(){
        assertEquals("DB777",this.psngr1.getFlightNumber());
    }
}
