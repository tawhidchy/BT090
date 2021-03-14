package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dB.ObjectRepo;
import util.SeleniumHelper;

public class ProductDetailsPage {
WebDriver dr;
	
	@FindBy(xpath=ObjectRepo.SelectShirtColor) List<WebElement> ShirtColor;
	
	public ProductDetailsPage(WebDriver dr) {
		this.dr=dr;
		PageFactory.initElements(dr, this);
		
	}
	
	
	public void selectShirtColor(String attName,String attValue) {
		SeleniumHelper.clickElementByAttribute(ShirtColor, "title", "Marine Blue");
	}
	
	

}
