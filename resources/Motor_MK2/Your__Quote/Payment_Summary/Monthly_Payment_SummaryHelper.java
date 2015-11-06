// DO NOT EDIT: This file is automatically generated.
//
// Only the associated template file should be edited directly.
// Helper class files are automatically regenerated from the template
// files at various times, including record actions and test object
// insertion actions.  Any changes made directly to a helper class
// file will be lost when automatically updated.

package resources.Motor_MK2.Your__Quote.Payment_Summary;
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
 * Script Name   : <b>Monthly_Payment_Summary</b><br>
 * Generated     : <b>2015/08/13 15:41:38</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows 7 x86 6.1 <br>
 * 
 * @since  August 13, 2015
 * @author horned
 */
public abstract class Monthly_Payment_SummaryHelper extends Utilities.AA_SuperHelper
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
	 * breakdownInfoSummary: with default state.
	 *		.id : breakdown-info-summary
	 * 		.title : 
	 * 		.class : Html.SECTION
	 * 		.classIndex : 0
	 */
	protected GuiTestObject html_breakdownInfoSummary() 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_breakdownInfoSummary"));
	}
	/**
	 * breakdownInfoSummary: with specific test context and state.
	 *		.id : breakdown-info-summary
	 * 		.title : 
	 * 		.class : Html.SECTION
	 * 		.classIndex : 0
	 */
	protected GuiTestObject html_breakdownInfoSummary(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_breakdownInfoSummary"), anchor, flags);
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
	 * priceSection: with default state.
	 *		.id : price-section
	 * 		.title : 
	 * 		.class : Html.DIV
	 * 		.classIndex : 6
	 */
	protected GuiTestObject html_priceSection() 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_priceSection"));
	}
	/**
	 * priceSection: with specific test context and state.
	 *		.id : price-section
	 * 		.title : 
	 * 		.class : Html.DIV
	 * 		.classIndex : 6
	 */
	protected GuiTestObject html_priceSection(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_priceSection"), anchor, flags);
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
	
	

	protected Monthly_Payment_SummaryHelper()
	{
		setScriptName("Motor_MK2.Your__Quote.Payment_Summary.Monthly_Payment_Summary");
	}
	
}
