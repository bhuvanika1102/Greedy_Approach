/*TC=>o(n) */

public class Lemonade {
    private static boolean solve(int[] arr) {
        int count_5 = 0, count_10 = 0;

        for (int i = 0; i < 2; i++) {
            if (arr[i] == 5) {
                count_5++;

            } else if (arr[i] == 10) {
                if (count_5 >= 1) {
                    count_5--;
                    count_10++;
                } else {
                    return false;
                }
            } else {
                if (count_5 >= 3) {
                    count_5 = count_5 - 3;
                } else if (count_5 >= 1 && count_10 >= 1) {
                    count_5--;
                    count_10--;
                } else {
                    return false;
                }
            }

        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 5, 5, 10, 20 };
        System.out.println(solve(arr));
    }
}