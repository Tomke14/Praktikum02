public class Ausgabe {

    public static void zahlEingeben() {
        System.out.println("Bitte geben Sie eine Zahl ein: ");
    }

    public static void keineZahl() {
        System.out.println("Das ist keine Zahl!");
    }

    public static void zahlNichtImBereich() {
        System.out.println("Die Zahl ist nicht im Bereich!");
    }

    public static void menschGewinnt() {
        System.out.println("Der Mensch gewinnt!");
    }

    public static void computerGewinnt() {
        System.out.println("Der Computer gewinnt leider!");
    }

    public static void zugNichtMoeglich() {
        System.out.println("Der Zug ist nicht möglich!");
    }

    public static void spielstand(int streichhoelzer) {
        System.out.println("Streichhölzer: " + streichhoelzer);
    }

    public static void menschZug(int streichhoelzer, int gezogeneStreichhoelzer) {
        System.out.println("Sie ziehen " + gezogeneStreichhoelzer + " Streichhölzer. Es verbleiben " + streichhoelzer + " Streichhölzer.");
    }

    public static void computerZug(int streichhoelzer, int gezogeneStreichhoelzer) {
        System.out.println("Der Computer zieht " + gezogeneStreichhoelzer + " Streichhölzer. Es verbleiben " + streichhoelzer + " Streichhölzer.");
    }


}
