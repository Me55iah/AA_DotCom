// DO NOT EDIT: This file is automatically generated.
//
// Only the associated template file should be edited directly.
// Helper class files are automatically regenerated from the template
// files at various times, including record actions and test object
// insertion actions.  Any changes made directly to a helper class
// file will be lost when automatically updated.

package resources.Aggregators.Home;
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
 * Script Name   : <b>Retrieve_Home_Contents</b><br>
 * Generated     : <b>2015/05/07 09:24:40</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows 7 x86 6.1 <br>
 * 
 * @since  May 07, 2015
 * @author horned
 */
public abstract class Retrieve_Home_ContentsHelper extends Utilities.AA_SuperHelper
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
	 * GetAQuotesubmit: with default state.
	 *		.id : HomeInsQuoteBuyButton
	 * 		.type : submit
	 * 		.value : Get a quote
	 * 		.title : 
	 * 		.class : Html.INPUT.submit
	 * 		.name : Submit
	 * 		.classIndex : 0
	 */
	protected GuiTestObject button_getAQuotesubmit() 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_getAQuotesubmit"));
	}
	/**
	 * GetAQuotesubmit: with specific test context and state.
	 *		.id : HomeInsQuoteBuyButton
	 * 		.type : submit
	 * 		.value : Get a quote
	 * 		.title : 
	 * 		.class : Html.INPUT.submit
	 * 		.name : Submit
	 * 		.classIndex : 0
	 */
	protected GuiTestObject button_getAQuotesubmit(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_getAQuotesubmit"), anchor, flags);
	}
	
	/**
	 * GetAQuotesubmit: with default state.
	 *		.id : HomeInsQuoteBuyButton
	 * 		.type : submit
	 * 		.value : Get a quote
	 * 		.title : 
	 * 		.class : Html.INPUT.submit
	 * 		.name : Submit
	 * 		.classIndex : 0
	 */
	protected GuiTestObject button_getAQuotesubmit2() 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_getAQuotesubmit2"));
	}
	/**
	 * GetAQuotesubmit: with specific test context and state.
	 *		.id : HomeInsQuoteBuyButton
	 * 		.type : submit
	 * 		.value : Get a quote
	 * 		.title : 
	 * 		.class : Html.INPUT.submit
	 * 		.name : Submit
	 * 		.classIndex : 0
	 */
	protected GuiTestObject button_getAQuotesubmit2(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_getAQuotesubmit2"), anchor, flags);
	}
	
	/**
	 * GetQuotesubmit: with default state.
	 *		.id : HomeInsInsurerBuyButton
	 * 		.type : submit
	 * 		.value : Get quote
	 * 		.title : 
	 * 		.class : Html.INPUT.submit
	 * 		.name : Submit
	 * 		.classIndex : 0
	 */
	protected GuiTestObject button_getQuotesubmit() 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_getQuotesubmit"));
	}
	/**
	 * GetQuotesubmit: with specific test context and state.
	 *		.id : HomeInsInsurerBuyButton
	 * 		.type : submit
	 * 		.value : Get quote
	 * 		.title : 
	 * 		.class : Html.INPUT.submit
	 * 		.name : Submit
	 * 		.classIndex : 0
	 */
	protected GuiTestObject button_getQuotesubmit(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_getQuotesubmit"), anchor, flags);
	}
	
	/**
	 * HomeInsuranceYourQuotesTheAA: with default state.
	 *		.title : RegularExpression(Insurance)
	 * 		.class : Html.HtmlDocument
	 * 		.url : RegularExpression(theaa)
	 */
	protected DocumentTestObject document_homeInsuranceYourQuot() 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_homeInsuranceYourQuot"));
	}
	/**
	 * HomeInsuranceYourQuotesTheAA: with specific test context and state.
	 *		.title : RegularExpression(Insurance)
	 * 		.class : Html.HtmlDocument
	 * 		.url : RegularExpression(theaa)
	 */
	protected DocumentTestObject document_homeInsuranceYourQuot(TestObject anchor, long flags) 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_homeInsuranceYourQuot"), anchor, flags);
	}
	
	/**
	 * daytime: with default state.
	 *		.id : daytime
	 * 		.title : 
	 * 		.class : Html.INPUT.tel
	 * 		.name : daytime
	 * 		.classIndex : 0
	 */
	protected GuiTestObject html_daytime() 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_daytime"));
	}
	/**
	 * daytime: with specific test context and state.
	 *		.id : daytime
	 * 		.title : 
	 * 		.class : Html.INPUT.tel
	 * 		.name : daytime
	 * 		.classIndex : 0
	 */
	protected GuiTestObject html_daytime(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_daytime"), anchor, flags);
	}
	
	/**
	 * mobile: with default state.
	 *		.id : mobile
	 * 		.title : 
	 * 		.class : Html.INPUT.tel
	 * 		.name : mobile
	 * 		.classIndex : 1
	 */
	protected GuiTestObject html_mobile() 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_mobile"));
	}
	/**
	 * mobile: with specific test context and state.
	 *		.id : mobile
	 * 		.title : 
	 * 		.class : Html.INPUT.tel
	 * 		.name : mobile
	 * 		.classIndex : 1
	 */
	protected GuiTestObject html_mobile(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_mobile"), anchor, flags);
	}
	
	/**
	 * _Change: with default state.
	 *		.text : ...change
	 * 		.id : 
	 * 		.href : RegularExpression(home-insurance)
	 * 		.title : 
	 * 		.class : Html.A
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject link__Change() 
	{
		return new GuiTestObject(
                        getMappedTestObject("link__Change"));
	}
	/**
	 * _Change: with specific test context and state.
	 *		.text : ...change
	 * 		.id : 
	 * 		.href : RegularExpression(home-insurance)
	 * 		.title : 
	 * 		.class : Html.A
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject link__Change(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("link__Change"), anchor, flags);
	}
	
	/**
	 * INSURANCETYPEContents: with default state.
	 *		.id : insuranceTypeC
	 * 		.type : radio
	 * 		.value : Contents
	 * 		.title : 
	 * 		.class : Html.INPUT.radio
	 * 		.name : INSURANCETYPE
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject radioButton_insurancetypeConte() 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("radioButton_insurancetypeConte"));
	}
	/**
	 * INSURANCETYPEContents: with specific test context and state.
	 *		.id : insuranceTypeC
	 * 		.type : radio
	 * 		.value : Contents
	 * 		.title : 
	 * 		.class : Html.INPUT.radio
	 * 		.name : INSURANCETYPE
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject radioButton_insurancetypeConte(TestObject anchor, long flags) 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("radioButton_insurancetypeConte"), anchor, flags);
	}
	
	/**
	 * NOOFBEDROOMS1: with default state.
	 *		.id : NOOFBEDROOMS1
	 * 		.type : radio
	 * 		.value : 1
	 * 		.class : Html.INPUT.radio
	 * 		.title : 
	 * 		.name : NOOFBEDROOMS
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject radioButton_noofbedroomS1() 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("radioButton_noofbedroomS1"));
	}
	/**
	 * NOOFBEDROOMS1: with specific test context and state.
	 *		.id : NOOFBEDROOMS1
	 * 		.type : radio
	 * 		.value : 1
	 * 		.class : Html.INPUT.radio
	 * 		.title : 
	 * 		.name : NOOFBEDROOMS
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject radioButton_noofbedroomS1(TestObject anchor, long flags) 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("radioButton_noofbedroomS1"), anchor, flags);
	}
	
	/**
	 * NOOFBEDROOMS2: with default state.
	 *		.id : NOOFBEDROOMS2
	 * 		.type : radio
	 * 		.value : 2
	 * 		.class : Html.INPUT.radio
	 * 		.title : 
	 * 		.name : NOOFBEDROOMS
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject radioButton_noofbedroomS2() 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("radioButton_noofbedroomS2"));
	}
	/**
	 * NOOFBEDROOMS2: with specific test context and state.
	 *		.id : NOOFBEDROOMS2
	 * 		.type : radio
	 * 		.value : 2
	 * 		.class : Html.INPUT.radio
	 * 		.title : 
	 * 		.name : NOOFBEDROOMS
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject radioButton_noofbedroomS2(TestObject anchor, long flags) 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("radioButton_noofbedroomS2"), anchor, flags);
	}
	
	/**
	 * NOOFBEDROOMS3: with default state.
	 *		.id : RegularExpression(NOOFBEDROO)
	 * 		.type : radio
	 * 		.value : 3
	 * 		.title : 
	 * 		.class : Html.INPUT.radio
	 * 		.name : NOOFBEDROOMS
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject radioButton_noofbedroomS3() 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("radioButton_noofbedroomS3"));
	}
	/**
	 * NOOFBEDROOMS3: with specific test context and state.
	 *		.id : RegularExpression(NOOFBEDROO)
	 * 		.type : radio
	 * 		.value : 3
	 * 		.title : 
	 * 		.class : Html.INPUT.radio
	 * 		.name : NOOFBEDROOMS
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject radioButton_noofbedroomS3(TestObject anchor, long flags) 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("radioButton_noofbedroomS3"), anchor, flags);
	}
	
	/**
	 * NOOFBEDROOMS4: with default state.
	 *		.id : NOOFBEDROOMS4
	 * 		.type : radio
	 * 		.value : 4
	 * 		.class : Html.INPUT.radio
	 * 		.title : 
	 * 		.name : NOOFBEDROOMS
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject radioButton_noofbedroomS4() 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("radioButton_noofbedroomS4"));
	}
	/**
	 * NOOFBEDROOMS4: with specific test context and state.
	 *		.id : NOOFBEDROOMS4
	 * 		.type : radio
	 * 		.value : 4
	 * 		.class : Html.INPUT.radio
	 * 		.title : 
	 * 		.name : NOOFBEDROOMS
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject radioButton_noofbedroomS4(TestObject anchor, long flags) 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("radioButton_noofbedroomS4"), anchor, flags);
	}
	
	/**
	 * NOOFBEDROOMS5: with default state.
	 *		.id : NOOFBEDROOMS5
	 * 		.type : radio
	 * 		.value : 5
	 * 		.class : Html.INPUT.radio
	 * 		.title : 
	 * 		.name : NOOFBEDROOMS
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject radioButton_noofbedroomS5() 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("radioButton_noofbedroomS5"));
	}
	/**
	 * NOOFBEDROOMS5: with specific test context and state.
	 *		.id : NOOFBEDROOMS5
	 * 		.type : radio
	 * 		.value : 5
	 * 		.class : Html.INPUT.radio
	 * 		.title : 
	 * 		.name : NOOFBEDROOMS
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject radioButton_noofbedroomS5(TestObject anchor, long flags) 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("radioButton_noofbedroomS5"), anchor, flags);
	}
	
	/**
	 * email: with default state.
	 *		.id : email
	 * 		.title : 
	 * 		.class : Html.INPUT.email
	 * 		.name : email
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_email() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_email"));
	}
	/**
	 * email: with specific test context and state.
	 *		.id : email
	 * 		.title : 
	 * 		.class : Html.INPUT.email
	 * 		.name : email
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_email(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_email"), anchor, flags);
	}
	
	

	protected Retrieve_Home_ContentsHelper()
	{
		setScriptName("Aggregators.Home.Retrieve_Home_Contents");
	}
	
}

