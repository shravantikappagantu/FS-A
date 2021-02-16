/*
Program1

write a program to read a string in HH:MM:SS:AM/PM format 
and produce the input string in 24 Hour Format 

Input- the string is in 12- hour AM/PM format
Output - the input string should be in 24-hour format

Assume all HH,MM,SS are in the valid range only 

Note: Midnight is 12:00:00AM on a 12-hour clock,  and 00:00:00 on a 24-hour clock. 
Noon is 12:00:00PM on a 12-hour clock,  and 12:00:00 on a 24-hour clock. 
     
Assume all input times are valid
    
input = 06:10:20PM
output = 18:10:20

input = 01:45:50PM
output = 13:45:50

input = 10:05:30AM
output = 10:05:30

input = 12:30:45AM
output = 00:30:45

input = 02:13:19AM
output = 02:13:19
*/

import java.util.*;
class 7_1{
    public static String solve(String s){
        String[] arr =  s.split(":");
        String check = arr[2];
        char ans = check.charAt(2);
        
        boolean isIt = arr[0].equals("12");
        
        if(ans == 'P' && isIt == false)
        {
            int hrs = Integer.parseInt(arr[0])+12;
            arr[0] = String.valueOf(hrs);
        }
        if(ans == 'A' && isIt == true)
        {
            arr[0] = "00";
        }
        
        return arr[0] + ":" + arr[1] + ":" + check.substring(0,2);
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(solve(s));
    }
}