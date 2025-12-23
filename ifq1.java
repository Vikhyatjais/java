import java.util.*;
public class ifq1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value less than 6: ");
        int a = sc.nextInt();
        
        if(a < 6){   
            if(a == 5){
                System.out.println("The no is : 5");
            } else if(a == 4){
                System.out.println("The no is : 4");
            } else if(a == 3){
                System.out.println("The no is : 3");
            } else if(a == 2){
                System.out.println("The no is : 2");
            } else if(a == 1){
                System.out.println("The no is : 1");
            } else {
                System.out.println("Number is less than 6 but not between 1-5");
            }
        } else {
            System.out.println("Invalid input! Please enter a value less than 6.");
        }
        
        sc.close();
    }   
}
