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

WebUI.navigateToUrl('https://ui.cogmento.com/contacts/')

CustomKeywords.'cogmanto.Login.login'()

CustomKeywords.'waitAndClick.WaitAndClick.waitandclick'('Object Repository/cogmento_OR/Page_Cogmento CRM/div_Login', 5)

assert GlobalVariable.email

WebUI.click(findTestObject('Object Repository/cogmento_OR/Page_Cogmento CRM/a_Tasks'))

WebUI.click(findTestObject('Object Repository/cogmento_OR/Page_Cogmento CRM/button_Create'))

WebUI.setText(findTestObject('Object Repository/cogmento_OR/Page_Cogmento CRM/input_Title_title'), 'Day-3')

WebUI.click(findTestObject('Object Repository/cogmento_OR/Page_Cogmento CRM/div_Saumya srivastava'))

WebUI.click(findTestObject('Object Repository/cogmento_OR/Page_Cogmento CRM/div_SelectGeneral SupportCustomer SupportTe_14cdd1'))

WebUI.click(findTestObject('Object Repository/cogmento_OR/Page_Cogmento CRM/div_General Support'))

WebUI.click(findTestObject('Object Repository/cogmento_OR/Page_Cogmento CRM/input_Due Date_calendarField react-datepick_eeee84'))

WebUI.click(findTestObject('Object Repository/cogmento_OR/Page_Cogmento CRM/div_8'))

WebUI.click(findTestObject('Object Repository/cogmento_OR/Page_Cogmento CRM/li_1230'))

WebUI.setText(findTestObject('Object Repository/cogmento_OR/Page_Cogmento CRM/input_Due Date_calendarField react-datepick_eeee84'),
	'')

WebUI.click(findTestObject('Object Repository/cogmento_OR/Page_Cogmento CRM/input_Due Date_calendarField react-datepick_eeee84'))

WebUI.setText(findTestObject('Object Repository/cogmento_OR/Page_Cogmento CRM/input_Completion_completion'), '56')

WebUI.click(findTestObject('Object Repository/cogmento_OR/Page_Cogmento CRM/div_SelectLowNormalHigh'))

WebUI.click(findTestObject('Object Repository/cogmento_OR/Page_Cogmento CRM/div_Normal'))

WebUI.click(findTestObject('Object Repository/cogmento_OR/Page_Cogmento CRM/div_SelectEnquiringReviewingAwaiting input'))

WebUI.click(findTestObject('Object Repository/cogmento_OR/Page_Cogmento CRM/div_Awaiting input'))

WebUI.setText(findTestObject('Object Repository/cogmento_OR/Page_Cogmento CRM/input_Identifier_identifier'), 'gunja')

WebUI.click(findTestObject('Object Repository/cogmento_OR/Page_Cogmento CRM/button_Save'))

WebUI.click(findTestObject('Object Repository/cogmento_OR/Page_Cogmento CRM/div_Calls'))

WebUI.click(findTestObject('Object Repository/cogmento_OR/Page_Cogmento CRM/button_Calls_ui mini basic icon button'))

WebUI.click(findTestObject('Object Repository/cogmento_OR/Page_Cogmento CRM/div_SelectCALLCONFERENCESKYPEHANGOUT'))

WebUI.click(findTestObject('Object Repository/cogmento_OR/Page_Cogmento CRM/div_CONFERENCE'))

WebUI.setText(findTestObject('Object Repository/cogmento_OR/Page_Cogmento CRM/input_Duration_duration'), '1')

WebUI.sendKeys(findTestObject('Object Repository/cogmento_OR/Page_Cogmento CRM/input_Due Date_calendarField react-datepick_eeee84'),
	Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/cogmento_OR/Page_Cogmento CRM/div_SearchNo results found'))

WebUI.click(findTestObject('Object Repository/cogmento_OR/Page_Cogmento CRM/button_Save'))

WebUI.click(findTestObject('Object Repository/cogmento_OR/Page_Cogmento CRM/span_Home'))

WebUI.closeBrowser()


