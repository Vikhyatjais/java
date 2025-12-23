import java.util.Scanner; 
public class membership {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      String name = sc.nextLine();
      System.out.print("Enter membership type (Monthly/Yearly): ");
        String membershipType = sc.nextLine();
        System.out.println("\n--- Registration Details ---");
        System.out.println("Name: " + name);
        System.out.println("Membership Type: " + membershipType);
        System.out.println("----------------------------");
        System.out.println("Registration Successful!");
        
        sc.close();  
    }
    
}
