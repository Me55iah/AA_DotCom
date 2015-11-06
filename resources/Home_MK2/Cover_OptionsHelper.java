// DO NOT EDIT: This file is automatically generated.
//
// Only the associated template file should be edited directly.
// Helper class files are automatically regenerated from the template
// files at various times, including record actions and test object
// insertion actions.  Any changes made directly to a helper class
// file will be lost when automatically updated.

package resources.Home_MK2;

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
 * Script Name   : <b>Cover_Options</b><br>
 * Generated     : <b>2015/02/02 08:53:55</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows 7 x86 6.1 <br>
 * 
 * @since  February 02, 2015
 * @author horned
 */
public abstract class Cover_OptionsHelper extends RationalTestScript
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
	 * Backsubmit: with default state.
	 *		.id : quote_backButton
	 * 		.type : submit
	 * 		.value : Back
	 * 		.title : 
	 * 		.class : Html.BUTTON
	 * 		.name : 
	 * 		.classIndex : 2
	 */
	protected GuiTestObject button_backsubmit() 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_backsubmit"));
	}
	/**
	 * Backsubmit: with specific test context and state.
	 *		.id : quote_backButton
	 * 		.type : submit
	 * 		.value : Back
	 * 		.title : 
	 * 		.class : Html.BUTTON
	 * 		.name : 
	 * 		.classIndex : 2
	 */
	protected GuiTestObject button_backsubmit(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_backsubmit"), anchor, flags);
	}
	
	/**
	 * Nextsubmit: with default state.
	 *		.id : quote_nextButton
	 * 		.type : submit
	 * 		.value : Next
	 * 		.title : 
	 * 		.class : Html.BUTTON
	 * 		.name : 
	 * 		.classIndex : 1
	 */
	protected GuiTestObject button_nextsubmit() 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_nextsubmit"));
	}
	/**
	 * Nextsubmit: with specific test context and state.
	 *		.id : quote_nextButton
	 * 		.type : submit
	 * 		.value : Next
	 * 		.title : 
	 * 		.class : Html.BUTTON
	 * 		.name : 
	 * 		.classIndex : 1
	 */
	protected GuiTestObject button_nextsubmit(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_nextsubmit"), anchor, flags);
	}
	
	/**
	 * BCHRcheckboxon: with default state.
	 *		.id : BCHRcheckbox
	 * 		.type : checkbox
	 * 		.value : on
	 * 		.title : 
	 * 		.class : Html.INPUT.checkbox
	 * 		.name : BCHRcheckbox
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject central_Heating_Emergency_Response() 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("central_Heating_Emergency_Response"));
	}
	/**
	 * BCHRcheckboxon: with specific test context and state.
	 *		.id : BCHRcheckbox
	 * 		.type : checkbox
	 * 		.value : on
	 * 		.title : 
	 * 		.class : Html.INPUT.checkbox
	 * 		.name : BCHRcheckbox
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject central_Heating_Emergency_Response(TestObject anchor, long flags) 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("central_Heating_Emergency_Response"), anchor, flags);
	}
	
	/**
	 * Level2CentralHeatingResponsePlus: with default state.
	 *		.id : 
	 * 		.value : Level 2 Central Heating Response Plus
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 0
	 */
	protected GuiTestObject central_Heating_Response() 
	{
		return new GuiTestObject(
                        getMappedTestObject("central_Heating_Response"));
	}
	/**
	 * Level2CentralHeatingResponsePlus: with specific test context and state.
	 *		.id : 
	 * 		.value : Level 2 Central Heating Response Plus
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 0
	 */
	protected GuiTestObject central_Heating_Response(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("central_Heating_Response"), anchor, flags);
	}
	
	/**
	 * HomeMembershipBoilerCoverHomeEmergencyAA: with default state.
	 *		.title : Home Membership | Boiler Cover | Home Emergency | AA
	 * 		.class : Html.HtmlDocument
	 * 		.url : RegularExpression(home-membership)
	 */
	protected DocumentTestObject document_homeMembershipBoilerC() 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_homeMembershipBoilerC"));
	}
	/**
	 * HomeMembershipBoilerCoverHomeEmergencyAA: with specific test context and state.
	 *		.title : Home Membership | Boiler Cover | Home Emergency | AA
	 * 		.class : Html.HtmlDocument
	 * 		.url : RegularExpression(home-membership)
	 */
	protected DocumentTestObject document_homeMembershipBoilerC(TestObject anchor, long flags) 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_homeMembershipBoilerC"), anchor, flags);
	}
	
	/**
	 * HERcheckboxon: with default state.
	 *		.id : HERcheckbox
	 * 		.type : checkbox
	 * 		.value : on
	 * 		.title : 
	 * 		.class : Html.INPUT.checkbox
	 * 		.name : HERcheckbox
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject home_Emergency_Response() 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("home_Emergency_Response"));
	}
	/**
	 * HERcheckboxon: with specific test context and state.
	 *		.id : HERcheckbox
	 * 		.type : checkbox
	 * 		.value : on
	 * 		.title : 
	 * 		.class : Html.INPUT.checkbox
	 * 		.name : HERcheckbox
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject home_Emergency_Response(TestObject anchor, long flags) 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("home_Emergency_Response"), anchor, flags);
	}
	
	/**
	 * HERPcheckboxon: with default state.
	 *		.id : HERPcheckbox
	 * 		.type : checkbox
	 * 		.value : on
	 * 		.title : 
	 * 		.class : Html.INPUT.checkbox
	 * 		.name : HERPcheckbox
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject home_Response() 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("home_Response"));
	}
	/**
	 * HERPcheckboxon: with specific test context and state.
	 *		.id : HERPcheckbox
	 * 		.type : checkbox
	 * 		.value : on
	 * 		.title : 
	 * 		.class : Html.INPUT.checkbox
	 * 		.name : HERPcheckbox
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject home_Response(TestObject anchor, long flags) 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("home_Response"), anchor, flags);
	}
	
	/**
	 * coveredbox: with default state.
	 *		.id : coveredbox
	 * 		.title : 
	 * 		.class : Html.DIV
	 * 		.classIndex : 0
	 */
	protected GuiTestObject html_coveredbox() 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_coveredbox"));
	}
	/**
	 * coveredbox: with specific test context and state.
	 *		.id : coveredbox
	 * 		.title : 
	 * 		.class : Html.DIV
	 * 		.classIndex : 0
	 */
	protected GuiTestObject html_coveredbox(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_coveredbox"), anchor, flags);
	}
	
	/**
	 * HMquoteTotalprice: with default state.
	 *		.id : HMquote-totalprice
	 * 		.title : 
	 * 		.class : Html.DIV
	 * 		.classIndex : 2
	 */
	protected GuiTestObject html_hMquoteTotalprice() 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_hMquoteTotalprice"));
	}
	/**
	 * HMquoteTotalprice: with specific test context and state.
	 *		.id : HMquote-totalprice
	 * 		.title : 
	 * 		.class : Html.DIV
	 * 		.classIndex : 2
	 */
	protected GuiTestObject html_hMquoteTotalprice(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_hMquoteTotalprice"), anchor, flags);
	}
	
	/**
	 * HMtableTotalprice: with default state.
	 *		.id : HMtable-totalprice
	 * 		.title : 
	 * 		.class : Html.SPAN
	 * 		.classIndex : 0
	 */
	protected GuiTestObject html_hMtableTotalprice() 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_hMtableTotalprice"));
	}
	/**
	 * HMtableTotalprice: with specific test context and state.
	 *		.id : HMtable-totalprice
	 * 		.title : 
	 * 		.class : Html.SPAN
	 * 		.classIndex : 0
	 */
	protected GuiTestObject html_hMtableTotalprice(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_hMtableTotalprice"), anchor, flags);
	}
	
	/**
	 * HERP_BCHRPcovered: with default state.
	 *		.id : HERP_BCHRPcovered
	 * 		.title : 
	 * 		.class : Html.DIV
	 * 		.classIndex : 7
	 */
	protected GuiTestObject html_herP_BCHRPcovered() 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_herP_BCHRPcovered"));
	}
	/**
	 * HERP_BCHRPcovered: with specific test context and state.
	 *		.id : HERP_BCHRPcovered
	 * 		.title : 
	 * 		.class : Html.DIV
	 * 		.classIndex : 7
	 */
	protected GuiTestObject html_herP_BCHRPcovered(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_herP_BCHRPcovered"), anchor, flags);
	}
	
	/**
	 * noProductsSelected: with default state.
	 *		.id : noProductsSelected
	 * 		.title : 
	 * 		.class : Html.DIV
	 * 		.classIndex : 1
	 */
	protected GuiTestObject html_noProductsSelected() 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_noProductsSelected"));
	}
	/**
	 * noProductsSelected: with specific test context and state.
	 *		.id : noProductsSelected
	 * 		.title : 
	 * 		.class : Html.DIV
	 * 		.classIndex : 1
	 */
	protected GuiTestObject html_noProductsSelected(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_noProductsSelected"), anchor, flags);
	}
	
	/**
	 * notcoveredbox: with default state.
	 *		.id : notcoveredbox
	 * 		.title : 
	 * 		.class : Html.DIV
	 * 		.classIndex : 0
	 */
	protected GuiTestObject html_notcoveredbox() 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_notcoveredbox"));
	}
	/**
	 * notcoveredbox: with specific test context and state.
	 *		.id : notcoveredbox
	 * 		.title : 
	 * 		.class : Html.DIV
	 * 		.classIndex : 0
	 */
	protected GuiTestObject html_notcoveredbox(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_notcoveredbox"), anchor, flags);
	}
	
	/**
	 * AnnualCardPayment: with default state.
	 *		.id : payment-annual
	 * 		.value :  Annual card payment 
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 3
	 */
	protected GuiTestObject label_annualCardPayment() 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_annualCardPayment"));
	}
	/**
	 * AnnualCardPayment: with specific test context and state.
	 *		.id : payment-annual
	 * 		.value :  Annual card payment 
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 3
	 */
	protected GuiTestObject label_annualCardPayment(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_annualCardPayment"), anchor, flags);
	}
	
	/**
	 * ApplyMyAAMemberDiscount: with default state.
	 *		.id : 
	 * 		.value : Apply my AA member discount
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 0
	 */
	protected GuiTestObject label_applyMyAAMemberDiscount() 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_applyMyAAMemberDiscount"));
	}
	/**
	 * ApplyMyAAMemberDiscount: with specific test context and state.
	 *		.id : 
	 * 		.value : Apply my AA member discount
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 0
	 */
	protected GuiTestObject label_applyMyAAMemberDiscount(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_applyMyAAMemberDiscount"), anchor, flags);
	}
	
	/**
	 * ByPost: with default state.
	 *		.id : documents-post
	 * 		.value : RegularExpression( By post)
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 2
	 */
	protected GuiTestObject label_byPost() 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_byPost"));
	}
	/**
	 * ByPost: with specific test context and state.
	 *		.id : documents-post
	 * 		.value : RegularExpression( By post)
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 2
	 */
	protected GuiTestObject label_byPost(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_byPost"), anchor, flags);
	}
	
	/**
	 * excess-fifty: with default state.
	 *		.id : excess-fifty
	 * 		.value :  �50 
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 2
	 */
	protected GuiTestObject label_excessFifty() 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_excessFifty"));
	}
	/**
	 * excess-fifty: with specific test context and state.
	 *		.id : excess-fifty
	 * 		.value :  �50 
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 2
	 */
	protected GuiTestObject label_excessFifty(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_excessFifty"), anchor, flags);
	}
	
	/**
	 * excess-ninetynine: with default state.
	 *		.id : excess-ninetynine
	 * 		.value :  �99 
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 3
	 */
	protected GuiTestObject label_excessNinetynine() 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_excessNinetynine"));
	}
	/**
	 * excess-ninetynine: with specific test context and state.
	 *		.id : excess-ninetynine
	 * 		.value :  �99 
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 3
	 */
	protected GuiTestObject label_excessNinetynine(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_excessNinetynine"), anchor, flags);
	}
	
	/**
	 * excess-none: with default state.
	 *		.id : excess-none
	 * 		.value :  None 
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 1
	 */
	protected GuiTestObject label_excessNone() 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_excessNone"));
	}
	/**
	 * excess-none: with specific test context and state.
	 *		.id : excess-none
	 * 		.value :  None 
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 1
	 */
	protected GuiTestObject label_excessNone(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_excessNone"), anchor, flags);
	}
	
	/**
	 * MonthlyCardPayment: with default state.
	 *		.id : payment-monthlycp
	 * 		.value :  Monthly Card Payment 
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 2
	 */
	protected GuiTestObject label_monthlyCardPayment() 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_monthlyCardPayment"));
	}
	/**
	 * MonthlyCardPayment: with specific test context and state.
	 *		.id : payment-monthlycp
	 * 		.value :  Monthly Card Payment 
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 2
	 */
	protected GuiTestObject label_monthlyCardPayment(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_monthlyCardPayment"), anchor, flags);
	}
	
	/**
	 * MonthlyDirectDebit: with default state.
	 *		.id : payment-monthlydd
	 * 		.value :  Monthly Direct Debit 
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 1
	 */
	protected GuiTestObject label_monthlyDirectDebit() 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_monthlyDirectDebit"));
	}
	/**
	 * MonthlyDirectDebit: with specific test context and state.
	 *		.id : payment-monthlydd
	 * 		.value :  Monthly Direct Debit 
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 1
	 */
	protected GuiTestObject label_monthlyDirectDebit(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_monthlyDirectDebit"), anchor, flags);
	}
	
	/**
	 * Online: with default state.
	 *		.id : documents-online
	 * 		.value :  Online 
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 1
	 */
	protected GuiTestObject label_online() 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_online"));
	}
	/**
	 * Online: with specific test context and state.
	 *		.id : documents-online
	 * 		.value :  Online 
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 1
	 */
	protected GuiTestObject label_online(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_online"), anchor, flags);
	}
	
	/**
	 * WhatIsCovered: with default state.
	 *		.text : What is covered
	 * 		.id : 
	 * 		.href : RegularExpression(theaa\.com/home-membership)
	 * 		.title : 
	 * 		.class : Html.A
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject link_whatIsCovered() 
	{
		return new GuiTestObject(
                        getMappedTestObject("link_whatIsCovered"));
	}
	/**
	 * WhatIsCovered: with specific test context and state.
	 *		.text : What is covered
	 * 		.id : 
	 * 		.href : RegularExpression(theaa\.com/home-membership)
	 * 		.title : 
	 * 		.class : Html.A
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject link_whatIsCovered(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("link_whatIsCovered"), anchor, flags);
	}
	
	/**
	 * WhatIsNotCovered: with default state.
	 *		.text : What is not covered
	 * 		.id : 
	 * 		.href : RegularExpression(theaa\.com/home-membership)
	 * 		.title : 
	 * 		.class : Html.A
	 * 		.name : 
	 * 		.classIndex : 1
	 */
	protected GuiTestObject link_whatIsNotCovered() 
	{
		return new GuiTestObject(
                        getMappedTestObject("link_whatIsNotCovered"));
	}
	/**
	 * WhatIsNotCovered: with specific test context and state.
	 *		.text : What is not covered
	 * 		.id : 
	 * 		.href : RegularExpression(theaa\.com/home-membership)
	 * 		.title : 
	 * 		.class : Html.A
	 * 		.name : 
	 * 		.classIndex : 1
	 */
	protected GuiTestObject link_whatIsNotCovered(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("link_whatIsNotCovered"), anchor, flags);
	}
	
	/**
	 * headerInner: with default state.
	 *		.id : headerInner
	 * 		.title : 
	 * 		.class : Html.DIV
	 * 		.classIndex : 0
	 */
	protected GuiTestObject title() 
	{
		return new GuiTestObject(
                        getMappedTestObject("title"));
	}
	/**
	 * headerInner: with specific test context and state.
	 *		.id : headerInner
	 * 		.title : 
	 * 		.class : Html.DIV
	 * 		.classIndex : 0
	 */
	protected GuiTestObject title(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("title"), anchor, flags);
	}
	
	

	protected Cover_OptionsHelper()
	{
		setScriptName("Home_MK2.Cover_Options");
	}
	
}
