package AirportChallenge;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.*;

public class AirportTest {

    Airport airport = new Airport ();

    @Test
    public void hasNoPlanesByDefault() {
        assertEquals(0, airport.planes.length);

    }


}