import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.*;

public class Uppgifter {

    public static void main(String[] args) {
        //repetitionsfrågor();
        //looptest();
        //byteValueTest();
        //System.out.println();
        //uppgift2_1();
        //System.out.println();
        //test();
        //System.out.println();
        //v50Torsdag();
    }

    static void repetitionsfrågor() {
        Scanner input = new Scanner( System.in );
        int numberOfCorrectAnswers = 0;

        System.out.println("Skriv de commands som passar varje uppgift");
        System.out.println("Använd tal och tecken som variabel namn beroende på uppgiften");
        System.out.println();
        System.out.println("a)  Reservera 4 byte för ett nytt heltal.");
        String a = input.nextLine();
        if (a.equals("int tal;")) {
            System.out.println("Rätt!");
            numberOfCorrectAnswers = numberOfCorrectAnswers + 1;
        }
        else {
            System.out.println("Fel!");
        }
        System.out.println();

        System.out.println("b)  Reservera 2 byte för ett nytt heltal och ge det värdet 5");
        String b = input.nextLine();
        if (b.equals("short tal = 5;")) {
            System.out.println("Rätt!");
            numberOfCorrectAnswers = numberOfCorrectAnswers + 1;
        }
        else {
            System.out.println("Fel!");
        }
        System.out.println();

        System.out.println("c)  Reservera 4 byte för ett nytt flyttal och ge värdet 3,3.");
        String c = input.nextLine();
        if (c.equals("float tal = 3.3f;")) {
            System.out.println("Rätt!");
            numberOfCorrectAnswers = numberOfCorrectAnswers + 1;
        }
        else {
            System.out.println("Fel!");
        }
        System.out.println();

        System.out.println("d)  Reservera 8 byte för ett nytt flyttal och ge värdet 9,90.");
        String d = input.nextLine();
        if (d.equals("double tal = 9.90;")) {
            System.out.println("Rätt!");
            numberOfCorrectAnswers = numberOfCorrectAnswers + 1;
        }
        else {
            System.out.println("Fel!");
        }
        System.out.println();

        System.out.println("e)  Reservera 2 byte för ett nytt tecken och ge det värdet T.");
        String e = input.nextLine();
        if (e.equals("char tecken = T;")) {
            System.out.println("Rätt!");
            numberOfCorrectAnswers = numberOfCorrectAnswers + 1;
        }
        else {
            System.out.println("Fel!");
        }
        System.out.println();

        System.out.println();
        System.out.println("Bra jobbat!");
        System.out.println("Du fick i denna del " + numberOfCorrectAnswers + " rätt (" + numberOfCorrectAnswers + "/5)");

        System.out.println("Nu kommer nästa del!");
        System.out.println();

        int numberOfCorrectAnswers2 = 0;
        System.out.println("Svara på följande frågor");
        System.out.println();
        System.out.println("Vilket byte utrymme har?");
        System.out.println();

        System.out.print("Short = " );
        float answerShort = input.nextFloat();
        if (answerShort == 2) {
            System.out.println("Rätt");
            numberOfCorrectAnswers2 = numberOfCorrectAnswers2 + 1;
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
            numberOfCorrectAnswers2 = numberOfCorrectAnswers2 + 1;
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
            numberOfCorrectAnswers2 = numberOfCorrectAnswers2 + 1;
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
            numberOfCorrectAnswers2 = numberOfCorrectAnswers2 + 1;
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
            numberOfCorrectAnswers2 = numberOfCorrectAnswers2 + 1;
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
            numberOfCorrectAnswers2 = numberOfCorrectAnswers2 + 1;
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
            numberOfCorrectAnswers2 = numberOfCorrectAnswers2 + 1;
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
            numberOfCorrectAnswers2 = numberOfCorrectAnswers2 + 1;
        }
        else {
            System.out.println("Fel!");
            System.out.println("Rätt svar är 2 byte");
        }

        System.out.println();
        System.out.println("Bra jobbat!");
        System.out.println("Du fick i denna del" + numberOfCorrectAnswers2 + " rätt (" + numberOfCorrectAnswers + "/8)");
        System.out.println();
        int totalcorrect = numberOfCorrectAnswers + numberOfCorrectAnswers2;
        System.out.println("Du fick totalt" + totalcorrect + "rätt (" + totalcorrect + "/13");
    }

    /*static void looptest() {
        // Create an array
        Integer[] array = new Integer[]{1, 2, 3, 4};

        Integer.add("ok");
        //int[] array = new int[]{1, 2, 3, 4}; //does not work

        // Shuffle the elements in the array
        List<Integer> l = Arrays.asList(array);
        System.out.println(l);

        Collections.shuffle(l);

        System.out.println(l);
    }*/

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