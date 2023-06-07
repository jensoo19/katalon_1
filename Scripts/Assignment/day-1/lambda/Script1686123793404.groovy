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
WebUI.navigateToUrl('https://www.lambdatest.com/selenium-playground/input-form-demo')

assert url_2

String name = 'saumya'

WebUI.verifyEqual('saumya', 'saumya')

String email = 's@gmail.com'

String pass = 'V2fvWhkeYcU='


WebUI.setText(findTestObject('Object Repository/lambda_OR/Page_Selenium Grid Online  Run Selenium Tes_77a03b/input_Name_name'),
	name)

//WebUI.setText(findTestObject('Object Repository/lambda_OR/Page_Selenium Grid Online  Run Selenium Tes_77a03b/input_Email_email'),
//    email)

WebUI.setEncryptedText(findTestObject('Object Repository/lambda_OR/Page_Selenium Grid Online  Run Selenium Tes_77a03b/input_Password_password'),
	pass)

//WebUI.setEncryptedText(findTestObject('Object Repository/lambda_OR/Page_Selenium Grid Online  Run Selenium Tes_77a03b/input_Password_password'),
//    pass)
WebUI.setText(findTestObject('Object Repository/lambda_OR/Page_Selenium Grid Online  Run Selenium Tes_77a03b/input_Company_company'),
	company)

WebUI.setText(findTestObject('Object Repository/lambda_OR/Page_Selenium Grid Online  Run Selenium Tes_77a03b/input_Website_website'),
	website)

WebUI.setText(findTestObject('Object Repository/lambda_OR/Page_Selenium Grid Online  Run Selenium Tes_77a03b/input_City_city'),
	city)

WebUI.setText(findTestObject('Object Repository/lambda_OR/Page_Selenium Grid Online  Run Selenium Tes_77a03b/input_Address_address_line1'),
	'binori')

WebUI.selectOptionByValue(findTestObject('Object Repository/lambda_OR/Page_Selenium Grid Online  Run Selenium Tes_77a03b/select_Choose an optionAfghanistanAland Isl_fe9708'),
	'AG', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/lambda_OR/Page_Selenium Grid Online  Run Selenium Tes_77a03b/select_Choose an optionAfghanistanAland Isl_fe9708'),
	'AO', true)

WebUI.verifyOptionPresentByValue(findTestObject('lambda_OR/Page_Selenium Grid Online  Run Selenium Tes_77a03b/select_Choose an optionAfghanistanAland Isl_fe9708'),
	'', false, 0)

WebUI.setText(findTestObject('Object Repository/lambda_OR/Page_Selenium Grid Online  Run Selenium Tes_77a03b/input_Address_address_line2'),
	'sqaure -5th')

WebUI.setText(findTestObject('Object Repository/lambda_OR/Page_Selenium Grid Online  Run Selenium Tes_77a03b/input_State_inputState'),
	'bopal')

WebUI.setText(findTestObject('Object Repository/lambda_OR/Page_Selenium Grid Online  Run Selenium Tes_77a03b/input_Zip Code_zip'),
	'rsweg')

//WebUI.setText(findTestObject('Object Repository/lambda_OR/Page_Selenium Grid Online  Run Selenium Tes_77a03b/input_Zip Code_zip'),
//    '354')

WebUI.click(findTestObject('Object Repository/lambda_OR/Page_Selenium Grid Online  Run Selenium Tes_77a03b/button_Submit'))

WebUI.closeBrowser()

