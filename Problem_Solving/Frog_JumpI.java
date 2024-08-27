public class Frog_JumpI {
    private static boolean jump(int[] arr) {
        int i = 0;
        while (i < arr.length && arr[i] != 0) {
            i = i + arr[i];
        }
        if (i < arr.length) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = { 7, 2, 1, 1, 1, 9, 2, 1 };
        System.out.println(jump(arr));
    }
}
