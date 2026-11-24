
import java.util.Scanner;

public class ArrayStringsAreEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] word1 = new String[n];

        for (int i = 0; i < n; i++) {
            word1[i] = sc.next();
        }

        int m = sc.nextInt();
        String[] word2 = new String[m];

        for (int i = 0; i < m; i++) {
            word2[i] = sc.next();
        }

        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        for (String w : word1) {
            s1.append(w);
        }

        for (String w : word2) {
            s2.append(w);
        }

        System.out.println(s1.toString().equals(s2.toString()));

        sc.close();
    }
}
