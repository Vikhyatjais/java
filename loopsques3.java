import java.util.Scanner;
public class loopsques3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++){
            sum=sum+(2*i);
            
        }
        System.out.println(sum);
        sc.close();
    } 

    
}
