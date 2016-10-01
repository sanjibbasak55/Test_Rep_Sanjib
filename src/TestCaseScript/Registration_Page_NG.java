package TestCaseScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import Constant_Variables.ExcelUtils;
import Constant_Variables.Utility_Variable;
import PageObjectModel.*;
import RepetativeFunctionality.*;

public class Registration_Page_NG {
public	WebDriver d;
public static boolean isFailed = false;
	
  @Test
  public void test() throws Exception {
	  
	  
	 
	 ExcelUtils.setExcelFile(Utility_Variable.Path_TestData +"//"+Utility_Variable.File_TestData,"Sheet1");
	 landing_page.clcik_Candidate_link(d).click();
	 System.out.println("a");
	 Thread.sleep(20000);
	 Assert.assertEquals("Shortlist", d.getTitle(), "Strings are not matching");
//	 Assert.assertEquals(actual, expected, message);
//	 Assert.assertEquals(actual, expected);
	 login_page.Create_Account(d).click();
	 Thread.sleep(20000);
	 
	 WebElement element = d.findElement(By.xpath(".//*[@id='login']/div/div/div/h1"));
	 String strng = element.getText();
	 Assert.assertEquals("Welcome to the Shortlist family! Please create an account to get started.", strng);
	 
	 
	 
	 
	 String sUserName = ExcelUtils.getCellData(1, 1);
	 String sPassword = ExcelUtils.getCellData(1, 2);
	 String scnfrmPassword = ExcelUtils.getCellData(1, 3);
	 
	 Registration_Page.email_id_reg_page(d).sendKeys(sUserName);
	 Registration_Page.password_reg_page(d).sendKeys(sPassword);
	 Registration_Page.confirm_password_reg_page(d).sendKeys(scnfrmPassword);
	 //Registration_Page.create_account_button(d).click();
	  
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  d = new FirefoxDriver();
	  d.manage().window().maximize();
	  d.get(Utility_Variable.URL);
	  
  }

  @AfterMethod
  public void afterMethod() throws Exception {
	  System.out.println("Pod");
	  ExcelUtils.setCellData("FAIL", 5, 5);
	  Take_Screen_Shot.Screen_Shot("Create_Account", d);
	  //d.close();
  }


}
