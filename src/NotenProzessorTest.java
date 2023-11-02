import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotenProzessorTest {
//nichtAusreichendeNoten Tests
    @Test
    void nichtAusreichendeNoten() {
        NotenProzessor notenProzessor = new NotenProzessor();
        int[] noten = {45, 80, 30, 60, 90};
        int[] filteredNoten = notenProzessor.nichtAusreichendeNoten(noten);
        int[] expectedFilteredNoten = {45, 80, 60, 90};
        assertArrayEquals(expectedFilteredNoten, filteredNoten);

    }

    @Test
    void nichtAusreichendeNotenUnerwartetet() {
        NotenProzessor notenProzessor = new NotenProzessor();
        int[] note = {50, 110, 30, 70, 45}; //note ist uber 100
        assertThrows(IllegalArgumentException.class, () -> {
            notenProzessor.nichtAusreichendeNoten(note);
        });
    }
//round Tests
    @Test
    void round() {
        NotenProzessor notenProzessor = new NotenProzessor();
        int roundedValue1 = notenProzessor.round(37);
        int roundedValue2 = notenProzessor.round(43);
        int roundedValue3 = notenProzessor.round(46);
        int roundedValue4 = notenProzessor.round(51);
        assertEquals(37, roundedValue1);
        assertEquals(45, roundedValue2);
        assertEquals(46, roundedValue3);
        assertEquals(51, roundedValue4);
    }
   @Test
   void roundUnexpected() {
       NotenProzessor notenProzessor = new NotenProzessor();
       int noten = -23;
       assertThrows(IllegalArgumentException.class, () -> {
           NotenProzessor.round( noten);
      });
   }

    @Test
    void addToArray() {
        NotenProzessor notenProzessor = new NotenProzessor();
        int[] original = {1, 2, 3};
        int newElement = 4;
        int[] newArray = notenProzessor.addToArray(original, newElement);
        int[] expectedArray = {1, 2, 3, 4};
        assertArrayEquals(expectedArray, newArray);
    }

    @Test
    void addToArray_NullInputArray() {
        NotenProzessor notenProzessor = new NotenProzessor();
        int[] original = null;
        int newElement = 60;
        assertThrows(IllegalArgumentException.class, () -> {
            notenProzessor.addToArray(original, newElement);
        });
    }


    @Test
    void durchscnitsWert() {
        NotenProzessor notenProzessor = new NotenProzessor();
        int[] noten = {60, 75, 85, 92, 70};
        int durchschnitt = notenProzessor.durchscnitsWert(noten);
        assertEquals(76, durchschnitt);
    }

    @Test
    void durchschnitsWertUnerwartet() {
        NotenProzessor notenProzessor = new NotenProzessor();
        int[] note = {75, 150, 30, 70, 45}; //note ist uber 100
        assertThrows(IllegalArgumentException.class, () -> {
            notenProzessor.nichtAusreichendeNoten(note);
        });
    }

    @Test
    void maximaleAbgerundeteNoteUnerwartetet() {
        NotenProzessor notenProzessor = new NotenProzessor();
        int[] noten = null;
        assertThrows(IllegalArgumentException.class, () -> {
            notenProzessor.maximaleAbgerundeteNote(noten);
        });
    }

    @Test
    void maximaleAbgerundeteNote() {
        NotenProzessor notenProzessor = new NotenProzessor();
        int[] noten = {67, 89, 94, 78, 81};
        int maximaleAbgerundeteNote = notenProzessor.maximaleAbgerundeteNote(noten);
        assertEquals(95, maximaleAbgerundeteNote);
    }
}