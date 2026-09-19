package Arrays;

public class frequencies_in_a_sorted_array {

    //Optimal Solution - TC: O(n) SC: O(1)
    static void freq(int[] arr){
        int n = arr.length, cnt = 1;
        for (int i = 1; i<n; i++){
            if (arr[i] == arr[i-1]){
                cnt++;
            }
            else {
                System.out.println(arr[i-1] + " " + cnt);
                cnt = 1;
            }
        }
        System.out.println(arr[n-1] + " " + cnt);
    }

    public static void main(String[] args){
        int[] arr = {10, 20, 20, 20};
        freq(arr);
    }
}
