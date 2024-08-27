import java.util.Random;
import java.util.Scanner;

public class PrüfSequenzÜberprüfung {

    // Methode zur Überprüfung, ob eine Prüfsequenz im Datenarray vorhanden ist
    public static boolean containsSequence(int[] data, int[] sequence) {
        // Länge der Prüfsequenz
        int sequenceLength = sequence.length;

        // Durchlaufe das Datenarray
        for (int i = 0; i <= data.length - sequenceLength; i++) {
            boolean found = true;

            // Überprüfe, ob die Prüfsequenz an der aktuellen Position übereinstimmt
            for (int j = 0; j < sequenceLength; j++) {
                if (data[i + j] != sequence[j]) {
                    found = false;
                    break;
                }
            }

            // Wenn die Sequenz gefunden wurde, gib true zurück
            if (found) {
                return true;
            }
        }

        // Wenn die Schleife beendet ist, wurde die Sequenz nicht gefunden
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Größe der Datenarray und der Prüfsequenz festlegen
        int dataSize = 50; // Größe des Datenarrays
        int sequenceSize = 4; // Größe der Prüfsequenz

        // Datenarray und Prüfsequenz erstellen
        int[] data = new int[dataSize];
        int[] sequence = new int[sequenceSize];

        // Datenarray mit zufälligen Werten füllen
        for (int i = 0; i < dataSize; i++) {
            data[i] = random.nextInt(100); // Zufallswerte zwischen 0 und 99
        }

        // Prüfsequenz vom Benutzer eingeben
        System.out.println("Geben Sie die 4 Ganzzahlen der Prüfsequenz ein:");
        for (int i = 0; i < sequenceSize; i++) {
            System.out.printf("Wert %d: ", i + 1);
            sequence[i] = scanner.nextInt();
        }

        // Überprüfen, ob die Prüfsequenz im Datenarray enthalten ist
        boolean isContained = containsSequence(data, sequence);

        // Ergebnis ausgeben
        if (isContained) {
            System.out.println("Die Prüfsequenz wurde im Datenarray gefunden.");
        } else {
            System.out.println("Die Prüfsequenz wurde im Datenarray nicht gefunden.");
        }

        scanner.close();
    }
}
