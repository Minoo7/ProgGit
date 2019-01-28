package kapitel7;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

public class kapitel7 {

    public static void main(String[] args) {
        övningar();
    }

    static void övningar() {
        Scanner input = new Scanner(System.in);

        //Övning 7.2
        /*int tanken = 50;
        double pris = 9.50;
        System.out.println("Hur mycket etanol finns det i tanken?");
        double etanol = input.nextDouble();
        if (etanol > 10) {
            System.out.println("Åk vidare!");
        }
        else {
            System.out.println("Du bör tanka!");
            etanol = tanken - etanol;
            System.out.println("Du kan fylla på " + etanol);
            System.out.println("Att fylla på tanken fullt skulle kostar " + (etanol*pris) + " kr");

        }*/

        //Övning 7.3
        /*System.out.println("Vad är din ålder?");
        int ålder = input.nextInt();
        if (15 <= ålder && ålder <= 65) {
            System.out.println("Din bussbiljett kostar 10 kr");
        }
        else {
            System.out.println("Din bussbiljett kostar 5 kr");
        }*/

        //Övning 7.6
        /*double prisPerSkiva = 9.9;
        System.out.println("Hur många skivor ska du köpa?");
        double antalSkivor = input.nextInt();
        double pris = prisPerSkiva * antalSkivor;
        if (antalSkivor >= 10) {
            pris*=0.95;
        }
        if (antalSkivor >= 50) {
            pris*=0.9;
        }
        if (antalSkivor >= 100) {
            pris*= 0.85;
        }
        System.out.println("Din totala kostnad är " + pris + " kr");*/

        //Övning 7.7
        /*System.out.println("MENY");
        System.out.println("1.  Insättning");
        System.out.println("2.  Uttag");
        System.out.println("3.  Visa behållning");
        double behållning = 1000;
        int val = input.nextInt();
        switch(val) {
            case 1:
                System.out.println("Hur mycket vill du insätta?");
                System.out.print("Insättning: ");
                double insättning = input.nextDouble();
                behållning += insättning;
                System.out.println("Behållning = " + behållning);
                break;
            case 2:
                System.out.println("Hur mycket vill du ta ut?");
                System.out.print("Uttag: ");
                double uttag = input.nextDouble();
                behållning -= uttag;
                System.out.println("Behållning = " + behållning);
                break;
            case 3:
                System.out.println("Behållning = " + behållning);
                break;

            default:
                System.out.println("Ogiltig input");
        }*/

        //Övning 7.8
        /*System.out.println("Skriv in två strängar");
        String s1 = input.nextLine();
        String s2 = input.nextLine();
        String Cs1 = s1.toUpperCase();
        String Cs2 = s2.toUpperCase();
        int number = (Cs1.compareTo(Cs2));
        if (number < 0) {
            System.out.println(s1 + " " + s2);
        }
        else {
            System.out.println(s2 + " " + s1);
        }*/

        int tal1 = 5;
        int tal2 = 10;
        int tal3 = 2;
        int max = tal1 > tal2 ? tal1 : tal2;
        //System.out.println(((tal1) : (tal2));
        System.out.println(max);
        System.out.println(tal1);
        System.out.println(tal2);
    }
}
