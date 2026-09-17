import java.lang.String;
public class power_set_bitwise {
    static void power_set(String st) {
        int len = st.length();
        int psize = 1<<len;
        for (int i = 0; i<psize; i++){
            System.out.print("\"");
            for (int j = 0; j<len; j++){
                if ((i & (1<<j)) != 0) System.out.print(st.charAt(j));
            }
            System.out.println("\"");
        }
    }
    static void main(String[] args){
        String st = "abc";
        power_set(st);
    }
}
