import Components.TyreSet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyreSetTest {

    TyreSet tyre;

    @Before
    public void before() {
        tyre = new TyreSet("All-Weather", "Goodyear");
    }

    @Test
    public void canGetType() {
        assertEquals("All-Weather", tyre.getType());
    }

    @Test
    public void canGetBrand() {
        assertEquals("Goodyear", tyre.getBrand());
    }
}
