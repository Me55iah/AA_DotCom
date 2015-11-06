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
 * Script Name   : <b>Type_Selector</b><br>
 * Generated     : <b>2015/06/24 13:40:20</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows 7 x86 6.1 <br>
 * 
 * @since  June 24, 2015
 * @author horned
 */
public abstract class Type_SelectorHelper extends Utilities.AA_SuperHelper
{
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
	 * INSURANCETYPEBuildingsAndContents: with default state.
	 *		.id : insuranceTypeBC
	 * 		.type : radio
	 * 		.value : Buildings and Contents
	 * 		.title : 
	 * 		.class : Html.INPUT.radio
	 * 		.name : INSURANCETYPE
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject radioButton_insurancetypeBuild() 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("radioButton_insurancetypeBuild"));
	}
	/**
	 * INSURANCETYPEBuildingsAndContents: with specific test context and state.
	 *		.id : insuranceTypeBC
	 * 		.type : radio
	 * 		.value : Buildings and Contents
	 * 		.title : 
	 * 		.class : Html.INPUT.radio
	 * 		.name : INSURANCETYPE
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject radioButton_insurancetypeBuild(TestObject anchor, long flags) 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("radioButton_insurancetypeBuild"), anchor, flags);
	}
	
	/**
	 * INSURANCETYPEBuildings: with default state.
	 *		.id : insuranceTypeB
	 * 		.type : radio
	 * 		.value : Buildings
	 * 		.title : 
	 * 		.class : Html.INPUT.radio
	 * 		.name : INSURANCETYPE
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject radioButton_insurancetypeBuild2() 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("radioButton_insurancetypeBuild2"));
	}
	/**
	 * INSURANCETYPEBuildings: with specific test context and state.
	 *		.id : insuranceTypeB
	 * 		.type : radio
	 * 		.value : Buildings
	 * 		.title : 
	 * 		.class : Html.INPUT.radio
	 * 		.name : INSURANCETYPE
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject radioButton_insurancetypeBuild2(TestObject anchor, long flags) 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("radioButton_insurancetypeBuild2"), anchor, flags);
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
	
	

	protected Type_SelectorHelper()
	{
		setScriptName("Aggregators.Home.Type_Selector");
	}
	
}

