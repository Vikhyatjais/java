import java.util.Scanner;
public class sumarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int[] arr= new int[n];
        int sum = 0;
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum = sum+arr[i];
            
            
        }
        System.out.println("Sum of elements of array: "+sum);
        System.out.println(arr.length);
        sc.close();
        /*
        without taking input 
        int [] arr={1,2,3,4,5}
        int sum=0
        for(int element:arr){
        sum=sum+element
        }
        print sum
         */
    }
    
}
