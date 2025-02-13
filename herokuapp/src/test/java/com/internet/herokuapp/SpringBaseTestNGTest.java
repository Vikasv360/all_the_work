package com.internet.herokuapp;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

@SpringBootTest
@ContextConfiguration(classes = HerokuappApplication.class)
public class SpringBaseTestNGTest extends AbstractTestNGSpringContextTests{

}
