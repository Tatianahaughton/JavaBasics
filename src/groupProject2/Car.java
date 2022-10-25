package groupProject2;

public class Car {
    String color;
    double carPrice;

    double calculateSalePrice(String color, double carPrice) {
        this.color = color;
        this.carPrice = carPrice;
        return carPrice;
    }
}
    class Truck extends Car {
        double weight;
        double truckPrice;

        double calculateSalePrice(String color, double truckPrice, double weight) {
            this.color = color;
            this.truckPrice = truckPrice;
            this.weight = weight;
            if (weight > 2000) {
                carPrice = truckPrice * .90;
            } else {
                carPrice = truckPrice * .80;
            }
            return carPrice;
        }
    }

    class Sedan extends Car {
        String color;
        double length;
        double sedanPrice;

        double calculateSalePrice(String color, double length, double sedanPrice) {
            this.color = color;
            this.length = length;
            this.sedanPrice = sedanPrice;
            if (length > 20) {
                carPrice = sedanPrice * .5;
            } else if (length < 20) {
                carPrice = sedanPrice * .10;
            }
            return carPrice;
        }
    }


















