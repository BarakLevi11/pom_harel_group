package page_objects;

import java.time.LocalDate;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;





public class Harel_group extends Base_Page{
	
		
		public Harel_group(WebDriver driver) {
			super(driver);
		}
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		
		
		public void purchase_for_new_customer_click() {
			try {
				WebElement el = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-hrl-bo='purchase-for-new-customer']")));
				Green_Click(el);
			} catch(Exception e) {
		        System.out.println("קיימת בעיה ברכיב רכישה פעם ראשונה");  
				throw e;
			}
		}
		
		
		public void Choosing_Continent_click(String S) {
			try {
				WebElement el = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@data-hrl-bo='" + S + "']")));
				Green_Click(el);
			}catch(Exception e) {
		        System.out.println("קיימת בעיה ברכיב בחירת יבשת");  
				throw e;
			}
		}
		
		
		public void travel_start_date_click(LocalDate D) {
			try {
				WebElement el = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-hrl-bo='" + D + "']")));
				Green_Click(el);
			} catch(Exception e) {
		        System.out.println("קיימת בעיה ברכיב בחירת תאריך יציאה");  
				throw e;
			}
		}
		
		
		public void travel_end_date_click(LocalDate D) {
			try {
				
				if(driver.findElements(By.xpath("//button[@data-hrl-bo='" + D + "']")).isEmpty()) {
					Arrow_forward_click();
				}

				WebElement el = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-hrl-bo='" + D + "']")));
				Green_Click(el);
			} catch(Exception e) {
		        System.out.println("קיימת בעיה ברכיב בחירת תאריך חזרה");  
				throw e;
			}
		}
		
		public void Arrow_forward_click() {
			try {
				WebElement el = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div/button[@data-hrl-bo='arrow-forward'])[2]")));
				Green_Click(el);
			} catch(Exception e) {
		        System.out.println("קיימת בעיה ברכיב גלילת חודשים");  
				throw e;
			}
		}
		
		
		public String Total_days_Get_Text() {
			
			try {
				WebElement el = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-hrl-bo='total-days']")));
				String[] splitted_all_text = Green_GetText(el).split(" ");
				return splitted_all_text[1];
			} catch(Exception e) {
		        System.out.println("קיימת בעיה ברכיב סך ימים");  
				throw e;
			}			
		}
		
		
		public void Selecting_Passenger_Details_click() {
			try {
				WebElement el = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-hrl-bo='wizard-next-button']")));
				Green_Click(el);
			} catch(Exception e) {
		        System.out.println("קיימת בעיה ברכיב פרטי נוסעים");  
				throw e;
			}
		}
		
		
		public String Screen_title_Passenger_Details_Page_Get_Text() {
			try {
				WebElement el = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[@data-hrl-bo='screen_title']")));
				return Green_GetText(el);
			} catch(Exception e) {
		        System.out.println("קיימת בעיה ברכיב כותרת במסך פרטי נוסעים");  
				throw e;
			}			
		}
		
		
		
		
		public void Scroll_Page(int x) throws InterruptedException {

	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        while (x != 0) {
	            Thread.sleep(1);
	            js.executeScript("window.scrollBy(0,2)", "");
	            if (x > 0) x--;
	            if (x < 0) x++;
	        }
	    }
		
		
		
		

	     

}
