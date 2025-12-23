import java.util.Scanner;
public class loopswhile {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int i = sc.nextInt();
    int a = sc.nextInt();
    while (i<=a) {
        System.out.println(i);
        i++;
       sc.close(); 
    }
    }
    
}
