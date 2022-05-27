
import java.lang.Math;

class MinMax {
    public static void main(String[] args) {
        int[] arr = new int[11];
        int min = 101, max = 0;

        for (int i = 0; i <= 10; i++) {
            int rand = (int) (Math.random() * (101 - 1));
            arr[i] = rand;
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
            System.out.println(arr[i]);
        }
        System.out.println("Min: " + (min));
        System.out.println("Max: " + (max));
    }
}
