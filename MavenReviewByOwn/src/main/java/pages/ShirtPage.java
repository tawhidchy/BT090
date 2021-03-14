package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dB.ObjectRepo;
import util.SeleniumHelper;

public class ShirtPage {
	
static WebDriver dr;
	
	@FindBy(xpath=ObjectRepo.SelectShirt) static WebElement Shirt;
	
	public ShirtPage(WebDriver dr) {
		this.dr=dr;
		PageFactory.initElements(dr, this);
		
	}
	public static ProductDetailsPage SelectShirt() {
		SeleniumHelper.clickOnElement(Shirt);
		
		return new ProductDetailsPage(dr);
	}
	
	
	

}
