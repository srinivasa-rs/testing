import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
 
public class LoginUsingSelenium {
 
    @Test
    public void login() {
        // TODO Auto-generated method stub
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\srini\\OneDrive\\Desktop\\PyCharm\\chromedriver_win32");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");
        
        WebElement username=driver.findElement(By.id("email"));
        WebElement password=driver.findElement(By.id("password"));
        WebElement login=driver.findElement(By.xpath("//button[text()='submit']"));
        
        email.sendKeys("jetblue@grr.la");
        password.sendKeys("jetblue");
        login.click();
        driver.SwitchTo().alert().accept();
       
        
        driver.findElement(By.title("View my shopping cart")).click();
        driver.findElement(By.Xpath("//a[@title='T-shirts']")).click();
        driver.findElement(By.ClassName("button ajax_add_to_cart_button btn btn-default").click();
        driver.findElement(By.ClassName("icon-chevron-right right").click();
        driver.findElement(By.ClassName("icon-chevron-right right").click();
        driver.findElement(By.ClassName("icon-chevron-right right").click();
        driver.findElement(By.Xpath("//input[@type='checkbox']")).click();
        driver.findElement(By.ClassName("icon-chevron-right right").click();
        driver.findElement(By.ClassName("icon-chevron-right right").click();
        
        String actualUrl="http://automationpractice.com/index.php";
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        
        String expectedText ="Product successfully added to your shopping cart";
        Assert.assertEquals("Product successfully added to your shopping cart",expectedText);
        
        
        
        
        
     
        
    }
 
}