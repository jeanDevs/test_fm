package com.farmatodo.prueba;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class RegisterTest {
	
	private WebDriver driver;
	RegisterPage registerPage;
	
	@Before
	public void setUp() throws Exception {
		registerPage = new RegisterPage(driver);
		driver = registerPage.chromeDriverConnection();
		driver.manage().window().maximize();
		registerPage.visit("https://www.farmatodo.com.co/");
	}

	@After
	public void tearDown() throws Exception {
		// driver.quit();
	}

	/* Punto 1.
	 * Realice el registro de un usuario de forma correcta y valide que se encuentra logueado.
	 * 
	 * */
	@Test
	public void test() throws InterruptedException {
		registerPage.registerUser();
	}


}
