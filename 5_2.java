/*
Write a java program to read a word as input and returns another string as output, 
such that , a vowel in the input string will be de denoted by upper case letter ‘V’ and a 
consonant in the input string will be denoted by upper case letter ‘C’. 

Note - The output will contain a word containing alternating sequence of ‘C’ and ‘V’.
It is not permissible to have two or more consecutive V or C in Sequence.
Assume the Input String will contain only lower and upper case alphabets 

input = hello 
output = CVCV

Explanation - When we convert the above  "hello" we have CVCCV 
but for the output It is not permissible to have two or more consecutive V or C in Sequence.
so CVCCV changes to CVCV 


Sample Test Cases 

input = aeibo
output = VCV

input = Whereabouts
output = CVCVCVC
             
input = aeiou
output = V

input = BCDEFGIIKL
output = CVCVC

input = aeiOUabCdEfg
output = VCVC
*/

import java.util.*;
class 5_2{
    public static boolean isVowel(char c){
        if(c=='A' || c=='E' ||c=='I' ||c=='O' ||c=='U'){
            
            return true;
        }
        return false;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        
        s=s.toUpperCase();
        int i,j;
        StringBuilder sb=new StringBuilder();
        
        if(isVowel(s.charAt(0)))
        {
            sb.append("V");
        }
        else{
            sb.append("C");
        }
        for(i=1;i<s.length();i++){
                if(isVowel(s.charAt(i))){
                    int num=sb.length();
                    if(sb.charAt(num-1)!='V'){
                        sb.append("V");
                    }
                }
                else{
                    int num=sb.length();
                    if(sb.charAt(num-1)!='C'){
                        sb.append("C");
                    }
                }
            
        }
        System.out.println(sb);
    }
}