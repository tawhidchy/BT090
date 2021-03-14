package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dB.ObjectRepo;
import util.SeleniumHelper;



public class HomePage {
	
	static WebDriver dr;
	@FindBy(xpath=ObjectRepo.menMenuLink)
	static WebElement menMenuClick;
	
	public HomePage(WebDriver dr) {
		this.dr=dr;
		PageFactory.initElements(dr, this);
		
	}
	
	

	
	
	public static MenPage clickOnMen() {
		SeleniumHelper.clickOnElement(menMenuClick);
		return new MenPage(dr);
	}
	
	

}
