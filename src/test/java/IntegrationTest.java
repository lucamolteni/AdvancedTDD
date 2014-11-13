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
        Server server = new Server();
        server.startServer();
    }

    @Test
    public void webServerShouldGreet() {
        WebDriver driver = new HtmlUnitDriver();
        driver.get("http://localhost:8080/saluta?name=Gianni");
        WebElement h1 = driver.findElement(By.tagName("h1"));
        Assert.assertEquals("Ciao Gianni", h1.getText());
    }
}
