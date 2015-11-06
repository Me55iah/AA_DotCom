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
 * Script Name   : <b>Policy_Offers</b><br>
 * Generated     : <b>2015/07/08 12:37:49</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows 7 x86 6.1 <br>
 * 
 * @since  July 08, 2015
 * @author horned
 */
public abstract class Policy_OffersHelper extends RationalTestScript
{
	/**
	 * CarInsuranceYourQuoteTheAA: with default state.
	 *		.title : RegularExpression(Your quote)
	 * 		.class : Html.HtmlDocument
	 * 		.url : RegularExpression(car-insurance)
	 */
	protected DocumentTestObject document_carInsuranceYourQuote() 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_carInsuranceYourQuote"));
	}
	/**
	 * CarInsuranceYourQuoteTheAA: with specific test context and state.
	 *		.title : RegularExpression(Your quote)
	 * 		.class : Html.HtmlDocument
	 * 		.url : RegularExpression(car-insurance)
	 */
	protected DocumentTestObject document_carInsuranceYourQuote(TestObject anchor, long flags) 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_carInsuranceYourQuote"), anchor, flags);
	}
	
	/**
	 * BreakdownProductOverview: with default state.
	 *		.id : BreakdownProductOverview
	 * 		.title : 
	 * 		.class : Html.DIV
	 * 		.classIndex : 0
	 */
	protected GuiTestObject html_breakdownProductOverview() 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_breakdownProductOverview"));
	}
	/**
	 * BreakdownProductOverview: with specific test context and state.
	 *		.id : BreakdownProductOverview
	 * 		.title : 
	 * 		.class : Html.DIV
	 * 		.classIndex : 0
	 */
	protected GuiTestObject html_breakdownProductOverview(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_breakdownProductOverview"), anchor, flags);
	}
	
	/**
	 * RRcontainer: with default state.
	 *		.id : RRcontainer
	 * 		.title : 
	 * 		.class : Html.DIV
	 * 		.classIndex : 0
	 */
	protected GuiTestObject html_rRcontainer() 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_rRcontainer"));
	}
	/**
	 * RRcontainer: with specific test context and state.
	 *		.id : RRcontainer
	 * 		.title : 
	 * 		.class : Html.DIV
	 * 		.classIndex : 0
	 */
	protected GuiTestObject html_rRcontainer(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_rRcontainer"), anchor, flags);
	}
	
	/**
	 * RRHScontainer: with default state.
	 *		.id : RRHScontainer
	 * 		.title : 
	 * 		.class : Html.DIV
	 * 		.classIndex : 1
	 */
	protected GuiTestObject html_rrhScontainer() 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_rrhScontainer"));
	}
	/**
	 * RRHScontainer: with specific test context and state.
	 *		.id : RRHScontainer
	 * 		.title : 
	 * 		.class : Html.DIV
	 * 		.classIndex : 1
	 */
	protected GuiTestObject html_rrhScontainer(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_rrhScontainer"), anchor, flags);
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
	 * AddRelay£4483: with default state.
	 *		.id : 
	 * 		.value : Add Relay (£44.83)
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 0
	 */
	protected GuiTestObject label_addRelay() 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_addRelay"));
	}
	/**
	 * AddRelay£4483: with specific test context and state.
	 *		.id : 
	 * 		.value : Add Relay (£44.83)
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 0
	 */
	protected GuiTestObject label_addRelay(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_addRelay"), anchor, flags);
	}
	
	/**
	 * AddRelayHomeStart£8597: with default state.
	 *		.id : 
	 * 		.value : Add Relay + Home Start (£85.97)
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 0
	 */
	protected GuiTestObject label_addRelayHomeStart() 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_addRelayHomeStart"));
	}
	/**
	 * AddRelayHomeStart£8597: with specific test context and state.
	 *		.id : 
	 * 		.value : Add Relay + Home Start (£85.97)
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 0
	 */
	protected GuiTestObject label_addRelayHomeStart(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_addRelayHomeStart"), anchor, flags);
	}
	
	/**
	 * FreeBreakdownCoverAdded: with default state.
	 *		.id : 
	 * 		.value : Free breakdown cover added
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 0
	 */
	protected GuiTestObject label_freeBreakdownCoverAdded() 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_freeBreakdownCoverAdded"));
	}
	/**
	 * FreeBreakdownCoverAdded: with specific test context and state.
	 *		.id : 
	 * 		.value : Free breakdown cover added
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 0
	 */
	protected GuiTestObject label_freeBreakdownCoverAdded(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_freeBreakdownCoverAdded"), anchor, flags);
	}
	
	/**
	 * IAmABlueBadgeHolderAndWouldLikeTheAAToBeAwareOfTh: with default state.
	 *		.id : special-needs-label
	 * 		.value : I am a blue badge holder and would like the AA to be aware of this. Learn more 
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 0
	 */
	protected GuiTestObject label_iAmABlueBadgeHolder() 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_iAmABlueBadgeHolder"));
	}
	/**
	 * IAmABlueBadgeHolderAndWouldLikeTheAAToBeAwareOfTh: with specific test context and state.
	 *		.id : special-needs-label
	 * 		.value : I am a blue badge holder and would like the AA to be aware of this. Learn more 
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 0
	 */
	protected GuiTestObject label_iAmABlueBadgeHolder(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_iAmABlueBadgeHolder"), anchor, flags);
	}
	
	/**
	 * PaymentDetailsAndTerms: with default state.
	 *		.text : Payment details and terms
	 * 		.href : https://prelive9.theaa.com/car-insurance/buy/quote#
	 * 		.id : 
	 * 		.title : 
	 * 		.class : Html.A
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject link_paymentDetailsAndTerms() 
	{
		return new GuiTestObject(
                        getMappedTestObject("link_paymentDetailsAndTerms"));
	}
	/**
	 * PaymentDetailsAndTerms: with specific test context and state.
	 *		.text : Payment details and terms
	 * 		.href : https://prelive9.theaa.com/car-insurance/buy/quote#
	 * 		.id : 
	 * 		.title : 
	 * 		.class : Html.A
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject link_paymentDetailsAndTerms(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("link_paymentDetailsAndTerms"), anchor, flags);
	}
	
	

	protected Policy_OffersHelper()
	{
		setScriptName("Motor_MK2.Your__Quote.Policy_Offers");
	}
	
}

