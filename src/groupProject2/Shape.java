package groupProject2;

public interface Shape {
   void calculateArea(double r);
    void calculatePerimeter(double a);
}
class Circle implements Shape {
    public void calculateArea(double r) {
        double area;
        area = (3.14 * r * r);
        System.out.println(area);
    }
    public void calculatePerimeter(double a) {
       double perimeter;
       perimeter=2*3.14*a;
        System.out.println(perimeter);
    }
}
    class Square implements Shape {
        public void calculateArea(double a) {
            double area;
            area = a * a;
            System.out.println(area);
        }
            public void calculatePerimeter ( double a){
                double perimeter = 4 * a;
                System.out.println(perimeter);
            }
        }






