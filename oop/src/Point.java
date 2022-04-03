public class Point {
    double x;
    double y;
    public Point(double x,double y){
        this.x=x;
        this.y=y;
    }
    public double distance(Point p){
        double d = Math.sqrt((this.x-p.x)*(this.x-p.x)+((this.y-p.y)*(this.y-p.y)));
        return d;
    }

    public static void main(String[] args) {
        Point p1 = new Point(3.0,4.0);
        Point p2 = new Point(3.0,5.0);
        System.out.println(p1.distance(p2));
    }
}
