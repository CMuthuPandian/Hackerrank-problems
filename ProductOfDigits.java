/*

Question
Products of the digits in a number

Input Format
Input should be an Integer

Constraints
1 <= N <= 10000

Output Format
Output should be Integer

Sample Input 0
12

Sample Output 0
2

Sample Input 1
57

Sample Output 1
35

 */

import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a =0,b=1;
        while(n!=0){
            a = n%10;
            b=b*a;
            n=n/10;
        }
        System.out.println(b);
    }
}

/*

Output:

49   input
36   output

 */
