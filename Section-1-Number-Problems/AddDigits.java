
public class AddDigits {
    public static void main(String[] args) {

        int num = 38;

        while (num >= 10) {
            int sum = 0;

            while (num > 0) {
                int digit = num % 10;
                sum = sum + digit;
                num = num / 10;
            }

            num = sum;
        }

        System.out.println("Single Digit Sum: " + num);
    }
}
