/**
 * 
 */
/**
 * @author arundhatiwahane
 *
 */
package Introduction;
/*We use the integers , , and  to create the following series:

(a+2^0*b), (a+2^0*b+2^1*b),....,(a+2^0*b+2^1*b+...+2^(n-1)*b)
You are given  queries in the form of , , and . For each query, print the series corresponding to the given , , and  values as a single line of  space-separated integers.

Input Format

The first line contains an integer, , denoting the number of queries. 
Each line  of the  subsequent lines contains three space-separated integers describing the respective , , and  values for that query.

Constraints




Output Format

For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of  space-separated integers.

Sample Input

2
0 2 10
5 3 5
Sample Output

2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98*/
import java.util.*;
import java.io.*;

class Solution7 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
       // int ans=0;
        for(int i=0;i<t;i++){
            int ans=0;
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
       
            for(int j=0;j<n;j++)
            {
                if(j==0)
                    ans = ans + (a + (int)Math.pow(2,j) * b);
                else
                    ans = ans + ((int)Math.pow(2,j) * b);
                
                System.out.print(ans+"\t");
            }
            System.out.println();
        }
        in.close();
    }
}
