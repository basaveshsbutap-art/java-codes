
import java.util.Scanner;

public class ConcatenationArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] result = new int[2 * n];

        for (int i = 0; i < n; i++) {
            result[i] = nums[i];
            result[i + n] = nums[i];
        }

        for (int i = 0; i < 2 * n; i++) {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}
