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

WebUI.click(findTestObject('Dashboard/Event_Task/Page_Home page/div_Dashboards'))

WebUI.click(findTestObject('Dashboard/Event_Task/Page_Home page/a_Add New Event'))

WebUI.delay(5)

WebUI.click(findTestObject('Dashboard/Event_Task/Page_Home page/input_Event_task'))

WebUI.setText(findTestObject('Dashboard/Event_Task/Page_Home page/input_Subject_subject'), 'Cooking pie')

WebUI.click(findTestObject('Dashboard/Event_Task/Page_Home page/input_Due on_date_selectedEndDate'))

WebUI.click(findTestObject('Dashboard/Event_Task/Page_Home page/a_26'))

WebUI.click(findTestObject('Dashboard/Event_Task/Page_Home page/a_Save'))

WebUI.verifyElementPresent(findTestObject('Dashboard/Event_Task/Page_Home page/div_verify_message_Task has been saved successfully'), 
    0)

WebUI.click(findTestObject('Dashboard/Event_Task/Page_Home page/button_OK'))

