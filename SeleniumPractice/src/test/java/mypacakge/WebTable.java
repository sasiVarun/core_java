package mypacakge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/downloads/");
		
		//How many rows in a table
		
		int rows = driver.findElements(By.xpath("//table[@class='data-list']//tbody//tr")).size();
		System.out.println("Total rows: "+rows);
		
		int columns = driver.findElements(By.xpath("//table[@class='data-list']//thead//th")).size();
		System.out.println("Total columns:"+columns);
		
		//Retrieve specific data from row&column
		String value = driver.findElement(By.xpath("//table[@class='data-list']//tr[2]/td[1]")).getText();
		System.out.println("The value is:"+value);
		
//		Retrieving all data from table 
		
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=columns; j++)
			{
				String data = driver.findElement(By.xpath("//table[@class='data-list']//tr["+ i +"]/td["+ j +"]")).getText();
				System.out.print(data+ "     ");
			}
			System.out.println();
		}
		
		driver.quit();
		
	}

}
