package kapitel;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;


public class metoder {
    static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //System.out.println(antalUpprepningar("godis", 4, false));
        System.out.println(simuleraTärningsKast(2));
    }

    static double simuleraTärningsKast(int x) { // Räknas ut med (1/6)^2 + (1/6)^2 KOLLA https://anydice.com/
        double chans = (1d/6d);
        for (int i = 1; i < x; i++) {
            chans = chans*chans;
        }
        return chans;
    }

    /*static String antalUpprepningar(String s, int x, boolean size) {
        String str = "";
        for (int i = 0; i < x; i++) {
            str += s;
        }
        if (size == true) {
            str = str.toUpperCase();
        }
        else {
            str = str.toLowerCase();
        }
        return str;
    }*/
}