package testScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FindElements extends Base {
	
	public void multipleCheck() {
		
		driver.navigate().to("https://selenium.qabiblr,in/simple-form-demo.php");
		
		List<WebElement> messagefield=(List<WebElement>) driver.findElement(By.xpath("//input[@type='text']"));
		for(WebElement listvalue:messagefield) {
			
			listvalue.sendKeys("Hello");
		}

	}

	public static void main(String[] args) {
		
		FindElements elements=new FindElements();
		elements.initializeBrowser();
		elements.multipleCheck();
	

	}

}
