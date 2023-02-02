/*

n must be an odd number if user enters the invalid n then display "OOPS INVALID N VALUE"

Input Format
integer value

Constraints
-100000<=n<=100000

Output Format
chessboard pattern

Sample Input 0
2

Sample Output 0
OOPS INVALID N VALUE

Sample Input 1
5

Sample Output 1
Black White Black White Black
White Black White Black White
Black White Black White Black
White Black White Black White
Black White Black White Black

 */

import java.util.Scanner;

public class ChessBoard {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n<0)
            System.out.println("OOPS INVALID N VALUE");
        else if(n%2!=0){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    if(i%2!=0){
                        if(j%2!=0)
                            System.out.print("Black ");
                        else
                            System.out.print("White ");
                    }
                    else{
                        if(j%2!=0)
                            System.out.print("White ");
                        else
                            System.out.print("Black ");
                    }
                }
                System.out.println();
            }
        }
        else
            System.out.println("OOPS INVALID N VALUE");
    }
}

/*

Output:

7
Black White Black White Black White Black 
White Black White Black White Black White 
Black White Black White Black White Black 
White Black White Black White Black White 
Black White Black White Black White Black 
White Black White Black White Black White 
Black White Black White Black White Black 

 */
