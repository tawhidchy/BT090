package testingPackege;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import pages.HomePage;
import pages.MenPage;
import pages.ProductDetailsPage;
import pages.ShirtPage;

public class SmokeTest extends BaseTest {
	
	HomePage hp;
	MenPage mp;
	ShirtPage sp;
	ProductDetailsPage pdp;
	
	
	@Test
	public void buyAShirt() {
		
		hp=new HomePage(dr);
		mp=HomePage.clickOnMen();
		sp=MenPage.clickOnShirt();
		pdp=ShirtPage.SelectShirt();
		pdp.selectShirtColor("titel", "Marine Blue");
		
		
	}
	
	
	

}
