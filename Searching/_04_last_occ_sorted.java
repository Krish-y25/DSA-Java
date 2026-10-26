package Searching;

public class _04_last_occ_sorted {

    // TC: O(logn)  SC: O(1)
    static int last_occ_itr(int[] nums, int x){
        int low = 0, high = nums.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid] > x) high = mid-1;
            else if (nums[mid] < x) low = mid+1;
            else {
                if (mid == nums.length-1 || nums[mid+1] != x) return mid;
                else low = mid+1;
            }
        }
        return -1;
    }

    //  TC: O(logn) SC: O(logn)
    static int last_occ_rec(int[] nums, int low, int high, int x){
        if(low>high) return -1;
        int mid = (low+high)/2;
        if(nums[mid] > x) return last_occ_rec(nums, low, mid-1, x);
        else if (nums[mid] < x) return last_occ_rec(nums, mid+1, high, x);
        else {
            if (mid == nums.length-1 || nums[mid+1] != x) return mid;
            else return last_occ_rec(nums, mid+1, high, x);
        }
    }
    void main(){
        int[] nums = {1, 2, 2, 2, 2, 4, 5, 5, 5};
        System.out.println(last_occ_itr(nums, 5));
    }
}
