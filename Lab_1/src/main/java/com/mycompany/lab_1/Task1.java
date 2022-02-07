
package com.mycompany.lab_1;
import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Task1 {
    
    static int sumOfallPrimes(int n)
    {
        boolean prime[]=new boolean[n + 1];
        Arrays.fill(prime, true);
      
        for (int p = 2; p * p <= n; p++) {
            if (prime[p] == true) {
                for (int i = p * 2; i <= n; i += p)
                    prime[i] = false;
            }
        }
        int sum = 0;
        for (int i = 2; i <= n; i++)
            if (prime[i])
                sum += i;
        return sum;
    }
    public static void main(String args[])
    {
        int n = 100;
        System.out.print(sumOfallPrimes(n));
    }
}