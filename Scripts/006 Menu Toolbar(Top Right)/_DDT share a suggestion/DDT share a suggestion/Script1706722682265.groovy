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

WebUI.click(findTestObject('Menu Toolbar/img_Communicate'))

WebUI.click(findTestObject('Menu Toolbar/a_Open_Suggestion'))

WebUI.setText(findTestObject('Menu Toolbar/input_Communication_Suggestion_SpecifyArea'), specifyArea)

WebUI.setText(findTestObject('Menu Toolbar/textarea_Communication_Suggestion_yourSuggestion'), yourSuggestion)

WebUI.click(findTestObject('Menu Toolbar/input_Communication_Suggestion_Check for anonymous submit_checkAnonymousSubmit'))

WebUI.click(findTestObject('Menu Toolbar/a_Submit suggestion'))

WebUI.waitForElementVisible(findTestObject('Menu Toolbar/div_verify_Communication_SuggestionThanks for submitting your valuable suggestion'), 
    0)

WebUI.verifyElementPresent(findTestObject('Menu Toolbar/div_verify_Communication_SuggestionThanks for submitting your valuable suggestion'), 
    0)

WebUI.click(findTestObject('Menu Toolbar/button_Ok'))

