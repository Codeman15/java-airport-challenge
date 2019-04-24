package AirportChallenge;


import java.util.Random;

public class Weather {


    public boolean isStormy() {
        Random rand = new Random();
        int randomNumber = rand.nextInt((100-1) + 1) + 1;
        return checkStormy(randomNumber);
    }

    public boolean checkStormy(int number) {
        return number > 90;

    }

}
