import java.util.ArrayList;
import java.util.Scanner;

/*

Change the array in such a way that if both current and next element is same
then double the current value and
replace the next element with 0.After this changes,
rearrange the array such that all 0's shifted to the end.
 
Expected Output: 

The given array is: 0 3 3 3 0 0 7 7 0 9 

The new array is: 6 3 14 9 0 0 0 0 0 0

 */
public class DoubleTrouble {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int temp=0;
        int count=0;
        ArrayList<Integer> List = new ArrayList<>(n);
        ArrayList<Integer> List1 = new ArrayList<>(n);
        ArrayList<Integer> List2 = new ArrayList<>(n);
        for(int i=0;i<n;i++){
            List.add(s.nextInt());
        }
        for(int i=0;i<n-1;i++){
            if(List.get(i)==List.get(i+1)){
                int a = List.get(i)+List.get(i+1);
                List1.add(a);
                i++;
                temp++;
            }
            else
                List1.add(List.get(i));
        }
        if(List.get(n-2)!=List.get(n-1))
            List1.add(List.get(n-1));
        for(int i=0;i<temp;i++){
            List1.add(0);
        }

        for(int i=0;i<n;i++){
            if(List1.get(i)==0)
                count++;
            else
                List2.add(List1.get(i));
        }

        for(int i=0;i<count;i++){
            List2.add(0);
        }
        for(int i=0;i<n;i++)
            System.out.print(List2.get(i)+" ");
    }
}

/*

Output:

10 //Total number
0
5
7
22
0
3
3
6
6
7
>5 7 22 6 12 7 0 0 0 0 //Output

 */
