package Arrays;

public class max_appearing_element {

    //Naive Solution    TC: O(n*MAX)  SC: O(MAX)  where MAX = 100
    static int get_max_appear(int[] left, int[] right){
        int n = left.length;
        int[] freq = new int[100];
        for (int i = 0;i<n; i++){
            for (int j = left[i]; j<=right[i]; j++){
                freq[j]++;
            }
        }
        int res = 0;
        for (int i = 1; i<100; i++){
            if (freq[i] > freq[res]) res = i;
        }
        return res;
    }

    //Optimal Solution(using prefix sum array)  TC: O(n+max)    SC: O(max) where max = 100.
    static int get_max_appearOptimal(int[] left, int[] right){
        int n = left.length;
        int[] freq = new int[101];
        for (int i = 0; i<n; i++){
            freq[left[i]]++;
            freq[right[i] + 1]--;
        }
        int res = 0;
        for (int i = 1; i<100; i++){
            freq[i] += freq[i-1];
            if (freq[i] > freq[res]) res = i;
        }
        return res;
    }
    public static void main(String[] args){
        int[] left = {1, 2, 5, 15}, right = {5, 8, 7, 18};
        System.out.println(get_max_appearOptimal(left, right));
    }
}
