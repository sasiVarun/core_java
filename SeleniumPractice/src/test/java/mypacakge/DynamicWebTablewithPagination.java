package mypacakge;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicWebTablewithPagination {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
			
		driver.get("https://demo.opencart.com/admin/index.php");
		
		//Login
		WebElement username = driver.findElement(By.id("input-username"));
		username.clear();
		username.sendKeys("demo");
		
		WebElement password = driver.findElement(By.id("input-password"));
		password.clear();
		password.sendKeys("demo");
		
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		//Sales-->Orders
		driver.findElement(By.xpath("//a[normalize-space()='Sales']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Orders']")).click();
		
		//Table
		
		//Find toal number of pages
		
		String text = driver.findElement(By.xpath("//div[@class='col-sm-6 text-right']")).getText();
		System.out.println(text);
		
		int total_pages = Integer.valueOf(text.substring(text.indexOf("(")+1, text.indexOf("Pages")-1));
		
		System.out.println(total_pages);
		
		for(int p=1; p<=5; p++)
		{
			WebElement active_page = driver.findElement(By.xpath("//ul[@class='pagination']//li//span"));
			
			System.out.println("Active Page:"+active_page.getText());
			active_page.click();
			
			int rows = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();
			System.out.println("Number of rows in page"+active_page.getText()+": "+ rows);
			
			for(int r=1; r<=rows; r++) 
			{
				
				String orderID = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[2]")).getText();
				String customer = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[3]")).getText();
				String status = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[4]")).getText();
				System.out.println(orderID+ "      "+ customer + "      "+ status );
			}
			
			String next_page = Integer.toString(p+1);
			driver.findElement(By.xpath("//ul[@class='pagination']//li//a[text()='"+next_page+"']")).click();
			//driver.findElement(By.xpath("//ul[@class='pagination']//li//a[text()='"+p+1+"']")).click();
		}
		
		
		
	}

}
