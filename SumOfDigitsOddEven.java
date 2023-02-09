/*

Get a number from user and find the sum of digits. Check if the sum is odd or even.
If sum is odd print "odd", else print "even".

Input Format
Get a non-zero number from the user. The number must be an integer.

Constraints
n>0

Output Format
If sum is odd print "odd", else print "even".

Sample Input 0
543

Sample Output 0
even

Sample Input 1
124

Sample Output 1
odd

 */
import java.util.Scanner;
public class SumOfDigitsOddEven {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum =0,temp;;
        while(n!=0){
            temp=n%10;
            sum = sum+temp;
            n=n/10;
        }
        if(sum%2==0)
            System.out.println("even");
        else
            System.out.println("odd");
    }
    
}

/*

779    //input
add    //output

66     //input
even   //output

 */
