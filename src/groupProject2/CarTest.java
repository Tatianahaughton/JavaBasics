package groupProject2;

public class CarTest {
    public static void main(String[] args) {
        Truck truck = new Truck();
        truck.calculateSalePrice("Black",1300);

        Sedan sedan=new Sedan();
        sedan.calculateSalePrice("Red",15,2000);

    }
}
