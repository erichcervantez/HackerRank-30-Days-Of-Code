package main.java;

import java.util.*;

/**
 * https://www.hackerrank.com/contests/30-days-of-code/challenges/day-3-if-statements
 */
public class Day_3_If_Else_Statements
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        //use modulus operator to determine if N is odd
        if (N % 2 != 0)
        {
            //remainder of N/2 is not 0, meaning odd
            System.out.println("Weird");
        }
        else if ((N % 2 == 0) && (N >= 2 && N <= 5))
        {
            //remainder of N/2 is 0, meaning even
            System.out.println("Not Weird");
        }
        else if ((N % 2 == 0) && (N >= 6 && N <= 20))
        {
            //remainder of N/2 is 0, meaning even
            System.out.println("Weird");
        }
        else if ((N % 2 == 0) && N > 20)
        {
            //remainder of N/2 is 0, meaning even
            System.out.println("Not Weird");
        }
    }
}
