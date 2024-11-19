package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class InputForm extends Base {
	
	public void showmessage() { //a[@href="simple-form-demo.php"]
		
		WebElement inputform=driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));
		inputform.click();
		WebElement message=driver.findElement(By.id("single-input-field"));
		message.sendKeys("Hello");
		WebElement showmessage=driver.findElement(By.id("button-one"));
		showmessage.click();
		}
	

	public static void main(String[] args) {
		InputForm input= new InputForm();
		input.initializeBrowser();
		input.showmessage();  
	}
 
}
