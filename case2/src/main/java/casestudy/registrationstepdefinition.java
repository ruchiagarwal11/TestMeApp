package casestudy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class registrationstepdefinition {
	static WebDriver driver;	
	@Given("^Navigate to Home page$")
	public void navigateToHomePage() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\New folder\\New folder\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	}
	@When("^user click \"([^\"]*)\"$")
	public void userClick(String arg1) throws Throwable {
		driver.findElement(By.xpath("//a[@href='RegisterUser.htm']")).click();
	}
	
	
	@When("^user name as \"([^\"]*)\"$")
	public void userNameAs(String arg1) throws Throwable {
		driver.findElement(By.name("userName")).sendKeys(arg1);		
	}
	
	@When("^user fname as \"([^\"]*)\"$")
	public void userFnameAs(String arg1) throws Throwable {
		driver.findElement(By.name("firstName")).sendKeys(arg1);
	}
	
	@When("^user lname as \"([^\"]*)\"$")
	public void userLnameAs(String arg1) throws Throwable {
		driver.findElement(By.name("lastName")).sendKeys(arg1);
	}
	
	@When("^user password as \"([^\"]*)\"$")
	public void userPasswordAs(String arg1) throws Throwable {
		driver.findElement(By.name("password")).sendKeys(arg1);
		
	}
	@When("^user confirmpassword as \"([^\"]*)\"$")
	public void userConfirmpasswordAs(String arg1) throws Throwable {
		driver.findElement(By.name("confirmPassword")).sendKeys(arg1);
	}
	@When("^user gender as \"([^\"]*)\"$")
	public void userGenderAs(String arg1) throws Throwable {
		driver.findElement(By.name("gender")).sendKeys(arg1);
		if(arg1.equalsIgnoreCase("female"))
		{
			driver.findElement(By.xpath("//input[@value='Female']")).click();
		}
		else
		{
			driver.findElement(By.xpath("//input[@value='Male']")).click();
		}
		
		
	}
	@When("^user email as \"([^\"]*)\"$")
	public void userEmailAs(String arg1) throws Throwable {
		driver.findElement(By.name("emailAddress")).sendKeys(arg1);
	}
	@When("^user contactnumber as \"([^\"]*)\"$")
	public void userContactnumberAs(String arg1) throws Throwable {
		driver.findElement(By.name("mobileNumber")).sendKeys(arg1);
	}
	@When("^user dob as \"([^\"]*)\"$")
	public void userDobAs(String arg1) throws Throwable {
		driver.findElement(By.name("dob")).sendKeys(arg1);
		
	}
	@When("^user address as \"([^\"]*)\"$")
	public void userAddressAs(String arg1) throws Throwable {
		driver.findElement(By.name("address")).sendKeys(arg1);
		
	}
	@When("^user selects  security question \"([^\"]*)\"$")
	public void userSelectsSecurityQuestion(String arg1) throws Throwable {
		Select ques =new Select(driver.findElement(By.name("securityQuestion")));
		ques.selectByVisibleText(arg1);
		
	
	}
	
	@When("^user enter as \"([^\"]*)\"$")
	public void userEnterAs(String arg1) throws Throwable {
		driver.findElement(By.name("answer")).sendKeys(arg1);
		
	}
	@Then("^user Registred  sucessfully$")
	public void userRegistredSucessfully() throws Throwable {
		driver.findElement(By.name("Submit")).click();
	}
	@And("^verify user registred sucessfully$")
	public void verifyUserRegistredSucessfully() throws Throwable {
		String msg=driver.findElement(By.xpath("//fieldset/div[8]")).getText();
		Assert.assertEquals(msg.trim(), "User Registred Successfully!!!Plese Login");
		
	}
	@When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void userEntersAnd(String arg1, String arg2) throws Throwable {
		driver.findElement(By.name("userName")).sendKeys(arg1);
		driver.findElement(By.name("password")).sendKeys(arg1);
		
	}
	@Then("^user logged in sucessfully$")
	public void userLoggedInSucessfully() throws Throwable {
		
		driver.findElement(By.name("Login")).click();
		System.out.println("user login sucessfully");
	}

	@When("^Larry searches below products in the search box as Bags$")
	public void larrySearchesBelowProductsInTheSearchBoxAsBags(String arg1) throws Throwable {
		driver.findElement(By.name("products")).sendKeys(arg1);
		driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();
		driver.findElement(By.xpath("//a[@href='#']")).click();
	
	}
	@Then("^product should be added in the cart if available$")
	public void productShouldBeAddedInTheCartIfAvailable() throws Throwable {
		WebElement addProductsInCart = driver.findElement(By.xpath("//div[@class='shop-menu pull-right']/ul/a/b"));
		int numberofElements=Integer.parseInt (addProductsInCart.getText());
		Assert.assertEquals(addProductsInCart,numberofElements);
	}

	
	@When("^user open cart$")
	public void userOpenCart() throws Throwable {
		driver.findElement(By.xpath("//a[@href='displayCart.htm']")).click();
		
	}
	@When("^user checkout$")
	public void userCheckout() throws Throwable {
		driver.findElement(By.xpath("//a[@href='checkout.htm']")).click();
	}

	@When("^user fill the address as nbd,jj$")
	public void userFillTheAddressAsNbdJj(String arg1) throws Throwable {
		driver.findElement(By.name("ShippingAdd")).sendKeys(arg1);
			
	}
	
	@When("^user click  payment$")
	public void userClickPayment() throws Throwable {
		driver.findElement(By.xpath("//input[@value='Proceed to Pay']")).click();
		
	}
	@Then("^payment sucessfull$")
	public void paymentSucessfull() throws Throwable {
	//String msg=	driver
	}
	

}
