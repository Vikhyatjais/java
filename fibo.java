import java.util.Scanner;
public class fibo {
    public static int fibo(int num){
        if(num==0||num==1){
            return num;
        }
        else{
            return fibo(num-1)+fibo(num-2);
        }
    }
    public static void main(String[] args) {
        System.out.println("fibo for #5 : "+ fibo(5));
       /*  Scanner sc = new Scanner(System.in);
        System.out.print("Enter No of terms : ");
        int n = sc.nextInt();
        int a=0,b=1;
        for(int i=1;i<=n;i++){
            System.out.print(a + " ");
            int next = a+b;
            a=b;
            b=next;
        }
        sc.close();*/


    }
    
}
