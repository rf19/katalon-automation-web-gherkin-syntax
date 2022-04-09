import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class Login {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("halaman login sudah terload")
	def loginPage() {
		WebUI.openBrowser(GlobalVariable.urlLogin)
		WebUI.maximizeWindow()
	}

	@When("isi field email (.*) benar dan password (.*) benar")
	def inputDataBenar(String email, String password) {
		WebUI.setText(findTestObject('Object Repository/login/input_Email_username'), email)
		WebUI.setEncryptedText(findTestObject('Object Repository/login/input_Password'), password)
	}

	@When("klik button login")
	def clickLogin() {
		WebUI.click(findTestObject('Object Repository/login/input_Login'))
	}

	@When("klik skip di pop up ganti avatar")
	def clickSkip() {
		WebUI.click(findTestObject('Object Repository/login/button_Skip'))
	}

	@Then("redirect ke halaman stream")
	def redirectStreamPage() {
		WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.urlStream, false)
		WebUI.closeBrowser()
	}

	@When("isi field email (.*) salah dan password (.*) salah")
	def inputDataSalah(String email, String password) {
		WebUI.setText(findTestObject('Object Repository/login/input_Email_username'), email)
		WebUI.setEncryptedText(findTestObject('Object Repository/login/input_Password'), password)
	}

	@Then("tampil pesan error")
	def errorMessage() {
		WebUI.getText(findTestObject('Object Repository/login/div_Username atau password salah. Mohon coba lagi'))
		WebUI.closeBrowser()
	}
}