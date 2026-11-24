
import java.util.Scanner;

public class LengthOfLastWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int i = s.length() - 1;

        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        int count = 0;

        while (i >= 0 && s.charAt(i) != ' ') {
            count++;
            i--;
        }

        System.out.println(count);
        sc.close();
    }
}
