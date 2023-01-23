import java.util.*;
public class DecimalToBinary {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String str="";
        int digit=0;
        while(n!=0){
            digit=n%2;
            str=str+digit;
            n=n/2;
        }
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
    }
}
