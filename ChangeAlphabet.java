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
