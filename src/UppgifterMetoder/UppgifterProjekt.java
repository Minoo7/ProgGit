package UppgifterMetoder;

import javafx.util.converter.CharacterStringConverter;
import java.util.Random;

import java.util.ArrayList;
import java.util.Scanner;

public class UppgifterProjekt {
    static Scanner input = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        //TreIRad();
        Miniräknare();
    }
    public static void TreIRad() {
        /*ArrayList<Character> replace = new ArrayList<>();
        replace.add(' ');
        System.out.println(replace.get(0));*/
        char _0_0 = ' ';
        char _0_1 = ' ';
        char _0_2 = ' ';
        char _1_0 = '_';
        char _1_1 = '_';
        char _1_2 = '_';
        char _2_0 = '_';
        char _2_1 = '_';
        char _2_2 = '_';
        System.out.println("Vill du spela mot datorn [1] eller mot annan spelare [2]?");
        int val = input.nextInt();
        if (val == 1) {
            System.out.println("Du spelar mot en datorn");
            System.out.println("Ange koordinaterna till din markering,  Ex: 2,1 = 2 upp från 0, 1 till höger av 0");
            String plan = ("_" + _2_0 + "_|_" + _2_1 + "_|_" + _2_2 + "_\n" +
                           "_" + _1_0 + "_|_" + _1_1 + "_|_" + _1_2 + "_\n" +
                           " " + _0_0 + " | " + _0_1 + " | " + _0_2 + " \n");
            System.out.println(plan);
            boolean ProperAnswer = false;
            boolean goOn;
            boolean goOn2 = true;
            boolean found_P1;
            boolean found_PC;
            boolean win = false;
            String PC = "";
            while (!win) {
                goOn = true;
                if (goOn2) {
                    found_P1 = false;
                    System.out.print("P1: ");
                    String P1 = input.next();

                    if (P1.equals("0,0")){found_P1 = true; if (_0_0 == ' '){_0_0 = 'X';} else{System.out.println("Det finns antigen redan en pjäs där eller så har du angivit en ogiltig koordinat");goOn = false;}}
                    if (P1.equals("0,1")){found_P1 = true; if (_0_1 == ' '){_0_1 = 'X';} else{System.out.println("Det finns antigen redan en pjäs där eller så har du angivit en ogiltig koordinat");goOn = false;}}
                    if (P1.equals("0,2")){found_P1 = true; if (_0_2 == ' '){_0_2 = 'X';} else{System.out.println("Det finns antigen redan en pjäs där eller så har du angivit en ogiltig koordinat");goOn = false;}}
                    if (P1.equals("1,0")){found_P1 = true; if (_1_0 == '_'){_1_0 = 'X';} else{System.out.println("Det finns antigen redan en pjäs där eller så har du angivit en ogiltig koordinat");goOn = false;}}
                    if (P1.equals("1,1")){found_P1 = true; if (_1_1 == '_'){_1_1 = 'X';} else{System.out.println("Det finns antigen redan en pjäs där eller så har du angivit en ogiltig koordinat");goOn = false;}}
                    if (P1.equals("1,2")){found_P1 = true; if (_1_2 == '_'){_1_2 = 'X';} else{System.out.println("Det finns antigen redan en pjäs där eller så har du angivit en ogiltig koordinat");goOn = false;}}
                    if (P1.equals("2,0")){found_P1 = true; if (_2_0 == '_'){_2_0 = 'X';} else{System.out.println("Det finns antigen redan en pjäs där eller så har du angivit en ogiltig koordinat");goOn = false;}}
                    if (P1.equals("2,1")){found_P1 = true; if (_2_1 == '_'){_2_1 = 'X';} else{System.out.println("Det finns antigen redan en pjäs där eller så har du angivit en ogiltig koordinat");goOn = false;}}
                    if (P1.equals("2,2")){found_P1 = true; if (_2_2 == '_'){_2_2 = 'X';} else{System.out.println("Det finns antigen redan en pjäs där eller så har du angivit en ogiltig koordinat");goOn = false;}}

                    if (!found_P1) {
                        System.out.println("Du har anget en ogiltlig koordinat\tKom ihåg ex: 2,1 = 2 upp från 0, 1 till höger av 0");
                        goOn = false;
                    }
                    else {
                        plan = ("_" + _2_0 + "_|_" + _2_1 + "_|_" + _2_2 + "_\n" + "_" + _1_0 + "_|_" + _1_1 + "_|_" + _1_2 + "_\n" + " " + _0_0 + " | " + _0_1 + " | " + _0_2 + " \n");
                        System.out.println(plan);
                    }
                }
                if (goOn) {
                    found_PC = false;
                    goOn2 = true;
                    if (/*Horisontella rader*/ (_0_0 == 'X' && _0_1 == 'X' && _0_2 == 'X')  || (_1_0 == 'X' && _1_1 == 'X' && _1_2 == 'X') || (_2_0 == 'X' && _2_1 == 'X' && _2_2 == 'X') || /*Vertikala rader*/ (_0_0 == 'X' && _1_0 == 'X' && _2_0 == 'X') || (_0_1 == 'X' && _1_1 == 'X' && _2_1 == 'X') || (_0_2 == 'X' && _1_2 == 'X' && _2_2 == 'X') || /*Diagonala*/ (_0_0 == 'X' && _1_1 == 'X' && _2_2 == 'X') || (_0_2 == 'X' && _1_1 == 'X' && _2_0 == 'X')) {
                        System.out.println("Spelare 1 vann!!");
                        win = true;
                    }
                    else {
                        while(!found_PC) {
                            PC = random.nextInt(3)+","+random.nextInt(3);
                            if (PC.equals("0,1") && (_0_1 == ' ')){_0_1 = 'O';found_PC = true;}
                            if (PC.equals("0,2") && (_0_2 == ' ')){_0_2 = 'O';found_PC = true;}
                            if (PC.equals("1,0") && (_1_0 == '_')){_1_0 = 'O';found_PC = true;}
                            if (PC.equals("1,1") && (_1_1 == '_')){_1_1 = 'O';found_PC = true;}
                            if (PC.equals("1,2") && (_1_2 == '_')){_1_2 = 'O';found_PC = true;}
                            if (PC.equals("2,0") && (_2_0 == '_')){_2_0 = 'O';found_PC = true;}
                            if (PC.equals("2,1") && (_2_1 == '_')){_2_1 = 'O';found_PC = true;}
                            if (PC.equals("2,2") && (_2_2 == '_')){_2_2 = 'O';found_PC = true;}
                        }
                        System.out.println("PC: " + PC);

                        plan = ("_" + _2_0 + "_|_" + _2_1 + "_|_" + _2_2 + "_\n" + "_" + _1_0 + "_|_" + _1_1 + "_|_" + _1_2 + "_\n" + " " + _0_0 + " | " + _0_1 + " | " + _0_2 + " \n");
                        System.out.println(plan);

                        if (/*Horisontella rader*/ (_0_0 == 'O' && _0_1 == 'O' && _0_2 == 'O')  || (_1_0 == 'O' && _1_1 == 'O' && _1_2 == 'O') || (_2_0 == 'O' && _2_1 == 'O' && _2_2 == 'O') || /*Vertikala rader*/ (_0_0 == 'O' && _1_0 == 'O' && _2_0 == 'O') || (_0_1 == 'O' && _1_1 == 'O' && _2_1 == 'O') || (_0_2 == 'O' && _1_2 == 'O' && _2_2 == 'O') || /*Diagonala*/ (_0_0 == 'O' && _1_1 == 'O' && _2_2 == 'O') || (_0_2 == 'O' && _1_1 == 'O' && _2_0 == 'O')) {
                            System.out.println("Datorn vann!");
                            win = true;
                        }
                    }
                }
            }
        }
        if (val == 2) {
            System.out.println("Du spelar mot en annan användare");
            System.out.println("Ange koordinaterna till din markering,  Ex: 2,1 = 2 upp från 0, 1 till höger av 0");
            String plan = ("_" + _2_0 + "_|_" + _2_1 + "_|_" + _2_2 + "_\n" +
                               "_" + _1_0 + "_|_" + _1_1 + "_|_" + _1_2 + "_\n" +
                               " " + _0_0 + " | " + _0_1 + " | " + _0_2 + " \n");
            System.out.println(plan);
            boolean goOn = true;
            boolean goOn2 = true;
            boolean found_P1 = false;
            boolean found_P2 = false;
            boolean win = false;
            while (!win) {
                goOn = true;
                if (goOn2) {
                    found_P1 = false;
                    System.out.print("P1: ");
                    String P1 = input.next();

                    if (P1.equals("0,0")){found_P1 = true; if (_0_0 == ' '){_0_0 = 'X';} else{System.out.println("Det finns antigen redan en pjäs där eller så har du angivit en ogiltig koordinat");goOn = false;}}
                    if (P1.equals("0,1")){found_P1 = true; if (_0_1 == ' '){_0_1 = 'X';} else{System.out.println("Det finns antigen redan en pjäs där eller så har du angivit en ogiltig koordinat");goOn = false;}}
                    if (P1.equals("0,2")){found_P1 = true; if (_0_2 == ' '){_0_2 = 'X';} else{System.out.println("Det finns antigen redan en pjäs där eller så har du angivit en ogiltig koordinat");goOn = false;}}
                    if (P1.equals("1,0")){found_P1 = true; if (_1_0 == '_'){_1_0 = 'X';} else{System.out.println("Det finns antigen redan en pjäs där eller så har du angivit en ogiltig koordinat");goOn = false;}}
                    if (P1.equals("1,1")){found_P1 = true; if (_1_1 == '_'){_1_1 = 'X';} else{System.out.println("Det finns antigen redan en pjäs där eller så har du angivit en ogiltig koordinat");goOn = false;}}
                    if (P1.equals("1,2")){found_P1 = true; if (_1_2 == '_'){_1_2 = 'X';} else{System.out.println("Det finns antigen redan en pjäs där eller så har du angivit en ogiltig koordinat");goOn = false;}}
                    if (P1.equals("2,0")){found_P1 = true; if (_2_0 == '_'){_2_0 = 'X';} else{System.out.println("Det finns antigen redan en pjäs där eller så har du angivit en ogiltig koordinat");goOn = false;}}
                    if (P1.equals("2,1")){found_P1 = true; if (_2_1 == '_'){_2_1 = 'X';} else{System.out.println("Det finns antigen redan en pjäs där eller så har du angivit en ogiltig koordinat");goOn = false;}}
                    if (P1.equals("2,2")){found_P1 = true; if (_2_2 == '_'){_2_2 = 'X';} else{System.out.println("Det finns antigen redan en pjäs där eller så har du angivit en ogiltig koordinat");goOn = false;}}

                    if (!found_P1) {
                        System.out.println("Du har anget en ogiltlig koordinat\tKom ihåg ex: 2,1 = 2 upp från 0, 1 till höger av 0");
                        goOn = false;
                    }
                    else {
                        plan = ("_" + _2_0 + "_|_" + _2_1 + "_|_" + _2_2 + "_\n" + "_" + _1_0 + "_|_" + _1_1 + "_|_" + _1_2 + "_\n" + " " + _0_0 + " | " + _0_1 + " | " + _0_2 + " \n");
                        System.out.println(plan);
                    }
                }
                if (goOn) {
                    goOn2 = true;
                    if (/*Horisontella rader*/ (_0_0 == 'X' && _0_1 == 'X' && _0_2 == 'X')  || (_1_0 == 'X' && _1_1 == 'X' && _1_2 == 'X') || (_2_0 == 'X' && _2_1 == 'X' && _2_2 == 'X') || /*Vertikala rader*/ (_0_0 == 'X' && _1_0 == 'X' && _2_0 == 'X') || (_0_1 == 'X' && _1_1 == 'X' && _2_1 == 'X') || (_0_2 == 'X' && _1_2 == 'X' && _2_2 == 'X') || /*Diagonala*/ (_0_0 == 'X' && _1_1 == 'X' && _2_2 == 'X') || (_0_2 == 'X' && _1_1 == 'X' && _2_0 == 'X')) {
                        System.out.println("Spelare 1 vann!!");
                        win = true;
                    }
                    else {
                        System.out.print("P2: ");
                        String P2 = input.next();
                        if (P2.equals("0,0")){found_P2 = true; if (_0_0 == ' '){_0_0 = 'O';} else{System.out.println("Det finns antigen redan en pjäs där eller så har du angivit en ogiltig koordinat");goOn = false;}}
                        if (P2.equals("0,1")){found_P2 = true; if (_0_1 == ' '){_0_1 = 'O';} else{System.out.println("Det finns antigen redan en pjäs där eller så har du angivit en ogiltig koordinat");goOn = false;}}
                        if (P2.equals("0,2")){found_P2 = true; if (_0_2 == ' '){_0_2 = 'O';} else{System.out.println("Det finns antigen redan en pjäs där eller så har du angivit en ogiltig koordinat");goOn = false;}}
                        if (P2.equals("1,0")){found_P2 = true; if (_1_0 == '_'){_1_0 = 'O';} else{System.out.println("Det finns antigen redan en pjäs där eller så har du angivit en ogiltig koordinat");goOn = false;}}
                        if (P2.equals("1,1")){found_P2 = true; if (_1_1 == '_'){_1_1 = 'O';} else{System.out.println("Det finns antigen redan en pjäs där eller så har du angivit en ogiltig koordinat");goOn = false;}}
                        if (P2.equals("1,2")){found_P2 = true; if (_1_2 == '_'){_1_2 = 'O';} else{System.out.println("Det finns antigen redan en pjäs där eller så har du angivit en ogiltig koordinat");goOn = false;}}
                        if (P2.equals("2,0")){found_P2 = true; if (_2_0 == '_'){_2_0 = 'O';} else{System.out.println("Det finns antigen redan en pjäs där eller så har du angivit en ogiltig koordinat");goOn = false;}}
                        if (P2.equals("2,1")){found_P2 = true; if (_2_1 == '_'){_2_1 = 'O';} else{System.out.println("Det finns antigen redan en pjäs där eller så har du angivit en ogiltig koordinat");goOn = false;}}
                        if (P2.equals("2,2")){found_P2 = true; if (_2_2 == '_'){_2_2 = 'O';} else{System.out.println("Det finns antigen redan en pjäs där eller så har du angivit en ogiltig koordinat");goOn = false;}}

                        if (!found_P2) {
                            System.out.println("Du har anget en ogiltlig koordinat\tKom ihåg ex: 2,1 = 2 upp från 0, 1 till höger av 0");
                            goOn2 = false;
                        }
                        else {
                            plan = ("_" + _2_0 + "_|_" + _2_1 + "_|_" + _2_2 + "_\n" + "_" + _1_0 + "_|_" + _1_1 + "_|_" + _1_2 + "_\n" + " " + _0_0 + " | " + _0_1 + " | " + _0_2 + " \n");
                            System.out.println(plan);
                        }

                        if (/*Horisontella rader*/ (_0_0 == 'O' && _0_1 == 'O' && _0_2 == 'O')  || (_1_0 == 'O' && _1_1 == 'O' && _1_2 == 'O') || (_2_0 == 'O' && _2_1 == 'O' && _2_2 == 'O') || /*Vertikala rader*/ (_0_0 == 'O' && _1_0 == 'O' && _2_0 == 'O') || (_0_1 == 'O' && _1_1 == 'O' && _2_1 == 'O') || (_0_2 == 'O' && _1_2 == 'O' && _2_2 == 'O') || /*Diagonala*/ (_0_0 == 'O' && _1_1 == 'O' && _2_2 == 'O') || (_0_2 == 'O' && _1_1 == 'O' && _2_0 == 'O')) {
                            System.out.println("Spelare 2 vann!");
                            win = true;
                        }
                    }
                }
            }
        }
    }

    public static void Miniräknare() {
        System.out.println("MINIRÄKNARE:");
        String svar = input.next();
        boolean found = false;
        ArrayList<Character> number1 = new ArrayList<>();
        ArrayList<Character> number2 = new ArrayList<>();
        for (int i = 0; i < svar.length(); i++) {
            //found = false;
            if (svar.charAt(i) == '+') {found = true;}
            if (svar.charAt(i) == '-') {found = true;}
            if (svar.charAt(i) == '*') {found = true;}
            if (svar.charAt(i) == '/') {found = true;}
            if (svar.charAt(i) == '%') {found = true;}
            if (!found) {
                number1.add(svar.charAt(i));
            }
            //number1 = number1.split("[], ");
            //if (found) {
            //    number2.set(i,svar.charAt(i+1));
            //}
        }
        System.out.println(number1);

        /*int a = svar.indexOf('+');
        if (!(svar.indexOf('+') == -1)) {
            System.out.println(svar.indexOf('+'));
        }*/
    }
}
