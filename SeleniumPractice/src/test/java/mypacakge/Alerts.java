package mypacakge;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//Handling Alert window with OK button
		
		/*
		 driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();;
		 Thread.sleep(3000); driver.switchTo().alert().accept();
		 */
		
		//Handling Alert with OK & Cancel button
		/*driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();*/
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Alert alertWindow = driver.switchTo().alert();
		
		System.out.println("Text in alert box"+alertWindow.getText());
		alertWindow.sendKeys("Sending text to Alert box");
		alertWindow.accept();
		
		
	}

}
