
import java.util.Scanner;

public class PlusOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] digits = new int[n];

        for (int i = 0; i < n; i++) {
            digits[i] = sc.nextInt();
        }

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                break;
            }

            digits[i] = 0;
        }

        if (digits[0] == 0) {
            int[] result = new int[n + 1];
            result[0] = 1;

            for (int i = 0; i < n + 1; i++) {
                System.out.print(result[i] + " ");
            }
        } else {
            for (int i = 0; i < n; i++) {
                System.out.print(digits[i] + " ");
            }
        }

        sc.close();
    }
}
