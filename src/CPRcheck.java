import java.util.Scanner;



public class CPRcheck {
    static String cpr;

    public static void checkCPR(){
        System.out.println("Write a 10-cipher CPR number");
        Scanner s = new Scanner(System.in);
        cpr = s.nextLine();

        String firstTwo = cpr.subSequence(0, 2).toString(); // converter to første ciphre til string
        String fiveSix = cpr.subSequence(4, 6).toString(); // converter ciphre 5 & 6 til string

        if (cpr.length() != 10) {
            System.out.println("CPR size error");
        } else if (Integer.parseInt(firstTwo) > 31) { // converter string til int
            System.out.println("First two too high");
        } else if (Integer.parseInt(fiveSix) > 12) {
            System.out.println("digits 5&6 are too high");
        }  else {
            System.out.println("CPR is valid");
        }
    }
}
