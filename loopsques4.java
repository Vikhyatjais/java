import java.util.Scanner;
public class loopsques4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum=0;
        for(int i=1;i<=10;i++){
            sum=sum+(a*i);
        } 
        System.out.println(sum);
        sc.close();
    }

}
