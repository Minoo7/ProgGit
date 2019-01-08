package kapitel3;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

public class kapitel3 {
    public static void main(String[] args) {
        //arrays();
        //_3_1();
        //d_01_7();
        //upp_kap3_clsrm();
        split();
    }

    static void split() {
        Scanner input = new Scanner(System.in);
        System.out.println("Hur mycket är klockan?");
        String klockslag = input.nextLine();
        String[] klockslagUppedlat = klockslag.split( ":");
        System.out.println("Längden av min lista är " + klockslagUppedlat.length);
        System.out.println("Timmar = " + klockslagUppedlat[0]);
        System.out.println("Minuter = " + klockslagUppedlat[1]);
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

    static void d_01_7() {
        String[] minaFrukter = new String[3];
        minaFrukter[0] = "Banan";
        minaFrukter[1] = "Äpple";
        minaFrukter[2] = "Apelsin";

        String[] minFruktkorg = {"Banan", "Äpple", "Apelsin"};

        int[] minaVärden = {3,7,5};
        int a = minaVärden[1];
        minaVärden[1] = minaVärden[2];
        minaVärden[2] = a;


        System.out.println(minaFrukter[1]);
        System.out.println(minFruktkorg);
        System.out.println(minaVärden);
    }

    static void upp_kap3_clsrm() {
        Scanner input = new Scanner( System.in );

        /*String[] dagar = {"Måndag", "Tisdag", "Onsdag", "Torsdag", "Fredag", "Lördag", "Söndag"};
        System.out.println("Vilken dag i veckan är det?");
        int answer1 = input.nextInt();
        System.out.println("Idag är det " + dagar[answer1 - 1]);
        System.out.println(dagar);

        char[] tecken = {'P', 'I', 'Z', 'Z', 'A'};
        char[] tecken2 = {tecken[4], tecken[2], tecken[3], tecken[1], tecken[0]};
        System.out.println(tecken2);

        System.out.println("Skriv 3 ord");
        String ord1 = input.nextLine();
        String ord2 = input.nextLine();
        String ord3 = input.nextLine();

        String[] lista1 = {ord1, ord2, ord3};
        String[] lista2 = {ord1, ord3, ord2};
        String[] lista3 = {ord2, ord1, ord3};
        String[] lista4 = {ord2, ord3, ord1};
        String[] lista5 = {ord3, ord1, ord2};
        String[] lista6 = {ord3, ord2, ord1};

        System.out.println("Övning 3.1");
        float[] heltalsfält = new float[3];
        System.out.println("Skriv in dina flytvärden (i decimal form!)");
        System.out.print("Skriv in ditt första värde: ");
        heltalsfält[0] = input.nextFloat();
        System.out.print("andra: ");
        heltalsfält[1] = input.nextFloat();
        System.out.print("tredje: ");
        heltalsfält[2] = input.nextFloat();
        System.out.print("fjärde: ");
        heltalsfält[3] = input.nextFloat();


        System.out.println("Hur många värden vill du spara?");
        int uservalue = input.nextInt();

        char[] values = new char[uservalue];
        int userog = uservalue;
        while (uservalue - 1 > 0) {
            int us_1 = uservalue - 1;
        }
        System.out.println(values);

        String[][] provResultat = new String[3][2]; // 3 platser
        String[] prov1 = {"Prov1", "A"};
        String[] prov2 = {"Prov2", "C"};
        String[] prov3 = {"Prov3", "D"};
        provResultat[0] = prov1;
        provResultat[1] = prov2;
        provResultat[2] = prov3;

        System.out.println(provResultat[2][0]);


        int[] lista1 = new int[2];
        int[] lista2 = new int[2];
        int[] lista3 = new int[2];

        System.out.println("Ange tre värden för den första listan");
        System.out.print("Första värdet: ");
        lista1[0] = input.nextInt();
        System.out.print("Andra: ");
        lista1[1] = input.nextInt();
        System.out.print("Tredje: ");
        lista1[2] = input.nextInt();

        System.out.println("Ange tre värden för den andra listan");
        System.out.print("Första värdet: ");
        lista2[0] = input.nextInt();
        System.out.print("Andra: ");
        lista2[1] = input.nextInt();
        System.out.print("Tredje: ");
        lista2[2] = input.nextInt();

        System.out.println("Ange tre värden för den tredje listan");
        System.out.print("Första värdet: ");
        lista3[0] = input.nextInt();
        System.out.print("Andra: ");
        lista3[1] = input.nextInt();
        System.out.print("Tredje: ");
        lista3[2] = input.nextInt();

        int[] minLista = {lista1, lista2, lista3};
        */
    }
}
