package tests;

import java.time.LocalDate;

import org.testng.annotations.Test;
import page_objects.Harel_group;


public class Harel_group_Test extends BaseTest{
	
	
	@Test(priority = 1)
	public void Order() throws InterruptedException{
		
		Harel_group harel_group = new Harel_group(driver);
		
		driver.get("https://digital.harel-group.co.il/travel-policy");
		
        harel_group.purchase_for_new_customer_click();
        harel_group.Scroll_Page(150);

        harel_group.Choosing_Continent_click("canada");
        
        LocalDate travel_start_date = java.time.LocalDate.now().plusDays(6);
        LocalDate travel_end_date = travel_start_date.plusDays(29);

        Thread.sleep(1000);
        harel_group.Scroll_Page(150);
        harel_group.travel_start_date_click(travel_start_date);
        harel_group.travel_end_date_click(travel_end_date);
        
        harel_group.Scroll_Page(150);
	    String Total_days = harel_group.Total_days_Get_Text();
        if (!Total_days.equals("30")) {
        	System.out.println("סך הימים שהמערכת מציגה אינו תואם את מספר ימי הבחירה של המשתמש");  
			throw new InterruptedException();
        }
        
        harel_group.Selecting_Passenger_Details_click();
        
        String title_Passenger_Details = harel_group.Screen_title_Passenger_Details_Page_Get_Text();
        if(title_Passenger_Details.isEmpty()) {
        	System.out.println("דף פרטי נוסעים אינו נפתח");  
        	throw new InterruptedException();
        }
      
        Thread.sleep(1000);       


		
	}
	
	
	
	
	

}
