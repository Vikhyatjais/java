import java.util.*;
public class ParagraphUnique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a paragraph:");
        String para = sc.nextLine();
        String words[] = para.toLowerCase().split("\\W+");
        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));
        System.out.println("Unique words in the paragraph:");
        for (String word : uniqueWords) {
            System.out.println(word);
        }   

    }
    
}
