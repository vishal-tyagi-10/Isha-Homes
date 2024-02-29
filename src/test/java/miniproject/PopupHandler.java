package miniproject;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PopupHandler {
	 public static void closePopup(WebDriver driver) {
	        WebDriverWait popup = new WebDriverWait(driver, Duration.ofSeconds(5));
	        try {
	     WebElement pop= popup.until(ExpectedConditions.presenceOfElementLocated(By.className("elementor-widget-container")));
	      
	        if(pop!=null) {
	        WebElement close_button = driver.findElement(By.className("eicon-close"));
	        close_button.click();
	    }
}
	 catch(Exception e) {
		 //do nothing
	 }
}
	 }
