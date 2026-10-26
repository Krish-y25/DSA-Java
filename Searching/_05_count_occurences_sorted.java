package Searching;

public class _05_count_occurences_sorted {
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
    static int count_occ(int [] nums, int x){
        int first = first_occ_itr(nums, x);
        if (first == -1) return 0;
        else{
            return last_occ_itr(nums, x) - first + 1;
        }
    }
    void main(){
        int[] nums = {1, 2, 2, 2, 2, 4, 5, 5, 5};
        System.out.println(count_occ(nums, 2));
    }
}
