// DO NOT EDIT: This file is automatically generated.
//
// Only the associated template file should be edited directly.
// Helper class files are automatically regenerated from the template
// files at various times, including record actions and test object
// insertion actions.  Any changes made directly to a helper class
// file will be lost when automatically updated.

package resources.EBC_MK2;
import Utilities.AA_SuperHelper;
import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.object.interfaces.SAP.*;
import com.rational.test.ft.object.interfaces.WPF.*;
import com.rational.test.ft.object.interfaces.siebel.*;
import com.rational.test.ft.object.interfaces.flex.*;
import com.rational.test.ft.object.interfaces.dojo.*;
import com.rational.test.ft.object.interfaces.generichtmlsubdomain.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.vp.IFtVerificationPoint;
import com.ibm.rational.test.ft.object.interfaces.sapwebportal.*;
/**
 * Script Name   : <b>Personal_Details</b><br>
 * Generated     : <b>2015/01/12 10:09:40</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows 7 x86 6.1 <br>
 * 
 * @since  January 12, 2015
 * @author horned
 */
public abstract class Personal_DetailsHelper extends Utilities.AA_SuperHelper
{
	/**
	 * email: with default state.
	 *		.id : email
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : email
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected TextGuiTestObject _email() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("_email"));
	}
	/**
	 * email: with specific test context and state.
	 *		.id : email
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : email
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected TextGuiTestObject _email(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("_email"), anchor, flags);
	}
	
	/**
	 * county: with default state.
	 *		.id : {{config.prefix}}County
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : county
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected TextGuiTestObject address_county() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("address_county"));
	}
	/**
	 * county: with specific test context and state.
	 *		.id : {{config.prefix}}County
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : county
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected TextGuiTestObject address_county(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("address_county"), anchor, flags);
	}
	
	/**
	 * lineOne: with default state.
	 *		.id : {{config.prefix}}LineOne
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : lineOne
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected TextGuiTestObject address_lineOne() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("address_lineOne"));
	}
	/**
	 * lineOne: with specific test context and state.
	 *		.id : {{config.prefix}}LineOne
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : lineOne
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected TextGuiTestObject address_lineOne(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("address_lineOne"), anchor, flags);
	}
	
	/**
	 * lineTwo: with default state.
	 *		.id : {{config.prefix}}LineTwo
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : lineTwo
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected TextGuiTestObject address_lineTwo() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("address_lineTwo"));
	}
	/**
	 * lineTwo: with specific test context and state.
	 *		.id : {{config.prefix}}LineTwo
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : lineTwo
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected TextGuiTestObject address_lineTwo(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("address_lineTwo"), anchor, flags);
	}
	
	/**
	 * postcode: with default state.
	 *		.id : {{config.prefix}}Postcode
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : postcode
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected TextGuiTestObject address_postcode() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("address_postcode"));
	}
	/**
	 * postcode: with specific test context and state.
	 *		.id : {{config.prefix}}Postcode
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : postcode
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected TextGuiTestObject address_postcode(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("address_postcode"), anchor, flags);
	}
	
	/**
	 * townOrCity: with default state.
	 *		.id : {{config.prefix}}Town
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : townOrCity
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected TextGuiTestObject address_townOrCity() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("address_townOrCity"));
	}
	/**
	 * townOrCity: with specific test context and state.
	 *		.id : {{config.prefix}}Town
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : townOrCity
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected TextGuiTestObject address_townOrCity(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("address_townOrCity"), anchor, flags);
	}
	
	/**
	 * AnnualCardPaymentIncluding£GetDiscountDiscount: with default state.
	 *		.id : payment-cc-label
	 * 		.value : Annual card payment – including £{{getDiscount()}} discount
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected GuiTestObject annualCardPayment() 
	{
		return new GuiTestObject(
                        getMappedTestObject("annualCardPayment"));
	}
	/**
	 * AnnualCardPaymentIncluding£GetDiscountDiscount: with specific test context and state.
	 *		.id : payment-cc-label
	 * 		.value : Annual card payment – including £{{getDiscount()}} discount
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected GuiTestObject annualCardPayment(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("annualCardPayment"), anchor, flags);
	}
	
	/**
	 * AnnualDirectDebitIncluding£GetDiscountDiscount: with default state.
	 *		.id : payment-dd-label
	 * 		.value : Annual Direct Debit – including £{{getDiscount()}} discount
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected GuiTestObject annualDirectDebit() 
	{
		return new GuiTestObject(
                        getMappedTestObject("annualDirectDebit"));
	}
	/**
	 * AnnualDirectDebitIncluding£GetDiscountDiscount: with specific test context and state.
	 *		.id : payment-dd-label
	 * 		.value : Annual Direct Debit – including £{{getDiscount()}} discount
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected GuiTestObject annualDirectDebit(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("annualDirectDebit"), anchor, flags);
	}
	
	/**
	 * Continuesubmit: with default state.
	 *		.id : continue
	 * 		.type : submit
	 * 		.value : Continue
	 * 		.title : 
	 * 		.class : Html.BUTTON
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject continue_submit() 
	{
		return new GuiTestObject(
                        getMappedTestObject("continue_submit"));
	}
	/**
	 * Continuesubmit: with specific test context and state.
	 *		.id : continue
	 * 		.type : submit
	 * 		.value : Continue
	 * 		.title : 
	 * 		.class : Html.BUTTON
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject continue_submit(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("continue_submit"), anchor, flags);
	}
	
	/**
	 * dateOfBirthDay: with default state.
	 *		.id : dob-dd
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : dateOfBirthDay
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected TextGuiTestObject dateOfBirthDay() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("dateOfBirthDay"));
	}
	/**
	 * dateOfBirthDay: with specific test context and state.
	 *		.id : dob-dd
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : dateOfBirthDay
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected TextGuiTestObject dateOfBirthDay(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("dateOfBirthDay"), anchor, flags);
	}
	
	/**
	 * dateOfBirthMonth: with default state.
	 *		.id : dob-mm
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : dateOfBirthMonth
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected TextGuiTestObject dateOfBirthMonth() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("dateOfBirthMonth"));
	}
	/**
	 * dateOfBirthMonth: with specific test context and state.
	 *		.id : dob-mm
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : dateOfBirthMonth
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected TextGuiTestObject dateOfBirthMonth(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("dateOfBirthMonth"), anchor, flags);
	}
	
	/**
	 * dateOfBirthYear: with default state.
	 *		.id : dob-yyyy
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : dateOfBirthYear
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected TextGuiTestObject dateOfBirthYear() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("dateOfBirthYear"));
	}
	/**
	 * dateOfBirthYear: with specific test context and state.
	 *		.id : dob-yyyy
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : dateOfBirthYear
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected TextGuiTestObject dateOfBirthYear(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("dateOfBirthYear"), anchor, flags);
	}
	
	/**
	 * EuropeanBreakdownCoverAA: with default state.
	 *		.title : European breakdown cover | AA
	 * 		.class : Html.HtmlDocument
	 * 		.url : RegularExpression(.*uropean-breakdown-cover.*)
	 */
	protected DocumentTestObject ebc() 
	{
		return new DocumentTestObject(
                        getMappedTestObject("ebc"));
	}
	/**
	 * EuropeanBreakdownCoverAA: with specific test context and state.
	 *		.title : European breakdown cover | AA
	 * 		.class : Html.HtmlDocument
	 * 		.url : RegularExpression(.*uropean-breakdown-cover.*)
	 */
	protected DocumentTestObject ebc(TestObject anchor, long flags) 
	{
		return new DocumentTestObject(
                        getMappedTestObject("ebc"), anchor, flags);
	}
	
	/**
	 * email: with default state.
	 *		.id : email
	 * 		.title : 
	 * 		.class : Html.INPUT.email
	 * 		.name : email
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected TextGuiTestObject email() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("email"));
	}
	/**
	 * email: with specific test context and state.
	 *		.id : email
	 * 		.title : 
	 * 		.class : Html.INPUT.email
	 * 		.name : email
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected TextGuiTestObject email(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("email"), anchor, flags);
	}
	
	/**
	 * FindYourFullAddresssubmit: with default state.
	 *		.id : addressSubmit
	 * 		.type : submit
	 * 		.value : Find your full address
	 * 		.title : 
	 * 		.class : Html.BUTTON
	 * 		.name : 
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected GuiTestObject find_Address_submit() 
	{
		return new GuiTestObject(
                        getMappedTestObject("find_Address_submit"));
	}
	/**
	 * FindYourFullAddresssubmit: with specific test context and state.
	 *		.id : addressSubmit
	 * 		.type : submit
	 * 		.value : Find your full address
	 * 		.title : 
	 * 		.class : Html.BUTTON
	 * 		.name : 
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected GuiTestObject find_Address_submit(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("find_Address_submit"), anchor, flags);
	}
	
	/**
	 * firstname: with default state.
	 *		.id : firstname
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : firstname
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected TextGuiTestObject firstname() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("firstname"));
	}
	/**
	 * firstname: with specific test context and state.
	 *		.id : firstname
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : firstname
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected TextGuiTestObject firstname(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("firstname"), anchor, flags);
	}
	
	/**
	 * customerDetails: with default state.
	 *		.id : 
	 * 		.title : 
	 * 		.class : Html.FORM
	 * 		.name : customerDetails
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected GuiTestObject form_customerDetails() 
	{
		return new GuiTestObject(
                        getMappedTestObject("form_customerDetails"));
	}
	/**
	 * customerDetails: with specific test context and state.
	 *		.id : 
	 * 		.title : 
	 * 		.class : Html.FORM
	 * 		.name : customerDetails
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected GuiTestObject form_customerDetails(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("form_customerDetails"), anchor, flags);
	}
	
	/**
	 * dateOfBirthDay: with default state.
	 *		.id : dob-dd
	 * 		.title : 
	 * 		.class : Html.INPUT.tel
	 * 		.name : dateOfBirthDay
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected GuiTestObject html_dateOfBirthDay() 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_dateOfBirthDay"));
	}
	/**
	 * dateOfBirthDay: with specific test context and state.
	 *		.id : dob-dd
	 * 		.title : 
	 * 		.class : Html.INPUT.tel
	 * 		.name : dateOfBirthDay
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected GuiTestObject html_dateOfBirthDay(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_dateOfBirthDay"), anchor, flags);
	}
	
	/**
	 * dateOfBirthMonth: with default state.
	 *		.id : dob-mm
	 * 		.title : 
	 * 		.class : Html.INPUT.tel
	 * 		.name : dateOfBirthMonth
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected GuiTestObject html_dateOfBirthMonth() 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_dateOfBirthMonth"));
	}
	/**
	 * dateOfBirthMonth: with specific test context and state.
	 *		.id : dob-mm
	 * 		.title : 
	 * 		.class : Html.INPUT.tel
	 * 		.name : dateOfBirthMonth
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected GuiTestObject html_dateOfBirthMonth(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_dateOfBirthMonth"), anchor, flags);
	}
	
	/**
	 * dateOfBirthYear: with default state.
	 *		.id : dob-yyyy
	 * 		.title : 
	 * 		.class : Html.INPUT.tel
	 * 		.name : dateOfBirthYear
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected GuiTestObject html_dateOfBirthYear() 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_dateOfBirthYear"));
	}
	/**
	 * dateOfBirthYear: with specific test context and state.
	 *		.id : dob-yyyy
	 * 		.title : 
	 * 		.class : Html.INPUT.tel
	 * 		.name : dateOfBirthYear
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected GuiTestObject html_dateOfBirthYear(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_dateOfBirthYear"), anchor, flags);
	}
	
	/**
	 * telephone: with default state.
	 *		.id : telephone
	 * 		.title : 
	 * 		.class : Html.INPUT.tel
	 * 		.name : telephone
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected GuiTestObject html_telephone() 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_telephone"));
	}
	/**
	 * telephone: with specific test context and state.
	 *		.id : telephone
	 * 		.title : 
	 * 		.class : Html.INPUT.tel
	 * 		.name : telephone
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected GuiTestObject html_telephone(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_telephone"), anchor, flags);
	}
	
	/**
	 * htmlBrowser: with default state.
	 *		.class : Html.HtmlBrowser
	 * 		.browserName : MS Internet Explorer
	 * 		.processName : iexplore.exe
	 */
	protected BrowserTestObject iE() 
	{
		return new BrowserTestObject(
                        getMappedTestObject("iE"));
	}
	/**
	 * htmlBrowser: with specific test context and state.
	 *		.class : Html.HtmlBrowser
	 * 		.browserName : MS Internet Explorer
	 * 		.processName : iexplore.exe
	 */
	protected BrowserTestObject iE(TestObject anchor, long flags) 
	{
		return new BrowserTestObject(
                        getMappedTestObject("iE"), anchor, flags);
	}
	
	/**
	 * ngApp: with default state.
	 *		.id : ng-app
	 * 		.title : 
	 * 		.class : Html.HTML
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected GuiTestObject ngApp() 
	{
		return new GuiTestObject(
                        getMappedTestObject("ngApp"));
	}
	/**
	 * ngApp: with specific test context and state.
	 *		.id : ng-app
	 * 		.title : 
	 * 		.class : Html.HTML
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected GuiTestObject ngApp(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("ngApp"), anchor, flags);
	}
	
	/**
	 * OneOffCardPayment: with default state.
	 *		.id : payment-cc-single-label
	 * 		.value : One-off card payment
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected GuiTestObject oneOffCardPayment() 
	{
		return new GuiTestObject(
                        getMappedTestObject("oneOffCardPayment"));
	}
	/**
	 * OneOffCardPayment: with specific test context and state.
	 *		.id : payment-cc-single-label
	 * 		.value : One-off card payment
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected GuiTestObject oneOffCardPayment(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("oneOffCardPayment"), anchor, flags);
	}
	
	/**
	 * surname: with default state.
	 *		.id : surname
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : surname
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected TextGuiTestObject surname() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("surname"));
	}
	/**
	 * surname: with specific test context and state.
	 *		.id : surname
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : surname
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected TextGuiTestObject surname(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("surname"), anchor, flags);
	}
	
	/**
	 * telephone: with default state.
	 *		.id : telephone
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : telephone
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected TextGuiTestObject telephone() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("telephone"));
	}
	/**
	 * telephone: with specific test context and state.
	 *		.id : telephone
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : telephone
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected TextGuiTestObject telephone(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("telephone"), anchor, flags);
	}
	
	/**
	 * Miss: with default state.
	 *		.id : title-miss
	 * 		.value :  Miss 
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected GuiTestObject title_miss() 
	{
		return new GuiTestObject(
                        getMappedTestObject("title_miss"));
	}
	/**
	 * Miss: with specific test context and state.
	 *		.id : title-miss
	 * 		.value :  Miss 
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected GuiTestObject title_miss(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("title_miss"), anchor, flags);
	}
	
	/**
	 * Mr: with default state.
	 *		.id : title-mr
	 * 		.value :  Mr 
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected GuiTestObject title_mr() 
	{
		return new GuiTestObject(
                        getMappedTestObject("title_mr"));
	}
	/**
	 * Mr: with specific test context and state.
	 *		.id : title-mr
	 * 		.value :  Mr 
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected GuiTestObject title_mr(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("title_mr"), anchor, flags);
	}
	
	/**
	 * Mrs: with default state.
	 *		.id : title-mrs
	 * 		.value :  Mrs 
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected GuiTestObject title_mrs() 
	{
		return new GuiTestObject(
                        getMappedTestObject("title_mrs"));
	}
	/**
	 * Mrs: with specific test context and state.
	 *		.id : title-mrs
	 * 		.value :  Mrs 
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected GuiTestObject title_mrs(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("title_mrs"), anchor, flags);
	}
	
	/**
	 * Ms: with default state.
	 *		.id : title-ms
	 * 		.value :  Ms 
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected GuiTestObject title_ms() 
	{
		return new GuiTestObject(
                        getMappedTestObject("title_ms"));
	}
	/**
	 * Ms: with specific test context and state.
	 *		.id : title-ms
	 * 		.value :  Ms 
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected GuiTestObject title_ms(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("title_ms"), anchor, flags);
	}
	
	/**
	 * SorryWeAreUnableToOfferThisProductToAnyoneUnderTheA: with default state.
	 *		.id : too-young-dob
	 * 		.value : Sorry, we are unable to offer this product to anyone under the age of 17
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected GuiTestObject unableToOffer() 
	{
		return new GuiTestObject(
                        getMappedTestObject("unableToOffer"));
	}
	/**
	 * SorryWeAreUnableToOfferThisProductToAnyoneUnderTheA: with specific test context and state.
	 *		.id : too-young-dob
	 * 		.value : Sorry, we are unable to offer this product to anyone under the age of 17
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected GuiTestObject unableToOffer(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("unableToOffer"), anchor, flags);
	}
	
	

	protected Personal_DetailsHelper()
	{
		setScriptName("EBC_MK2.Personal_Details");
	}
	
}

