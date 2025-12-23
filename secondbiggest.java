import java.util.Scanner;
public class secondbiggest {
    public static void main(String args[]){
    System.out.print("Enter a values: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if ((a > b && a < c) || (a > c && a < b)) {
            System.out.println("The second largest number is: " + a);
        }
        else if ((b > a && b < c) || (b > c && b < a)) {
            System.out.println("The second largest number is: " + b); 
        }
        else {
            System.out.println("The second largest number is: " + c);
        }

        sc.close();


    }
}
        