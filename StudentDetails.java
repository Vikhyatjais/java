class StudentDetails {
    private String name;
    private int roll_no;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
        System.out.println("NAME: "+name);
    }
    public int getRoll(){
        return roll_no;
    }
    public void setRoll(int roll_no){
        this.roll_no=roll_no;
        System.out.println("ROLL NO: "+ roll_no);
    }

    
}
class PrintDetails{
    public static void main(String[] args) {
        StudentDetails s = new StudentDetails();
        s.setName("Vikhyat");
        //System.out.println(s.getName());
        s.setRoll(48);
       //System.out.println(s.getRoll());
    }
}
