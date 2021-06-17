import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchtoAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
        		"C:\\\\Users\\\\Hiral_Jain\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
        
        ChromeDriver driver = new ChromeDriver();
        
        driver.get("https://formy-project.herokuapp.com/switch-window");
        
        driver.manage().window().maximize();
        Thread.sleep(5000);
        WebElement alertButton = driver.findElement(By.id("alert-button"));
        alertButton.click();
        Thread.sleep(5000);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep(5000);
        
        driver.close();
	}

}
