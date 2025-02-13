package com.internet.herokuapp.page;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class GooglePage extends Base{

	@Autowired
	private DashBoardComponent dashBoardComponent;
	
	@Autowired
	private SearchResult searchResult;
	
	@Value("${app.url}")
	private String url;
	
	
	public void goTo() {
		this.driver.get(url);
	}
	
	public DashBoardComponent getDashBoardComponent() {
		return dashBoardComponent;
	}

	public SearchResult getSearchResult() {
		return searchResult;
	}


	@Override
	public boolean isAt() {
		// TODO Auto-generated method stub
		return this.dashBoardComponent.isAt();
	}

}
