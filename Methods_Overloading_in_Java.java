public class Methods_Overloading_in_Java {
    static void tellName(){
        System.out.println("Krish");
    }

    static void number(int a){
        a = 45;
    }

    static void array(int [] arr){
        arr[1] = 0;
    }
    public static void main(String[] args) {
        tellName();
        int [] marks = {67,89,56,78,53};
        int x = 98;
        number(x);
        System.out.println(x);
        array(marks);
        System.out.println(marks[1]);
    }
}