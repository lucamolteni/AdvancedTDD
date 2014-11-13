import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class IntegrationTest {
    @BeforeClass
    public static void setUp() throws Exception {
        Server server = new Server();
        server.startServer();
    }

    @Test
    public void webServerShouldGreet() {
        WebDriver driver = new HtmlUnitDriver();
        driver.get("http://localhost:8080/saluta?name=Luca%20Molteni");
        WebElement h1 = driver.findElement(By.tagName("h1"));
        Assert.assertEquals("Ciao Luca Molteni", h1.getText());
    }
}
