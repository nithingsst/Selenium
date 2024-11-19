package testScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MultipleCheckBox extends Base{
			
			public void multiplecheckbox()
			{
			
				driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
				List<WebElement> mulcheck=driver.findElements(By.xpath("//input[@class='check-box-list']"));
				for(WebElement check:mulcheck)
				{
					check.click();
				}
			}
			
			

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				MultipleCheckBox multicheck=new MultipleCheckBox();
				multicheck.initializeBrowser();
				multicheck.multiplecheckbox();
				

			}

		}