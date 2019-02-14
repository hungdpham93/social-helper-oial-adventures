import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('http://www.growviews.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_GrowViews  Grow youtube views/span_Login'))

WebUI.setText(findTestObject('Object Repository/Page_Growviews Dashboard/input_growviews_ember444-field'), 'the.backpackers.2019@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Growviews Dashboard/input_growviews_ember504-field'), 'RigbBhfdqODKcAsiUrg+1Q==')

WebUI.click(findTestObject('Object Repository/Page_Growviews Dashboard/button_Sign in'))

while(true) {
	WebUI.delay(2)
	WebUI.click(findTestObject('Object Repository/Page_Growviews Dashboard/button_RUN THE PLAYER'))
	int delay = WebUI.getAttribute(findTestObject('Object Repository/Page_Growviews Dashboard/label_seconds'), "innerHTML").find( /\d+/ ).toInteger()
	WebUI.comment('Delay for ' + delay + ' seconds')
	WebUI.delay(delay)
	WebUI.closeWindowIndex(1)
	WebUI.switchToDefaultContent()
}
