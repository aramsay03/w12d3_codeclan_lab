import Vehicle.Car;

import java.util.ArrayList;

public class Dealership {

    private ArrayList<Car> stock;
    private double till;

    public Dealership(ArrayList stock, double till) {
        this.stock = stock;
        this.till = till;
    }

    public int getStock(){
        return stock.size();
    }

    public double getTill(){
        return till;
    }

}
