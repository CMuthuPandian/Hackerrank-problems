/*

In this program, your task is to count the prime number(single digit) in a number.
Consider 1 is a prime number.

Example:

Input: 1427
Output: 3
Explanation: 1, 2 and 7 are prime numbers(Single digit prime numbers).

Input Format
N -> Integer.

Constraints
1<=N<=100000

Output Format
print the count.

Sample Input 0
145267

Sample Output 0
4

Sample Input 1
3249

Sample Output 1
2

 */

import java.util.Scanner;

public class CountThePrimeNumbers {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum=0,temp=0;
        while(n!=0){
            temp=n%10;
            if(isPrime(temp))
                sum+=1;
            n=n/10;
        }
        System.out.print(sum);
    }

    static boolean isPrime(int prime){
        int count=0;
        if(prime==1)
            count++;
        for(int i=2;i<=prime;i++){
            if(prime%i==0)
                count++;
        }
        if(count==1)
            return true;
        else
            return false;
    }
}

/*

1478632   input
4         output

 */
