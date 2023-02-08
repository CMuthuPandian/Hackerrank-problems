/*

In this program, we need to find the largest word present in the string and it's length of the word.

Example:

Input: Good Morning

Output:

Morning

7

Explanation:

Word 1: Good - length: 4

Word 2: Morning - length: 7

Here, length of the word(Morning) is greater than length of the word(Good).

Note: if you find same length word, you should consider the first word present in the string.
Example-> Input: FIND TASK, Output: FIND and 4. Here, FIND and TASK have same length. but FIND is the first word present in the given string.

Input Format
str -> String.

Constraints
No constraints

Output Format
print the desired output.

Sample Input 0
Good Morning

Sample Output 0
Morning
7

Sample Input 1
Sample Test

Sample Output 1
Sample
6

 */

import java.util.Scanner;

public class LargestWordAndItsLength {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int max=0;
        String sr=" ";
        String ans=" ";
        String[] strings = str.split(" ");
        for(int i=0;i<strings.length;i++){
            if(strings[i].length()>max){
                max=strings[i].length();
                sr=strings[i];
            }
        }
        System.out.println(sr);
        System.out.println(max);
    }
    
}

/*

Output:

hi how are you What are you doing
doing
5

 */
