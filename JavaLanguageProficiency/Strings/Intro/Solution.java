import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        int lengthOfA = A.length();
        int lengthOfB = B.length();
        int sum = lengthOfA + lengthOfB;
        System.out.println(sum);

        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");

        String firstLetterA = A.substring(0, 1).toUpperCase();
        String restA = A.substring(1);

        String firstLetterB = B.substring(0, 1).toUpperCase();
        String restB = B.substring(1);

        String newA = firstLetterA + restA;
        String newB = firstLetterB + restB;
        System.out.println(newA + " " + newB);
    }
}