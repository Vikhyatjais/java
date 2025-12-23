import java.util.*;
public class rev {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("size of arr: ");
     int n = sc.nextInt();
     int [] arr = new int[n];
     System.out.println("enter elements of arr: ");
     for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
     } 
     for(int i=0;i<n/2;i++){
        int temp=arr[i];
        arr[i]=arr[n-i-1];
        arr[n-i-1]=temp;

     } 
     System.out.println("Reversed array: ");
     for(int num: arr){
        System.out.print(num+" ");
     }
     sc.close();
    }
    
}
