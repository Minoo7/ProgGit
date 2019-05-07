import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class KURSPROV_VINCENT_GARBRANT {
    static Scanner input = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        System.out.println(minstaHeltal(new int[]{1,2,4,99})); // Ange vilket tal som helst i listan.
        System.out.println(volymAvPyramid(1,1));   // Först anges pyramidens sida, sedan dens höjd.
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
        boolean game = true;
        int poäng = 0;
        int A;
        int B;
        char op;
        String svar;
        int talSvar;
        long time = (System.currentTimeMillis());

        while (game) { // När spelete är igång
            A = random.nextInt(20)-10; // slumpvist nummer mellan -10 och 10
            B = random.nextInt(20)-10; // slumpvist nummer mellan -10 och 10
            op = operator[random.nextInt(3)]; // slumpvist operator
            System.out.println("Vad blir: " + A + " " + op + " " + B); // Frågar användaren
            svar = input.nextLine(); // Användarens svar

            try {
                switch (op) {
                    case('+'):
                        if (svar.equals("STOPP")) {
                            System.out.println("Spelet avslutas");
                            game = false;
                            break;
                        }
                        talSvar = Integer.parseInt(svar);
                        if (talSvar == ((A) + (B))) {
                            poäng++;
                            if (poäng == 20) {
                                System.out.println("Grattis!\nDu har 20 poäng och har vunnit spelet!");
                                System.out.println("Det tog dig" + AvrundadeSekunder(time) + " sekunder att vinna spelet");
                                game = false;
                                break;
                            }
                            else {
                                System.out.println("Bra jobbat!");
                            }
                        }
                        else {
                            System.out.println("Fel svar");
                            poäng--;
                        }
                        System.out.println("Du har nu " + poäng + " poäng");
                        break;
                    case('-'):
                        if (svar.equals("STOPP")) {
                            System.out.println("Spelet avslutas");
                            game = false;
                            break;
                        }
                        talSvar = Integer.parseInt(svar);
                        if (talSvar == ((A) - (B))) {
                            poäng++;
                            if (poäng == 20) {
                                System.out.println("Grattis!\nDu har 20 poäng och har vunnit spelet!");
                                System.out.println("Det tog dig" + AvrundadeSekunder(time) + " sekunder att vinna spelet");
                                game = false;
                                break;
                            }
                            else {
                                System.out.println("Bra jobbat!");
                            }
                        }
                        else {
                            System.out.println("Fel svar");
                            poäng--;
                        }
                        System.out.println("Du har nu " + poäng + " poäng");
                        break;
                    case('*'):
                        if (svar.equals("STOPP")) {
                            System.out.println("Spelet avslutas");
                            game = false;
                            break;
                        }
                        talSvar = Integer.parseInt(svar);
                        if (talSvar == ((A) * (B))) {
                            poäng++;
                            if (poäng == 20) {
                                System.out.println("Grattis!\nDu har 20 poäng och har vunnit spelet!");
                                System.out.println("Det tog dig" + AvrundadeSekunder(time) + " sekunder att vinna spelet");
                                game = false;
                                break;
                            }
                            else {
                                System.out.println("Bra jobbat!");
                            }
                        }
                        else {
                            System.out.println("Fel svar");
                            poäng--;
                        }
                        System.out.println("Du har nu " + poäng + " poäng");
                        break;
                }
            }
            catch (NumberFormatException error) {
                System.err.println("Ogiltligt svar, försök igen\t(Kom ihåg, svaret ska vara en sifra eller stopp!");
            }
        }
    }

    static String AvrundadeSekunder(long time) {
        String timeFinalInSek = "";
        boolean timeDone = false;
        ArrayList<Character> timeFinal = new ArrayList<>();
        int i = -1;
        String timesek = Double.toString(((System.currentTimeMillis()/1000.0)-(time/1000.0)));
        while (!timeDone) {
            i++;
            if (timesek.charAt(i) == '.') {
                timeFinal.add(timesek.charAt(i));
                timeFinal.add(timesek.charAt(i+1));
                timeDone = true;
            }
            else {
                timeFinal.add(timesek.charAt(i));
            }
        }
        for (int j = 0; j < timeFinal.size(); j++) {
            timeFinalInSek += timeFinal.get(j);
        }
        return timeFinalInSek;
    }
}
