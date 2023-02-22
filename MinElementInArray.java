/*

Find the minimum value in an array.

Input Format
Input consists one integer and one array

Constraints
1 <= N <= 100 -1000 <= arr[i] <= 1000

Output Format
Output should be the minimum element in an array

Sample Input 0
5
1 3 2 7 6

Sample Output 0
1

Sample Input 1
7
7 3 0 2 5 6 2

Sample Output 1
0

 */

import java.util.Scanner;

public class MinElementInArray {
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int min= Integer.MAX_VALUE;
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();
        for(int i =0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
    
}

/*

7              Total no of elements
1 5 6 9 2 7 3  Elements
1              Output

 */
