package miniproject;

import java.io.IOException;
import java.time.Duration;
import java.util.Scanner;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class MainClass {

	public static void main(String[] args)throws InterruptedException, TimeoutException, IOException {
		System.out.println("Enter the Browser name");
		Scanner sc=new Scanner(System.in);
		String browser=sc.nextLine();
        WebDriver driver = WebDriverSetup.getDriver(browser);
        driver.manage().window().maximize();
        driver.get("https://ishahomes.com/");
        
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
     
   

        LiveChatHandler.minimizeLiveChat(driver);
        PopupHandler.closePopup(driver);
       
        
	  ProjectDetailsRetriever.retrieveProjectDetails(driver);
     
       
	      
        JavascriptExecutor js= (JavascriptExecutor)driver; 
        js.executeScript("window.scrollBy(0,395)","");
        Thread.sleep(1000);
        multiple_Screenshot.screenshot(driver,"completed_projects.png");
      
        VerifyContactInfo.Contactinfodisplay(driver);
        multiple_Screenshot.screenshot(driver,"result.png");
        
     
       
        driver.quit();
    } 

}
