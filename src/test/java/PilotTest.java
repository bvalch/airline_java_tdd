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
        pilot.getAssignedToAPlane(plane);

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
        assertEquals("I am assigned to DEATHBOX999", pilot.getPlaneAssignedToPilot());
    }

    @Test
    public void pilotFliesPlane() {
        assertEquals("Ace here I'm flying DEATHBOX999", pilot.pilotPilotsPlane());
    }
}
