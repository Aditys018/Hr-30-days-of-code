import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); 
        int tipPercent = scan.nextInt(); 
        int taxPercent = scan.nextInt(); 
        scan.close();

        
        double tip = mealCost * tipPercent / 100;
        double tax = mealCost * taxPercent / 100;

        
        int totalCost = (int) Math.round(mealCost + tip + tax);

       
        System.out.println(totalCost);
    }
}


