package week3.day2homework;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		driver.get("https://www.ajio.com/");
		// In the search box, type as "bags" and press enter

		driver.findElement(By.name("searchVal")).sendKeys("bags");
		driver.findElement(By.xpath("//span[@class='ic-search']")).click();

		//driver.findElement(By.id("Men")).click();
		//Thread.sleep(5000);
		// To the left of the screen under " Gender" click the "Men"
		// driver.findElement(By.xpath("//label[@for='Men']")).click();

		//System.out.println("1st verification point");

		// Under "Category" click "Fashion Bags"
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		Thread.sleep(5000);

		System.out.println("1st verification point");
		// Print the count of the items Found.
		String totalItems = driver.findElement(By.className("length")).getText();
		System.out.println("Total number of items : " + totalItems);

		// Get the list of brand of the products displayed in the page and print the
		// list.
		System.out.println(" List of Brands");
		// List<WebElement> bagBrandList = driver.findElements(By.className("brand"));
		// System.out.println(" Size :" + bagBrandList.size());

		driver.findElement(By.xpath("//span[text()='brands']")).click();
		java.util.List<WebElement> brandList = driver.findElements(
				By.xpath("//label[contains(@class,'facet-linkname facet-linkname-brand facet-linkname-')]"));

		for (WebElement brands : brandList) {
			String text = brands.getText();
			System.out.println(text);
		}
		// Get the list of names of the bags and print it

		List<WebElement> nameList = driver.findElements(By.className("nameCls"));
		// List<WebElement> bagNameList = driver.findElements(By.className("name"));
		System.out.println(" Size :" + nameList.size());
		System.out.println(" Names of the Bags");
		for (WebElement names : nameList) {
			String text = names.getText();
			System.out.println(text);
		}

	}
}
