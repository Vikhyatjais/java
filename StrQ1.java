import java.util.*;
public class StrQ1 {
    //write a program to implement following string functions : length(),charat(),indexof(),lastindexof(),lowercase(),uppercase(),replace(),append()
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
         System.out.println("Length of string: " + str.length());
         System.out.print("Enter index to find character: ");
        int index = sc.nextInt();
        if (index >= 0 && index < str.length()) {
            System.out.println("Character at index " + index + ": " + str.charAt(index));
        } else {
            System.out.println("Invalid index!");

        }
        System.out.print("Enter character/word to find index of: ");
        String word1 = sc.nextLine();
        System.out.println("First occurrence index: " + str.indexOf(word1));
        System.out.println("Lowercase string: " + str.toLowerCase());
        System.out.println("Uppercase string: " + str.toUpperCase());
        System.out.print("Enter substring to replace: ");
        String oldSub = sc.nextLine();
        System.out.print("Enter new substring: ");
        String newSub = sc.nextLine();
        System.out.println("After replacement: " + str.replace(oldSub, newSub));
        System.out.print("Enter string to append: ");
        String appendStr = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        sb.append(appendStr);
        System.out.println("After append: " + sb);

        sc.close();

        
    }
    
}
