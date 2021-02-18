// sequence to solve (0, 0, 2, 1, 4, 2, 6, 3, 8, 4, 10, 5, 12, 6, 14, 7, 16, 8)


package Sequence2;
import java.util.*;
public class UsingSeries
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
		     
		     value1 =value1+2;
		     
		 }
		 else{
		     value2 = value2+1;
		     
		 }
		 
		}
		
		if (number%2!=0)
		{
		    System.out.println(value1-2);
		}
		else{
		    System.out.println(value2-1);
		}
		sc.close();
    }
    
}