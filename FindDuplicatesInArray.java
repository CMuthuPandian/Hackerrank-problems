/*

In this program, Your task is to find duplicates in an array

Input Format
N, Array -> Integer.

Constraints
1<=N<=1000
0<=Array[i]<=N-1

Output Format
Print the duplicates

Sample Input 0
6
1 2 3 1 2 5

Sample Output 0
1 2

Sample Input 1
3
1 2 1

Sample Output 1
1

 */
import java.util.Scanner;
public class FindDuplicatesInArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j])
                    System.out.print(arr[i]+" ");
            }
        }
    }
}

/*

7        //input
1 3 4 4 7 1 3   // array elements
1 3 4       //duplicate elements(output)


 */
