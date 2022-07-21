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

Mobile.tap(findTestObject('Dashboard/android.widget.ImageButton - Menu'), 0)

Mobile.tap(findTestObject('Object Repository/Dashboard/android.widget.CheckedTextView - Make a Payment'), 0)

Mobile.tap(findTestObject('Object Repository/Payment/android.widget.ImageButton - Add New Payee'), 0)

Mobile.setText(findTestObject('Object Repository/Payment/android.widget.EditText - Payee Name'), 'Event Organizer', 0)

Mobile.tap(findTestObject('Object Repository/Payment/android.widget.Button - ADD PAYEE'), 0)

Mobile.tap(findTestObject('Payment/android.widget.ImageButton - Add New Payee'), 0)

Mobile.setText(findTestObject('Payment/android.widget.EditText - Payee Name'), 'Catering', 0)

Mobile.tap(findTestObject('Payment/android.widget.Button - ADD PAYEE'), 0)

Mobile.tap(findTestObject('Object Repository/Payment/android.widget.Spinner Account to Pay From'), 0)

Mobile.tap(findTestObject('Transfer/android.widget.CheckedTextView - Marriage (100000000.00)'), 0)

Mobile.setText(findTestObject('Object Repository/Payment/android.widget.EditText - Amount'), '20000000', 0)

Mobile.tap(findTestObject('Object Repository/Payment/android.widget.Button - Make Payment'), 0)

Mobile.tap(findTestObject('Object Repository/Payment/android.widget.Spinner Payee'), 0)

Mobile.tap(findTestObject('Object Repository/Payment/android.widget.CheckedTextView - Event Organizer (P1)'), 0)

Mobile.setText(findTestObject('Payment/android.widget.EditText - Amount'), '50000000', 0)

Mobile.tap(findTestObject('Payment/android.widget.Button - Make Payment'), 0)

