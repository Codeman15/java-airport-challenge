package AirportChallenge;

public class Plane {

    private Airport location;

    public void land(Airport airport) {
        airport.clearForLanding(this);
        location = airport;
    }

    public void takeoff() {
        location.clearForTakeOff(this);
        location = null;
    }
}
