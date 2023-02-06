/*

Get the string and Print the sum of fibonacci positions in the given String.
Consider the given string as a number

Input Format

123456

Constraints

Nil

Output Format

18

Sample Input 0
123456

Sample Output 0
18

Explanation 0

1 + 2 + 2 + 3 + 4 + 6 = 18

 */

import java.util.Scanner;

public class SunOfElements {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int[] arr = new int[str.length()];
        for(int i=0;i<str.length();i++){
            arr[i]=Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        int ans = fibo(str.length(),arr);
        System.out.print(ans);
    }
    static int fibo(int count,int[] num) {
        int n1 = 0, n2 = 1, n3, sum = 0;
        sum = sum + num[n1];
        sum = sum + num[n2];
        for (int i = 2; i < count; i++) {
            n3 = n1 + n2;
            if (n3 < count) {
                sum = sum + num[n3];
                n1 = n2;
                n2 = n3;
            }
        }
        return sum;
    }
}

/*

Output:

17846529  Input
32        Output

 */
