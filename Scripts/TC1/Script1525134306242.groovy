import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://demoaut-mimic.kazurayam.com/14676_testbed.html')

def content0 = WebUI.getText(findTestObject('Page_14676/li_by_data-offset-index', ['index':'0']))
//WebUI.comment(">>> content0=${content0}")
WebUI.verifyEqual(content0, '- Please Select -')

def content1 = WebUI.getText(findTestObject('Page_14676/li_by_data-offset-index', ['index':'1']))
WebUI.verifyEqual(content1, 'A')

def content2 = WebUI.getText(findTestObject('Page_14676/li_by_data-offset-index', ['index':'2']))
WebUI.verifyEqual(content2, 'B')

def content3 = WebUI.getText(findTestObject('Page_14676/li_by_data-offset-index', ['index':'3']))
WebUI.verifyEqual(content3, 'C')

def content4 = WebUI.getText(findTestObject('Page_14676/li_by_data-offset-index', ['index':'4']))
WebUI.verifyEqual(content4, 'D')

WebUI.closeBrowser()

