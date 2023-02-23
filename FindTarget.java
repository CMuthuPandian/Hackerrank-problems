/*

Find the target by adding two elements in the array. If all the combinations fail, print -1. Target value won't be given directly in the array.

Input Format
N and target value should be Integer. Array elements should be Integer

Constraints
1 <= N,target <= 100000 0 <= arr[i] <= 1000000

Output Format
Elements of an array

Sample Input 0
5
2 1 7 3 6
5

Sample Output 0
2,3

Explanation 0
By adding 2 and 3, we got target.

Sample Input 1
7
3 2 1 7 8 5 9
17

Sample Output 1
8,9

 */

import java.util.Scanner;

public class FindTarget {

    public static int TargetArrI(int[] arr,int target){
        int g=0;
        for(int i=0;i<arr.length;i++){
            for (int j = 0;j<arr.length;j++){
                if((arr[i]+arr[j])==target){
                    g=arr[i];
                    return g;

                }
            }
        }
        return g;
    }

    public static int TargetArrJ(int[] arr,int target){
        int g=0;
        for(int i=0;i<arr.length;i++){
            for (int j = 0;j<arr.length;j++){
                if((arr[i]+arr[j])==target){
                    g = arr[j];
                    return g;

                }
            }
        }
        return g;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a,b;
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();
        int target = in.nextInt();
        a=TargetArrI(arr,target);
        b=TargetArrJ(arr,target);
        if(a==0)
            System.out.print("-1");
        else
            System.out.print(a+","+b);
    }

}

/*

Input
8
4 6 8 55 41 3 9 555
559

Output
4,555

 */
