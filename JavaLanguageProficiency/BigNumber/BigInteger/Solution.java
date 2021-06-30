import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger A = scanner.nextBigInteger();
        BigInteger B = scanner.nextBigInteger();

        BigInteger C = A.add(B);
        BigInteger D = A.multiply(B);

        System.out.println(C);
        System.out.println(D);
    }
}
