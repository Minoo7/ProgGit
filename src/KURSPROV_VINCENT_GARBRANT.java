import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class KURSPROV_VINCENT_GARBRANT {
    static Scanner input = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        //System.out.println(minstaHeltal(new int[]{}));
        //System.out.println(volymAvPyramid(1,1));
        matteSpel();
    }

    static int minstaHeltal(int[] lista) {
        for (int i = lista.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {               // Loopar igenom paren i listan.
                if (lista[j] > lista[j+1]) {            // Om de vänstra värdet i paret är större än de högra.
                    int temp = lista[j+1];              // Sparar undan de högra (mindre) värdet.
                    lista[j+1] = lista[j];              // Lägger in de vänstra (större) värdet på den högra platsen i paret.
                    lista[j] = temp;                    // Lägger in de undansparade högra (mindre) värdet på den vänstra platsen i paret.
                }
            }
        }
        return lista[0];
    }

    static double volymAvPyramid(double sida, double höjd) {
        double basyta = sida*sida;
        double volym = basyta*(höjd/3);
        return volym;
    }

    static void matteSpel() {
        System.out.println("Välkommen till mattespelet!\n");
        char[] operator = new char[]{'+', '-', '*'};

        int 
    }
}
