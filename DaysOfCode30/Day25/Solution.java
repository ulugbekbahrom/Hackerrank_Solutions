import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int T = input.nextInt();

        while (T-- > 0) {
            int number = input.nextInt();
            System.out.println(isPrime(number) ? "Prime" : "Not prime");
        }
    }

    public static boolean isPrime(int number) {

        if (number <= 1) {
            return false;
        } else if (number == 2) {
            return true;
        } else if (number % 2 == 0) {
            return false;
        }

        int sq = (int) Math.sqrt(number);
        for (int i = 3; i <= sq; i += 2) {

            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
