package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base {
	
	public void idLocator() {
		
		//Syntax >    WebElement Elementname =driver.findElement(By.Locatorname("value"));
		WebElement message =driver.findElement(By.id("single-input-field"));
		WebElement bootstrapaler =driver.findElement(By.id("autoclosable-btn-sucess"));
		WebElement jquerydatepicker =driver.findElement(By.id("from"));
		WebElement jqueryuiprogress =driver.findElement(By.id("downloadButton"));
		WebElement dynamicdataloading =driver.findElement(By.id("save"));
		WebElement EnterValue = driver.findElement(By.id("value-a"));
		WebElement EnterValue1 = driver.findElement(By.id("value-b"));
		WebElement GetTotal = driver.findElement(By.id("button-two"));	
	}
	
	public void classLocator() {
		
		WebElement section =driver.findElement(By.className("clearfix"));

	}
	
	public void nameLocator() {
		
		WebElement name = driver.findElement(By.name("Viewport"));	

	}
	
	public void linktextLocator() {
		
		WebElement linktext = driver.findElement(By.linkText("Simple form demo php"));	

	}
	
	public void partiallinktextLocator() {
		
		WebElement partial = driver.findElement(By.partialLinkText("Simple form"));
	
}
	public void cssTagandIdLocator() {
		;
		WebElement inputId = driver.findElement(By.cssSelector("Input#single-input-field"));

}
	public void cssTagandAttribute() {
		
		WebElement tagAttribute = driver.findElement(By.cssSelector("Input[id=single-input-field"));
	
}
	
	public void cssTagandclassLocator() {
		
		WebElement tagclass = driver.findElement(By.cssSelector("ul.navbar-nav"));

}
	public void cssTagClassAttributeLocator() {
		
		WebElement tagClassAttribute = driver.findElement(By.cssSelector("input.form control[id=single input field]"));

}
	 
    public void xpath() {
    	
  	  //absolute xpath
    	
  	  WebElement xpath=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[1]/input"));
  	  WebElement xpath1=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[1]/input"));
  	 
  	  //relative xpath syntax://tagname[@attributetype='attributevalue']
  	  
  	  WebElement relativexpath=driver.findElement(By.xpath("//input[@id='single-input-field']"));
  	  WebElement relativexpath1=driver.findElement(By.xpath("//input[@id='single-input-field']"));
  	  
  	  //dynamic xpath contains method syntax://tagname[contains(@attributetype,'value')]
  	  
  	  WebElement dynamicxpath=driver.findElement(By.xpath("//input[contains(@id,'value-a')]")); 
  	  WebElement dynamicxpath1=driver.findElement(By.xpath("//select[contains(@id,'single-input-field')]"));
  	  WebElement dynamicxpath2=driver.findElement(By.xpath("//input[contains(@class,'form-control')]")); 
  	
  	  
  	  //dynamic xpath text method syntax://tagname[text()='value']
  	  
  	  WebElement textxpath=driver.findElement(By.xpath("//button[text()='Show Message']"));
  	  WebElement textxpath1=driver.findElement(By.xpath("//button[text()='Show Message']"));
  	  
  	//axes method xpath syntax://tagname[@attributetype='attributevalue']:://parent.div
  	    	  
  	
  	  WebElement FormGroup=driver.findElement(By.xpath("//input[@class='form-control']//parent::div"));
  	
  	  //axes method xpath syntax://tagname[@attributetype='attributevalue']://child.div
  	  
  	  WebElement Formchild=driver.findElement(By.xpath("a[@href='index.php']//child::img[@alt='logo'"));
  	  
  	
    }

	
	//tagname[@attributetype='attributevalue']
	//tagname[contains(@attributetype,'value')]  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
