package Arrays;

public class subarray_with_given_sum {

    //My Solution(optimal solution)   TC: O(n)    SC: O(1)
    static boolean check_sum(int[] arr, int sum){
        int n = arr.length, curr = 0, last = 0;
        for (int i = 0; i<n; i++){
            curr+=arr[i];
            while(curr>sum){
                curr-=arr[last];
                last++;
            }
            if(curr == sum) return true;
        }
        return false;
    }

    public static void main(String[] args){
        int[] arr = {1, 4, 0, 0, 3, 10, 5};
        System.out.println(check_sum(arr, 7));
    }
}
