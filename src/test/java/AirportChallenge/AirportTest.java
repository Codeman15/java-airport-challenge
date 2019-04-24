package AirportChallenge;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class AirportTest {

    Weather mockedWeather = mock(Weather.class);
    Airport airport = new Airport(mockedWeather);
    Plane mockedPlane = mock(Plane.class);
    Error re = new Error();

    @Test
    public void hasNoPlanesByDefault() {
        assertEquals(0, airport.getPlanes().size());

    }

    @Test
    public void landsAPLan() {
        airport.clearForLanding(mockedPlane);
        assertTrue(airport.getPlanes().contains(mockedPlane));
    }

    @Test
    public void takesOffAPlane() {
        airport.clearForLanding(mockedPlane);
        when(mockedWeather.isStormy()).thenReturn(false);
        assertTrue(airport.clearForTakeOff(mockedPlane));
        assertTrue(airport.getPlanes().isEmpty());
    }

    @Test
    public void givesErrorWhenIsStormy() {
        when(mockedWeather.isStormy()).thenReturn(true);

        re = assertThrows(Error.class,
                ()->{
                    airport.clearForTakeOff(mockedPlane);
                });
        assertEquals("cannont takeoff during storm", re.getMessage());
    }
}