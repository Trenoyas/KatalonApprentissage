import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.By as By
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.support.ui.ExpectedConditions as ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait as WebDriverWait
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.WebDriver as WebDriver

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.toolsqa_urlForms_practiceForm)

WebUI.setText(findTestObject('toolsqa/forms/Page_ToolsQA/input_Name_firstName'), fn)

WebUI.setText(findTestObject('toolsqa/forms/Page_ToolsQA/input_Name_lastName'), ln)

WebUI.setText(findTestObject('toolsqa/forms/Page_ToolsQA/input_Email_userEmail'), email)

WebUI.click(findTestObject('toolsqa/forms/Page_ToolsQA/div_MaleFemaleOther_parametre', [('choix') : gender]))

WebUI.setText(findTestObject('toolsqa/forms/Page_ToolsQA/input_(10 Digits)_userNumber'), mobile)

WebElement element = WebUiCommonHelper.findWebElement(findTestObject('toolsqa/forms/Page_ToolsQA/input_Date of Birth_dateOfBirthInput'), 
    5)

element.sendKeys(Keys.chord(Keys.CONTROL, 'a'))

//element.clear()
element.sendKeys('02/03/1974')

element.sendKeys(Keys.chord(Keys.ENTER))

if (hb.contains('|')) {
    for (String myHb : hb.split('\\|')) {
        WebUI.check(findTestObject('toolsqa/forms/Page_ToolsQA/div_checkBox_SportsReadingMusic_parametre', [('choix') : myHb]))
    }
} else {
    WebUI.check(findTestObject('toolsqa/forms/Page_ToolsQA/div_checkBox_SportsReadingMusic_parametre', [('choix') : hb]))
}

WebUI.uploadFile(findTestObject('toolsqa/forms/Page_ToolsQA/input_Select picture_uploadPicture'), pj)

WebUI.setText(findTestObject('toolsqa/forms/Page_ToolsQA/textarea_Current Address_currentAddress'), cAddress)

WebUI.setText(findTestObject('toolsqa/forms/Page_ToolsQA/div_Select_state'), state)

WebUI.sendKeys(findTestObject('toolsqa/forms/Page_ToolsQA/div_Select_state'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('toolsqa/forms/Page_ToolsQA/div_Select City'), city)

WebUI.sendKeys(findTestObject('toolsqa/forms/Page_ToolsQA/div_Select City'), Keys.chord(Keys.ENTER))

if(WebUI.verifyElementClickable(findTestObject('Object Repository/toolsqa/forms/Page_ToolsQA/BTN_Submit'), FailureHandling.OPTIONAL)) {
	println('nc')
	this.clickUsingJS(findTestObject('Object Repository/toolsqa/forms/Page_ToolsQA/button_Submit'),10)
	
}

//WebUI.click(findTestObject('Object Repository/toolsqa/forms/Page_ToolsQA/BTN_Submit'))


println('xx') //@Keyword
//		JavascriptExecutor executor = ((JavascriptExecutor)driver);
//		executor.executeScript("arguments[0].click();", SelectCalender);
// Set your expected date, month and year.
//executor.executeScript("arguments[0].click();", datePicker_Heading1);
// If current selected month and year are same as expected month
// and year then go Inside this condition.
// Select the date from date picker when condition
// match.
//					else{
//
//						throw new Exception()
//					}
// Click on next button of date picker.
// If current selected month and year are greater than expected
// month and year then go Inside this condition.
// Click on previous button of date picker.

def clickUsingJS(TestObject to, int timeout) {
	WebDriver driver = DriverFactory.getWebDriver()
	WebElement element = WebUiCommonHelper.findWebElement(to, timeout)
	JavascriptExecutor executor = ((driver) as JavascriptExecutor)
	executor.executeScript('arguments[0].click()', element)
}


static void handleDatepicker(TestObject calender, String exp_Date, String exp_Month, String exp_Year) throws Exception {
    String expDate = null

    String calYear = null

    String datepickerText = null

    String minYear = null

    String maxYear = null

    int expMonth = 0

    int expYear = 0

    WebElement datePicker

    List<WebElement> noOfDays = null

    List<WebElement> noOfMonths = null

    List<WebElement> noOfYears = null

    boolean dateNotFound = true

    List<WebElement> monthList = Arrays.asList('None', 'Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 
        'Nov', 'Dec')

    def driver = DriverFactory.getWebDriver()

    WebElement SelectCalender = WebUiCommonHelper.findWebElement(calender, 20)

    SelectCalender.click()

    expDate = Integer.parseInt(exp_Date)

    expMonth = Integer.parseInt(exp_Month)

    expYear = Integer.parseInt(exp_Year)

    WebElement datePicker_Heading1 = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/toolsqa/forms/Page_ToolsQA/input_Date of Birth_dateOfBirthInput'), 
        30)

    WebDriverWait wait = new WebDriverWait(driver, 10)

    wait.until(ExpectedConditions.elementToBeClickable(datePicker_Heading1))

    datePicker_Heading1.click()

    WebElement datePicker_Heading2 = driver.findElement(By.xpath('//div[@class=\'datepicker-months\']/table/thead/tr[1]/th[2]'))

    wait.until(ExpectedConditions.elementToBeClickable(datePicker_Heading2))

    datePicker_Heading2.click()

    while (dateNotFound) {
        WebElement datePicker_Heading3 = driver.findElement(By.xpath('//div[@class=\'datepicker-years\']/table/thead/tr[1]/th[2]'))

        wait.until(ExpectedConditions.visibilityOf(datePicker_Heading3))

        datepickerText = datePicker_Heading3.getText()

        String[] datepickerYear = datepickerText.split('-')

        minYear = (datepickerYear[0])

        maxYear = (datepickerYear[1])

        if ((expYear >= Integer.parseInt(minYear)) && (expYear <= Integer.parseInt(maxYear))) {
            datePicker = driver.findElement(By.xpath('//div[@class=\'datepicker-years\']/table'))

            noOfYears = datePicker.findElements(By.xpath('//span[contains(@class,\'year\')]'))

            firstloop: for (WebElement year : noOfYears) {
                if (year.getText().equalsIgnoreCase(((exp_Year) as String))) {
                    year.click()

                    Thread.sleep(1500)

                    datePicker = driver.findElement(By.xpath('//div[@class=\'datepicker-months\']/table'))

                    noOfMonths = datePicker.findElements(By.xpath('//span[@class=\'month\']'))

                    Thread.sleep(1000)

                    for (WebElement month : noOfMonths) {
                        System.out.println(' the expected month in int  is : ' + expMonth)

                        System.out.println(' the expected month is : ' + monthList.get(expMonth))

                        System.out.println(' the Actual  month is : ' + month.getText())

                        if (monthList.get(expMonth).equalsIgnoreCase(month.getText())) {
                            month.click()

                            datePicker = driver.findElement(By.xpath('//div[@class=\'datepicker-days\']/table'))

                            noOfDays = datePicker.findElements(By.xpath('//td[@class=\'day\']'))

                            Thread.sleep(1500)

                            for (WebElement cell : noOfDays) {
                                if (cell.getText().equalsIgnoreCase(expDate)) {
                                    cell.click()

                                    firstloop: break
                                }
                            }
                        }
                    }
                }
            }
            
            dateNotFound = false
        } else if (expYear > Integer.parseInt(maxYear)) {
            WebElement Next = driver.findElement(By.xpath('//div[@class=\'datepicker-years\']/table/thead/tr[1]/th[@class=\'next\']'))

            if (Next.getAttribute('style').equalsIgnoreCase('visibility: visible;')) {
                Next.click()
            } else {
                throw new Exception('This is exception')
            }
        } else if (expYear < Integer.parseInt(minYear)) {
            WebElement Previous = driver.findElement(By.xpath('//div[@class=\'datepicker-years\']/table/thead/tr[1]/th[@class=\'prev\']'))

            if (Previous.getAttribute('style').equalsIgnoreCase('visibility: visible;')) {
                Previous.click()
            } else {
                throw new Exception('This is exception')
            }
        }
    }
}

