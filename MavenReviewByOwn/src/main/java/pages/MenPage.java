package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dB.ObjectRepo;
import util.SeleniumHelper;

public class MenPage {
	static WebDriver dr;
	
	@FindBy(xpath=ObjectRepo.Pelements)
	static List<WebElement> ShirtMenu;
	
	public MenPage(WebDriver dr) {
		this.dr=dr;
		PageFactory.initElements(dr, this);
		
	}
	
	public static ShirtPage clickOnShirt() {
		SeleniumHelper.clickOnElements(ShirtMenu, "SHIRT");
		return new ShirtPage(dr);
	}
	

}
