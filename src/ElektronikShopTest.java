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
    void findeTeuerstesProdukt() {
        ElektronikShop elektronikShop = new ElektronikShop();
        int[] tastaturen = {40, 50, 60};
        int[] usbLaufwerke = {8, 12};
        assertEquals(60, elektronikShop.findeTeuerstesProdukt(tastaturen, usbLaufwerke) );
    }

    @Test
    void findeTeuerstesUsbLaufwerk() {
        ElektronikShop elektronikShop = new ElektronikShop();
        int[] usbLaufwerke = {8, 12};
        int budget = 20;
        assertEquals(12, elektronikShop.findeTeuerstesUsbLaufwerk (usbLaufwerke, 20) );
    }

    @Test
    void berechneAusgaben() {
        ElektronikShop elektronikShop = new ElektronikShop();
        int[] tastaturen = {40, 50, 60};
        int[] usbLaufwerke = {8, 12};
        int budget = 60;
        assertEquals(52, elektronikShop.berechneAusgaben(budget,tastaturen, usbLaufwerke) );
    }
}