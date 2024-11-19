package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragDrop extends Base {
	
	public void drag() {


	driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
	WebElement dragone=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
	WebElement drop=driver.findElement(By.id("mydropzone"));
	
	Actions actions=new Actions(driver);
	actions.moveToElement(dragone).click();
	actions.doubleClick(dragone).perform();
	actions.dragAndDrop(dragone, drop).build().perform();
	
	WebElement dragtwo=driver.findElement(By.xpath("//span[text()='Draggable n°2']"));
	actions.moveToElement(dragtwo).click();
	actions.doubleClick(dragtwo).perform();
	actions.dragAndDrop(dragtwo, drop).build().perform();
	
	WebElement dragthree=driver.findElement(By.xpath("//span[text()='Draggable n°3']"));
	actions.moveToElement(dragthree).click();
	actions.doubleClick(dragthree).perform();
	actions.dragAndDrop(dragthree, drop).build().perform();
	
	
	WebElement dragfour=driver.findElement(By.xpath("//span[text()='Draggable n°4']"));
	actions.moveToElement(dragfour).click();
	actions.doubleClick(dragfour).perform();
	actions.dragAndDrop(dragfour, drop).build().perform();
	

}

public static void main(String[] args) {
	// TODO Auto-generated method stub
 DragDrop drop=new DragDrop();
 drop.initializeBrowser();
 drop.drag();
}
}
