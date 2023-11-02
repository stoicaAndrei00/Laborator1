public class ZweiGrosseZahlen {


    public static int[] addiere(int[] num1, int[] num2) {

        if (num1 == null || num1.length == 0) {
            throw new IllegalArgumentException("Array ist null oder leer.");
        }

        if (num2 == null || num2.length == 0) {
            throw new IllegalArgumentException("Array ist null oder leer.");
        }


        int carry = 0;
        int[] ergebnis = new int[num1.length];
        for (int i = num1.length - 1; i >= 0; i--) {
            int summe = num1[i] + num2[i] + carry;
            ergebnis[i] = summe % 10;
            carry = summe / 10;
        }
        if (carry != 0) {
            int[] erweitertesErgebnis = new int[num1.length + 1];
            erweitertesErgebnis[0] = carry;
            System.arraycopy(ergebnis, 0, erweitertesErgebnis, 1, num1.length);
            ergebnis = erweitertesErgebnis;
        }
        return ergebnis;
    }

    public static int[] subtrahiere(int[] num1, int[] num2) {

        if (num1 == null || num1.length == 0) {
            throw new IllegalArgumentException("Array ist null oder leer.");
        }

        if (num2 == null || num2.length == 0) {
            throw new IllegalArgumentException("Array ist null oder leer.");
        }

        int borrow = 0;
        int[] ergebnis = new int[num1.length];
        for (int i = num1.length - 1; i >= 0; i--) {
            int differenz = num1[i] - num2[i] - borrow;
            if (differenz < 0) {
                differenz += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }
            ergebnis[i] = differenz;
        }
        return ergebnis;
    }

    public static int[] multipliziere(int[] num1, int ziffer) {

        if (num1 == null || num1.length == 0) {
            throw new IllegalArgumentException("Array ist null oder leer.");
        }


        int carry = 0;
        int[] ergebnis = new int[num1.length];
        for (int i = num1.length - 1; i >= 0; i--) {
            int produkt = num1[i] * ziffer + carry;
            ergebnis[i] = produkt % 10;
            carry = produkt / 10;
        }
        if (carry != 0) {
            int[] erweitertesErgebnis = new int[num1.length + 1];
            erweitertesErgebnis[0] = carry;
            System.arraycopy(ergebnis, 0, erweitertesErgebnis, 1, num1.length);
            ergebnis = erweitertesErgebnis;
        }
        return ergebnis;
    }

    public static int[] dividiere(int[] num1, int divisor) {

        if (num1 == null || num1.length == 0) {
            throw new IllegalArgumentException("Array ist null oder leer.");
        }

        int[] ergebnis = new int[num1.length];
        int rest = 0;
        for (int i = 0; i < num1.length; i++) {
            int dividend = num1[i] + rest * 10;
            ergebnis[i] = dividend / divisor;
            rest = dividend % divisor;
        }
        return ergebnis;
    }
}
//commit3