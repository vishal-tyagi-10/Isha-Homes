package miniproject;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class VerifyContactInfo {
	 public static void Contactinfodisplay(WebDriver driver) throws IOException, InterruptedException {
		 
		 String exp_text = "Contact Info";
		
		 //Enquiry now button
		 driver.findElement(By.xpath("/html/body/div[7]/div[2]/a")).click();
		 multiple_Screenshot.screenshot(driver,"enquiry_button.png");
		 
		 //all options after clicking
		 List <WebElement> elem=driver.findElements(By.xpath("//*[@id='elementor-popup-modal-32248']/div/div[2]/div/section[2]/div/div/div/section/div/div/div/div/div/ul/li"));
		 for(WebElement e:elem)
		 {
			 if(exp_text.equalsIgnoreCase(e.getText())){
				 System.out.println("Contact Info is displayed");
				 break;
			 }
			 
		 }
			 System.out.println("Contact Info is not displayed");
		
			 //click on other Enquiry
			 driver.findElement(By.xpath("//*[@id='elementor-popup-modal-32248']/div/div[2]/div/section[2]/div/div/div/section/div/div/div/div/div/ul/li[4]/a/span[2]")).click();
			 
			 
			 String contact_email=driver.findElement(By.xpath("//*[@id='elementor-popup-modal-31900']/div/div[2]/div/section/div/div/div/div[2]/div/div/a")).getText();
			 System.out.println("email address is : "+contact_email);
			 
			 //Write data in excel
			 WritingData.writeEmail(contact_email);
	 
}
}