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
        Scanner input = new Scanner (System.in);

        //Övning 7.2
        int tanken = 50;
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

        }
    }

}
