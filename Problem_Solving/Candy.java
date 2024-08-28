public class Candy {
    private static int max(int a, int b) {
        return a > b ? a : b;
    }

    private static void solve(int[] arr) {
        int n = arr.length;
        int[] candies = new int[n];
        candies[0] = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            } else {
                candies[i] = 1;
            }
        }
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > arr[i + 1]) {
                candies[i] = max(candies[i], candies[i + 1] + 1);
            }
        }
        for (int x : candies) {
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 1, 3, 2, 1 };
        solve(arr);
    }
}