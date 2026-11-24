
import java.util.Scanner;

public class ReversePrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();
        char ch = sc.next().charAt(0);

        int index = word.indexOf(ch);

        char[] arr = word.toCharArray();

        if (index != -1) {
            int left = 0;
            int right = index;

            while (left < right) {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }

        System.out.println(new String(arr));
        sc.close();
    }
}
