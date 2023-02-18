/*

Count the even digits in a number. Print the count.

Input Format
Input should be an Integer

Constraints
1 <= N <= 1000000

Output Format
Output should be an Integer

Sample Input 0
123

Sample Output 0
1

Sample Input 1
2138

Sample Output 1
2

 */

import java.util.Scanner;

public class CountEvenDigits {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a=0,b=0;

        while(n!=0){
            a = n%10;
            if(a%2==0)
                b++;
            n=n/10;
        }
        System.out.println(b);
    }

}

/*

542861   //input   
4        //output

 */
