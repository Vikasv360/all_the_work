package com.internet.herokuapp.page;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

@Component
public class DashBoardComponent extends Base {

	
	@FindBy(name ="q")
	private WebElement searchFil;
	
	@FindBy(name="btnK")
	private List<WebElement> searchBtn;
	
	public void search(final String keyword) {
		this.searchFil.sendKeys(keyword);
		this.searchBtn.stream().filter(e->e.isDisplayed() && e.isEnabled()
				).findFirst().ifPresent(WebElement::click);
	}
	
	@Override
	public boolean isAt() {
		
		return this.wait.until((d)->this.searchFil.isDisplayed());
	}

}
