// DO NOT EDIT: This file is automatically generated.
//
// Only the associated template file should be edited directly.
// Helper class files are automatically regenerated from the template
// files at various times, including record actions and test object
// insertion actions.  Any changes made directly to a helper class
// file will be lost when automatically updated.

package resources.Verification;

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
 * Script Name   : <b>MAF_Road_Textual</b><br>
 * Generated     : <b>2015/06/02 10:09:59</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows 7 x86 6.1 <br>
 * 
 * @since  June 02, 2015
 * @author horned
 */
public abstract class MAF_Road_TextualHelper extends RationalTestScript
{
	/**
	 * bd_important_information: with default state.
	 *		.id : bd_important_information
	 * 		.title : 
	 * 		.class : Html.DIV
	 * 		.classIndex : 2
	 */
	protected GuiTestObject html_bd_important_information() 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_bd_important_information"));
	}
	/**
	 * bd_important_information: with specific test context and state.
	 *		.id : bd_important_information
	 * 		.title : 
	 * 		.class : Html.DIV
	 * 		.classIndex : 2
	 */
	protected GuiTestObject html_bd_important_information(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_bd_important_information"), anchor, flags);
	}
	
	/**
	 * scrollSummary: with default state.
	 *		.id : scroll-summary
	 * 		.class : Html.DIV
	 * 		.title : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject html_scrollSummary() 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_scrollSummary"));
	}
	/**
	 * scrollSummary: with specific test context and state.
	 *		.id : scroll-summary
	 * 		.class : Html.DIV
	 * 		.title : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject html_scrollSummary(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_scrollSummary"), anchor, flags);
	}
	
	

	protected MAF_Road_TextualHelper()
	{
		setScriptName("Verification.MAF_Road_Textual");
	}
	
}

