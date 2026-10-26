package Searching;

public class _03_first_occ_sorted_ary {

    //TC: O(logn)   SC: O(1)
    static int first_occ_itr(int[] nums, int x){
        int low = 0, high = nums.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid] == x){
                if(mid == 0 || nums[mid-1] != x) return mid;
                else high = mid-1;
            }
            else if (nums[mid] > x) high = mid -1;
            else low = mid+1;
        }
        return -1;
    }

    // TC: O(logn)  SC: O(logn)
    static int first_occ_rec(int[] nums, int low, int high, int x){
        if(low>high) return -1;
        int mid = (low+high)/2;
        if (nums[mid] == x){
            if(mid == 0 || nums[mid-1] != x) return mid;
            else return first_occ_rec(nums, low, mid-1, x);
        } else if (nums[mid] > x) return first_occ_rec(nums, low, mid-1, x);
        else return first_occ_rec(nums, mid+1, high, x);
    }
    void main(){
        int[] nums = {15, 15, 15};
        System.out.println(first_occ_rec(nums, 0, 2, 15));
    }
}
