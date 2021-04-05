package com.farmatodo.prueba;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class VerifyCCTest {
	
	private WebDriver driver;
	VerifyCCPage verifyPage;
	
	@Before
	public void setUp() throws Exception {
		verifyPage = new VerifyCCPage(driver);
		driver = verifyPage.chromeDriverConnection();
		driver.manage().window().maximize();
		verifyPage.visit("https://www.farmatodo.com.co/");
	}

	@After
	public void tearDown() throws Exception {
		// driver.quit();
	}

	/* Punto 2.
	 * Realice el registro de un usuario de forma incorrecta donde se valide que los mensajes de cédula 
	 * ya se encuentra registrado.
	 * 
	 * */
	@Test
	public void test() throws InterruptedException {
		verifyPage.verifyUser();
		
	}

}
