import java.util.Scanner;
public class Percentage{
    public static void main(String args[]){
        Scanner a = new Scanner(System.in);
        int num1=a.nextInt();
        int num2=a.nextInt();
        int num3=a.nextInt();
        int num4=a.nextInt();
        int num5=a.nextInt();
        int total=num1+num2+num3+num4+num5;
        double Percent=(total/500.0)*100;
        System.out.print(Percent);
        a.close();
    }
}