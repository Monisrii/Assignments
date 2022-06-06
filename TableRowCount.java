package week5.day5;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableRowCount {
	public static void main(String args[])
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//clean code,reusing purpose we store this as webelement
        //25 Matches so we using webelements//GrandParent to GrandChild
List<WebElement> ele=driver.findElements(By.xpath("//table//tr"));
int size=ele.size();
System.out.println("Total Rows"+" "+size);
List<String> name=new ArrayList<String>();
for(int i=0;i<ele.size();i++) {
String text=ele.get(i).getText();
//System.out.println(i+1+" "+ele.get(i).getText());
name.add(text);

}
Collections.sort(name);
//ascending order
System.out.println(name);





	}
}
