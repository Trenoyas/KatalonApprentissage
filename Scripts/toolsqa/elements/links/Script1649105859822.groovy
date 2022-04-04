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

WebUI.navigateToUrl(GlobalVariable.toolsqa_urlElements_Links)

WebUI.click(findTestObject('Object Repository/toolsqa/elements/links/Page_ToolsQA/a_Home'))

WebUI.switchToWindowTitle('ToolsQA')

//WebUI.verifyElementText(findTestObject('Object Repository/toolsqa/elements/links/Page_ToolsQA/img_Elements_banner-image'), 
//    '')
//
//WebUI.switchToWindowTitle('ToolsQA')

WebUI.click(findTestObject('Object Repository/toolsqa/elements/links/Page_ToolsQA/a_Home'))

WebUI.switchToWindowTitle('ToolsQA')

WebUI.click(findTestObject('Object Repository/toolsqa/elements/links/Page_ToolsQA/a_Home23i0t'))

WebUI.switchToWindowTitle('ToolsQA')

WebUI.click(findTestObject('Object Repository/toolsqa/elements/links/Page_ToolsQA/a_Created'))

WebUI.waitForElementPresent(findTestObject('Object Repository/toolsqa/elements/links/Page_ToolsQA/p_Link has responded with staus 201 and sta_7faac5'), 
    0)

WebUI.click(findTestObject('Object Repository/toolsqa/elements/links/Page_ToolsQA/a_No Content'))

WebUI.verifyElementText(findTestObject('Object Repository/toolsqa/elements/links/Page_ToolsQA/p_Link has responded with staus 204 and sta_130236'), 
    'Link has responded with staus 204 and status text No Content')

WebUI.click(findTestObject('Object Repository/toolsqa/elements/links/Page_ToolsQA/a_Moved'))

WebUI.verifyElementText(findTestObject('Object Repository/toolsqa/elements/links/Page_ToolsQA/p_Link has responded with staus 301 and sta_f4100b'), 
    'Link has responded with staus 301 and status text Moved Permanently')

WebUI.click(findTestObject('Object Repository/toolsqa/elements/links/Page_ToolsQA/a_Bad Request'))

WebUI.verifyElementText(findTestObject('Object Repository/toolsqa/elements/links/Page_ToolsQA/p_Link has responded with staus 400 and sta_af997a'), 
    'Link has responded with staus 400 and status text Bad Request')

WebUI.click(findTestObject('Object Repository/toolsqa/elements/links/Page_ToolsQA/a_Unauthorized'))

WebUI.verifyElementText(findTestObject('Object Repository/toolsqa/elements/links/Page_ToolsQA/p_Link has responded with staus 401 and sta_c68ad6'), 
    'Link has responded with staus 401 and status text Unauthorized')

WebUI.click(findTestObject('Object Repository/toolsqa/elements/links/Page_ToolsQA/a_Forbidden'))

WebUI.waitForElementPresent(findTestObject('Object Repository/toolsqa/elements/links/Page_ToolsQA/p_Link has responded with staus 403 and sta_f8f49e'), 
    0)

WebUI.click(findTestObject('Object Repository/toolsqa/elements/links/Page_ToolsQA/a_Not Found'))

WebUI.verifyElementText(findTestObject('Object Repository/toolsqa/elements/links/Page_ToolsQA/p_Link has responded with staus 404 and sta_f14831'), 
    'Link has responded with staus 404 and status text Not Found')

WebUI.closeBrowser()

