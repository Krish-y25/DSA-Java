package Arrays;

public class equilibrium_point {

    //My Solution   TC: O(n)    SC: O(n)
    static boolean equi_pt(int[] arr){
        int[] sum = new int[arr.length+1];
        sum[1] = arr[0];
        for (int i = 1; i<arr.length; i++){
            sum[i+1] = arr[i] + sum[i];
        }
        for (int i = 1; i<sum.length; i++){
            if (sum[i-1] == (sum[sum.length-1] - sum[i])) return true;
        }
        return false;
    }

    //Alternate solution    TC: O(n)    SC: O(n)
    //Creating prefix and suffix arrays
    static boolean equi_pt2(int[] arr){
        int n = arr.length;
        int[] ps = new int[n], ss = new int[n];
        ps[0] = arr[0];
        ss[n-1] = arr[n-1];
        for (int i = 1; i<n; i++){
            ps[i] = arr[i] + ps[i-1];
            ss[n-i-1] = arr[n-i-1] + ss[n-i];
        }

        for (int i = 1; i<n-1; i++){
            if (ps[i-1] == ss[i+1]) return true;
        }
        if ((ps[n-2]) == 0 || (ss[n-2] == 0)) return true;
        return false;
    }

    //Optimal solution  TC: O(n)    SC: O(1)
    static boolean equi_pt_optimal(int[] arr){
        int n = arr.length, sum = 0, ls = 0;
        for (int i = 0; i<n; i++){
            sum+=arr[i];
        }
        int rs = sum;
        for (int i = 0; i<n; i++){
            rs -= arr[i];
            if (ls == rs) return true;
            ls += arr[i];
        }
        return false;
    }

    //Practice problem: Array partitioned into three different parts with equal sum
    // TC: O(n)     SC: O(1)
    static boolean three_partition(int[] arr) {
        int sum = 0;
        for (int x : arr) {
            sum += x;
        }
        if (sum % 3 != 0) return false;
        int target = sum / 3;
        int currentSum = 0;
        int cuts = 0;

        // Stop at arr.length - 1 to ensure the 3rd part is non-empty
        for (int i = 0; i < arr.length - 1; i++) {
            currentSum += arr[i];
            if (currentSum == target * (cuts + 1)) {
                cuts++;
                if (cuts == 2) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] arr = {2, 3, 1, 1, 1, 2, 5};
        System.out.println(three_partition(arr));
    }
}
