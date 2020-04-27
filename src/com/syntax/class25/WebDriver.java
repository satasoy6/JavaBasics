package com.syntax.class25;

interface TakesScreenShots{
	
	void TakePicture();
	//below is features added from Java 1.8 version
	static void TakeSelfie() {
		System.out.println("Take a selfie");//
	}
	default void takePanorama () {
		System.out.println("I can take panoramic pictures"); 
	}
	
}
public interface WebDriver {
	
	void openBrowser();
	void TakeSelfie();
	void closeBrowser();
	void maximizeWindow();
	void findElement();	

}
class ChromeDriver implements WebDriver,TakesScreenShots {

	@Override
	public void openBrowser() {
		System.out.println("Close Chrome Web Driver");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("Close Chrome Web Driver");
		
	}

	@Override
	public void maximizeWindow() {
		System.out.println("Maximize the window");
		
	}

	@Override
	public void findElement() {
		System.out.println("Find the element");
		
	}
 
	@Override
	public void TakePicture() {
		System.out.println("In Chrome we can take pictures");
		
	}

	@Override
	public void TakeSelfie() {
		// TODO Auto-generated method stub
		
	}
	
}
class FirefoxDriver implements WebDriver{

	@Override
	public void openBrowser() {
		System.out.println("Open FireFox Web Driver");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("Close FireFox Web Driver");
		
	}

	@Override
	public void maximizeWindow() {
		System.out.println("Maximize the window");
		
	}

	@Override
	public void findElement() {
		System.out.println("Find the element");
		
	}

	@Override
	public void TakeSelfie() {
		// TODO Auto-generated method stub
		
	}
	
}
