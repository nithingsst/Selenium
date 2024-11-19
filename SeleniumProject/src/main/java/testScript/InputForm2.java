package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class InputForm2 extends Base {
	
	public void twoInputFields() {
		
		WebElement inputform=driver.findElement(By.xpath("//a[@href=\'simple-form-demo.php\']"));
		inputform.click();
		WebElement field1=driver.findElement(By.xpath("//input[@id=\'value-a\']"));
		field1.sendKeys("52");
		WebElement field2=driver.findElement(By.xpath("//input[@id=\'value-b\']"));
		field2.sendKeys("64");
		WebElement gettotalbutton=driver.findElement(By.xpath("//button[@id=\'button-two\']"));
		gettotalbutton.click();
	}

	public static void main(String[] args) {
		
		InputForm2 inputForm2=new InputForm2();
		inputForm2.initializeBrowser();
		inputForm2.twoInputFields();

	}

}
