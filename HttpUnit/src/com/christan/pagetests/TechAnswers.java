package com.christan.pagetests;

import org.junit.Before;

public class TechAnswers extends GenericPageTest {
	@Before
	public void setUp() {
		url = "http://www.pingidentity.com/tech-answers/";
		initialize();
	}
}
