package Arrays;

public class max_length_even_odd_subarray {
    static int get_length_eo(int[] arr){
        int max = 1, n = arr.length, cnt = 1;
        for (int i = 1; i<n; i++){
            if ((arr[i] + arr[i-1])%2 != 0){
                cnt++;
                max = Math.max(max, cnt);
            }
            else {
                cnt=1;
            }
        }
        return max;
    }
    public static void main(String[] args){
        int[] arr = {5, 10, 20, 6, 3, 8};
        System.out.println(get_length_eo(arr));
    }
}
