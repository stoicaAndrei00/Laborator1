public class ElektronikShop {
    public static int findeBilligsteTastatur(int[] tastaturen) {

        if (tastaturen == null || tastaturen.length == 0) {
            throw new IllegalArgumentException("Array ist null oder leer.");
        }

        int billigsteTastatur = Integer.MAX_VALUE;
        for (int tastaturPreis : tastaturen) {
            if (tastaturPreis < billigsteTastatur) {
                billigsteTastatur = tastaturPreis;
            }
        }
        return billigsteTastatur;
    }

    public static int findeTeuerstesProdukt(int[] tastaturen, int[] usbLaufwerke) {

        if (tastaturen == null || tastaturen.length == 0) {
            throw new IllegalArgumentException("Array ist null oder leer.");
        }

        if (usbLaufwerke == null || usbLaufwerke.length == 0) {
            throw new IllegalArgumentException("Array ist null oder leer.");
        }

        int teuerstesProdukt = Integer.MIN_VALUE;
        for (int tastaturPreis : tastaturen) {
            if (tastaturPreis > teuerstesProdukt) {
                teuerstesProdukt = tastaturPreis;
            }
        }
        for (int usbPreis : usbLaufwerke) {
            if (usbPreis > teuerstesProdukt) {
                teuerstesProdukt = usbPreis;
            }
        }
        return teuerstesProdukt;
    }

    public static int findeTeuerstesUsbLaufwerk(int[] usbLaufwerke, int budget) {

        if (usbLaufwerke == null || usbLaufwerke.length == 0) {
            throw new IllegalArgumentException("Array ist null oder leer.");
        }

        int teuerstesUsbLaufwerk = -1;
        for (int usbPreis : usbLaufwerke) {
            if (usbPreis <= budget && usbPreis > teuerstesUsbLaufwerk) {
                teuerstesUsbLaufwerk = usbPreis;
            }
        }
        return teuerstesUsbLaufwerk;
    }

    public static int berechneAusgaben(int budget, int[] tastaturen, int[] usbLaufwerke) {

        if (tastaturen == null || tastaturen.length == 0) {
            throw new IllegalArgumentException("Array ist null oder leer.");
        }

        if (usbLaufwerke == null || usbLaufwerke.length == 0) {
            throw new IllegalArgumentException("Array ist null oder leer.");
        }

        int billigsteTastatur = findeBilligsteTastatur(tastaturen);
        int teuerstesUsbLaufwerk = findeTeuerstesUsbLaufwerk(usbLaufwerke, budget);
        if (budget - (billigsteTastatur + teuerstesUsbLaufwerk) < 0) {
            return -1;
        }
        return billigsteTastatur + teuerstesUsbLaufwerk;
    }

    //commit4
}
