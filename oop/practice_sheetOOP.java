
    // Question 2 : What is the output of the following program?  Driving electric car

public class practice_sheetOOP {

    public static void main(String[] args) {
        Car car = new ElectricCar();
        System.out.print(car.drive());
    }
}

class Automobile {
}

class Car extends Automobile {

    protected String drive() {
        return "Driving car";
    }
}

class ElectricCar extends Car {

    @Override
    public final String drive() {
        return "Driving electric car";
    }
}