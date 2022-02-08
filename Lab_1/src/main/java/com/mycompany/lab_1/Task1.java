
package com.mycompany.lab_1;
import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Task1 {

	public static void main(String[] args) 
	{
		int i, number = 1, count, sum = 0, sum2 = 0, sum3 =0;//declaring varibles
		
		while(number <= 100)
		{
			count = 0;
			i = 2;
		    while(i <= number/2 )
		    {
		    	if(number % i == 0)
		    	{
		    		count++;
		    		break;
		    	}
		    	i++;
		    }
                    //Where we find the numbers that are prime
		    if(count == 0 && number != 1 )
		    {
		    	sum = sum + number;
		    }
                    
                    //Where we find the numbers with a 3
                    if(number > 0)
                    {
                    if(number % 10 == (3) )
                        sum2 = sum2 + number;
                    
                    }
                    
                    //Where we find the numbers with a 3 or 5
                    if(number > 0)
                    {
                    if(number % 10 == (3|5) )
                        sum3 = sum3 + number;
                    
                    }
                    
		    number++;
		}
                System.out.println("\nThe Sum of Prime Numbers from 1 to 100 = " + sum);
                System.out.println("The Sum of prime numbers with the digit 3 are = " + sum2);
                System.out.println("The Sum of prime numbers with the digit 3 and are = " + sum3);
	}
}