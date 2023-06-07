package sauceDemo_
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class Saucedemo {
	@Keyword
	public checkOut(String fname ,String Lname) {

		WebUI.setText(findTestObject('Object Repository/Swaglabs_OR/Page_Swag Labs/input_Checkout Your Information_firstName'), fname)

		WebUI.setText(findTestObject('Object Repository/Swaglabs_OR/Page_Swag Labs/input_Checkout Your Information_lastName'), Lname)

		WebUI.setText(findTestObject('Object Repository/Swaglabs_OR/Page_Swag Labs/input_Checkout Your Information_postalCode'), '5271')
	}
}
