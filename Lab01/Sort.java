import java.util.Scanner;
import java.util.Arrays;

public class Sort {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Length of array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int m = 0;
        for (int i = 0; i < n; i++) {
            System.out.printf("%oth element: ", i + 1);
            arr[i] = scanner.nextInt();
            m += arr[i];
        }
        Arrays.sort(arr);
        System.out.printf("Sorted array: %s\n", Arrays.toString(arr));
        System.out.printf("Mean value: %.2f", 1f*m/n);
        scanner.close();
	System.exit(0);
    }
}
