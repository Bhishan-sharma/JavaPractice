package Day2;

public class Circle {
    int radius;
    final double PI = 3.142857142857143;

    public double area(){
        double area = (this.PI*Math.pow(this.radius, 2));
        return area;
    }

    public double circumference(){
        double area = (2*this.PI*this.radius);
        return area;
    }
}
