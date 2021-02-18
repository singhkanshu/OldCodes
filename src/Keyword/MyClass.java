package Keyword;

import java.util.*;
public class MyClass{

     public static void main(String []args){
       boolean flag=false;
       String str[] = {"break", "case", "continue", "default", "defer", "else","for", 
    "func", "goto", "if", "map", "range", "return", "struct", "type", "var"};
       Scanner sc= new Scanner(System.in);
       String input = sc.nextLine();
       
       for (int i=0;i<str.length;i++)
       {
           if(str[i].equals(input))
           {
               flag= true;
               
           }
       }
       if (flag)
       {
           System.out.print(input + " is keyword");
       }
       
       else
       {
           System.out.print(input + " is not keyword");
       }
           
       sc.close();
     }
}
