package Day6.assignment6;

import java.util.Scanner;

public class LargestDiff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); 
        int[] arr = new int[n];

        // Read array elements
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        int resultIndex = findMaxDistance(arr, n);
        System.out.println(resultIndex);
    }

    public static int findMaxDistance(int[] arr, int n) {
        if (n < 2) {
            return -1; 
        }

        int maxDiff = 0;
        int index = -1;

        for (int i = 0; i < n - 1; i++) {
            int diff = Math.abs(arr[i] - arr[i + 1]);

            if (diff > maxDiff) {
                maxDiff = diff;
                index = (arr[i] > arr[i + 1]) ? i : i + 1; 
            }
        }

        return index;
    }
}

