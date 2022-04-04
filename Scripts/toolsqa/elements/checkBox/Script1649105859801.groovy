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

WebUI.navigateToUrl(GlobalVariable.toolsqa_urlElements_checkbox)

String[] listeBloc = choix.split('\n')
for (j = 0; j < listeBloc.size(); j++) {
	println("listeBloc:'"+listeBloc[j].trim()+"'")
	listeChoix = listeBloc[j].trim().split('>')
	for (i = 0; i < listeChoix.size(); i++) {
		println(listeChoix[i])
		println("listeChoix1[i]:"+listeChoix[i])
	    if (i < (listeChoix.size() - 1)) {
	        //click sur la fleche
			if(WebUI.verifyElementPresent(findTestObject('Object Repository/toolsqa/elements/checkBox/Page_ToolsQA/BTN_Noeud', [('choix') : listeChoix[i]]), 3, FailureHandling.OPTIONAL)) {
				WebUI.click(findTestObject('Object Repository/toolsqa/elements/checkBox/Page_ToolsQA/BTN_Noeud', [('choix') : listeChoix[i]])) //click sur le checkbox
			}
	    } else {
			if(listeChoix[i].contains("-")) {
				for(String choix:listeChoix[i].split("-")) {
					if(WebUI.verifyElementPresent(findTestObject('Object Repository/toolsqa/elements/checkBox/Page_ToolsQA/BTN_NoeudFinal', [('choix') : choix]), 3, FailureHandling.OPTIONAL)) {
						WebUI.check(findTestObject('Object Repository/toolsqa/elements/checkBox/Page_ToolsQA/BTN_NoeudFinal', [('choix') : choix]))
					}
				}
			} else {
				if(WebUI.verifyElementPresent(findTestObject('Object Repository/toolsqa/elements/checkBox/Page_ToolsQA/BTN_NoeudFinal', [('choix') : listeChoix[i]]), 3, FailureHandling.OPTIONAL)) {
					WebUI.check(findTestObject('Object Repository/toolsqa/elements/checkBox/Page_ToolsQA/BTN_NoeudFinal', [('choix') : listeChoix[i]]))
				}
			}
	    }
	}
}


WebUI.closeBrowser()



