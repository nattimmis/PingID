package com.christan.pagetests;

import org.junit.Before;

public class OurSolutionsPingEnableServices extends GenericPageTest {
	@Before
	public void setUp() {
		url = "http://www.pingidentity.com/our-solutions/pingenable-services.cfm";
		initialize();
	}
}
