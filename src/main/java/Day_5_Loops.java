package main.java;

import java.util.*;

/**
 * https://www.hackerrank.com/contests/30-days-of-code/challenges/day-5-loops
 */
public class Day_5_Loops
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i = 0; i < T; i++)
        {
            double a = scanner.nextDouble();
            int b = scanner.nextInt();
            int N = scanner.nextInt();

            Double answer = a;
            for (int x = 0; x < N; x++)
            {
                answer += Math.pow(2, x) * b;
                System.out.print(answer.intValue() + " ");
            }

            System.out.println();
        }

    }
}
