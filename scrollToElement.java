import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class scrollToElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver",
        		"C:\\\\Users\\\\Hiral_Jain\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
        
        ChromeDriver driver = new ChromeDriver();
        
        driver.get("https://formy-project.herokuapp.com/scroll");
        
        driver.manage().window().maximize();
        
        WebElement name = driver.findElement(By.id("name"));
        Actions action = new Actions(driver);
        action.moveToElement(name);
        name.sendKeys("Hiral Jain");
        
        Thread.sleep(2000);
        
        WebElement date = driver.findElement(By.id("date"));
        date.sendKeys("17/06/2021");
   
        Thread.sleep(2000);
   
        driver.close();

	}

}
