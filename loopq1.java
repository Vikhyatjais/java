import java.util.Scanner;
public class loopq1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        int total = 0;
        for(int i=0;i<=days;i++){
            total += (i*i);
        }
        System.out.println(total);
        sc.close();
        
    }
}
