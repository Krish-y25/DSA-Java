public class one_odd_occuring {

    //My-Solution Time Complexity: O(n*n)
    static void odd_occurence(int[] arr){
        int count = 0;
        int len = arr.length;
        for (int i = 0; i<len; i++) {
            for (int j = 0; j < len; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if ((count & 1) != 0) System.out.println(arr[i]);
            count = 0;
        }
    }

    //Efficient Solution - Using XOR operator
    static int odd_occurence_eff(int[] arr){
        int res = arr[0];
        int len = arr.length;
        for (int i = 1; i<len; i++){
            res = res^arr[i];
        }
        return res;
    }
    static void main(String[] args){
        int[] arr = {1, 2, 1, 3, 2, 3, 7, 7, 7};
        System.out.println(odd_occurence_eff(arr));
    }
}
