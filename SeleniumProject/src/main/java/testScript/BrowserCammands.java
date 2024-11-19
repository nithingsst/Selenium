package testScript;

public class BrowserCammands extends Base{
	
	public void browsercammands() {
		
		String title = driver.getTitle();
		System.out.println(title);
		String url =driver.getCurrentUrl();
		System.out.println(url);
		String pagesource=driver.getPageSource();
		System.out.println(pagesource);
		
		}

	public static void main(String[] args) {
		
		BrowserCammands command = new BrowserCammands();
		command.initializeBrowser();
		command.browsercammands();
		
	}

}
