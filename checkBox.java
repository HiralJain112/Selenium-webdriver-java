import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
        		"C:\\\\Users\\\\Hiral_Jain\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
        
        ChromeDriver driver = new ChromeDriver();
        
        driver.get("https://formy-project.herokuapp.com/checkbox");
        
        driver.manage().window().maximize();
        
        WebElement checkBox1 = driver.findElement(By.id("checkbox-1"));
        checkBox1.click();
 
        Thread.sleep(1000);
        
        WebElement checkBox2 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/input"));// or use this full X-path //*[@id=\"checkbox-2\"]
        checkBox2.click();
        
        Thread.sleep(1000);
        
        WebElement checkBox3 = driver.findElement(By.id("checkbox-3"));
        checkBox3.click();
        
        Thread.sleep(1000);
        
        driver.close();
	}

}
