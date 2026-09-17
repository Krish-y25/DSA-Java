import java.util.Scanner;
class My_circle{
    private int radi;
    private float area;
    private float peri;
    public void setRadi(int r){
        radi = r;
    }
    public int getRadi(){
        return radi;
    }
    public void setArea(float a){
        if(a == 3.14f*radi*radi){
            area = a;
        }
        else{
            System.out.println("Incorrect area provided");
        }
    }
    public float getArea(){
        return area;
    }
    public void setPeri(float p){
        if(p == 2*3.14f*radi){
            peri = p;
        }
        else{
            System.out.println("Incorrect perimeter provided");
        }
    }
    public float getPeri(){
        return peri;
    }
}


public class getters_setters {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        My_circle c = new My_circle();
        System.out.println("Enter radius of the circle");
        int radi = sc.nextInt();
        c.setRadi(radi);
        c.setArea(3.14f*radi*radi);
        c.setPeri(2*3.14f*radi);
        System.out.printf("Area = %f Perimeter = %f\n",c.getArea(),c.getPeri());
        sc.close();
    }
}
