import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
        		"C:\\\\Users\\\\Hiral_Jain\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
        
        ChromeDriver driver = new ChromeDriver();
        
        driver.get("https://formy-project.herokuapp.com/radiobutton");
        
        driver.manage().window().maximize();
        
        WebElement radioButton1 = driver.findElement(By.id("radio-button-1"));
        radioButton1.click();
        Thread.sleep(1000);
        WebElement radioButton2 = driver.findElement(By.cssSelector("input[value = 'option2']"));
        radioButton2.click();
        Thread.sleep(1000);
        WebElement radioButton3 = driver.findElement(By.xpath("/html/body/div/div[3]/input"));
        radioButton3.click();
        Thread.sleep(1000);
        driver.close();
	}

}
