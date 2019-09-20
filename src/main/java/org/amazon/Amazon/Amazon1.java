package org.amazon.Amazon;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon1 {
	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","\\javaprogs\\MavenFirst\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	
	WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
	search.sendKeys("One Plus7");
	search.sendKeys(Keys.ENTER);
	
	WebElement txt = driver.findElement(By.xpath("(//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2'])[1]"));
	String s = txt.getText();
	System.out.println(s);
	
	List<WebElement> models = driver.findElements(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])"));
	int size = models.size();

		for(int i=1;i<models.size();i++)
		{
			WebElement lst = models.get(i);
			String text = lst.getText();
			System.out.println(text);
			
			
		}
		System.out.println("Total Number of models printed : "+size);
	}
}