import java.util.*;
class Box{
    double w,h,d;
    Box(){
        w=2;
        h=2;
        d=2;
    }
    Box(double a){
        w=a;
        h=2;
        d=3;
    }
    Box(double a,double b){
        w=a;
        h=b;
        d=3;
    }
    Box(double a,double b,double c){
        w=a;
        h=b;
        d=c;
    }
    double Volume(){
        return w*h*d;
    }
}
class Vol_Box{
        public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        System.out.println("\t Classes and Objects");
        double a1,b1,b2,c1,c2,c3;
        System.out.println("Enter One value :");
        a1=s.nextDouble();
        System.out.println("Enter Two values :");
        b1=s.nextDouble();
        b2=s.nextDouble();    
        System.out.println("Enter Three values :");
        c1=s.nextDouble();
        c2=s.nextDouble();
        c3=s.nextDouble();
        Box box=new Box();
        Box box1=new Box(a1);
        Box box2=new Box(b1,b2);
        Box box3=new Box(c1,c2,c3);
        System.out.println("The Volume of Box1 is :"+box.Volume());
        System.out.println("The Volume of Box2 is :"+box1.Volume());
        System.out.println("The Volume of Box3 is :"+box2.Volume());
        System.out.println("The Volume of Box4 is :"+box3.Volume());
    }
}