package Vehicle;

import Components.Engine;
import Components.TyreSet;

public class Petrol extends Car {

    public Petrol(Engine engine, TyreSet tyres, double price, String colour){
        super(engine, tyres, price, colour);
    }
}
