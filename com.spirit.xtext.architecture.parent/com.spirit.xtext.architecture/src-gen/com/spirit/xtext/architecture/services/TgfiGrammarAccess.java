/*
 * generated by Xtext 2.12.0
 */
package com.spirit.xtext.architecture.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.UnorderedGroup;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class TgfiGrammarAccess extends AbstractGrammarElementFinder {
	
	public class TgfiElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.spirit.xtext.architecture.Tgfi.Tgfi");
		private final UnorderedGroup cUnorderedGroup = (UnorderedGroup)rule.eContents().get(1);
		private final Assignment cImportElAssignment_0 = (Assignment)cUnorderedGroup.eContents().get(0);
		private final RuleCall cImportElImportParserRuleCall_0_0 = (RuleCall)cImportElAssignment_0.eContents().get(0);
		private final Assignment cMainAssignment_1 = (Assignment)cUnorderedGroup.eContents().get(1);
		private final RuleCall cMainMainTgfParserRuleCall_1_0 = (RuleCall)cMainAssignment_1.eContents().get(0);
		
		//Tgfi:
		//	importEl+=Import* & main=MainTgf?;
		@Override public ParserRule getRule() { return rule; }
		
		//importEl+=Import* & main=MainTgf?
		public UnorderedGroup getUnorderedGroup() { return cUnorderedGroup; }
		
		//importEl+=Import*
		public Assignment getImportElAssignment_0() { return cImportElAssignment_0; }
		
		//Import
		public RuleCall getImportElImportParserRuleCall_0_0() { return cImportElImportParserRuleCall_0_0; }
		
		//main=MainTgf?
		public Assignment getMainAssignment_1() { return cMainAssignment_1; }
		
		//MainTgf
		public RuleCall getMainMainTgfParserRuleCall_1_0() { return cMainMainTgfParserRuleCall_1_0; }
	}
	public class ImportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.spirit.xtext.architecture.Tgfi.Import");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cImportKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cImportURIAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cImportURISTRINGTerminalRuleCall_1_0 = (RuleCall)cImportURIAssignment_1.eContents().get(0);
		
		//// Imports
		//Import:
		//	'import' importURI=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//'import' importURI=STRING
		public Group getGroup() { return cGroup; }
		
		//'import'
		public Keyword getImportKeyword_0() { return cImportKeyword_0; }
		
		//importURI=STRING
		public Assignment getImportURIAssignment_1() { return cImportURIAssignment_1; }
		
		//STRING
		public RuleCall getImportURISTRINGTerminalRuleCall_1_0() { return cImportURISTRINGTerminalRuleCall_1_0; }
	}
	public class MainTgfElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.spirit.xtext.architecture.Tgfi.MainTgf");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cArchitecturalElementKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cJavaPackageKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Keyword cColonKeyword_3_1 = (Keyword)cGroup_3.eContents().get(1);
		private final Assignment cGenPackageAssignment_3_2 = (Assignment)cGroup_3.eContents().get(2);
		private final RuleCall cGenPackageSTRINGTerminalRuleCall_3_2_0 = (RuleCall)cGenPackageAssignment_3_2.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cNameKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Keyword cColonKeyword_4_1 = (Keyword)cGroup_4.eContents().get(1);
		private final Assignment cSatNameAssignment_4_2 = (Assignment)cGroup_4.eContents().get(2);
		private final RuleCall cSatNameSTRINGTerminalRuleCall_4_2_0 = (RuleCall)cSatNameAssignment_4_2.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cVersionKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Keyword cColonKeyword_5_1 = (Keyword)cGroup_5.eContents().get(1);
		private final Assignment cVersionNameAssignment_5_2 = (Assignment)cGroup_5.eContents().get(2);
		private final RuleCall cVersionNameSTRINGTerminalRuleCall_5_2_0 = (RuleCall)cVersionNameAssignment_5_2.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cStatusKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Keyword cColonKeyword_6_1 = (Keyword)cGroup_6.eContents().get(1);
		private final Assignment cStatusNameAssignment_6_2 = (Assignment)cGroup_6.eContents().get(2);
		private final RuleCall cStatusNameSTRINGTerminalRuleCall_6_2_0 = (RuleCall)cStatusNameAssignment_6_2.eContents().get(0);
		private final Group cGroup_7 = (Group)cGroup.eContents().get(7);
		private final Keyword cObjectiveKeyword_7_0 = (Keyword)cGroup_7.eContents().get(0);
		private final Keyword cColonKeyword_7_1 = (Keyword)cGroup_7.eContents().get(1);
		private final Assignment cObjectiveNameAssignment_7_2 = (Assignment)cGroup_7.eContents().get(2);
		private final RuleCall cObjectiveNameSTRINGTerminalRuleCall_7_2_0 = (RuleCall)cObjectiveNameAssignment_7_2.eContents().get(0);
		private final Group cGroup_8 = (Group)cGroup.eContents().get(8);
		private final Keyword cHL_FunctionKeyword_8_0 = (Keyword)cGroup_8.eContents().get(0);
		private final Keyword cColonKeyword_8_1 = (Keyword)cGroup_8.eContents().get(1);
		private final Assignment cHlfunctionNameAssignment_8_2 = (Assignment)cGroup_8.eContents().get(2);
		private final RuleCall cHlfunctionNameSTRINGTerminalRuleCall_8_2_0 = (RuleCall)cHlfunctionNameAssignment_8_2.eContents().get(0);
		private final Group cGroup_9 = (Group)cGroup.eContents().get(9);
		private final Keyword cRulesKeyword_9_0 = (Keyword)cGroup_9.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_9_1 = (Keyword)cGroup_9.eContents().get(1);
		private final Assignment cRulesAssignment_9_2 = (Assignment)cGroup_9.eContents().get(2);
		private final RuleCall cRulesRuleParserRuleCall_9_2_0 = (RuleCall)cRulesAssignment_9_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_9_3 = (Keyword)cGroup_9.eContents().get(3);
		private final Assignment cProfAssignment_10 = (Assignment)cGroup.eContents().get(10);
		private final RuleCall cProfProfileParserRuleCall_10_0 = (RuleCall)cProfAssignment_10.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_11 = (Keyword)cGroup.eContents().get(11);
		
		//MainTgf:
		//	'ArchitecturalElement' name=ID '{' ('JavaPackage' ':' genPackage=STRING)? ('Name' ':' satName=STRING)? ('Version' ':'
		//	versionName=STRING)? ('Status' ':' statusName=STRING)? ('Objective' ':' objectiveName=STRING)? ('HL_Function' ':'
		//	hlfunctionName=STRING)? ('Rules:' '{' rules+=Rule* '}')*
		//	prof+=Profile+ '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'ArchitecturalElement' name=ID '{' ('JavaPackage' ':' genPackage=STRING)? ('Name' ':' satName=STRING)? ('Version' ':'
		//versionName=STRING)? ('Status' ':' statusName=STRING)? ('Objective' ':' objectiveName=STRING)? ('HL_Function' ':'
		//hlfunctionName=STRING)? ('Rules:' '{' rules+=Rule* '}')* prof+=Profile+ '}'
		public Group getGroup() { return cGroup; }
		
		//'ArchitecturalElement'
		public Keyword getArchitecturalElementKeyword_0() { return cArchitecturalElementKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//('JavaPackage' ':' genPackage=STRING)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'JavaPackage'
		public Keyword getJavaPackageKeyword_3_0() { return cJavaPackageKeyword_3_0; }
		
		//':'
		public Keyword getColonKeyword_3_1() { return cColonKeyword_3_1; }
		
		//genPackage=STRING
		public Assignment getGenPackageAssignment_3_2() { return cGenPackageAssignment_3_2; }
		
		//STRING
		public RuleCall getGenPackageSTRINGTerminalRuleCall_3_2_0() { return cGenPackageSTRINGTerminalRuleCall_3_2_0; }
		
		//('Name' ':' satName=STRING)?
		public Group getGroup_4() { return cGroup_4; }
		
		//'Name'
		public Keyword getNameKeyword_4_0() { return cNameKeyword_4_0; }
		
		//':'
		public Keyword getColonKeyword_4_1() { return cColonKeyword_4_1; }
		
		//satName=STRING
		public Assignment getSatNameAssignment_4_2() { return cSatNameAssignment_4_2; }
		
		//STRING
		public RuleCall getSatNameSTRINGTerminalRuleCall_4_2_0() { return cSatNameSTRINGTerminalRuleCall_4_2_0; }
		
		//('Version' ':' versionName=STRING)?
		public Group getGroup_5() { return cGroup_5; }
		
		//'Version'
		public Keyword getVersionKeyword_5_0() { return cVersionKeyword_5_0; }
		
		//':'
		public Keyword getColonKeyword_5_1() { return cColonKeyword_5_1; }
		
		//versionName=STRING
		public Assignment getVersionNameAssignment_5_2() { return cVersionNameAssignment_5_2; }
		
		//STRING
		public RuleCall getVersionNameSTRINGTerminalRuleCall_5_2_0() { return cVersionNameSTRINGTerminalRuleCall_5_2_0; }
		
		//('Status' ':' statusName=STRING)?
		public Group getGroup_6() { return cGroup_6; }
		
		//'Status'
		public Keyword getStatusKeyword_6_0() { return cStatusKeyword_6_0; }
		
		//':'
		public Keyword getColonKeyword_6_1() { return cColonKeyword_6_1; }
		
		//statusName=STRING
		public Assignment getStatusNameAssignment_6_2() { return cStatusNameAssignment_6_2; }
		
		//STRING
		public RuleCall getStatusNameSTRINGTerminalRuleCall_6_2_0() { return cStatusNameSTRINGTerminalRuleCall_6_2_0; }
		
		//('Objective' ':' objectiveName=STRING)?
		public Group getGroup_7() { return cGroup_7; }
		
		//'Objective'
		public Keyword getObjectiveKeyword_7_0() { return cObjectiveKeyword_7_0; }
		
		//':'
		public Keyword getColonKeyword_7_1() { return cColonKeyword_7_1; }
		
		//objectiveName=STRING
		public Assignment getObjectiveNameAssignment_7_2() { return cObjectiveNameAssignment_7_2; }
		
		//STRING
		public RuleCall getObjectiveNameSTRINGTerminalRuleCall_7_2_0() { return cObjectiveNameSTRINGTerminalRuleCall_7_2_0; }
		
		//('HL_Function' ':' hlfunctionName=STRING)?
		public Group getGroup_8() { return cGroup_8; }
		
		//'HL_Function'
		public Keyword getHL_FunctionKeyword_8_0() { return cHL_FunctionKeyword_8_0; }
		
		//':'
		public Keyword getColonKeyword_8_1() { return cColonKeyword_8_1; }
		
		//hlfunctionName=STRING
		public Assignment getHlfunctionNameAssignment_8_2() { return cHlfunctionNameAssignment_8_2; }
		
		//STRING
		public RuleCall getHlfunctionNameSTRINGTerminalRuleCall_8_2_0() { return cHlfunctionNameSTRINGTerminalRuleCall_8_2_0; }
		
		//('Rules:' '{' rules+=Rule* '}')*
		public Group getGroup_9() { return cGroup_9; }
		
		//'Rules:'
		public Keyword getRulesKeyword_9_0() { return cRulesKeyword_9_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_9_1() { return cLeftCurlyBracketKeyword_9_1; }
		
		//rules+=Rule*
		public Assignment getRulesAssignment_9_2() { return cRulesAssignment_9_2; }
		
		//Rule
		public RuleCall getRulesRuleParserRuleCall_9_2_0() { return cRulesRuleParserRuleCall_9_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_9_3() { return cRightCurlyBracketKeyword_9_3; }
		
		//prof+=Profile+
		public Assignment getProfAssignment_10() { return cProfAssignment_10; }
		
		//Profile
		public RuleCall getProfProfileParserRuleCall_10_0() { return cProfProfileParserRuleCall_10_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_11() { return cRightCurlyBracketKeyword_11; }
	}
	public class ProfileElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.spirit.xtext.architecture.Tgfi.Profile");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cProfileKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cNameKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Keyword cColonKeyword_3_1 = (Keyword)cGroup_3.eContents().get(1);
		private final Assignment cProfNameAssignment_3_2 = (Assignment)cGroup_3.eContents().get(2);
		private final RuleCall cProfNameSTRINGTerminalRuleCall_3_2_0 = (RuleCall)cProfNameAssignment_3_2.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cDescriptionKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Keyword cColonKeyword_4_1 = (Keyword)cGroup_4.eContents().get(1);
		private final Assignment cDescrNameAssignment_4_2 = (Assignment)cGroup_4.eContents().get(2);
		private final RuleCall cDescrNameSTRINGTerminalRuleCall_4_2_0 = (RuleCall)cDescrNameAssignment_4_2.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cFeaturesKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Keyword cColonKeyword_5_1 = (Keyword)cGroup_5.eContents().get(1);
		private final Assignment cFeatNameAssignment_5_2 = (Assignment)cGroup_5.eContents().get(2);
		private final RuleCall cFeatNameSTRINGTerminalRuleCall_5_2_0 = (RuleCall)cFeatNameAssignment_5_2.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cFunctionKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Keyword cColonKeyword_6_1 = (Keyword)cGroup_6.eContents().get(1);
		private final Assignment cFunctionNameAssignment_6_2 = (Assignment)cGroup_6.eContents().get(2);
		private final RuleCall cFunctionNameSTRINGTerminalRuleCall_6_2_0 = (RuleCall)cFunctionNameAssignment_6_2.eContents().get(0);
		private final Keyword cActorsKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cActorAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cActorActorParserRuleCall_8_0 = (RuleCall)cActorAssignment_8.eContents().get(0);
		private final Keyword cTransactionsKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Assignment cTransactionAssignment_10 = (Assignment)cGroup.eContents().get(10);
		private final RuleCall cTransactionTransactionParserRuleCall_10_0 = (RuleCall)cTransactionAssignment_10.eContents().get(0);
		private final Keyword cDomainsKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cDomainAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cDomainDomainParserRuleCall_12_0 = (RuleCall)cDomainAssignment_12.eContents().get(0);
		private final Keyword cQuality_attributesKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Assignment cQualityattrAssignment_14 = (Assignment)cGroup.eContents().get(14);
		private final RuleCall cQualityattrQualityAttrParserRuleCall_14_0 = (RuleCall)cQualityattrAssignment_14.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_15 = (Keyword)cGroup.eContents().get(15);
		
		//Profile: //      'Profile' name=STRING '{' 'actors:' (Actor)+ 'transactions:' (Transaction)+ 'domains:' (Domain)* 'quality_attributes:' (QualityAttr)* Rule*
		//	'Profile' name=ID '{' ('Name' ':' profName=STRING)? ('Description' ':' descrName=STRING)? ('Features' ':'
		//	featName=STRING)? ('Function' ':' functionName=STRING)? 'actors:' actor+=Actor+ 'transactions:'
		//	transaction+=Transaction* 'domains:' domain+=Domain* 'quality_attributes:' qualityattr+=QualityAttr* '}';
		@Override public ParserRule getRule() { return rule; }
		
		////      'Profile' name=STRING '{' 'actors:' (Actor)+ 'transactions:' (Transaction)+ 'domains:' (Domain)* 'quality_attributes:' (QualityAttr)* Rule*
		//'Profile' name=ID '{' ('Name' ':' profName=STRING)? ('Description' ':' descrName=STRING)? ('Features' ':'
		//featName=STRING)? ('Function' ':' functionName=STRING)? 'actors:' actor+=Actor+ 'transactions:'
		//transaction+=Transaction* 'domains:' domain+=Domain* 'quality_attributes:' qualityattr+=QualityAttr* '}'
		public Group getGroup() { return cGroup; }
		
		////      'Profile' name=STRING '{' 'actors:' (Actor)+ 'transactions:' (Transaction)+ 'domains:' (Domain)* 'quality_attributes:' (QualityAttr)* Rule*
		//'Profile'
		public Keyword getProfileKeyword_0() { return cProfileKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//('Name' ':' profName=STRING)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'Name'
		public Keyword getNameKeyword_3_0() { return cNameKeyword_3_0; }
		
		//':'
		public Keyword getColonKeyword_3_1() { return cColonKeyword_3_1; }
		
		//profName=STRING
		public Assignment getProfNameAssignment_3_2() { return cProfNameAssignment_3_2; }
		
		//STRING
		public RuleCall getProfNameSTRINGTerminalRuleCall_3_2_0() { return cProfNameSTRINGTerminalRuleCall_3_2_0; }
		
		//('Description' ':' descrName=STRING)?
		public Group getGroup_4() { return cGroup_4; }
		
		//'Description'
		public Keyword getDescriptionKeyword_4_0() { return cDescriptionKeyword_4_0; }
		
		//':'
		public Keyword getColonKeyword_4_1() { return cColonKeyword_4_1; }
		
		//descrName=STRING
		public Assignment getDescrNameAssignment_4_2() { return cDescrNameAssignment_4_2; }
		
		//STRING
		public RuleCall getDescrNameSTRINGTerminalRuleCall_4_2_0() { return cDescrNameSTRINGTerminalRuleCall_4_2_0; }
		
		//('Features' ':' featName=STRING)?
		public Group getGroup_5() { return cGroup_5; }
		
		//'Features'
		public Keyword getFeaturesKeyword_5_0() { return cFeaturesKeyword_5_0; }
		
		//':'
		public Keyword getColonKeyword_5_1() { return cColonKeyword_5_1; }
		
		//featName=STRING
		public Assignment getFeatNameAssignment_5_2() { return cFeatNameAssignment_5_2; }
		
		//STRING
		public RuleCall getFeatNameSTRINGTerminalRuleCall_5_2_0() { return cFeatNameSTRINGTerminalRuleCall_5_2_0; }
		
		//('Function' ':' functionName=STRING)?
		public Group getGroup_6() { return cGroup_6; }
		
		//'Function'
		public Keyword getFunctionKeyword_6_0() { return cFunctionKeyword_6_0; }
		
		//':'
		public Keyword getColonKeyword_6_1() { return cColonKeyword_6_1; }
		
		//functionName=STRING
		public Assignment getFunctionNameAssignment_6_2() { return cFunctionNameAssignment_6_2; }
		
		//STRING
		public RuleCall getFunctionNameSTRINGTerminalRuleCall_6_2_0() { return cFunctionNameSTRINGTerminalRuleCall_6_2_0; }
		
		//'actors:'
		public Keyword getActorsKeyword_7() { return cActorsKeyword_7; }
		
		//actor+=Actor+
		public Assignment getActorAssignment_8() { return cActorAssignment_8; }
		
		//Actor
		public RuleCall getActorActorParserRuleCall_8_0() { return cActorActorParserRuleCall_8_0; }
		
		//'transactions:'
		public Keyword getTransactionsKeyword_9() { return cTransactionsKeyword_9; }
		
		//transaction+=Transaction*
		public Assignment getTransactionAssignment_10() { return cTransactionAssignment_10; }
		
		//Transaction
		public RuleCall getTransactionTransactionParserRuleCall_10_0() { return cTransactionTransactionParserRuleCall_10_0; }
		
		//'domains:'
		public Keyword getDomainsKeyword_11() { return cDomainsKeyword_11; }
		
		//domain+=Domain*
		public Assignment getDomainAssignment_12() { return cDomainAssignment_12; }
		
		//Domain
		public RuleCall getDomainDomainParserRuleCall_12_0() { return cDomainDomainParserRuleCall_12_0; }
		
		//'quality_attributes:'
		public Keyword getQuality_attributesKeyword_13() { return cQuality_attributesKeyword_13; }
		
		//qualityattr+=QualityAttr*
		public Assignment getQualityattrAssignment_14() { return cQualityattrAssignment_14; }
		
		//QualityAttr
		public RuleCall getQualityattrQualityAttrParserRuleCall_14_0() { return cQualityattrQualityAttrParserRuleCall_14_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_15() { return cRightCurlyBracketKeyword_15; }
	}
	public class ActorElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.spirit.xtext.architecture.Tgfi.Actor");
		private final RuleCall cSTRINGTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//Actor:
		//	STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall() { return cSTRINGTerminalRuleCall; }
	}
	public class TransactionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.spirit.xtext.architecture.Tgfi.Transaction");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cActorParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cCommaKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final RuleCall cSTRINGTerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final Keyword cCommaKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final RuleCall cActorParserRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		private final Keyword cRightParenthesisKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//Transaction:
		//	'(' Actor ',' STRING ',' Actor ')';
		@Override public ParserRule getRule() { return rule; }
		
		//'(' Actor ',' STRING ',' Actor ')'
		public Group getGroup() { return cGroup; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }
		
		//Actor
		public RuleCall getActorParserRuleCall_1() { return cActorParserRuleCall_1; }
		
		//','
		public Keyword getCommaKeyword_2() { return cCommaKeyword_2; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_3() { return cSTRINGTerminalRuleCall_3; }
		
		//','
		public Keyword getCommaKeyword_4() { return cCommaKeyword_4; }
		
		//Actor
		public RuleCall getActorParserRuleCall_5() { return cActorParserRuleCall_5; }
		
		//')'
		public Keyword getRightParenthesisKeyword_6() { return cRightParenthesisKeyword_6; }
	}
	public class DomainElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.spirit.xtext.architecture.Tgfi.Domain");
		private final RuleCall cSTRINGTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//Domain:
		//	STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall() { return cSTRINGTerminalRuleCall; }
	}
	public class QualityAttrElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.spirit.xtext.architecture.Tgfi.QualityAttr");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cQualityAttrIDParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cLeftSquareBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Keyword cRightSquareBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//QualityAttr:
		//	QualityAttrID '[' STRING ']';
		@Override public ParserRule getRule() { return rule; }
		
		//QualityAttrID '[' STRING ']'
		public Group getGroup() { return cGroup; }
		
		//QualityAttrID
		public RuleCall getQualityAttrIDParserRuleCall_0() { return cQualityAttrIDParserRuleCall_0; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_1() { return cLeftSquareBracketKeyword_1; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_2() { return cSTRINGTerminalRuleCall_2; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_3() { return cRightSquareBracketKeyword_3; }
	}
	public class QualityAttrIDElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.spirit.xtext.architecture.Tgfi.QualityAttrID");
		private final RuleCall cIDTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//QualityAttrID:
		//	ID;
		@Override public ParserRule getRule() { return rule; }
		
		//ID
		public RuleCall getIDTerminalRuleCall() { return cIDTerminalRuleCall; }
	}
	public class RuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.spirit.xtext.architecture.Tgfi.Rule");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cRuleIdParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		
		//Rule:
		//	RuleId ':' STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//RuleId ':' STRING
		public Group getGroup() { return cGroup; }
		
		//RuleId
		public RuleCall getRuleIdParserRuleCall_0() { return cRuleIdParserRuleCall_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_2() { return cSTRINGTerminalRuleCall_2; }
	}
	public class RuleIdElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.spirit.xtext.architecture.Tgfi.RuleId");
		private final RuleCall cIDTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//RuleId:
		//	ID;
		@Override public ParserRule getRule() { return rule; }
		
		//ID
		public RuleCall getIDTerminalRuleCall() { return cIDTerminalRuleCall; }
	}
	
	
	private final TgfiElements pTgfi;
	private final ImportElements pImport;
	private final MainTgfElements pMainTgf;
	private final ProfileElements pProfile;
	private final ActorElements pActor;
	private final TransactionElements pTransaction;
	private final DomainElements pDomain;
	private final QualityAttrElements pQualityAttr;
	private final QualityAttrIDElements pQualityAttrID;
	private final RuleElements pRule;
	private final RuleIdElements pRuleId;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public TgfiGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pTgfi = new TgfiElements();
		this.pImport = new ImportElements();
		this.pMainTgf = new MainTgfElements();
		this.pProfile = new ProfileElements();
		this.pActor = new ActorElements();
		this.pTransaction = new TransactionElements();
		this.pDomain = new DomainElements();
		this.pQualityAttr = new QualityAttrElements();
		this.pQualityAttrID = new QualityAttrIDElements();
		this.pRule = new RuleElements();
		this.pRuleId = new RuleIdElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("com.spirit.xtext.architecture.Tgfi".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Tgfi:
	//	importEl+=Import* & main=MainTgf?;
	public TgfiElements getTgfiAccess() {
		return pTgfi;
	}
	
	public ParserRule getTgfiRule() {
		return getTgfiAccess().getRule();
	}
	
	//// Imports
	//Import:
	//	'import' importURI=STRING;
	public ImportElements getImportAccess() {
		return pImport;
	}
	
	public ParserRule getImportRule() {
		return getImportAccess().getRule();
	}
	
	//MainTgf:
	//	'ArchitecturalElement' name=ID '{' ('JavaPackage' ':' genPackage=STRING)? ('Name' ':' satName=STRING)? ('Version' ':'
	//	versionName=STRING)? ('Status' ':' statusName=STRING)? ('Objective' ':' objectiveName=STRING)? ('HL_Function' ':'
	//	hlfunctionName=STRING)? ('Rules:' '{' rules+=Rule* '}')*
	//	prof+=Profile+ '}';
	public MainTgfElements getMainTgfAccess() {
		return pMainTgf;
	}
	
	public ParserRule getMainTgfRule() {
		return getMainTgfAccess().getRule();
	}
	
	//Profile: //      'Profile' name=STRING '{' 'actors:' (Actor)+ 'transactions:' (Transaction)+ 'domains:' (Domain)* 'quality_attributes:' (QualityAttr)* Rule*
	//	'Profile' name=ID '{' ('Name' ':' profName=STRING)? ('Description' ':' descrName=STRING)? ('Features' ':'
	//	featName=STRING)? ('Function' ':' functionName=STRING)? 'actors:' actor+=Actor+ 'transactions:'
	//	transaction+=Transaction* 'domains:' domain+=Domain* 'quality_attributes:' qualityattr+=QualityAttr* '}';
	public ProfileElements getProfileAccess() {
		return pProfile;
	}
	
	public ParserRule getProfileRule() {
		return getProfileAccess().getRule();
	}
	
	//Actor:
	//	STRING;
	public ActorElements getActorAccess() {
		return pActor;
	}
	
	public ParserRule getActorRule() {
		return getActorAccess().getRule();
	}
	
	//Transaction:
	//	'(' Actor ',' STRING ',' Actor ')';
	public TransactionElements getTransactionAccess() {
		return pTransaction;
	}
	
	public ParserRule getTransactionRule() {
		return getTransactionAccess().getRule();
	}
	
	//Domain:
	//	STRING;
	public DomainElements getDomainAccess() {
		return pDomain;
	}
	
	public ParserRule getDomainRule() {
		return getDomainAccess().getRule();
	}
	
	//QualityAttr:
	//	QualityAttrID '[' STRING ']';
	public QualityAttrElements getQualityAttrAccess() {
		return pQualityAttr;
	}
	
	public ParserRule getQualityAttrRule() {
		return getQualityAttrAccess().getRule();
	}
	
	//QualityAttrID:
	//	ID;
	public QualityAttrIDElements getQualityAttrIDAccess() {
		return pQualityAttrID;
	}
	
	public ParserRule getQualityAttrIDRule() {
		return getQualityAttrIDAccess().getRule();
	}
	
	//Rule:
	//	RuleId ':' STRING;
	public RuleElements getRuleAccess() {
		return pRule;
	}
	
	public ParserRule getRuleRule() {
		return getRuleAccess().getRule();
	}
	
	//RuleId:
	//	ID;
	public RuleIdElements getRuleIdAccess() {
		return pRuleId;
	}
	
	public ParserRule getRuleIdRule() {
		return getRuleIdAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}