
public class NotenProzessor {

    public int[] nichtAusreichendeNoten(int[] note) {

        if (note == null) {
            throw new IllegalArgumentException("Note-Array darf nicht null sein.");
        }

        for (int i = 0; i < note.length; i++) {
            if (note[i] < 0 || note[i] > 100) {
                throw new IllegalArgumentException("Noten sollen zwischen 0 und 100 sein.");
            }
        }

        for (int i = 0; i < note.length; i++) {
            if (note[i] < 0 || note[i] > 100) {
                System.out.println("Noten soll zwischen 0 und 100 sein.");
                return null;
            }
        }

        int[] finaleNoten = new int[0];

        for (int i = 0; i < note.length; i++) {
            if (round(note[i]) >= 40) {
                finaleNoten = addToArray(finaleNoten, round(note[i]));
            }
        }
        return finaleNoten;
    }

    public static int round(int note) {

        if (note < 0 ) {
            throw new IllegalArgumentException("Note kann nicht unter 0 sein");
        }

        if (note < 38) {
            return note;
        } else {
            if (note % 5 > 2) {
                return note + 5 - note % 5;
            } else {
                return note;
            }
        }
    }

    public int[] addToArray(int[] original, int newElement) {
        if (original == null) {
            throw new IllegalArgumentException("Input array cannot be null.");
        }
        int[] result = new int[original.length + 1];
        for (int i = 0; i < original.length; i++) {
            result[i] = original[i];
        }
        result[original.length] = newElement;
        return result;
    }

    public int durchscnitsWert(int[] noten){
        int anzahlVonNoten = 0;
        int summeDerNoten = 0;

        for (int i = 0; i < noten.length; i++){
            if (noten[i] < 0 || noten[i] > 100) {
                throw new IllegalArgumentException("Noten sollen zwischen 0 und 100 sein.");}
            summeDerNoten += noten[i];
            anzahlVonNoten += 1;
        }
        return summeDerNoten/anzahlVonNoten;
    }

    public int maximaleAbgerundeteNote(int[] noten){

        if (noten == null) {
            throw new IllegalArgumentException("Noten-Array darf nicht null sein.");
        }

        int maximaleNote = 0;
        for (int i = 0; i < noten.length; i++){
            if (noten[i] > maximaleNote){
                maximaleNote = noten[i];
            }
        }
        return round(maximaleNote);
    }
}

