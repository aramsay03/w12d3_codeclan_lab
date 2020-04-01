import Vehicle.Car;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;
    ArrayList<Car> vehicles;

    @Before
    public void setUp() {
        vehicles = new ArrayList<Car>();
        dealership = new Dealership(vehicles, 500);
    }

    @Test
    public void hasStock(){
        assertEquals(0, dealership.getStock());
    }

    @Test
    public void hasTill(){
        assertEquals(500, dealership.getTill(), 0.0);
    }

}