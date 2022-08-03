package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import org.openqa.selenium.JavascriptExecutor; 


public class Base_Page {
	
	WebDriver driver;
	
	public Base_Page(WebDriver driver) {
		this.driver = driver;
	}
	
	public void Green_Click(WebElement el) {
        ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='5px solid lime'", el);
		el.click();
	}
	
	public String Green_GetText(WebElement el) {
        ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='5px solid lime'", el);
		return el.getText();
	}
	
	public void Green_SendKeys(WebElement el , String S) {
        ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='5px solid lime'", el);
		el.sendKeys(S);
	}
	
	

}
