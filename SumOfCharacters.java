/*

Print the sum by adding all the characters by using their ASCII value.

Input Format
Input should be String

Constraints
No constraints

Output Format
Output should be an Integer

Sample Input 0
goal

Sample Output 0
419

Sample Input 1
act

Sample Output 1
312

 */

import java.util.Scanner;

public class SumOfCharacters {

    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int sum=0;
        for(int i=0;i<str.length();i++){
            int asciiValue = str.charAt(i);
            sum+=asciiValue;
        }
        System.out.println(sum);

    }

}

/*

muthu   Input
563     Output

 */
