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

println("GlobalVariable.toolsqa_urlBase:"+GlobalVariable.toolsqa_urlBase)
WebUI.navigateToUrl(GlobalVariable.toolsqa_urlElements_txtbox)
//WebUI.navigateToUrl('https://demoqa.com/text-box')

//WebUI.click(findTestObject('Object Repository/toolsqa/elements/textBox/Page_ToolsQA/path'))
//
//WebUI.click(findTestObject('Object Repository/toolsqa/elements/textBox/Page_ToolsQA/span_Text Box'))
WebUI.setText(findTestObject('Object Repository/toolsqa/elements/textBox/Page_ToolsQA/input_Full Name_userName'), fullName)

WebUI.setText(findTestObject('Object Repository/toolsqa/elements/textBox/Page_ToolsQA/input_Email_userEmail'), email)

WebUI.setText(findTestObject('Object Repository/toolsqa/elements/textBox/Page_ToolsQA/textarea_Current Address_currentAddress'), 
    currentAddress)

WebUI.setText(findTestObject('Object Repository/toolsqa/elements/textBox/Page_ToolsQA/textarea_Permanent Address_permanentAddress'), 
    permanentAddress)

WebUI.click(findTestObject('Object Repository/toolsqa/elements/textBox/Page_ToolsQA/button_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/toolsqa/elements/textBox/Page_ToolsQA/p_Namefn'), 'Name:' + fullName)

WebUI.verifyElementText(findTestObject('Object Repository/toolsqa/elements/textBox/Page_ToolsQA/p_Emailemailemail.com'), 
    'Email:' + email)

WebUI.verifyElementText(findTestObject('Object Repository/toolsqa/elements/textBox/Page_ToolsQA/p_Current Address ca'), 
    'Current Address :' + currentAddress)

WebUI.verifyElementText(findTestObject('Object Repository/toolsqa/elements/textBox/Page_ToolsQA/p_Permananet Address pa'), 
    'Permananet Address :' + permanentAddress)

WebUI.closeBrowser()

