package kapitel6;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

public class kapitel6 {
    public static void main(String[] args) {
    övningar();
    }

    static void övningar() {
        Scanner input = new Scanner (System.in);

        System.out.println("Mata in tre heltal");
        int tal1 = input.nextInt();
        int tal2 = input.nextInt();
        int tal3 = input.nextInt();
        int summa = tal1 + tal2 + tal3;

        System.out.println("Summan är = " + summa);


    }

}