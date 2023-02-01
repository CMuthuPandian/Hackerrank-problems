//In the given string convert all the character to its opposite case

import java.util.Scanner;
public class OppositeCaseConversion {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        for(int i=0;i<str.length();i++){
            if((int)str.charAt(i)>=65 && (int)str.charAt(i)<=90)
                System.out.print(Character.toLowerCase((str.charAt(i))));
            else if((int)str.charAt(i)>=97 && (int)str.charAt(i)<=122)
                System.out.print(Character.toUpperCase((str.charAt(i))));
            else
                System.out.print(" ");
        }
}
