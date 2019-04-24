package AirportChallenge;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

class WeatherTest {

    Weather weather = new Weather();

    @Test
    void givesTrueSomeTimes() {
        assertTrue(weather.checkStormy(95));

    }

    @Test
    void givesFalseSomeTimes() {
        assertFalse(weather.checkStormy(50));

    }
}