import java.util.*;
public class hashset {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];
        for(int i=0;i<5;i++){
            sc.nextInt();
        }
     
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        
        System.out.println(set);
        sc.close();

        /*set.add(10);    
        set.add(20);
        set.add(30);


        boolean contained = set.contains(20);
        System.out.println("Is 20 present? " + contained);
        set.remove(10); 
        System.out.println("HashSet after removing 10: " + set);


        boolean isEmpty = set.isEmpty();
        System.out.println("Is HashSet empty? " + isEmpty);




        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }*/
       
        for(int i=0;i<5;i++){
            set.add(sc.nextInt());
        }
        System.out.println(set);
        
        /*
         * HashMap<Integer,Integer> map = new HashMap<>();
         * for(int i=0;i<5;i++) map.put(i, sc.nextInt());
         * System.out.println(map);
         */
        
}
}
