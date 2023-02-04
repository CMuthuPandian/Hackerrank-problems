/*

Take two numbers as input and print all the in between number which are both palindrome and prime.

Definition of palindrome
: a word, verse, or sentence (such as "Able was I ere I saw Elba") or a number (such as 1881)
that reads the same backward or forward

121 - a palindrome

Input Format

1<= input <= 10000

Constraints

Print numbers in the same line with spaces in between.
Print "null" if no number in a given range is both palindrome and prime

Output Format

Numbers between the given range(including) which are both prime and plaindrome

Sample Input 0
1 10

Sample Output 0
2 3 5 7

Sample Input 1
300 100

Sample Output 1
null

 */

import java.util.Scanner;

public class PrimePalindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int fin=0;
        if(a>b)
            System.out.println("null");
        else{
            for(int i=a;i<=b;i++){
                if(isPrime(i)&&isPalindrome(i)){
                    System.out.print(i+" ");
                    fin++;
                }
            }
            if(fin==0)
                System.out.print("null");
        }
    }
    static boolean isPrime(int x){
        int count=0;
        if(x==1)
            return false;
        else{
            for(int j=2;j<=x;j++){
                if(x%j==0)
                    count++;
            }
            if(count==1)
                return true;
            else
                return false;
        }
    }
    static boolean isPalindrome(int y) {
        int p = 0, r = 0;
        int q = y;
        while (y != 0) {
            p = y % 10;
            r = (r * 10) + p;
            y = y / 10;
        }
        if (r == q)
            return true;
        else
            return false;
    }
}

/*

Output:

1 20       input
2 3 5 7 11     output

 */
