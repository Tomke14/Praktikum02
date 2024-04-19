public class Ausgabe {

    public void zahlEingeben() {
        System.out.println("Bitte geben Sie eine Zahl ein: ");
    }

    public void keineZahl() {
        System.out.println("Das ist keine Zahl!");
    }

    public void zahlNichtImBereich() {
        System.out.println("Die Zahl ist nicht im Bereich!");
    }

    public void menschGewinnt() {
        System.out.println("Der Mensch gewinnt!");
    }

    public void computerGewinnt() {
        System.out.println("Der Computer gewinnt leider!");
    }

    public void zugNichtMoeglich() {
        System.out.println("Der Zug ist nicht möglich!");
    }

    public void spielstand(int streichhoelzer) {
        System.out.println("Streichhölzer: " + streichhoelzer);
    }

    public void menschZug(int streichhoelzer, int gezogeneStreichhoelzer) {
        System.out.println("Der Mensch zieht " + gezogeneStreichhoelzer + " Streichhölzer. Es verbleiben " + streichhoelzer + " Streichhölzer.");
    }

    public void computerZug(int streichhoelzer, int gezogeneStreichhoelzer) {
        System.out.println("Der Computer zieht " + gezogeneStreichhoelzer + " Streichhölzer.Es verbleiben " + streichhoelzer + " Streichhölzer.");
    }


}
