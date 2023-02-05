/*

Replace array elements with the sum of weights

if perfect square,weight =1
if negative and even,weight =2
if factor of 3 or 5,weight =3

if sum of weights is equal to zero then retain the same element

Input Format

n must be integer,array elements

Constraints

nil

Output Format

reconstructed array

Sample Input 0
5
1 729 78 29 -2

Sample Output 0
1 4 3 29 2

 */

import java.util.Scanner;

public class ReconstructionOfArrayElements {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();
        for(int i=0;i<n;i++){
            int weight=0;
            if(isPerfectSquare(arr[i]))
                weight = weight+1;
            if(arr[i]<0 && arr[i]%2==0)
                weight=weight+2;
            if(arr[i]%3==0 || arr[i]%5==0)
                weight=weight+3;
            if(arr[i]==0)
                weight=0;
            if(weight==0)
                arr[i]=arr[i];
            else
                arr[i]=weight;
        }
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }

    static boolean isPerfectSquare(int x){
        if (x > 0) {
            int sr = (int)Math.sqrt(x);
            return ((sr * sr) == x);
        }
        return false;
    }

}

/*

Output:

7                     No of element
7 36 -729 5 25 49 78  Elements

7 4 3 3 4 1 3         Output

 */
