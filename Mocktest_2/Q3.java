

import java.util.*;

public class Q3 {
    public static void main(String args[]) {
        int i = 0;
        float sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        float arr[] = new float[n];
        System.out.println("Enter " + n + " array elements: ");
        do {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
            i++;
        } while (i < n);
        float average = sum / n;
        System.out.println("Average of number is : " + average);

    }

}
