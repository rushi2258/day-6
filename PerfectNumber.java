package com.bridgelabz;

public class PerfectNumber
{
    public static void main(String[]args)
    {
        int n1=28;
         int sum = 0;
         for (int i =1;i<n1;i++)
         {
             if (n1 % i == 0)
                 sum = sum + i;
         }
         if (sum==n1)
             System.out.println(n1 + " Is a Perfect Number");
         else
             System.out.println(n1 + " Is not a Perfect Number");
    }
}
