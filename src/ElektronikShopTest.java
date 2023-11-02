import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElektronikShopTest {

    @Test
    void findeBilligsteTastatur() {
        ElektronikShop elektronikShop = new ElektronikShop();
        int[] tastaturen = new int[] {40, 50, 60};
        assertEquals(40, elektronikShop.findeBilligsteTastatur(tastaturen) );

    }
    @Test
    void findeBilligsteTastaturUnexpected() {
        int[] tastaturen = null;
        assertThrows(IllegalArgumentException.class, () -> {
            ElektronikShop.findeBilligsteTastatur(tastaturen);
        });
    }

    @Test
    void findeTeuerstesProdukt() {
        ElektronikShop elektronikShop = new ElektronikShop();
        int[] tastaturen = {40, 50, 60};
        int[] usbLaufwerke = {8, 12};
        assertEquals(60, elektronikShop.findeTeuerstesProdukt(tastaturen, usbLaufwerke) );
    }

    @Test
    void findeTeuerstesProduktUnexpected() {
        int[] tastaturen = null;
        int[] usbLaufwerke = {};
        assertThrows(IllegalArgumentException.class, () -> {
            ElektronikShop.findeTeuerstesProdukt(tastaturen,usbLaufwerke);
        });
    }

    @Test
    void findeTeuerstesUsbLaufwerk() {
        ElektronikShop elektronikShop = new ElektronikShop();
        int[] usbLaufwerke = {8, 12};
        int budget = 20;
        assertEquals(12, elektronikShop.findeTeuerstesUsbLaufwerk (usbLaufwerke, 20) );
    }

    @Test
    void findeTeuerstesUsbLaufwerkUnexpected() {
        int[] usbLaufwerke = null;
        int budget = 100;
        assertThrows(IllegalArgumentException.class, () -> {
            ElektronikShop.findeTeuerstesUsbLaufwerk(usbLaufwerke,budget);
        });
    }

    @Test
    void berechneAusgaben() {
        ElektronikShop elektronikShop = new ElektronikShop();
        int[] tastaturen = {40, 50, 60};
        int[] usbLaufwerke = {8, 12};
        int budget = 60;
        assertEquals(52, elektronikShop.berechneAusgaben(budget,tastaturen, usbLaufwerke) );
    }

    @Test
    void berechneAusgabenUnexpected() {
        int[] tastaturen = null;
        int[] usbLaufwerke = null;
        int budget = 100;
        assertThrows(IllegalArgumentException.class, () -> {
            ElektronikShop.berechneAusgaben(budget,tastaturen,usbLaufwerke);
        });
    }
}

//commit4