package AirportChallenge;

import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

import static org.junit.Assert.*;

public class PlaneTest {

    Plane plane = new Plane();
    Airport mockedAirport = mock(Airport.class);

    @Test
    public void canLandAtAirport() {
        plane.land(mockedAirport);
        verify(mockedAirport).clearForLanding(plane);
    }

    @Test
    public void canTakeOffFromAirport() {
        plane.land(mockedAirport);
        plane.takeoff();
        verify(mockedAirport).clearForTakeOff(plane);
    }
}