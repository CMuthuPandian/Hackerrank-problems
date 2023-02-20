/*

print the odd digit which should be in even position in a number.

Input Format
Input Should be an Integer

Constraints
1 <= N <= 1000000

Output Format
Output should be an Integer

Sample Input 0
234

Sample Output 0
3

Explanation 0
Only 3 in even position

Sample Input 1
8

Sample Output 1
0

Explanation 1
The input consists only one digit. So, the ouput is 0.

 */
import java.util.Scanner;

public class OddDigitInEvenPosition {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int b =0;
        int n = in.nextInt();
        if(n>=10){
            String s =Integer.toString(n);
            for(int i=0;i<s.length();i++){
                int a=Integer.parseInt(String.valueOf(s.charAt(i)));
                b++;
                if(b%2==0){
                    if(a%2!=0)
                        System.out.print(a);
                }
            }
        }
        else
            System.out.print("0");
    }

}

/*

1735 Input
75   Output

 */
