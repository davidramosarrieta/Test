package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class FirstTestCase {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\sala3\\workspace\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sala3\\workspace\\chromedriver.exe");
		System.setProperty("webdriver.firefox.bin","C:\\Users\\sala3\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
		System.setProperty("webdriver.ie.driver","C:\\Users\\sala3\\workspace\\IEDriverServer.exe");

		WebDriver firefoxDriver = new FirefoxDriver();
		firefoxDriver.get("http://www.store.demoqa.com");
		firefoxDriver.quit();
		Thread.sleep(1000);
		
		WebDriver chromeDriver = new ChromeDriver();
		chromeDriver.get("http://www.store.demoqa.com");
		chromeDriver.quit();
		Thread.sleep(1000);
		
		InternetExplorerDriver ieDriver = new InternetExplorerDriver();
		ieDriver.get("http://www.store.demoqa.com");
		ieDriver.quit();
		
        System.out.println("Successfully opened the website www.Store.Demoqa.com");
		Thread.sleep(1000);
		
        System.out.print("ok");
	}
}