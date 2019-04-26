package UppgifterMetoder;

import java.util.Scanner;

public class E {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //System.out.println(_1_dubbelSåStort(-3.14));
        //System.out.println(_2_förstaHalvanSträng("Dator"));
        //System.out.println(_3_störstaTalet(5, 5));
    }

    //1
    static double _1_dubbelSåStort(double T1) {
        double T2 = 2*T1;
        return T2;
    }

    //2
    static String _2_förstaHalvanSträng(String str) {
        double c = (str.length()/2.0);
        if (c%1 == 0.5) {c = c+0.5;}
        String förstaHalvan = "";
        for (int i = 0; i < c; i++) {
            förstaHalvan += str.charAt(i);
        }
        return förstaHalvan;
    }

    //3
    static int _3_störstaTalet(int T1, int T2) {
        if (T1 < T2) {
            return T2;
        }
        else {
            return T1;
        }
    }
}
