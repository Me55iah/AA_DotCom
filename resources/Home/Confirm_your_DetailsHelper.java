// DO NOT EDIT: This file is automatically generated.
//
// Only the associated template file should be edited directly.
// Helper class files are automatically regenerated from the template
// files at various times, including record actions and test object
// insertion actions.  Any changes made directly to a helper class
// file will be lost when automatically updated.

package resources.Home;

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
 * Script Name   : <b>Confirm_your_Details</b><br>
 * Generated     : <b>2014/07/29 11:46:22</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows XP x86 5.1 <br>
 * 
 * @since  July 29, 2014
 * @author courtl
 */
public abstract class Confirm_your_DetailsHelper extends RationalTestScript
{
	/**
	 * Confirm: with default state.
	 *		.alt : Yes
	 * 		.id : 
	 * 		.type : image
	 * 		.value : 
	 * 		.title : 
	 * 		.class : Html.INPUT.image
	 * 		alt : Yes
	 * 		.name : CONFIRM
	 * 		.classIndex : 1
	 */
	protected GuiTestObject button_confirm() 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_confirm"));
	}
	/**
	 * Confirm: with specific test context and state.
	 *		.alt : Yes
	 * 		.id : 
	 * 		.type : image
	 * 		.value : 
	 * 		.title : 
	 * 		.class : Html.INPUT.image
	 * 		alt : Yes
	 * 		.name : CONFIRM
	 * 		.classIndex : 1
	 */
	protected GuiTestObject button_confirm(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_confirm"), anchor, flags);
	}
	
	/**
	 * Yessubmit: with default state.
	 *		.id : CONFIRM
	 * 		.type : submit
	 * 		.value : Yes
	 * 		.title : 
	 * 		.class : Html.INPUT.submit
	 * 		.name : CONFIRM
	 * 		.classIndex : 1
	 */
	protected GuiTestObject button_yessubmit() 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_yessubmit"));
	}
	/**
	 * Yessubmit: with specific test context and state.
	 *		.id : CONFIRM
	 * 		.type : submit
	 * 		.value : Yes
	 * 		.title : 
	 * 		.class : Html.INPUT.submit
	 * 		.name : CONFIRM
	 * 		.classIndex : 1
	 */
	protected GuiTestObject button_yessubmit(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_yessubmit"), anchor, flags);
	}
	
	/**
	 * Yessubmit: with default state.
	 *		.id : yes_image
	 * 		.type : submit
	 * 		.value : Yes
	 * 		.class : Html.INPUT.submit
	 * 		.title : 
	 * 		.name : 
	 * 		.classIndex : 1
	 */
	protected GuiTestObject button_yessubmit2() 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_yessubmit2"));
	}
	/**
	 * Yessubmit: with specific test context and state.
	 *		.id : yes_image
	 * 		.type : submit
	 * 		.value : Yes
	 * 		.class : Html.INPUT.submit
	 * 		.title : 
	 * 		.name : 
	 * 		.classIndex : 1
	 */
	protected GuiTestObject button_yessubmit2(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_yessubmit2"), anchor, flags);
	}
	
	/**
	 * AmendAddress: with default state.
	 *		.text : Amend address
	 * 		.id : 
	 * 		.href : RegularExpression(https://.*.theaa\.com/home-insurance/viewMainDetails\.do\#abou ...
	 * 		.title : 
	 * 		.class : Html.A
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject link_amendAddress() 
	{
		return new GuiTestObject(
                        getMappedTestObject("link_amendAddress"));
	}
	/**
	 * AmendAddress: with specific test context and state.
	 *		.text : Amend address
	 * 		.id : 
	 * 		.href : RegularExpression(https://.*.theaa\.com/home-insurance/viewMainDetails\.do\#abou ...
	 * 		.title : 
	 * 		.class : Html.A
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject link_amendAddress(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("link_amendAddress"), anchor, flags);
	}
	
	

	protected Confirm_your_DetailsHelper()
	{
		setScriptName("Home.Confirm_your_Details");
	}
	
}

