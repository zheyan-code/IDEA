package Starter;
import java.util.Scanner;
public class QuadraticEquation {
    double a, b, c;
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }
    public double getDeta() {
        return b*b - 4*a*c;
    }
    public double getRoot1(){
        return (-b+Math.sqrt(b*b - 4*a*c))/(2*a);
    }
    public double getRoot2(){
        return (-b-Math.sqrt(b*b - 4*a*c))/(2*a);
    }
    public static void main(String[] args) {
        double a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        double deta = equation.getDeta();
        double root1 = equation.getRoot1();
        double root2 = equation.getRoot2();
        if(deta>0){
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        }
        else if(deta==0) {
            System.out.println("Root 1: " + root1);
        }
        else{
            System.out.println("no root found");
        }
    }
}
