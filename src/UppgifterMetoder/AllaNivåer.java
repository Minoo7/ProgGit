package UppgifterMetoder;

import java.util.ArrayList;
import java.util.Scanner;

public class AllaNivåer {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(TrialDivision(42));
    }

    static java.util.ArrayList TrialDivision(int n) {
        //Return a list of the prime factors for a natural number.
        //int[] b = new int[5];
        ArrayList<Integer> a = new ArrayList<>();
        int f = 2;
        int i = -1;
        while (n > 1) {
            i++;
            if (n % f == 0) {
                a.add(f);
                n /= f;
            }
            else {
                f += 1;
                i--;
            }
        }
        return a;
    }
}
