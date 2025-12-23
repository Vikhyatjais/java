//create a class to showcase the usage of static, instance var . use constructor to intialise the var and print the object state and fields using the regular method
class Student {
    
    static String college = "GLA";
    int rollNo;
    String name;

    
    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    
    void display() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo + ", College: " + college);
    }

    public static void main(String[] args) {
       
        Student s1 = new Student(48, "Vikhyat");


       
        s1.display();
        

       
       
    }

}
    

