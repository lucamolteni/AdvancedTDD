import org.junit.Assert;
import org.junit.Test;

public class SalutaTest {
    @Test
    public void salutaTest() {
        Portiere portiere = new Portiere(new HtmlGenerator());

        Assert.assertEquals("<h1>Ciao Luca</h1>", portiere.saluta("Luca"));
    }
}
