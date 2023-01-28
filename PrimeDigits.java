//Find the prime digits of the number

import java.util.Scanner;
public class PrimeDigits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int digit=0,rev=0;
        while(n!=0){
            digit=n%10;
            if(isPrime(digit)==true)
                rev=(10*rev)+digit;
            n=n/10;
        }
        while(rev!=0){
            System.out.print((rev%10)+" ");
            rev=rev/10;
        }
    }
    static boolean isPrime(int m){
        int count=0;
        for(int i=2;i<=m;i++){
            if(m%i==0)
                count++;
        }
        if(count==1)
            return true;
        else
            return false;
    }
}

/*

Output:

2347
2 3 7 

 */
