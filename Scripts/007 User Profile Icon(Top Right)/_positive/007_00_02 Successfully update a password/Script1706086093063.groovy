import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('001 Login/_positive/001_00_01 Successfully login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('User Profile Icon/div_e_icon_scrollDown'))

WebUI.click(findTestObject('User Profile Icon/a_Update password'))

WebUI.waitForElementVisible(findTestObject('User Profile Icon/input_Old password_oldPassword'), 0)

WebUI.setText(findTestObject('User Profile Icon/input_Old password_oldPassword'), oldPassword)

WebUI.setText(findTestObject('User Profile Icon/input_New password_password'), newPassword)

WebUI.setText(findTestObject('User Profile Icon/input_Confirm password_cpassword'), confirmPassword)

WebUI.delay(2)

WebUI.click(findTestObject('User Profile Icon/a_Update'))

WebUI.verifyElementPresent(findTestObject('User Profile Icon/div_verify_Password updated successfully'), 0)

WebUI.click(findTestObject('User Profile Icon/button_OK'))

