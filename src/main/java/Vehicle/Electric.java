package Vehicle;

import Components.Engine;
import Components.TyreSet;

public class Electric extends Car {

    public Electric(Engine engine, TyreSet tyres, double price, String colour) {
        super(engine, tyres, price, colour);
    }
}