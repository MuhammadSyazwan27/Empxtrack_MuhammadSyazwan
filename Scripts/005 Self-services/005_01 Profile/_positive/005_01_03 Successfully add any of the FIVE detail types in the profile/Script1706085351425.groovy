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

WebUI.waitForElementVisible(findTestObject('self_Service/Profile/a_Hobbies'), 0)

WebUI.click(findTestObject('self_Service/Profile/a_Hobbies'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('self_Service/Profile/a_Add'), 0)

WebUI.delay(5)

WebUI.click(findTestObject('self_Service/Profile/a_Add'))

WebUI.setText(findTestObject('self_Service/Profile/input_Your Hobbies  Interests_hobbies0'), hobby)

WebUI.click(findTestObject('self_Service/Profile/i_Your Hobbies  Interests_fa fa-save'))

WebUI.verifyElementPresent(findTestObject('self_Service/Profile/div_Record has been added successfully'), 0)

WebUI.click(findTestObject('self_Service/Profile/button_Ok'))

WebUI.click(findTestObject('self_Service/Profile/span_close_X'))

WebUI.click(findTestObject('self_Service/Profile/a_Languages known'))

WebUI.waitForElementClickable(findTestObject('self_Service/Profile/a_Add'), 0)

WebUI.delay(5)

WebUI.click(findTestObject('self_Service/Profile/a_Add'))

WebUI.selectOptionByLabel(findTestObject('self_Service/Profile/select_language'), language, false)

WebUI.selectOptionByLabel(findTestObject('self_Service/Profile/select_proficiency'), proficiency, false)

WebUI.setText(findTestObject('self_Service/Profile/textarea_More details_dataObject.description'), 'pro')

WebUI.click(findTestObject('self_Service/Profile/a_Save'))

WebUI.verifyElementPresent(findTestObject('self_Service/Profile/div_Record has been added successfully'), 0)

WebUI.click(findTestObject('self_Service/Profile/button_Ok'))

WebUI.click(findTestObject('self_Service/Profile/span_close_X'))

WebUI.scrollToElement(findTestObject('self_Service/Profile/a_Education'), 0)

WebUI.waitForElementClickable(findTestObject('self_Service/Profile/a_Add'), 0)

WebUI.click(findTestObject('self_Service/Profile/a_Education'))

WebUI.delay(5)

WebUI.click(findTestObject('self_Service/Profile/input_highestQualification'))

WebUI.selectOptionByLabel(findTestObject('self_Service/Profile/select_educationType'), educationType, false)

WebUI.delay(5)

WebUI.selectOptionByLabel(findTestObject('self_Service/Profile/select_degree'), educationDegree, false)

WebUI.delay(5)

WebUI.setText(findTestObject('self_Service/Profile/input_certification_detail'), educationCollege)

WebUI.delay(5)

WebUI.setText(findTestObject('self_Service/Profile/input_University_university'), education_University)

WebUI.delay(5)

WebUI.setText(findTestObject('self_Service/Profile/input_education_duratiion'), educationDuration)

WebUI.delay(5)

WebUI.setText(findTestObject('self_Service/Profile/input_education_Year of passing'), educationYearofPassing)

WebUI.delay(5)

WebUI.setText(findTestObject('self_Service/Profile/textarea_education_Comment'), educationComment)

WebUI.delay(5)

WebUI.click(findTestObject('self_Service/Profile/a_Submit'))

WebUI.delay(5)

WebUI.click(findTestObject('self_Service/Profile/a_Certification'))

WebUI.delay(5)

WebUI.selectOptionByLabel(findTestObject('self_Service/Profile/select_certification_types'), certificationType, false)

WebUI.delay(5)

WebUI.setText(findTestObject('self_Service/Profile/input_certification_detail'), certificationDetail)

WebUI.delay(5)

WebUI.click(findTestObject('self_Service/Profile/a_Submit'))

WebUI.delay(5)

WebUI.click(findTestObject('self_Service/Profile/a_Prior experience'))

WebUI.delay(5)

WebUI.setText(findTestObject('self_Service/Profile/input_priorCompany_companyName'), priorCompanyName)

WebUI.delay(5)

WebUI.setText(findTestObject('self_Service/Profile/input_priorCompany_startdate'), '01/01/2014')

WebUI.delay(5)

WebUI.setText(findTestObject('self_Service/Profile/input_priorCompany_enddate'), '01/01/2015')

WebUI.delay(5)

WebUI.setText(findTestObject('self_Service/Profile/input_priorCompany_designation'), priorCompanyDesignation)

WebUI.delay(5)

WebUI.setText(findTestObject('self_Service/Profile/input_priorCompany_specifcContrbution'), priorCompanySpecificContribution)

WebUI.delay(5)

WebUI.click(findTestObject('self_Service/Profile/a_Submit'))

WebUI.verifyElementPresent(findTestObject('self_Service/Profile/div_verify_message_experience'), 0)

