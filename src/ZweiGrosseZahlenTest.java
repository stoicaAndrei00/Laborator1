import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ZweiGrosseZahlenTest {

    @Test
    void addiere() {
        int[] num1 = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] num2 = {8, 7, 0, 0, 0, 0, 0, 0, 0};
        int[] summe = ZweiGrosseZahlen.addiere(num1, num2);
        int[] result = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        assertEquals(Arrays.toString(result), Arrays.toString(summe));
    }

    @Test
    void subtrahiere() {
        int[] num1 = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] num2 = {8, 7, 0, 0, 0, 0, 0, 0, 0};
        int[] differenz = ZweiGrosseZahlen.subtrahiere(num2, num1);
        int[] result = {7, 4, 0, 0, 0, 0, 0, 0, 0};
        assertEquals(Arrays.toString(result), Arrays.toString(differenz));
    }

    @Test
    void multipliziere() {
        int[] num1 = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] multiplikation = ZweiGrosseZahlen.multipliziere(num1, 2);
        int[] result = {2, 6, 0, 0, 0, 0, 0, 0, 0};
        assertEquals(Arrays.toString(result), Arrays.toString(multiplikation));
    }

    @Test
    void dividiere() {
        int[] num1 = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] division = ZweiGrosseZahlen.dividiere(num1, 2);
        int[] result = {0, 6, 5, 0, 0, 0, 0, 0, 0};
        assertEquals(Arrays.toString(result), Arrays.toString(division));
    }
}