// DO NOT EDIT: This file is automatically generated.
//
// Only the associated template file should be edited directly.
// Helper class files are automatically regenerated from the template
// files at various times, including record actions and test object
// insertion actions.  Any changes made directly to a helper class
// file will be lost when automatically updated.

package resources.Home_MK2;
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
 * Script Name   : <b>Confirmation</b><br>
 * Generated     : <b>2015/06/19 09:52:22</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows 7 x86 6.1 <br>
 * 
 * @since  June 19, 2015
 * @author horned
 */
public abstract class ConfirmationHelper extends Utilities.AA_SuperHelper
{
	/**
	 * container: with default state.
	 *		.id : container
	 * 		.title : 
	 * 		.class : Html.DIV
	 * 		.classIndex : 0
	 */
	protected GuiTestObject Payment_Confirmation() 
	{
		return new GuiTestObject(
                        getMappedTestObject("Payment_Confirmation"));
	}
	/**
	 * container: with specific test context and state.
	 *		.id : container
	 * 		.title : 
	 * 		.class : Html.DIV
	 * 		.classIndex : 0
	 */
	protected GuiTestObject Payment_Confirmation(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("Payment_Confirmation"), anchor, flags);
	}
	
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
	 * HomeMembershipBoilerCoverHomeEmergencyAA: with default state.
	 *		.title : RegularExpression(Home Membership)
	 * 		.class : Html.HtmlDocument
	 * 		.url : RegularExpression(home-membership)
	 */
	protected DocumentTestObject document_homeMembershipBoilerC() 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_homeMembershipBoilerC"));
	}
	/**
	 * HomeMembershipBoilerCoverHomeEmergencyAA: with specific test context and state.
	 *		.title : RegularExpression(Home Membership)
	 * 		.class : Html.HtmlDocument
	 * 		.url : RegularExpression(home-membership)
	 */
	protected DocumentTestObject document_homeMembershipBoilerC(TestObject anchor, long flags) 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_homeMembershipBoilerC"), anchor, flags);
	}
	
	/**
	 * TheAAPaymentGateway: with default state.
	 *		.title : The AA: Payment Gateway
	 * 		.class : Html.HtmlDocument
	 * 		.url : https://uat-payments.theaa.com/01/pci/verify
	 */
	protected DocumentTestObject document_theAAPaymentGateway() 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_theAAPaymentGateway"));
	}
	/**
	 * TheAAPaymentGateway: with specific test context and state.
	 *		.title : The AA: Payment Gateway
	 * 		.class : Html.HtmlDocument
	 * 		.url : https://uat-payments.theaa.com/01/pci/verify
	 */
	protected DocumentTestObject document_theAAPaymentGateway(TestObject anchor, long flags) 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_theAAPaymentGateway"), anchor, flags);
	}
	
	/**
	 * ThanksForChoosingUsYouHaveBoughtCentralHeatingResponse: with default state.
	 *		.id : 
	 * 		.title : 
	 * 		.class : Html.FORM
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject form_thanksForChoosingUsYouHav() 
	{
		return new GuiTestObject(
                        getMappedTestObject("form_thanksForChoosingUsYouHav"));
	}
	/**
	 * ThanksForChoosingUsYouHaveBoughtCentralHeatingResponse: with specific test context and state.
	 *		.id : 
	 * 		.title : 
	 * 		.class : Html.FORM
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject form_thanksForChoosingUsYouHav(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("form_thanksForChoosingUsYouHav"), anchor, flags);
	}
	
	/**
	 * bookingConfirmationLabel: with default state.
	 *		.id : booking-confirmation-label
	 * 		.title : 
	 * 		.class : Html.H1
	 * 		.classIndex : 0
	 */
	protected GuiTestObject html_bookingConfirmationLabel() 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_bookingConfirmationLabel"));
	}
	/**
	 * bookingConfirmationLabel: with specific test context and state.
	 *		.id : booking-confirmation-label
	 * 		.title : 
	 * 		.class : Html.H1
	 * 		.classIndex : 0
	 */
	protected GuiTestObject html_bookingConfirmationLabel(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_bookingConfirmationLabel"), anchor, flags);
	}
	
	/**
	 * summarydetails_policyHolder: with default state.
	 *		.id : summarydetails_policyHolder
	 * 		.title : 
	 * 		.class : Html.P
	 * 		.classIndex : 0
	 */
	protected GuiTestObject html_summarydetails_policyHold() 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_summarydetails_policyHold"));
	}
	/**
	 * summarydetails_policyHolder: with specific test context and state.
	 *		.id : summarydetails_policyHolder
	 * 		.title : 
	 * 		.class : Html.P
	 * 		.classIndex : 0
	 */
	protected GuiTestObject html_summarydetails_policyHold(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_summarydetails_policyHold"), anchor, flags);
	}
	
	/**
	 * Locate and return the verification point container_text object in the SUT.
	 */
	protected IFtVerificationPoint container_textVP() 
	{
		return vp("container_text");
	}
	protected IFtVerificationPoint container_textVP(TestObject anchor)
	{
		return vp("container_text", anchor);
	}
	
	/**
	 * Locate and return the verification point Journey_Completion object in the SUT.
	 */
	protected IFtVerificationPoint Journey_CompletionVP() 
	{
		return vp("Journey_Completion");
	}
	protected IFtVerificationPoint Journey_CompletionVP(TestObject anchor)
	{
		return vp("Journey_Completion", anchor);
	}
	
	

	protected ConfirmationHelper()
	{
		setScriptName("Home_MK2.Confirmation");
	}
	
}
