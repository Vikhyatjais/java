public class MyObj {
    static class Student{
        String name;
        int roll_no;
        public void printdetails(){
            System.out.println("My Name is: " + name);
            System.out.println("My Roll No: " + roll_no);
        }
    
    }
    public static void main(String[] args) {
        Student vikhyat = new Student();
        vikhyat.name = "Vikhyat Jaiswal";
        vikhyat.roll_no = 48;
        vikhyat.printdetails();

        
    }
    
}
