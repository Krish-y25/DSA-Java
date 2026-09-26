package Arrays;

public class prefix_sum {
    public static int[] arr = {2, 3, 5, 4, 6, 1};
    public static int[] psum = new int[arr.length];
    public static int[] wsum = new int[arr.length];

    //Naive Solution    TC: O(n)    SC: O(n)
    static int get_sum(int l, int r) {
        int sum = 0;
        for (int i = l; i <= r; i++) {
            sum += arr[i];
        }
        return sum;
    }

    //Optimal Solution   TC: O(1)
    static int get_sum_optimal(int l, int r) {
        if (l==0) return psum[r];
        else return psum[r] - psum[l - 1];
    }

    //Practice Question: Here there is weight assigned to each element starting from l to r, where the weight for l will be
    // 1 and keeps on incrementing by 1 till r
    static int get_wsum(int l, int r){
        if(l==0) return wsum[r] - (l-1)*get_sum(l, r);
        else return wsum[r] - wsum[l-1] - (l-1)*get_sum(l,r);
    }

    public static void main(String[] args) {
        psum[0] = arr[0];
        for (int i = 1; i<arr.length; i++){
            psum[i] = arr[i] + psum[i-1];
        }

        for (int i = 1; i<arr.length; i++){
            wsum[i] = i*arr[i] + wsum[i-1];
        }
        System.out.println(get_sum_optimal(1, 3));
        System.out.println(get_wsum(2, 3));
    }
}
