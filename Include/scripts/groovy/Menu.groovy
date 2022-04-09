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



class Menu {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("homepage sudah terload")
	def homepage() {
		WebUI.openBrowser(GlobalVariable.url)
		WebUI.maximizeWindow()
	}

	@When("klik menu investing")
	def menuInvesting() {
		WebUI.click(findTestObject('Object Repository/homepage/a_Investing'))
	}

	@Then("redirect ke halaman investing")
	def investingPage() {
		WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.urlInvesting, false)
		WebUI.closeBrowser()
	}
	
	@When("klik menu pro tools")
	def menuProTools() {
		WebUI.click(findTestObject('Object Repository/homepage/a_Pro Tools'))
	}

	@Then("redirect ke halaman pro tools")
	def proToolsPage() {
		WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.urlProTools, false)
		WebUI.closeBrowser()
	}
	
	@When("klik menu academy")
	def menuAcademy() {
		WebUI.click(findTestObject('Object Repository/homepage/a_Academy'))
	}
	
	@Then("tab baru terbuka academy")
	def academyNewTab() {
		WebUI.switchToWindowIndex(1)
	}

	@Then("redirect ke halaman academy")
	def academyPage() {
		WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.urlAcademy, false)
		WebUI.closeBrowser()
	}
	
	@When("klik menu about us")
	def menuAboutUs() {
		WebUI.click(findTestObject('Object Repository/homepage/a_About Us'))
	}

	@Then("redirect ke halaman about us")
	def AboutUsPage() {
		WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.urlAboutUs, false)
		WebUI.closeBrowser()
	}
	
	@When("klik menu blog")
	def menuBlog() {
		WebUI.click(findTestObject('Object Repository/homepage/a_Blog'))
	}
	
	@Then("tab baru terbuka blog")
	def blogNewTab() {
		WebUI.switchToWindowIndex(1)
	}

	@Then("redirect ke halaman blog")
	def blogPage() {
		WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.urlBlog, false)
		WebUI.closeBrowser()
	}
	
	@When("klik menu help")
	def menuHelp() {
		WebUI.click(findTestObject('Object Repository/homepage/a_Help'))
	}
	
	@Then("tab baru terbuka help")
	def helpNewTab() {
		WebUI.switchToWindowIndex(1)
	}

	@Then("redirect ke halaman help")
	def helpPage() {
		WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.urlHelp, false)
		WebUI.closeBrowser()
	}
	
	@When("klik menu sign up")
	def menuSignUp() {
		WebUI.click(findTestObject('Object Repository/homepage/div_Sign Up'))
	}

	@Then("redirect ke halaman sign up")
	def registerPage() {
		WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.urlRegister, false)
		WebUI.closeBrowser()
	}
	
	@When("klik menu login")
	def menuLogin() {
		WebUI.click(findTestObject('Object Repository/homepage/div_Log In'))
	}

	@Then("redirect ke halaman login")
	def loginPage() {
		WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.urlLogin, false)
		WebUI.closeBrowser()
	}
}