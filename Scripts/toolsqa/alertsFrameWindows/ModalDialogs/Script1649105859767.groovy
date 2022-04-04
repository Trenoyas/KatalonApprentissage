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

WebUI.navigateToUrl('https://demoqa.com/modal-dialogs')

WebUI.click(findTestObject('Object Repository/toolsqa/alertsFrameWindows/modalDialogs/Page_ToolsQA/button_Small modal'))

WebUI.verifyElementText(findTestObject('Object Repository/toolsqa/alertsFrameWindows/modalDialogs/Page_ToolsQA/div_This is a small modal. It has very less_c08804'), 
    'This is a small modal. It has very less content')

WebUI.click(findTestObject('Object Repository/toolsqa/alertsFrameWindows/modalDialogs/Page_ToolsQA/button_Close'))

WebUI.click(findTestObject('Object Repository/toolsqa/alertsFrameWindows/modalDialogs/Page_ToolsQA/button_Large modal'))

WebUI.verifyElementText(findTestObject('Object Repository/toolsqa/alertsFrameWindows/modalDialogs/Page_ToolsQA/div_Large Modal'), 
    'Large Modal')

WebUI.click(findTestObject('Object Repository/toolsqa/alertsFrameWindows/modalDialogs/Page_ToolsQA/button_Close_1'))

WebUI.closeBrowser()

