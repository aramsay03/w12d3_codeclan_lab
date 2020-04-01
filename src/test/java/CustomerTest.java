import Components.Engine;
import Components.TyreSet;
import Vehicle.Car;
import Vehicle.Petrol;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    ArrayList<Car> vehicles;
    Petrol car;
    TyreSet tyre;
    Engine engine;


    @Before
    public void before() {
        vehicles = new ArrayList<Car>();
        engine = new Engine("Petrol");
        tyre = new TyreSet("Rain", "Goodyear");

        car = new Petrol(engine, tyre, 500, "Red");

        customer = new Customer("Barry", vehicles , 500.00);
    }

    @Test
    public void canGetName() {
        assertEquals("Barry", customer.getName());
    }

    @Test
    public void canGetVehicles() {
        assertEquals(0, customer.getVehicles());
    }

    @Test
    public void canGetMoney() {
        assertEquals(500.00, customer.getMoney(), 00);
    }
    
    @Test
    public void canAddVehicle() {
        customer.addVehicle(car);
        assertEquals(1, customer.getVehicles());
    }

    @Test
    public void canReduceMoney() {
        customer.reduceMoney(500.00);
        assertEquals(0, customer.getMoney(), 00);
    }
}
