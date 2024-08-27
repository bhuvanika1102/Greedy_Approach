public class Assign_Cookies {
    private static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    private static int assign_cookie(int[] greed, int[] cookies) {
        sort(greed);
        sort(cookies);
        int i = 0, j = 0, count = 0;
        while (i < greed.length && j < cookies.length) {
            if (greed[i] <= cookies[j]) {
                count++;
                i++;
                j++;
            } else {
                j++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] greed = { 1, 5, 3, 3, 4 };
        int[] cookies = { 4, 2, 1, 2, 1, 3 };
        System.out.println(assign_cookie(greed, cookies));

    }
}
