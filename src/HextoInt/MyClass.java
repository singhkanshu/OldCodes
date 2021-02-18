/*
 * Given a maximum of four digits to the base 17(10 -> A, 11-> B,12 -> C, 16 -> G) as input, output its decimal value
 * 
 * 
 * 
 */


package HextoInt;

import java.util.*;

public class MyClass{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int total=0;
        int index=0;
        String value=sc.next();
        HashMap<Character,Integer> Hex = new HashMap<Character, Integer>();
        
        Hex.put('A',10);
        Hex.put('B',11);
        Hex.put('C',12);
        Hex.put('D',13);
        Hex.put('E',14);
        Hex.put('F',15);
        Hex.put('G',16);
        Hex.put('a',10);
        Hex.put('b',11);
        Hex.put('c',12);
        Hex.put('d',13);
        Hex.put('e',14);
        Hex.put('f',15);
        Hex.put('g',16);
        
        for(int i=value.length()-1;i>=0;i--)
        {
            if(Hex.containsKey(value.charAt(i)))
            {
                total = total + (int)(Hex.get(value.charAt(i)) * Math.pow(17,index++));
            }
            else{
                total = total + (int)((value.charAt(i)-'0') * Math.pow(17, index++)); 
            }
        }
        System.out.print(total);
        sc.close();
     }
}