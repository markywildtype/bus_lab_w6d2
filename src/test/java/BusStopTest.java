import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    BusStop busstop;
    Person person;

    @Before
    public void before(){
        busstop = new BusStop("Codeclan");
    }

    @Test
    public void hasName(){
        assertEquals("Codeclan", busstop.hasName());
    }

    @Test
    public void queueEmpty(){
        assertEquals(0, busstop.queueLength());
    }

    @Test
    public void canAddPersonToQueue(){
        busstop.addPerson(person);
        assertEquals(1, busstop.queueLength());
    }

    @Test
    public void canRemoverPersonFromQueue(){
        busstop.addPerson(person);
        busstop.addPerson(person);
        busstop.addPerson(person);
        busstop.removePerson();
        assertEquals(2, busstop.queueLength());
    }

}
