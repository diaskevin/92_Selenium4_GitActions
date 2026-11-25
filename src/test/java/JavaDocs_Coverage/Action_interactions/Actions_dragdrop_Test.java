package JavaDocs_Coverage.Action_interactions;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Actions_dragdrop_Test {
    WebDriver driver;

 private ChromeOptions getChromeOptions() {
        ChromeOptions options = new ChromeOptions();
        if ("true".equalsIgnoreCase(System.getenv("CI")) || "true".equalsIgnoreCase(System.getProperty("headless"))) {
            options.addArguments("--headless=new");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");
            options.addArguments("--window-size=1920,1080");
        }
        return options;
    }
    

    @Test
    public void dragDrop_Test() throws InterruptedException {

        //Note: Following statement is required since Selenium 3.0,
        //optional till Selenium 2.0
        //Set system properties for geckodriver
        //System.setProperty("webdriver.chrome.driver", "C:\\qa\\projectShare\\resource\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver(getChromeOptions());

        String URL = "https://www.selenium.dev/selenium/web/mouse_interaction.html";

        driver.get(URL);

        // It is always advisable to Maximize the window before performing DragNDrop action
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));

        //Actions class method to perform drag and drop
        WebElement from = driver.findElement(By.id("draggable"));
        WebElement to = driver.findElement(By.id("droppable"));
        new Actions(driver).dragAndDrop(from, to).perform();

        WebElement clickable = driver.findElement(By.id("clickable"));

        //verify text changed in to 'Drop here' box
        String textTo = to.getText();

        if (textTo.equals("Dropped!")) {
            System.out.println("PASS: Source is dropped to target as expected");
        } else {
            System.out.println("FAIL: Source couldn't be dropped to target as expected");
        }

        driver.close();

    }
}

