/* public class ExceptionHandling {
    public static void main(String[] args) {
        String s = null;
        try{
            System.out.println(s.toUpperCase());
            System.out.println("Inside Try Block");
        }
        catch(ArithmeticException e){
            System.out.println("String is currently empty"+e.getMessage());
        }
        catch(NullPointerException e){
            System.out.println("String is null, cannot perform operation: "+e.getMessage());

        }  
        catch(Exception e){
            System.out.println("Some other exception occurred: "+e.getMessage());
        }  
    }
    
}

class MultiCatch{
    public static void main(String[] args) {
        try{
            String [] data = {"123","456","789","abc"};
            int num = Integer.parseInt(data[4]);
            System.out.println("Number is: "+num);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index is out of bounds: "+e.getMessage());
        }
        catch(NumberFormatException e){
            System.out.println("Invalid number format: "+e.getMessage());
        }
        finally{
            System.out.println("Multiple catch blocks executed.");
        }
    }
}
    
class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}
class StudentResultProcessing{
    public static void calculateGrade(int marks) throws InvalidAgeException{
        if(marks<0 || marks>100){
            throw new InvalidAgeException("Marks should be between 0 and 100");
        }
        else{
            if(marks>=90){
                System.out.println("Grade: A");
            }
            else if(marks>=80){
                System.out.println("Grade: B");
            }
            else if(marks>=70){
                System.out.println("Grade: C");
            }
            else if(marks>=60){
                System.out.println("Grade: D");
            }
            else{
                System.out.println("Grade: F");
            }
        }
    }   

    public static void main(String[] args) {
        try{
            calculateGrade(85);
            calculateGrade(105);
        }
        catch(InvalidAgeException e){
            System.out.println("Exception: "+e.getMessage());
        }       
    }
}
*/
import java.util.*;
class InvalidQuantity extends Exception{
    public InvalidQuantity(String message){
        super(message);
    }
}
class Shopping{
    public static void QuantityCheck(int quantity,int amount) throws InvalidQuantity{
       if(quantity<amount){
        throw new InvalidQuantity("Quantity should be less than available amount");
       }
       else{
        quantity -= amount;
        System.out.println("Remaining quantity: "+quantity);
        System.out.println("Order placed successfully");
       }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        int quantity = sc.nextInt();
        try{
            QuantityCheck(quantity, amount);
        }
        catch(InvalidQuantity e){
            System.out.println("Exception: "+e.getMessage());
        }
        sc.close();
}
}        
