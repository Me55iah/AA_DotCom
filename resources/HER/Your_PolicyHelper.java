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
 * Script Name   : <b>Your_Policy</b><br>
 * Generated     : <b>2013/09/03 16:44:32</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows XP x86 5.1 <br>
 * 
 * @since  September 03, 2013
 * @author courtl
 */
public abstract class Your_PolicyHelper extends RationalTestScript
{
	/**
	 * Next: with default state.
	 *		.id : next-policy
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
	 *		.id : next-policy
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
	 * Next: with default state.
	 *		.id : next-policy
	 * 		.type : image
	 * 		.value : 
	 * 		.class : Html.INPUT.image
	 * 		.title : 
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject button_next2() 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_next2"));
	}
	/**
	 * Next: with specific test context and state.
	 *		.id : next-policy
	 * 		.type : image
	 * 		.value : 
	 * 		.class : Html.INPUT.image
	 * 		.title : 
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject button_next2(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_next2"), anchor, flags);
	}
	
	/**
	 * MonthlyByDirectDebit£699AMonthFirstPaymentByDirect: with default state.
	 *		.id : payDD
	 * 		.value :  Monthly by direct debit  (£6.99 a month, first payment by direct debit or credi ...
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 0
	 */
	protected GuiTestObject label_monthlyByDirectDebit£699() 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_monthlyByDirectDebit£699"));
	}
	/**
	 * MonthlyByDirectDebit£699AMonthFirstPaymentByDirect: with specific test context and state.
	 *		.id : payDD
	 * 		.value :  Monthly by direct debit  (£6.99 a month, first payment by direct debit or credi ...
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 0
	 */
	protected GuiTestObject label_monthlyByDirectDebit£699(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_monthlyByDirectDebit£699"), anchor, flags);
	}
	
	

	protected Your_PolicyHelper()
	{
		setScriptName("HER.Your_Policy");
	}
	
}

