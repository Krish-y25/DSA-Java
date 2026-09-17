public class Methods_in_java {
    static int logic(int x, int y){
        int z;
        z = (x + y)*2;
        return z;
    }
    public static void main(String[] args) {
        int a=7;
        int b=2;
        int c;
//        Methods_in_java obj = new Methods_in_java();
        c = logic(a,b);
        System.out.println(c);

        int a1 = 5;
        int b1 = 3;
        int c1 = logic(a1,b1);
        System.out.println(c1);
    }
}
