package com.farmatodo.prueba;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class RegisterPage extends Base {
	
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
	
	By RegisterValidateCodeBoxAccountLocator = By.id("sign-up-validate-phone-token");
	By RegisterValidateAccountBntLocator = By.id("sign-up-validate-phone-validate");
	By RegisterValidateError = By.id("sign-up-validate-phone-token-error");
	By RegisterValidateSenNewCode = By.id("sign-up-validate-phone-re-send");
	
	By RegisterCloseBanner = By.className("ab-close-button");
	By RegisterValiateAccountHome = By.id("nav-bar-profile-redirect");
	

	public RegisterPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void registerUser() throws InterruptedException {
		Thread.sleep(6000);
		
		// WebDriverWait ewait = new WebDriverWait(driver,10);
		// ewait.until(ExpectedConditions.titleContains("Farmatodo"))
		
		if(isDisplayed(SignInRegisterLocator)) {
			click(SignInRegisterLocator);
			
			Thread.sleep(4000);
			
			click(RegisterLocator);
			type("Sebastian", RegisterUserNameLocator);
			type("Agredo", RegisterLastNameLocator);
			type("maytati_@hotmail.com", RegisterEmailLocator);
			type("Pass&&#0132", RegisterPasswordLocator);
			type("Pass&&#0132", RegisterConfirmPasswordLocator);
			type("1033766679", RegisterDocumentNumberLocator);
			type("3214303561", RegisterPhoneLocator);
			click(RegisterGenderMale);
			
			if(isDisplayed(RegisterBtnValidate)) {
				click(RegisterBtnValidate);
			} else {
				System.out.print("Imcomplete Form");
			}
			
			Thread.sleep(5000);
			// Validar que la caja este disponible
			if(isDisplayed(RegisterValidateCodeBoxAccountLocator)) {
				Thread.sleep(25000);
				if (isDisplayed(RegisterValidateAccountBntLocator)) {
					click(RegisterValidateAccountBntLocator);
				} else if(isDisplayed(RegisterValidateError)) { 
					click(RegisterValidateSenNewCode);
				}
			} else {
				System.out.print("Windown Modal Don´t Exists");
			}
			
			Thread.sleep(5000);
			// Publicidad post validación 
			if (isDisplayed(RegisterCloseBanner)) {
				click(RegisterCloseBanner);
			} else {
				System.out.println("Sin Publicidad");
			}
			
			// Validación
			if (isDisplayed(RegisterValiateAccountHome)) {
				System.out.println("Usuario Encontrado");
			} else {
				System.out.println("Usuario NO Encontrado");
			}
			
			
		} else {
			System.out.println("Register pages was not found");
		}
	}
	
}
