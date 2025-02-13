package com.internet.herokuapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.internet.herokuapp.page.GooglePage;

@TestPropertySource("classpath:application.properties")  // This ensures Spring picks up your properties file for testing
@SpringBootTest(classes = HerokuappApplication.class)
public class GoogleTest extends SpringBaseTestNGTest{
	
	@Autowired
	private GooglePage googlePage;
	
	@Test
	public void googleTest() {
		this.googlePage.goTo();
		Assert.assertTrue(this.googlePage.isAt());
		this.googlePage.getDashBoardComponent().search("hello");
		Assert.assertTrue(this.googlePage.getSearchResult().getCount() > 2);
	}

}
