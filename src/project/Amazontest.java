package project;

import java.awt.Window;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.misc.EqualityComparator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazontest 
{
	public static void main(String[] agrs) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\\\user\\Desktop\\selenium\\chromedriver.exe");
		System.out.println("open browser");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		System.out.println("open amazon website");
		driver.get("https://www.amazon.in/");
		
		
		System.out.println("verify url");
		String Expectedurl = "https://www.amazon.in/";
		String actulurl = driver.getCurrentUrl();
		
		if(actulurl.endsWith(Expectedurl))
		{
			System.out.println("url is verified");
		}
		else
		{
			System.out.println("url is not same");
		}
		
		
		System.out.println("Search mobile on search bar");
		WebElement writesearch = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		writesearch.sendKeys("mobile");
		
		System.out.println("click on search button");
		WebElement clicksearch =  driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		clicksearch.click();
		
		
		System.out.println();
		
		System.out.println("click on feature");
		WebElement featurebutton = driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']"));
		featurebutton.click();
		
		
		System.out.println("click on low to high");
		WebElement lowtohigh =driver.findElement(By.xpath("//a[text()='Price: Low to High']"));
		lowtohigh.click();
		
		
		System.out.println("click on product");
		WebElement clickonproduct = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[4]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span"));
		clickonproduct.click();
		
		
		System.out.println("Switch to new window");
		List<String> win  = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(win.get(1));
		
		System.out.println("click on ad to cart");
		WebElement addtocart = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		addtocart.click();
		
		System.out.println("click on go to cart button");
		WebElement gotocart = driver.findElement(By.xpath("//a[@class='a-button-text']"));
		gotocart.click();
		
		
		System.out.println("click on proceed to buy button");
		WebElement proceedbutton = driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']"));
		proceedbutton.click();
		
		System.out.println("enter email id");
		WebElement email = driver.findElement(By.xpath("//input[@id='ap_email']"));
		email.sendKeys("8806822863");
		
		System.out.println("click on continue");
		WebElement continuebutton = driver.findElement(By.xpath("//input[@id='continue']"));
		continuebutton.click();
		
		
		System.out.println("enter password");
		WebElement password = driver.findElement(By.xpath("//input[@id='ap_password']"));
		password.sendKeys("Pass@123");
		
		
		System.out.println("click on sign in");
		WebElement signinbutton = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		signinbutton.click();
		
		Thread.sleep(5000);
//		System.out.println("enter mobile no");
//		WebElement mobino = driver.findElement(By.xpath("//input[@class='a-button-input']"));
//		mobino.click();
//		
		System.out.println("click on delivery address");
		WebElement selectaddress = driver.findElement(By.xpath("//a[@data-action='page-spinner-show'][1]"));
		selectaddress.click(); 
		
//		System.out.println("click on submit button");
//		WebElement submitbutton = driver.findElement(By.xpath("//input[@type='submit']"));
//		submitbutton.click();
		
		System.out.println("select pay on delivery");
		WebElement clickpay = driver.findElement(By.xpath("(//div//label//input)[11]"));
		clickpay.click();
		
		System.out.println("click on continue button");
		WebElement clickcontinue = driver.findElement(By.xpath("(//span//span//input)[8]"));
		clickcontinue.click();
		
		System.out.println("click on place order");
		WebElement placeorder = driver.findElement(By.xpath("(//div//span//span//input)[5]"));
		placeorder.click();
		
		System.out.println("go to order");
		WebElement order = driver.findElement(By.xpath("//a[@id='nav-orders']"));
		order.click();
		
		System.out.println("cancel order");
		WebElement cancelorder = driver.findElement(By.xpath("//a[@id='Cancel-items_1']"));
		cancelorder.click();
		
		System.out.println("end of program");
	
//	1) initiate chrome driver 
//	2) send google url ( Amazon)
//	3) verify URL 
//	4) click on search box
//	5) search something in search box using send key 
//	6) login Amazon
//	7) search the product
//	8) sort product high to low price
//	9) add to card 10 products
//	10) add product using get text
//	11) order place
//	12) cancel
	}
}
