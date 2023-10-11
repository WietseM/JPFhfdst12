package be.vdab.jpfhfdst12;

import java.util.Scanner;

public class Klinkers {
    public static void main(String[] args) {
        System.out.println("Schrijf een zin:");
        Scanner scanner = new Scanner(System.in);
        var tekst = scanner.nextLine().toLowerCase();
        var stukjes = tekst.split("");
        var aantalKlinkers = 0;
        for (var stukje : stukjes) {
            if ("aeiou".contains(stukje)) {
                aantalKlinkers++;
            }
        }

        //andere manier
        /*
        for (var i=0; i < tekst.length(); i++) {
            var letter = tekst.charAt(i);
            if ("aeiou".indexOf(letter)> -1)
                aantalKlinkers++;
        }*/

        System.out.println("Aantal klinkers: " + aantalKlinkers);
    }
}
