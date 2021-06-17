
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class keyBoardAndMouseInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Hiral_Jain\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
         
         ChromeDriver driver = new ChromeDriver();
         
         driver.get("https://formy-project.herokuapp.com/keypress");
         
         driver.manage().window().maximize();
         
         WebElement name = driver.findElement(By.id("name"));
         name.click();
         name.sendKeys("Hiral Jain");
         
         WebElement button = driver.findElement(By.id("button"));
         button.click();
         driver.quit();
	}

}
