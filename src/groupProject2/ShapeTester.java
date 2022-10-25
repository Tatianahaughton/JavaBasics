package groupProject2;

public class ShapeTester {
    public static void main(String[] args) {
        Shape obj=new Circle();
        obj.calculateArea(5);
        obj.calculatePerimeter(6);

        Shape square=new Square();
        square.calculatePerimeter(5);
        square.calculateArea(8);

    }
}
