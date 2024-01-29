package Pipetest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() throws InterruptedException
  {
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://www.youtube.com/");
	  Thread.sleep(5000);
  }
}
