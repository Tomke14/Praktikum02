public class Spiel {

    private int streichhoelzer;
    private int gezogeneHoelzer;

    public Spiel(int streichhoelzer) {
        this.streichhoelzer = streichhoelzer;
    
        while (this.streichhoelzer > 0) {
            computerZiehen();
            if (this.streichhoelzer <= 0) {
                System.out.println("Der menschliche Spieler hat gewonnen!");
                break;
            }
            menschZiehen();
            if (this.streichhoelzer <= 0) {
                System.out.println("Der Computer hat gewonnen!");
                break;
            }
        }
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

    public void computerZiehen() {
        berechneComputerZug();
        streichhoelzer -= gezogeneHoelzer;
        Ausgabe.computerZug(streichhoelzer, gezogeneHoelzer);
    }

    private void berechneComputerZug() {
            if (streichhoelzer % 4 == 0 && streichhoelzer != 0) {
                gezogeneHoelzer = 3;
            } 
            else if (streichhoelzer % 4 == 3 && streichhoelzer != 0) {
                gezogeneHoelzer = 2;
            } 
            else if (streichhoelzer % 4 == 2 && streichhoelzer != 0) {
                gezogeneHoelzer = 1;
            } 
            else {
                if(streichhoelzer != 0){
                    gezogeneHoelzer = (int) (Math.random() * 3 + 1);
                }
                
            } 
        }
}
