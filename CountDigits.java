public class CountDigits {
    
    public static void main(String[] args) {
        int number = 123450;
        // int count = 0;
        
        // while (number != 0) {
        //     number /= 10; 
        //     count++;     
        // }
         if (number < 0) {
            number = number * -1;
        }
        if(number == 0){
            System.out.println(1);
            return;
        }
        System.out.println((int)(Math.log10(number)) + 1);
    }
}
