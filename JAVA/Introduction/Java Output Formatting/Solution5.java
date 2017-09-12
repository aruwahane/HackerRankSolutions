/**
 * 
 */
/**
 * @author arundhatiwahane
 *
 */
package Introduction;

/*Input Format

Every line of input will contain a String followed by an integer. 
Each String will have a maximum of  alphabetic characters, and each integer will be in the inclusive range from  to .

Output Format

In each line of output there should be two columns: 
The first column contains the String and is left justified using exactly  characters. 
The second column contains the integer, expressed in exactly  digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.

Sample Input

java 100
cpp 65
python 50
Sample Output

================================
java           100 
cpp            065 
python         050 
================================
Explanation

Each String is left-justified with trailing whitespace through the first  characters. The leading digit of the integer is the  character, and each integer that was less than  digits now has leading zeroes.
*/
import java.util.Scanner;

public class Solution5 {

    public static void main(String[] args) {
            
		Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                
                String s2=sc.next();
                int y=sc.nextInt();
                
                String s3=sc.next();
                int z=sc.nextInt();
                
                System.out.printf("%-14s %03d", s1, x);
                System.out.println();
                
                System.out.printf("%-14s %03d", s2, y);
                System.out.println();
                
               System.out.printf("%-14s %03d", s3, z);
              System.out.println();
                
                System.out.println("================================");
            }
    }
}