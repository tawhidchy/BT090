package util;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SeleniumHelper {
	
	
	public  static void clickOnElement(WebElement ele) {
		waitForElement(ele).click();
	}
	public static void typeOnElement(WebElement ele,String text) {
		waitForElement(ele).sendKeys(text);
	}
	
	public static WebElement waitForElement(WebElement ele) {
		ExpectedConditions.visibilityOf(ele);
		return ele;
		
	}
	
public static void clickOnElements(List<WebElement> elements,String text) {
		
		for(WebElement element:elements ) {
			if(element.getText().equals(text)) {
				element.click();
			}
			break;
		}
		
		
	}
public static void clickElementByAttribute(List<WebElement> elements,String attName,String attValue) {
	for(WebElement element:elements) {
		if(element.getAttribute(attName).equals(attValue)) {
			element.click();
		}
		break;
	}
}
	
	

}
