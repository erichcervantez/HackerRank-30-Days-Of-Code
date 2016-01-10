package main.java;

import java.util.*;

/**
 * https://www.hackerrank.com/contests/30-days-of-code/challenges/day-4-boolean-operators-class-vs-instance
 */
public class Day_4_Logical_Operators
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++)
        {
            int age = sc.nextInt();
            Person p = new Person(age);
            p.amIOld();
            for (int j = 0; j < 3; j++)
            {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
    }
}

class Person
{
    int age;

    public Person(int initial_Age)
    {
        if (initial_Age < 0)
        {
            initial_Age = 0;
            System.out.println("This person is not valid, setting age to 0.");
        }
        else
        {
            this.age = initial_Age;
        }
    }

    public void amIOld()
    {
        if (age < 13)
            System.out.println("You are young.");
        else if (age >= 13 && age < 18)
            System.out.println("You are a teenager.");
        else
            System.out.println("You are old.");
    }

    public void yearPasses()
    {
        age++;
    }
}
