import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecuteJavascript {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
        		"C:\\\\Users\\\\Hiral_Jain\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
        
        ChromeDriver driver = new ChromeDriver();
        
        driver.get("https://formy-project.herokuapp.com/modal");
        
        driver.manage().window().maximize();

        WebElement modalButton = driver.findElement(By.id("modal-button"));
        modalButton.click();
        
        Thread.sleep(3000);
        
        WebElement closeButton = driver.findElement(By.id("close-button"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()", closeButton);
        
        Thread.sleep(3000);
        
        driver.close();
	}

}
