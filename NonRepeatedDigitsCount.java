import java.util.Scanner;
public class NonRepeatedDigitsCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num = sc.nextLong();

        int[] freq = new int[10]; // frequency array for digits 0-9

        // count frequency of each digit
        long temp = num;
        while (temp > 0) {
            int digit = (int)(temp % 10);
            freq[digit]++;
            temp /= 10;
        }

        // count digits that appear exactly once
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (freq[i] == 1) {
                count++;
            }
        }

        System.out.println("Count of non-repeated digits: " + count);
        sc.close();
    }
}
