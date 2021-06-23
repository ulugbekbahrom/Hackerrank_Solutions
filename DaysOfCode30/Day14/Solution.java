import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
    private int[] elements;
    public int maximumDifference;

    public Difference(int[] elements){
        this.elements = elements;
    }

    // Add your code here
    public void computeDifference(){
        int n = elements.length;
        int min  = 100;
        int max = 1;

        for(int element : elements){
            if(element < min)
                min = element;
            if(element > max)
                max = element;
        }
        maximumDifference = max - min;
    }

} // End of Difference class



