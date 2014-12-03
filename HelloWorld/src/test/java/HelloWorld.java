import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class HelloWorld {

	@Test
	public void main(){
		System.out.println("Main method of Hello World");
		WebDriver driver =  new FirefoxDriver();
		driver.get("https://drive.dasprivacy.com");
	}
}
