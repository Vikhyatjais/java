import java.util.*;
public class Anagram {
    static boolean isAnagram(String a, String b) {
        char[] c1 = a.toLowerCase().toCharArray();
	    char[] c2 = b.toLowerCase().toCharArray();
        Arrays.sort(c1); 
	    Arrays.sort(c2);
        return Arrays.equals(c1, c2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
	    String b = sc.nextLine();
        System.out.println(isAnagram(a, b) ? "Anagrams" : "Not Anagrams");
        sc.close();
    }
}
