import java.util.Scanner;
import java.util.Arrays;

public class Sort {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Length of arr: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        int t = 0;
        for (int i = 0; i < n; i++) {
            System.out.printf("%oth element: ", i + 1);
            arr[i] = input.nextInt();
            t += arr[i];
        }
        Arrays.sort(arr);
        System.out.printf("Sorted arr[] : %s\n", 
                           Arrays.toString(arr));
        System.out.printf("Mean value of arr : %f", 
                          1f*t/n);
        input.close();
	System.exit(0);
    }
}