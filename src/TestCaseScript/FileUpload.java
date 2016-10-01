package TestCaseScript;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FileUpload {
	public static WebDriver d;

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver d=new FirefoxDriver();
		
		d.get("http://www.pdfonline.com/pdf-to-word-converter/");
		d.manage().window().wait();
		d.manage().window().maximize();
		Thread.sleep(5000);
		WebElement element=d.findElement(By.xpath("//iframe[@id='easyXDM_default2085_provider']"));
		d.switchTo().frame(element);
		d.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		d.findElement(By.xpath("html/body/div[1]/form/input")).click();
		Runtime.getRuntime().exec("C:\\Users\\Dustu\\Desktop\\AutoIT\\FileUpload.exe");
		
		
		
		

	}

}
