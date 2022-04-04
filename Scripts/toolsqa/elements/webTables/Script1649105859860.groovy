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
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.toolsqa_urlElements_webtables)

switch (Action) {
    case 'C':
        String table = WebUI.getText(findTestObject('Object Repository/toolsqa/elements/webTables/Page_ToolsQA/TXT_tables'))
		WebElement Table = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/toolsqa/elements/webTables/Page_ToolsQA/TXT_tables'), 30);
		//To locate rows of table it will Capture all the rows available in the table'
		List<WebElement> rows_table = Table.findElements(By.xpath('//div[@class="rt-tbody"]/div/div[@role="row"]'))
		//To calculate no of rows In table'
		int rows_count = rows_table.size()
		 
		//Loop will execute for all the rows of the table'
		boolean ligneTrouve=false
		Loop:
		for (int row = 0; row < rows_count; row++) {
			//To locate columns(cells) of that specific row'
			//translate(normalize-space(//div[@role="row"], ' ', '')
			List<WebElement> Columns_row = rows_table.get(row).findElements(By.tagName('div'))
			 
			//To calculate no of columns(cells) In that specific row'
			int columns_count = Columns_row.size()
			 
			println((('Number of cells In Row ' + row) + ' are ') + columns_count)
			 
			int nbColonneTrouve=0 
			//Loop will execute till the last cell of that specific row'
			for (int column = 0; column < columns_count; column++) {
				//It will retrieve text from each cell'
				String celltext = Columns_row.get(column).getText()
				println((((('Cell Value Of row number ' + row) + ' and column number ') + column) + ' Is ') + celltext)
				//Checking if Cell text is matching with the expected value'
				if (celltext == FirstName) {
					nbColonneTrouve=nbColonneTrouve+1
				}
				if (celltext == LastName) {
					nbColonneTrouve=nbColonneTrouve+1
				}
				if (celltext == Age) {
					nbColonneTrouve=nbColonneTrouve+1
				}
				if (celltext == Email) {
					nbColonneTrouve=nbColonneTrouve+1
				}
				if (celltext == Salary) {
					nbColonneTrouve=nbColonneTrouve+1
				}
				if (celltext == Department) {
					nbColonneTrouve=nbColonneTrouve+1
				}
			}
			if(nbColonneTrouve==6) {
				ligneTrouve=true
				break Loop
			}
		}
		if(ligneTrouve) {
			println("ligneTrouve trouvé:")
		}
        break
	case 'M':
		//String table = WebUI.getText(findTestObject('Object Repository/toolsqa/elements/webTables/Page_ToolsQA/TXT_tables'))
		WebElement Table = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/toolsqa/elements/webTables/Page_ToolsQA/TXT_tables'), 30);
		//To locate rows of table it will Capture all the rows available in the table'
		List<WebElement> rows_table = Table.findElements(By.xpath('//div[@class="rt-tbody"]/div/div[@role="row"]'))
		//To calculate no of rows In table'
		int rows_count = rows_table.size()
		 
		//Loop will execute for all the rows of the table'
		boolean ligneTrouve=false
		Loop:
		for (int row = 0; row < rows_count; row++) {
			//To locate columns(cells) of that specific row'
			//translate(normalize-space(//div[@role="row"], ' ', '')
			List<WebElement> Columns_row = rows_table.get(row).findElements(By.tagName('div'))
			 
			//To calculate no of columns(cells) In that specific row'
			int columns_count = Columns_row.size()
			 
			println((('Number of cells In Row ' + row) + ' are ') + columns_count)
			 
			int nbColonneTrouve=0
			//Loop will execute till the last cell of that specific row'
			for (int column = 0; column < columns_count; column++) {
				//It will retrieve text from each cell'
				String celltext = Columns_row.get(column).getText()
				println((((('Cell Value Of row number ' + row) + ' and column number ') + column) + ' Is ') + celltext)
				//Checking if Cell text is matching with the expected value'
				if(FirstName.contains("|")) {
					println("FirstName.split:"+FirstName.split("\\|")[0])
					if (celltext == FirstName.split("\\|")[0]) {
						nbColonneTrouve=nbColonneTrouve+1
					}
				} else {
					if (celltext == FirstName) {
						nbColonneTrouve=nbColonneTrouve+1
					}
				}
				if(LastName.contains("|")) {
					if (celltext == LastName.split("\\|")[0]) {
						nbColonneTrouve=nbColonneTrouve+1
					}
				} else {
					if (celltext == LastName) {
						nbColonneTrouve=nbColonneTrouve+1
					}
				}
				if(Age.contains("|")) {
					if (celltext == Age.split("\\|")[0]) {
						nbColonneTrouve=nbColonneTrouve+1
					}
				} else {
					if (celltext == Age) {
						nbColonneTrouve=nbColonneTrouve+1
					}
				}
				if(Email.contains("|")) {
					if (celltext == Email.split("\\|")[0]) {
						nbColonneTrouve=nbColonneTrouve+1
					}
				} else {
					if (celltext == Email) {
						nbColonneTrouve=nbColonneTrouve+1
					}
				}

				if(Salary.contains("|")) {
					if (celltext == Salary.split("\\|")[0]) {
						nbColonneTrouve=nbColonneTrouve+1
					}
				} else {
					if (celltext == Salary) {
						nbColonneTrouve=nbColonneTrouve+1
					}
				}
				if(Department.contains("|")) {
					if (celltext == Department.split("\\|")[0]) {
						nbColonneTrouve=nbColonneTrouve+1
					}
				} else {
					if (celltext == Department) {
						nbColonneTrouve=nbColonneTrouve+1
					}
				}

			}
			if(nbColonneTrouve==6) {
				ligneTrouve=true
				
				WebUI.click(findTestObject('Object Repository/toolsqa/elements/webTables/Page_ToolsQA/button_Edit_parametre',[('row'):row+1]))
				
				break Loop
			}
		}
		if(ligneTrouve) {
			println("ligneTrouve trouvé:")
		}
		break
		
	case 'S':
		//String table = WebUI.getText(findTestObject('Object Repository/toolsqa/elements/webTables/Page_ToolsQA/TXT_tables'))
		WebElement Table = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/toolsqa/elements/webTables/Page_ToolsQA/TXT_tables'), 30);
		//To locate rows of table it will Capture all the rows available in the table'
		List<WebElement> rows_table = Table.findElements(By.xpath('//div[@class="rt-tbody"]/div/div[@role="row"]'))
		//To calculate no of rows In table'
		int rows_count = rows_table.size()
		 
		//Loop will execute for all the rows of the table'
		boolean ligneTrouve=false
		Loop:
		for (int row = 0; row < rows_count; row++) {
			//To locate columns(cells) of that specific row'
			//translate(normalize-space(//div[@role="row"], ' ', '')
			List<WebElement> Columns_row = rows_table.get(row).findElements(By.tagName('div'))
			 
			//To calculate no of columns(cells) In that specific row'
			int columns_count = Columns_row.size()
			 
			println((('Number of cells In Row ' + row) + ' are ') + columns_count)
			 
			int nbColonneTrouve=0
			//Loop will execute till the last cell of that specific row'
			for (int column = 0; column < columns_count; column++) {
				//It will retrieve text from each cell'
				String celltext = Columns_row.get(column).getText()
				println((((('Cell Value Of row number ' + row) + ' and column number ') + column) + ' Is ') + celltext)
				//Checking if Cell text is matching with the expected value'
				if(FirstName.contains("|")) {
					println("FirstName.split:"+FirstName.split("\\|")[0])
					if (celltext == FirstName.split("\\|")[0]) {
						nbColonneTrouve=nbColonneTrouve+1
					}
				} else {
					if (celltext == FirstName) {
						nbColonneTrouve=nbColonneTrouve+1
					}
				}
				if(LastName.contains("|")) {
					if (celltext == LastName.split("\\|")[0]) {
						nbColonneTrouve=nbColonneTrouve+1
					}
				} else {
					if (celltext == LastName) {
						nbColonneTrouve=nbColonneTrouve+1
					}
				}
				if(Age.contains("|")) {
					if (celltext == Age.split("\\|")[0]) {
						nbColonneTrouve=nbColonneTrouve+1
					}
				} else {
					if (celltext == Age) {
						nbColonneTrouve=nbColonneTrouve+1
					}
				}
				if(Email.contains("|")) {
					if (celltext == Email.split("\\|")[0]) {
						nbColonneTrouve=nbColonneTrouve+1
					}
				} else {
					if (celltext == Email) {
						nbColonneTrouve=nbColonneTrouve+1
					}
				}

				if(Salary.contains("|")) {
					if (celltext == Salary.split("\\|")[0]) {
						nbColonneTrouve=nbColonneTrouve+1
					}
				} else {
					if (celltext == Salary) {
						nbColonneTrouve=nbColonneTrouve+1
					}
				}
				if(Department.contains("|")) {
					if (celltext == Department.split("\\|")[0]) {
						nbColonneTrouve=nbColonneTrouve+1
					}
				} else {
					if (celltext == Department) {
						nbColonneTrouve=nbColonneTrouve+1
					}
				}

			}
			if(nbColonneTrouve==6) {
				ligneTrouve=true
				
				WebUI.click(findTestObject('Object Repository/toolsqa/elements/webTables/Page_ToolsQA/button_Delete_parametre',[('row'):row+1]))
				println("*****************delete ok*******************")
				WebUI.delay(3)
				break Loop
			}
		}

		break
		
		
	case 'A':
		//click button add
		WebUI.click(findTestObject('Object Repository/toolsqa/elements/webTables/Page_ToolsQA/button_Add'))
		WebUI.setText(findTestObject('Object Repository/toolsqa/elements/webTables/Page_ToolsQA/input_First Name_firstName'),FirstName )
		WebUI.setText(findTestObject('Object Repository/toolsqa/elements/webTables/Page_ToolsQA/input_Last Name_lastName'),LastName )
		WebUI.setText(findTestObject('Object Repository/toolsqa/elements/webTables/Page_ToolsQA/input_Email_userEmail'),Email )
		
		WebUI.setText(findTestObject('Object Repository/toolsqa/elements/webTables/Page_ToolsQA/input_Age_age'),Age )
		WebUI.setText(findTestObject('Object Repository/toolsqa/elements/webTables/Page_ToolsQA/input_Salary_salary'),Salary )
		WebUI.setText(findTestObject('Object Repository/toolsqa/elements/webTables/Page_ToolsQA/input_Department_department'),Department )
		
		WebUI.click(findTestObject('Object Repository/toolsqa/elements/webTables/Page_ToolsQA/button_Submit'))
		WebUI.delay(3)
		
		break
    default:
        break
}

WebUI.closeBrowser()

