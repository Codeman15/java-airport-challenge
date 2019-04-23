package AirportChallenge;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.*;

public class PlaneTest {

    Plane plane = new Plane();

    @Test
    public void canLandAtAirport() {
        assertEquals("Exists", plane.land());
    }
}