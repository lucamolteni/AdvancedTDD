import org.junit.Assert;
import org.junit.Test;

public class SalutaTest {
    @Test
    public void salutaTest() {
        Portiere portiere = new Portiere();

        Assert.assertEquals("Ciao Luca", portiere.saluta("Luca"));
    }
}
