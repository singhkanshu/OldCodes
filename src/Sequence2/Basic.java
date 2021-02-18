package Sequence2;

import java.util.Scanner;

public class Basic
{
	public static void main(String[] args)
	{
		
		int value1=1,value2=1,number =0;
		Scanner sc= new Scanner(System.in);
		number =sc.nextInt();
		
		for(int i=1;i<=number;i++)
		{
		 
		 if (i%2!=0)
		 {
		     
		     value1 =value1*2;
		     
		 }
		 else{
		     value2 = value2*3;
		     
		 }
		 
		}
		
		if (number%2!=0)
		{
		    System.out.println(value1/2);
		}
		else{
		    System.out.println(value2/3);
		}
		sc.close();
    }
    
}
