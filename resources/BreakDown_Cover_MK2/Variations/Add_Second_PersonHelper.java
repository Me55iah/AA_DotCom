// DO NOT EDIT: This file is automatically generated.
//
// Only the associated template file should be edited directly.
// Helper class files are automatically regenerated from the template
// files at various times, including record actions and test object
// insertion actions.  Any changes made directly to a helper class
// file will be lost when automatically updated.

package resources.BreakDown_Cover_MK2.Variations;

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
 * Script Name   : <b>Add_Second_Person</b><br>
 * Generated     : <b>2015/06/10 14:05:36</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows 7 x86 6.1 <br>
 * 
 * @since  June 10, 2015
 * @author horned
 */
public abstract class Add_Second_PersonHelper extends RationalTestScript
{
	/**
	 * BreakdownCoverYourDetailsAA: with default state.
	 *		.title : RegularExpression(details)
	 * 		.class : Html.HtmlDocument
	 * 		.url : RegularExpression(cover)
	 */
	protected DocumentTestObject document_breakdownCoverYourDet() 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_breakdownCoverYourDet"));
	}
	/**
	 * BreakdownCoverYourDetailsAA: with specific test context and state.
	 *		.title : RegularExpression(details)
	 * 		.class : Html.HtmlDocument
	 * 		.url : RegularExpression(cover)
	 */
	protected DocumentTestObject document_breakdownCoverYourDet(TestObject anchor, long flags) 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_breakdownCoverYourDet"), anchor, flags);
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
	 * Miss: with default state.
	 *		.id : 
	 * 		.value : Miss
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 18
	 */
	protected GuiTestObject label_miss() 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_miss"));
	}
	/**
	 * Miss: with specific test context and state.
	 *		.id : 
	 * 		.value : Miss
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 18
	 */
	protected GuiTestObject label_miss(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_miss"), anchor, flags);
	}
	
	/**
	 * Mr: with default state.
	 *		.id : 
	 * 		.value : Mr
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 16
	 */
	protected GuiTestObject label_mr() 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_mr"));
	}
	/**
	 * Mr: with specific test context and state.
	 *		.id : 
	 * 		.value : Mr
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 16
	 */
	protected GuiTestObject label_mr(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_mr"), anchor, flags);
	}
	
	/**
	 * Mrs: with default state.
	 *		.id : 
	 * 		.value : Mrs
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 17
	 */
	protected GuiTestObject label_mrs() 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_mrs"));
	}
	/**
	 * Mrs: with specific test context and state.
	 *		.id : 
	 * 		.value : Mrs
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 17
	 */
	protected GuiTestObject label_mrs(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_mrs"), anchor, flags);
	}
	
	/**
	 * Ms: with default state.
	 *		.id : 
	 * 		.value : Ms
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 19
	 */
	protected GuiTestObject label_ms() 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_ms"));
	}
	/**
	 * Ms: with specific test context and state.
	 *		.id : 
	 * 		.value : Ms
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 19
	 */
	protected GuiTestObject label_ms(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_ms"), anchor, flags);
	}
	
	/**
	 * additionalMembers0DateOfBirthDate: with default state.
	 *		.id : policyHolder2Dob
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : additionalMembers[0].dateOfBirth.date
	 * 		.classIndex : 11
	 */
	protected TextGuiTestObject text_additionalMembers0DateOfB() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_additionalMembers0DateOfB"));
	}
	/**
	 * additionalMembers0DateOfBirthDate: with specific test context and state.
	 *		.id : policyHolder2Dob
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : additionalMembers[0].dateOfBirth.date
	 * 		.classIndex : 11
	 */
	protected TextGuiTestObject text_additionalMembers0DateOfB(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_additionalMembers0DateOfB"), anchor, flags);
	}
	
	/**
	 * additionalMembers0FirstName: with default state.
	 *		.id : family1Firstname
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : additionalMembers[0].firstName
	 * 		.classIndex : 9
	 */
	protected TextGuiTestObject text_additionalMembers0FirstNa() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_additionalMembers0FirstNa"));
	}
	/**
	 * additionalMembers0FirstName: with specific test context and state.
	 *		.id : family1Firstname
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : additionalMembers[0].firstName
	 * 		.classIndex : 9
	 */
	protected TextGuiTestObject text_additionalMembers0FirstNa(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_additionalMembers0FirstNa"), anchor, flags);
	}
	
	/**
	 * additionalMembers0Surname: with default state.
	 *		.id : family1Surname
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : additionalMembers[0].surname
	 * 		.classIndex : 10
	 */
	protected TextGuiTestObject text_additionalMembers0Surname() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_additionalMembers0Surname"));
	}
	/**
	 * additionalMembers0Surname: with specific test context and state.
	 *		.id : family1Surname
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : additionalMembers[0].surname
	 * 		.classIndex : 10
	 */
	protected TextGuiTestObject text_additionalMembers0Surname(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_additionalMembers0Surname"), anchor, flags);
	}
	
	

	protected Add_Second_PersonHelper()
	{
		setScriptName("BreakDown_Cover_MK2.Variations.Add_Second_Person");
	}
	
}

