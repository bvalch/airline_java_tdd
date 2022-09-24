import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewTest {
    CabinCrew cabinCrew1;

    @Before
    public void before() {
        cabinCrew1 = new CabinCrew("Joe", RankType.FLIGHT_ATTENDANT);

    }

    @Test
    public void hasName() {
        assertEquals("Joe", cabinCrew1.getName());
    }

    @Test
    public void hasType() {
        assertEquals(RankType.FLIGHT_ATTENDANT, cabinCrew1.getRankType());
    }
}
