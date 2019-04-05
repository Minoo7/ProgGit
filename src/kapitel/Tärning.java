package kapitel;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;


public class Tärning{

    public static int roll() {

        /*int numberShowing = 0;
        long[] nummer = new long[6];
        Random random = new Random();
        int antalFörsök = 1000;
        for (int i = 0; i < antalFörsök; i++) {
                //numberShowing = 0;
            int numberofsixes = 0;
            for (int j = 0; j < 6; i++) {

                if(random.nextInt(6) + 1 == 6){
                    numberofsixes++;
                }
            }
            if(numberofsixes == 3){
                numberShowing++;
            }
        }
        double p = (numberShowing / antalFörsök) * 100;


        return numberShowing;*/

        int numberShowing = 0;
        int[] nummer = new int[6];
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            numberShowing = random.nextInt(6) + 1;
            nummer[numberShowing-1]++;
        }
        for (int i = 0; i < 6; i++) {
            System.out.println(i + ": " + nummer[i]);
        }
        double nummercheck = (double) nummer[5];
        System.out.println((nummer[5]/6) / 100d);
        //return numberShowing;
        return 1;
    }

    public static void main(String[] args) {
        //kasta();

        roll();

        /*Random random = new Random();
        for (int i = 0; i < 6; i++) {
            System.out.println(random.nextInt(6) + 1);
        }*/
        //System.out.println(kasta());
    }

    private static int sidor = 6;

    public static int kasta(){

        //return (int)(Math.random()*sidor+1);
        return 5;
    }

}