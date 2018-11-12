import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestBottle {

    Bottle bottle;

    @Before
    public void before(){
        bottle = new Bottle();
    }

    @Test
    public void hasVolume(){
        assertEquals(100, bottle.getVolume());
    }

    @Test
    public void takeDrink(){
        assertEquals(90, bottle.takeDrink());
    }

    @Test
    public void takeThreeDrinks(){
        bottle.takeDrink();
        bottle.takeDrink();
        assertEquals(70, bottle.takeDrink());
    }

    @Test
    public void empty(){
        assertEquals(0, bottle.empty());
    }

    @Test
    public void fill(){
        assertEquals(100, bottle.fill());
    }
}
