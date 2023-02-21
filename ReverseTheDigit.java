/*

Reverse the digit. Take only even digits while reversing.

Input Format
Input should be an Integer

Constraints
1 <= N <= 1000000

Output Format
Output should be an Integer

Sample Input 0
124

Sample Output 0
42

Sample Input 1
214896

Sample Output 1
6842

 */
import java.util.Scanner;

public class ReverseTheDigit {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a=0;
        while(n>0){
            a=n%10;
            if(a%2==0)
                System.out.print(a);
            n=n/10;
        }
    }

}

/*

51632  Input
26     Output

 */
