import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // edge cases
        if (a.length() != b.length() || a.equals("null") || b.equals("null")) {
            return false;
        }

        a = a.toLowerCase();
        b = b.toLowerCase();

        int[] alphabet = new int[26];

        for (int i = 0; i < a.length(); i++) {
            alphabet[a.charAt(i) - 'a']++;
        }

        for (int j = 0; j < b.length(); j++) {
            alphabet[b.charAt(j) - 'a']--;
        }

        for (int letter : alphabet) {
            if (letter != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
