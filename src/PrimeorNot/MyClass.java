package PrimeorNot;

import java.util.*;
public class MyClass
{
	public static void main(String[] args)
	{
		long number=0;
		Scanner sc=new Scanner(System.in);
		number=sc.nextLong();
		MyClass obj=new MyClass();
		obj.check((int)number);
		sc.close();
	}	
    void check(int number)
    {
        if (number<0)
        {
            System.out.println("Enter the postive Integer");
        }
        else{
            prime(number);
        }
    }
    void prime(int number)
    {
        int sqrtnumber=0;
        int counter=0;
        sqrtnumber= (int)Math.sqrt(number);
		System.out.println(sqrtnumber);
		
		for(int i=2;i<=sqrtnumber;i++)
		{
		    if (number%i==0)
		    {
		        counter++;
		    }
		}
		if (counter>0)
		{
		    System.out.println("not prime");
		}
		else
		{
		    System.out.println("Prime");
		}
		
    }
    
}