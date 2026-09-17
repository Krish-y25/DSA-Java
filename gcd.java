public class gcd {
    static int calc_gcd(int num1, int num2){
        while (num1 != num2) {
            if (num1 > num2) {
                num1 = num1 - num2;
            } else {
                num2 = num2 - num1;
            }
        }
        return num1;
    }
    public static void main(String[] args){
        System.out.println(calc_gcd(28,14));
    }
}
