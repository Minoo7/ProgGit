import java.sql.SQLOutput;
import java.util.Scanner;

public class Uppgifter {

    public static void main(String[] args) {
        //uppgift2_1();
        test();
        System.out.println();
    }

    static void uppgift2_1() {
        double talA = 2.1;
        double talB = 3.1;
        double summan = talA + talB;
        System.out.println("Tal A är " + talA);
        System.out.println("Tal B är " + talB);
        System.out.println("Summan är " + summan);
    }
    static void test() {
        Scanner input = new Scanner( System.in );

        System.out.println("Skriv namn:");
        String namn = input.nextLine();

        System.out.println("Skriv ålder: ");
        int ålder = input.nextInt();

        System.out.println("Skriv längd: ");
        int längd = input.nextInt();
        int tlängd;
        if (längd >= 100 ) {
            tlängd = längd/100;
        }
        else {
            tlängd = längd;
        }


        System.out.println(namn + " är " + ålder + " år gammal och " + tlängd + " m lång.");
        System.out.println("Stämmer det?");
        String rätt;
        String svar = input.nextLine();
        if (svar.equals("ja")) {
            rätt = "Vad bra!";
        }
        else {
            rätt = "Ajdå!";
        }
    }


}