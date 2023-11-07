import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        //Card To Card
        driver.get("https://tbcpay.ge/ka/transfers");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("#cardToCard_money_input")).sendKeys("500");
        Thread.sleep(500);
        driver.findElement(By.cssSelector("#cardToCard_submit_button")).click();
        Thread.sleep(500);
        driver.findElement(By.cssSelector("#mount > main > div > div > section > section.order-first.flex.max-w-xs.flex-col.items-center.gap-5.xl\\:order-none > button")).click();
        Thread.sleep(1000);
        driver.get("https://tbcpay.ge/ka/transfers");
        //Mobile number
        driver.get("https://tbcpay.ge/ka/transfers");
        driver.findElement(By.cssSelector("#mobileTransfer_money_input")).sendKeys("500");
        Thread.sleep(500);
        driver.findElement(By.cssSelector("#mobileTransfer_input_input")).sendKeys("599984408");
        Thread.sleep(500);
        driver.findElement(By.cssSelector("#mobileTransfer_submit_button")).click();
        Thread.sleep(1000);
        driver.get("https://tbcpay.ge/ka/transfers");
        driver.findElement(By.cssSelector("#toBank_money_input")).sendKeys("5000");
        Thread.sleep(500);
        driver.findElement(By.cssSelector("#toBank_input_input")).sendKeys("00000000000");
        driver.findElement(By.cssSelector("#toBank_submit_button")).click();
        Thread.sleep(1000);
        driver.get("https://tbcpay.ge/ka/transfers");
        driver.findElement(By.cssSelector("#IBAN_money_input")).sendKeys("5000");
        Thread.sleep(500);
        driver.findElement(By.cssSelector("#IBAN_iban_input")).click();
        driver.findElement(By.cssSelector("#IBAN_iban_input")).sendKeys("111111111111111111");
        Thread.sleep(500);
        driver.findElement(By.cssSelector("#IBAN_submit_button")).click();
        Thread.sleep(5000);
        driver.quit();
        
    }
}
