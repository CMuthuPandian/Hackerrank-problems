/*

Get size of an array Get the Elements of array Get a key value Sort the elements based on the condition
CONDITION : number of times the key value is repeated in that particular element

sort the array based on a given condition let us consider a array [9,8,12,1,111] and key value as 1 occurences of 1 in 9 -
 0 occurences of 1 in 8 - 0 occurences of 1 in 12 - 1 occurences of 1 in 1 - 1 occurences of 1 in 111 - 3

so the final output will be [9,8,12,1,111]

sample input : 8 2 2334 567 0 30 9 1 24 3

sample output: 2,567,0,9,1,24,30,2334

 */

import java.util.ArrayList;
import java.util.Scanner;
public class SortWithCondition {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();
        int k= s.nextInt();
        ArrayList<Integer> List1=new ArrayList<>();
        ArrayList<Integer> List2=new ArrayList<>();
        ArrayList<Integer> List3=new ArrayList<>();
        ArrayList<Integer> List4=new ArrayList<>();
        ArrayList<Integer> List5=new ArrayList<>();
        for(int i=0;i<n;i++) {
            int count = 0;
            int x = arr[i];
            while (arr[i] != 0) {
                if (arr[i] % 10 == k)
                    count++;
                arr[i] = arr[i] / 10;
            }
            if(count==0)
                List1.add(x);
            else if(count==1)
                List2.add(x);
            else if(count==2)
                List3.add(x);
            else
                List4.add(x);
        }
        List5.addAll(List1);
        List5.addAll(List2);
        List5.addAll(List3);
        List5.addAll(List4);
        for(int i=0;i<n;i++){
            if(i+1==n)
                System.out.print(List5.get(i));
            else
                System.out.print(List5.get(i)+",");
        }
    }
}

/*

Output:

8
2
2334
567
0
30
9
1
24
3
2,567,0,9,1,24,30,2334

 */
