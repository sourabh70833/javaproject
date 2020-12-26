import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium {

public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver",
"C:\\Users\\shubh\\Documents\\ChromeDriver\\chromedriver.exe");
WebDriver a = new ChromeDriver();
a.get("https://www.verizon.com/");
a.findElement(By.id("gnav20-sign-id")).click();
a.findElement(By.id("IDToken1")).sendKeys("sourabh");
a.findElement(By.id("IDToken2")).sendKeys("sourabh");
a.findElement(By.id("login-submit")).click();
}
}

