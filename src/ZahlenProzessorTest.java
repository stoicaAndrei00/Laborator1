import static org.junit.jupiter.api.Assertions.*;

class ZahlenProzessorTest {

    @org.junit.jupiter.api.Test
    void findeMaxZahl() {
        ZahlenProzessor zahlenprozessor = new ZahlenProzessor();
        int[] zahlen = new int[] { 4, 8, 3, 10, 17 };
        assertEquals(17, zahlenprozessor.findeMaxZahl(zahlen));
    }

    @org.junit.jupiter.api.Test
    void findeMinZahl() {
        ZahlenProzessor zahlenprozessor = new ZahlenProzessor();
        int[] zahlen = new int[] { 4, 8, 3, 10, 17 };
        assertEquals(3, zahlenprozessor.findeMinZahl(zahlen));
    }

    @org.junit.jupiter.api.Test
    void findeMaxSum() {
        ZahlenProzessor zahlenprozessor = new ZahlenProzessor();
        int[] zahlen = new int[] { 4, 8, 3, 10, 17 };
        assertEquals(39, zahlenprozessor.findeMaxSum(zahlen));
    }

    @org.junit.jupiter.api.Test
    void findeMinSum() {
        ZahlenProzessor zahlenprozessor = new ZahlenProzessor();
        int[] zahlen = new int[] { 4, 8, 3, 10, 17 };
        assertEquals(25, zahlenprozessor.findeMinSum(zahlen));
    }
}