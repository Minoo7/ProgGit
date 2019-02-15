package kapitel;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

public class kapitel9 {

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

        *//*9.3*/

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