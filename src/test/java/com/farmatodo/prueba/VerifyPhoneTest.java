package com.farmatodo.prueba;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class VerifyPhoneTest {
	
	private WebDriver driver;
	VerifyPhonePage verifyPhonePage;
	
	@Before
	public void setUp() throws Exception {
		verifyPhonePage = new VerifyPhonePage(driver);
		driver = verifyPhonePage.chromeDriverConnection();
		driver.manage().window().maximize();
		verifyPhonePage.visit("https://www.farmatodo.com.co/");
	}

	@After
	public void tearDown() throws Exception {
		// driver.quit();
	}


	/* Punto 3.
	 * 
	 * Realice el registro de un usuario de forma incorrecta donde se valide que los 
	 * mensajes de teléfono ya se encuentra registrado.
	 * */
	
	@Test
	public void test() throws InterruptedException {
		verifyPhonePage.verifyPhone();
	}

}
