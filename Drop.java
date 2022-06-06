package week5.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drop {
	public static void main(String args[])
	{
		
	
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://jqueryui.com/droppable/");
	driver.manage().window().maximize();
	driver.switchTo().frame(0);
	WebElement ele=driver.findElement(By.xpath("//div[@class='ui-widget-content ui-draggable ui-draggable-handle']"));
	//inspect the drag
	WebElement ele1=driver.findElement(By.xpath("//div[@class='ui-widget-header ui-droppable']"));
	//inspect the drop 
	Actions bulider=new Actions(driver);
	//action is interface,actions is class
    bulider.dragAndDrop(ele, ele1).perform();
	
}
}