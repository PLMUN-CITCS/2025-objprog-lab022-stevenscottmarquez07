// Define the Car class
class Car {
    // Attributes of the Car class
    String make;
    String model;
    int year;

    // Method to display car information
    public void displayInfo() {
        System.out.println("Car: " + year + " " + make + " " + model);
    }
}

// Main class to demonstrate the Car class
public class CarDemo {
    public static void main(String[] args) {
        // Create a Car object
        Car myCar = new Car();

        // Assign values to attributes
        myCar.make = "Toyota";
        myCar.model = "Corolla";
        myCar.year = 2020;

        // Display car information
        myCar.displayInfo();
    }
}
