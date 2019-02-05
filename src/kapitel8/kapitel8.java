package kapitel8;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

public class kapitel8 {

    public static void main(String[] args) {
        test();
        övningar();
        //uppgifter();
    }

    static void test() {
        Scanner input = new Scanner (System.in);

        // En for-loop gör saker om och om igen.
        // For-loopen har en iterationsvariabel, ofta kallad i
        // For-loopen ändrar värdet på i varje varv i loopen
        // For-loopen måste veta hur länge den ska hålla på.

        // i är iterationsvariabeln
        // Loopen håller på så länge i är mindre än 5 (dvs 5 varv)
        // I slutet av varje varv ökar iterationsvariabeln i med 1.
        /*for(int i = 0; i < 5; i++) {
            System.out.println("Värdet på iterationsvariabeln i är " + i);
       }*/

        /*String[] lista = {"mango","banan", "äpple"};
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i] + " ");
        }
        System.out.println("\nFärdiga!");

        /*for (int i = 4; i < 10; i++) {
            System.out.println(i);
        }*/

        //Besöker varje våning:
        /*for (int v = 1; v <=6; v++) {
            for (int a = 1; a<=4; a++)
        }*/
    }

    static void övningar() {
        Scanner input = new Scanner (System.in);

        //Övning 1
        /*for (int i = 10; i <= 25; i++) {
            System.out.print(i + " ");
        }*/

        //Övning 2
        /*int start, slut, steg;

        System.out.print("Start: "); start = input.nextInt();
        System.out.print("Slut: "); slut = input.nextInt();
        System.out.print("Steg: "); steg = input.nextInt();

        for (int n = slut; n > start; n -= steg ) {
            System.out.print(n + " ");
        }*/

        //Övning 8.3
        /*int[] hastighet = new int[8];
        System.out.println("m/s\t km/h");
        for (int n = 0; n < hastighet.length; n++) {
            hastighet[n] = 5*(n+1);
            System.out.println(hastighet[n] + " \t " + (int)(3.6*(hastighet[n])));
        }*/

        //Övning 8.4
        /*System.out.println("Skriv ut 5 värden");
        int[] fält = new int[5];
        int antal = 5;

        for ( int n = 0; n < antal; n++) {
            System.out.println("Ange tal " + n + ": ");
            fält[n]  = input.nextInt();
        }

        int max = fält[0];
        for (int n = 0; n < antal; n++) {
            if (max > fält[n]) max = fält[n];
        }

        System.out.println();
        System.out.println("Största värdet: " + max);
        */

        //Övning 8.5
        /*for (int m = 1; m <= 10; m++) {
            for (int n = 1; n <= m; n++) {
                System.out.print(m*n + "\t");
            }
            System.out.println();
        }*/

        /*for (int rad = 1; rad <= 10; rad++) {
            for(int i = 1; i < rad; i++){
                System.out.print("\t");
            }
            for (int kolumn = rad; kolumn <= 10; kolumn++) {
                System.out.print(rad*kolumn + "\t");
            }
            System.out.println();
        }*/

        //Övning 8.6
        /*int folk = 1000000;
        int tvåmil = 2000000;
        int gånger = 0;
        while (folk < tvåmil) {
            folk *= 1.05;
            gånger++;
        }
        System.out.println(gånger);*/

        //Övning 8.7
        boolean fortsätt = true;
        while (fortsätt) {

            System.out.println("Miniräknare:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraktion");
            System.out.println("3. Multiplikation");
            System.out.println("4. Division");
            System.out.println("Ange ett av numerna för att bestämma räknesätt:");
            int val = input.nextInt();
            switch (val) {
                case (1):
                    System.out.println("Du valde addition");
                    System.out.print("TAL1 : ");
                    double tal1 = input.nextDouble();
                    System.out.println("TAL2: ");
                    double tal2 = input.nextDouble();
                    System.out.println("TAL1 + TAL2 = " + tal1 + " + " + tal2 + " = " + (tal1 + tal2));
                    System.out.println("Fortsätt? (ja/nej)");
                    String svar = input.nextLine();
                    switch (svar) {
                        case ("ja"):
                            fortsätt = true;
                            break;
                        case ("nej"):
                            fortsätt = false;
                    }
            }
        }
    }

    static void uppgifter() {

    }

}
