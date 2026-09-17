package Recursion;

import java.util.Scanner;

public class palindrome {
    static boolean palindrome(String s, int start, int end){
        if (start >= end) return true;
        return (s.charAt(start) == s.charAt(end)) && palindrome(s, start+1, end -1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String st;
        System.out.print("Enter an string: ");
        st = sc.next();
        if (palindrome(st, 0, st.length() - 1)){
            System.out.println("It is an palindrome");
        }
        else System.out.println("Not an palindrome");
    }
}
