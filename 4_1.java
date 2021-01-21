/*
 Given a group of word/words and number of rows 'n'. 
 write it as shown in the test cases 


Sample Test Case - 1
input = THURSDAY
2
output = TUSAHRDY


Explanation: Write the word in 2 rows

T   U   S   A
  H    R   D   Y


the word formed is TUSAHRDY

Sample Test Case - 2
input = system
3
output = seytms

Explanation: write the given word in 3 rows 
s         e
  y    t    m
     s

the word is seytms


Sample Test Case-3
input =this is good
2
ti sgohsi od

t   i         s    g   o
  h   s    i         o   d

Explanation:
ti sgohsi od (We have one space in row-1 and another space in row-2) 

*/
import java.util.*;
class 4_1
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    String s = sc.nextLine();
	    int n = sc.nextInt();
	    int diff = (2*n)-2;
	    if(n==1){
	        System.out.println(s);
	    }
	    else{
    	    char str [] = s.toCharArray();
    	    List<Character> ans = new ArrayList<>();
    	    
    	    for(int j=0;j<(diff/2)+1;j++){
        	    for (int i=0;i<str.length;i++)
        	    {
        	        if (i%diff == j || i%diff==diff-j)
        	        {
        	            ans.add(str[i]);
        	        }
    	        }
    	    }
    	    StringBuilder sb = new StringBuilder(); 
       
            for (Character ch : ans) { 
                sb.append(ch); 
            } 
      
            String string = sb.toString(); 
            System.out.println(string); 
	    }
	}
}