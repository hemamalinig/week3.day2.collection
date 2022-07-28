package week3.day2.collections.homeassign;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	/* 1. Launch the URL https://www.ajio.com/
	2. In the search box, type as "bags" and press enter
	3. To the left  of the screen under " Gender" click the "Men"
	4. Under "Category" click "Fashion Bags"
	5. Print the count of the items Found. 
	6. Get the list of brand of the products displayed in the page and print the list.
	7. Get the list of names of the bags and print it*/
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Search AJIO']")).sendKeys("bags",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		String totalItems = driver.findElement(By.className("length")).getText();
		System.out.println("Total number of items : " + totalItems);
		List<WebElement> findElements = driver.findElements(By.className("brand"));
		System.out.println("Size :" + findElements.size());
		for (WebElement webElement : findElements) {
			String text = webElement.getText();
			System.out.println("Name of the brand :"+text);
		}		
		List<WebElement> names = driver.findElements(By.className("nameCls"));
		for (WebElement webElement : names) {
			String text = webElement.getText();
			System.out.println("Name of the bag :"+text);
		}				
		}
}
