/*
Ramu and Shyam are playing a game called ReverseGame. 
In this game Shyam wants Ramu to convert the string in the following manner 

Ramu has to only reverse the letters(a-z,A-Z) and other letters remain unchanged


Sample Test Case -1

input = a&b*c$rt
output = t&r*c$ba

Explanation - 

From the above test case we have a,b,c,r,t as the alphabets 
and reversing only this characters without disturbing other characters we will have 
t&r*c$ba as the output

Sample Test Case -2

input = a&b$c#d
output = d&c$b#a

Explanation - 

From the above test case we have a,b,c,d as the alphabets 
and reversing only this characters without disturbing other characters we will have 
d&c$b#a  as the output
*/

import java.util.*;
class 2_1
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        
        StringBuilder sb = new StringBuilder();
        for (char c : S.toCharArray()) 
        {   if (Character.isLetter(c)) sb.append(c); 
            
        }
        sb.reverse();
        
        for (int i = 0; i < S.length(); ++i) 
        { 
            if (!Character.isLetter(S.charAt(i))) sb.insert(i, S.charAt(i)); 
        }
        
        System.out.println(sb.toString());
        
    }
}