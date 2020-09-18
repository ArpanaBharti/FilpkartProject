package iPhone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchIphone {
	public static void main(String[] args) throws InterruptedException{
       
		//Launching the Chrome Browser 
		WebDriver driver=new ChromeDriver();
		
		//open the flipkart site
		driver.get("https://www.flipkart.com/");
		
		//maximizing the window size
		driver.manage().window().maximize();
		
		//Provide implicit wait to hold the script until all the WebElements get appear
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		//Provide Username in the text box
        driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("8618135858");
        //Provide password in the text box
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Arpana");
        //Perform click action on the Login button
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		//Enter text in the search bar and perform click action
		driver.findElement(By.name("q")).sendKeys("iPhone6s",Keys.ENTER);
	
		//To handle the scrolling use JavascriptExecutor
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,3000)");
		
		
		String x= "//div[text()='Apple iPhone 6s (Gold, 16 GB)']/../..";
		//Store the details in a variable after capturing 
		String Detail = driver.findElement(By.xpath(x)).getText();
		//Print the details in the console
		System.out.println("iPhone with max price,device model and customer ratings :"+Detail);
		
		//Capture the storage capacity of device
		String stCapacity=driver.findElement(By.xpath("(//li[text()='16 GB ROM'])[4]")).getText();
		//Print the storage capacity in the console
		System.out.println("Storage capacity is:"+stCapacity);
		
		/*String DeviceModel = driver
				.findElement(By.xpath("//div[text()='Apple iPhone 6s (Gold, 16 GB)']")).getText();
					System.out.println("Device Model is:"+DeviceModel);*/
		
	
	}
}
