import java.util.*;
public class binarysearch {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        // Step 1: Input size of array
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Step 2: Input sorted array
        System.out.println("Enter " + n + " elements in sorted order:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 3: Input key to search
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        // Step 4: Binary Search
        int low = 0, high = n - 1;
        boolean found = false;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                System.out.println("Element found at index: " + mid);
                found = true;
                break;
            } else if (arr[mid] < key) {
                low = mid + 1;  // search right half
            } else {
                high = mid - 1; // search left half
            }
        }

        if (!found) {
            System.out.println("Element not found in array.");
        }
        sc.close();
    }
    
}
