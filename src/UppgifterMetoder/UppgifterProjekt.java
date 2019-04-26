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
        System.out.println("Vill du spela mot datorn [1] eller mot annan spelare [2]?");
        int val = input.nextInt();
        switch (val) {
            case (1):
                System.out.println("Du spelar mot datorn");
                break;
            case (2):
                System.out.println("Du spelar mot en annan användare");
                System.out.println("Ange koordinaterna till din markering,  Ex: 2,1 = 2 upp från 0, 1 till höger av 0");
                //System.out.println("_ _ _\n_ _ _\n_ _ _\n");
                System.out.println(
                        "___|___|___\n" +
                        "___|___|___\n" +
                        "   |   |\n");
                //ANVÄND SWITCH CASE ISTÄLLET FÖR IF DET ÄR DET VALET,     static void arrayListExempel() {
                //        System.out.println("ARRAYLIST EXEMPEL");
                //        // En arrayList är en dynamisk lista som kan ändra storlek.
                //        // Du kan enkelt lägga till och ta bort element från en arrayList med add(element) och remove(index)
                //        // Du kan även infoga ett element på ett visst index med add(index, element)
                //        ArrayList<Integer> arrayList = new ArrayList<>();
                //        arrayList.add(5);
                //        arrayList.add(7);
                //        arrayList.add(9);
                //        System.out.println(arrayList);
                //        arrayList.remove(0);
                //        System.out.println(arrayList);
                //        arrayList.add(11);
                //        System.out.println(arrayList);
                //        arrayList.add(1,100);
                //        System.out.println(arrayList);
                //
                //        for(int i = 0; i < arrayList.size(); i++){
                //            System.out.println(arrayList.get(i));
                //        }
                //        // Annan typ av syntax för att loopa över en samling.
                //        for(int i : arrayList) {
                //            System.out.println(i);
                //        }
                // ANVÄND DENNA SLAGS LOOP!
                char _0_0 = ' ';
                char _0_1 = ' ';
                char _0_2 = ' ';
                char _1_0 = '_';
                char _1_1 = '_';
                char _1_2 = '_';
                char _2_0 = '_';
                char _2_1 = '_';
                char _2_2 = '_';
                System.out.println("Spelare 1: ");
                String P1_1 = input.next();
                System.out.println(
                        "_"+_2_0+"_|_"+_2_1+"_|_"+_2_2+"_\n" +
                        "_"+_1_0+"_|_"+_1_1+"_|_"+_1_2+"_\n" +
                        " "+_0_0+" | "+_0_1+" | "+_0_2+" \n");
                System.out.println();
                break;
        }
    }
}
