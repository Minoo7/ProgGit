package kapitel;

import java.util.Scanner;

public class Prov {

    static final Scanner input = new Scanner (System.in);

    static final double PI = 3.14;

    public static void main(String[] args) {
        meny();
    }

    public static void meny() {
        boolean restart = true;
        while (restart == true) {

            System.out.println(
                "Vad vill du göra?\n" +
                "\n" +
                "[G]  Geometri\n" +
                "[A]  Algebra\n" +
                "[D]  Derivator\n" +
                "[S]  Statistik\n" +
                "[P]  Primtal\n"
            );

            char val = Character.toUpperCase(input.next().charAt(0));
            switch (val) {
                case ('G'): {
                    System.out.println(
                        "Vad vill du beräkna?\n" +
                        "\n" +
                        "[V] Volym\n" +
                        "[A] Area\n"
                    );
                    char val2 = Character.toUpperCase(input.next().charAt(0));
                    switch (val2) {
                        case ('V'): {
                            System.out.println(
                                "Vilken figur vill du beräkna Volymen för ?\n" +
                                "\n" +
                                "[C] Cylinder\n" +
                                "[R] Rätblock\n" +
                                "[S] Sfär"
                            );
                            char val3 = Character.toUpperCase(input.next().charAt(0));
                            switch (val3) {
                                case ('C'): {
                                    System.out.println(Suträkning(val2, val3));
                                    beräkning(val2, val3);
                                    break;
                                }
                                case ('R'): {
                                    System.out.println(Suträkning(val2, val3));
                                    beräkning(val2, val3);
                                    break;
                                }
                                case ('S'): {
                                    System.out.println(Suträkning(val2, val3));
                                    beräkning(val2, val3);
                                    break;
                                }
                            }
                            break;
                        }
                        case ('A'): {
                            System.out.println(
                                "Vilken figur vill du beräkna Arean för ?\n" +
                                "\n" +
                                "[C] Cylinder\n" +
                                "[R] Rätblock\n" +
                                "[S] Sfär"
                            );
                            char val3 = Character.toUpperCase(input.next().charAt(0));
                            switch (val3) {
                                case ('C'): {
                                    System.out.println(Suträkning(val2, val3));
                                    beräkning(val2, val3);
                                    break;
                                }
                                case ('R'): {
                                    System.out.println(Suträkning(val2, val3));
                                    beräkning(val2, val3);
                                    break;
                                }
                                case ('S'): {
                                    System.out.println(Suträkning(val2, val3));
                                    beräkning(val2, val3);
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    restart = promptR();
                    break;
                }
                case ('A'): {
                    System.out.println(
                        "Vilken operation vill du utföra?\n" +
                        "\n" +
                        "[+] Addition\n" +
                        "[-] Subtraktion\n" +
                        "[*] Multiplikation\n" +
                        "[%] Modulo\n"
                    );
                    char val2 = Character.toUpperCase(input.next().charAt(0));
                    switch (val2) {
                        case ('+'): {
                            System.out.println("Skriv in två tal");
                            System.out.print("tal 1: ");
                            int tal1 = input.nextInt();
                            System.out.print("tal 2: ");
                            int tal2 = input.nextInt();
                            System.out.println(tal1 + " + " + tal2 + " = " + (tal1+tal2));
                            break;
                        }
                        case ('-'): {
                            System.out.println("Skriv in två tal");
                            System.out.print("tal 1: ");
                            int tal1 = input.nextInt();
                            System.out.print("tal 2: ");
                            int tal2 = input.nextInt();
                            System.out.println(tal1 + " - " + tal2 + " = " + (tal1-tal2));
                            break;
                        }
                        case ('*'): {
                            System.out.println("Skriv in två tal");
                            System.out.print("tal 1: ");
                            int tal1 = input.nextInt();
                            System.out.print("tal 2: ");
                            int tal2 = input.nextInt();
                            System.out.println(tal1 + " * " + tal2 + " = " + (tal1*tal2));
                            break;
                        }
                        case ('%'): {
                            System.out.println("Skriv in två tal");
                            System.out.print("tal 1: ");
                            int tal1 = input.nextInt();
                            System.out.print("tal 2: ");
                            int tal2 = input.nextInt();
                            System.out.println(tal1 + " % " + tal2 + " = " + (tal1%tal2));
                            break;
                        }
                    }
                    restart = promptR();
                    break;
                }
                case ('D'): {
                    System.out.println("Skriv in formeln");
                    System.out.print("Formel: ");
                    double formel = input.nextDouble();

                }
            }
        }
    }

    public static String mätning(char val2) {
        String mätning = "";
        val2 = Character.toUpperCase(val2);
        switch (val2) {
            case ('V'): {
                mätning = "Volym";
                break;
            }
            case ('A'): {
                mätning = "Area";
                break;
            }
        }
        return mätning;
    }
    public static String objekt(char val3) {
        String objekt = "";
        val3 = Character.toUpperCase(val3);
        switch (val3) {
            case ('C'): {
                objekt = "Cylinder";
                break;
            }
            case ('R'): {
                objekt = "Rätblock";
                break;
            }
            case ('S'): {
                objekt = "Sfär";
                break;
            }
        }
        return objekt;
    }

    public static String formel(char val2, char val3) {
        String formel = "";
        val2 = Character.toUpperCase(val2);
        val3 = Character.toUpperCase(val3);
        switch (val2) {
            case ('V'): {
                switch (val3) {
                    case ('C'): {
                        formel = "π*r²*h";
                        break;
                    }
                    case ('R'): {
                        formel = "l*b*h";
                        break;
                    }
                    case ('S'): {
                        formel = "4/3*π*r³";
                        break;
                    }
                }
                break;
            }
            case ('A'): {
                switch (val3) {
                    case ('C'): {
                        formel = "2*π*r*h";
                        break;
                    }
                    case ('R'): {
                        formel = "2*(lb + lh + bh)";
                        break;
                    }
                    case ('S'): {
                        formel = "4*π*r²";
                        break;
                    }
                }
                break;
            }
        }
        return formel;
    }
    public static String Suträkning(char val2, char val3) {
        return "Uträkning av " + objekt(val3) + " " + mätning(val2) + ": " + val2 + " = " + formel(val2, val3);
    }

    public static String ut(double V) {
        int intVut;
        String Vut;
        if (Math.floor(V)==V) {
            intVut = (int) V;
            Vut = Integer.toString(intVut);
        }
        else {
            Vut = Double.toString(V);
        }
        return Vut;
    }

    public static boolean promptR() {
        boolean restart = false;
        System.out.print("\nVill du starta om?([Y]es/[N]o): ");
        char yn = Character.toUpperCase(input.next().charAt(0));
        switch (yn) {
            case ('Y'): {
                restart = true;
                break;
            }
            case ('N'): {
                restart = false;
                break;
            }
        }
        return restart;
    }

    public static String beräkning(char val2, char val3) {
        val2 = Character.toUpperCase(val2);
        val3 = Character.toUpperCase(val3);
        switch (val2) {
            case ('V'): {
                switch (val3) {
                    case ('C'): {
                        System.out.println(Suträkning(val2, val3));
                        System.out.println("Ange radie och höjd (cm)");
                        System.out.print("r = ");
                        double r = input.nextDouble();
                        System.out.print("h = ");
                        double h = input.nextDouble();
                        double V = PI * r*r * h;
                        System.out.println("V = " + ut(V));
                        break;
                    }
                    case ('R'): {
                        System.out.println("Ange längd, bredd och höjd (cm)");
                        System.out.print("l = ");
                        double l = input.nextDouble();
                        System.out.print("b = ");
                        double b = input.nextDouble();
                        System.out.print("h = ");
                        double h = input.nextDouble();
                        double V = l*b*h;
                        System.out.println("V = " + ut(V));
                        break;
                    }
                    case ('S'): {
                        System.out.println(Suträkning(val2, val3));
                        System.out.println("Ange radie (cm)");
                        System.out.print("r = ");
                        double r = input.nextDouble();
                        double V = (4.0/3.0)*(PI*(r*r*r));
                        System.out.println("V = " + ut(V));
                        break;
                    }
                }
                break;
            }
            case ('A'): {
                switch (val3) {
                    case ('C'): {
                        System.out.println("Ange radie och höjd (cm)");
                        System.out.print("r = ");
                        double r = input.nextDouble();
                        System.out.print("h = ");
                        double h = input.nextDouble();
                        double A = 2 * PI * r * h;
                        System.out.println("A = " + ut(A));
                        break;
                    }
                    case ('R'): {
                        System.out.println("Ange längd, bredd och höjd (cm)");
                        System.out.print("l = ");
                        double l = input.nextDouble();
                        System.out.print("b = ");
                        double b = input.nextDouble();
                        System.out.print("h = ");
                        double h = input.nextDouble();
                        double A = 2*(l*b + l*h + b*h) ;
                        System.out.println("A = " + ut(A));
                        break;
                    }
                    case ('S'): {
                        System.out.println("Ange radie (cm)");
                        System.out.print("r = ");
                        double r = input.nextDouble();
                        double A = 4 * PI * r*r;
                        System.out.println("A = " + ut(A));
                        break;
                    }
                }
                break;
            }
        }
        return "";
    }
}
