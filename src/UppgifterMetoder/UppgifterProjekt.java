package UppgifterMetoder;

import javafx.util.converter.CharacterStringConverter;

import java.util.ArrayList;
import java.util.Scanner;

public class UppgifterProjekt {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        TreIRad();
    }
    public static void TreIRad() {
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
        switch (val) {
            case (1):
                System.out.println("Du spelar mot datorn");
                break;
            case (2):
                System.out.println("Du spelar mot en annan användare");
                System.out.println("Ange koordinaterna till din markering,  Ex: 2,1 = 2 upp från 0, 1 till höger av 0");
                String plan = ("_" + _2_0 + "_|_" + _2_1 + "_|_" + _2_2 + "_\n" +
                               "_" + _1_0 + "_|_" + _1_1 + "_|_" + _1_2 + "_\n" +
                               " " + _0_0 + " | " + _0_1 + " | " + _0_2 + " \n");
                boolean goOn = true;
                boolean win = false;
                while (win == false) {
                    goOn = true;
                    System.out.println(plan);
                    String P1 = input.next();
                    switch (P1) {
                        case("0,0"): if(_0_0 == ' '){_0_0 = 'X';} else{System.out.println("Det finns redan en pjäs där");goOn = false;} break;
                        case("0,1"): if(_0_1 == ' '){_0_1 = 'X';} else{System.out.println("Det finns redan en pjäs där");goOn = false;} break;
                        case("0,2"): if(_0_2 == ' '){_0_2 = 'X';} else{System.out.println("Det finns redan en pjäs där");goOn = false;} break;
                        case("1,0"): if(_1_0 == '_'){_1_0 = 'X';} else{System.out.println("Det finns redan en pjäs där");goOn = false;} break;
                        case("1,1"): if(_1_1 == '_'){_1_1 = 'X';} else{System.out.println("Det finns redan en pjäs där");goOn = false;} break;
                        case("1,2"): if(_1_2 == '_'){_1_2 = 'X';} else{System.out.println("Det finns redan en pjäs där");goOn = false;} break;
                        case("2,0"): if(_2_0 == '_'){_2_0 = 'X';} else{System.out.println("Det finns redan en pjäs där");goOn = false;} break;
                        case("2,1"): if(_2_1 == '_'){_2_1 = 'X';} else{System.out.println("Det finns redan en pjäs där");goOn = false;} break;
                        case("2,2"): if(_2_2 == '_'){_2_2 = 'X';} else{System.out.println("Det finns redan en pjäs där");goOn = false;} break;
                    }
                    if (goOn == true) {
                        plan = ("_" + _2_0 + "_|_" + _2_1 + "_|_" + _2_2 + "_\n" + "_" + _1_0 + "_|_" + _1_1 + "_|_" + _1_2 + "_\n" + " " + _0_0 + " | " + _0_1 + " | " + _0_2 + " \n");
                        System.out.println(plan);
                        if (/*Horisontella rader*/ (_0_0 == 'X' && _0_1 == 'X' && _0_2 == 'X')  || (_1_0 == 'X' && _1_1 == 'X' && _1_2 == 'X') || (_2_0 == 'X' && _2_1 == 'X' && _2_2 == 'X') || /*Vertikala rader*/ (_0_0 == 'X' && _1_0 == 'X' && _2_0 == 'X') || (_0_1 == 'X' && _1_1 == 'X' && _2_1 == 'X') || (_0_2 == 'X' && _1_2 == 'X' && _2_2 == 'X') || /*Diagonala*/ (_0_0 == 'X' && _1_1 == 'X' && _2_2 == 'X') || (_0_2 == 'X' && _1_1 == 'X' && _2_0 == 'X')) {
                            win = true;
                        }
                        String P2 = input.next();
                        // lägg till while
                        switch (P2) {
                            case("0,0"): _0_0 = 'O'; break;
                            case("0,1"): _0_1 = 'O'; break;
                            case("0,2"): _0_2 = 'O'; break;
                            case("1,0"): _1_0 = 'O'; break;
                            case("1,1"): _1_1 = 'O'; break;
                            case("1,2"): _1_2 = 'O'; break;
                            case("2,0"): _2_0 = 'O'; break;
                            case("2,1"): _2_1 = 'O'; break;
                            case("2,2"): _2_2 = 'O'; break;
                        }
                        if (/*Horisontella rader*/ (_0_0 == 'O' && _0_1 == 'O' && _0_2 == 'O')  || (_1_0 == 'O' && _1_1 == 'O' && _1_2 == 'O') || (_2_0 == 'O' && _2_1 == 'O' && _2_2 == 'O') || /*Vertikala rader*/ (_0_0 == 'O' && _1_0 == 'O' && _2_0 == 'O') || (_0_1 == 'O' && _1_1 == 'O' && _2_1 == 'O') || (_0_2 == 'O' && _1_2 == 'O' && _2_2 == 'O') || /*Diagonala*/ (_0_0 == 'O' && _1_1 == 'O' && _2_2 == 'O') || (_0_2 == 'O' && _1_1 == 'O' && _2_0 == 'O')) {
                            win = true;
                        }
                        plan = ("_" + _2_0 + "_|_" + _2_1 + "_|_" + _2_2 + "_\n" + "_" + _1_0 + "_|_" + _1_1 + "_|_" + _1_2 + "_\n" + " " + _0_0 + " | " + _0_1 + " | " + _0_2 + " \n");
                        System.out.println(plan);
                    }
                }
            break;
        }
    }
}
