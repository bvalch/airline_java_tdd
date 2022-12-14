import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {
    Pilot pilot;
    Plane plane;

    @Before
    public void before() {
        pilot = new Pilot("Ace", RankType.CAPTAIN, "Licence1234");
        plane = new Plane(PlaneType.DEATHBOX999);


    }

    @Test

    public void hasName() {
        assertEquals("Ace", pilot.getName());
    }

    @Test
    public void hasRankType() {
        assertEquals(RankType.CAPTAIN, pilot.getRankType());
    }

    @Test
    public void hasLicence() {
        assertEquals("Licence1234", pilot.getPilotLicence());
    }

    @Test
    public void pilotIsAssignedToPlane() {
        pilot.getAssignedToAPlane(plane);
        assertEquals("I am assigned to DEATHBOX999", pilot.getPlaneAssignedToPilot());
    }

    @Test
    public void pilotFliesPlane() {
        pilot.getAssignedToAPlane(plane);
        assertEquals("Ace here I'm flying DEATHBOX999", pilot.pilotPilotsPlane());
    }
    @Test
    public void pilotCantPilotPlaneIfNotAssigned(){
        assertEquals("I am not assigned to a plane yet",pilot.pilotPilotsPlane());
    }
    @Test
    public void pilotStartsUnassignedToPlane(){
        assertEquals("I am not assigned to a plane yet",pilot.getPlaneAssignedToPilot());
    }
}
