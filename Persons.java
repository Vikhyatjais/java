class Person {
    void role() { System.out.println("Person has many roles"); }
}
class Father extends Person {
    void role() { System.out.println("Father role"); }
}
class Husband extends Person {
    void role() { System.out.println("Husband role"); }
}
class Employee extends Person {
    void role() { System.out.println("Employee role"); }
}
public class Persons {
    public static void main(String[] args) {
        Person p;
        p = new Father();
	p.role();
        p = new Husband();
	p.role();
        p = new Employee();
	p.role();
    }
}
