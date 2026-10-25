package Searching;

public class _02_binary_search_recursive {

    // TC: O(logn)  SC: O(logn)
    static int bsearch_rec(int[] nums, int val, int low, int high){
        if(low>high) return -1;
        int mid = (low+high)/2;
        if(nums[mid] == val) return mid;
        else if (nums[mid] > val) {
            return bsearch_rec(nums, val, low, mid-1);
        }
        else return bsearch_rec(nums, val, mid+1, high);
    }
    void main(){
        int[] nums = {15};
        System.out.println(bsearch_rec(nums, 20, 0, nums.length -1));
    }
}
