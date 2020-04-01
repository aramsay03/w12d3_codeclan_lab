package Vehicle;

import Components.Engine;
import Components.TyreSet;

public abstract class Car {

    Engine engine;
    TyreSet tyres;
    double price;
    String colour;

    public Car (Engine engine, TyreSet tyres, double price, String colour){
        this.engine = engine;
        this.tyres = tyres;
        this.price = price;
        this.colour = colour;
    }

    public Engine getEngine(){
        return engine;
    }

    public TyreSet getTyres(){
        return tyres;
    }

    public double getPrice(){
        return price;
    }

    public String getColour(){
        return colour;
    }
}
