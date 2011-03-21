package com.christan.webwrapper;

import java.io.IOException;
import org.xml.sax.SAXException;
import com.meterware.httpunit.*;

public class HttpUnitBrowser {
	WebConversation browser;
	WebResponse response;

    
    public HttpUnitBrowser() {
    	init();
    }
    
     
    public void init() {
    	HttpUnitOptions.setScriptingEnabled(true);
		HttpUnitOptions.setExceptionsThrownOnScriptError(false);
		
    	browser = new WebConversation();
    }
    
    public boolean open(String url) {
    	boolean result = true;
    	try {
			response = browser.getResponse( url );
		} catch (Exception e) {
			result = false;
			System.err.println(e.getStackTrace());
		} 
		return result;
    }
    
    public boolean clickTextLink(String linkText) {
    	boolean result = true;
    	WebLink link;
    	
		try {
			link = response.getLinkWith( linkText );
			link.click();
		} catch (Exception e) {
			result = false;
			System.err.println(e.getStackTrace());
		} 
		
		return result;
    }
    
    public String getCurrentPageUrl() {
    	return browser.getCurrentPage().getURL().toString();  
    }
}
