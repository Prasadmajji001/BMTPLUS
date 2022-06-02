package PatientManagement;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BMTPLUS.Base;
import BMTPLUS.Login_Page;
import BMTPLUS.Patient_creation;

public class User_login_Patient_creation extends Base{
	
	@Test(dataProvider = "getData")
	public void login_patient(String Username, String Password) throws IOException, InterruptedException {		
		driver = InitialiseDriver();
		driver.manage().window().maximize();
		driver.get("https://dev.bmtplus.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Login_Page l = new Login_Page(driver);
		l.getLogin().sendKeys(Username);
		l.getpassword().sendKeys(Password);
		l.sign_in().click();
		l.newpatient().click();
		String mainwindow = driver.getWindowHandle();
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();

		while (i1.hasNext()) {
			String ChildWindow = i1.next();
			if (!mainwindow.equalsIgnoreCase(ChildWindow)) {
				driver.switchTo().window(ChildWindow);
				Patient_creation np = new Patient_creation(driver);
				np.Select_diease().click();
				np.diease().click(); 
				np.status_op();
				np.consanguinity_se();
				np.Basic_details().click();
				np.patient_name().sendKeys("Manoj tiwari");
				np.Date_pick().click();
				np.Patient_DOBM();
				np.Patient_DOBY();
				np.Patient_DOBD().click();
				np.Current_date().click();
				np.current_m();
				np.current_y();
				np.Gender_p().click();
				np.Center().click();
				np.Organisation().click();
				np.Save().click();
			}
		}
	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[1][2];
		data[0][0] = "Durgaprasad";
		data[0][1] = "durgaprasad123#";

		return data;
	}

}
