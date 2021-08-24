import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;
    private BusStop busStop;

    @Before
    public void before(){
        bus = new Bus("Edinburgh", 50);
        busStop = new BusStop("Princes street");



    }
    @Test
    public void canGetPassengerCount(){
        assertEquals(0, bus.getPassengerCount());
    }

    @Test
    public void  canAddPassenger(){
        bus.addPassenger(person);
        assertEquals(1, bus.getPassengerCount());
    }
//    @Test
//    public void cantAddMoreThenCapacity(){
//        bus.addPassenger(person);
//        assertEquals();
//
//    }
    @Test
    public void canRemovePassenger(){
        bus.addPassenger(person);
        bus.removePassenger(person);
        assertEquals(0, bus.getPassengerCount());
    }

    @Test
    public void canPickUpFromBusStop(){
        busStop.addPerson(person);
        bus.pickUp();
        assertEquals(1, bus.getPassengerCount());
    }

    }
