/*

Find whether the given year is leap year or not and print "Leap year"
if it is or print "Not a leap year" if it is not.

Input Format
Integer

Constraints
year>0

Output Format
Print "Leap year" if it is a leap year else print "Not a leap year"

Sample Input 0
2020

Sample Output 0
Leap year

Sample Input 1
2003

Sample Output 1
Not a leap year

 */

import java.util.Scanner;

public class LeapYearOrNot {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n%4==0)
            System.out.println("Leap year");
        else
            System.out.println("Not a leap year");
    }

}

/*

2004
Leap year 

1999
Not a leap year

 */
