//Rotate the array k number of times while k is user input.

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int k = s.nextInt();
        rotateArray(arr,k);
    }
    public static void rotateArray(int[] nums, int k){
        int temp;
        if(nums.length==0)
            return ;
        while(k!=0){
            for(int i=0;i<nums.length-1;i++){
                temp = nums[i];
                nums[i]=nums[nums.length-1];
                nums[nums.length-1]=temp;
            }
            k--;
        }
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }

}

/*

Output:

6  -  Total elements in array
1
2
3
4
5
6
3  -  No of times to be rotated mentioned by the user

4 5 6 1 2 3   -  Rotated array ( Final answer )

 */
