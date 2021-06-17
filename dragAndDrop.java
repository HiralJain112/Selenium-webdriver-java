import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
        		"C:\\\\Users\\\\Hiral_Jain\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
        
        ChromeDriver driver = new ChromeDriver();
        
        driver.get("https://formy-project.herokuapp.com/dragdrop");
        
        driver.manage().window().maximize();

        WebElement image = driver.findElement(By.id("image"));
        
        Thread.sleep(3000);
        
        WebElement box = driver.findElement(By.id("box"));
        
        Thread.sleep(3000);
        
        Actions action = new Actions(driver);
        action.dragAndDrop(image, box).build().perform();
        
        Thread.sleep(3000);
        
        driver.close();
	}

}
