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
import java.io.File as File

WebUI.openBrowser('')

WebUI.navigateToUrl('https://sahayya.qa.web-devapp.com/dashboard')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/QDE NEW/Page_Sahayya Finserve Application/input_Email ID_email'))

WebUI.click(findTestObject('Object Repository/QDE NEW/Page_Sahayya Finserve Application/div_LoginIf you have a sahayya.com email ID_ffcd61'))

WebUI.setText(findTestObject('Object Repository/QDE NEW/Page_Sahayya Finserve Application/input_Email ID_email'), 'customeradmin@kaiju-node.com')

WebUI.scrollToElement(findTestObject('QDE NEW/Page_Sahayya Finserve Application/input_Password_password'), 0)

WebUI.click(findTestObject('QDE NEW/Page_Sahayya Finserve Application/input_Password_password'))

WebUI.setEncryptedText(findTestObject('Object Repository/QDE NEW/Page_Sahayya Finserve Application/input_Password_password'), 
    'OEaEFVu0yk4CHV13BAEStw==')

WebUI.click(findTestObject('QDE NEW/Page_Sahayya Finserve Application/span_Log in'))

WebUI.enableSmartWait()

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/QDE NEW/Page_Sahayya Finserve Application/img_System Date 15 - May - 2023_cursor-pointer'))

WebUI.enableSmartWait()

WebUI.click(findTestObject('QDE NEW/Page_Sahayya Finserve Application/label_Loan Data'))

WebUI.enableSmartWait()

WebUI.click(findTestObject('Object Repository/QDE NEW/Page_Sahayya Finserve Application/img'))

WebUI.click(findTestObject('Object Repository/QDE NEW/Page_Sahayya Finserve Application/img_Loan Request Details_w-3.5 h-3.5 text-blue-500'))

WebUI.setText(findTestObject('Object Repository/QDE NEW/Page_Sahayya Finserve Application/input_Product_product'), 'h')

WebUI.click(findTestObject('Object Repository/QDE NEW/Page_Sahayya Finserve Application/label_HL - Floating'))

WebUI.setText(findTestObject('Object Repository/QDE NEW/Page_Sahayya Finserve Application/input_Loan Amount()_loanAmount'), 
    '5,00,000')

WebUI.setText(findTestObject('Object Repository/QDE NEW/Page_Sahayya Finserve Application/input_Loan Tenure (Months)_loanTenure'), 
    '25')

WebUI.setText(findTestObject('Object Repository/QDE NEW/Page_Sahayya Finserve Application/input_Branch_branch'), 'ma')

WebUI.click(findTestObject('Object Repository/QDE NEW/Page_Sahayya Finserve Application/label_Malleshwaram'))

WebUI.setText(findTestObject('Object Repository/QDE NEW/Page_Sahayya Finserve Application/input_Sales Agent_salesAgent'), 
    'Alam')

WebUI.click(findTestObject('QDE NEW/Page_Sahayya Finserve Application/label_Test'))

WebUI.click(findTestObject('QDE NEW/Page_Sahayya Finserve Application/img_Loan Request Details_w-3.5 h-3.5'))

WebUI.scrollToElement(findTestObject('QDE NEW/Page_Sahayya Finserve Application/Page_Sahayya Finserve Application/Page_Sahayya Finserve Application/QDE KYC Doc'), 
    0)

WebUI.click(findTestObject('QDE NEW/Page_Sahayya Finserve Application/Page_Sahayya Finserve Application/Page_Sahayya Finserve Application/QDE KYC Doc'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('QDE NEW/Page_Sahayya Finserve Application/span_Select Document Type'))

WebUI.click(findTestObject('QDE NEW/Page_Sahayya Finserve Application/li_PAN'))

WebUI.enableSmartWait()

WebUI.scrollToElement(findTestObject('QDE Dec 19th/Page_Sahayya Finserve Application/img'), 0)

WebUI.enableSmartWait()

WebUI.sendKeys(findTestObject('QDE Dec 19th/Page_Sahayya Finserve Application/img'), 'C:\\\\Users\\\\LENOVO\\\\Desktop\\\\ss\\\\NewPan.png')

WebUI.enableSmartWait()

WebUI.scrollToElement(findTestObject('QDE NEW/Page_Sahayya Finserve Application/Page_Sahayya Finserve Application/img SAVE'), 
    0)

WebUI.waitForElementClickable(findTestObject('QDE NEW/Page_Sahayya Finserve Application/Page_Sahayya Finserve Application/img SAVE'), 
    3)

WebUI.click(findTestObject('QDE NEW/Page_Sahayya Finserve Application/Page_Sahayya Finserve Application/img SAVE'))

WebUI.enableSmartWait()

WebUI.waitForElementPresent(findTestObject('QDE NEW/Page_Sahayya Finserve Application/Page_Sahayya Finserve Application/img_Attach Documents (PDF, JPG, JPEG or PNG)_w-full h-full rounded-xl object-fill'), 
    0)

WebUI.setText(findTestObject('Object Repository/QDE NEW/Page_Sahayya Finserve Application/Page_Sahayya Finserve Application/input__panNo'), 
    'FCOPM2120J')

WebUI.click(findTestObject('Object Repository/QDE NEW/Page_Sahayya Finserve Application/Page_Sahayya Finserve Application/img_KYC Documents_w-3.5 h-3.5'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/QDE NEW/Page_Sahayya Finserve Application/Page_Sahayya Finserve Application/img_Name  Contact_w-3.5 h-3.5 text-blue-500'))

WebUI.click(findTestObject('Object Repository/QDE NEW/Page_Sahayya Finserve Application/Page_Sahayya Finserve Application/span_empty_p-dropdown-trigger-icon p-clicka_bedf43'))

WebUI.click(findTestObject('Object Repository/QDE NEW/Page_Sahayya Finserve Application/Page_Sahayya Finserve Application/li_Mr'))

WebUI.click(findTestObject('Object Repository/QDE NEW/Page_Sahayya Finserve Application/Page_Sahayya Finserve Application/span_empty_p-dropdown-trigger-icon p-clicka_bedf43_1'))

WebUI.click(findTestObject('Object Repository/QDE NEW/Page_Sahayya Finserve Application/Page_Sahayya Finserve Application/li_Male'))

WebUI.setText(findTestObject('Object Repository/QDE NEW/Page_Sahayya Finserve Application/Page_Sahayya Finserve Application/input_First Name_firstName'), 
    'Niyaz')

WebUI.setText(findTestObject('Object Repository/QDE NEW/Page_Sahayya Finserve Application/Page_Sahayya Finserve Application/input_Last Name_lastName'), 
    'Mulla')

//WebUI.click(findTestObject('Object Repository/QDE NEW/Page_Sahayya Finserve Application/Page_Sahayya Finserve Application/span_DOB_p-button-icon p-c pi pi-calendar'))
//WebUI.click(findTestObject('Object Repository/QDE NEW/Page_Sahayya Finserve Application/Page_Sahayya Finserve Application/button_2024'))
//WebUI.click(findTestObject('Object Repository/QDE NEW/Page_Sahayya Finserve Application/Page_Sahayya Finserve Application/span_1993'))
//WebUI.click(findTestObject('Object Repository/QDE NEW/Page_Sahayya Finserve Application/Page_Sahayya Finserve Application/span_Sep'))
//WebUI.click(findTestObject('Object Repository/QDE NEW/Page_Sahayya Finserve Application/Page_Sahayya Finserve Application/span_17'))
WebUI.sendKeys(findTestObject('QDE NEW/Page_Sahayya Finserve Application/Page_Sahayya Finserve Application/img'), 'C:\\\\Users\\\\LENOVO\\\\Desktop\\\\ss\\\\Profile Pic.png')

WebUI.click(findTestObject('QDE NEW/Page_Sahayya Finserve Application/Page_Sahayya Finserve Application/img SAVE'))

WebUI.click(findTestObject('QDE NEW/Page_Sahayya Finserve Application/Page_Sahayya Finserve Application/Page_Sahayya Finserve Application/input_DOB_dateOfBirth'))

WebUI.setText(findTestObject('QDE NEW/Page_Sahayya Finserve Application/Page_Sahayya Finserve Application/Page_Sahayya Finserve Application/input_DOB_dateOfBirth'), 
    '21-May-1992')

WebUI.click(findTestObject('Object Repository/QDE NEW/Page_Sahayya Finserve Application/Page_Sahayya Finserve Application/span_Edit Mobile No'))

WebUI.setText(findTestObject('Object Repository/QDE NEW/Page_Sahayya Finserve Application/Page_Sahayya Finserve Application/input_Mobile Number_mobileNo'), 
    '7899272573')

WebUI.click(findTestObject('QDE NEW/Page_Sahayya Finserve Application/Page_Sahayya Finserve Application/span_empty_p-dropdown-trigger-icon p-clicka_bedf43_1_2'))

WebUI.click(findTestObject('QDE NEW/Page_Sahayya Finserve Application/Page_Sahayya Finserve Application/li_PAN'))

WebUI.enableSmartWait()

WebUI.scrollToElement(findTestObject('QDE NEW/Page_Sahayya Finserve Application/Page_Sahayya Finserve Application/button_Attach Documents'), 
    0)

WebUI.enableSmartWait()

WebUI.sendKeys(findTestObject('QDE NEW/Page_Sahayya Finserve Application/Page_Sahayya Finserve Application/button_Attach Documents'), 
    'C:\\\\Users\\\\LENOVO\\\\Desktop\\\\ss\\\\NewPan.png')

WebUI.enableSmartWait()

WebUI.click(findTestObject('QDE NEW/Page_Sahayya Finserve Application/Page_Sahayya Finserve Application/img SAVE'))

WebUI.enableSmartWait()

WebUI.scrollToElement(findTestObject('QDE/Page_Sahayya Finserve Application/Page_Sahayya Finserve Application/Page_Sahayya Finserve Application/DOB PAN'), 
    0)

WebUI.setText(findTestObject('QDE/Page_Sahayya Finserve Application/Page_Sahayya Finserve Application/Page_Sahayya Finserve Application/DOB PAN'), 
    'FCOPM2120J')

WebUI.scrollToElement(findTestObject('QDE NEW/Page_Sahayya Finserve Application/Page_Sahayya Finserve Application/Page_Sahayya Finserve Application/SAVE basic info'), 
    0)

WebUI.click(findTestObject('QDE NEW/Page_Sahayya Finserve Application/Page_Sahayya Finserve Application/Page_Sahayya Finserve Application/SAVE basic info'))

WebUI.click(findTestObject('QDE NEW/Page_Sahayya Finserve Application/Page_Sahayya Finserve Application/Page_Sahayya Finserve Application/Page_Sahayya Finserve Application/img_Address_w-3.5 h-3.5 text-blue-500'))

WebUI.setText(findTestObject('QDE NEW/Page_Sahayya Finserve Application/Page_Sahayya Finserve Application/Page_Sahayya Finserve Application/Page_Sahayya Finserve Application/textarea_Address_address'), 
    'S/O Abdul Mazid H No 141/16 Ward No 3')

WebUI.click(findTestObject('QDE NEW/Page_Sahayya Finserve Application/Page_Sahayya Finserve Application/input_Pincode_pincode'))

WebUI.setText(findTestObject('QDE NEW/Page_Sahayya Finserve Application/Page_Sahayya Finserve Application/input_Pincode_pincode'), 
    '560025')

WebUI.click(findTestObject('QDE NEW/Page_Sahayya Finserve Application/Page_Sahayya Finserve Application/label_560025'))

WebUI.click(findTestObject('QDE NEW/Page_Sahayya Finserve Application/Page_Sahayya Finserve Application/input_City_city'))

WebUI.setText(findTestObject('QDE NEW/Page_Sahayya Finserve Application/Page_Sahayya Finserve Application/input_City_city'), 
    'Khanapur')

WebUI.click(findTestObject('QDE NEW/Page_Sahayya Finserve Application/Page_Sahayya Finserve Application/label_Asifabad, Adilabad'))

WebUI.click(findTestObject('QDE NEW/Page_Sahayya Finserve Application/Page_Sahayya Finserve Application/div_empty'))

WebUI.click(findTestObject('QDE NEW/Page_Sahayya Finserve Application/li_Self-Owned'))

WebUI.click(findTestObject('QDE NEW/Page_Sahayya Finserve Application/Page_Sahayya Finserve Application/Page_Sahayya Finserve Application/Page_Sahayya Finserve Application/span_Mark Using Map'))

WebUI.setText(findTestObject('QDE NEW/Page_Sahayya Finserve Application/Page_Sahayya Finserve Application/Page_Sahayya Finserve Application/Page_Sahayya Finserve Application/Map enter location'), 
    'Viamagus')

WebUI.click(findTestObject('QDE NEW/Page_Sahayya Finserve Application/Page_Sahayya Finserve Application/div_Viamagus Technologies'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('QDE NEW/Page_Sahayya Finserve Application/Page_Sahayya Finserve Application/Map SAVE'))

WebUI.scrollToElement(findTestObject('QDE NEW/Page_Sahayya Finserve Application/Page_Sahayya Finserve Application/Addressproof dropdown'), 
    0)

WebUI.click(findTestObject('QDE NEW/Page_Sahayya Finserve Application/Page_Sahayya Finserve Application/Addressproof dropdown'))

WebUI.click(findTestObject('QDE/Page_Sahayya Finserve Application/li_Ration Card'))

WebUI.sendKeys(findTestObject('QDE NEW/Page_Sahayya Finserve Application/Page_Sahayya Finserve Application/button_Attach Documents'), 
    'C:\\\\Users\\\\LENOVO\\\\Desktop\\\\ss\\\\NewPan.png')

WebUI.enableSmartWait()

WebUI.click(findTestObject('QDE NEW/Page_Sahayya Finserve Application/Page_Sahayya Finserve Application/Address Proof Upload SAVE'))

WebUI.enableSmartWait()

WebUI.scrollToElement(findTestObject('QDE NEW/Page_Sahayya Finserve Application/Page_Sahayya Finserve Application/Page_Sahayya Finserve Application/Page_Sahayya Finserve Application/SAVE address'), 
    0)

WebUI.click(findTestObject('QDE NEW/Page_Sahayya Finserve Application/Page_Sahayya Finserve Application/Page_Sahayya Finserve Application/Page_Sahayya Finserve Application/SAVE address'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('QDE NEW/Page_Sahayya Finserve Application/Page_Sahayya Finserve Application/QDE Final SAVE'))

