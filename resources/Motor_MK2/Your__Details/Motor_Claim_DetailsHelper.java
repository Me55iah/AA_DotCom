// DO NOT EDIT: This file is automatically generated.
//
// Only the associated template file should be edited directly.
// Helper class files are automatically regenerated from the template
// files at various times, including record actions and test object
// insertion actions.  Any changes made directly to a helper class
// file will be lost when automatically updated.

package resources.Motor_MK2.Your__Details;
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
 * Script Name   : <b>Motor_Claim_Details</b><br>
 * Generated     : <b>2015/10/21 13:59:50</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows 7 x86 6.1 <br>
 * 
 * @since  October 21, 2015
 * @author horned
 */
public abstract class Motor_Claim_DetailsHelper extends Utilities.AA_SuperHelper
{
	/**
	 * CarInsuranceYourDetailsTheAA: with default state.
	 *		.title : RegularExpression(Your details)
	 * 		.class : Html.HtmlDocument
	 * 		.url : RegularExpression(policyholder-details)
	 */
	protected DocumentTestObject document_carInsuranceYourDetai() 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_carInsuranceYourDetai"));
	}
	/**
	 * CarInsuranceYourDetailsTheAA: with specific test context and state.
	 *		.title : RegularExpression(Your details)
	 * 		.class : Html.HtmlDocument
	 * 		.url : RegularExpression(policyholder-details)
	 */
	protected DocumentTestObject document_carInsuranceYourDetai(TestObject anchor, long flags) 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_carInsuranceYourDetai"), anchor, flags);
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
	 * No: with default state.
	 *		.id : 
	 * 		.value : No
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		for : insurance-claims-no
	 * 		.classIndex : RegularExpression(4.*\d)
	 */
	protected GuiTestObject label_Claims_no() 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_Claims_no"));
	}
	/**
	 * No: with specific test context and state.
	 *		.id : 
	 * 		.value : No
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		for : insurance-claims-no
	 * 		.classIndex : RegularExpression(4.*\d)
	 */
	protected GuiTestObject label_Claims_no(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_Claims_no"), anchor, flags);
	}
	
	/**
	 * Yes: with default state.
	 *		.id : 
	 * 		.value : Yes
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		for : insurance-claims-yes
	 * 		.classIndex : RegularExpression(4.*\d)
	 */
	protected GuiTestObject label_Claims_yes() 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_Claims_yes"));
	}
	/**
	 * Yes: with specific test context and state.
	 *		.id : 
	 * 		.value : Yes
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		for : insurance-claims-yes
	 * 		.classIndex : RegularExpression(4.*\d)
	 */
	protected GuiTestObject label_Claims_yes(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_Claims_yes"), anchor, flags);
	}
	
	/**
	 * AddClaim: with default state.
	 *		.text : Add claim
	 * 		.id : 
	 * 		.href : RegularExpression(policyholder)
	 * 		.title : 
	 * 		.class : Html.A
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject link_addClaim() 
	{
		return new GuiTestObject(
                        getMappedTestObject("link_addClaim"));
	}
	/**
	 * AddClaim: with specific test context and state.
	 *		.text : Add claim
	 * 		.id : 
	 * 		.href : RegularExpression(policyholder)
	 * 		.title : 
	 * 		.class : Html.A
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject link_addClaim(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("link_addClaim"), anchor, flags);
	}
	
	

	protected Motor_Claim_DetailsHelper()
	{
		setScriptName("Motor_MK2.Your__Details.Motor_Claim_Details");
	}
	
}
