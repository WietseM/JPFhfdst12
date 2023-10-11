package be.vdab.jpfhfdst12;

public class Rekenaar {
    private String input;
    private double totaal;

    public Rekenaar(String input) {
        this.input = input;
        this.totaal = voerBerekeningUit();
    }

    public void setInput(String input) {
        this.input = input;
        this.totaal = voerBerekeningUit();
    }

    public String getInput() {
        return input;
    }

    public double getTotaal() {
        return totaal;
    }

    public double voerBerekeningUit() {
        var index = 0;
        var stuk = "";
        var vorigeOperator = ' ';
        for (var i = 0; i < input.length(); i++) {
            var letter = input.charAt(i);
            int index1 = "+-*/".indexOf(letter);
            if ((index1 > -1)) {
                stuk = input.substring(index, i);
                if (!stuk.isBlank()) {
                    calculeer(vorigeOperator, Integer.parseInt(stuk));
                }
                var operator = input.charAt(i);
                vorigeOperator = operator;
                index = i + 1;
            }
        }
        stuk = input.substring(index, input.length());
        calculeer(vorigeOperator, Integer.parseInt(stuk));
        return totaal;
        // Manier met spaties
        /*var delen = input.split(" ");
        if (!delen[0].equals(""))
            totaal=Integer.parseInt(delen[0]);
        else
            totaal=0;
        int i=1;
        while (i < delen.length) {
            var bewerkingsTeken = delen[i].charAt(0);
            i++;
            if (i < delen.length) {
                var getal = Integer.parseInt(delen[i]);
                calculeer(bewerkingsTeken, getal);
                i++;
            }
        }
        return totaal;*/
    }

    public void calculeer(char operator, int getal) {
        switch (operator) {
            case '+' -> totaal += getal;
            case '-' -> totaal -= getal;
            case '*'-> totaal *= getal;
            case '/' -> {
                if(getal != 0) {
                    totaal /= getal;
                }
            }
            default -> totaal = getal;
        }
    }

    @Override
    public String toString() {
        return input + "= " + totaal;
    }

}
