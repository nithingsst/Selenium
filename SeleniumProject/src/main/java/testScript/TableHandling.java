package testScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableHandling extends Base{
	
	public void table()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement tablefields=driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		System.out.println(tablefields.getText());
		
	}
	
	public void tablerow()
	{
		
       driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
	   WebElement tablerowfields=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[2]"));
	   System.out.println(tablerowfields.getText());
					
	}
	
	public void selectdata()
	{
		
       driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
	   WebElement datafields=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[1]/td[1]"));
	   System.out.println(datafields.getText());
					
	}
	
	public void elementsearch()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		
		String input="Accountant";
		List<WebElement> dataelement=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[2]"));
			
		for(WebElement data:dataelement)
		{
			if(data.getText().equals(input))
			{
				System.out.println(data.getText());
			}
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TableHandling tablelist=new TableHandling();
		tablelist.initializeBrowser();
		tablelist.table();
		System.out.println("*");
		tablelist.tablerow();
		System.out.println("*");
		tablelist.selectdata();
		
		System.out.println("*");
		tablelist.elementsearch();
	}

}