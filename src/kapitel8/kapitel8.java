package kapitel8;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

public class kapitel8 {

    public static void main(String[] args) {
        //test();
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

        String[] lista = {"mango","banan", "äpple"};
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i] + " ");
        }
        System.out.println("\nFärdiga!");

        /*for (int i = 4; i < 10; i++) {
            System.out.println(i);
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
        
    }

    static void uppgifter() {

    }

}
