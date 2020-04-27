package com.syntax.class25;

interface Webdriver{
	void open();
	void close();
	
	String getTitle();
}
interface TakeScreenShot{
	void getScreenShot();
}
interface RemoteWebDriver extends Webdriver,TakeScreenShot{
	void navigate();
	
}
class Chromedriver implements RemoteWebDriver{

	@Override
	public String getTitle() {
		String getTitle = "Chrome";
		return getTitle;
	}

	@Override
	public void open() {
		System.out.println("We can open browser in "+this.getTitle());
		
	}

	@Override
	public void close() {
		System.out.println("We can close browser in "+this.getTitle());
		
	}

	@Override
	public void getScreenShot() {
		System.out.println(this.getTitle()+" can take screenshots");
		
	}

	@Override
	public void navigate() {
		System.out.println(this.getTitle()+ " can navigate");
		
	}
	
}
class Firefoxdriver implements RemoteWebDriver {
	
	@Override
	public String getTitle() {
		String getTitle = "Firefox";
		return getTitle;
	}
	@Override
	public void open() {
		System.out.println(this.getTitle()+" driver opens");
		
	}

	@Override
	public void close() {
		System.out.println(this.getTitle()+" driver has closed");
		
	}

	

	@Override
	public void getScreenShot() {
		System.out.println(this.getTitle()+" takes screenshots");
		
	}

	@Override
	public void navigate() {
		System.out.println("Navigating to the main page");
		
	}
	
}
class SafariDriver implements RemoteWebDriver {


	@Override
	public String getTitle() {
		String getTitle= "Safari";
		return getTitle;
	}

	@Override
	public void open() {
		System.out.println(this.getTitle()+" opens");
		
	}

	@Override
	public void close() {
		System.out.println(this.getTitle()+" has closed");
		
	}

	@Override
	public void getScreenShot() {
		System.out.println(this.getTitle()+" can take screenshots");
		
	}

	@Override
	public void navigate() {
		System.out.println(this.getTitle()+" is navigating to the main page");
		
	}
	
}
public class Task4 {

	public static void main(String[] args) {
		
	RemoteWebDriver [] browserArray = {new Chromedriver(), new Firefoxdriver(), new SafariDriver()};
	
	for (RemoteWebDriver browser :browserArray ) {
		browser.getScreenShot();
		
		browser.navigate();
		browser.open();
		browser.close();
		browser.getScreenShot();
		
		System.out.println("___________________________");
	}
	
	}
}