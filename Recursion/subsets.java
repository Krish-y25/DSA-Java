package Recursion;

public class subsets {
    static void findSubset(String s, String cur, int i){
        if (i == s.length()) {
            System.out.print("\"" + cur + "\"" + " ");
            return;
        }
        findSubset(s, cur, i+1);
        findSubset(s, cur + s.charAt(i), i+1);
    }
    public static void main(String[] args){
        findSubset("abc", "", 0);
    }
}
