import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotenProzessorTest {

    @Test
    void nichtAusreichendeNoten() {
        NotenProzessor notenProzessor = new NotenProzessor();
        int[] noten = {45, 80, 30, 60, 90};
        int[] filteredNoten = notenProzessor.nichtAusreichendeNoten(noten);
        int[] expectedFilteredNoten = {45, 80, 60, 90};
        assertArrayEquals(expectedFilteredNoten, filteredNoten);

    }

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
    void addToArray() {
        NotenProzessor notenProzessor = new NotenProzessor();
        int[] original = {1, 2, 3};
        int newElement = 4;
        int[] newArray = notenProzessor.addToArray(original, newElement);
        int[] expectedArray = {1, 2, 3, 4};
        assertArrayEquals(expectedArray, newArray);
    }

    @Test
    void durchscnitsWert() {
        NotenProzessor notenProzessor = new NotenProzessor();
        int[] noten = {60, 75, 85, 92, 70};
        int durchschnitt = notenProzessor.durchscnitsWert(noten);
        assertEquals(76, durchschnitt);
    }

    @Test
    void maximaleAbgerundeteNote() {
        NotenProzessor notenProzessor = new NotenProzessor();
        int[] noten = {67, 89, 94, 78, 81};
        int maximaleAbgerundeteNote = notenProzessor.maximaleAbgerundeteNote(noten);
        assertEquals(95, maximaleAbgerundeteNote);
    }
}