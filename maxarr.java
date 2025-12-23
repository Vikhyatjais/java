import java.util.*;
public class maxarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr size of array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter array: ");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
    
        }
        int max = arr[0];
        for(int i=0;i<n;i++ ){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Max no in array : "+ max);
        sc.close();
    }
    
    
}
