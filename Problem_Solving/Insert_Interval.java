public class Insert_Interval {
    private static int min(int a, int b) {
        return a < b ? a : b;
    }

    private static int max(int a, int b) {
        return a > b ? a : b;
    }

    private static void insert_interval(int[][] array, int[] newvalue) {
        int i = 0, j = 0;
        int n = array.length;
        int[][] res = new int[n + 1][2];

        while (i < n && array[i][1] < newvalue[0]) {
            res[j++] = array[i++];

        }
        while (i < n && array[i][0] <= newvalue[1]) {
            newvalue[0] = min(newvalue[0], array[i][0]);
            newvalue[1] = max(newvalue[1], array[i][1]);
            i++;
        }
        res[j++] = newvalue;
        // j++;
        while (i < n) {
            res[j++] = array[i++];
            // i++;
            // j++;
        }
        for (int[] interval : res) {
            System.out.println("[" + interval[0] + ", " + interval[1] + "]");
        }
    }

    public static void main(String[] args) {
        int[][] array = { { 1, 2 }, { 3, 4 }, { 6, 7 }, { 8, 10 }, { 12, 13 } };
        int[] new_value = { 13, 15 };

        insert_interval(array, new_value);
    }
}
