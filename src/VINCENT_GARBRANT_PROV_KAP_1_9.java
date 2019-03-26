import java.util.Scanner;

public class VINCENT_GARBRANT_PROV_KAP_1_9 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //uppgift1_4poäng();
        //uppgift2_4poäng();
        //uppgift3_4poäng();
        uppgift4_4poäng();
        //uppgift5_6poäng();
        uppgift6_6poäng();
        uppgift7_8poäng();
    }


    private static void uppgift1_4poäng() {
    /*
        UPPGIFT 1: Är talet delbart med?                                            4 POÄNG
        Fråga användaren efter två tal, t1 och t2. t1 står för tal och t2 står för delare.
        Skapa en metod static boolean ärTalDelbartMed(int tal, int delare) som givet ett tal och en delare
        returnerar true om tal är jämnt delbart med delare och false om tal inte är jämnt delbart med delare.
        Anropa din nyligen skapade metod och skriv en informerande text som anger om talet som användaren skrev in
        är delbart med eller inte delbart med den delare som användaren skrev in.
        Körexempel:
        Skriv in ett tal, tack:
        125
        Skriv in en delare, tack:
        5
        125 är jämnt delbart med 5.
     */
    }

    private static void uppgift2_4poäng() {
    /*
        UPPGIFT 2: Skriva ut en given sekvens                                       4 POÄNG
        Använd någon typ av loop för att skriva ut följande:
        22 24 26 28.0 32 34 36 38.0 42 44 46 48.0 FEMTIO 52 54 56 58.0 62
     */
    }

    private static void uppgift3_4poäng() {
    /*
        UPPGIFT 3: Beräkning av summan och medelvärdet i en lista                   4 POÄNG
        Fråga användaren hur många tal som ska skapas.
        Skapa en lista med anbefallt antal heltal.
        Skapa en metod static int summaAvTal(int[] lista) som beräknar summan av alla tal i en lista.
        Anropa metoden summaAvTal(int[] lista) med din lista som parameter och skriv ut summan.
        Skapa en metod static int medelvärde(int[] lista) som beräknar medelvärdet av alla tal i en lista.
        Anropa metoden medelvärde(int[] lista) med din lista som parameter och skriv ut medelvärdet.
     */
    }

    private static void uppgift4_4poäng() {
    /*
        UPPGIFT 4: Beräkna tecken i sträng                                          4 POÄNG
        Skapa en metod med lämpligt metodnamn som tar två parametrar; en sträng text och ett tecken tecken.
        Metoden ska returnera produkten av antal gånger som tecken förekommer i text och
        antal gånger som tecknet ‘s’ finns i text.
        Exempel:
        Parametrarna text = “stina sopar skorpsmulor” och tecken = ‘p’ ska returnera 8 eftersom det finns 4 st ‘p’ och 2 st ‘s’. 4*2 = 8.
     */

        System.out.println("Beräkning av produkten av hur många gånger ett valt tecken gånger tecknet 's' finns i en vald text\n");
        System.out.println("Skriv in text:");
        String text = input.nextLine(); //Behåller den inskrivna texten som egen variabel så vid utskrivning står det precis hur användaren hade skrivit in det (alltså inte stora bokstäver);
        System.out.println("Skriv in tecknet du vill använda");
        System.out.print("Tecken: ");
        char t = input.next().charAt(0); //Valt tecken
        char s = 's'; //Gör tecken till uppercase så att matchning ej visar fel vid olika storlek på tecknena
        System.out.println("I texten \"" + text + "\" " + "så dyker tecknet: " + t + " upp " + AntalGångerTecken_1_DykerUppISträng(text, t) + " gånger och tecknet: s " + AntalGångerTecken_S_DykerUppISträng(text, s) + " gånger");
        System.out.println("Produkten av dessa antal är = " + produktAvTeckenISträng(text, t, s));
    }

    static int produktAvTeckenISträng(String text, char t, char s) {
        text = text.toUpperCase(); //Skapar ny variabel med stora bokstäver för bättre uträkning så även stora och små bokstäver visas som antal gånger det tecknet dyker upp i texten (Gör texten till uppercase så att matchning ej visar fel vid olika storlek på tecknena)
        t = Character.toUpperCase(t); //Gör tecken till uppercase så att matchning ej visar fel vid olika storlek på tecknena
        s = Character.toUpperCase(s); //Gör tecken till uppercase så att matchning ej visar fel vid olika storlek på tecknena
        int antal_t = AntalGångerTecken_1_DykerUppISträng(text, t);
        int antal_s = AntalGångerTecken_S_DykerUppISträng(text, s);
        int produkt = antal_t * antal_s;
        return produkt;
    }

    static int AntalGångerTecken_1_DykerUppISträng(String text, char t) { //Gör separat metod för att räkna ut hur många gånger det valda tecknet dyker upp i texten för att få finare utskrift på uppgift metoden där det även skrivs ut hur många gånger tecknet faktiskt dyker upp i strängen
        t = Character.toUpperCase(t); //Gör tecken till uppercase så att matchning ej visar fel vid olika storlek på tecknena
        int antal_t = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == t) {
                antal_t++;
            }
        }
        return antal_t;
    }
    static int AntalGångerTecken_S_DykerUppISträng(String text, char s) { //Gör separat metod för att räkna ut hur många gånger tecknet 's' dyker upp i texten för att få finare utskrift på uppgift metoden där det även skrivs ut hur många gånger tecknet faktiskt dyker upp i strängen
        s = Character.toUpperCase(s); //Gör tecken till uppercase så att matchning ej visar fel vid olika storlek på tecknena
        int antal_s = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == s) {
                antal_s++;
            }
        }
        return antal_s;
    }

    private static void uppgift5_6poäng() {
    /*
        UPPGIFT 5: Simulering med tärning                                           6 POÄNG
        Beräkna, med hjälp av att simulera minst 10.000 försök,
        sannolikheten att få exakt 3 sexor när du kastar 5 st åttasidiga tärningar.
     */
        /*for (int i = 0; i < 10000; i++) {
            for (int j = 0; j < 5; j++) {

            }
        }*/
    }

    private static void uppgift6_6poäng() {
    /*
        UPPGIFT 6:  Rövarspråket                                                    6 POÄNG
        Skapa en metod static String rövarSpråk(String text) som tar en sträng som parameter och
        som returnerar strängen skriven i rövarspråket.
        Regeln för rövarspråket är att man efter varje konsonant lägger ett ‘o’ och därefter samma konsonant igen.
        Till exempel byts b ut mot "bob" och f mot "fof". Vokalerna är oförändrade.
        "Jag talar rövarspråket" blir alltså "jojagog totalolaror rorövovarorsospoproråkoketot".
        Bokstäverna a, e, i, o, u, y, å, ä, ö är vokaler.
        Konsonanter är alla bokstäver som inte är vokaler.
     */

        System.out.println("Konvertering av text till texten på rövarspråket");
        System.out.println("Skriv in din text du vill konvertera");
        String text = input.nextLine();
        System.out.println("Din text på rövarspråket:\n" + rövarSpråk(text));
    }

    static String rövarSpråk(String text) {
        String textIRövar = "";
        for (int i = 0; i < text.length(); i++) { // Varje bokstav checkas
            char k = text.charAt(i); // k = bokstaven
            textIRövar += kollaOmKonsonant(k); // bokstaven checkas
        }
        return textIRövar;
    }

    static String kollaOmKonsonant(char k) {
        int antal_k = 0;
        String kok = Character.toString(k);
        char[] konsonanter = new char[]{'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'x', 'z', 'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'X', 'Z'};
        for (int i = 0; i < konsonanter.length; i++ ) {
            if (k == konsonanter[i]) {
                antal_k++;
                kok = k + "o" + Character.toLowerCase(k);
            }
        }
        return kok;
    }

    private static void uppgift7_8poäng() {
    /*
        UPPGIFT 7: Skriv ut Java-klass                                              8 POÄNG
        Skriv en metod med signaturen static void skrivUtKlass(String paketNamn, String klassNamn, String[] metodNamn, String[] variabler)
        som ska skriva ut källkoden till en Java-klass.
        Följande kod med anrop bör ge utskriften nedan:
        String[] metoder = new String[] {“kvadrera”, “derivera”};
        String[] variabler = new String[]{“variabel1”, “variabel2”};
        skrivUtKlass(“mattehörnan”, “Matte”, metoder, variabler);
        UTSKRIFT:
        package mattehörnan;
        public class Matte{
            static int variabel1 = 4;  // Det här är en variabel av typen int.
            static int variabel2 = 8; // Det här är en variabel av typen in.
        public static void main(String[] argZ){}
            // Den här metoden har returtypen void
            static void kvadrera(){}
            // Den här metoden har returtypen void
            static void derivera(){}
        }
        OBSERVERA:
        * Samtliga metoder i klassfilen ska vara void och inte ha några parametrar.
        * Samtliga variabler är av typen int och har slumpvisa värden mellan 1 och 10.
        * Klassen ska ha en main-metod.
     */

        String[] metoder = new String[] {"kvadrera", "derivera", "test"}; // Kan skrivas vilka namn som helst och hur många som helst
        String[] variabler = new String[]{"variabel1", "variabel2", "variabel3"}; // Kan skrivas vilka namn som helst och hur många som helst
        skrivUtKlass("mattehörnan", "Matte", metoder, variabler);

    }

    static void skrivUtKlass(String paketNamn, String klassNamn, String[] metodNamn, String[] variabler) {
        System.out.println("package " + paketNamn+";");
        System.out.println("public class " + klassNamn+"{");
        for (int i = 0; i < variabler.length; i++) {
            System.out.println("\tstatic int " + variabler[i] + " = " + Math.random() + ";  // Det här är en variabel av typen int.");
        }
        System.out.println("\tpublic static void main(String[] argZ){}");
        for (int i = 0; i < metodNamn.length; i++) {
            System.out.println("\t\t// Den här metoden har returtypen void");
            System.out.println("\t\tstatic void  "+ metodNamn[i] + "(){}");
        }
        System.out.println("}");
    }
}
