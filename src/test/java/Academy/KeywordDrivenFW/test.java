package Academy.KeywordDrivenFW;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
	
	public static void main(String args[]) {
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\salma\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\salma\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		String t = driver.getTitle();
		System.out.println("The title of the page is: " +t);
		
		driver.close();
		
		driver.quit();

}
}
