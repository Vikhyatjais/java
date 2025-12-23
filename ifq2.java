import java.util.*;
public class ifq2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature:  ");
        int temp = sc.nextInt();
        if(temp>0 & temp<40){
            System.out.println("Safe for outdoor activities");
        }else if(temp>40){
            System.out.println("Tooo Hot!!! ");
        }
        else{
            System.out.println("Too cold!!! ");
        }
        sc.close();
    }
    
}
