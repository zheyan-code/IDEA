package starter;
import java.util.Scanner;

public class MyVector {
     private double x;
     private double y;
     public MyVector(double x, double y) {
         this.x = x;
         this.y = y;
     }
     public double getX() {
         return x;
     }
     public void setX(double x) {
         this.x = x;
     }
     public double getY() {
         return y;
     }
     public void setY(double y) {
         this.y = y;
     }
     public MyVector add(MyVector other) {
         return new MyVector(this.x+other.x, this.y+other.y);
     }
     public MyVector sub(MyVector other) {
         return new MyVector(this.x-other.x, this.y-other.y);
     }
     public MyVector dotProduct(MyVector other) {
         return new MyVector(this.x*other.x, this.y*other.y);
     }
     public MyVector scalarMultiply(double scalar) {
         return new MyVector(this.x*scalar, this.y*scalar);
     }
     public double crossProduct(MyVector other) {
         return (this.x*other.y- this.y*other.x);
     }
    public void display(MyVector other) {
        Scanner sc = new Scanner(System.in);
        boolean flag=false;
        do{
            System.out.println("Enter your choice:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. crossProduct");
            System.out.println("4. DotProduct");
            System.out.println("5. ScalarMultiply");
            System.out.println("6. Exit");
            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("("+this.add(other).getX()+","+this.add(other).getY()+")");
                    break;
                case 2:
                    System.out.println("("+this.sub(other).getX()+","+this.sub(other).getY()+")");
                    break;
                case 3:
                    System.out.println(this.crossProduct(other));
                    break;
                case 4:
                    System.out.println("("+this.dotProduct(other).getX()+","+this.dotProduct(other).getY()+")");
                    break;
                case 5:
                    System.out.println("Enter scalar:");
                    double scalar = sc.nextDouble();
                    System.out.println("("+this.scalarMultiply(scalar).getX()+","+this.scalarMultiply(scalar).getY()+")");
                    break;
                case 6:
                    System.out.println("Exit!");
                    flag=true;
                    break;
            }
        }while(!flag);
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter X1,Y1 for v1:");
         double x1 = sc.nextDouble();
         double y1 = sc.nextDouble();
        System.out.println("Enter X2,Y2 for v2:");
         double x2 = sc.nextDouble();
         double y2 = sc.nextDouble();
        MyVector v1 = new MyVector(x1,y1);
        MyVector v2 = new MyVector(x2,y2);
        v1.display(v2);
    }

}
