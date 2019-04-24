package AirportChallenge;

import org.junit.Test;

import static org.junit.Assert.*;

public class AirportTest {

    Airport airport = new Airport ();
    Plane plane = new Plane();

    @Test
    public void hasNoPlanesByDefault() {
        assertEquals(0, airport.getPlanes().size());

    }

}