
import java.util.Scanner;

public class EvenDigitNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        int count = 0;

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();

            int num = nums[i];
            int digits = 0;

            while (num > 0) {
                digits++;
                num /= 10;
            }

            if (digits % 2 == 0) {
                count++;
            }
        }

        System.out.println(count);
        sc.close();
    }
}
