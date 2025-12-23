class parameterconstructor {
    int roll;
    String name;
    parameterconstructor(int x , String y){
        roll = x ;
        name = y;
    }
    /*parameterconstructor(){
        System.out.println("Default constructor");
    }*/
    public static void main(String[] args) {
        parameterconstructor obj1 = new parameterconstructor(48,"Vikhyat");
        System.out.println(obj1.roll);
        System.out.println(obj1.name);
        
    }
    //create a class using static var and method
    // create a class with constructor
    //create a class with  instance var using constructor

    
}
