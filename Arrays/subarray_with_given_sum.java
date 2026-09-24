package Arrays;

public class subarray_with_given_sum {
    static boolean check_sum(int[] arr, int sum){
        int n = arr.length, curr = arr[0], last = 0;
        for (int i = 1; i<n; i++){
            if (curr<sum){
                curr+=arr[i];
            }
            else if (curr == sum) return true;
            else{
                while(curr>sum && last<=i){
                    curr-=arr[last];
                    last++;
                }
            }
        }
        if (curr == sum) return true;
        return false;
    }
    public static void main(String[] args){
        int[] arr = {1, 4, 0, 0, 3, 10, 5};
        System.out.println(check_sum(arr, 7));
    }
}
