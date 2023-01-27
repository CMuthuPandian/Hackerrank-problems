//Get an input string (single word) from user and replace the characters in string based on the transformation: A->Z, B->Y,C->X and so on.

import java.util.Scanner;

public class ChangeAlphabet {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        for(int i=0;i<str.length();i++){
            int a = ((int)str.charAt(i));
            System.out.print((char)(155-a));
        }
    }
}

/*

Output:

>ABCD
ZYXW

 */
