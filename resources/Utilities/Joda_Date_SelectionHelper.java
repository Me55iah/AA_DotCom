// DO NOT EDIT: This file is automatically generated.
//
// Only the associated template file should be edited directly.
// Helper class files are automatically regenerated from the template
// files at various times, including record actions and test object
// insertion actions.  Any changes made directly to a helper class
// file will be lost when automatically updated.

package resources.Utilities;
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
 * Script Name   : <b>Joda_Date_Selection</b><br>
 * Generated     : <b>2015/01/07 15:52:56</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows 7 x86 6.1 <br>
 * 
 * @since  January 07, 2015
 * @author horned
 */
public abstract class Joda_Date_SelectionHelper extends Utilities.AA_SuperHelper
{
	/**
	 * Other_End: with default state.
	 *		.id : other-nights-stay-end
	 * 		.value : Other   
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : RegularExpression(\d\d)
	 */
	protected GuiTestObject label_other_End() 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_other_End"));
	}
	/**
	 * Other_End: with specific test context and state.
	 *		.id : other-nights-stay-end
	 * 		.value : Other   
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : RegularExpression(\d\d)
	 */
	protected GuiTestObject label_other_End(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_other_End"), anchor, flags);
	}
	
	/**
	 * Other_Start: with default state.
	 *		.id : other-nights-stay-start
	 * 		.value : Other   
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : RegularExpression(\d\d)
	 */
	protected GuiTestObject label_other_Start() 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_other_Start"));
	}
	/**
	 * Other_Start: with specific test context and state.
	 *		.id : other-nights-stay-start
	 * 		.value : Other   
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : RegularExpression(\d\d)
	 */
	protected GuiTestObject label_other_Start(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_other_Start"), anchor, flags);
	}
	
	/**
	 * End_Next: with default state.
	 *		.text : next
	 * 		.id : 
	 * 		.href : RegularExpression(.*european-breakdown.*)
	 * 		.title : 
	 * 		.class : Html.A
	 * 		.name : 
	 * 		.classIndex : 3
	 */
	protected GuiTestObject link_end_Next() 
	{
		return new GuiTestObject(
                        getMappedTestObject("link_end_Next"));
	}
	/**
	 * End_Next: with specific test context and state.
	 *		.text : next
	 * 		.id : 
	 * 		.href : RegularExpression(.*european-breakdown.*)
	 * 		.title : 
	 * 		.class : Html.A
	 * 		.name : 
	 * 		.classIndex : 3
	 */
	protected GuiTestObject link_end_Next(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("link_end_Next"), anchor, flags);
	}
	
	/**
	 * Start_Next: with default state.
	 *		.text : next
	 * 		.id : 
	 * 		.href : RegularExpression(.*european-breakdown.*)
	 * 		.title : 
	 * 		.class : Html.A
	 * 		.name : 
	 * 		.classIndex : 1
	 */
	protected GuiTestObject link_start_Next() 
	{
		return new GuiTestObject(
                        getMappedTestObject("link_start_Next"));
	}
	/**
	 * Start_Next: with specific test context and state.
	 *		.text : next
	 * 		.id : 
	 * 		.href : RegularExpression(.*european-breakdown.*)
	 * 		.title : 
	 * 		.class : Html.A
	 * 		.name : 
	 * 		.classIndex : 1
	 */
	protected GuiTestObject link_start_Next(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("link_start_Next"), anchor, flags);
	}
	
	

	protected Joda_Date_SelectionHelper()
	{
		setScriptName("Utilities.Joda_Date_Selection");
	}
	
}

