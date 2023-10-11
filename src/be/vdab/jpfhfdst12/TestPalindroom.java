package be.vdab.jpfhfdst12;

import java.util.Scanner;

public class TestPalindroom {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Tik het te onderzoeken woord: ");
        var woord = scanner.next();
        var palin = new Palindroom(woord);
        System.out.println("Het originele woord is: " + palin.getTekst());
        System.out.println("Het omgekeerde woord is: " + palin.getRevTekst());
        if (palin.checkPalindroom(false))
            System.out.println("Het woord is een zuiver palindroom.");
        else {
            if (palin.checkPalindroom(true)) {
                System.out.println("Het woord is, los van de hoofdletters, een palindroom");
            }
            else {
                System.out.println("Het woord is helemaal geen palindroom!");
            }
        }
    }
}
