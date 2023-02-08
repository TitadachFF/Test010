import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

class TC002 {

	@Test
	void test() throws InterruptedException {
        WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        
        
        
        driver.get("https://nxtgenaiacademy.com/demo-site/");
        driver.findElement(By.xpath("//*[@id=\"vfb-5\"]")).sendKeys("John");
        driver.findElement(By.xpath("//*[@id=\"vfb-7\"]")).sendKeys("Doe");
        driver.findElement(By.xpath("//*[@id=\"vfb-13-address\"]")).sendKeys("My home 151/2");
        driver.findElement(By.xpath("//*[@id=\"vfb-13-address-2\"]")).sendKeys("OldTownRoad010");   
        driver.findElement(By.xpath("//*[@id=\"vfb-13-city\"]")).sendKeys("ชั้น4");
        driver.findElement(By.xpath("//*[@id=\"vfb-13-state\"]")).sendKeys("409");  
        driver.findElement(By.xpath("//*[@id=\"vfb-13-zip\"]")).sendKeys("Nakhonpathom");
        driver.findElement(By.xpath("//*[@id=\"vfb-14\"]")).sendKeys("644259010@webmail.npru.ac.th");
        driver.findElement(By.xpath("//*[@id=\"vfb-18\"]")).sendKeys("02/02/2023");
                driver.findElement(By.xpath("//*[@id=\"vfb-19\"]")).sendKeys("0927735976");
                
        WebElement radio1 = driver.findElement(By.xpath("//*[@id=\"vfb-20-0\"]"));
        radio1.click();
        WebElement radio2 = driver.findElement(By.xpath("//*[@id=\"vfb-20-1\"]"));
        radio2.click();
        WebElement radio3 = driver.findElement(By.xpath("//*[@id=\"vfb-20-2\"]"));
        radio3.click();
        WebElement radio4 = driver.findElement(By.xpath("//*[@id=\"vfb-20-3\"]"));
        radio4.click();
        WebElement radio5 = driver.findElement(By.xpath("//*[@id=\"vfb-20-4\"]"));
        radio5.click();
        WebElement radio6 = driver.findElement(By.xpath("//*[@id=\"vfb-20-5\"]"));
        radio6.click();
        
        driver.findElement(By.xpath("//*[@id=\"vfb-23\"]")).sendKeys("JavaScriptandCSS Learning");
        driver.findElement(By.xpath("//*[@id=\"vfb-3\"]")).sendKeys("99");
        
       driver.findElement(By.xpath("//*[@id=\"vfb-4\"]")).click();
        
        String result = driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div[1]/div/div/div/div/div/div/div/h2")).getText();
        assertEquals("Dynamic Transaction Verification", result);
        
       Thread.sleep(4000);
        driver.quit();
        driver = null;
        
    }

}