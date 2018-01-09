import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Bus bus;
    Person person;
    BusStop busstop;

    @Before
    public void before(){
        bus = new Bus("Party Central", 5);
        person = new Person();
        busstop = new BusStop("Codeclan");
    }

    @Test
    public void busStartsEmpty(){
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void busHasDestination(){
        assertEquals("Party Central", bus.getDestination());
    }

    @Test
    public void busHasCapacity(){
        assertEquals(5, bus.getCapacity());
    }

    @Test
    public void canAddPassenger(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(5, bus.passengerCount());
    }

    @Test
    public void cannotAddOverCapacity(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(5, bus.passengerCount());
    }

    @Test
    public void canRemovePassenger(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.removePassenger();
        assertEquals(2, bus.passengerCount());
    }

    @Test
    public void pickUpPassenger(){
        busstop.addPerson(person);
        bus.pickUp(busstop);
        assertEquals(1, bus.passengerCount());
        assertEquals(0, busstop.queueLength());
    }
}
