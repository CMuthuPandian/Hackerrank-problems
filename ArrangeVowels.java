/*

Get the vowel letters from the given string and print it in alphabetical order.
Inputs contain only small letters.

Input Format
Input should be String

Constraints
No Constraints

Output Format
Output should be String

Sample Input 0
he is a boy

Sample Output 0
aeio

Sample Input 1
aeronatical

Sample Output 1
aaaeio

 */

import java.util.Scanner;
public class ArrangeVowels {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        for(int i=0;i<str.length();i++){
            char n = str.charAt(i);
            if(n=='a'||n=='A')
                System.out.print(n);
        }
        for(int i=0;i<str.length();i++){
            char n = str.charAt(i);
            if(n=='e'||n=='E')
                System.out.print(n);
        }
        for(int i=0;i<str.length();i++){
            char n = str.charAt(i);
            if(n=='i'||n=='I')
                System.out.print(n);
        }
        for(int i=0;i<str.length();i++){
            char n = str.charAt(i);
            if(n=='o'||n=='O')
                System.out.print(n);
        }
        for(int i=0;i<str.length();i++){
            char n = str.charAt(i);
            if(n=='u'||n=='U')
                System.out.print(n);
        }
    }
}
/*

Hi how are you ? everything will be alright  //Input
aaeeeeiiiioou                                //Output

 */
