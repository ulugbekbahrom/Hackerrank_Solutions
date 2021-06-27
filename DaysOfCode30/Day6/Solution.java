import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String str;

        for (int i = 0; i < number; i++) {
            str = scanner.next();

            for (int j = 0; j < str.length(); j += 2) {
                System.out.print(str.charAt(j));
            }

            System.out.print(" ");

            for (int j = 1; j < str.length(); j += 2) {
                System.out.print(str.charAt(j));
            }

            System.out.println();
        }
    }
}
