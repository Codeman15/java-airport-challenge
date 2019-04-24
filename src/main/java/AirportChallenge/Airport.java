package AirportChallenge;

import java.util.ArrayList;

public class Airport {

    private  ArrayList<Plane> hanger = new ArrayList<Plane>();
    private Weather weather;

    public Airport(Weather weather) {
        this.weather = weather;
    }

    public  ArrayList<Plane> getPlanes() {
        return hanger;
    }

    public void clearForLanding(Plane plane) {
        hanger.add(plane);
    }

    public boolean clearForTakeOff(Plane plane) {
        if(weather.isStormy()){
            throw new Error("cannont takeoff during storm");
        }
        return hanger.remove(plane);
    }
}
