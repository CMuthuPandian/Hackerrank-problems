/*

An array of marks obtained by students are given.
Marks less than zero are considered fail.
Determine the number of failures and the total marks obatained by them.
If there are no failures, print as "No failures"

Input Format

5 1 -2 3 -1 5



Output Format

2 -3

Sample Input 0

5 1 -3 4 2 -1
Sample Output 0

2 -4
Sample Input 1

5 -1 2 3 4 7
Sample Output 1

1 -1

 */

import java.util.Scanner;

public class SumOfNegativeNumbers {
    public static void main(String[] args ){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int sum=0,count=0;
        String[] arr = str.split(" ");
        for(int i=0;i<arr.length;i++){
            int a = Integer.parseInt(arr[i]);
            if(a<0){
                sum=sum+a;
                count++;
            }
        }
        if (count==0)
            System.out.println("No failures");
        else
            System.out.println(count+" "+sum);
    }
}

/*

Output:

> -56 5 0 -3 5 61 7 -11 33 49

3 -70

 */
