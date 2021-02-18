/*
 * The program will recieve 3 English words inputs from STDIN

These three words will be read one at a time, in three separate line
The first word should be changed like all vowels should be replaced by %
The second word should be changed like all consonants should be replaced by #
The third word should be changed like all char should be converted to upper case
Then concatenate the three words and print them
 
 */



package StringTwist;

import java.util.*;
public class MyClass{

     public static void main(String []args){
        String s1,s2,s3,str1,str2,str3;
        int l1=0,l2=0;
        Scanner sc = new Scanner(System.in);
        s1=sc.next();
        s2=sc.next();
        s3=sc.next();
        
        l1=s1.length();
        l2=s2.length();
        
        str1="";
        str2="";
        str3="";
        
        char c;
        
        for(int i=0;i<l1;i++)
        {
            c=s1.charAt(i);
            
            if (c=='A' || c=='a' || c=='E' || c=='e' || c=='I' || c=='i' || c=='O' || c=='o' || c=='U' || c=='u')
            {
                str1=str1 + "%";
            }
            else{
            str1=str1 + c;
            }
        }
        for(int i=0;i<l2;i++)
        {
            c=s2.charAt(i);
        
          if((c>='A' && c<='Z') || (c>='a' && c<='z'))
          {
            if (c=='A' || c=='a' || c=='E' || c=='e' || c=='I' || c=='i' || c=='O' || c=='o' || c=='U' || c=='u')
            {
                str2=str2 + c;
            }
            else{
            str2=str2 + "#";
            }
          }
          else
          {
             str2=str2 + c;
          }
        }
        str3=s3.toUpperCase();
        System.out.print(str1+str2+str3);
        sc.close();
     }
}