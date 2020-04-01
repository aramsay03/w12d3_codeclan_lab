import Vehicle.Car;

import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Car> vehicles;
    private double money;

    public Customer(String name, ArrayList vehicles, double money ) {
        this.name = name;
        this.vehicles = vehicles;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public int getVehicles() {
        return vehicles.size();
    }

    public double getMoney() {
        return money;
    }
}
