/*

https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string-ii/

Given a string s, a k duplicate removal consists of choosing k adjacent and equal
letters from s and
removing them causing the left and the right side of the deleted substring to 
concatenate together.

We repeatedly make k duplicate removals on s until we no longer can.

Return the final string after all such duplicate removals have been made.

It is guaranteed that the answer is unique.

Example 1:
Input: s = "abcd", k = 2
Output: "abcd"

Explanation: There's nothing to delete.

Example 2:
Input: s = "deeedbbcccbdaa", k = 3
Output: "aa"

Explanation:
First delete "eee" and "ccc", get "ddbbbdaa"
Then delete "bbb", get "dddaa"
Finally delete "ddd", get "aa"

Example 3:
Input: s = "pbbcggttciiippooaais", k = 2
Output: "ps"
*/

import java.util.*;
class 6_3{
    public static String solve(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        char prev = s.charAt(0);
        for (int i = 1; i < s.length(); i++) 
        {
            if (prev == s.charAt(i)) count++;
            else count = 1;
            if (count == k) {
                sb.append(s.substring(0, i - k + 1)).append(s.substring(i + 1));
                return solve(sb.toString(),k);
            }
            prev = s.charAt(i);
        }
        return s;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        System.out.println(solve(s,k));
    }
}