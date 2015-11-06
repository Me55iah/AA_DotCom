// DO NOT EDIT: This file is automatically generated.
//
// Only the associated template file should be edited directly.
// Helper class files are automatically regenerated from the template
// files at various times, including record actions and test object
// insertion actions.  Any changes made directly to a helper class
// file will be lost when automatically updated.

package resources.BreakDown_Cover_MK2;
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
 * Script Name   : <b>Buy_Cover</b><br>
 * Generated     : <b>2015/06/16 10:21:08</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows 7 x86 6.1 <br>
 * 
 * @since  June 16, 2015
 * @author horned
 */
public abstract class Buy_CoverHelper extends Utilities.AA_SuperHelper
{
	/**
	 * BuyBreakdownCoverbutton: with default state.
	 *		.value : Buy breakdown cover
	 * 		.title : 
	 * 		.class : RegularExpression(Html\.INPUT)
	 * 		.name : submitAppForm
	 * 		.classIndex : 0
	 */
	protected GuiTestObject button_buyBreakdownCoverbutton() 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_buyBreakdownCoverbutton"));
	}
	/**
	 * BuyBreakdownCoverbutton: with specific test context and state.
	 *		.value : Buy breakdown cover
	 * 		.title : 
	 * 		.class : RegularExpression(Html\.INPUT)
	 * 		.name : submitAppForm
	 * 		.classIndex : 0
	 */
	protected GuiTestObject button_buyBreakdownCoverbutton(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_buyBreakdownCoverbutton"), anchor, flags);
	}
	
	/**
	 * pricevalue: with default state.
	 *		.id : pricevalue
	 * 		.title : 
	 * 		.class : Html.SPAN
	 * 		.classIndex : 1
	 */
	protected GuiTestObject html_pricevalue() 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_pricevalue"));
	}
	/**
	 * pricevalue: with specific test context and state.
	 *		.id : pricevalue
	 * 		.title : 
	 * 		.class : Html.SPAN
	 * 		.classIndex : 1
	 */
	protected GuiTestObject html_pricevalue(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_pricevalue"), anchor, flags);
	}
	
	/**
	 * total_card_payment: with default state.
	 *		.id : total_card_payment
	 * 		.class : Html.SPAN
	 * 		.title : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject html_total_card_payment() 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_total_card_payment"));
	}
	/**
	 * total_card_payment: with specific test context and state.
	 *		.id : total_card_payment
	 * 		.class : Html.SPAN
	 * 		.title : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject html_total_card_payment(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_total_card_payment"), anchor, flags);
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
	 * IConfirmThatYouHaveInformedMeOfTheImportanceOfReading: with default state.
	 *		.id : 
	 * 		.value : I confirm that you have informed me of the importance of reading the terms and c ...
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 0
	 */
	protected GuiTestObject label_iConfirmThatYouHaveInfor() 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_iConfirmThatYouHaveInfor"));
	}
	/**
	 * IConfirmThatYouHaveInformedMeOfTheImportanceOfReading: with specific test context and state.
	 *		.id : 
	 * 		.value : I confirm that you have informed me of the importance of reading the terms and c ...
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 0
	 */
	protected GuiTestObject label_iConfirmThatYouHaveInfor(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_iConfirmThatYouHaveInfor"), anchor, flags);
	}
	
	

	protected Buy_CoverHelper()
	{
		setScriptName("BreakDown_Cover_MK2.Buy_Cover");
	}
	
}
