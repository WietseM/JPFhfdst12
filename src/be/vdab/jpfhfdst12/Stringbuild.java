package be.vdab.jpfhfdst12;

public class Stringbuild {
    public static void main(String[] args) {
        var naam = new StringBuilder ("Eddy");
        System.out.println(naam.length());

        naam.append(' ');
        naam.append("Wally");
        naam.append(" is de nr 1");
        System.out.println(naam);
        naam.insert(0, "De grote ");
        System.out.println(naam);
        naam.delete(0, 9);
        System.out.println(naam);
        System.out.println(naam.length());

        naam = new StringBuilder("De_Ronde_van_Vlaanderen");
        for (var teller = 0; teller < naam.length(); teller++){
            if (naam.charAt(teller) == '_') {
                naam.setCharAt(teller, ' ');
            }
        }
        System.out.println(naam);
    }
}
