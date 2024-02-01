package empxtrack
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



class InvalidPolicyPassword {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User navigate to login Empxtrack website")
	def login_Empxtrack_website() {
		
		WebUI.callTestCase(findTestCase('001 Login/_positive/001_00_01 Successfully login'), [:], FailureHandling.STOP_ON_FAILURE)
		
		WebUI.delay(5)
		
	}

	@When("User clicks update password from user profile")
	def clicks_update_password() {
		
		WebUI.click(findTestObject('User Profile Icon/div_e_icon_scrollDown'))
		
		WebUI.click(findTestObject('User Profile Icon/a_Update password'))
		
	}
	
	@And("User enters password that invalid to the policy")
	def enters_violate_password_policy() {
		
		WebUI.waitForElementVisible(findTestObject('User Profile Icon/input_Old password_oldPassword'), 0)
		
		WebUI.setText(findTestObject('User Profile Icon/input_Old password_oldPassword'), 'Tb123456')
		
		WebUI.setText(findTestObject('User Profile Icon/input_New password_password'), 'TB123456')
		
		WebUI.setText(findTestObject('User Profile Icon/input_Confirm password_cpassword'), 'TB123456')
		
		WebUI.delay(2)
		
		WebUI.click(findTestObject('User Profile Icon/a_Update'))
		
	}

	@Then("User received error message")
	def received_error_popup() {
		
		WebUI.verifyElementPresent(findTestObject('User Profile Icon/div_verify_error_invalidPassword_Policy'), 0)
		
		WebUI.click(findTestObject('User Profile Icon/button_OK'))
		
	}
}