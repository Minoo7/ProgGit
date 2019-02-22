package kapitel;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

public class Midsommar {

    static final Scanner input = new Scanner (System.in);

    public static void main(String[] args) {
        //fråga();
        int dagarna = dagarkvarTillMidsommar(4, 2);
        System.out.println(dagarna);
    }

    static void fråga() {
        System.out.println("Vilken månad och dag vill du ha?");
        System.out.print("Månad:");
        int månad = input.nextInt();
        System.out.print("Dag:");
        int dag = input.nextInt();
    }

    public static int dagarkvarTillMidsommar(int månad, int dag) {
        //Midsommar är 172 dagar från dag 0
        int[] månader = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int plusmånader = 0;
        int kvar = 0;
        for (int i = 0; i < månad; i++) {
            plusmånader += månader[i];
        }
        kvar = 172 - (dag + plusmånader);

        return kvar;
    }
}