package Pack1;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLogin_Scanner {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://gmail.com");
		System.out.println("Please enter username: ");
		Scanner in=new Scanner(System.in);
		String uname=in.next();
		driver.findElement(By.id("Email")).sendKeys(uname);
		driver.findElement(By.id("next")).click();
		System.out.println("Please enter password: ");
		String pass=in.next();
		driver.findElement(By.id("Passwd")).sendKeys(pass);
		driver.findElement(By.id("signIn")).click();
	}

}
