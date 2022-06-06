package week5.day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDeal {
	public static void main(String args[])
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		//to disable the notification
		//options.setHeadless(true);
		//to run without opening the window
		//showing console only.
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://www.snapdeal.com/");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		WebElement hoverOnMens = driver.findElement(By.xpath("//span[text()=\"Men's Fashion\"]"));
		Actions builder=new Actions(driver);
		//Actions is class builder is a object
		builder.moveToElement(hoverOnMens).perform();
		//perform() is method 
		driver.findElement(By.xpath("//span[text()='Sports Shoes']")).click();
		String text=driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
		System.out.println("The count is"+text);
		WebElement ele=driver.findElement(By.xpath("//h1[@class='category-name']"));
		String str=ele.getText();
		System.out.println("title" +str);
		
}}
