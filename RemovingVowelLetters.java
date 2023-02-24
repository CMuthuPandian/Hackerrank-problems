/*

Remove all the vowel letters in the given string. Inputs contain both capital and small letters.

Input Format
Input should be String

Constraints
No Constraints

Output Format
Output should be String

Sample Input 0
This is the chair

Sample Output 0
Ths s th chr

Sample Input 1
It is our dream

Sample Output 1
t s r drm

 */

import java.util.Scanner;

public class RemovingVowelLetters {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        for(int i=0;i<str.length();i++){
            char n = str.charAt(i);
            if(n=='a'||n=='e'||n=='i'||n=='o'||n=='u'||n=='A'||n=='E'||n=='I'||n=='O'||n=='U')
                continue;
            else
                System.out.print(n);
        }
    }

}

/*

Hi how are you ?      Input
H hw r y ?            Output

 */
