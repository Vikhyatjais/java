import java.util.*;
class ArrayListDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
       /*  list.add(11);
        list.add(22);
        System.out.println("ArrayList: " + list);
        list.remove(0);
        list.set(0, 33);
        list.add(1, 44);
        System.out.println(list);
        System.out.println("Checking if ArrayList contains 22: " + list.contains(22));
        Collections.sort(list);
        System.out.println("Sorted ArrayList: " + list);

        //Iterating in ArrayList using Iterator
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        list.clear();
        System.out.println("ArrayList after clear(): " + list);
        System.out.println("Is ArrayList empty? " + list.isEmpty());

        */
        for(int i=0;i<5;i++){
            list.add(sc.nextInt());
        }
        System.out.println("ArrayList: " + list);
        //System.out.println("Size of ArrayList: " + list.size());
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(2));
            sc.close();
        }
    }
    
}
