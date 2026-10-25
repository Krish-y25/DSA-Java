package Searching;

//  TC: O(n)    SC: O(1)
public class _01_binary_search_iterative {
    static int b_search(int[] nums, int val){
        int low = 0, high = nums.length -1;
        while(low<=high){
            int mid = (low + high)/2;
            if(nums[mid] == val) return mid;
            else if (nums[mid] > val) {
                high = mid-1;
            }
            else low = mid+1;
        }
        return -1;
    }
    public static void main(String[] args){
        int[] nums = {10, 10};
        System.out.println(b_search(nums, 10));
    }
}
