package Prov_Kap_1_till_9;

import java.util.Scanner;

public class ProvKapEttTillNio_MALL {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        uppgift1_2poäng();
        input.nextLine();
        //uppgift2_3poäng();
        input.nextLine();
        //uppgift3_4poäng();
        input.nextLine();
    }


    private static void uppgift1_2poäng() {
    /*
        UPPGIFT 1: Produkten av tal                                         2 POÄNG
        Fråga användaren efter två tal; t1 och t2.
        Skapa en metod static int produktenAv((int tal1, int tal2) som returnerar produkten av tal1 och tal2.
        Anropa din nyligen skapade metod och skriv en informerande text som anger
        vad produkten är samt om produkten är ett jämnt eller ett udda tal.
        Körexempel:
        Skriv in ett tal, tack:
        7
        Skriv in ett till tal, tack:
        9
        7*9 är 63 vilket är ett udda tal.
     */
        System.out.println("Beräkning av produkten av två tal");
        System.out.println("Skriv in två tal");
        System.out.print("tal1: ");
        int tal1 = input.nextInt();
        System.out.print("tal2: ");
        int tal2 = input.nextInt();
        System.out.println(tal1 + " * " + tal2 + " = " + produktenAv(tal1, tal2));
        System.out.println(5 % 2);
    }

    static int produktenAv(int tal1, int tal2) {
        int produkt = tal1 * tal2; // skapar en produkt
        return produkt;
    }

    static String udda(int u) {
        return "h";
    }

    private static void uppgift2_3poäng() {
    /*
        UPPGIFT 2: Kvadratutskrift                                          3 POÄNG
        Använd någon typ av loop för att skriva ut de 10 första kvadraterna, d.v.s:
        1 4 9 16 25 36 49 64 81 100
     */
    }

    private static void uppgift3_4poäng() {
    /*
        UPPGIFT 3: Talbasbyte                                              4 POÄNG
        Fråga användaren efter en talbas.
        Fråga användaren efter ett tal T i denna talbas.
        Fråga användaren vilken talbas hen vill omvandla de nyligen inskrivna talet T till.
        Skapa en metod static int konverteraMellanBaser(int tal, int talbas)
        Anropa den nyligen skapade metoden och skriv ut informerande text om vad resultatet blev.
        Körexempel:
        Tal?
        14
        Talbas?
        10
        Ny talbas?
        2
        14 i basen 10 är 10110 i basen 2.
     */
    }

}