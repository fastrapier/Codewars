package main.java.kyu_8;

public class WillYouMakeIt {
    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
        if (distanceToPump <= mpg * fuelLeft) {
            return true;
        } else
            return false;
    }
    
}
