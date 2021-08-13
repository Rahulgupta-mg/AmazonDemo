package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazontest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Eclipse-Workspace\\Demo\\src\\Driver\\chromedriver.exe");  
	    WebDriver driver=new ChromeDriver();  
		
	    
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.amazon.in/");
		
	    driver.findElement(By.xpath("(//span[text()='All'])[2]")).click();
	    
	    Thread.sleep(5000);
	    
	    driver.findElement(By.xpath("(//div[text()='Echo & Alexa'])")).click();
	    
	    Thread.sleep(5000);
	    
	    driver.findElement(By.xpath("//a[contains(text(),'Echo Dot (3rd Gen)')]")).click();
	    
	    Thread.sleep(5000);
	    
	    String header = driver.findElement(By.xpath("(//span[contains(text(),'Echo Dot (3rd Gen) - #1 smart speaker brand in India with Alexa (Black)')])")).getText();
		
		if(header != "") {
			
			System.out.println(" Main menu is getting displayed properly");
		} else {
			System.out.println(" Main menu not getting displayed properly");
		}
		
		driver.close();
		
		driver.quit();
		
		
	}

}
