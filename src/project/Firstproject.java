package project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firstproject 
 
	{
		public static void main(String[] args) throws InterruptedException 
		{
			// chrome setup
//			System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\selenium\\chromedriver.exe");
			System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\selenium\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			// Firefox setupp
//			System.setProperty("webdriver.gecko.driver","C:\\Users\\user\\Desktop\\selenium\\geckodriver.exe");
//			
//			WebDriver driver = new FirefoxDriver();

			// microsoft edge setup
//			System.setProperty("webdriver.edge.driver","C:\\Users\\user\\Desktop\\selenium\\msedgedriver.exe");

//			WebDriver driver = new EdgeDriver();
			
			
			driver.navigate().to("https://www.flipkart.com");    // to open url
			driver = new ChromeDriver();
			driver.get("https://www.youtube.com");
			
			//			Thread.sleep(3000); // delay 3 sec
//			
//			driver.manage().window().maximize(); // to maximize browser
//			
//			driver.get("https://www.facebook.com");
//			Thread.sleep(2000); //delay 2 sec
//			driver.navigate().back();   // go back to the previous page
//			
//			driver.manage().window().minimize();     // to  minimize browser 
			
//			Thread.sleep(5000); //delay 5sec
//			driver.navigate().forward();   // to go forward page 
//			
//			Thread.sleep(5000);   //delay 5 sec
//			
//			String url = driver.getCurrentUrl();  // to get url on concole window
// 			System.out.println(url);
			

//			driver.close();     // to close tab
//			
//			Thread.sleep(10000);  //delay 10 sec
//			
//			
		//	driver.quit();   // to close browser

}
}