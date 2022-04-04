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

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.toolsqa_urlElements_BrokenLinksImage)

WebUI.click(findTestObject('Object Repository/toolsqa/elements/brokenLinksImage/Page_ToolsQA/p_Broken image'))

WebUI.click(findTestObject('Object Repository/toolsqa/elements/brokenLinksImage/Page_ToolsQA/img'))

WebUI.click(findTestObject('Object Repository/toolsqa/elements/brokenLinksImage/Page_ToolsQA/a_Click Here for Valid Link'))

WebUI.back()

WebUI.click(findTestObject('Object Repository/toolsqa/elements/brokenLinksImage/Page_ToolsQA/a_Click Here for Broken Link'))


WebUI.verifyElementText(findTestObject('Object Repository/toolsqa/elements/brokenLinksImage/Page_The Internet/p_This page returned a 500 status code.    _dd4e35'), 
    'This page returned a 500 status code.\n \n For a definition and common list of HTTP status codes, go here')

WebUI.closeBrowser()

