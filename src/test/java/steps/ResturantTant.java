	package steps;
	
	import static org.testng.Assert.fail;

import java.lang.StackWalker.Option;
import java.util.Calendar;
import java.util.List;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.manager.SeleniumManager;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.rafal.laskowski.wait.ExpectedCondition;
	
	public class ResturantTant<dummy, WebDriverwait, button, IWebDriver> {

	protected WebDriver Wait = null;
		protected ChromeDriver driver;
		
		
		

		
		@Given("I am accessing the site as a guest and select the {string} option on the {string} page")
		public void i_am_accessing_the_site_as_a_guest_and_select_the_option_on_the_page(String string, String string2) {
			    driver = new ChromeDriver();
			    driver.get("https://order.chick-fil-astage.com/get-started");
			    WebDriverWait Wait = new  WebDriverWait(driver,null);
				Option wait =WebDriverWait(driver,10);
				Options manage = ((RemoteWebDriver) driver).manage();
				manage.timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				manage.window().maximize();
			 
			}
		
			private Option WebDriverWait(RemoteWebDriver driver2, int i) {
				// TODO Auto-generated method stub
				return null;
			}
		
			@Given("I accept all cookies catering pickup page")
		public void i_accept_all_cookies_catering_pickup_page() throws InterruptedException {
			
			Options manage = ((RemoteWebDriver) driver).manage();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.findElement(By.xpath("//*[text()='Accept All Cookies']")).click();
			    
			
			}
		
			@Given("I select {string} option on the Catering page")
			public void i_select_option_on_the_catering_page(String string) throws InterruptedException{
		        driver.findElement(By.xpath("//button[@data-cy='Catering']")).click();   	
				Thread.sleep(5000);
				driver.findElement(By.xpath("//button[@data-cy='Catering Pickup']")).click();   	
			    Thread.sleep(5000);
			  
			}
		
			@Given("I select location {string}")
			public void i_select_location(String string) throws InterruptedException {
				driver.findElement(By.xpath("//*[@data-cy='LocationSearch']")).sendKeys("@03351");
				Thread.sleep(5000);
				driver.findElement(By.xpath("//*[@data-cy='FindRestaurants']")).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("//*[@data-cy='SelectThisRestaurant']")).click();
				
			}
		
			@Given("I select a date")
			public void i_select_a_date() throws InterruptedException {
				Thread.sleep(5000);  
				Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
			        int todayInt = calendar.get(Calendar.DAY_OF_MONTH);
		
				driver.findElement(By.xpath("//*[@data-cy='DatePickerWrapper']")).click();
				driver.findElement(By.xpath("//*[text()='"+todayInt+"']")).click();
				
			}
		
			@Given("I select a time")
			public void i_select_a_time() throws InterruptedException {
			    Thread.sleep(7000);
				//driver.findElement(By.xpath("//*[@data-cy='TimeSelectionDropdown']")).click();
				Select sel = new Select(driver.findElement(By.xpath("//*[@data-cy='TimeSelectionDropdown']")));
				sel.selectByIndex(1);
			    Thread.sleep(5000);
			    driver.findElement(By.xpath("//*[@data-cy='Continue']")).click();
			    
			}
		
			@Given("I add a {string} from the {string} category to my order and view my order")
			public <RenderedWebElement, bool> void i_add_a_from_the_category_to_my_order_and_view_my_order(String string, String string2) throws InterruptedException {
				// click on trays
				Thread.sleep(80000);
				
				driver.findElement(By.xpath("//*[@data-cy='OLO_TRAYS']")).click();
				// click on nugget trays
			    driver.findElement(By.xpath("//*[@data-cy='NUGGET_TRAYS']")).click();
			    Thread.sleep(15000);
			// click on add to order
			    driver.findElement(By.xpath("//*[@data-cy='AddToOrder']")).click();
			    Thread.sleep(15000);
			// click on skip sauces
			    driver.findElement(By.xpath("//*[@data-cy='PrimaryConfirmButton']")).click();
			   
					    }
			
			@Given("I select guest checkout for catering")
			public void i_select_guest_checkout_for_catering() throws InterruptedException {
			   // click on cart
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driver.findElement(By.xpath("//*[@data-cy='badge']")).click();
			   
			   // click on checkout button
			    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driver.findElement(By.xpath("//*[@data-cy='CheckOut']")).click();
			    
			 	}
		
			@Given("I checkout as a Catering guest with a mastercard")
			public void i_checkout_as_a_catering_guest_with_a_mastercard() throws InterruptedException {
				 // click on guest checkout
				 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
				driver.findElement(By.xpath("//*[@data-cy='GuestCheckout']")).click();
				 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);	
			    	// enter first Guest name
				 driver.findElement(By.xpath("//*[@data-cy='FirstNameInput']")).sendKeys("PWO");
				 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);	
			         // enter last guest name
				 driver.findElement(By.xpath("//*[@data-cy='LastNameInput']")).sendKeys("TestUser");		
				 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			        // enter phone No
				 driver.findElement(By.xpath("//*[@data-cy='PhoneInput']")).sendKeys("1234567890");
				 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
				 	 // generate randomly email
				     // emailTextBx.findElement(By.xpath("//*[@data-cy='EmailInput']")).click();  
				 	//Random randomGenerator = new Random();  
				 	//int randomInt = randomGenerator.nextInt(1000);  
				 	//emailTextBx.sendKeys("PWOtestUser"+ randomInt +"@gmail.com");   
	                
				 	 // enter email
			  	 driver.findElement(By.xpath("//*[@data-cy='EmailInput']")).sendKeys("Pwo-us-ffdd00ee@mailinator.com");
			  	 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			        // enter confirm email
	             driver.findElement(By.xpath("//*[@data-cy='ConfirmEmailInput']")).sendKeys("Pwo-us-ffdd00ee@mailinator.com");
	             driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			       // click on check box
			     driver.findElement(By.xpath("//*[@data-cy='Agree']")).click();
		           // click on continue button
		         driver.findElement(By.xpath("//*[@data-cy='Continue']")).click();
				 // Click on proceed payment button
					driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS); 
					driver.findElement(By.xpath("//*[@data-cy='ProceedToPayment']")).click();
				
					
				driver.get("https://order.chick-fil-astage.com/order/payment");
					//By finding all the web elements using iframe tag
					List<WebElement> iframeElements = driver.findElements(By.tagName("iframeResult"));
					System.out.println("Total number of iframes are " + iframeElements.size());

					//By executing a java script
					JavascriptExecutor exe = (JavascriptExecutor) driver;
					Integer noOfFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
					System.out.println("No. of iframes on the page are " +noOfFrames); 
						// click on payment Method button
					 driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
				     driver.findElement(By.xpath("//*[@data-cy='AddPayment']")).click();
				    Thread.sleep(7000);
				    driver.switchTo().frame("targetFrame");
				    // Enter Card Name In iframe 
				    driver.findElement(By.xpath("//*[@id='ccName']")).sendKeys("Mastercard");
                   
				    // Enter card number
				    driver.findElement(By.xpath("//*[@id='ccNum']")).sendKeys("5204240250197865");
			      
				    // enter expiry date
				    driver.findElement(By.xpath("//*[@id='expiry']")).sendKeys("10/25");
			 
				    // enter cvv number
		         	driver.findElement(By.xpath("//*[@id='cvv']")).sendKeys("444");
			   
		         	// enter zip code
		         	driver.findElement(By.xpath("//*[@id='zip']")).sendKeys("00000");
			// click on done button
		         	driver.findElement(By.xpath("//*[text()='Done']")).click();
			}
		
			//@When("the order is bumped")
			//public void the_order_is_bumped() throws InterruptedException {
			
			
			//}
			
	
		@Then("The order is complete")
		public void the_order_is_complete() throws InterruptedException {
			// back to main frame
			Thread.sleep(5000);			
			driver.switchTo().defaultContent();
			driver.findElement(By.xpath("//*[text()='Complete my order']")).click();
		}
	
	
	
		
	}
