package starter;

import java.sql.SQLOutput;

public class Triangle2D {
    MyPoint p1, p2, p3;
    public Triangle2D() {
        p1=new MyPoint(0,0);
        p2=new MyPoint(1,1);
        p3=new MyPoint(2,5);
    }
    public Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
        this.p1=p1;
        this.p2=p2;
        this.p3=p3;
    }
    public MyVector Vector(MyPoint P1 ,MyPoint P2) {
        double Vx=P2.getX()-P1.getX();
        double Vy=P2.getY()-P1.getY();
        return new MyVector(Vx,Vy);
    }
    public double aSide(){
        return p1.distance(p2);
    }
    public double bSide(){
        return p1.distance(p3);
    }
    public double cSide(){
        return p2.distance(p3);
    }
    public double getPerimeter(){
        return aSide()+bSide()+cSide();
    }
    public double getArea(){
        double s=getPerimeter()/2;
        return Math.sqrt(s*(s-aSide())*(s-bSide())*(s-cSide()));
    }
    public boolean contains(MyPoint p) {
        boolean flag=false;
        MyVector v1=Vector(p1,p2);
        MyVector v2=Vector(p1,p3);
        MyVector v3=Vector(p2,p3);
        MyVector pv1=Vector(p,p1);
        MyVector pv2=Vector(p,p2);
        MyVector pv3=Vector(p,p3);
        double cross1=pv1.crossProduct(v1);
        double cross2=pv2.crossProduct(v2);
        double cross3=pv3.crossProduct(v3);
        return cross1>0 && cross2>0 && cross3>0 || cross1<0 && cross2<0 && cross3<0;
    }
    public boolean contains(Triangle2D t) {
        return this.contains(t.p1) && this.contains(t.p2) && this.contains(t.p3);
    }
    public boolean overlaps(Triangle2D t) {
        return (this.contains(t.p1) || this.contains(t.p2) || this.contains(t.p3)) && (t.contains(this.p1) || t.contains(this.p2) || t.contains(this.p3));
    }
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(0, 0);
        MyPoint p2 = new MyPoint(0, 3);
        MyPoint p3 = new MyPoint(3, 0);
        Triangle2D t1 = new Triangle2D(p1, p2, p3);

        MyPoint p4 = new MyPoint(1, 1);
        MyPoint p5 = new MyPoint(1, 1);
        MyPoint p6 = new MyPoint(2, 2);
        MyPoint p7 = new MyPoint(1.5, 1.5);
        Triangle2D t2 = new Triangle2D(p5, p6, p7);

        MyPoint p8 = new MyPoint(2, 4);
        MyPoint p9 = new MyPoint(4, 1);
        MyPoint p10 = new MyPoint(3, 3);
        Triangle2D t3 = new Triangle2D(p8, p9, p10);


        System.out.println("the perimeter of t1 is:"+t1.getPerimeter());
        System.out.println("the area of t1 is:"+t1.getArea());
        System.out.println("whether ("+p4.getX()+","+p4.getY()+") is in t1:"+t1.contains(p4));
        System.out.println("whether t2 is in t1:"+t1.contains(t2));
        System.out.println("whether t1 overlap t2:"+t1.overlaps(t3));

    }
}
