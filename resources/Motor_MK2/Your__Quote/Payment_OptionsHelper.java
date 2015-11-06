// DO NOT EDIT: This file is automatically generated.
//
// Only the associated template file should be edited directly.
// Helper class files are automatically regenerated from the template
// files at various times, including record actions and test object
// insertion actions.  Any changes made directly to a helper class
// file will be lost when automatically updated.

package resources.Motor_MK2.Your__Quote;

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
 * Script Name   : <b>Payment_Options</b><br>
 * Generated     : <b>2015/07/13 14:30:00</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows 7 x86 6.1 <br>
 * 
 * @since  July 13, 2015
 * @author horned
 */
public abstract class Payment_OptionsHelper extends RationalTestScript
{
	/**
	 * htmlBrowser: with default state.
	 *		.class : Html.HtmlBrowser
	 * 		.browserName : MS Internet Explorer
	 * 		.processName : iexplore.exe
	 */
	protected BrowserTestObject browser_htmlBrowser() 
	{
		return new BrowserTestObject(
                        getMappedTestObject("browser_htmlBrowser"));
	}
	/**
	 * htmlBrowser: with specific test context and state.
	 *		.class : Html.HtmlBrowser
	 * 		.browserName : MS Internet Explorer
	 * 		.processName : iexplore.exe
	 */
	protected BrowserTestObject browser_htmlBrowser(TestObject anchor, long flags) 
	{
		return new BrowserTestObject(
                        getMappedTestObject("browser_htmlBrowser"), anchor, flags);
	}
	
	/**
	 * Submit: with default state.
	 *		.id : send-payment
	 * 		.type : submit
	 * 		.value : Submit
	 * 		.title : 
	 * 		.class : Html.INPUT.submit
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject button_submit() 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_submit"));
	}
	/**
	 * Submit: with specific test context and state.
	 *		.id : send-payment
	 * 		.type : submit
	 * 		.value : Submit
	 * 		.title : 
	 * 		.class : Html.INPUT.submit
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject button_submit(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_submit"), anchor, flags);
	}
	
	/**
	 * CarInsuranceYourCardPaymentTheAA: with default state.
	 *		.title : RegularExpression(Your card payment)
	 * 		.class : Html.HtmlDocument
	 * 		.url : RegularExpression(car-insurance)
	 */
	protected DocumentTestObject document_carInsuranceYourCardP() 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_carInsuranceYourCardP"));
	}
	/**
	 * CarInsuranceYourCardPaymentTheAA: with specific test context and state.
	 *		.title : RegularExpression(Your card payment)
	 * 		.class : Html.HtmlDocument
	 * 		.url : RegularExpression(car-insurance)
	 */
	protected DocumentTestObject document_carInsuranceYourCardP(TestObject anchor, long flags) 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_carInsuranceYourCardP"), anchor, flags);
	}
	
	/**
	 * mainForm: with default state.
	 *		.id : mainForm
	 * 		.title : 
	 * 		.class : Html.FORM
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject form_mainForm() 
	{
		return new GuiTestObject(
                        getMappedTestObject("form_mainForm"));
	}
	/**
	 * mainForm: with specific test context and state.
	 *		.id : mainForm
	 * 		.title : 
	 * 		.class : Html.FORM
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject form_mainForm(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("form_mainForm"), anchor, flags);
	}
	
	/**
	 * cardCvcNumber: with default state.
	 *		.id : cardCvcNumber
	 * 		.title : 
	 * 		.class : Html.INPUT.tel
	 * 		.name : card.cvc.number
	 * 		.classIndex : 1
	 */
	protected GuiTestObject html_cardCvcNumber() 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_cardCvcNumber"));
	}
	/**
	 * cardCvcNumber: with specific test context and state.
	 *		.id : cardCvcNumber
	 * 		.title : 
	 * 		.class : Html.INPUT.tel
	 * 		.name : card.cvc.number
	 * 		.classIndex : 1
	 */
	protected GuiTestObject html_cardCvcNumber(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_cardCvcNumber"), anchor, flags);
	}
	
	/**
	 * cardNumber: with default state.
	 *		.id : cardNumber
	 * 		.title : 
	 * 		.class : Html.INPUT.tel
	 * 		.name : card.number
	 * 		.classIndex : 0
	 */
	protected GuiTestObject html_cardNumber() 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_cardNumber"));
	}
	/**
	 * cardNumber: with specific test context and state.
	 *		.id : cardNumber
	 * 		.title : 
	 * 		.class : Html.INPUT.tel
	 * 		.name : card.number
	 * 		.classIndex : 0
	 */
	protected GuiTestObject html_cardNumber(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_cardNumber"), anchor, flags);
	}
	
	/**
	 * cardTotal: with default state.
	 *		.id : cardTotal
	 * 		.title : 
	 * 		.class : Html.DIV
	 * 		.classIndex : 0
	 */
	protected GuiTestObject html_cardTotal() 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_cardTotal"));
	}
	/**
	 * cardTotal: with specific test context and state.
	 *		.id : cardTotal
	 * 		.title : 
	 * 		.class : Html.DIV
	 * 		.classIndex : 0
	 */
	protected GuiTestObject html_cardTotal(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_cardTotal"), anchor, flags);
	}
	
	/**
	 * IConfirmThatYouHaveBroughtToMyAttentionTheImportanceO: with default state.
	 *		.id : 
	 * 		.value : I confirm that you have brought to my attention the importance of reading these  ...
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 6
	 */
	protected GuiTestObject label_iConfirmThatYouHaveBroug() 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_iConfirmThatYouHaveBroug"));
	}
	/**
	 * IConfirmThatYouHaveBroughtToMyAttentionTheImportanceO: with specific test context and state.
	 *		.id : 
	 * 		.value : I confirm that you have brought to my attention the importance of reading these  ...
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 6
	 */
	protected GuiTestObject label_iConfirmThatYouHaveBroug(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_iConfirmThatYouHaveBroug"), anchor, flags);
	}
	
	/**
	 * Back: with default state.
	 *		.text : Back
	 * 		.href : https://prelive9.theaa.com/car-insurance/buy/policy-assumptions
	 * 		.id : 
	 * 		.title : 
	 * 		.class : Html.A
	 * 		.name : 
	 * 		.classIndex : 8
	 */
	protected GuiTestObject link_back() 
	{
		return new GuiTestObject(
                        getMappedTestObject("link_back"));
	}
	/**
	 * Back: with specific test context and state.
	 *		.text : Back
	 * 		.href : https://prelive9.theaa.com/car-insurance/buy/policy-assumptions
	 * 		.id : 
	 * 		.title : 
	 * 		.class : Html.A
	 * 		.name : 
	 * 		.classIndex : 8
	 */
	protected GuiTestObject link_back(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("link_back"), anchor, flags);
	}
	
	/**
	 * cardExpiryMonth: with default state.
	 *		.text : -- 01 02 03 04 05 06 07 08 09 10 11 12
	 * 		.id : cardExpiryMonth
	 * 		.title : 
	 * 		.class : Html.SELECT
	 * 		.name : card.expiry.month
	 * 		.classIndex : 3
	 */
	protected SelectGuiSubitemTestObject list_cardExpiryMonth() 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_cardExpiryMonth"));
	}
	/**
	 * cardExpiryMonth: with specific test context and state.
	 *		.text : -- 01 02 03 04 05 06 07 08 09 10 11 12
	 * 		.id : cardExpiryMonth
	 * 		.title : 
	 * 		.class : Html.SELECT
	 * 		.name : card.expiry.month
	 * 		.classIndex : 3
	 */
	protected SelectGuiSubitemTestObject list_cardExpiryMonth(TestObject anchor, long flags) 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_cardExpiryMonth"), anchor, flags);
	}
	
	/**
	 * cardExpiryYear: with default state.
	 *		.text : -- 15 16 17 18 19 20 21 22 23
	 * 		.id : cardExpiryYear
	 * 		.title : 
	 * 		.class : Html.SELECT
	 * 		.name : card.expiry.year
	 * 		.classIndex : 4
	 */
	protected SelectGuiSubitemTestObject list_cardExpiryYear() 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_cardExpiryYear"));
	}
	/**
	 * cardExpiryYear: with specific test context and state.
	 *		.text : -- 15 16 17 18 19 20 21 22 23
	 * 		.id : cardExpiryYear
	 * 		.title : 
	 * 		.class : Html.SELECT
	 * 		.name : card.expiry.year
	 * 		.classIndex : 4
	 */
	protected SelectGuiSubitemTestObject list_cardExpiryYear(TestObject anchor, long flags) 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_cardExpiryYear"), anchor, flags);
	}
	
	/**
	 * cardStartMonth: with default state.
	 *		.text : -- 01 02 03 04 05 06 07 08 09 10 11 12
	 * 		.id : cardStartMonth
	 * 		.title : 
	 * 		.class : Html.SELECT
	 * 		.name : card.start.month
	 * 		.classIndex : 1
	 */
	protected SelectGuiSubitemTestObject list_cardStartMonth() 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_cardStartMonth"));
	}
	/**
	 * cardStartMonth: with specific test context and state.
	 *		.text : -- 01 02 03 04 05 06 07 08 09 10 11 12
	 * 		.id : cardStartMonth
	 * 		.title : 
	 * 		.class : Html.SELECT
	 * 		.name : card.start.month
	 * 		.classIndex : 1
	 */
	protected SelectGuiSubitemTestObject list_cardStartMonth(TestObject anchor, long flags) 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_cardStartMonth"), anchor, flags);
	}
	
	/**
	 * cardStartYear: with default state.
	 *		.text : -- 07 08 09 10 11 12 13 14 15
	 * 		.id : cardStartYear
	 * 		.title : 
	 * 		.class : Html.SELECT
	 * 		.name : card.start.year
	 * 		.classIndex : 2
	 */
	protected SelectGuiSubitemTestObject list_cardStartYear() 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_cardStartYear"));
	}
	/**
	 * cardStartYear: with specific test context and state.
	 *		.text : -- 07 08 09 10 11 12 13 14 15
	 * 		.id : cardStartYear
	 * 		.title : 
	 * 		.class : Html.SELECT
	 * 		.name : card.start.year
	 * 		.classIndex : 2
	 */
	protected SelectGuiSubitemTestObject list_cardStartYear(TestObject anchor, long flags) 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_cardStartYear"), anchor, flags);
	}
	
	/**
	 * cardType: with default state.
	 *		.text : --------------- Visa Visa Debit AA Visa Mastercard Mastercard Debit AA Mastercar ...
	 * 		.id : cardType
	 * 		.title : 
	 * 		.class : Html.SELECT
	 * 		.name : card.type
	 * 		.classIndex : 0
	 */
	protected SelectGuiSubitemTestObject list_cardType() 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_cardType"));
	}
	/**
	 * cardType: with specific test context and state.
	 *		.text : --------------- Visa Visa Debit AA Visa Mastercard Mastercard Debit AA Mastercar ...
	 * 		.id : cardType
	 * 		.title : 
	 * 		.class : Html.SELECT
	 * 		.name : card.type
	 * 		.classIndex : 0
	 */
	protected SelectGuiSubitemTestObject list_cardType(TestObject anchor, long flags) 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_cardType"), anchor, flags);
	}
	
	/**
	 * cardName: with default state.
	 *		.id : cardName
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : card.name
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_cardName() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_cardName"));
	}
	/**
	 * cardName: with specific test context and state.
	 *		.id : cardName
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : card.name
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_cardName(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_cardName"), anchor, flags);
	}
	
	

	protected Payment_OptionsHelper()
	{
		setScriptName("Motor_MK2.Your__Quote.Payment_Options");
	}
	
}
