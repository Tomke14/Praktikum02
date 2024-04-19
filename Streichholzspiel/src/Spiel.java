public class Spiel {

    private int streichhoelzer;

    public Spiel(int streichhoelzer) {
        this.streichhoelzer = streichhoelzer;

        while (streichhoelzer > 0) {
            computerZiehen();
            if (streichhoelzer <= 0) {
                System.out.println("Der menschliche Spieler hat gewonnen!");
                break;
            }
            menschZiehen();
            if (streichhoelzer <= 0) {
                System.out.println("Der Computer hat gewonnen!");
                break;
            }
        }

    }

    public void computerZiehen() {
        
    }

    public void menschZiehen() {
        Eingabe eingabe = new Eingabe();
        int gezogeneHoelzer = Eingabe.leseHoelzer();
        if (gezogeneHoelzer > streichhoelzer) {
            Ausgabe.zugNichtMoeglich();
            menschZiehen();
        } else {
            streichhoelzer -= gezogeneHoelzer;
            Ausgabe.menschZug(streichhoelzer, gezogeneHoelzer);
        }
    }

    private void berechneComputerZug() {
        
    }
}
