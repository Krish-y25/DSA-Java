package Searching;

public class _06_count1_sorted_array {
    // TC: O(logn)  SC: O(1)
    static int count1(int[] nums){
        int low = 0, high = nums.length - 1, n = nums.length;
        while(low<=high){
            int mid = (low + high)/2;
            if(nums[mid] == 0) low = mid + 1;
            else{
                if(mid == 0 || nums[mid - 1] == 0) return n-mid;
                else high = mid -1;
            }
        }
        return 0;
    }
    void main(){
        int[] nums = {1, 1, 1, 1};
        System.out.println(count1(nums));
    }
}
