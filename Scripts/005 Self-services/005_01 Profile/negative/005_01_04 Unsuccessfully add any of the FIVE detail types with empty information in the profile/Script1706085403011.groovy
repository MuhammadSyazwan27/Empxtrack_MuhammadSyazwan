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

WebUI.scrollToElement(findTestObject('self_Service/Profile/a_Hobbies'), 0)

WebUI.click(findTestObject('self_Service/Profile/a_Hobbies'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('self_Service/Profile/a_Add'))

WebUI.click(findTestObject('self_Service/Profile/input_Your Hobbies  Interests_hobbies0'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('self_Service/Profile/i_Your Hobbies  Interests_fa fa-save'))

WebUI.verifyElementPresent(findTestObject('self_Service/Profile/div_verify_message_error_basicInfo'), 0)

WebUI.click(findTestObject('self_Service/Profile/button_Ok'))

WebUI.click(findTestObject('self_Service/Profile/span_close_X'))

WebUI.delay(5)

WebUI.click(findTestObject('self_Service/Profile/a_Dependents'))

WebUI.delay(5)

WebUI.click(findTestObject('self_Service/Profile/a_Submit'))

WebUI.verifyElementPresent(findTestObject('self_Service/Profile/div_verify_message_error_Dependent'), 0)

WebUI.click(findTestObject('self_Service/Profile/button_Ok'))

WebUI.click(findTestObject('self_Service/Profile/span_close_X'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('self_Service/Profile/a_Education'), 0)

WebUI.click(findTestObject('self_Service/Profile/a_Education'))

WebUI.delay(5)

WebUI.click(findTestObject('self_Service/Profile/a_Submit'))

WebUI.verifyElementPresent(findTestObject('self_Service/Profile/div_verify_message_error_educationCertification'), 0)

WebUI.click(findTestObject('self_Service/Profile/button_Ok'))

WebUI.click(findTestObject('self_Service/Profile/span_close_X'))

WebUI.delay(5)

WebUI.click(findTestObject('self_Service/Profile/a_Certification'))

WebUI.delay(5)

WebUI.click(findTestObject('self_Service/Profile/a_Submit'))

WebUI.verifyElementPresent(findTestObject('self_Service/Profile/div_verify_message_error_educationCertification'), 0)

WebUI.click(findTestObject('self_Service/Profile/button_Ok'))

WebUI.click(findTestObject('self_Service/Profile/span_close_X'))

WebUI.click(findTestObject('self_Service/Profile/a_Prior experience'))

WebUI.delay(5)

WebUI.click(findTestObject('self_Service/Profile/a_Submit'))

WebUI.verifyElementPresent(findTestObject('self_Service/Profile/div_verify_message_error_priorCompany'), 0)

WebUI.click(findTestObject('self_Service/Profile/button_Ok'))

WebUI.click(findTestObject('self_Service/Profile/span_close_X'))

