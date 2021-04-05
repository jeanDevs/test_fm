package com.farmatodo.prueba;

import static org.junit.Assert.assertEquals;

import java.io.Console;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VerifyCCPage extends Base {
	
	private WebDriver driver;
	
	By SignInRegisterLocator = By.className("login-btn");
	By RegisterLocator = By.id("login-open-sign-up");
	
	// Locators for the form register
	By RegisterUserNameLocator = By.id("sign-up-name");
	By RegisterLastNameLocator = By.id("sign-up-last-name");
	By RegisterEmailLocator = By.id("sign-up-email");
	By RegisterPasswordLocator = By.id("sign-up-password");
	By RegisterConfirmPasswordLocator = By.id("sign-up-confirm-password");
	By RegisterDocumentNumberLocator = By.id("sign-up-document-number");
	By RegisterPhoneLocator = By.id("sign-up-phone");
	
	By RegisterGenderFemale = By.id("sign-up-female");
	By RegisterGenderMale = By.id("sign-up-male");
	
	By RegisterBtnValidate = By.id("sign-up-validate-customer");
	
	By RegisterCC = By.id("sign-up-general-error-message");
	
	

	public VerifyCCPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void verifyUser() throws InterruptedException {
		Thread.sleep(6000);
		if(isDisplayed(SignInRegisterLocator)) {
			click(SignInRegisterLocator);
			
			Thread.sleep(4000);
			
			click(RegisterLocator);
			type("Jean", RegisterUserNameLocator);
			type("Rodriguez", RegisterLastNameLocator);
			type("jean@gmail.com", RegisterEmailLocator);
			type("Pass&&#0132", RegisterPasswordLocator);
			type("Pass&&#0132", RegisterConfirmPasswordLocator);
			type("1033766679", RegisterDocumentNumberLocator);
			type("3208555689", RegisterPhoneLocator);
			click(RegisterGenderMale);
			
			if(isDisplayed(RegisterBtnValidate)) {
				click(RegisterBtnValidate);
			} else {
				System.out.print("Imcomplete Form");
			}
			
			Thread.sleep(3000);
			String ErrorMessageCC = getText(RegisterCC);
			
			String MensajeEsperado = "¡Hola, Anteriormente ya te habías registrado con jean.s*****@gmail.com Para ingresar inicia sesión con tu correo electrónico o si prefieres también puedes hacerlo con tu número celular.";
			
			assertEquals(MensajeEsperado,ErrorMessageCC);
			
			
		} else {
			System.out.println("Register pages was not found");
		}
	}
	
	
}
