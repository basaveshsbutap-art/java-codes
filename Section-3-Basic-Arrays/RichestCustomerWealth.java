
import java.util.Scanner;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] accounts = new int[m][n];

        int maxWealth = 0;

        for (int i = 0; i < m; i++) {
            int sum = 0;

            for (int j = 0; j < n; j++) {
                accounts[i][j] = sc.nextInt();
                sum += accounts[i][j];
            }

            if (sum > maxWealth) {
                maxWealth = sum;
            }
        }

        System.out.println(maxWealth);
        sc.close();
    }
}
