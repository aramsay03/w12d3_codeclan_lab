import Components.TyreSet;
import org.junit.Before;
import org.junit.Test;

public class TyreSetTest {

    TyreSet tyre;

    @Before
    public void before() {
        tyre = new TyreSet("All-Weather", "Goodyear")
    }

    @Test
    public void canGetType() {
        assertEquals("All-Weather", tr)
    }
}
