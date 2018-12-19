package Selenium_Practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertConfirm {

	public static void main(String[] args) throws Exception {

		
					System.setProperty("webdriver.chrome.driver", "//Volumes//Data Safe//Software//chromedriver");
					//WebDriver driver = new ChromeDriver();
				
					//System.setProperty("webdriver.gecko.driver", "//Volumes//Data Safe//Software//geckodriver");
					
					//WebDriverManager.chromedriver().setup();
					WebDriver driver = new ChromeDriver();
					
					
					
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					
					
					
					
					
					
					
					
			
//					driver.navigate().to("http://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
//					driver.findElement(By.xpath("//button[text()='Simple Alert']")).click();
//					System.out.println("Waiting....");
//					Thread.sleep(3000);
//					
//					driver.switchTo().alert().accept();
//					driver.close();
					
//					JavascriptExecutor js = (JavascriptExecutor) driver;
//					driver.navigate().to("http://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
//					
//					js.executeScript("window.scrollBy(0,400)");
//					driver.findElement(By.xpath("//button[text()='Confirm Pop up']")).click();
//					System.out.println("Waiting....");
//					Thread.sleep(3000);
//					driver.switchTo().alert().dismiss();
//				
//					
//				
//					driver.close();
					
					
					JavascriptExecutor js = (JavascriptExecutor) driver;
					driver.navigate().to("http://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
					
					js.executeScript("window.scrollBy(0,400)");
					driver.findElement(By.xpath("//button[text()='Prompt Pop up']")).click();
					System.out.println("Waiting....");
					Thread.sleep(5000);
					Alert alert1= driver.switchTo().alert();
					alert1.sendKeys("Dhruv is super cool");
					Thread.sleep(5000);
					System.out.println(alert1.getText());
					alert1.accept();
					
				
					driver.close();
					
					
					
			
		
	}

}
