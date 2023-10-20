public class ZahlenProzessor {
    public static int findeMaxZahl(int[] zahlen) {
        int max = Integer.MIN_VALUE;
        for (int num : zahlen) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int findeMinZahl(int[] zahlen) {
        int min = Integer.MAX_VALUE;
        for (int num : zahlen) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int findeMaxSum(int[] zahlen) {
        int totalSum = 0;
        int minZahl = Integer.MAX_VALUE;
        for (int num : zahlen) {
            totalSum += num;
            if (num < minZahl) {
                minZahl = num;
            }
        }
        return totalSum - minZahl;
    }

    public static int findeMinSum(int[] zahlen) {
        int totalSum = 0;
        int maxZahl = Integer.MIN_VALUE;
        for (int num : zahlen) {
            totalSum += num;
            if (num > maxZahl) {
                maxZahl = num;
            }
        }
        return totalSum - maxZahl;
    }
}
