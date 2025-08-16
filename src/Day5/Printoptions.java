package Day5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.print.PageSize;
import org.openqa.selenium.print.PrintOptions;

public class Printoptions {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		PrintOptions printOptions=new PrintOptions();
		printOptions.setOrientation(PrintOptions.Orientation.LANDSCAPE);
		PrintOptions.Orientation current_orientation = printOptions.getOrientation();
		System.out.println(current_orientation);
		
		printOptions.setPageRanges("1-2");
        String[] current_range=printOptions.getPageRanges();
        System.out.println(current_range);
        
        printOptions.setPageSize(new PageSize(27.94, 21.59)); // A4 size in cm
        double currentHeight = printOptions.getPageSize().getHeight();// use getWidth() to retrieve width
        System.out.println(currentHeight);
        
		
		driver.quit();
	}

}
