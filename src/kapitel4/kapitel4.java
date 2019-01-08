package kapitel4;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

public class kapitel4 {
    public static void main(String[] args) {
        //test();
        övningar();
    }

    static void övningar() {
        Scanner input = new Scanner(System.in);

        /*System.out.println("Övning 4.1");
        double tal1, tal2;
        System.out.print("Mata in två heltal: ");
        tal1 = input.nextDouble();
        tal2 = input.nextDouble();
        System.out.println(tal1 + "/" + tal2 + " = " + tal1/tal2);
        System.out.println(tal1 + "%" + tal2 + " = " + tal1%tal2);*/

        /*System.out.println("Övning 4.2");
        System.out.print("Ange antal måndader: ");
        int antal = input.nextInt();
        int år = antal / 12;
        int mån = antal % 12;
        System.out.println(antal + " månader = " + år + " år " + mån + " månader" );*/

        /*System.out.println("Övning 4.3");
        double produkt = 4;
        double tal = 5;
        produkt += tal;
        System.out.println("produkt = " + produkt);*/

        System.out.println("Övning 4.4");

    }

    static void test() {
        Scanner input = new Scanner(System.in);

        System.out.print("Ange tid i sekunder: ");
        int tid = input.nextInt();
        int min = tid / 60;
        int sek = tid % 60;
        System.out.println(tid + " s = " + min + " min " + sek + "s");
    }
}
