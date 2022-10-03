package mypacakge;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthenticationAlert {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Handling basic auth alert pop-ups

		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

		// Syntax for handling authenticated pop-ups
		// https://username:password@URL
		// https://admin:admin@the-internet.herokuapp.com/basic_auth

	}

}
