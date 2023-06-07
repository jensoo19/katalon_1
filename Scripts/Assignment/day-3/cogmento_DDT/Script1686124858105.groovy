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

//CustomKeywords.'cogmanto.Login.login'()
WebUI.setText(findTestObject('Object Repository/cogmento_OR/Page_Cogmento CRM/input_Login_email'), GlobalVariable.email)

		WebUI.setEncryptedText(findTestObject('Object Repository/cogmento_OR/Page_Cogmento CRM/input_Login_password'), '7rcENsDcQMpTGl5L7w+s/Q==')

		WebUI.click(findTestObject('Object Repository/cogmento_OR/Page_Cogmento CRM/div_Login'))

//CustomKeywords.'waitAndClick.WaitAndClick.waitandclick'('Object Repository/cogmento_OR/Page_Cogmento CRM/div_Login', 5)

WebUI.click(findTestObject('Object Repository/cogmento_OR/Page_Cogmento CRM/button_Create'))

WebUI.click(findTestObject('Object Repository/cogmento_OR/Page_Cogmento CRM/input_Login_fname'))

WebUI.setText(findTestObject('Object Repository/cogmento_OR/Page_Cogmento CRM/input_Login_fname'), fname)

WebUI.click(findTestObject('Object Repository/cogmento_OR/Page_Cogmento CRM/input_Login_lname'))

WebUI.setText(findTestObject('Object Repository/cogmento_OR/Page_Cogmento CRM/input_Login_lname'), lname)

WebUI.click(findTestObject('Object Repository/cogmento_OR/Page_Cogmento CRM/input_Login_mname'))
	
WebUI.setText(findTestObject('Object Repository/cogmento_OR/Page_Cogmento CRM/input_Login_mname'), mname)

WebUI.click(findTestObject('Object Repository/cogmento_OR/Page_Cogmento CRM/button_Save'))

WebUI.click(findTestObject('Object Repository/cogmento_OR/Page_Cogmento CRM/a_Contacts'))

WebUI.closeBrowser()

