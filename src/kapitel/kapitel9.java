package kapitel;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

public class kapitel9 {

    static int antal;

    static int ok;

    static final Scanner input = new Scanner (System.in);

    static final double PI = 3.14;

    public static void main(String[] args) {
        //test();
        //exempel();
        övningar();
        //uppgifter();
    }

    static void exempel() {
        System.out.print("Mata in temperaturen i Fahrenheit: ");
        double fahr = input.nextDouble();

        double cel = tempconvert(fahr);; //anrop

        System.out.println(fahr + " grader Fahrenheit är " + cel + " grader celsius.");
    }

    static void test() {
        double y = kvadrera(5.0);
        System.out.println(y);
    }

    static double kvadrera(double x) {
        return x*x;
    }

    public static double tempconvert(double x) {
        double celsius = (x - 32)/1.8;
        return celsius;
    }

    static void övningar() {
        /*9.1*//*
        System.out.println("Beräkning av area hos cylinder basyta");
        System.out.println("Area beräknas med formeln: A = π • r²");
        System.out.println("Skriv in radien r: ");
        double svar = input.nextDouble();
        double area = Acylinder(svar);
        System.out.println("Arean är = " + area);

        *//*9.2*//*
        System.out.println("Beräkning av volym hos cylinder");
        System.out.println("Volymen beräknas med formeln: V = π • r² • h");
        System.out.println("Skriv ut radie och höjd");
        System.out.print("radie: ");
        double r = input.nextDouble();
        System.out.print("höjd: ");
        double h = input.nextDouble();
        double volym = Vcylinder(r, h);
        System.out.println("Volym: " + volym);

        *//*9.3*//*

        *//*9.4*//*
        System.out.print("Bestäm höjd på kvadraten:");
        int height = input.nextInt();
        drawTriangle(height);

        *//*9.6*//*
        double maj = snabbTid(new double[]{5.3, 5.2});
        double maj = snabbTid(new double[]{1, 2, 3});
        System.out.println();
        snabbTid(new double[]{1, 2, 3});
        snabbTid(new double[5]);

        *//*9.7*/
        //vändText("talk");
        String text = namnback("hejsan");
        System.out.println(text);
    }

    /*static String vändText(String text) {
        char[] nynamn = new char[text.length()];
        for (int i = text.length(); i <= 0; i--) {
            for (int j = 0; j == i; j++) {
                text[j] = text.charAt(i);
            }
        }
        return
    }*/

    static String namnback(String namnet) {
        // vänd namnet??
        String deomvändanamnet = "";
        for (int i = namnet.length()-1; i >= 0; i--) {
            deomvändanamnet += namnet.charAt(i);
        }
        // skicka tillbaka de vända namnet.
        return deomvändanamnet;
    }

    /*static double snabbTid(double[] tid) {
        System.out.println("Skriv in tiderna. Avsluta med 0");
        //antal = 0;
        double temp = input.nextDouble();

        for (int i = 0; i <= tid.length; i++) {
            tid[i] = temp;
            temp = input.nextDouble();
            if (temp == 0) {
                break;
            }
        }
        while (temp != 0) {
            tid[antal] = temp;
            antal++;
            temp = input.nextDouble();
        }
        System.out.print("Tiderna är: ");
        for (int i = 0; i < tid.length; i++) {
            System.out.print(" " + tid[i]);
        }
        System.out.println();

        // hitta snabbaste tiden..
        double minsta = tid[0];
        for (int i = 1; i <= tid.length; i++) {
            if (tid[i] <= minsta) {
                minsta = tid[i];
            }
            //else {
            //}
        }
        return 1;

        //System.out.println("Snabbaste tiden är " + snabbTid(tid));
        //return minsta;
    }*/

    static void drawPyramid(int height) {
        for (int i = 1; i <= height; i++) {

            for (int j = 1; j < height-i+1; j++) {
                System.out.print(" ");
            }

            for (int j = i*2-1; j > i; j--) { //this for loop is my problem. any solution?
                System.out.print("*");
            }

            for (int j = i; j < i+i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void drawTriangle(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void drawSquare(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

    static double Acylinder(double x) {
        return 3.14 * (x*x);
    }
    static double Vcylinder(double r, double h) {
        return 3.14 * (r*r) * h;
    }

    static void uppgifter() {

    }

}