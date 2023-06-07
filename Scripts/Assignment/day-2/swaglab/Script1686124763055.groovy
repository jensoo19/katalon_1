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

WebUI.navigateToUrl(url_1)

WebUI.click(findTestObject('Object Repository/Swaglabs_OR/Page_Swag Labs/input_Swag Labs_user-name'))

WebUI.click(findTestObject('Object Repository/Swaglabs_OR/Page_Swag Labs/input_Swag Labs_user-name'))

WebUI.setText(findTestObject('Object Repository/Swaglabs_OR/Page_Swag Labs/input_Swag Labs_user-name'), GlobalVariable.username)

WebUI.verifyElementAttributeValue(findTestObject('Object Repository/Swaglabs_OR/Page_Swag Labs/input_Swag Labs_user-name'),
	'value', 'standard_user', 5)

WebUI.setEncryptedText(findTestObject('Object Repository/Swaglabs_OR/Page_Swag Labs/input_Swag Labs_password'), GlobalVariable.password)

//WebUI.setEncryptedText(findTestObject('Object Repository/Swaglabs_OR/Page_Swag Labs/input_Swag Labs_password'), password)
WebUI.verifyElementAttributeValue(findTestObject('Object Repository/Swaglabs_OR/Page_Swag Labs/input_Swag Labs_password'),
	'value', 'secret_sauce', 5)

WebUI.verifyElementClickable(findTestObject('Object Repository/Swaglabs_OR/Page_Swag Labs/input_Swag Labs_login-button'))

WebUI.click(findTestObject('Object Repository/Swaglabs_OR/Page_Swag Labs/input_Swag Labs_login-button'))

WebUI.click(findTestObject('Object Repository/Swaglabs_OR/Page_Swag Labs/img_Add to cart_inventory_item_img'))

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/Swaglabs_OR/Page_Swag Labs/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/Swaglabs_OR/Page_Swag Labs/a_1'))

WebUI.click(findTestObject('Object Repository/Swaglabs_OR/Page_Swag Labs/div_QTYDescription1Sauce Labs Bolt T-ShirtG_7b7a79'))

WebUI.getText(findTestObject('Object Repository/Swaglabs_OR/Page_Swag Labs/div_QTYDescription1Sauce Labs Bolt T-ShirtG_7b7a79'))

WebUI.click(findTestObject('Object Repository/Swaglabs_OR/Page_Swag Labs/button_Checkout'))

CustomKeywords.'sauceDemo_.Saucedemo.checkOut'('saumya', 'srivastava')

CustomKeywords

CustomKeywords.'waitAndClick.WaitAndClick.waitandclick'('Object Repository/test2_OR/Page_Swag Labs/input_Cancel_continue',
	5)

//WebUI.click(findTestObject())
WebUI.click(findTestObject('Object Repository/Swaglabs_OR/Page_Swag Labs/button_Finish'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Swaglabs_OR/Page_Swag Labs/button_Back Home'))

WebUI.closeBrowser()

WebUI.acceptAlert()

