public class Spiel {

    private int streichhoelzer;

    public Spiel(int streichhoelzer) {
        this.streichhoelzer = streichhoelzer;

        while (streichhoelzer > 0) {
            computerZiehen();
            if (streichhoelzer <= 0) {
                break;
            }
            menschZiehen();
        }

    }

    public void computerZiehen() {
        
    }

    public void menschZiehen() {
        
    }

    private void berechneComputerZug() {
        
    }
}
