public class Ausgabe {

    public static void zahlEingeben() {
        System.out.print("Bitte geben Sie eine Zahl ein: ");
    }

    public static void keineZahl() {
        System.out.printf("Das ist keine Zahl!");
        System.out.println();
    }

    public static void zahlNichtImBereich() {
        System.out.print("Die Zahl ist nicht im gültigen Bereich! Die Zahl muss zwischen 1 und 3 liegen.");
        System.out.println();
    }

    public static void menschGewinnt() {
        System.out.print("Herzlichen Glückwunsch, Sie haben gewonnen!");
        System.out.println();
    }

    public static void computerGewinnt() {
        System.out.print("Der Computer gewinnt leider!");
        System.out.println();
    }

    public static void zugNichtMoeglich() {
        System.out.print("Der Zug ist nicht möglich, es liegen zu wenige Streichhölzer auf dem Tisch!");
        System.out.println();
    }

    public static void spielstand(int streichhoelzer) {
        System.out.print("Streichhölzer: " + streichhoelzer);        
        System.out.println();
    }

    public static void menschZug(int streichhoelzer, int gezogeneStreichhoelzer) {
        System.out.print("Sie ziehen " + gezogeneStreichhoelzer + " Streichhölzer. Es verbleiben " + streichhoelzer + " Streichhölzer.");
        System.out.println();
    }

    public static void computerZug(int streichhoelzer, int gezogeneStreichhoelzer) {
        System.out.print("Der Computer zieht " + gezogeneStreichhoelzer + " Streichhölzer. Es verbleiben " + streichhoelzer + " Streichhölzer.");
        System.out.println();
    }


}
