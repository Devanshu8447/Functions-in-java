/*** FUNCTIONS QUESTIONS

 Q 1
import java.util.*;

public class Main {
    public static int average(int a ,int b, int c){
        return (a+b+c)/3;
    }
    public static void main(String args[]) {


        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number:");
        int a = sc.nextInt();
        System.out.println("enter second number:");
        int b = sc.nextInt();
        System.out.println("enter third number:");
        int c = sc.nextInt();


        System.out.println(average(a,b,c));


    }
}
 ***/

/***

 Q3


import java.util.*;
public class Main {
    public static boolean isEven(int n) {
        if (n%2==0) {
            return true;
        }
        else
            return false;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int n = sc.nextInt();
        System.out.println(isEven(n));


    }
}
***/

import java.util.*;
public class Main{
    public static void ispalindrome(int n) {
        int pow = 0;
        int rev = 0;
        int num = n;
        while (n>0) {
            int ld = n%10;
            rev = rev*10+ld;
            pow++;
            n/=10;


        }
        //System.out.println(rev);
        if (rev == num ) {
            System.out.println( " palindrome");
        }
        else {
            System.out.println( "  not a palindrome");
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ispalindrome(n);

    }

}
