/*
Ramu is given some set of positive numbers and a value 'K'. 

He is given a task to check if there exists a subset in the given set where the sum of the number of the subset is equal to the value 'K'

print yes if exists else no

The first line of input consists positive values followed by a value 'K'

Sample Test Case1

input =3 34 4 12 5 2
9
output = yes

Explanation-There is a subset (4, 5) with sum 9.


Sample Test Case2

input =3 23 4 5 12
55
output = no


Explanation-There is no subset that add up to 55.
*/

import java.util.Scanner;
class 1_3{
    public static boolean solve(int[] arr, int n, int sum)
    {
        if (sum == 0) 
        {
            return true;
        }
 
        if (n < 0 || sum < 0) 
        {
            return false;
        }
        boolean include= solve(arr, n - 1, sum - arr[n]);
        boolean exclude= solve(arr, n - 1, sum);
        
        return include || exclude;
    }
 
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String [] str = sc.nextLine().split(" ");
        int n = sc.nextInt();
        int [] A = new int[str.length];
        for(int i=0;i<str.length;i++){
            A[i] = Integer.parseInt(str[i]);
        }
 
        if (solve(A, A.length - 1, n)) {
            System.out.print("Yes");
        }
        else {
            System.out.print("No");
        }
    }
}