package com.christan.pagetests;

import org.junit.Before;

public class OurSolutions extends GenericPageTest {
	@Before
	public void setUp() {
		url = "http://www.pingidentity.com/our-solutions/";
		initialize();
	}
}