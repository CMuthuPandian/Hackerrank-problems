//Convert the first and last letter to Uppercase in all words in a given string

import java.util.Scanner;
public class StartAndEndCaseConversion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String[] arr = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            char[] charArray = arr[i].toCharArray();
            charArray[0] = Character.toUpperCase(charArray[0]);
            charArray[charArray.length - 1] = Character.toUpperCase(charArray[charArray.length - 1]);
            arr[i] = new String(charArray);
            System.out.print(arr[i]+" ");
        }
    }
}

/*

Output:

>hi how are you is everything fine
HI HoW ArE YoU IS EverythinG FinE

 */
