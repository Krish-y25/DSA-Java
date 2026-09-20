package Arrays;

public class max_consecutive_1s {

    //Time complexity: O(n)  Space complexity: O(1)
    static int max_cons1(int[] arr){
        int cnt1 = 0, cnt2 = 0;
        for (int i = 0; i<arr.length; i++){
            if (arr[i] == 0){
                cnt2 = 0;
            }else{
                cnt2++;
                cnt1 = Math.max(cnt1, cnt2);
            }
        }
        return cnt1;
    }
    public static void main(String[] args){
        int[] arr = {0, 1, 0, 1, 1, 1, 1, 0, 1};
        System.out.println(max_cons1(arr));
    }
}
