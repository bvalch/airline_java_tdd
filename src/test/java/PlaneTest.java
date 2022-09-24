import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {
    Plane plane1;

    @Before
    public void before() {
        plane1 = new Plane(PlaneType.DEATHBOX999);

    }

    @Test
    public void planeHasType() {
        assertEquals(PlaneType.DEATHBOX999, plane1.getPlaneType());

    }

    @Test
    public void planeHasCapacity() {
        assertEquals(5, plane1.getCapacity());

    }

    @Test
    public void planeHasTotalWeight() {
        assertEquals(600, plane1.getTotalWeight());

    }
    @Test
    public void canAddSeatNumber(){
        plane1.addRandomSeat(5);
        assertEquals(5,plane1.getSeatsArray().get(0),0.0);
    }
}
