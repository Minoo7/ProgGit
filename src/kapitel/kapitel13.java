package kapitel;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

public class kapitel13 {

    static final Scanner input = new Scanner (System.in);

    static String fora(String x) {
        String k = "";
        for (int i = 0; i < 5; i++) {
            k += (i + " ");
            System.out.println(x);
        }
        return k;
    }

    public static void main(String[] argz) {
        uppgifter();
    }

    private static void uppgifter() {
        /*1.*/
        System.out.println("Skriv in 11 tal: ");
        int[] osorterad = new int[11];
        for (int i = 0; i < osorterad.length; i++) {
            System.out.print("tal " + (i+1) + ": ");
            osorterad[i] = input.nextInt();
        }

        System.out.print("Tal osorterade: ");
        for (int i = 0; i < osorterad.length; i++) {
            if (i == ((osorterad.length)-1)) {
                System.out.print(osorterad[i]);
            }
            else {
                System.out.print(osorterad[i] + ", ");
            }
        }

        System.out.print("\nTal sorterade: ");
        int[] sorterad = sökning.bubbelSortera(osorterad);
        for (int i = 0; i < osorterad.length; i++) {
            if (i == ((osorterad.length)-1)) {
                System.out.print(sorterad[i]);
            }
            else {
                System.out.print(sorterad[i] + ", ");
            }
        }

        /*2.*/
        System.out.println("\nMedian: " + sorterad[6]);

        int medel = 0;

        for (int aSorterad : sorterad) {
            medel = +aSorterad;
        }
        medel = medel/2;
        System.out.println("Medelvärde: " + medel);
    }

    /*static int[] bubbelSortera(int[] lista){
        for(int i = lista.length - 1; i >= 0; i--){
            for(int j = 0; j < i; j++){         // Loopar igenom paren i listan.
                if(lista[j] > lista[j+1]){      // Om de vänstra värdet i paret är större än de högra.
                    int temp = lista[j+1];      // Sparar undan de högra (mindre) värdet.
                    lista[j+1] = lista[j];      // Lägger in de vänstra (större) värdet på den högra platsen i paret.
                    lista[j] = temp;            // Lägger in de undansparade högra (mindre) värdet på den vänstra platsen i paret.
                }
            }
        }
        return lista;

    }*/
}
