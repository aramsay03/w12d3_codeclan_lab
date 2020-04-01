import Vehicle.Car;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    ArrayList<Car> vehicles;



    @Before
    public void before() {
        vehicles = new ArrayList<Car>();
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

}
