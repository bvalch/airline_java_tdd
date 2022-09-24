import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PsngrTest {
    Psngr psngr1;

    @Before
    public void before(){
        psngr1=new Psngr("Neil of Strong Arms",5);
    }

    @Test
    public void hasName(){
        assertEquals("Neil of Strong Arms",psngr1.getName());

    }
    @Test
    public void hasBags(){
        assertEquals(5,psngr1.getNumBags());

    }
    @Test
    public void canGetSeatNumber(){
        psngr1.setSeatNumber(66);
        assertEquals(66,psngr1.getSeatNumber());
    }
}
