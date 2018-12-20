package kapitel3;

import java.util.Scanner;

public class kapitel3 {
    public static void main(String[] args) {
        //arrays();
        _3_1();
    }

    static void arrays() {
        double[]poängPåProv1; // Deklarering
        poängPåProv1 = new double[22]; // Tilldelningen
        poängPåProv1[1] = 1;
        poängPåProv1[2] = 0.5;
        poängPåProv1[3] = 1;
        poängPåProv1[3] = 1;
        System.out.println(poängPåProv1[1]);

        double[] testpoints = {1, 0.5, 1, 1 ,1, 1, 1, 1, 0.5, 1, 1, 1, 0.5, 1, 1, 1, 1, 1, 1, 1, 4, 5};

        int sum = 0;

        for (double i : testpoints)
            sum += i;

        System.out.println(sum);
        System.out.println(testpoints.length);

        String[] minFruktKorg = {"Banan", "Äpple", "Apelsin"};
        String flrstaFrukten = minFruktKorg[0];
    }

    public static void _3_1() {
        Scanner input = new Scanner( System.in );
        int[]exempeltid;
        exempeltid = new int[2];
        exempeltid[0] = input.nextInt();
        System.out.println(exempeltid[0]);
    }

}
