package kapitel;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

public class test {

    static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        test3dcube(5);
    }

    /*static int test3dcube(int a) {
        /*System.out.print(
                "  " + cubeline(a, "-") +
                "\n /" + forIX(a, " ") + "/|\n" +
                cubeline(a, "-") + " |\n" +
                "|" + forIX(a, " ") + "| +\n" +
                "|" + forIX(a, " ") + "|/\n" +
                cubeline(a, "-")
                );
        /*cubeline(a, "-");
        System.out.print("\n /");
        for (int i = 0; i < a; i++) {
            System.out.print(" ");
        }
        System.out.print("/|\n");
        cubeline(a, "-");*/



        /*System.out.println("*************");
        System.out.println("*\t\t\t*");
        System.out.println("*\t\t\t*");
        System.out.println("*\t  ************");
        System.out.println("*\t  *\t\t*\t *");
        System.out.println("*************\t *");
        System.out.println("\t  *\t\t\t *");
        System.out.println("\t  *\t\t\t *");
        System.out.println("\t  ************");
        /*for (int i = 0; i < 25; i++) {
            System.out.println();
        }
        return 0;
    }*/
    static int test3dcube(int a) {
        System.out.print(
                spaceIn(a) + cubeline(a, "-") +
                "\n /" + forIX(a, " ") + "/|\n" +
                cubeline(a, "-") + " |\n" +
                "|" + forIX(a, " ") + "| +\n" +
                "|" + forIX(a, " ") + "|/\n" +
                cubeline(a, "-")
                );
        /*cubeline(a, "-");
        System.out.print("\n /");
        for (int i = 0; i < a; i++) {
            System.out.print(" ");
        }
        System.out.print("/|\n");
        cubeline(a, "-");*/

        return 0;
    }
    static String cubeline(int a, String b) {
        String line = "+" + forIX(a, b) + "+";
        return line;
    }
    static String spaceIn(int a) {
        int s = (int) a/3;
        String t = "";
        for (int i = 0; i < s; i++) {
            t += " ";
        }
        return t;
    }
    static String cubelineN(int a) {
        String l = "";
        for (int i = 0; i < a; i++) {
            l += "-";
        }
        return l;
    }
    static String cubespace(int a) {
        String s = "";
        for (int i = 0; i < a; i++) {

        }
        return "";
    }
    //static String forIX(int a, String b, String bAdd) {
    static String forIX(int a, String b) {
        String c = "";
        for (int i = 0; i < a; i++) {
            c += b;
        }
        return c;
    }
}