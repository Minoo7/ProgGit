package kapitel4;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

public class kapitel4 {
    public static void main(String[] args) {
        //test();
        //övningar();
        classroomövningar();
    }

    static void classroomövningar() {
        Scanner input = new Scanner(System.in);

        /*
        System.out.println("1.");
        System.out.println("Hur många liter färg ska köpas?");
        float liter = input.nextInt();
        float hinkar = (int) liter / 5;

        float extra = liter%5;
        if (extra != 0) {
            hinkar++;
        }
        else {
            extra = 5;
        }
        System.out.println((int)liter + " liter kräver " + (int)hinkar + " hinkar, den sista hinken innehåller " + (int)extra + " liter");
        */

        /*
        System.out.println("2.");
        System.out.println("Mata in 3 tal till a, b och c");
        System.out.print("a = ");
        float a = input.nextFloat();
        System.out.print("b = ");
        float b = input.nextFloat();
        System.out.print("c = ");
        float c = input.nextFloat();
        float produkten = a * b * c;
        float summan = a + b + c;
        float differensen = produkten - summan;
        System.out.println("Differensen av " + produkten + " - " + summan + " är = " + differensen);
        */

        System.out.println("3.");
        int a = 10;
        int Aplusplus = a++;
        int plusplusA = ++a;
        System.out.println("a = " + a);
        System.out.println("a++ = " + Aplusplus);
        System.out.println("");
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
        double a = 12%5;
        System.out.println(a);

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
