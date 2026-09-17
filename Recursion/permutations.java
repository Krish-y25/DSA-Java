package Recursion;

public class permutations {
    static void swap(char[] arr, int i, int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void pmts(char[] arr, int i){
        if (i == arr.length - 1){
            System.out.println(new String(arr));
            return;
        }
        for (int j = i; j<arr.length; j++){
            swap(arr, i, j);
            pmts(arr, i+1);
            swap(arr, i, j);
        }
    }

    static void main(String[] args){
        String s = "ABC";
        pmts(s.toCharArray(), 0);
    }
}