package Academy.KeywordDrivenFW;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginexample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\salma\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");  //OPEN A URL
		String title = driver.getTitle(); //TAKE TITLE OF THE PAGE
		System.out.println("The title of the page is: " + title); //PRINT THE TITLE OF THE PAGE
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //IMPLICIT WAIT SYNTAX - ALWAYS DEFINE AT GLOBAL LEVEL FOR WHOLE PAGE
		
		List<WebElement> links = driver.findElements(By.tagName("a")); //COUNT THE NUMBER OF LINKS or URL ON A PAGE
		System.out.println("The number of active Link is: " + links.size());
		
		//driver.findElement(By.xpath(""));  //COUNT THE NUMBER OF RADIO BUTTON ON A PAGE
		
		System.out.println("SCRIPT IS SUCCESSFULLY EXEUCTED AND PASSED"); 
		
		driver.quit(); //CLOSES ALL THE BROWSER WINDOW AND ENDS THE WEBDRIVER SESSION
		driver.close(); //CLOSE ONLY THE CURRENT WINDOW, WEBDRIVER SESSION REMAINS ACTIVE
		
		
		

	}

}
