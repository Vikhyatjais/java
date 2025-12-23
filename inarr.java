import java.util.Scanner;
public class inarr {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("enter size of array: ");
     int n = sc.nextInt();
     int [] arr = new int[n];
     for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
     }
    System.out.println("Enter value to search: ");
    int key = sc.nextInt();
    boolean found = false;
    for(int num:arr){
        if(num==key){
          found=true;
          break;
        }
    
    } 
    if(found){
        System.out.println("Present in array");
    }
    else{
        System.out.println("Not Present in array");
    }  sc.close();    
    }
    
}
