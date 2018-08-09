package Moudle;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {
//	WebDriver driver = new FirefoxDriver();
	WebDriver ChromeDriver = new ChromeDriver();
	String host;
	String password;
//	public int StartFirefox() throws Exception {
//		driver.get("http://192.168.99.1");
//		Thread.sleep(3000);
//		driver.findElement(By.name("password")).isDisplayed();
//		return 0;
//	}
	
	public int StartChrome(){
		try {
			ReadFile read = new ReadFile();
			Properties pro = read.readConfigFile();
			host = pro.getProperty("ip");
			password = pro.getProperty("password");
			ChromeDriver.get(host);
			Thread.sleep(3000);
			ChromeDriver.findElement(By.name("password")).isDisplayed();
			System.out.println("checkElement!!!");
			return 0;
		}catch(Exception e) {
			e.printStackTrace();
			return 1;
		}
	}
	
	public int CloseChrome() {
		ChromeDriver.quit();
		System.out.println("Close client!!!");
		return 0;
	}
	
	public int LoginSystem() {
		try {
			ChromeDriver.findElement(By.name("password")).sendKeys(password);
			Thread.sleep(1000);
			ChromeDriver.findElement(By.xpath("//*[@id=\"sysauth\"]/div/div/div[1]/div[2]/div")).click();
			Thread.sleep(3000);
			ChromeDriver.findElement(By.xpath("//*[@id=\"mainmenu\"]/ul/li[1]/a")).isDisplayed();
			System.out.println("Enter HomePage Success!!!");
			Thread.sleep(1000);
			return 0;
		}catch(Exception e) {
			e.printStackTrace();
			return 1;
		}
	}
	
//	public int CloseFirefox() {
//		driver.quit();
//		return 0;
//	}
	
//	public static void main(String args[]) {
//		StartBrowser s = new StartBrowser();
//		try {
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
	
}
