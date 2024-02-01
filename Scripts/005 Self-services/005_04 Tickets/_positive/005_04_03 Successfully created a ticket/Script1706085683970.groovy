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

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('self_Service/Ticket/a_Create ticket'), 0)

WebUI.delay(5)

WebUI.click(findTestObject('self_Service/Ticket/a_Create ticket'))

WebUI.delay(10)

WebUI.click(findTestObject('self_Service/Ticket/span_ticketType'))

WebUI.delay(5)

WebUI.click(findTestObject('self_Service/Ticket/li_Grievance'))

WebUI.delay(5)

WebUI.waitForElementVisible(findTestObject('self_Service/Ticket/input_Subject_subject'), 0)

WebUI.setText(findTestObject('self_Service/Ticket/input_Subject_subject'), 'cat died')

WebUI.delay(5)

WebUI.click(findTestObject('self_Service/Ticket/body_html_description'))

WebUI.setText(findTestObject('self_Service/Ticket/body_html_description'), 'description 2')

WebUI.click(findTestObject('self_Service/Ticket/a_Submit'))

WebUI.verifyElementPresent(findTestObject('self_Service/Ticket/div_verify_message_createTicket'), 0)

WebUI.click(findTestObject('self_Service/Ticket/button_OK'))

