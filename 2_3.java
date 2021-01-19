/*
ramu is given a task to print the numbers n in vertical fashion in a snake model

input = 5
output = 
1
2 9
3 8 10
4 7 11 14
5 6 12 13 15

input = 4
output = 
1
2 7
3 6 8
4 5 9 10
*/
import java.util.Scanner;
class 2_3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        for(int i=1 ; i <= rows ; i++)
        {
            System.out.print(i + " ");
            int p = i;
            for(int j = 1; j < i ; j++)
            {
                if(j%2 != 0)
                {
                    System.out.print((p + ((2*(rows+1-i))-1)) + " ");
                    p = p+((2*(rows+1-i))-1);
                }
                else
                {
                    System.out.print((p+2*(i-j)) + " ");
                    p = p+2*(i-j);
                }
            }
            System.out.println();
        }
    }
}