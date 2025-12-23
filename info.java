import java.util.Scanner;
public class info {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age =  sc.nextInt();
        float cgpa =  sc.nextFloat();
        char grade = sc.next().charAt(0);
        System.out.println(name);
        System.out.println(age);
        System.out.println(cgpa);
        System.out.println(grade);
        sc.close();
    }
    
}
