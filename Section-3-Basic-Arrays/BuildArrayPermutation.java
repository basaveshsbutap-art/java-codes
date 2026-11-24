
import java.util.Scanner;

public class BuildArrayPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = nums[nums[i]];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}
