package com.teamsankya.lotproject.controllertest;

import org.junit.Test;

import junit.framework.TestCase;
import net.sourceforge.jwebunit.WebTester;

public class LotControllerTest extends TestCase {
	private WebTester tester = new WebTester();
	private static final String BASE_URL = "http://localhost:8080/lotproject/";
	 
	@Override
	protected void setUp() throws Exception {
		tester.getTestContext().setBaseUrl(BASE_URL);
	}
	@Test
	public void testGetLotId() {
		tester.beginAt("index.jsp");
		
		tester.assertFormPresent();
		tester.setFormElement("lotId", "2SQT34020.1");
		//tester.submit();
		//tester.assertTextPresent("All 3 attributes are for this lot is available..");
		
	}

}
