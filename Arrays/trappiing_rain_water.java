package Arrays;

public class trappiing_rain_water {

    //Naive Solution Time Complexity: O(n^2) Space Complexity: O(1)
    static int trap_rain_water(int[] arr){
        int res = 0, n = arr.length;
        for (int i = 1; i<n - 1; i++){
            int lmax = arr[i];
            for (int j = 0; j<i; j++){
                lmax = Math.max(lmax, arr[j]);
            }
            int rmax = arr[i];
            for (int j = i+1; j<n; j++){
                rmax = Math.max(rmax, arr[j]);
            }
            res += Math.min(lmax, rmax) - arr[i];
        }
        return res;
    }

    //Optimal Solution Time Complexity: O(n) Space Complexity: O(n)
    static int get_water(int[] arr){
        int n = arr.length;
        int[] lmax = new int[n
];
        int[] rmax = new int[n];
        lmax[0] = arr[0];
        for (int i = 1; i<n; i++){
            lmax[i] = Math.max(lmax[i-1], arr[i]);
        }
        rmax[rmax.length - 1] = arr[n -1];
        for (int i = n - 2; i>=0; i--){
            rmax[i] = Math.max(rmax[i+1], arr[i]);
        }
        int res = 0;
        for (int i = 1; i<n -1; i++){
            res += Math.min(lmax[i], rmax[i]) - arr[i];
        }
        return res;
    }
    public static void main(String[] args){
        int[] arr = {3, 0, 1, 2, 5};
        System.out.println(get_water(arr));
    }
}
