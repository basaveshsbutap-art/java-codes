
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class DifferenceOfArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums1 = new int[n];

        for (int i = 0; i < n; i++) {
            nums1[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] nums2 = new int[m];

        for (int i = 0; i < m; i++) {
            nums2[i] = sc.nextInt();
        }

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            set2.add(num);
        }

        System.out.print("Only in first array: ");

        for (int num : set1) {
            if (!set2.contains(num)) {
                System.out.print(num + " ");
            }
        }

        System.out.print("\nOnly in second array: ");

        for (int num : set2) {
            if (!set1.contains(num)) {
                System.out.print(num + " ");
            }
        }

        sc.close();
    }
}
