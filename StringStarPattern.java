import java.util.Scanner;
public class StringStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (i == j && i + j != s.length() - 1) {
                    System.out.print(s.charAt(i));
                } else if (i + j == s.length() - 1) {
                    System.out.print(s.charAt(j));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

/*

Output:

Enter a string: PROGRAM

P     M
 R   A 
  O R  
   G   
  O R  
 R   A 
P     M

 */
