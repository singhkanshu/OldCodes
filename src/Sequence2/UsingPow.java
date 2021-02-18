package Sequence2;

import java.util.*;

public class UsingPow
{
	public static void main(String[] args)
	{
		
		int value1=0,value2=0,number =0,counter1=0,counter2=0;
		Scanner sc= new Scanner(System.in);
		number =sc.nextInt();
		
		for(int i=1;i<=number;i++)
		{
		 
		 if (i%2!=0)
		 {
		     
		     value1 =(int)Math.pow(2,counter1);
		     counter1++;
		     
		 }
		 else{
		     value2 = (int)Math.pow(3,counter2);
		     counter2++;
		 }
		 
		}
		
		if (number%2==0)
		{
		    System.out.println(value2);
		}
		else{
		    System.out.println(value1);
		}
		sc.close();
		
    }
    
}