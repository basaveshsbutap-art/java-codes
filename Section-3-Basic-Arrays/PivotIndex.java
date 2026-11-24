
import java.util.Scanner;

public class PivotIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        int total = 0;

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            total += nums[i];
        }

        int leftSum = 0;
        int pivot = -1;

        for (int i = 0; i < n; i++) {
            int rightSum = total - leftSum - nums[i];

            if (leftSum == rightSum) {
                pivot = i;
                break;
            }

            leftSum += nums[i];
        }

        System.out.println(pivot);
        sc.close();
    }
}
