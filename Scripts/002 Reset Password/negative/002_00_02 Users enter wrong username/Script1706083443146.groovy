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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://hrportal.empxtrack.com/empxtrack/logon.do?location=testbitssdnbhd')

WebUI.click(findTestObject('Object Repository/empxtrack Reset Password/Page_Empxtrack logon/a_Login problems'))

WebUI.setText(findTestObject('Object Repository/empxtrack Reset Password/Page_Empxtrack logon/input_User Name_userName'), 
    'adminishere')

WebUI.setText(findTestObject('Object Repository/empxtrack Reset Password/Page_Empxtrack logon/input_Company Id_location'), 
    'testbitssdnbhd')

WebUI.click(findTestObject('Object Repository/empxtrack Reset Password/Page_Empxtrack logon/a_Submit Request'))

WebUI.verifyElementPresent(findTestObject('Object Repository/empxtrack Reset Password/Page_Empxtrack logon/div_An email has been sent to the email id _cbbc3a'), 
    0)

