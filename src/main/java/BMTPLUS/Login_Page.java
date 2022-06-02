package BMTPLUS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_Page {
	
public WebDriver driver;
	
	By username = By.xpath("//*[@id='edit-name']");
	By pass = By.id("edit-pass");
	By signin = By.xpath("//*[@type='submit']");
	By new_patient = By.xpath("//*[@id='block-system-main']/div/div[1]/div/div/div/a");
  //By new_patient = By.xpath("/html/body/div[2]/div/div[4]/div/div/div/div/div/section/div/div/div/div/div/div/div[1]/div/div/div/a");
	
	public Login_Page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}

	public WebElement getLogin()
	{
		return driver.findElement(username);
	}
	public WebElement getpassword()
	{
		return driver.findElement(pass);
	}
	public WebElement sign_in()
	{
		return driver.findElement(signin);
	}
	public WebElement newpatient()
	{
		return driver.findElement(new_patient);
	}

}
