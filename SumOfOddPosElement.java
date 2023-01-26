import java.util.Scanner;

//Add the odd positioned elements in an array and print the resultant. start the index position from 0 .

public class SumOfOddPosElement {
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        int n = s.nextInt();
        int count =0;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        for(int j=0;j<n;j++){
            if(j%2==0)
                count=count;
            else
                count=count+arr[j];
        }
        System.out.println(count);
    }
}

/*

Output:

7
1 25 41 20 12 5 33 10
50

 */
