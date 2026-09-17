public class power_of_two {

    //My-Solution
    static boolean power_two(int n){
        int temp = 2;
        if (n==0) return true;
        while (n!=temp && n>=temp){
            temp = temp<<1;
        }
        if (n == temp){
            return true;
        }
        else return false;
    }

    //Efficient Solution with O(1) time complexity
    static boolean power_t(int n){
        if (n == 0) return true;
        return ((n & (n-1)) == 0);
    }
    static void main(String[] args){
        System.out.println(power_two(16));
    }
}
