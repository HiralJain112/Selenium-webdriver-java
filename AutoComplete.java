import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoComplete {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Hiral_Jain\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
        
        ChromeDriver driver = new ChromeDriver();
        
        driver.get("https://formy-project.herokuapp.com/autocomplete");
        
        driver.manage().window().maximize();
        
        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        //autocomplete.click();
        autocomplete.sendKeys("878, Sector 4 Road, Housing Board Colony, Sector 4, Gyan Nagar, Hiran Magri, Udaipur");
        Thread.sleep(1000);
        WebElement autocompleteResult = driver.findElement(By.className("pac-item"));
        autocompleteResult.click();
        Thread.sleep(5000);
        driver.quit();
	}

}
