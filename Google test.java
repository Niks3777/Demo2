package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//add chrome driver
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
		//initialize a chrome driver
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Prof Ajit Vishwakarma");
		driver.findElement(By.name("btnK")).submit();
	}

}
