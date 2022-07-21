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

Mobile.startApplication('C:\\Users\\095054\\Documents\\Katalon Final Projects\\FinalProjectMobile_AhmadZainAzharulFalah_KSAT006ONL004\\FinalProjectMobile\\APK\\app-debug.apk', 
    true)

Mobile.tap(findTestObject('Object Repository/Dashboard/android.widget.TextView - Help'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Login/android.widget.Button - CREATE A PROFILE'), 0)

Mobile.setText(findTestObject('Object Repository/Register/android.widget.EditText - First Name'), 'Zain', 0)

Mobile.setText(findTestObject('Object Repository/Register/android.widget.EditText - Last Name'), 'Zain', 0)

Mobile.setText(findTestObject('Object Repository/Register/android.widget.EditText - Country'), 'Indonesia', 0)

Mobile.setText(findTestObject('Object Repository/Register/android.widget.EditText - Reg Username'), 'zainzain', 0)

Mobile.setText(findTestObject('Object Repository/Register/android.widget.EditText - Reg Password'), 'qweqwe', 0)

Mobile.setText(findTestObject('Object Repository/Register/android.widget.EditText - Confirm Password'), 'qweqwe', 0)

Mobile.tap(findTestObject('Object Repository/Register/android.widget.Button - Create Profile'), 0)