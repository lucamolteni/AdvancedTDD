import org.junit.Assert;
import org.junit.Test;

public class HtmlFormatterTest {
    @Test
    public void shouldSorroundWithH1(){
        HtmlGenerator htmlGenerator = new  HtmlGenerator();

        Assert.assertEquals("<h1>Pippo</h1>", htmlGenerator.h1("Pippo"));
    }
}
