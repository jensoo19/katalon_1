import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable as GlobalVariable

import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.context.TestSuiteContext

//class MybankSuite {
//	/**
//	 * Executes before every test case starts.
//	 * @param testCaseContext related information of the executed test case.
//	 */
////	@BeforeTestCase
////	def sampleBeforeTestCase(TestCaseContext testCaseContext) {
////		println testCaseContext.getTestCaseId()
////		println testCaseContext.getTestCaseVariables()
//		
//		
//		
////}
//
//	/**
//	 * Executes after every test case ends.
//	 * @param testCaseContext related information of the executed test case.
//	 */
////	@AfterTestCase
////	def sampleAfterTestCase(TestCaseContext testCaseContext) {
//////		println testCaseContext.getTestCaseId()
//////		println testCaseContext.getTestCaseStatus()
////		
////		
////	}
//
//	/**
//	 * Executes before every test suite starts.
//	 * @param testSuiteContext: related information of the executed test suite.
//	 */
//	@BeforeTestSuite
//	def sampleBeforeTestSuite() {
////		
//		WebUI.openBrowser('')
//		
//		WebUI.maximizeWindow()
//		
//		WebUI.navigateToUrl('https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login')
//		
//		WebUI.click(findTestObject('Object Repository/XYZbank_OR/Page_XYZ Bank/button_Bank Manager Login'))
//		
//		WebUI.click(findTestObject('Object Repository/XYZbank_OR/Page_XYZ Bank/button_Add Customer'))
//		
//		try {
//			
//			
//			if(WebUI.getText(findTestObject('Object Repository/XYZbank_OR/Page_XYZ Bank/input_First Name_form-control ng-pristine n_693e51')).length()<0)
//			{
//				WebUI.setText(findTestObject('Object Repository/XYZbank_OR/Page_XYZ Bank/input_First Name_form-control ng-pristine n_693e51'),
//					GlobalVariable.Fname)
//			}
//			
//		}
//			
//			catch (Exception e) {
//			this.println(e)
//			}
//			
//		
//			WebUI.setText(findTestObject('Object Repository/XYZbank_OR/Page_XYZ Bank/input_Last Name_form-control ng-pristine ng_64913d'),
//				GlobalVariable.Lname)
//			
//			WebUI.setText(findTestObject('Object Repository/XYZbank_OR/Page_XYZ Bank/input_Post Code_form-control ng-pristine ng_b8fd27'),
//				GlobalVariable.postCode)
//			
//			
//		
//		
//		
//		WebUI.click(findTestObject('Object Repository/XYZbank_OR/Page_XYZ Bank/button_Add Customer_1'))
//		
//		WebUI.waitForAlert(10)
//		
//		WebUI.acceptAlert()
//		
//		WebUI.click(findTestObject('Object Repository/XYZbank_OR/Page_XYZ Bank/button_Open Account'))
//		
//		WebUI.selectOptionByValue(findTestObject('Object Repository/XYZbank_OR/Page_XYZ Bank/select_---Customer Name---       Hermoine G_8136aa'),
//			'6', true)
//		
//		WebUI.selectOptionByValue(findTestObject('Object Repository/XYZbank_OR/Page_XYZ Bank/select_---Currency---       Dollar      Pou_e54511'),
//			'Rupee', true)
//		
//		WebUI.click(findTestObject('Object Repository/XYZbank_OR/Page_XYZ Bank/button_Process'))
//		
//		WebUI.waitForAlert(10)
//		
//		WebUI.acceptAlert()
//		
//	
//	}
//
//	/**
//	 * Executes after every test suite ends.
//	 * @param testSuiteContext: related information of the executed test suite.
//	 */
//	@AfterTestSuite
//	def sampleAfterTestSuite() {
//		WebUI.closeBrowser()
//		
//	}
//}