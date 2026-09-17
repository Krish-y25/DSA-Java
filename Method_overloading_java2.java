public class Method_overloading_java2 {
    static void foo(){
        System.out.println("Hola, mucho gusto");
    }
    static void foo(int a){
        for (int i =0; i<a;i++){
            System.out.println("Hola, mucho gusto");
        }
    }
    static void foo(int a, int b){
        for (int i =0; i<a;i++){
            System.out.printf("Hola, mucho gusto %d\n",b);
        }
    }
    public static void main(String[] args) {
//        foo();
//        foo(4);
        foo(4,5);
        // Arguments are actual!
    }
}
