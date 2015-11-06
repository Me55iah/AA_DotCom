// DO NOT EDIT: This file is automatically generated.
//
// Only the associated template file should be edited directly.
// Helper class files are automatically regenerated from the template
// files at various times, including record actions and test object
// insertion actions.  Any changes made directly to a helper class
// file will be lost when automatically updated.

package resources.Motor_MK2.The__Car;
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
 * Script Name   : <b>Vehicle_Model_Selection</b><br>
 * Generated     : <b>2015/10/14 13:11:29</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows 7 x86 6.1 <br>
 * 
 * @since  October 14, 2015
 * @author horned
 */
public abstract class Vehicle_Model_SelectionHelper extends Utilities.AA_SuperHelper
{
	/**
	 * CarInsuranceTheCarTheAA: with default state.
	 *		.title : RegularExpression(Car Insurance)
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
	 *		.title : RegularExpression(Car Insurance)
	 * 		.class : Html.HtmlDocument
	 * 		.url : RegularExpression(car-insurance)
	 */
	protected DocumentTestObject document_carInsuranceTheCarThe(TestObject anchor, long flags) 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_carInsuranceTheCarThe"), anchor, flags);
	}
	
	/**
	 * aaMotorVehicleRegyear: with default state.
	 *		.id : reg-year
	 * 		.title : 
	 * 		.class : Html.INPUT.number
	 * 		.name : aa.motor.vehicle.regyear
	 * 		.classIndex : 0
	 */
	protected GuiTestObject html_aaMotorVehicleRegyear() 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_aaMotorVehicleRegyear"));
	}
	/**
	 * aaMotorVehicleRegyear: with specific test context and state.
	 *		.id : reg-year
	 * 		.title : 
	 * 		.class : Html.INPUT.number
	 * 		.name : aa.motor.vehicle.regyear
	 * 		.classIndex : 0
	 */
	protected GuiTestObject html_aaMotorVehicleRegyear(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_aaMotorVehicleRegyear"), anchor, flags);
	}
	
	/**
	 * vehicleLookUp: with default state.
	 *		.id : vehicleLookUp
	 * 		.title : 
	 * 		.class : Html.DIV
	 * 		.classIndex : 1
	 */
	protected GuiTestObject html_vehicleLookUp() 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_vehicleLookUp"));
	}
	/**
	 * vehicleLookUp: with specific test context and state.
	 *		.id : vehicleLookUp
	 * 		.title : 
	 * 		.class : Html.DIV
	 * 		.classIndex : 1
	 */
	protected GuiTestObject html_vehicleLookUp(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_vehicleLookUp"), anchor, flags);
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
	 * DoYouKnowTheRegistrationNumberWeCouldnTMatchTheRegis: with default state.
	 *		.id : 
	 * 		.value : Do you know the registration number?   We couldn't match the registration number ...
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 0
	 */
	protected GuiTestObject label_doYouKnowTheRegistration() 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_doYouKnowTheRegistration"));
	}
	/**
	 * DoYouKnowTheRegistrationNumberWeCouldnTMatchTheRegis: with specific test context and state.
	 *		.id : 
	 * 		.value : Do you know the registration number?   We couldn't match the registration number ...
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 0
	 */
	protected GuiTestObject label_doYouKnowTheRegistration(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_doYouKnowTheRegistration"), anchor, flags);
	}
	
	/**
	 * IDonTKnowTheCarRegistration: with default state.
	 *		.id : reg-known-no-link
	 * 		.value : I don't know the car registration
	 * 		.class : Html.LABEL
	 * 		.title : 
	 * 		.classIndex : 1
	 */
	protected GuiTestObject label_iDonTKnowTheCarRegistrat() 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_iDonTKnowTheCarRegistrat"));
	}
	/**
	 * IDonTKnowTheCarRegistration: with specific test context and state.
	 *		.id : reg-known-no-link
	 * 		.value : I don't know the car registration
	 * 		.class : Html.LABEL
	 * 		.title : 
	 * 		.classIndex : 1
	 */
	protected GuiTestObject label_iDonTKnowTheCarRegistrat(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_iDonTKnowTheCarRegistrat"), anchor, flags);
	}
	
	/**
	 * NoFindTheCarByMakeAndModel: with default state.
	 *		.id : 
	 * 		.value : No, find the car by make and model 
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 2
	 */
	protected GuiTestObject label_noFindTheCarByMakeAndMod() 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_noFindTheCarByMakeAndMod"));
	}
	/**
	 * NoFindTheCarByMakeAndModel: with specific test context and state.
	 *		.id : 
	 * 		.value : No, find the car by make and model 
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 2
	 */
	protected GuiTestObject label_noFindTheCarByMakeAndMod(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_noFindTheCarByMakeAndMod"), anchor, flags);
	}
	
	/**
	 * NoNoFindTheCarByMakeAndModel: with default state.
	 *		.id : 
	 * 		.value : No No, find the car by make and model 
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 0
	 */
	protected GuiTestObject label_noNoFindTheCarByMakeAndM() 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_noNoFindTheCarByMakeAndM"));
	}
	/**
	 * NoNoFindTheCarByMakeAndModel: with specific test context and state.
	 *		.id : 
	 * 		.value : No No, find the car by make and model 
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 0
	 */
	protected GuiTestObject label_noNoFindTheCarByMakeAndM(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_noNoFindTheCarByMakeAndM"), anchor, flags);
	}
	
	/**
	 * aaMotorVehicleMake: with default state.
	 *		.text : Please select AC ALFA ROMEO ASTON MARTIN AUDI AUSTIN BENTLEY BMW BOND BRISTOL BU ...
	 * 		.id : make
	 * 		.title : 
	 * 		.class : Html.SELECT
	 * 		.name : aa.motor.vehicle.make
	 * 		.classIndex : 0
	 */
	protected SelectGuiSubitemTestObject list_aaMotorVehicleMake() 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_aaMotorVehicleMake"));
	}
	/**
	 * aaMotorVehicleMake: with specific test context and state.
	 *		.text : Please select AC ALFA ROMEO ASTON MARTIN AUDI AUSTIN BENTLEY BMW BOND BRISTOL BU ...
	 * 		.id : make
	 * 		.title : 
	 * 		.class : Html.SELECT
	 * 		.name : aa.motor.vehicle.make
	 * 		.classIndex : 0
	 */
	protected SelectGuiSubitemTestObject list_aaMotorVehicleMake(TestObject anchor, long flags) 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_aaMotorVehicleMake"), anchor, flags);
	}
	
	/**
	 * aaMotorVehicleMake: with default state.
	 *		.text : RegularExpression(Please select)
	 * 		.id : make
	 * 		.title : 
	 * 		.class : Html.SELECT
	 * 		.name : aa.motor.vehicle.make
	 * 		.classIndex : 0
	 */
	protected SelectGuiSubitemTestObject list_aaMotorVehicleMake2() 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_aaMotorVehicleMake2"));
	}
	/**
	 * aaMotorVehicleMake: with specific test context and state.
	 *		.text : RegularExpression(Please select)
	 * 		.id : make
	 * 		.title : 
	 * 		.class : Html.SELECT
	 * 		.name : aa.motor.vehicle.make
	 * 		.classIndex : 0
	 */
	protected SelectGuiSubitemTestObject list_aaMotorVehicleMake2(TestObject anchor, long flags) 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_aaMotorVehicleMake2"), anchor, flags);
	}
	
	/**
	 * aaMotorVehicleModel: with default state.
	 *		.text : 
	 * 		.id : model
	 * 		.title : 
	 * 		.class : Html.SELECT
	 * 		.name : aa.motor.vehicle.model
	 * 		.classIndex : 1
	 */
	protected SelectGuiSubitemTestObject list_aaMotorVehicleModel() 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_aaMotorVehicleModel"));
	}
	/**
	 * aaMotorVehicleModel: with specific test context and state.
	 *		.text : 
	 * 		.id : model
	 * 		.title : 
	 * 		.class : Html.SELECT
	 * 		.name : aa.motor.vehicle.model
	 * 		.classIndex : 1
	 */
	protected SelectGuiSubitemTestObject list_aaMotorVehicleModel(TestObject anchor, long flags) 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_aaMotorVehicleModel"), anchor, flags);
	}
	
	/**
	 * aaMotorVehicleModel: with default state.
	 *		.text : RegularExpression(Please select)
	 * 		.id : model
	 * 		.title : 
	 * 		.class : Html.SELECT
	 * 		.name : aa.motor.vehicle.model
	 * 		.classIndex : 0
	 */
	protected SelectGuiSubitemTestObject list_aaMotorVehicleModel2() 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_aaMotorVehicleModel2"));
	}
	/**
	 * aaMotorVehicleModel: with specific test context and state.
	 *		.text : RegularExpression(Please select)
	 * 		.id : model
	 * 		.title : 
	 * 		.class : Html.SELECT
	 * 		.name : aa.motor.vehicle.model
	 * 		.classIndex : 0
	 */
	protected SelectGuiSubitemTestObject list_aaMotorVehicleModel2(TestObject anchor, long flags) 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_aaMotorVehicleModel2"), anchor, flags);
	}
	
	

	protected Vehicle_Model_SelectionHelper()
	{
		setScriptName("Motor_MK2.The__Car.Vehicle_Model_Selection");
	}
	
}
