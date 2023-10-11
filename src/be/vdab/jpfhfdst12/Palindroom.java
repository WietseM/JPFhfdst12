package be.vdab.jpfhfdst12;

public class Palindroom {
    private final StringBuilder tekst;
    private final StringBuilder revTekst;

    public Palindroom(String tekst) {
        this.tekst = new StringBuilder(tekst);
        this.revTekst = new StringBuilder(tekst).reverse();
    }

    public String getRevTekst() {
        return revTekst.toString();
    }

    public String getTekst() {
        return tekst.toString();
    }

    public boolean checkPalindroom(boolean hoofdletter){
        if (!hoofdletter){
            return getTekst().equals(getRevTekst());
        }
        else {
            var ot = getTekst().toLowerCase();
            var rt = getRevTekst().toLowerCase();
            return ot.equals(rt);
        }
    }
}
