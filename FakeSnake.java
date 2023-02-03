//Remove all the duplicates element in the arrays and print the original number
// if 1 existing more than one times in input ...in output it shows only one
import java.util.Scanner;

public class FakeSnake {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int last=0;
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        for(int i=0;i<n;i++){
            if(i==0)
                System.out.print(arr[i]+" ");
            else if(i==n-1) {
                for(int j=i-1;j>=0;j--){
                    if(arr[i]==arr[j]){
                        last++;
                    }
                }
                if(last==0)
                    System.out.print(arr[n-1]+" ");
            }
            else{
                int count=0;
                int temp=0;
                for(int j=i-1;j>=0;j--){
                    if(arr[i]==arr[j]){
                        count++;
                    }
                }
                for(int k=i+1;k<=n-1;k++){
                    if(arr[i]==arr[k]){
                        temp++;
                    }
                }
                if(count==0||(count+temp)==0)
                    System.out.print(arr[i]+" ");
            }
        }
    }
}

/*

Output:

7  No of element in array
2
4
6
9
4
2
6
2 4 6 9 Output

 */
