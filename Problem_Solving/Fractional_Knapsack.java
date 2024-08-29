public class Fractional_Knapsack {
    private static void sort(double[] ratio, int i, int j) {
        double temp = ratio[i];
        ratio[i] = ratio[j];
        ratio[j] = temp;
    }

    private static void sort1(int[][] ratio, int i, int j) {
        int temp1 = ratio[i][0];
        ratio[i][0] = ratio[j][0];
        ratio[j][0] = temp1;

        int temp2 = ratio[i][1];
        ratio[i][1] = ratio[j][1];
        ratio[j][1] = temp2;
    }

    private static double solve(int[][] arr, int weight) {
        int idx = 0, idx1 = 1, n = arr.length;
        double[] ratio = new double[n];
        for (int i = 0; i < arr.length; i++) {
            ratio[i] = (double) arr[i][idx] * 1000 / arr[i][idx1]; // Multiplied by 1000 to avoid integer division issue
        }
        for (int i = 0; i < ratio.length - 1; i++) {
            for (int j = i + 1; j < ratio.length; j++) {
                if (ratio[i] < ratio[j]) {
                    sort(ratio, i, j);
                    sort1(arr, i, j);

                }
            }
        }
        double profit = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][1] <= weight) {
                profit = profit + arr[i][0];
                weight = weight - arr[i][1];
            } else {
                profit = profit + (weight * ((double) arr[i][0] / arr[i][1]));
                break; // Once we take a fraction, we're done
            }
        }
        return profit;

    }

    public static void main(String[] args) {
        int[][] input = { { 500, 30 } };
        int weight = 10;
        System.out.println(solve(input, weight));
    }
}
