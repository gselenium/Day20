package Pack1;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Functions.XLS_Reader;

public class GmailLoginXLFile {
	public static void main(String[] args) {
		XLS_Reader xls=new XLS_Reader("D:/Online_Batches/VineelaSelenium/Workspace/Day20/src/XlFiles/testdata.xlsx");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://gmail.com");
		String uname=xls.getCellData("mydata", "Username", 3);
		driver.findElement(By.id("Email")).sendKeys(uname);
		driver.findElement(By.id("next")).click();
		String pass=xls.getCellData("mydata", "Password", 3);
		driver.findElement(By.id("Passwd")).sendKeys(pass);
		driver.findElement(By.id("signIn")).click();
	}

}
