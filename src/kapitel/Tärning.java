package kapitel;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;


public class Tärning{

    public static void main(String[] args) {
        System.out.println(kasta());
    }

    private static int sidor = 6;

    /*public static Tärning(){
        sidor=6;
    }

    public Tärning(int sidor){
        this.sidor=sidor;
    }*/

    public static int kasta(){
        return (int)(Math.random()*sidor+1);
    }

}