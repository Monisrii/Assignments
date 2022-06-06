package week5.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykka {
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
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement hoverOnbrand = driver.findElement(By.xpath("//a[text()='brands']"));
		Actions builder=new Actions(driver);
		//Actions is class builder is a object
		builder.moveToElement(hoverOnbrand).perform();
		//perform() is method 
		
		driver.findElement(By.xpath("//div[@class='css-ov2o3v'][6]/a")).click();
		//String text = driver.findElement(By.xpath("(//h1[@class='css-mrgb7e'])[1]")).getText();
		//System.out.println(text);
	    String title=driver.getTitle();
	    System.out.print("title" +title);
}
}