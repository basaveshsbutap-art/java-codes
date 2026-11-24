
import java.util.Scanner;

public class KidsWithCandies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] candies = new int[n];

        int max = 0;

        for (int i = 0; i < n; i++) {
            candies[i] = sc.nextInt();

            if (candies[i] > max) {
                max = candies[i];
            }
        }

        int extraCandies = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print((candies[i] + extraCandies >= max) + " ");
        }

        sc.close();
    }
}
