import Components.Engine;
import Components.TyreSet;
import Vehicle.Car;
import Vehicle.Car;
import Vehicle.Car;
import Vehicle.Petrol;
import Vehicle.Petrol;
import Vehicle.Petrol;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PetrolTest {

    Petrol car;
    Engine engine;
    TyreSet tyre;

    @Before
    public void before() {
        engine = new Engine("Petrol");
        tyre = new TyreSet("All-weather", "Goodyear");
        car = new Petrol(engine, tyre, 500.00, "Yellow");
    }

    @Test
    public void canGetEngine() {
        assertEquals(engine, car.getEngine());
    }

    @Test
    public void canGetTyres() {
        assertEquals(tyre, car.getTyres());
    }

    @Test
    public void canGetPrice() {
        assertEquals(500.00, car.getPrice(), 00);
    }

    @Test
    public void canGetColour() {
        assertEquals("Yellow", car.getColour());
    }
}
