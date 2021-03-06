// DO NOT EDIT: This file is automatically generated.
//
// Only the associated template file should be edited directly.
// Helper class files are automatically regenerated from the template
// files at various times, including record actions and test object
// insertion actions.  Any changes made directly to a helper class
// file will be lost when automatically updated.

package resources.Motor_MK2.Your__Quote;
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
 * Script Name   : <b>Extra_Cover</b><br>
 * Generated     : <b>2015/08/10 16:27:18</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows 7 x86 6.1 <br>
 * 
 * @since  August 10, 2015
 * @author horned
 */
public abstract class Extra_CoverHelper extends Utilities.AA_SuperHelper
{
	/**
	 * Recalculatesubmit: with default state.
	 *		.id : recalcButtonDueVolExcess
	 * 		.type : submit
	 * 		.value : Recalculate
	 * 		.title : 
	 * 		.class : Html.INPUT.submit
	 * 		.name : RECALCQUOTE.y
	 * 		.classIndex : 0
	 */
	protected GuiTestObject button_recalculatesubmit() 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_recalculatesubmit"));
	}
	/**
	 * Recalculatesubmit: with specific test context and state.
	 *		.id : recalcButtonDueVolExcess
	 * 		.type : submit
	 * 		.value : Recalculate
	 * 		.title : 
	 * 		.class : Html.INPUT.submit
	 * 		.name : RECALCQUOTE.y
	 * 		.classIndex : 0
	 */
	protected GuiTestObject button_recalculatesubmit(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_recalculatesubmit"), anchor, flags);
	}
	
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
	 * quoteForm: with default state.
	 *		.id : quoteForm
	 * 		.title : 
	 * 		.class : Html.FORM
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject form_quoteForm() 
	{
		return new GuiTestObject(
                        getMappedTestObject("form_quoteForm"));
	}
	/**
	 * quoteForm: with specific test context and state.
	 *		.id : quoteForm
	 * 		.title : 
	 * 		.class : Html.FORM
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject form_quoteForm(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("form_quoteForm"), anchor, flags);
	}
	
	/**
	 * main: with default state.
	 *		.id : main
	 * 		.title : 
	 * 		.class : Html.DIV
	 * 		.classIndex : 0
	 */
	protected GuiTestObject html_main() 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_main"));
	}
	/**
	 * main: with specific test context and state.
	 *		.id : main
	 * 		.title : 
	 * 		.class : Html.DIV
	 * 		.classIndex : 0
	 */
	protected GuiTestObject html_main(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_main"), anchor, flags);
	}
	
	/**
	 * mainContent: with default state.
	 *		.id : mainContent
	 * 		.title : 
	 * 		.class : Html.DIV
	 * 		.classIndex : 1
	 */
	protected GuiTestObject html_mainContent() 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_mainContent"));
	}
	/**
	 * mainContent: with specific test context and state.
	 *		.id : mainContent
	 * 		.title : 
	 * 		.class : Html.DIV
	 * 		.classIndex : 1
	 */
	protected GuiTestObject html_mainContent(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_mainContent"), anchor, flags);
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
	 * AddCourtesyCarUpgrade: with default state.
	 *		.id : 
	 * 		.value : Add courtesy car upgrade
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : RegularExpression()
	 */
	protected GuiTestObject label_addCourtesyCarUpgrade() 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_addCourtesyCarUpgrade"));
	}
	/**
	 * AddCourtesyCarUpgrade: with specific test context and state.
	 *		.id : 
	 * 		.value : Add courtesy car upgrade
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : RegularExpression()
	 */
	protected GuiTestObject label_addCourtesyCarUpgrade(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_addCourtesyCarUpgrade"), anchor, flags);
	}
	
	/**
	 * AddLegalAssistance: with default state.
	 *		.id : 
	 * 		.value : Add legal assistance
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : RegularExpression()
	 */
	protected GuiTestObject label_addLegalAssistance() 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_addLegalAssistance"));
	}
	/**
	 * AddLegalAssistance: with specific test context and state.
	 *		.id : 
	 * 		.value : Add legal assistance
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : RegularExpression()
	 */
	protected GuiTestObject label_addLegalAssistance(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_addLegalAssistance"), anchor, flags);
	}
	
	/**
	 * AddPersonalAccidentCover: with default state.
	 *		.id : 
	 * 		.value : Add personal accident cover
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : RegularExpression()
	 */
	protected GuiTestObject label_addPersonalAccidentCover() 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_addPersonalAccidentCover"));
	}
	/**
	 * AddPersonalAccidentCover: with specific test context and state.
	 *		.id : 
	 * 		.value : Add personal accident cover
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : RegularExpression()
	 */
	protected GuiTestObject label_addPersonalAccidentCover(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_addPersonalAccidentCover"), anchor, flags);
	}
	
	/**
	 * AddPolicyExcessProtection: with default state.
	 *		.id : 
	 * 		.value : Add policy excess protection
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : RegularExpression()
	 */
	protected GuiTestObject label_addPolicyExcessProtectio() 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_addPolicyExcessProtectio"));
	}
	/**
	 * AddPolicyExcessProtection: with specific test context and state.
	 *		.id : 
	 * 		.value : Add policy excess protection
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : RegularExpression()
	 */
	protected GuiTestObject label_addPolicyExcessProtectio(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_addPolicyExcessProtectio"), anchor, flags);
	}
	
	/**
	 * FindOutMore: with default state.
	 *		.text : Find out more
	 * 		.id : 
	 * 		.href : RegularExpression(car-insurance)
	 * 		.title : 
	 * 		.class : Html.A
	 * 		.name : 
	 * 		.classIndex : 2
	 */
	protected GuiTestObject link_findOutMore() 
	{
		return new GuiTestObject(
                        getMappedTestObject("link_findOutMore"));
	}
	/**
	 * FindOutMore: with specific test context and state.
	 *		.text : Find out more
	 * 		.id : 
	 * 		.href : RegularExpression(car-insurance)
	 * 		.title : 
	 * 		.class : Html.A
	 * 		.name : 
	 * 		.classIndex : 2
	 */
	protected GuiTestObject link_findOutMore(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("link_findOutMore"), anchor, flags);
	}
	
	/**
	 * FindOutMore: with default state.
	 *		.text : Find out more
	 * 		.id : 
	 * 		.href : RegularExpression(car-insurance)
	 * 		.title : 
	 * 		.class : Html.A
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject link_findOutMore2() 
	{
		return new GuiTestObject(
                        getMappedTestObject("link_findOutMore2"));
	}
	/**
	 * FindOutMore: with specific test context and state.
	 *		.text : Find out more
	 * 		.id : 
	 * 		.href : RegularExpression(car-insurance)
	 * 		.title : 
	 * 		.class : Html.A
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject link_findOutMore2(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("link_findOutMore2"), anchor, flags);
	}
	
	/**
	 * FindOutMore: with default state.
	 *		.text : Find out more
	 * 		.id : 
	 * 		.href : RegularExpression(car-insurance)
	 * 		.title : 
	 * 		.class : Html.A
	 * 		.name : 
	 * 		.classIndex : 4
	 */
	protected GuiTestObject link_findOutMore3() 
	{
		return new GuiTestObject(
                        getMappedTestObject("link_findOutMore3"));
	}
	/**
	 * FindOutMore: with specific test context and state.
	 *		.text : Find out more
	 * 		.id : 
	 * 		.href : RegularExpression(car-insurance)
	 * 		.title : 
	 * 		.class : Html.A
	 * 		.name : 
	 * 		.classIndex : 4
	 */
	protected GuiTestObject link_findOutMore3(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("link_findOutMore3"), anchor, flags);
	}
	
	/**
	 * FindOutMore: with default state.
	 *		.text : Find out more
	 * 		.id : 
	 * 		.href : RegularExpression(car-insurance)
	 * 		.title : 
	 * 		.class : Html.A
	 * 		.name : 
	 * 		.classIndex : 6
	 */
	protected GuiTestObject link_findOutMore4() 
	{
		return new GuiTestObject(
                        getMappedTestObject("link_findOutMore4"));
	}
	/**
	 * FindOutMore: with specific test context and state.
	 *		.text : Find out more
	 * 		.id : 
	 * 		.href : RegularExpression(car-insurance)
	 * 		.title : 
	 * 		.class : Html.A
	 * 		.name : 
	 * 		.classIndex : 6
	 */
	protected GuiTestObject link_findOutMore4(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("link_findOutMore4"), anchor, flags);
	}
	
	/**
	 * aaMotorVoluntaryExcessCode: with default state.
	 *		.text : Please select �Nil �50 �75 �100 �125 �150 �200 �250 �300 �350 �400 �450 �500
	 * 		.id : voluntary-excess
	 * 		.title : 
	 * 		.class : Html.SELECT
	 * 		.name : aa.motor.voluntaryExcess.code
	 * 		.classIndex : 0
	 */
	protected SelectGuiSubitemTestObject list_aaMotorVoluntaryExcessCod() 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_aaMotorVoluntaryExcessCod"));
	}
	/**
	 * aaMotorVoluntaryExcessCode: with specific test context and state.
	 *		.text : Please select �Nil �50 �75 �100 �125 �150 �200 �250 �300 �350 �400 �450 �500
	 * 		.id : voluntary-excess
	 * 		.title : 
	 * 		.class : Html.SELECT
	 * 		.name : aa.motor.voluntaryExcess.code
	 * 		.classIndex : 0
	 */
	protected SelectGuiSubitemTestObject list_aaMotorVoluntaryExcessCod(TestObject anchor, long flags) 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_aaMotorVoluntaryExcessCod"), anchor, flags);
	}
	
	

	protected Extra_CoverHelper()
	{
		setScriptName("Motor_MK2.Your__Quote.Extra_Cover");
	}
	
}

