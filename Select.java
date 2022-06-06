package week5.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Select {
	public static void main(String args[])
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.switchTo().frame(0);
		WebElement ele=driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement ele1=driver.findElement(By.xpath("//li[text()='Item 2']"));
		WebElement ele2=driver.findElement(By.xpath("//li[text()='Item 3']"));
		WebElement ele3=driver.findElement(By.xpath("//li[text()='Item 4']"));
		//WebElement ele2=driver.findElement(By.xpath("//li[text()='Item 3']"));
	//	WebElement ele3=driver.findElement(By.xpath("//li[text()='Item 4']"));
		
		
		Actions obj=new Actions(driver);
		obj.clickAndHold(ele).clickAndHold(ele1).clickAndHold(ele2).clickAndHold(ele3).release().perform();
		
	}
}
