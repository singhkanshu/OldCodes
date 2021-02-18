package Sequence;
import java.util.*;
public class MyClass
{
	public static void main(String[] args)
	{
		
		int value1=0,value2=0,number =0;
		Scanner sc= new Scanner(System.in);
		number =sc.nextInt();
		
		for(int i=1;i<=number;i++)
		{
		 
		 if (i%2!=0)
		 {
		     
		     value1 =value1+7;
		     
		 }
		 else{
		     value2 = value2+6;
		 }
		 
		}
		
		if (number%2==0)
		{
		    System.out.println(value2-6);
		}
		else{
		    System.out.println(value1-7);
		}
	sc.close();	
    }
    
}