// DO NOT EDIT: This file is automatically generated.
//
// Only the associated template file should be edited directly.
// Helper class files are automatically regenerated from the template
// files at various times, including record actions and test object
// insertion actions.  Any changes made directly to a helper class
// file will be lost when automatically updated.

package resources.HER;

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
 * Script Name   : <b>Your_Details</b><br>
 * Generated     : <b>2014/01/14 14:15:00</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows XP x86 5.1 <br>
 * 
 * @since  January 14, 2014
 * @author courtl
 */
public abstract class Your_DetailsHelper extends RationalTestScript
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
	 * FindYourAddress: with default state.
	 *		.id : findAddress
	 * 		.type : image
	 * 		.value : Find my address
	 * 		.title : 
	 * 		.class : Html.INPUT.image
	 * 		.name : lookupAddress
	 * 		.classIndex : 0
	 */
	protected GuiTestObject button_findYourAddress() 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_findYourAddress"));
	}
	/**
	 * FindYourAddress: with specific test context and state.
	 *		.id : findAddress
	 * 		.type : image
	 * 		.value : Find my address
	 * 		.title : 
	 * 		.class : Html.INPUT.image
	 * 		.name : lookupAddress
	 * 		.classIndex : 0
	 */
	protected GuiTestObject button_findYourAddress(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_findYourAddress"), anchor, flags);
	}
	
	/**
	 * Next: with default state.
	 *		.id : next-you
	 * 		.type : image
	 * 		.value : 
	 * 		.title : 
	 * 		.class : Html.INPUT.image
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject button_next() 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_next"));
	}
	/**
	 * Next: with specific test context and state.
	 *		.id : next-you
	 * 		.type : image
	 * 		.value : 
	 * 		.title : 
	 * 		.class : Html.INPUT.image
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject button_next(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_next"), anchor, flags);
	}
	
	/**
	 * HomeEmergencyResponseYourDetailsTheAA: with default state.
	 *		.title : Home Membership | Your details | The AA
	 * 		.class : Html.HtmlDocument
	 * 		.url : RegularExpression(.*)
	 */
	protected DocumentTestObject document_homeEmergencyResponse() 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_homeEmergencyResponse"));
	}
	/**
	 * HomeEmergencyResponseYourDetailsTheAA: with specific test context and state.
	 *		.title : Home Membership | Your details | The AA
	 * 		.class : Html.HtmlDocument
	 * 		.url : RegularExpression(.*)
	 */
	protected DocumentTestObject document_homeEmergencyResponse(TestObject anchor, long flags) 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_homeEmergencyResponse"), anchor, flags);
	}
	
	/**
	 * propertyType: with default state.
	 *		.text : Please select Flat/Maisonette Bungalow Detached Semi-detached Terraced Mobile or ...
	 * 		.id : propertyType
	 * 		.title : 
	 * 		.class : Html.SELECT
	 * 		.name : propertyType
	 * 		.classIndex : 0
	 */
	protected SelectGuiSubitemTestObject list_propertyType() 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_propertyType"));
	}
	/**
	 * propertyType: with specific test context and state.
	 *		.text : Please select Flat/Maisonette Bungalow Detached Semi-detached Terraced Mobile or ...
	 * 		.id : propertyType
	 * 		.title : 
	 * 		.class : Html.SELECT
	 * 		.name : propertyType
	 * 		.classIndex : 0
	 */
	protected SelectGuiSubitemTestObject list_propertyType(TestObject anchor, long flags) 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_propertyType"), anchor, flags);
	}
	
	/**
	 * title3: with default state.
	 *		.id : title-3
	 * 		.type : radio
	 * 		.value : 3
	 * 		.title : 
	 * 		.class : Html.INPUT.radio
	 * 		.name : title
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject radioButton_title_Miss() 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("radioButton_title_Miss"));
	}
	/**
	 * title3: with specific test context and state.
	 *		.id : title-3
	 * 		.type : radio
	 * 		.value : 3
	 * 		.title : 
	 * 		.class : Html.INPUT.radio
	 * 		.name : title
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject radioButton_title_Miss(TestObject anchor, long flags) 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("radioButton_title_Miss"), anchor, flags);
	}
	
	/**
	 * title1: with default state.
	 *		.id : title-1
	 * 		.type : radio
	 * 		.value : 1
	 * 		.title : 
	 * 		.class : Html.INPUT.radio
	 * 		.name : title
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject radioButton_title_Mr() 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("radioButton_title_Mr"));
	}
	/**
	 * title1: with specific test context and state.
	 *		.id : title-1
	 * 		.type : radio
	 * 		.value : 1
	 * 		.title : 
	 * 		.class : Html.INPUT.radio
	 * 		.name : title
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject radioButton_title_Mr(TestObject anchor, long flags) 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("radioButton_title_Mr"), anchor, flags);
	}
	
	/**
	 * title2: with default state.
	 *		.id : title-2
	 * 		.type : radio
	 * 		.value : 2
	 * 		.title : 
	 * 		.class : Html.INPUT.radio
	 * 		.name : title
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject radioButton_title_Mrs() 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("radioButton_title_Mrs"));
	}
	/**
	 * title2: with specific test context and state.
	 *		.id : title-2
	 * 		.type : radio
	 * 		.value : 2
	 * 		.title : 
	 * 		.class : Html.INPUT.radio
	 * 		.name : title
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject radioButton_title_Mrs(TestObject anchor, long flags) 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("radioButton_title_Mrs"), anchor, flags);
	}
	
	/**
	 * title4: with default state.
	 *		.id : title-4
	 * 		.type : radio
	 * 		.value : 4
	 * 		.title : 
	 * 		.class : Html.INPUT.radio
	 * 		.name : title
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject radioButton_title_Ms() 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("radioButton_title_Ms"));
	}
	/**
	 * title4: with specific test context and state.
	 *		.id : title-4
	 * 		.type : radio
	 * 		.value : 4
	 * 		.title : 
	 * 		.class : Html.INPUT.radio
	 * 		.name : title
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject radioButton_title_Ms(TestObject anchor, long flags) 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("radioButton_title_Ms"), anchor, flags);
	}
	
	/**
	 * addr1: with default state.
	 *		.id : addr1
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : addr1
	 * 		.classIndex : 6
	 */
	protected TextGuiTestObject text_addr1() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_addr1"));
	}
	/**
	 * addr1: with specific test context and state.
	 *		.id : addr1
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : addr1
	 * 		.classIndex : 6
	 */
	protected TextGuiTestObject text_addr1(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_addr1"), anchor, flags);
	}
	
	/**
	 * dob: with default state.
	 *		.id : dob
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : dob
	 * 		.classIndex : 2
	 */
	protected TextGuiTestObject text_dob() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_dob"));
	}
	/**
	 * dob: with specific test context and state.
	 *		.id : dob
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : dob
	 * 		.classIndex : 2
	 */
	protected TextGuiTestObject text_dob(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_dob"), anchor, flags);
	}
	
	/**
	 * email: with default state.
	 *		.id : email
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : email
	 * 		.classIndex : 3
	 */
	protected TextGuiTestObject text_email() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_email"));
	}
	/**
	 * email: with specific test context and state.
	 *		.id : email
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : email
	 * 		.classIndex : 3
	 */
	protected TextGuiTestObject text_email(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_email"), anchor, flags);
	}
	
	/**
	 * firstName: with default state.
	 *		.id : firstName
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : firstName
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_firstName() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_firstName"));
	}
	/**
	 * firstName: with specific test context and state.
	 *		.id : firstName
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : firstName
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_firstName(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_firstName"), anchor, flags);
	}
	
	/**
	 * postcode: with default state.
	 *		.id : postcode
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : postcode
	 * 		.classIndex : 7
	 */
	protected TextGuiTestObject text_postcode() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_postcode"));
	}
	/**
	 * postcode: with specific test context and state.
	 *		.id : postcode
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : postcode
	 * 		.classIndex : 7
	 */
	protected TextGuiTestObject text_postcode(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_postcode"), anchor, flags);
	}
	
	/**
	 * surname: with default state.
	 *		.id : surname
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : surname
	 * 		.classIndex : 1
	 */
	protected TextGuiTestObject text_surname() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_surname"));
	}
	/**
	 * surname: with specific test context and state.
	 *		.id : surname
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : surname
	 * 		.classIndex : 1
	 */
	protected TextGuiTestObject text_surname(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_surname"), anchor, flags);
	}
	
	/**
	 * tel: with default state.
	 *		.id : tel
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : tel
	 * 		.classIndex : 4
	 */
	protected TextGuiTestObject text_tel() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_tel"));
	}
	/**
	 * tel: with specific test context and state.
	 *		.id : tel
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : tel
	 * 		.classIndex : 4
	 */
	protected TextGuiTestObject text_tel(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_tel"), anchor, flags);
	}
	
	

	protected Your_DetailsHelper()
	{
		setScriptName("HER.Your_Details");
	}
	
}

