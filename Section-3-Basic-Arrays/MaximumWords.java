
import java.util.Scanner;

public class MaximumWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int maxWords = 0;

        for (int i = 0; i < n; i++) {
            String sentence = sc.nextLine().trim();

            if (sentence.isEmpty()) {
                continue;
            }

            String[] words = sentence.split("\\s+");

            if (words.length > maxWords) {
                maxWords = words.length;
            }
        }

        System.out.println(maxWords);
        sc.close();
    }
}
