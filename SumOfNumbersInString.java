/*

Get the string from the user and add the numbers present in the string and print the sum.

Input Format
string s1

Constraints
length of the string<=100

Output Format
sum-integer

Sample Input 0
hi1 heloo234

Sample Output 0
10

Sample Input 1
go789od morning!@3 welcome90

Sample Output 1
36

 */

import java.util.Scanner;
public class SumOfNumbersInString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int sum=0;
        for(int i=0;i<str.length();i++){
            if(Character.getNumericValue(str.charAt(i))==1||Character.getNumericValue(str.charAt(i))==2||
               Character.getNumericValue(str.charAt(i))==3||Character.getNumericValue(str.charAt(i))==4||
               Character.getNumericValue(str.charAt(i))==5||Character.getNumericValue(str.charAt(i))==6||
               Character.getNumericValue(str.charAt(i))==7||Character.getNumericValue(str.charAt(i))==8||Character.getNumericValue(str.charAt(i))==9)
            {
                sum=sum+(Character.getNumericValue(str.charAt(i)));
            }
        }
        System.out.println(sum);
    }
}

/*

17hi 33welcome 59bye   //Input 
28                     //Output

 */
