package week5.day3;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintValues {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://html.com/tags/table/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='render']//th[1]"));
		/*List<WebElement>ele=driver.findElements(By.xpath("//div[@class='render']//td"));
		int size=ele.size();
		System.out.println("counts" +size);
		List<String> name=new ArrayList<String>();
		for(int i=0;i<ele.size();i++) {
			String text=ele.get(i).getText();
			System.out.println(i+1+" "+ele.get(i).getText());
			name.add(text);
		}*/
		//-----------------------
		String str = "Absolute Usage";
		List<WebElement> findElements = driver.findElements(By.xpath("//div[@class='render']/table//td[text()='"+str+"']/../td"));
		for (WebElement webElement : findElements)
		{
			System.out.println(webElement.getText());
		}
		
		List<WebElement> findElements1 = driver.findElements(By.xpath("//div[@class='render']/table//td[text()='Market Share']/../td"));
		for (WebElement webElement : findElements1)
		{
			System.out.println(webElement.getText());
		}
		
		
		
}
}