package com.christan.tests;
import java.io.IOException;

import org.xml.sax.SAXException;

import com.christan.webwrapper.HttpUnitBrowser;
import com.meterware.httpunit.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HttpUnitBrowser browser = new HttpUnitBrowser();
		if(!browser.open("http://www.httpunit.org/doc/cookbook.html"))
			System.out.println("browser failed to open");
		System.out.println(browser.getCurrentPageUrl());
		browser.clickTextLink( "response" );
		System.out.println(browser.getCurrentPageUrl());
		if(!browser.open("http://www.pingidentity.com/"))
			System.out.println("browser failed to open");
		System.out.println(browser.getCurrentPageUrl());
	}

}
