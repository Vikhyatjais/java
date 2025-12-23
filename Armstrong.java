import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arm=0,rem,temp;
        temp=n;
        int digits = String.valueOf(n).length();
        while(n>0){
            rem=n%10;
            arm+=Math.pow(rem, digits);
            n=n/10;
        }
        if(temp==arm){
            System.out.print("Armstrong No");
        }
        else{
            System.out.print("Not Armstrong No");
        }sc.close();
    }
}
