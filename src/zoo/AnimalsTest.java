package zoo;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AnimalsTest {

    Mammal myDolphing = new Dolphing();

    @Test
    public void testDolphingSize() { assertEquals(myDolphing.getSize().intValue(), 5);}

    @Test
    public void testDolphingNumberOfLegs() { assertEquals(myDolphing.getNumberOfLegs().intValue(), 0);}

    @Test
    public void testDolphingEat() { assertEquals(myDolphing.getEat(), "Small animals");}

    @Test
    public void testDolphingReproduction() {assertEquals(myDolphing.getReproduce(), "Sexually");}

    @Test
    public void testDolphingMove() { assertEquals(myDolphing.getMove(), true);}
}

