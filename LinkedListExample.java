import java.util.*;
public class LinkedListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        /*for(int i=0;i<5;i++){
            list.add(sc.nextInt());
        }
        System.out.println("LinkedList: " + list);
        //System.out.println("Size of LinkedList: " + list.size());
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }*/
        list.add(10);
        list.add(20);   
        list.add(1, 15);
        System.out.println("LinkedList: " + list);
        sc.close();
    
        
    
}
}
