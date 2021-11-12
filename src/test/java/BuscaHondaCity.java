import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.junit.jupiter.api.Assertions;

import java.util.concurrent.TimeUnit;

public class BuscaHondaCity {
    @Test
    public void login() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("test-type");
        chromeOptions.addArguments("start-maximized");
        chromeOptions.addArguments("--js-flags=--expose-gc");
        chromeOptions.addArguments("--enable-precise-memory-info");
        chromeOptions.addArguments("--disable-popup-blocking");
        chromeOptions.addArguments("--disable-default-apps");
        chromeOptions.addArguments("--disable-infobars");
        chromeOptions.addArguments("--profile-directory=Default");
        chromeOptions.addArguments("['user-agent=Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/34.0.1847.11 Safari/537.36']");
        WebDriver driver = new ChromeDriver(chromeOptions);
        try {
            driver.get("https://www.webmotors.com.br/");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(By.className("SearchBar__input")).sendKeys("honda city");
            driver.findElement(By.cssSelector("a[class='Button Button--red-home']")).click();
            driver.findElement(By.className("locationAutoComplete")).sendKeys("São Luís");
            driver.findElement(By.name("São Luís - MA")).click();
            String valorAtual = driver.findElement(By.cssSelector("a[class='sc-ipZHIp lcWUdB']")).getText();
            driver.findElement(By.name("1.5 LX 16V FLEX 4P AUTOMÁTICO")).click();
            String valorEsperado = driver.findElement(By.cssSelector("a[class='Forms__vehicleSendProposal__container__price']")).getText();
            Assertions.assertEquals(valorAtual,valorEsperado);

        } finally {
            driver.quit();
        }
    }
}