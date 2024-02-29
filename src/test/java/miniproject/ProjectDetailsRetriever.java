package miniproject;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProjectDetailsRetriever {
	
	static String[] arr = new String[5];
	
	
	public static void retrieveProjectDetails(WebDriver driver) throws InterruptedException, IOException {
		driver.findElement(By.xpath("//*[@id=\"menu-item-25810\"]/a")).click();
		
		PopupHandler.closePopup(driver);
		
        List<WebElement> project_cards = driver.findElements(By.xpath("//div[@id = 'boosted-tab-0']/div[1]//div[@id = 'module_properties']/div"));
        int total_projects = project_cards.size();
        System.out.println("Total number of completed projects: " + total_projects );
	
        
	

        for (int i = 1; i <= 5; i++) {
            WebElement project_name = driver.findElement(By.xpath("//*[@id='module_properties']/div[" + i + "]/div/div/div/div/div/div"));
            System.out.println("Project " + (i) + ": " + project_name.getText());
            arr[i-1] = project_name.getText();
        }
        WritingData.writeProjectNames(arr);
        WritingData.totalProjects(total_projects);
    }



}
