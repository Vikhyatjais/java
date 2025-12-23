 /*class sum{
    void sum( int x, int y){
        int z = x+y;
        System.out.print(z);
    }    
    void sum (double x,double y){
        double z =x+y;
    }
}
class suma{
    public static void main(String[] args) {
        sum obj = new sum();
        obj.sum(4,5);
        obj.sum(3.2,4.1);
    }
}
class person{
    void role(){
        System.out.println("I am person");
    }
}
class father extends person{
    void role(){
        System.out.println("I am father");
    }
}
class prac{
    public static void main(String[] args) {
        father obj = new father();
        person obj1 = new person();
        person obj2 = new father();
        obj.role();
        obj1.role();
        obj2.role();
    }
}
abstract class Doctor{
    abstract void TreatPatient();
    void HospitalInfo(){
        System.out.println("MAX Hospital");
    }
    String Name;
    Doctor(String Name){
        this.Name=Name;
    }
}
class Dentist extends Doctor{
    Dentist(String Name){
        super(Name);
    }
    void TreatPatient(){
        System.out.println(Name + "is treating dental cases");
    }
}
class cardiologist extends Doctor{
    cardiologist(String Name){
        super(Name);
    }
    void TreatPatient(){
        System.out.println(Name + "is treating heart cases");
    }
}
public class prac {

    public static void main(String[] args) {
        Doctor d = new Dentist("Dr. James");
        Doctor c = new cardiologist("Dr. Rahul");
        d.HospitalInfo();
        d.TreatPatient();
        c.HospitalInfo();
        c.TreatPatient();

    }
}
//create a abstract class delivery class may have abstract and non method,create subclass for deliver role 1. Standard delivery 2. Express delivery while impenting the delivery modes a customer will be charged 5%  for standard deliver and 10% for express delivery . display and calculate the final delivery charges. 
abstract class Delivery{
    double baseAmount;
    abstract double CalculateCharges();
    Delivery(double baseAmount){
        this.baseAmount=baseAmount;
    }
    void displaycharges(){
        System.out.println("Final Delivery Charges: " + CalculateCharges());
    }
}
class StandardDelivery extends Delivery{
    StandardDelivery(double baseAmount){
        super(baseAmount);
    }
    double CalculateCharges() {
        return baseAmount + (baseAmount * 0.05); 
    }
}
class ExpressDelivery extends Delivery{
    ExpressDelivery(double baseAmount){
        super(baseAmount);
    }
    double CalculateCharges() {
        return baseAmount + (baseAmount * 0.10); 
    }
}
public class prac{
    public static void main(String[] args) {
        Delivery a = new ExpressDelivery(150);
        a.displaycharges();
        Delivery b = new StandardDelivery(100);
        b.displaycharges();
    }
}*/
interface square {
    int sq(int x);   
}
class prac{
    public static void main(String[] args) {
        square obj = (x) -> x*x;
        System.out.print(obj.sq(5));
    }
}

