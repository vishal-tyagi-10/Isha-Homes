package miniproject;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LiveChatHandler {

	 public static void minimizeLiveChat(WebDriver driver) {
	        WebDriverWait live_chat = new WebDriverWait(driver, Duration.ofSeconds(7));
	        
	        try {
	      WebElement live=  live_chat.until(ExpectedConditions.presenceOfElementLocated(By.id("livchat_close")));
	      if(live!=null) {
	        WebElement minimize_button = driver.findElement(By.id("livchat_close"));
	        minimize_button.click();
	    }
	        }
	       catch(Exception e) {
	    	//do nothing
	       }
	          

}
}