import java.util.Scanner;
public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       /*  System.out.print("Enter a No: ");
        int n = sc.nextInt();
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }if(count==2){
            System.out.println("Prime NO");
        }
        else{
            System.out.println("Not a Prime N0");*/
            int i,j;
        System.out.print("Enter the starting range: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the ending range: ");
        int n2 = sc.nextInt();
        for( i=n1;i<=n2;i++){
            for( j=2;j<=i;j++){
                if(i%j==0){
                    break;
                }
            }if( i==j){
                System.out.println(j+" ");
            }
        }sc.close();
        }
    
    }

