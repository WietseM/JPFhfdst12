package be.vdab.jpfhfdst12;

public class TestRekenaar {
    public static void main(String[] args) {
        var berekening = new Rekenaar("-173+3*28/229");
        System.out.println("Totaal: " + berekening.getTotaal());
        System.out.println(berekening);

        // Manier met spaties
        /*var rek = new Rekenaar("17 + 38 * 2 - 22");
        System.out.println("Totaal: " + rek.getTotaal());
        System.out.println(rek);

        rek.setInput("7 - 5 * 10 / 0");
        System.out.println("Totaal: " + rek.getTotaal());
        System.out.println(rek);*/
    }
}
