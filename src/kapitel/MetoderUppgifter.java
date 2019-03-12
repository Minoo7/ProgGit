package kapitel;

public class MetoderUppgifter {
    public static void main(String[] args) {
        klockslag();
    }

    static void klockslag() {
        int n1;
        int n2;
        int n3;
        String nIn1 = "";
        String nIn2 = "";
        String nIn3 = "";

        for (n1 = 0; n1 < 24; n1++) {
            for (n2 = 0; n2 <= 59; n2++) {
                for (n3 = 0; n3 <= 59; n3++) {
                    if (n1 < 10) {
                        nIn1 = "0";
                    }
                    else {
                        nIn1 = "";
                    }
                    if (n2 < 10) {
                        nIn2 = "0";
                    }
                    else {
                        nIn2 = "";
                    }
                    if (n3 < 10) {
                        nIn3 = "0";
                    }
                    else {
                        nIn3 = "";
                    }
                    System.out.println(nIn1 + n1 + ":" + nIn2 + n2 + ":" + nIn3 + n3);
                }
            }
        }
    }
}
