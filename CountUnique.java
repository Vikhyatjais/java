import java.util.Scanner;
public class CountUnique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // boolean array to mark digits (0-9)
        boolean[] seen = new boolean[10];
        int count = 0;

        while (num > 0) {
            int digit = (num % 10); // extract last digit
            if (!seen[digit]) {
                seen[digit] = true; // mark digit as seen
                count++;            // increase unique count
            }
            num /= 10; // remove last digit
        }

        System.out.println("Unique digits count: " + count);
        sc.close();
    }

}
