import java.util.Scanner;
import java.util.*;
public class Uppgifter {

    public static void main(String[] args) {
        looptest();
        //byteValueTest();
        //System.out.println();
        //uppgift2_1();
        //System.out.println();
        //test();
        //System.out.println();
        //v50Torsdag();
    }

    static void looptest() {
        // create array list object
        List arrlist = new ArrayList();

        // populate the list
        arrlist.add("A");
        arrlist.add("B");
        arrlist.add("C");

        System.out.println("Initial collection: "+arrlist);

        // shuffle the list
        Collections.shuffle(arrlist);

        System.out.println("Final collection after shuffle: "+arrlist);
    }

    static void byteValueTest() {
        Scanner input = new Scanner( System.in );
        int numberOfCorrectAnswers = 0;

        System.out.println("Svara på följande frågor");
        System.out.println();
        System.out.println("Vilket byte utrymme har?");
        System.out.println();

        System.out.print("Short = " );
        float answerShort = input.nextFloat();
        if (answerShort == 2) {
            System.out.println("Rätt");
            numberOfCorrectAnswers = numberOfCorrectAnswers + 1;
        }
        else {
            System.out.println("Fel!");
            System.out.println("Rätt svar är 2 byte");
        }
        System.out.println();

        System.out.print("int = ");
        float answerInt = input.nextFloat();
        if (answerInt == 4) {
            System.out.println("Rätt");
            numberOfCorrectAnswers = numberOfCorrectAnswers + 1;
        }
        else {
            System.out.println("Fel!");
            System.out.println("Rätt svar är 4 byte");
        }
        System.out.println();

        System.out.print("long = ");
        float answerLong = input.nextFloat();
        if (answerLong == 8) {
            System.out.println("Rätt");
            numberOfCorrectAnswers = numberOfCorrectAnswers + 1;
        }
        else {
            System.out.println("Fel!");
            System.out.println("Rätt svar är 8 byte");
        }
        System.out.println();

        System.out.print("float = ");
        float answerFloat = input.nextFloat();
        if (answerFloat == 4) {
            System.out.println("Rätt");
            numberOfCorrectAnswers = numberOfCorrectAnswers + 1;
        }
        else {
            System.out.println("Fel!");
            System.out.println("Rätt svar är 4 byte");
        }
        System.out.println();

        System.out.print("double = ");
        float answerDouble = input.nextFloat();
        if (answerLong == 8) {
            System.out.println("Rätt");
            numberOfCorrectAnswers = numberOfCorrectAnswers + 1;
        }
        else {
            System.out.println("Fel!");
            System.out.println("Rätt svar är 8 byte");
        }
        System.out.println();

        System.out.print("char = ");
        float answerChar = input.nextFloat();
        if (answerChar == 2) {
            System.out.println("Rätt");
            numberOfCorrectAnswers = numberOfCorrectAnswers + 1;
        }
        else {
            System.out.println("Fel!");
            System.out.println("Rätt svar är 2 byte");
        }
        System.out.println();

        System.out.print("boolean = ");
        float answerBoolean = input.nextFloat();
        if (answerBoolean == 1) {
            System.out.println("Rätt");
            numberOfCorrectAnswers = numberOfCorrectAnswers + 1;
        }
        else {
            System.out.println("Fel!");
            System.out.println("Rätt svar är 1 byte");
        }
        System.out.println();

        System.out.print("String = ");
        float answerString = input.nextFloat();
        if (answerString == 2) {
            System.out.println("Rätt");
            numberOfCorrectAnswers = numberOfCorrectAnswers + 1;
        }
        else {
            System.out.println("Fel!");
            System.out.println("Rätt svar är 2 byte");
        }

        System.out.println();
        System.out.println("Bra jobbat!");
        System.out.println("Du fick " + numberOfCorrectAnswers + " rätt (" + numberOfCorrectAnswers + "/8)");
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

    static void v50Torsdag() {
        double myPotens = Math.pow(5,2);
        System.out.println("This is my potens = " + myPotens);
        double a = 6.0 / 4.0; //1.5
        System.out.println("This is 6 divided by 4 = " + a);

        String s = "hejsan";
        char firstChar = s.charAt(0);
        int lengthOfMyString = s.length();
        String sectionOfString = s.substring(0, 3);
        System.out.println("My string = " + s);
        System.out.println("First character of my string = " + firstChar);
        System.out.println("Specified section of characters in my string = " + sectionOfString);
        System.out.println("Length of my string = " + lengthOfMyString);
    }
}