package kapitel;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;


public class TärningP {

    public static double roll() {

        double numberShowing = 0;
        Random random = new Random();
        double tries = 1000d;
        double numberOfSixes;
        for (int i = 0; i < tries; i++) {
           numberOfSixes = 0;
            for (int j = 0; j < 5; j++) {
                if(random.nextInt(8) + 1 == 6){
                    numberOfSixes++;
                }
            }
            if(numberOfSixes == 3){
                numberShowing++;
            }
        }
        double p = (numberShowing / tries) * 100d;


        return p;
    }

    public static void main(String[] args) {
        System.out.println(roll());
        /*Random random = new Random();
        for (int i = 0; i < 15; i++) {
            System.out.println(random.nextInt(6));
        }*/
    }
}