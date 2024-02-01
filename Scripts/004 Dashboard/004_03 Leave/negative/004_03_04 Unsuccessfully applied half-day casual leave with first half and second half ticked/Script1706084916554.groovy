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

WebUI.click(findTestObject('Dashboard/Leave/i_Casual Leave_triple_dots'))

WebUI.click(findTestObject('Dashboard/Leave/i_Apply_fa fa-arrow-circle-right'))

WebUI.waitForElementVisible(findTestObject('Dashboard/Leave/input_startDate'), 0)

WebUI.click(findTestObject('Dashboard/Leave/input_startDate'))

WebUI.setText(findTestObject('Dashboard/Leave/input_startDate'), '26/01/2024')

WebUI.click(findTestObject('Dashboard/Leave/input_endDate'))

WebUI.click(findTestObject('Dashboard/Leave/a_26'))

WebUI.click(findTestObject('Dashboard/Leave/input_Starts from second-half of 2301_dataObject.firstHalf'))

WebUI.click(findTestObject('Dashboard/Leave/input_End on first-half of 0101_dataObject.secondHalf'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Dashboard/Leave/div_You cannot select both partial days option on the same day of leave'), 
    0)

WebUI.click(findTestObject('Dashboard/Leave/button_OK'))

