// DO NOT EDIT: This file is automatically generated.
//
// Only the associated template file should be edited directly.
// Helper class files are automatically regenerated from the template
// files at various times, including record actions and test object
// insertion actions.  Any changes made directly to a helper class
// file will be lost when automatically updated.

package resources.Motor;
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
 * Script Name   : <b>MVD</b><br>
 * Generated     : <b>2015/02/16 09:31:42</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows XP x86 5.1 <br>
 * 
 * @since  February 16, 2015
 * @author horned
 */
public abstract class MVDHelper extends Utilities.AA_SuperHelper
{
	/**
	 * iE: with default state.
	 *		.class : Html.HtmlBrowser
	 * 		.browserName : MS Internet Explorer
	 * 		.processName : iexplore.exe
	 */
	protected BrowserTestObject browser_iE() 
	{
		return new BrowserTestObject(
                        getMappedTestObject("browser_iE"));
	}
	/**
	 * iE: with specific test context and state.
	 *		.class : Html.HtmlBrowser
	 * 		.browserName : MS Internet Explorer
	 * 		.processName : iexplore.exe
	 */
	protected BrowserTestObject browser_iE(TestObject anchor, long flags) 
	{
		return new BrowserTestObject(
                        getMappedTestObject("browser_iE"), anchor, flags);
	}
	
	/**
	 * OtherVehiclePolicyHoldertrue: with default state.
	 *		.id : policyholder-other-car
	 * 		.type : checkbox
	 * 		.value : true
	 * 		.title : 
	 * 		.class : Html.INPUT.checkbox
	 * 		.name : aa.motor.drivers[0].otherVehiclePolicyHolder
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject checkBox_aaMotorDriversOther_1() 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("checkBox_aaMotorDriversOther_1"));
	}
	/**
	 * OtherVehiclePolicyHoldertrue: with specific test context and state.
	 *		.id : policyholder-other-car
	 * 		.type : checkbox
	 * 		.value : true
	 * 		.title : 
	 * 		.class : Html.INPUT.checkbox
	 * 		.name : aa.motor.drivers[0].otherVehiclePolicyHolder
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject checkBox_aaMotorDriversOther_1(TestObject anchor, long flags) 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("checkBox_aaMotorDriversOther_1"), anchor, flags);
	}
	
	/**
	 * OtherVehicleCompanyCarMainDrivertrue: with default state.
	 *		.id : company-car
	 * 		.type : checkbox
	 * 		.value : true
	 * 		.title : 
	 * 		.class : Html.INPUT.checkbox
	 * 		.name : aa.motor.drivers[0].otherVehicleCompanyCarMainDriver
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject checkBox_aaMotorDriversOther_2() 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("checkBox_aaMotorDriversOther_2"));
	}
	/**
	 * OtherVehicleCompanyCarMainDrivertrue: with specific test context and state.
	 *		.id : company-car
	 * 		.type : checkbox
	 * 		.value : true
	 * 		.title : 
	 * 		.class : Html.INPUT.checkbox
	 * 		.name : aa.motor.drivers[0].otherVehicleCompanyCarMainDriver
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject checkBox_aaMotorDriversOther_2(TestObject anchor, long flags) 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("checkBox_aaMotorDriversOther_2"), anchor, flags);
	}
	
	/**
	 * OtherVehicleNamedDrivertrue: with default state.
	 *		.id : named-driver-other-car
	 * 		.type : checkbox
	 * 		.value : true
	 * 		.title : 
	 * 		.class : Html.INPUT.checkbox
	 * 		.name : aa.motor.drivers[0].otherVehicleNamedDriver
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject checkBox_aaMotorDriversOther_3() 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("checkBox_aaMotorDriversOther_3"));
	}
	/**
	 * OtherVehicleNamedDrivertrue: with specific test context and state.
	 *		.id : named-driver-other-car
	 * 		.type : checkbox
	 * 		.value : true
	 * 		.title : 
	 * 		.class : Html.INPUT.checkbox
	 * 		.name : aa.motor.drivers[0].otherVehicleNamedDriver
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject checkBox_aaMotorDriversOther_3(TestObject anchor, long flags) 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("checkBox_aaMotorDriversOther_3"), anchor, flags);
	}
	
	/**
	 * CarInsuranceTheCarTheAA: with default state.
	 *		.title : Car Insurance: The car - The AA
	 * 		.class : Html.HtmlDocument
	 * 		.url : RegularExpression(car-insurance)
	 */
	protected DocumentTestObject document_carInsuranceTheCarThe() 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_carInsuranceTheCarThe"));
	}
	/**
	 * CarInsuranceTheCarTheAA: with specific test context and state.
	 *		.title : Car Insurance: The car - The AA
	 * 		.class : Html.HtmlDocument
	 * 		.url : RegularExpression(car-insurance)
	 */
	protected DocumentTestObject document_carInsuranceTheCarThe(TestObject anchor, long flags) 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_carInsuranceTheCarThe"), anchor, flags);
	}
	
	/**
	 * TheCarTheCarPleaseTakeReasonableCareToAnswerAllOfThe: with default state.
	 *		.id : 
	 * 		.title : 
	 * 		.class : Html.FORM
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject form_theCarTheCarPleaseTakeRea() 
	{
		return new GuiTestObject(
                        getMappedTestObject("form_theCarTheCarPleaseTakeRea"));
	}
	/**
	 * TheCarTheCarPleaseTakeReasonableCareToAnswerAllOfThe: with specific test context and state.
	 *		.id : 
	 * 		.title : 
	 * 		.class : Html.FORM
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject form_theCarTheCarPleaseTakeRea(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("form_theCarTheCarPleaseTakeRea"), anchor, flags);
	}
	
	/**
	 * OtherVehicleCompanyStillUsingfalse: with default state.
	 *		.id : using-company-car-no
	 * 		.type : radio
	 * 		.value : false
	 * 		.title : 
	 * 		.class : Html.INPUT.radio
	 * 		.name : aa.motor.drivers[0].otherVehicleCompanyStillUsing
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject radioButton_otherVehicleCompan() 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("radioButton_otherVehicleCompan"));
	}
	/**
	 * OtherVehicleCompanyStillUsingfalse: with specific test context and state.
	 *		.id : using-company-car-no
	 * 		.type : radio
	 * 		.value : false
	 * 		.title : 
	 * 		.class : Html.INPUT.radio
	 * 		.name : aa.motor.drivers[0].otherVehicleCompanyStillUsing
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject radioButton_otherVehicleCompan(TestObject anchor, long flags) 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("radioButton_otherVehicleCompan"), anchor, flags);
	}
	
	/**
	 * OtherVehicleCompanyCarPersonalUsefalse: with default state.
	 *		.id : sdp-company-car-no
	 * 		.type : radio
	 * 		.value : false
	 * 		.title : 
	 * 		.class : Html.INPUT.radio
	 * 		.name : aa.motor.drivers[0].otherVehicleCompanyCarPersonalUse
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject radioButton_otherVehicleCompan2() 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("radioButton_otherVehicleCompan2"));
	}
	/**
	 * OtherVehicleCompanyCarPersonalUsefalse: with specific test context and state.
	 *		.id : sdp-company-car-no
	 * 		.type : radio
	 * 		.value : false
	 * 		.title : 
	 * 		.class : Html.INPUT.radio
	 * 		.name : aa.motor.drivers[0].otherVehicleCompanyCarPersonalUse
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject radioButton_otherVehicleCompan2(TestObject anchor, long flags) 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("radioButton_otherVehicleCompan2"), anchor, flags);
	}
	
	/**
	 * OtherVehicleCompanyStillUsingtrue: with default state.
	 *		.id : using-company-car-yes
	 * 		.type : radio
	 * 		.value : true
	 * 		.title : 
	 * 		.class : Html.INPUT.radio
	 * 		.name : aa.motor.drivers[0].otherVehicleCompanyStillUsing
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject radioButton_otherVehicleCompan3() 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("radioButton_otherVehicleCompan3"));
	}
	/**
	 * OtherVehicleCompanyStillUsingtrue: with specific test context and state.
	 *		.id : using-company-car-yes
	 * 		.type : radio
	 * 		.value : true
	 * 		.title : 
	 * 		.class : Html.INPUT.radio
	 * 		.name : aa.motor.drivers[0].otherVehicleCompanyStillUsing
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject radioButton_otherVehicleCompan3(TestObject anchor, long flags) 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("radioButton_otherVehicleCompan3"), anchor, flags);
	}
	
	/**
	 * OtherVehicleCompanyCarPersonalUsetrue: with default state.
	 *		.id : sdp-company-car-yes
	 * 		.type : radio
	 * 		.value : true
	 * 		.title : 
	 * 		.class : Html.INPUT.radio
	 * 		.name : aa.motor.drivers[0].otherVehicleCompanyCarPersonalUse
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject radioButton_otherVehicleCompan4() 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("radioButton_otherVehicleCompan4"));
	}
	/**
	 * OtherVehicleCompanyCarPersonalUsetrue: with specific test context and state.
	 *		.id : sdp-company-car-yes
	 * 		.type : radio
	 * 		.value : true
	 * 		.title : 
	 * 		.class : Html.INPUT.radio
	 * 		.name : aa.motor.drivers[0].otherVehicleCompanyCarPersonalUse
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject radioButton_otherVehicleCompan4(TestObject anchor, long flags) 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("radioButton_otherVehicleCompan4"), anchor, flags);
	}
	
	/**
	 * OtherVehicleYearsContinuousUse: with default state.
	 *		.id : other-vehicles-continuous-use
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : aa.motor.drivers[0].otherVehicleYearsContinuousUse
	 * 		.classIndex : 4
	 */
	protected TextGuiTestObject text_otherVehicleYearsContinuo() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_otherVehicleYearsContinuo"));
	}
	/**
	 * OtherVehicleYearsContinuousUse: with specific test context and state.
	 *		.id : other-vehicles-continuous-use
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : aa.motor.drivers[0].otherVehicleYearsContinuousUse
	 * 		.classIndex : 4
	 */
	protected TextGuiTestObject text_otherVehicleYearsContinuo(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_otherVehicleYearsContinuo"), anchor, flags);
	}
	
	/**
	 * OtherVehicleYearsNCD: with default state.
	 *		.id : other-vehicles-no-claims-discount
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : aa.motor.drivers[0].otherVehicleYearsNCD
	 * 		.classIndex : 3
	 */
	protected TextGuiTestObject text_otherVehicleYearsNCD() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_otherVehicleYearsNCD"));
	}
	/**
	 * OtherVehicleYearsNCD: with specific test context and state.
	 *		.id : other-vehicles-no-claims-discount
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : aa.motor.drivers[0].otherVehicleYearsNCD
	 * 		.classIndex : 3
	 */
	protected TextGuiTestObject text_otherVehicleYearsNCD(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_otherVehicleYearsNCD"), anchor, flags);
	}
	
	

	protected MVDHelper()
	{
		setScriptName("Motor.MVD");
	}
	
}

