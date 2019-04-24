package AirportChallenge;

import java.util.ArrayList;

public class Airport {

    private static ArrayList<Plane> planes = new ArrayList<Plane>();

    public static ArrayList<Plane> getPlanes() {
        return planes;
    }

    public void addPlanes(Plane plane) {
        planes.add(plane);
    }
}
