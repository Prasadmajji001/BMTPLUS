package BMTPLUS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Patient_creation {

	public WebDriver driver;

	By diease_dp = By.xpath("//*[@id='edit_field_patient_disease_und_chosen']/a/span");
	By diease_selected = By.xpath("//*[@id=\"edit_field_patient_disease_und_chosen\"]/div/ul/li[4]");
	
	By status = By.id("edit-field-patient-status-description-und");
	By consanguinity = By.id("edit-field-patient-consanguinity-und");
	By Basic = By.xpath("//*[@id=\"patient-node-form\"]/div/div[1]/div/ul/li[2]/a/strong");
	By name = By.id("edit-field-patient-name-und-0-value");
	By date = By.id("edit-field-patient-date-of-birth-und-0-value-datepicker-popup-0");
	By DOBM = By.cssSelector("*[data-handler='selectMonth']");
	By DOBY = By.cssSelector("*[data-handler='selectYear']");
	By DOBD = By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[5]/a");
	By current_date = By.id("edit-field-patient-registration-date-und-0-value-datepicker-popup-0");
	By CU_M = By.cssSelector("*[data-handler='selectMonth']");
	By CU_Y = By.cssSelector("*[data-handler='selectYear']");
	By Gender = By.xpath("//*[@value='Male']");
	By center = By.xpath("//*[@id=\"edit_og_group_ref_und_chosen\"]/ul");
	By org = By.xpath("//*[@id=\"edit_og_group_ref_und_chosen\"]/div/ul/li[69]");
	By Submit = By.id("edit-submit");

	public Patient_creation(WebDriver driver) {
		// TODO Auto-generated constructor stub

		this.driver = driver;
	}

	public WebElement Select_diease() {
		return driver.findElement(diease_dp);
	}

	public WebElement diease() {
		return driver.findElement(diease_selected);
	}

	public WebElement status_op() {
		Select drop1 = new Select(driver.findElement(status));
		drop1.selectByValue("938");
		return null;
	}

	public WebElement consanguinity_se() {
		Select drop2 = new Select(driver.findElement(consanguinity));
		drop2.selectByValue("Missing Data");
		return null;
	}

	public WebElement Basic_details() {
		return driver.findElement(Basic);
	}

	public WebElement patient_name() {
		return driver.findElement(name);
	}

	public WebElement Date_pick() {
		return driver.findElement(date);
	}

	public WebElement Patient_DOBM() {
		Select drop3 = new Select(driver.findElement(DOBM));
		drop3.selectByVisibleText("Aug");
		return null;
	}

	public WebElement Patient_DOBY() {
		Select drop4 = new Select(driver.findElement(DOBY));
		drop4.selectByVisibleText("1992");
		return null;
	}

	public WebElement Patient_DOBD() {
		return driver.findElement(DOBD);
	}

	public WebElement Current_date() {
		return driver.findElement(current_date);
	}

	public WebElement current_m() {
		Select drop5 = new Select(driver.findElement(CU_M));
		drop5.selectByVisibleText("May");
		return null;
	}

	public WebElement current_y() {
		Select drop6 = new Select(driver.findElement(CU_Y));
		drop6.selectByVisibleText("2022");
		return null;
	}

	public WebElement Gender_p() {
		return driver.findElement(Gender);
	}

	public WebElement Center() {
		return driver.findElement(center);
	}

	public WebElement Organisation() {
		return driver.findElement(org);
	}

	public WebElement Save() {
		return driver.findElement(Submit);
	}

}
