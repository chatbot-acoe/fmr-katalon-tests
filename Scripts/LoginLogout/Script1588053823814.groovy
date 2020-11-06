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

WebUI.openBrowser('http://poc-docker.eastus.cloudapp.azure.com:8076/#/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Page_FindMyRoom/a_Login'))

WebUI.click(findTestObject('Object Repository/Page_FindMyRoom/label_E-mail'))

WebUI.setText(findTestObject('Object Repository/Page_FindMyRoom/input_Login_loginformEmail'), 'admin@fmr.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_FindMyRoom/input_E-mail_loginformPassword'), '8ONjX3ggx5RmoBbvnoZOyw==')

WebUI.click(findTestObject('Object Repository/Page_FindMyRoom/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Page_FindMyRoom/a_Hi admin'))

WebUI.click(findTestObject('Object Repository/Page_FindMyRoom/a_Logout'))

WebUI.closeBrowser()

