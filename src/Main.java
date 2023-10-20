
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //ubung 1

        NotenProzessor notenProzessor = new NotenProzessor();

        int[] noten = new int[] { 10, 20, 30,68, 39, 47, 48, 60, 48 };

        System.out.println("Die ausreichende gerundete Noten sind: " + Arrays.toString(notenProzessor.nichtAusreichendeNoten(noten)));
        System.out.println("Der Durchschnitt der noten ist: " + notenProzessor.durchscnitsWert(noten));
        System.out.println("Die maximale abgerundete Note ist: " + notenProzessor.maximaleAbgerundeteNote(noten));

        //ubung 2

        ZahlenProzessor zahlenProzessor = new ZahlenProzessor();

        int[] zahlen = new int[] { 4, 8, 3, 10, 17 };

        int maxZahl = ZahlenProzessor.findeMaxZahl(zahlen);
        System.out.println("Max Zahl: " + maxZahl);

        int minZahl = ZahlenProzessor.findeMinZahl(zahlen);
        System.out.println("Min Zahl: " + minZahl);

        // Finde maximalle Summe von n-1 Zahlen
        int maxSum = ZahlenProzessor.findeMaxSum(zahlen);
        System.out.println("Maximum Sum of n-1 Numbers: " + maxSum);
        // Finde minimalle Summe von n-1 Zahlen
        int minSum = ZahlenProzessor.findeMinSum(zahlen);
        System.out.println("Minimum Sum of n-1 Numbers: " + minSum);

        //ubung 3

        int[] num1 = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] num2 = {8, 7, 0, 0, 0, 0, 0, 0, 0};

        int[] summe = ZweiGrosseZahlen.addiere(num1, num2);
        System.out.println("Summe: " + Arrays.toString(summe));

        int[] differenz = ZweiGrosseZahlen.subtrahiere(num2, num1);
        System.out.println("Differenz: " + Arrays.toString(differenz));

        int[] multiplikation = ZweiGrosseZahlen.multipliziere(num1, 2);
        System.out.println("Multiplikation: " + Arrays.toString(multiplikation));

        int[] division = ZweiGrosseZahlen.dividiere(num1, 2);
        System.out.println("Division: " + Arrays.toString(division));

        //ubung 4

        int budget = 51;
        int[] tastaturen = {40, 50, 60};
        int[] usbLaufwerke = {8, 12};

        int ausgaben = ElektronikShop.berechneAusgaben(budget, tastaturen, usbLaufwerke);
        if (ausgaben == -1) {
            System.out.println("Markus kann nicht beide Gegenstände kaufen.");
        } else {
            System.out.println("Markus wird " + ausgaben + " ausgeben.");
        }
    }
}