package com.internet.herokuapp.page;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

@Component
public class SearchResult extends Base{

	@FindBy(css=".LC20lb")
	private List<WebElement> results;
	
	
	public int getCount() {
		return this.results.size();
		
	}
	
	
	@Override
	public boolean isAt() {
		// TODO Auto-generated method stub
		return this.wait.until((d)->!this.results.isEmpty());
	}

}
