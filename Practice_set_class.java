import java.util.Scanner;
class EmployeeNew{
    int salary;
    String name;
    int getSalary(){
        return salary;
    }
    String getName(){
        return name;
    }
    String setname(String NewName){
        name = NewName;
        return name;
    }
}
class CellPhone{
    String brand;
    String model;
    void getstatus1(){
        System.out.println("Ringing....");
    }
    void getstatus2(){
        System.out.println("Vibrating....");
    }
    void getspecifications(){
        System.out.printf("Brand = %s\nModel = %s\n",brand, model);
    }
}
class Square{
    int side;
    void setSide(int s){
        side = s;
    }
    int getArea(){
        return side*side;
    }
    int getPerimeter(){
        return 4*side;
    }
    void getareaperi() {
        System.out.println("Area = " + getArea() + ", Perimeter = " + getPerimeter());
    }
}
class Circle{
    int radi;
    void setRadi(int r){
        radi = r;
    }
    void getAreaPeri(){
        System.out.printf("Area = %.3f Perimeter = %.3f of the circle with radius = %d", 3.14*radi*radi, 2*3.14*radi,radi);
    }
}
public class Practice_set_class {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        EmployeeNew krish = new EmployeeNew();
//        krish.name = "Krish Yadav";
//        krish.salary = 125000;
//        System.out.println(krish.getSalary());
//        System.out.println(krish.getName());
//        System.out.println(krish.setname("Krishna"));
//        System.out.println(krish.getName());
        CellPhone samsung = new CellPhone();
//        System.out.println("Enter the Brand and model of the Cell Phone");
//        samsung.brand=sc.next();
//        sc.nextLine();
//        samsung.model=sc.nextLine();
//        samsung.getstatus1();
//        samsung.getstatus2();
//        samsung.getspecifications();i
        Square sq = new Square();
//        System.out.print("Enter the side of the Square: ");
//        int side = sc.nextInt();
//        sq.setSide(side);
//        System.out.println(sq.getArea());
//        System.out.println(sq.getPerimeter());
//        sq.getareaperi();
        Circle c = new Circle();
        c.setRadi(3);
        c.getAreaPeri();
        sc.close();
    }
}
