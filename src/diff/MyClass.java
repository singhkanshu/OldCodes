//Given a maximum of 100 digit numbers as input, find the difference between the sum of odd and even position digits.

package diff;

import java.util.*;

public class MyClass{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        long odd=0,even=0;
        String value=sc.nextLine();
        
        odd = value.charAt(0)- '0';
        
        for (int i=1;i<value.length();i++)
        {
            if(i%2==0)
            {
                odd = odd + value.charAt(i) -'0';
            }
            else{
                even = even + value.charAt(i) -'0';
            }
        }
        System.out.print(Math.abs(even - odd));
        sc.close();
     }
}
