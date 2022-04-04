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

WebUI.navigateToUrl(GlobalVariable.toolsqa_urlElements_DynamicProperties)

WebUI.maximizeWindow()

WebUI.waitForElementClickable(findTestObject('toolsqa/elements/DynamicProperties/Page_ToolsQA/button_Will enable 5 seconds'), 
    10)

WebUI.click(findTestObject('toolsqa/elements/DynamicProperties/Page_ToolsQA/button_Will enable 5 seconds'))

WebUI.refresh()

WebUI.waitForElementAttributeValue(findTestObject('toolsqa/elements/DynamicProperties/Page_ToolsQA/button_Color Change'), 
    'class', 'mt-4 text-danger btn btn-primary', 10)

WebUI.click(findTestObject('toolsqa/elements/DynamicProperties/Page_ToolsQA/button_Visible After 5 SecondsVisible'))

WebUI.refresh()

WebUI.waitForElementVisible(findTestObject('toolsqa/elements/DynamicProperties/Page_ToolsQA/button_Visible After 5 SecondsVisible'), 
    10)

WebUI.click(findTestObject('toolsqa/elements/DynamicProperties/Page_ToolsQA/button_Visible After 5 SecondsVisible'))

