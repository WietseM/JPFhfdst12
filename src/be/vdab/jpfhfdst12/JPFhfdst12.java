package be.vdab.jpfhfdst12;

public class JPFhfdst12 {
    public static void main(String[] args) {
        var tekst = "En hier zitten de \\ aanhalingstekens dan.";
        System.out.println(tekst);
        var woord = "Hallo";
        System.out.println(woord);
        System.out.println(woord.length());

        //Deze method past de inspringing van elke regel van de string aan op basis van het argument dat word meegegeven.
        woord = woord.indent(5);
        System.out.println(woord);
        System.out.println(woord.length());

        /*Geeft true indien de lengte (length()) van een string 0 is of indien de string alleen spaties bevat.
        In het andere geval is het resultaat false*/
        System.out.println(woord.isBlank());

        //Kopieert een deel van de string. Het deel dat gekopieerd wordt, begint bij de beginindex en eindigt bij de eindindex-1.
        woord = woord.substring(6, woord.length()-2);
        System.out.println(woord);

        //Retourneert het ‘character’ dat op een bepaalde positie staat.
        System.out.println(woord.charAt(2));

        /* beide methods onderzoeken of een bepaalde substring onderdeel is van de string.
        De eerste method zoekt van voor naar achter, de laatste van achter naar voor.
        Beide methods geven de index terug waar de substring gevonden is, of -1 indien de substring niet gevonden is.*/
        System.out.println(woord.indexOf('l'));
        System.out.println(woord.lastIndexOf('l'));
        System.out.println(woord.indexOf('b'));

        /*regex is hier een delimiter (symbool) die bepaalt waar de string gesplitst wordt.
        De tekst wordt gesplitst op een spatie (= de delimiter) en elke (deel)string wordt gestockeerd in een array.*/
        var text = "Dit is een stukje tekst";
        var stukjes = text.split( " ");
        for (var stukje : stukjes) {
            System.out.println(stukje);
        }

        /*de delimiter bepaalt opnieuw waar de string gesplitst wordt en een int-parameter zegt hoeveel keer de delimiter
        gebruikt wordt. De rest van de string komt in het laatste array element te staan.
        De tekst wordt gesplitst op een spatie (= de delimiter), maar slechts in 3 delen. Het derde deel
        bevat de rest van de string. Elke (deel)string wordt gestockeerd in een array. Deze array bevat dus 3 elementen.*/
        tekst = "Dit is een stukje tekst";
        stukjes = tekst.split(" ", 3);
        for (var stukje : stukjes) {
            System.out.println(stukje);
        }

        tekst = "5.0";
        var temperatuur = Double.parseDouble(tekst);
        System.out.println(temperatuur);
        tekst = "7";
        var geluksgetal = Integer.parseInt(tekst);
        System.out.println(geluksgetal);

        temperatuur = 5.0;
        tekst = String.valueOf(temperatuur);
        System.out.println(tekst);
        geluksgetal = 7;
        tekst = String.valueOf(geluksgetal);
        System.out.println(tekst);

        var metTekstblokken = """
        {
        "Opleiding": "Java Ontwikkelaar"
        "Cursus": "Java Programming Fundamentals"
         }
        """;
        System.out.println(metTekstblokken);

    }
}
