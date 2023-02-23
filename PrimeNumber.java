package com.bridgelabz;

public class PrimeNumber
{
    public static void main (String[]args)
     {
    int n = 23;
    checkPrime(n);
     }
    private static void checkPrime(int n) {
        int count = 0;
        if (n < 2)
            System.out.println ("The given is number " + n + " is not prime");
        for (int i = 1; i <= n; i++)
        {
            if (n % i == 0)
                count += 1;
        }
        if (count > 2)
            System.out.println ("The given is number " + n + " is not prime");

        else
            System.out.println ("The given is number " + n + " is prime");
    }
}
