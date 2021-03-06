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
 * Script Name   : <b>Manual_Vehicle_Entry</b><br>
 * Generated     : <b>2015/01/27 12:13:56</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows XP x86 5.1 <br>
 * 
 * @since  January 27, 2015
 * @author horned
 */
public abstract class Manual_Vehicle_EntryHelper extends RationalTestScript
{
	/**
	 * Continuesubmit: with default state.
	 *		.id : continue
	 * 		.type : submit
	 * 		.value : Continue
	 * 		.class : Html.BUTTON
	 * 		.title : 
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
	 *		.id : continue
	 * 		.type : submit
	 * 		.value : Continue
	 * 		.class : Html.BUTTON
	 * 		.title : 
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject button_continuesubmit(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_continuesubmit"), anchor, flags);
	}
	
	/**
	 * Auto: with default state.
	 *		.id : transmission-auto-label
	 * 		.value : Auto
	 * 		.class : Html.LABEL
	 * 		.title : 
	 * 		.classIndex : 14
	 */
	protected GuiTestObject label_auto() 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_auto"));
	}
	/**
	 * Auto: with specific test context and state.
	 *		.id : transmission-auto-label
	 * 		.value : Auto
	 * 		.class : Html.LABEL
	 * 		.title : 
	 * 		.classIndex : 14
	 */
	protected GuiTestObject label_auto(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_auto"), anchor, flags);
	}
	
	/**
	 * Diesel: with default state.
	 *		.id : fuel-petrol
	 * 		.value :  Diesel 
	 * 		.class : Html.LABEL
	 * 		.title : 
	 * 		.classIndex : 9
	 */
	protected GuiTestObject label_diesel() 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_diesel"));
	}
	/**
	 * Diesel: with specific test context and state.
	 *		.id : fuel-petrol
	 * 		.value :  Diesel 
	 * 		.class : Html.LABEL
	 * 		.title : 
	 * 		.classIndex : 9
	 */
	protected GuiTestObject label_diesel(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_diesel"), anchor, flags);
	}
	
	/**
	 * Manual: with default state.
	 *		.id : transmission-manual-label
	 * 		.value : Manual
	 * 		.class : Html.LABEL
	 * 		.title : 
	 * 		.classIndex : 13
	 */
	protected GuiTestObject label_manual() 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_manual"));
	}
	/**
	 * Manual: with specific test context and state.
	 *		.id : transmission-manual-label
	 * 		.value : Manual
	 * 		.class : Html.LABEL
	 * 		.title : 
	 * 		.classIndex : 13
	 */
	protected GuiTestObject label_manual(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_manual"), anchor, flags);
	}
	
	/**
	 * Other: with default state.
	 *		.id : fuel-petrol
	 * 		.value :  Other 
	 * 		.class : Html.LABEL
	 * 		.title : 
	 * 		.classIndex : 10
	 */
	protected GuiTestObject label_other() 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_other"));
	}
	/**
	 * Other: with specific test context and state.
	 *		.id : fuel-petrol
	 * 		.value :  Other 
	 * 		.class : Html.LABEL
	 * 		.title : 
	 * 		.classIndex : 10
	 */
	protected GuiTestObject label_other(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_other"), anchor, flags);
	}
	
	/**
	 * Petrol: with default state.
	 *		.id : fuel-petrol
	 * 		.value :  Petrol 
	 * 		.class : Html.LABEL
	 * 		.title : 
	 * 		.classIndex : 8
	 */
	protected GuiTestObject label_petrol() 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_petrol"));
	}
	/**
	 * Petrol: with specific test context and state.
	 *		.id : fuel-petrol
	 * 		.value :  Petrol 
	 * 		.class : Html.LABEL
	 * 		.title : 
	 * 		.classIndex : 8
	 */
	protected GuiTestObject label_petrol(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_petrol"), anchor, flags);
	}
	
	/**
	 * registrationYear: with default state.
	 *		.text : Please select year 2015 2014 2013 2012 2011 2010 2009 2008 2007 2006 2005 2004 2 ...
	 * 		.id : year-of-reg
	 * 		.class : Html.SELECT
	 * 		.title : 
	 * 		.name : registrationYear
	 * 		.classIndex : 0
	 */
	protected SelectGuiSubitemTestObject list_registrationYear() 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_registrationYear"));
	}
	/**
	 * registrationYear: with specific test context and state.
	 *		.text : Please select year 2015 2014 2013 2012 2011 2010 2009 2008 2007 2006 2005 2004 2 ...
	 * 		.id : year-of-reg
	 * 		.class : Html.SELECT
	 * 		.title : 
	 * 		.name : registrationYear
	 * 		.classIndex : 0
	 */
	protected SelectGuiSubitemTestObject list_registrationYear(TestObject anchor, long flags) 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_registrationYear"), anchor, flags);
	}
	
	/**
	 * vehicleManufacture: with default state.
	 *		.text : Please select make Ac Aixam Alfa romeo Allard Alpina Alvis Amc Ant Arm siddeley  ...
	 * 		.id : make
	 * 		.class : Html.SELECT
	 * 		.title : 
	 * 		.name : vehicleManufacture
	 * 		.classIndex : 1
	 */
	protected SelectGuiSubitemTestObject list_vehicleManufacture() 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_vehicleManufacture"));
	}
	/**
	 * vehicleManufacture: with specific test context and state.
	 *		.text : Please select make Ac Aixam Alfa romeo Allard Alpina Alvis Amc Ant Arm siddeley  ...
	 * 		.id : make
	 * 		.class : Html.SELECT
	 * 		.title : 
	 * 		.name : vehicleManufacture
	 * 		.classIndex : 1
	 */
	protected SelectGuiSubitemTestObject list_vehicleManufacture(TestObject anchor, long flags) 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_vehicleManufacture"), anchor, flags);
	}
	
	/**
	 * vehicleModel: with default state.
	 *		.text : Please select model
	 * 		.id : model
	 * 		.class : Html.SELECT
	 * 		.title : 
	 * 		.name : vehicleModel
	 * 		.classIndex : 2
	 */
	protected SelectGuiSubitemTestObject list_vehicleModel() 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_vehicleModel"));
	}
	/**
	 * vehicleModel: with specific test context and state.
	 *		.text : Please select model
	 * 		.id : model
	 * 		.class : Html.SELECT
	 * 		.title : 
	 * 		.name : vehicleModel
	 * 		.classIndex : 2
	 */
	protected SelectGuiSubitemTestObject list_vehicleModel(TestObject anchor, long flags) 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_vehicleModel"), anchor, flags);
	}
	
	

	protected Manual_Vehicle_EntryHelper()
	{
		setScriptName("Basics_Road.Manual_Vehicle_Entry");
	}
	
}

