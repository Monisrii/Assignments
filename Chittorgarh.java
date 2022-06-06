package week5.day3;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chittorgarh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		//set the path and download version of driver
		ChromeDriver driver=new ChromeDriver();
		//launch the browser
		driver.manage().window().maximize();
		//maximize the window
		driver.get("https://www.chittorgarh.com/");
		//get the url
		driver.findElement(By.id("navbtn_stockmarket")).click();
		driver.findElement(By.xpath("//a[text()='NSE Bulk Deals']")).click();
		//driver.findElement(By.xpath("//a[text()='Security Name']")).click(); 
		//driver.findElement(By.linkText("Security Name")).click();
		List<WebElement> ele=driver.findElements(By.xpath("//div[@class='table-responsive']//tr//td[3]"));
		//store the values in the webelement
        int size=ele.size();
		//list use size 
		System.out.println("Total Rows"+" "+size);
		//print the row count
		Set<String> name1=new LinkedHashSet<String>();
		for (int i = 0; i < ele.size(); i++) {
			String text = ele.get(i).getText();
			name1.add(text);
		}
		List<String> name=new ArrayList<String>(name1);
		
		//passing set var in list
		System.out.println(name);
		
       
	}
}



