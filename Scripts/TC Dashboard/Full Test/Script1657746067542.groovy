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

Mobile.tap(findTestObject('Login/android.widget.Button - LOGIN'), 0)

Mobile.tap(findTestObject('Accounts/android.widget.ImageButton - Add Account'), 0)

Mobile.setText(findTestObject('Object Repository/Accounts/android.widget.EditText - Account Name'), 'Saving', 0)

Mobile.setText(findTestObject('Object Repository/Accounts/android.widget.EditText - Initial Balance (Optional)'), '100000000', 
    0)

Mobile.tap(findTestObject('null'), 0)

Mobile.tap(findTestObject('Accounts/android.widget.ImageButton - Add Account'), 0)

Mobile.setText(findTestObject('Accounts/android.widget.EditText - Account Name'), 'Property', 0)

Mobile.setText(findTestObject('Accounts/android.widget.EditText - Initial Balance (Optional)'), '5000000000', 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.tap(findTestObject('Accounts/android.widget.ImageButton - Add Account'), 0)

Mobile.setText(findTestObject('Accounts/android.widget.EditText - Account Name'), 'Marriage', 0)

Mobile.setText(findTestObject('Accounts/android.widget.EditText - Initial Balance (Optional)'), '100000000', 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.tap(findTestObject('Object Repository/Dashboard/android.widget.ImageButton - Menu'), 0)

Mobile.tap(findTestObject('Object Repository/Dashboard/android.widget.CheckedTextView - Make a Deposit'), 0)

Mobile.setText(findTestObject('Object Repository/Deposit/android.widget.EditText - Enter Deposit Amount ()'), '150000000', 
    0)

Mobile.tap(findTestObject('Object Repository/Deposit/android.widget.Button - DEPOSIT'), 0)

Mobile.tap(findTestObject('Dashboard/android.widget.ImageButton - Menu'), 0)

Mobile.tap(findTestObject('Dashboard/android.widget.CheckedTextView - Make a Deposit'), 0)

Mobile.tap(findTestObject('Object Repository/Deposit/android.widget.Spinner Deposit'), 0)

Mobile.tap(findTestObject('Object Repository/Deposit/android.widget.CheckedTextView - Property (5000000000.00)'), 0)

Mobile.setText(findTestObject('Deposit/android.widget.EditText - Enter Deposit Amount ()'), '200000000', 0)

Mobile.tap(findTestObject('Deposit/android.widget.Button - DEPOSIT'), 0)

Mobile.tap(findTestObject('Dashboard/android.widget.ImageButton - Menu'), 0)

Mobile.tap(findTestObject('Object Repository/Dashboard/android.widget.CheckedTextView - Make a Transfer'), 0)

Mobile.tap(findTestObject('Object Repository/Transfer/android.widget.Spinner Sending'), 0)

Mobile.tap(findTestObject('Object Repository/Transfer/android.widget.CheckedTextView - Property (5200000000.00)'), 0)

Mobile.setText(findTestObject('Object Repository/Transfer/android.widget.EditText - Transfer Amount'), '10000000', 0)

Mobile.tap(findTestObject('Object Repository/Transfer/android.widget.Spinner Receiving'), 0)

Mobile.tap(findTestObject('Object Repository/Transfer/android.widget.CheckedTextView - Marriage (100000000.00)'), 0)

Mobile.tap(findTestObject('Object Repository/Transfer/android.widget.Button - Confirm Transfer'), 0)

Mobile.tap(findTestObject('Dashboard/android.widget.ImageButton - Menu'), 0)

Mobile.tap(findTestObject('Object Repository/Dashboard/android.widget.CheckedTextView - Make a Payment'), 0)

Mobile.tap(findTestObject('Object Repository/Payment/android.widget.ImageButton - Add New Payee'), 0)

Mobile.setText(findTestObject('Object Repository/Payment/android.widget.EditText - Payee Name'), 'Event Organizer', 0)

Mobile.tap(findTestObject('Object Repository/Payment/android.widget.Button - ADD PAYEE'), 0)

Mobile.tap(findTestObject('Payment/android.widget.ImageButton - Add New Payee'), 0)

Mobile.setText(findTestObject('Payment/android.widget.EditText - Payee Name'), 'Catering', 0)

Mobile.tap(findTestObject('Payment/android.widget.Button - ADD PAYEE'), 0)

Mobile.tap(findTestObject('Object Repository/Payment/android.widget.Spinner Account to Pay From'), 0)

Mobile.tap(findTestObject('Object Repository/Payment/android.widget.CheckedTextView - Marriage (100000000.00)'), 0)

Mobile.setText(findTestObject('Object Repository/Payment/android.widget.EditText - Amount'), '20000000', 0)

Mobile.tap(findTestObject('Object Repository/Payment/android.widget.Button - Make Payment'), 0)

Mobile.tap(findTestObject('Object Repository/Payment/android.widget.Spinner Payee'), 0)

Mobile.tap(findTestObject('Object Repository/Payment/android.widget.CheckedTextView - Event Organizer (P1)'), 0)

Mobile.setText(findTestObject('Payment/android.widget.EditText - Amount'), '50000000', 0)

Mobile.tap(findTestObject('Payment/android.widget.Button - Make Payment'), 0)

Mobile.tap(findTestObject('Dashboard/android.widget.ImageButton - Menu'), 0)

Mobile.tap(findTestObject('Object Repository/Dashboard/android.widget.CheckedTextView - Dashboard'), 0)

Mobile.tap(findTestObject('Object Repository/Dashboard/android.widget.TextView - Welcome to Bank App'), 0)

Mobile.tap(findTestObject('Dashboard/android.widget.ImageButton - Menu'), 0)

Mobile.tap(findTestObject('Object Repository/Dashboard/android.widget.CheckedTextView - Logout'), 0)

Mobile.closeApplication()

