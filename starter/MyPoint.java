package starter;

public class MyPoint {
    double x;
    double y;
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }
    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void print(){
        System.out.println("("+x+","+y+")");
    }
    public double distance(MyPoint other) {
        double dx=this.x-other.x;
        double dy=this.y-other.y;
        return Math.sqrt(dx*dx+dy*dy);
    }
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(0,0);
        MyPoint p2 = new MyPoint(10,30.5);
        System.out.println(p1.distance(p2));
    }
}
