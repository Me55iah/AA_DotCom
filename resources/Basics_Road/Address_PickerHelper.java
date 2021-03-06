// DO NOT EDIT: This file is automatically generated.
//
// Only the associated template file should be edited directly.
// Helper class files are automatically regenerated from the template
// files at various times, including record actions and test object
// insertion actions.  Any changes made directly to a helper class
// file will be lost when automatically updated.

package resources.Basics_Road;

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
 * Script Name   : <b>Address_Picker</b><br>
 * Generated     : <b>2015/01/27 12:05:12</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows XP x86 5.1 <br>
 * 
 * @since  January 27, 2015
 * @author horned
 */
public abstract class Address_PickerHelper extends RationalTestScript
{
	/**
	 * Continuesubmit: with default state.
	 *		.id : Continue
	 * 		.type : submit
	 * 		.value : Continue
	 * 		.title : 
	 * 		.class : Html.BUTTON
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject button_continuesubmit() 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_continuesubmit"));
	}
	/**
	 * Continuesubmit: with specific test context and state.
	 *		.id : Continue
	 * 		.type : submit
	 * 		.value : Continue
	 * 		.title : 
	 * 		.class : Html.BUTTON
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject button_continuesubmit(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_continuesubmit"), anchor, flags);
	}
	
	/**
	 * BasicBreakdownInsuranceCoverForYourCarAA: with default state.
	 *		.title : Basic Breakdown Insurance | Cover for your car | AA
	 * 		.class : Html.HtmlDocument
	 * 		.url : RegularExpression(basic-breakdown-insurance)
	 */
	protected DocumentTestObject document_basicBreakdownInsuran() 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_basicBreakdownInsuran"));
	}
	/**
	 * BasicBreakdownInsuranceCoverForYourCarAA: with specific test context and state.
	 *		.title : Basic Breakdown Insurance | Cover for your car | AA
	 * 		.class : Html.HtmlDocument
	 * 		.url : RegularExpression(basic-breakdown-insurance)
	 */
	protected DocumentTestObject document_basicBreakdownInsuran(TestObject anchor, long flags) 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_basicBreakdownInsuran"), anchor, flags);
	}
	
	/**
	 * Select: with default state.
	 *		.text : RegularExpression(Select)
	 * 		.id : Select
	 * 		.title : 
	 * 		.class : Html.SELECT
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected SelectGuiSubitemTestObject list_select() 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_select"));
	}
	/**
	 * Select: with specific test context and state.
	 *		.text : RegularExpression(Select)
	 * 		.id : Select
	 * 		.title : 
	 * 		.class : Html.SELECT
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected SelectGuiSubitemTestObject list_select(TestObject anchor, long flags) 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_select"), anchor, flags);
	}
	
	

	protected Address_PickerHelper()
	{
		setScriptName("Basics_Road.Address_Picker");
	}
	
}

