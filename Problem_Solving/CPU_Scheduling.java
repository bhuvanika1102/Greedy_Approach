public class CPU_Scheduling {
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

    private static int scheduling(int[] arr) {
        sort(arr);
        int exe_time = 0;
        int wait_time = 0;
        for (int i = 0; i < arr.length; i++) {
            wait_time+= exe_time;
            exe_time  += arr[i];
            

        }
        return wait_time;
    }

    public static void main(String[] args) {
        int[] Bt = { 4, 3, 7, 1, 2 };
        System.out.println(scheduling(Bt));
    }
}
