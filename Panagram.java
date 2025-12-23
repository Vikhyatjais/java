import java.util.*;
public class Panagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.replaceAll(" ","").toLowerCase();
        boolean [] arr = new boolean[26];
        int index = 0;
        int flag = 1;

        // Check each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                index = ch - 'a';
                arr[index] = true;
            }
        }

        // Verify if all letters are present
        for (int i = 0; i < 26; i++) {
            if (!arr[i]) {
                flag = 0;
                break;
            }
        }

        if (flag == 1)
            System.out.println("The sentence is a pangram!");
        else
            System.out.println("The sentence is NOT a pangram.");

        sc.close();

        }
        
    }
    

