package week5.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragQuery {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		//WebElement ele=driver.findElement(By.id("draggable"));
		//choosing the element by id to drag and drop
		//Actions bulider=new Actions(driver);
		//action is interface,actions is class
	    //bulider.dragAndDropBy(ele, 100, 100).perform();
		driver.switchTo().frame(0);
	WebElement ele=driver.findElement(By.id("draggable"));
	Actions obj=new Actions(driver);
	obj.dragAndDropBy(ele, 100, 100).perform();
}
}