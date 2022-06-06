package week5.day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//count the rows and column
public class PrintCount {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://html.com/tags/table/");
		driver.manage().window().maximize();
		List<WebElement> ele=driver.findElements(By.xpath("//table[@class='attributes-list']//tr/td"));
		int size=ele.size();
		System.out.println("Total Rows"+" "+size);
		List<WebElement> ele1=driver.findElements(By.xpath("//table[@class='attributes-list']//th"));
		int size1=ele1.size();
		System.out.println("Total column"+" "+size1);
		
}
}