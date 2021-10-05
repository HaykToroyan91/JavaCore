package chapter2;

import java.sql.SQLOutput;

public class Example3 {
    public static void main(String[] args) {
        int lightspeed;
        long days;
        long seconds;
        long distance;
        lightspeed = 186000;
        days = 1000;
        seconds = days * 24 * 60 * 60;
        distance = lightspeed * seconds;
        System.out.print(" in " + days);
        System.out.print(" days light will trawel about ");
        System.out.println (distance + "mile");


    }
}
