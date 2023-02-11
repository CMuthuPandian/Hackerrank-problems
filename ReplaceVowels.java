/*

Get a string input from the user and replace the vowels in the string with star '*'.

Input Format
String

Constraints
length of string<=100

Output Format
String after replacing vowels with star

Sample Input 0
Hello world

Sample Output 0
H*ll* w*rld

 */
import java.util.Scanner;
public class ReplaceVowels {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        StringBuilder string = new StringBuilder(str);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='e'){
                string.setCharAt(i, '*');
            }
            else if(str.charAt(i)=='a'){
                string.setCharAt(i, '*');
            }
            else if(str.charAt(i)=='i'){
                string.setCharAt(i, '*');
            }
            else if(str.charAt(i)=='o'){
                string.setCharAt(i, '*');
            }
            else if(str.charAt(i)=='u'){
                string.setCharAt(i, '*');
            }
        }

        System.out.println(string);
    }

}

/*

Output:

Hi Hello Everyone
H* H*ll* Ev*ry*n*

 */
