package miniproject;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class multiple_Screenshot {
	public static void screenshot(WebDriver driver, String Str) throws IOException  {
		TakesScreenshot ts=(TakesScreenshot)driver;
        File src=ts.getScreenshotAs(OutputType.FILE);
        String path="C:\\Users\\2303764\\eclipse-workspace\\miniproject\\src\\test\\java\\miniproject\\Screenshot\\"+ Str;
        File trg=new File(path);
        FileUtils.copyFile(src, trg);
	}
}