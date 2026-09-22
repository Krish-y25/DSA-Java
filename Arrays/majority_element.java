package Arrays;

public class majority_element {
    /* If an element appears more than n/2 times in an array then that element is said to be an majority element
    where n is the size of the array */

    //Naive solution(My)    TC: O(n^2)  SC: O(1)
    static int majority(int[] arr){
        int n = arr.length, cnt, index = -1;
        for (int i = 0; i<=n/2; i++){
            cnt = 1;
            for (int j = i+1; j<n; j++){
                if (arr[i] == arr[j]) cnt++;
            }
            if (cnt>n/2) return i;
        }
        return -1;
    }

    //Efficient solution [MOORE'S VOTING ALGORITHM]
    // TC: O(n) SC: O(n)
    public static int findmajority(int[] arr){
        int n = arr.length, cnt = 1, res = 0;
        for (int i = 1; i<n; i++){
            if (arr[i] == arr[res]) cnt++;
            else cnt--;
            if (cnt == 0){
                cnt = 1;
                res = i;
            }
        }
        cnt = 0;
        for (int i = 0; i<n; i++){
            if (arr[res] == arr[i]) cnt++;
        }
        if (cnt<=n/2) res = -1;
        return res;
    }
    public static void main(String[] args){
        int[] arr = {8, 8, 6, 6, 6, 4, 6};
        System.out.println(findmajority(arr));
    }
}
