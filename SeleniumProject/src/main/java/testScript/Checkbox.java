package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Checkbox extends Base {
	
	public void checkbox1() {
		
		WebElement inputform=driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));
		inputform.click();
		WebElement checkboxdemo=driver.findElement(By.xpath("//a[@href='check-box-demo.php']"));
		checkboxdemo.click();
		WebElement checkboxdemo1=driver.findElement(By.xpath("//input[@id='gridCheck']"));
		checkboxdemo1.click();

		//input[@class='gridCheck']
		
	}

	public static void main(String[] args) {
		
		Checkbox check = new Checkbox();
		check.initializeBrowser();
		check.checkbox1();
		//input[@class='gridCheck']

	}

}
