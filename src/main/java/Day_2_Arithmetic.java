package main.java;

import java.util.*;

public class Day_2_Arithmetic
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double M = scanner.nextDouble();
        int T = scanner.nextInt();
        int X = scanner.nextInt();
        double tip = (T * M) / 100;
        double tax = (M * X) / 100;
        double finalPrice = M + tip + tax;
        System.out.println("The final price of the meal is $" + Math.round(finalPrice) + ".");
    }
}
