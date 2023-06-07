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
WebUI.click(findTestObject('Object Repository/Customer_OR/Page_XYZ Bank/button_Customer Login'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer_OR/Page_XYZ Bank/select_---Your Name---       Hermoine Grang_2c90e6'),
	'6', true)

WebUI.click(findTestObject('Object Repository/Customer_OR/Page_XYZ Bank/button_Login'))

//WebUI.click(findTestObject('Object Repository/Customer_OR/Page_XYZ Bank/div_Welcome saumya sri Please open an accou_66c62f'))
WebUI.verifyTextPresent('saumya', true)

WebUI.click(findTestObject('Object Repository/Customer_OR/Page_XYZ Bank/button_Deposit'))

WebUI.setText(findTestObject('Object Repository/Customer_OR/Page_XYZ Bank/input_Amount to be Deposited_form-control n_97f4dd'),
	'1000')

WebUI.click(findTestObject('Object Repository/Customer_OR/Page_XYZ Bank/button_Deposit_1'))

WebUI.click(findTestObject('Object Repository/Customer_OR/Page_XYZ Bank/button_Withdrawl'))

WebUI.setText(findTestObject('Object Repository/Customer_OR/Page_XYZ Bank/input_Amount to be Deposited_form-control n_97f4dd'),
	'500')

WebUI.click(findTestObject('Object Repository/Customer_OR/Page_XYZ Bank/button_Withdraw'))

WebUI.click(findTestObject('Object Repository/Customer_OR/Page_XYZ Bank/button_Transactions'))

WebUI.click(findTestObject('Object Repository/Customer_OR/Page_XYZ Bank/button_Logout'))

WebUI.click(findTestObject('Object Repository/Customer_OR/Page_XYZ Bank/button_Home'))



