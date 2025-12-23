import java.util.*;
class Generic {
    public static void main(String[] args) {
        //Before generic we use arraylist like this:
        {
        ArrayList list = new ArrayList();
        list.add("Hello");
        list.add(12);


        String str = list.get(0); //it will throw error 
        Object o = list.get(1); // this is fine
        //we dont need need object , we just need string or integer value

        String str1 = (String) list.get(0);
        Integer i = (Integer) list.get(1);
        //but for how many object we can do this. also it is not type safe 
        //now we have generic to tell user for specific type of data 

        }
        ArrayList<String> list1  = new ArrayList<String>();
        list1.add("hello");
        list1.add("world");
        String str1  = list1.get(0);
        String str2 = list1.get(1);    
}
}
