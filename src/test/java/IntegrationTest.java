import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class IntegrationTest {
    @Before
    public void setUp() throws Exception {
        Main.main(null);
    }

    @Test
    public void webServerShouldGreet() {
        WebDriver driver = new HtmlUnitDriver();

        driver.get("http://localhost:8080/");
        WebElement h1 = driver.findElement(By.tagName("h1"));
        Assert.assertEquals("Ciao da Jetty Embedded", h1.getText());
    }
}
