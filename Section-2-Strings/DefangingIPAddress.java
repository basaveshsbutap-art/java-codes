
import java.util.Scanner;

public class DefangingIPAddress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String address = sc.nextLine();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < address.length(); i++) {

            char ch = address.charAt(i);

            if (ch == '.') {
                result.append("[.]");
            }
            else {
                result.append(ch);
            }
        }

        System.out.println(result);
        sc.close();
    }
}
