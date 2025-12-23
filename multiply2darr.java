import java.util.*;
public class multiply2darr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows of arr1: ");
        int r1 = sc.nextInt();
        System.out.print("Enter no of cols of arr1: ");
        int c1 = sc.nextInt();
        int [][] arr1 = new int[r1][c1];
        System.out.print("Enter no of rows of arr2: ");
        int r2 = sc.nextInt();
        System.out.print("Enter no of cols of arr2: ");
        int c2 = sc.nextInt();
        int [][] arr2 = new int[r2][c2];
        int [][] result = new int[r1][c2]; 
        if(c1!=r2){
            System.out.println("Multiplication not possible.");
            System.exit(0);
        }
        System.out.println("enter elements of arr1: ");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                arr1 [i][j] = sc.nextInt();

            }
        }
        System.out.println("enter elements of arr2: ");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                arr2 [i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                result [i][j]=0;
                for(int k=0;k<c1;k++){
                    result[i][j] = result[i][j] + arr1[i][k]*arr2[k][j];
                }
            }
        }
        System.out.println("Result of multiplication: ");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
