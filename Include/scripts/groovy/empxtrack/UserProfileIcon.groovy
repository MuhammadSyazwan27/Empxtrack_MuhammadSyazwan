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



class UserProfileIcon {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("user able to login to the website")
	def user_able_to_login_to_the_website() {

		WebUI.callTestCase(findTestCase('001 Login/_positive/001_00_01 Successfully login'), [:], FailureHandling.STOP_ON_FAILURE)

		WebUI.delay(5)
	}

	@When("user click scroll down button on top right")
	def user_click_scroll_down_button_on_top_right() {

		WebUI.click(findTestObject('User Profile Icon/div_e_icon_scrollDown'))
	}

	@And("user click on _view profile_ option")
	def user_click_on_view_profile_option() {

		WebUI.click(findTestObject('User Profile Icon/a_My profile'))
	}

	@Then("user viewed the details of the profile")
	def user_viewed_the_details_of_the_profile() {

		WebUI.verifyElementPresent(findTestObject('User Profile Icon/div_verify_userProfile_emp 02Help'), 0)
	}
}