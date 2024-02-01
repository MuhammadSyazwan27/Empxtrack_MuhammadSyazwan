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

WebUI.click(findTestObject('self_Service/Profile/div_Self services'))

WebUI.waitForElementVisible(findTestObject('self_Service/Profile/a_View or Edit Profile'), 0)

WebUI.delay(10)

WebUI.click(findTestObject('self_Service/Profile/a_View or Edit Profile'))

WebUI.delay(10)

WebUI.waitForElementVisible(findTestObject('self_Service/Profile/a_View in full page'), 0)

WebUI.click(findTestObject('self_Service/Profile/a_View in full page'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('self_Service/Profile/h2_Employment details'), 0)

WebUI.delay(0)

WebUI.scrollToElement(findTestObject('self_Service/Profile/h2_Basic details'), 0)

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('self_Service/Profile/h2_Contact details'), 0)

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('self_Service/Profile/h2_Education and certifications'), 0)

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('self_Service/Profile/h2_Experience'), 0)

WebUI.verifyElementPresent(findTestObject('self_Service/Profile/h2_Experience'), 0)

