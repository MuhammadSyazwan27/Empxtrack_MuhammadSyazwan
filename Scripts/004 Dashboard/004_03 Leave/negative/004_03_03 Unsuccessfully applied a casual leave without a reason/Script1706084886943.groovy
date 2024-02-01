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

WebUI.setText(findTestObject('Dashboard/Leave/input_startDate'), '22/01/2024')

WebUI.click(findTestObject('Dashboard/Leave/input_endDate'))

WebUI.click(findTestObject('Dashboard/Leave/a_26'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Dashboard/Leave/textarea_dataObject.reasonForLeave'), ' ')

WebUI.click(findTestObject('Dashboard/Leave/a_Apply_1'))

WebUI.verifyElementPresent(findTestObject('Dashboard/Leave/div_You can not create leave request since _34d67a'), 0)

WebUI.click(findTestObject('Dashboard/Leave/button_OK'))

