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

WebUI.navigateToUrl('https://www.service.nsw.gov.au/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Page_Home  Service NSW/input_Service NSW makes it easier to find g_bdb6ca'), 
    'Apply for number plate')

WebUI.waitForElementVisible(findTestObject('Page_Home  Service NSW/li_apply for number plate'), 10)

WebUI.click(findTestObject('Object Repository/Page_Home  Service NSW/li_apply for number plate'))

WebUI.verifyElementVisible(findTestObject('Page_Search  Service NSW/Verify page apply for a number plate'))

WebUI.verifyElementText(findTestObject('Page_Search  Service NSW/Verify page apply for a number plate'), '88 results found for ‘apply for number plate’')

WebUI.waitForElementClickable(findTestObject('Page_Search  Service NSW/a_Find locations'), 5)

WebUI.click(findTestObject('Object Repository/Page_Search  Service NSW/a_Find locations'))

WebUI.waitForElementPresent(findTestObject('Page_Find a Service NSW location  Service NSW/input_Search by suburb, postcode or current_d530bf'), 
    5)

WebUI.setText(findTestObject('Object Repository/Page_Find a Service NSW location  Service NSW/input_Search by suburb, postcode or current_d530bf'), 
    'sydney 2000')

WebUI.click(findTestObject('Object Repository/Page_Find a Service NSW location  Service NSW/li_Sydney 2000'))

WebUI.waitForElementPresent(findTestObject('Page_Find a Service NSW location  Service NSW/button_Labels_gm-control-active'), 
    5)

WebUI.click(findTestObject('Object Repository/Page_Find a Service NSW location  Service NSW/button_Labels_gm-control-active'))

WebUI.waitForElementClickable(findTestObject('Page_Find a Service NSW location  Service NSW/a_Marrickville Service Centre'), 
    5)

WebUI.click(findTestObject('Object Repository/Page_Find a Service NSW location  Service NSW/a_Marrickville Service Centre'))

WebUI.verifyElementVisible(findTestObject('Page_Find a Service NSW location  Service NSW/Verify page Marrickville Service Centre'))

WebUI.verifyElementText(findTestObject('Page_Find a Service NSW location  Service NSW/Verify page Marrickville Service Centre'), 
    'Marrickville Service Centre')

WebUI.closeBrowser()

