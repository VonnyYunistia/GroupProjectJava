package class23Project;

class Car {
    private double carPrice;
    private String color;

    public Car(double carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;
    }

    public double calculateSalePrice() {
        return carPrice;
    }
}

class Sedan extends Car {
    private int length;

    public Sedan(double carPrice, String color, int length) {
        super(carPrice, color);
        this.length = length;
    }

    public double calculateSalePrice() {
        if (length > 20) {
            return super.calculateSalePrice() * 0.95;
        } else {
            return super.calculateSalePrice() * 0.9;
        }
    }
}

class Truck extends Car {
    private int weight;

    public Truck(double carPrice, String color, int weight) {
        super(carPrice, color);
        this.weight = weight;
    }

    public double calculateSalePrice() {
        if (weight > 2000) {
            return super.calculateSalePrice() * 0.9;
        } else {
            return super.calculateSalePrice() * 0.8;
        }
    }
}

class main {
    public static void main(String[] args) {
        Car car = new Car(10000, "red");
        System.out.println("Car sale price: " + car.calculateSalePrice());

        Sedan sedan = new Sedan(20000, "blue", 25);
        System.out.println("Sedan sale price: " + sedan.calculateSalePrice());

        Truck truck = new Truck(25000, "black", 3000);
        System.out.println("Truck sale price: " + truck.calculateSalePrice());
    }
}
