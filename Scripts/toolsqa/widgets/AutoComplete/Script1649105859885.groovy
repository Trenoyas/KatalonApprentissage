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

WebUI.navigateToUrl('https://demoqa.com/auto-complete')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/toolsqa/widgets/autocomplete/Page_ToolsQA/div_Type multiple color names_auto-complete_ecc757'))

WebUI.setText(findTestObject('Object Repository/toolsqa/widgets/autocomplete/Page_ToolsQA/input_Type multiple color names_autoComplet_e23c2f'), 
    'r')

WebUI.click(findTestObject('Object Repository/toolsqa/widgets/autocomplete/Page_ToolsQA/div_Green'))

WebUI.setText(findTestObject('Object Repository/toolsqa/widgets/autocomplete/Page_ToolsQA/input_Type multiple color names_autoComplet_e23c2f'), 
    'y')

WebUI.click(findTestObject('Object Repository/toolsqa/widgets/autocomplete/Page_ToolsQA/div_Yellow'))

WebUI.setText(findTestObject('Object Repository/toolsqa/widgets/autocomplete/Page_ToolsQA/input_Type multiple color names_autoComplet_e23c2f'), 
    'b')

WebUI.click(findTestObject('Object Repository/toolsqa/widgets/autocomplete/Page_ToolsQA/div_Black'))

WebUI.click(findTestObject('Object Repository/toolsqa/widgets/autocomplete/Page_ToolsQA/div_Type single color name_auto-complete__v_774fb0'))

WebUI.setText(findTestObject('Object Repository/toolsqa/widgets/autocomplete/Page_ToolsQA/input_Type single color name_autoCompleteSi_4b3ca5'), 
    'r')

WebUI.click(findTestObject('Object Repository/toolsqa/widgets/autocomplete/Page_ToolsQA/div_Purple'))

WebUI.closeBrowser()

