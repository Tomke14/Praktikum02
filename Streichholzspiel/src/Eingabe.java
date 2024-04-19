import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Eingabe {

    public static int leseZahl(){
        Ausgabe.zahlEingeben();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int zahl = Integer.parseInt(reader.readLine());
            return zahl;
        } catch (IOException e) {
            e.printStackTrace();
            return 0;
        }

        catch (NumberFormatException e) {
            Ausgabe.keineZahl();
            return leseZahl();
        }
    }

    public static int leseHoelzer(){
        int zahl = leseZahl();
        if (zahl < 1 || zahl > 3) {
            Ausgabe.zahlNichtImBereich();
            return leseHoelzer();
        } else {
            return zahl;
        }
    }

}