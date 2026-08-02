import java.util.*;
class Area_Shapes{
    double pi=3.14;
    void area(int a){
        System.out.println("\nThe Area of the Square is :"+a*a);
    }
    void area(int a,int b){
        System.out.println("The Area of the Rectangle is :"+a*b);
    }
    double area(double r){
        return pi*r*r;
    }
}
class Shapes{
    public static void main(String args[]){
    System.out.println("\t Implementing Classes");
    Scanner s=new Scanner(System.in);
    double c,area_cir;
    int sq,l,b;
    Area_Shapes ar=new Area_Shapes();
    System.out.print("\nEnter the Side for Square :");
    sq=s.nextInt();
    System.out.print("Enter the Length of the Rectangle :");
    l=s.nextInt();
    System.out.print("Enter the Breadth of the Rectangle :");
    b=s.nextInt();
    System.out.print("Enter the Radius of the Circle :");
    c=s.nextDouble();
    ar.area(sq);
    ar.area(l,b);
    area_cir=ar.area(c);
    System.out.println("The Area of the Circle is :"+area_cir);
    }
}