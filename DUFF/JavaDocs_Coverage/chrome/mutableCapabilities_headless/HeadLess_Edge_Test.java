package JavaDocs_Coverage.chrome.mutableCapabilities_headless;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class HeadLess_Edge_Test {
    WebDriver driver;

    @Test
    @Disabled
    public void HeadlessEdge_Test() {
        System.setProperty("webdriver.edge.driver", "C:\\qa\\projectShare\\resource\\edgedriver\\msedgedriver.exe");
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--headless=new");
        driver = new EdgeDriver(options);

        driver.get("https://selenium.dev");
        String title = driver.getTitle();
        System.out.println(title);
        Assertions.assertEquals("Selenium", title);

        driver.quit();
    }
}