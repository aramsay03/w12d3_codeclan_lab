package Vehicle;

import Components.Engine;
import Components.TyreSet;

public class Hybrid extends Car {

    public Hybrid(Engine engine, TyreSet tyres, double price, String colour){
        super(engine, tyres, price, colour);
    }
}
