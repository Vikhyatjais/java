import java.util.Scanner;
public class StrMethod{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        name = name.toLowerCase();
        System.out.println(name);
        name = name.toUpperCase();
        System.out.print(name);
        sc.close();

    }

}