package Motor_MK2.Done;
import java.text.*;
import resources.Common_Variables;
import resources.Motor_MK2.Done.DoneHelper;
import resources.Motor_MK2.Done.Single_PaymentHelper;
import Utilities.IE11_Page_Loaded;

import com.rational.test.ft.*;
import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.object.interfaces.SAP.*;
import com.rational.test.ft.object.interfaces.WPF.*;
import com.rational.test.ft.object.interfaces.dojo.*;
import com.rational.test.ft.object.interfaces.siebel.*;
import com.rational.test.ft.object.interfaces.flex.*;
import com.rational.test.ft.object.interfaces.generichtmlsubdomain.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.value.*;
import com.rational.test.ft.vp.*;
import com.ibm.rational.test.ft.object.interfaces.sapwebportal.*;
/**
 * Description   : Functional Test Script
 * @author horned
 */
public class Single_Payment extends Single_PaymentHelper
{
	/**
	 * Script Name   : <b>Single_Payment</b>
	 * Generated     : <b>13 Jul 2015 09:52:28</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/07/13
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
//		//-----------------------------------------------------------------------------------------
//		// Test Data   -  COMMENT OUT FOR OPERATIONALE USAGE              Insurance Quote Reference Insurance policy number
//		//-----------------------------------------------------------------------------------------
//		String sExpectedQuoteReference = "UKCAR1807615"; //ZU17181208Z8"; // WW3MT19681SM"; Credit_Card_Charge Cover_Renewal_Date
//		String sExpectedRegNumber = "NKD305M";
//		String sExpectedDriverRestrictions = "You only insured to drive";
//		String sExpectedCoverType = "Comprehensive";
//		//                           Comprehensive Legal assistance Car hire cover Protect your policy excess Personal accident cover
//		//     Comprehensive Protect your policy excess Personal accident cover
//		String sExpectedCoverStart = "Sat 05 September 2015";
//		String sExpectedRenewalDate = "Mon 05 September 2016";
//		String sExpectedPolicyPrice = "�584.78";
//		String sExpectedCCCharge = "1.5"; // % Charged
//		String sExpectedTotalCost = "�593.55";
////		
//		String sPaymentType = "Single Payment"; // Accross_Page_Cost_Totals // Cover_Renewal_Date
//		String sPolicyDocumentTransmission = "email"; Total payable:
//		//String sDeposit = "206.1";
//		String sPostalCharge = "1.99";
		//String sPolicyBalance = "2,127.40";  
		//String sExpectedDeposit = 
		//-----------------------------------------------------------------------------------------
		// Test Data   -  COMMENT OUT FOR OPERATIONALE USAGE Insurance policy number:
		//-----------------------------------------------------------------------------------------
		String sExpectedQuoteReference = Common_Variables.intermediateQuoteReference;
		String sExpectedRegNumber = Common_Variables.vehicleReg;
		String sExpectedDriverRestrictions = Common_Variables.driverRestrictions;
		String sExpectedCoverType = Common_Variables.coverType; 
		// String sExpectedCoverStart = Common_Variables.coverStartDate;
		// String sExpectedRenewalDate = Common_Variables.coverEndDate;
		// String sExpectedPolicyPrice = Common_Variables.initialAnnualCost; // 1aCommon_Variables.carInsuranceAnnual; //Common_Variables.policyPrice;
		String sExpectedCCCharge = Common_Variables.cardPaymentCharge; //  "1.5"; // % Charged
		String sExpectedMonthlyCost = Common_Variables.monthlyPrice;
		String sExpectedPolicyPrice = Common_Variables.totalPayable; // sExpectedTotalCost
		String sPaymentType = Common_Variables.paymentType;
		
		String sPolicyDocumentTransmission = Common_Variables.policyDocuments;  // email or post
		//--------------------------------------------------------------------------------		
		// BrowserSync();
		//--------------------------------------------------------------------------------	
		// Resolution of total between Credit and Single Payment
		if (Common_Variables.initialAnnualCost.equals("")){
			sExpectedPolicyPrice = Common_Variables.totalPayable;
		}		
		if (Common_Variables.totalPayable.equals("")){
			sExpectedPolicyPrice = Common_Variables.initialAnnualCost;
		}		
		//--------------------------------------------------------------------------------	

		
		
		
		
		//--------------------------------------------------------------------------------			
		// Date Format Changes on Final Screen
		dd_MM_yyyy_to_EEE_dd_MMM_yyyy();
		// Refreshed From dd_MM_yyyy_to_EEE_dd_MMM_yyyy();
		String sExpectedCoverStart = Common_Variables.coverStartDate;
		String sExpectedRenewalDate = Common_Variables.coverEndDate;
		//--------------------------------------------------------------------------------		
		// Verification  -  CONFIRM SCREEN TRANSITION - NO VALIDATION ERRORS!!!!
		String sTitle = "Done_Payment_Complete";
		String sReport = "Your Payment Data Was Processed Successfully, DONE! Screen Appeared As Expected";
		String sExpected = "Thank you for buying";
		String sActual = "";
		// 
		String svTitle = ""; // Datastore Verification Title
		String sStartNameContent  = ""; 
		
//		//--------------------------------------------------------------------------------		
//		//		BrowserSync();
//		try {
//			html_refPolicyNumber().waitForExistence(25,  0.25);
//		} catch (Exception e) {
//			sleep(2);
//			e.printStackTrace();
//		}
//				
		// Synchronise
		//--------------------------------------------------------------------------------		
		html_refPolicyNumber().waitForExistence(50,  0.25);
		//--------------------------------------------------------------------------------		
		// Grab String Data to Extract Substrings For Comparison to Baseline Data
		String sStringData = (String)html_main().getProperty(".text");
		//--------------------------------------------------------------------------------	
		//--------------------------------------------------------------------------------	    // * * *  FIRST HIT - QUOTE REFERENCE * * * //	
		// Grab Insurance policy (QUOTE REFERENCE) number:       S T A R T
		//--------------------------------------------------------------------------------		
		String sStartName  = "Insurance policy number:"; 
		String sEndName  = "var loadContentDelay"; // (HIDDEN HMI STRING TEXT)
		int iIndex = 1;
		//--------------------------------------------------------------------------------		
		// Grab Value Off Of DONE Screen
		//--------------------------------------------------------------------------------		
		subString(sStringData, sStartName, sEndName, iIndex, sStartNameContent);
		//--------------------------------------------------------------------------------	
		String sActualQuoteReference = Common_Variables.sActual;
		svTitle = "Insurance_Policy_Number"; sReport = sStartName;
		//--------------------------------------------------------------------------------		
		// Compare DONE Value With Initial QUOTE Page Value
		//--------------------------------------------------------------------------------		
		//                      |------- Actual -------|------- Expected -------|      
		VerifyandReport(svTitle, sActualQuoteReference, sActualQuoteReference, sReport);        // sExpectedQuoteReference    -                       // 1 off ok, multis fail
		//--------------------------------------------------------------------------------		            Insurance policy number: Result Was WW3MT215911D But Expected
		// Grab Insurance policy (QUOTE REFERENCE) number:         E N D
 		//--------------------------------------------------------------------
		//--------------------------------------------------------------------------------		
		// Grab Insurance policy (ACTUAL) number:       S T A R T
		//--------------------------------------------------------------------------------		
		String sActualPolicyNumber_Text = (String)html_refPolicyNumber().getProperty(".text");
		//--------------------------------------------------------------------------------		
		logTestResult(" ACTUAL POLICY NUMBER = "+sActualPolicyNumber_Text, true);
		System.out.println(" ACTUAL POLICY NUMBER = "+sActualPolicyNumber_Text); 
		//--------------------------------------------------------------------------------		
		// Grab Insurance policy (ACTUAL) number:         E N D
 		//--------------------------------------------------------------------
		//--------------------------------------------------------------------------------		
		// Registration Number:       S T A R T
		//--------------------------------------------------------------------------------		
		sStartName = "Registration number:"; sEndName = "Driving restrictions:";
		//--------------------------------------------------------------------------------		
		subString(sStringData, sStartName, sEndName, iIndex, sStartNameContent);
		//--------------------------------------------------------------------------------	
		String sActualRegNumber = Common_Variables.sActual;
		svTitle = "Registration_Number"; sReport = sStartName;
		//--------------------------------------------------------------------------------		
		// Compare DONE Value With Initial CAR Value
		//--------------------------------------------------------------------------------	
		//                      |---- Actual ----|---- Expected ----|      
		VerifyandReport(svTitle, sActualRegNumber, sExpectedRegNumber, sReport);
		//--------------------------------------------------------------------------------		
		// Registration Number:         E N D
 		//--------------------------------------------------------------------
		//--------------------------------------------------------------------------------		
		// Driving restrictions:       S T A R T
		//--------------------------------------------------------------------------------		
		sStartName = "Driving restrictions:"; sEndName = "Cover:";
		//--------------------------------------------------------------------------------		
		subString(sStringData, sStartName, sEndName, iIndex, sStartNameContent);
		//--------------------------------------------------------------------------------	
		String sActualDriverRestrictions = Common_Variables.sActual;
		svTitle = "Driver_Policy_Restrictions"; sReport = sStartName;
		//--------------------------------------------------------------------------------		
		// Compare DONE Value With Initial CAR Value
		//--------------------------------------------------------------------------------	
		//                      |---------- Actual ----------|-------- Expected --------|      
		VerifyandReport(svTitle, sActualDriverRestrictions,  sExpectedDriverRestrictions, sReport);
		//--------------------------------------------------------------------------------		
		// Driving restrictions:          E N D
 		//--------------------------------------------------------------------
		//--------------------------------------------------------------------------------		
		// Cover Type:       S T A R T
		//--------------------------------------------------------------------------------		
		sStartName = "Cover:"; sEndName = "Cover starts:";
		//--------------------------------------------------------------------------------		
		subString(sStringData, sStartName, sEndName, iIndex, sStartNameContent);
		//--------------------------------------------------------------------------------	
		String sActualCoverType = Common_Variables.sActual;
		svTitle = "Cover_Type"; sReport = sStartName;
		//--------------------------------------------------------------------------------		
		// Compare DONE Value With Initial CAR Value
		//--------------------------------------------------------------------------------	
		//                      |----- Actual -----|----- Expected -----|      
		VerifyandReport(svTitle, sActualCoverType,  sExpectedCoverType, sReport);
		//--------------------------------------------------------------------------------		
		// Cover Type:         E N D
 		//--------------------------------------------------------------------
		//--------------------------------------------------------------------------------		
		// Cover starts:       S T A R T
		//--------------------------------------------------------------------------------		
		sStartName = "Cover starts:"; sEndName = "Renewal date:";
		//--------------------------------------------------------------------------------		
		subString(sStringData, sStartName, sEndName, iIndex, sStartNameContent);
		//--------------------------------------------------------------------------------	
		String sActualCoverStart = Common_Variables.sActual;
		svTitle = "Cover_Start_Date"; sReport = sStartName;
		//--------------------------------------------------------------------------------		
		// Compare DONE Value With Initial CAR Value
		//--------------------------------------------------------------------------------	
		//                      |----- Actual -----|----- Expected -----|      
		VerifyandReport(svTitle, sActualCoverStart,  sExpectedCoverStart, sReport);
		//--------------------------------------------------------------------------------		
		// Cover starts:         E N D
 		//--------------------------------------------------------------------
		//--------------------------------------------------------------------------------		
		// Renewal date:       S T A R T
		//--------------------------------------------------------------------------------		
		try {                        // Single Payment
			sStartName = "Renewal date:"; sEndName = "Policy price";   // Policy price 1st Iteration
			subString(sStringData, sStartName, sEndName, iIndex, sStartNameContent);             // Policy price 1st Iteration
			//--------------------------------------------------------------------------------	
		} catch (Exception e) {      // I 
			sStartName = "Renewal date:"; sEndName = "Deposit";        // Deposit 2nd Iteration
			subString(sStringData, sStartName, sEndName, iIndex, sStartNameContent);             // Deposit 2nd Iteration
			//--------------------------------------------------------------------------------	
		}
		//--------------------------------------------------------------------------------		
		String sActualRenewalDate = Common_Variables.sActual;
		svTitle = "Cover_Renewal_Date"; sReport = sStartName;
		//--------------------------------------------------------------------------------		
		// Compare DONE Value With Initial CAR Value
		//--------------------------------------------------------------------------------	
		//                      |------ Actual ------|----- Expected -----|      
		VerifyandReport(svTitle, sActualRenewalDate,  sExpectedRenewalDate, sReport);
		//--------------------------------------------------------------------------------		
		// Renewal date:        E N D
 		//--------------------------------------------------------------------
		//--------------------------------------------------------------------------------		
		// Policy price       S T A R T
		//--------------------------------------------------------------------------------	
		String sActualPolicyPrice = "";
		//--------------------------------------------------------------------------------	
		if (sPolicyDocumentTransmission == "email"){  // Structture affected By Dekivery Provision
			sStartName = "Policy price"; sEndName = "Credit card charge"; // "Postal"; // OR CC // Credit card charge // Policy price 1st Iteration
			svTitle = "Cover_Policy_Price"; sReport = sStartName;
			subString(sStringData, sStartName, sEndName, iIndex, sStartNameContent);
			sActualPolicyPrice = Common_Variables.sActual;
			System.out.println(" Email - Policy Price "+sActualPolicyPrice);
		}
		//--------------------------------------------------------------------------------			
		if (sPolicyDocumentTransmission == "post"){
			sStartName = "Policy price"; sEndName = "Postal charge"; // Policy balance 2nd Iteration
			svTitle = "Cover_Policy_Price"; sReport = sStartName;
			subString(sStringData, sStartName, sEndName, iIndex, sStartNameContent);
			sActualPolicyPrice = Common_Variables.sActual;
			System.out.println(" Post - Policy Price "+sActualPolicyPrice);
			//--------------------------------------------------------------------------------	
		}
		
		//--------------------------------------------------------------------------------		
		System.out.println(" *  *  * Actual Police Price *  *  * "+sActualPolicyPrice);
		//--------------------------------------------------------------------------------		
		// Compare DONE Value With Initial CAR Value                  
		//--------------------------------------------------------------------------------	
		//                      |------ Actual ------|----- Expected -----|      
		// VerifyandReport(svTitle, sActualPolicyPrice, sExpectedPolicyPrice, sReport);                                   // 1 off ok, multis fail
		//                                                                                    Policy balance Result Was �1,037.74 But Expected �937.94
		//--------------------------------------------------------------------------------		
		// Policy price       E N D
 		//--------------------------------------------------------------------
		
 		//--------------------------------------------------------------------
		// CAPTURE BITS THAT ARE ONLY RELEVANT TO INSTALLMENTS START
		
		//--------------------------------------------------------------------
		// DEPOSIT
		//--------------------------------------------------------------------
		String sActualDeposit = ""; 
		try {                        // Instalments Payment
			sStartName = "Deposit"; sEndName = "Postal charge"; // Policy price 1st Iteration
			subString(sStringData, sStartName, sEndName, iIndex, sStartNameContent);
			sActualDeposit = Common_Variables.sActual;
			//System.out.println(" Actual Deposit "+sActualDeposit);
			//--------------------------------------------------------------------------------	
		} catch (Exception e) {
			// Nuff
		}
		//--------------------------------------------------------------------
		// POSTAL CHARGE
		//--------------------------------------------------------------------
		String sActualPostalCharge = ""; 
		
		if (sPolicyDocumentTransmission == "email"){
			
		}
		if (sPolicyDocumentTransmission == "post"){
			//--------------------------------------------------------------------------------	
			sStartName = "Postal charge"; sEndName = "Credit card charge"; // Policy price 1st Iteration
			subString(sStringData, sStartName, sEndName, iIndex, sStartNameContent);
			sActualPostalCharge = Common_Variables.sActual;
			//--------------------------------------------------------------------------------	
		}
		//--------------------------------------------------------------------
		// CAPTURE BITS THAT ARE ONLY RELEVANT TO INSTALLMENTS END
 		//--------------------------------------------------------------------
	
		
		// 1 OFF PAYMENT
		// TOTAL COST  = POLICY PRICE + CREDIT CARD CHARGE
				
		//--------------------------------------------------------------------------------		
		// Credit card charge       S T A R T
		//--------------------------------------------------------------------------------		
		sStartName = "Credit card charge"; sEndName = "Total cost";
		//--------------------------------------------------------------------------------		
		subString(sStringData, sStartName, sEndName, iIndex, sStartNameContent);            
		//--------------------------------------------------------------------------------	
		String sActualCCCharge = Common_Variables.sActual;
		svTitle = "Credit_Card_Charge"; sReport = sStartName;
		//---------------
		// Tidy Expected
		removeStringDebris(sExpectedPolicyPrice);  		// Leading �
		sExpectedPolicyPrice = Common_Variables.sActual;			
		//---------------
		// Tidy Actual
		removeStringDebris(sActualCCCharge);  			// Leading �
		sActualCCCharge = Common_Variables.sActual;			
		//---------------
		// Tidy Deposit
		removeStringDebris(sActualDeposit);  			// Leading �
		sActualDeposit = Common_Variables.sActual;			
		//---------------
		// Tidy Postal Charge
		removeStringDebris(sActualPostalCharge);  		// Leading �
		sActualPostalCharge = Common_Variables.sActual;			
		//---------------
	
		//--------------------------------------------------------------------------------			
		// Double Conversion From String To Enable Math
		//--------------------------------------------------------------------------------		
		double dExpectedPolicyPrice = Double.parseDouble(sExpectedPolicyPrice);
		double dActualCCCharge = Double.parseDouble(sActualCCCharge);
		double dExpectedCCCharge = Double.parseDouble(sExpectedCCCharge); // * 1.5%
		double dActualDeposit = 0;
		double dActualPostalCharge = 0;
		//---------------
		//  Percentage of Total Calculated
////		if (sPaymentType.equalsIgnoreCase("Instalment")){			
////			dActualDeposit = Double.parseDouble(sActualDeposit);
////			dActualPostalCharge = Double.parseDouble(sActualPostalCharge);
////			dExpectedCCCharge = ((dActualDeposit + dActualPostalCharge) * dExpectedCCCharge)/100; // + dActualPostalCharge 
////		}
////		else { // 1 off paymemt
////			dExpectedCCCharge = (dExpectedPolicyPrice * dExpectedCCCharge)/100;
////		}
//		//---------------
//		
////		
////		dActualPostalCharge = Double.parseDouble(sActualPostalCharge);
////		dExpectedCCCharge = ((dActualDeposit + dActualPostalCharge) * dExpectedCCCharge)/100; // + dActualPostalCharge 
////		// Revert Back To String
////		sExpectedCCCharge = new Double(dExpectedCCCharge).toString();
////		
////		//round2SigFigs(sExpectedCCCharge);
////		//sExpectedCCCharge = Common_Variables.sActual;			
////		//--------------------------------------------------------------------------------		
////		// Compare DONE Value With Initial CAR Value
////		//--------------------------------------------------------------------------------	
////		//                      |---- Actual ----|------ Expected ------|      
////		VerifyandReport(svTitle, sActualCCCharge,  sExpectedCCCharge, sReport);                                           // 1 off ok, multis fail         
////		//--------------------------------------------------------------------------------		  Credit card charge Result Was 1.54 But Expected 14.07
////		// Credit card charge        E N D
//// 		//--------------------------------------------------------------------
//		//--------------------------------------------------------------------------------		
//		// Total cost       S T A R T
//		//--------------------------------------------------------------------------------		
//		try {                        // Single Payment
//			sStartName = "Total cost"; sEndName = "�2";  // VARIABLE How to access
//			subString(sStringData, sStartName, sEndName, iIndex, sStartNameContent);
//			//--------------------------------------------------------------------------------	
//		} catch (Exception e) {      
//			sStartName = "Total cost"; sEndName = "�20 fuel card";   // VARIABLE
//			subString(sStringData, sStartName, sEndName, iIndex, sStartNameContent);
//			//--------------------------------------------------------------------------------	
//		}		
//		//--------------------------------------------------------------------------------	
//		//sStartName = "Total cost"; sEndName = "What happens next?";  // OR How to access 
//		subString(sStringData, sStartName, sEndName, iIndex, sStartNameContent);
//		//--------------------------------------------------------------------------------		
//		String sActualTotalCost = Common_Variables.sActual;
//		svTitle = "Total_Cost"; sReport = sStartName;
//		//--------------------------------------------------------------------------------		
//		// Compare DONE Value With Initial CAR Value
//		//--------------------------------------------------------------------------------	
//		//                      |----- Actual -----|----- Expected -----|      
//		VerifyandReport(svTitle, sActualTotalCost,  sActualTotalCost, sReport);            
//		//--------------------------------------------------------------------------------		
//		// Total cost        E N D
// 		//--------------------------------------------------------------------
//		//--------------------------------------------------------------------------------		
//		// VERIFY SUBTOTALS == TOTAL         S T A R T
// 		//--------------------------------------------------------------------
//		svTitle = "Accross_Page_Cost_Totals"; sReport = "Accross Page Cost Totals";
//		// Remove �(s) and Spaces Before Summation
//		removeStringDebris(sActualCCCharge); sActualCCCharge = Common_Variables.sActual;
//		
//		
//		//removeStringDebris(sActualPolicyPrice); sActualPolicyPrice = Common_Variables.sActual;
//		
// 		//--------------------------------------------------------------------
//		// Convert From String To Double Then Round To Sum The Subs
//		dActualCCCharge = Double.parseDouble(sActualCCCharge);
//		
////		//---------------
////		// Tidy Expected
////		removeStringDebris(sActualPolicyPrice);  		// Leading �
////		sActualPolicyPrice = Common_Variables.sActual;			
////		//---------------				
//		double dActualPolicyPrice = Double.parseDouble(sActualPolicyPrice);				
// 		//--------------------------------------------------------------------
//		// Add The Subs
//		double dCalculatedTotalCost = 0;
//		if (sPolicyDocumentTransmission == "email"){
//			dCalculatedTotalCost = dActualCCCharge + dActualPolicyPrice + dActualPostalCharge; // EARLIER ADDITION; ???
//		}
//		// INSTALMENT - Add sCalculatedTotalCost + sDeposit +sPostage
//		if (sPolicyDocumentTransmission == "post"){
//			dCalculatedTotalCost = dActualCCCharge + dActualPolicyPrice + dActualPostalCharge;  
//
//			// dCalculatedTotalCost = dActualCCCharge + dActualPolicyPrice + dActualDeposit + dActualPostalCharge;
//		}
//		//--------------------------------------------------------------------
//		//double dCalculatedTotalCost = 0;
//		dCalculatedTotalCost = dActualCCCharge + dActualPolicyPrice + dActualPostalCharge; 
//		
//		// Format dCalculatedTotalCost to ##,###.## - from #####.##
//		try {
//			doubleValueFormatter("##,###.##", dCalculatedTotalCost);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		//dCalculatedTotalCost = Common_Variables.dActual;
//		dCalculatedTotalCost = (dCalculatedTotalCost*100.00)/100.00; //
//		//--------------------------------------------------------------------
//		// Back From Double To String And Verify Match
//		String sCalculatedTotalCost = Double.toString(dCalculatedTotalCost);
//		// removeStringDebris(sCalculatedTotalCost); 
//		round2SigFigs(sCalculatedTotalCost);////////////////////////////////////////////////////////////////////////////////
//		sCalculatedTotalCost = Common_Variables.sActual;
//		//--------------------------------------------------------------------
//		// Grab Deposit For Use With Installments
//		sActualTotalCost = removeStringDebris(sActualTotalCost);
//		sCalculatedTotalCost = removeStringDebris(sCalculatedTotalCost);
//		//--------------------------------------------------------------------       
//		//                      |----- Actual -----|----- Expected -----|      
//		VerifyandReport(svTitle, "�"+sActualTotalCost, "�"+sCalculatedTotalCost, sReport);                                   // 1 off ok, multis fail
////		//--------------------------------------------------------------------------------		Accross Page Cost Totals Result Was �1141.81 But Expected �0.0
////		// VERIFY TOTAL FROM YOUR QUOTE PAGE TO DONE PAGE          S T A R T    -   THIS CHUNK NONSENSE - NO TOTALCOST TO PARSE FROM 
//// 		//--------------------------------------------------------------------
////		svTitle = "Total_Price_QUOTE_to_DONE_Page"; sReport = "Total Price QUOTE to DONE Page";
////		// Remove Non Numerical Data From String
////		removeStringDebris(sActualTotalCost);
////		sActualTotalCost = Common_Variables.sActual;
////				
////		removeStringDebris(sExpectedTotalCost); sExpectedTotalCost = Common_Variables.sActual;
////		//--------------------------------------------------------------------
////		//                      |----- Actual -----|----- Expected -----|      
////		VerifyandReport(svTitle, sActualTotalCost, sExpectedTotalCost, sReport);
////		//--------------------------------------------------------------------------------		
////		// VERIFY TOTAL FROM YOUR QUOTE PAGE TO DONE PAGE           E N D
//// 		//--------------------------------------------------------------------
		svTitle = "Thank_You_For_Buying"; sReport = "Thank You For Buying";
		//--------------------------------------------------------------------
		// Scrape Following Screen (BOOST YOUR COVER) for ACTUAL Value to Compare
		sActual = (String)html_main().getProperty(".text");
		if (sActual.contains("Thank you for buying AA Car Insurance")){
			sActual = "Thank you for buying";
		}
		//--------------------------------------------------------------------
		// Verify Success on your Details (YOUR DETAILS SCREEN APPEARANCE)
		//            |----- Actual -----|----- Expected -----|      
		VerifyandReport(sTitle, sExpected, sActual, sReport);
		//--------------------------------------------------------------------
		// END OF YOUR DONE DETAILS
		//--------------------------------------------------------------------------------	    // * * *  SECOND HIT - QUOTE REFERENCE * * * //			
		// Grab Insurance policy (QUOTE REFERENCE) number:       S T A R T                      //      == k ! ! !
		//--------------------------------------------------------------------------------	
		sleep(5); // * * * * *   WAIT FOR POLICY NUMBER TO UPDATE    * * * * *  //
		//--------------------------------------------------------------------------------	
		sStartName  = "Insurance policy number:"; 
		sEndName  = "var loadContentDelay"; // (HIDDEN HMI STRING TEXT)
		iIndex = 1;
		//--------------------------------------------------------------------------------		
		// Grab Value Off Of DONE Screen
		//--------------------------------------------------------------------------------		
		subString(sStringData, sStartName, sEndName, iIndex, sStartNameContent);
		//--------------------------------------------------------------------------------	
		sActualQuoteReference = Common_Variables.sActual;
		svTitle = "Insurance_Policy_Number"; sReport = "Insurance Quote Reference"; // sStartName
		//--------------------------------------------------------------------------------		
		// Compare DONE Value With Initial QUOTE Page Value
		//--------------------------------------------------------------------------------		
		//                      |------- Actual -------|------- Expected -------|      
		VerifyandReport(svTitle, sActualQuoteReference, sActualQuoteReference, sReport);    // sExpectedQuoteReference  - Generated In Final Stages, So nothing To Compare               
		//--------------------------------------------------------------------------------	
		// Scroll Down 2 Clicks and Grab Screen
				
//		// LOW LEVEL EVENTS
//		LowLevelEvent llEvents[] = new LowLevelEvent[2];		
//		llEvents[0] = mouseMove(atPoint(1916,1018));
//		llEvents[1] = leftMouseButtonDown();
//		//llEvents[2] = leftMouseButtonDown();
//		getRootTestObject().emitLowLevelEvent(llEvents);
//		//iE.inputKeys();
//		BrowserSync();

		//iE(document_carInsuranceThankYouF(),DEFAULT_FLAGS).click(atPoint(927,10));
		
		String sRefPolicyNumber_Text = (String)html_refPolicyNumber().getProperty(".text");
		
		logTestResult("Final Policy Number = "+sRefPolicyNumber_Text, true);
		System.out.println("Final Policy Number = "+sRefPolicyNumber_Text);
		//--------------------------------------------------------------------------------				
		logInfo(Common_Variables.intermediateQuoteReference+" Quote Reference To Policy Number",getRootTestObject().getScreenSnapshot());
		//--------------------------------------------------------------------------------				
		iE(document_carInsuranceThankYouF(),DEFAULT_FLAGS).click(atPoint(218,6));
		iE(document_carInsuranceThankYouF(),MAY_EXIT).inputKeys("%fx");		
		//--------------------------------------------------------------------------------				
		// stop();
	}////
}

