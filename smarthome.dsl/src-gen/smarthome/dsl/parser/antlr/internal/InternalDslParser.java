package smarthome.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import smarthome.dsl.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Home'", "'{'", "'eventFile'", "'rooms'", "','", "'}'", "'persons'", "'patterns'", "'monitor'", "'start'", "'Room'", "'Person'", "'left-ankle'", "'right-ankle'", "'belt'", "'chest'", "'ID'", "'Pattern'", "'AnalogSensor'", "'DigitalSensor'", "'-'", "'.'", "'E'", "'e'", "'('", "'and'", "')'", "'for'", "'since'", "'is'", "'>'", "'<'", "'='", "'standing'", "'laying'", "'sitting'", "'millis'", "'seconds'", "'minutes'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDsl.g"; }



     	private DslGrammarAccess grammarAccess;

        public InternalDslParser(TokenStream input, DslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Home";
       	}

       	@Override
       	protected DslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleHome"
    // InternalDsl.g:65:1: entryRuleHome returns [EObject current=null] : iv_ruleHome= ruleHome EOF ;
    public final EObject entryRuleHome() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHome = null;


        try {
            // InternalDsl.g:65:45: (iv_ruleHome= ruleHome EOF )
            // InternalDsl.g:66:2: iv_ruleHome= ruleHome EOF
            {
             newCompositeNode(grammarAccess.getHomeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHome=ruleHome();

            state._fsp--;

             current =iv_ruleHome; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHome"


    // $ANTLR start "ruleHome"
    // InternalDsl.g:72:1: ruleHome returns [EObject current=null] : ( () otherlv_1= 'Home' otherlv_2= '{' (otherlv_3= 'eventFile' ( (lv_fileEvents_4_0= ruleEString ) ) ) (otherlv_5= 'rooms' otherlv_6= '{' ( (lv_rooms_7_0= ruleRoom ) ) (otherlv_8= ',' ( (lv_rooms_9_0= ruleRoom ) ) )* otherlv_10= '}' )? (otherlv_11= 'persons' otherlv_12= '{' ( (lv_persons_13_0= rulePerson ) ) (otherlv_14= ',' ( (lv_persons_15_0= rulePerson ) ) )* otherlv_16= '}' )? (otherlv_17= 'patterns' otherlv_18= '{' ( (lv_patterns_19_0= rulePattern ) ) (otherlv_20= ',' ( (lv_patterns_21_0= rulePattern ) ) )* otherlv_22= '}' )? (otherlv_23= 'monitor' ( ( ruleEString ) ) (otherlv_25= ',' ( ( ruleEString ) ) )* )? otherlv_27= 'start' otherlv_28= '}' ) ;
    public final EObject ruleHome() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        AntlrDatatypeRuleToken lv_fileEvents_4_0 = null;

        EObject lv_rooms_7_0 = null;

        EObject lv_rooms_9_0 = null;

        EObject lv_persons_13_0 = null;

        EObject lv_persons_15_0 = null;

        EObject lv_patterns_19_0 = null;

        EObject lv_patterns_21_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:78:2: ( ( () otherlv_1= 'Home' otherlv_2= '{' (otherlv_3= 'eventFile' ( (lv_fileEvents_4_0= ruleEString ) ) ) (otherlv_5= 'rooms' otherlv_6= '{' ( (lv_rooms_7_0= ruleRoom ) ) (otherlv_8= ',' ( (lv_rooms_9_0= ruleRoom ) ) )* otherlv_10= '}' )? (otherlv_11= 'persons' otherlv_12= '{' ( (lv_persons_13_0= rulePerson ) ) (otherlv_14= ',' ( (lv_persons_15_0= rulePerson ) ) )* otherlv_16= '}' )? (otherlv_17= 'patterns' otherlv_18= '{' ( (lv_patterns_19_0= rulePattern ) ) (otherlv_20= ',' ( (lv_patterns_21_0= rulePattern ) ) )* otherlv_22= '}' )? (otherlv_23= 'monitor' ( ( ruleEString ) ) (otherlv_25= ',' ( ( ruleEString ) ) )* )? otherlv_27= 'start' otherlv_28= '}' ) )
            // InternalDsl.g:79:2: ( () otherlv_1= 'Home' otherlv_2= '{' (otherlv_3= 'eventFile' ( (lv_fileEvents_4_0= ruleEString ) ) ) (otherlv_5= 'rooms' otherlv_6= '{' ( (lv_rooms_7_0= ruleRoom ) ) (otherlv_8= ',' ( (lv_rooms_9_0= ruleRoom ) ) )* otherlv_10= '}' )? (otherlv_11= 'persons' otherlv_12= '{' ( (lv_persons_13_0= rulePerson ) ) (otherlv_14= ',' ( (lv_persons_15_0= rulePerson ) ) )* otherlv_16= '}' )? (otherlv_17= 'patterns' otherlv_18= '{' ( (lv_patterns_19_0= rulePattern ) ) (otherlv_20= ',' ( (lv_patterns_21_0= rulePattern ) ) )* otherlv_22= '}' )? (otherlv_23= 'monitor' ( ( ruleEString ) ) (otherlv_25= ',' ( ( ruleEString ) ) )* )? otherlv_27= 'start' otherlv_28= '}' )
            {
            // InternalDsl.g:79:2: ( () otherlv_1= 'Home' otherlv_2= '{' (otherlv_3= 'eventFile' ( (lv_fileEvents_4_0= ruleEString ) ) ) (otherlv_5= 'rooms' otherlv_6= '{' ( (lv_rooms_7_0= ruleRoom ) ) (otherlv_8= ',' ( (lv_rooms_9_0= ruleRoom ) ) )* otherlv_10= '}' )? (otherlv_11= 'persons' otherlv_12= '{' ( (lv_persons_13_0= rulePerson ) ) (otherlv_14= ',' ( (lv_persons_15_0= rulePerson ) ) )* otherlv_16= '}' )? (otherlv_17= 'patterns' otherlv_18= '{' ( (lv_patterns_19_0= rulePattern ) ) (otherlv_20= ',' ( (lv_patterns_21_0= rulePattern ) ) )* otherlv_22= '}' )? (otherlv_23= 'monitor' ( ( ruleEString ) ) (otherlv_25= ',' ( ( ruleEString ) ) )* )? otherlv_27= 'start' otherlv_28= '}' )
            // InternalDsl.g:80:3: () otherlv_1= 'Home' otherlv_2= '{' (otherlv_3= 'eventFile' ( (lv_fileEvents_4_0= ruleEString ) ) ) (otherlv_5= 'rooms' otherlv_6= '{' ( (lv_rooms_7_0= ruleRoom ) ) (otherlv_8= ',' ( (lv_rooms_9_0= ruleRoom ) ) )* otherlv_10= '}' )? (otherlv_11= 'persons' otherlv_12= '{' ( (lv_persons_13_0= rulePerson ) ) (otherlv_14= ',' ( (lv_persons_15_0= rulePerson ) ) )* otherlv_16= '}' )? (otherlv_17= 'patterns' otherlv_18= '{' ( (lv_patterns_19_0= rulePattern ) ) (otherlv_20= ',' ( (lv_patterns_21_0= rulePattern ) ) )* otherlv_22= '}' )? (otherlv_23= 'monitor' ( ( ruleEString ) ) (otherlv_25= ',' ( ( ruleEString ) ) )* )? otherlv_27= 'start' otherlv_28= '}'
            {
            // InternalDsl.g:80:3: ()
            // InternalDsl.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHomeAccess().getHomeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getHomeAccess().getHomeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getHomeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:95:3: (otherlv_3= 'eventFile' ( (lv_fileEvents_4_0= ruleEString ) ) )
            // InternalDsl.g:96:4: otherlv_3= 'eventFile' ( (lv_fileEvents_4_0= ruleEString ) )
            {
            otherlv_3=(Token)match(input,13,FOLLOW_5); 

            				newLeafNode(otherlv_3, grammarAccess.getHomeAccess().getEventFileKeyword_3_0());
            			
            // InternalDsl.g:100:4: ( (lv_fileEvents_4_0= ruleEString ) )
            // InternalDsl.g:101:5: (lv_fileEvents_4_0= ruleEString )
            {
            // InternalDsl.g:101:5: (lv_fileEvents_4_0= ruleEString )
            // InternalDsl.g:102:6: lv_fileEvents_4_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getHomeAccess().getFileEventsEStringParserRuleCall_3_1_0());
            					
            pushFollow(FOLLOW_6);
            lv_fileEvents_4_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getHomeRule());
            						}
            						set(
            							current,
            							"fileEvents",
            							lv_fileEvents_4_0,
            							"smarthome.dsl.Dsl.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalDsl.g:120:3: (otherlv_5= 'rooms' otherlv_6= '{' ( (lv_rooms_7_0= ruleRoom ) ) (otherlv_8= ',' ( (lv_rooms_9_0= ruleRoom ) ) )* otherlv_10= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDsl.g:121:4: otherlv_5= 'rooms' otherlv_6= '{' ( (lv_rooms_7_0= ruleRoom ) ) (otherlv_8= ',' ( (lv_rooms_9_0= ruleRoom ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getHomeAccess().getRoomsKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getHomeAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalDsl.g:129:4: ( (lv_rooms_7_0= ruleRoom ) )
                    // InternalDsl.g:130:5: (lv_rooms_7_0= ruleRoom )
                    {
                    // InternalDsl.g:130:5: (lv_rooms_7_0= ruleRoom )
                    // InternalDsl.g:131:6: lv_rooms_7_0= ruleRoom
                    {

                    						newCompositeNode(grammarAccess.getHomeAccess().getRoomsRoomParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_rooms_7_0=ruleRoom();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getHomeRule());
                    						}
                    						add(
                    							current,
                    							"rooms",
                    							lv_rooms_7_0,
                    							"smarthome.dsl.Dsl.Room");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:148:4: (otherlv_8= ',' ( (lv_rooms_9_0= ruleRoom ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==15) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalDsl.g:149:5: otherlv_8= ',' ( (lv_rooms_9_0= ruleRoom ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getHomeAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalDsl.g:153:5: ( (lv_rooms_9_0= ruleRoom ) )
                    	    // InternalDsl.g:154:6: (lv_rooms_9_0= ruleRoom )
                    	    {
                    	    // InternalDsl.g:154:6: (lv_rooms_9_0= ruleRoom )
                    	    // InternalDsl.g:155:7: lv_rooms_9_0= ruleRoom
                    	    {

                    	    							newCompositeNode(grammarAccess.getHomeAccess().getRoomsRoomParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_rooms_9_0=ruleRoom();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getHomeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"rooms",
                    	    								lv_rooms_9_0,
                    	    								"smarthome.dsl.Dsl.Room");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_10, grammarAccess.getHomeAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalDsl.g:178:3: (otherlv_11= 'persons' otherlv_12= '{' ( (lv_persons_13_0= rulePerson ) ) (otherlv_14= ',' ( (lv_persons_15_0= rulePerson ) ) )* otherlv_16= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDsl.g:179:4: otherlv_11= 'persons' otherlv_12= '{' ( (lv_persons_13_0= rulePerson ) ) (otherlv_14= ',' ( (lv_persons_15_0= rulePerson ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getHomeAccess().getPersonsKeyword_5_0());
                    			
                    otherlv_12=(Token)match(input,12,FOLLOW_10); 

                    				newLeafNode(otherlv_12, grammarAccess.getHomeAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalDsl.g:187:4: ( (lv_persons_13_0= rulePerson ) )
                    // InternalDsl.g:188:5: (lv_persons_13_0= rulePerson )
                    {
                    // InternalDsl.g:188:5: (lv_persons_13_0= rulePerson )
                    // InternalDsl.g:189:6: lv_persons_13_0= rulePerson
                    {

                    						newCompositeNode(grammarAccess.getHomeAccess().getPersonsPersonParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_persons_13_0=rulePerson();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getHomeRule());
                    						}
                    						add(
                    							current,
                    							"persons",
                    							lv_persons_13_0,
                    							"smarthome.dsl.Dsl.Person");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:206:4: (otherlv_14= ',' ( (lv_persons_15_0= rulePerson ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==15) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalDsl.g:207:5: otherlv_14= ',' ( (lv_persons_15_0= rulePerson ) )
                    	    {
                    	    otherlv_14=(Token)match(input,15,FOLLOW_10); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getHomeAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalDsl.g:211:5: ( (lv_persons_15_0= rulePerson ) )
                    	    // InternalDsl.g:212:6: (lv_persons_15_0= rulePerson )
                    	    {
                    	    // InternalDsl.g:212:6: (lv_persons_15_0= rulePerson )
                    	    // InternalDsl.g:213:7: lv_persons_15_0= rulePerson
                    	    {

                    	    							newCompositeNode(grammarAccess.getHomeAccess().getPersonsPersonParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_persons_15_0=rulePerson();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getHomeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"persons",
                    	    								lv_persons_15_0,
                    	    								"smarthome.dsl.Dsl.Person");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,16,FOLLOW_11); 

                    				newLeafNode(otherlv_16, grammarAccess.getHomeAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalDsl.g:236:3: (otherlv_17= 'patterns' otherlv_18= '{' ( (lv_patterns_19_0= rulePattern ) ) (otherlv_20= ',' ( (lv_patterns_21_0= rulePattern ) ) )* otherlv_22= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDsl.g:237:4: otherlv_17= 'patterns' otherlv_18= '{' ( (lv_patterns_19_0= rulePattern ) ) (otherlv_20= ',' ( (lv_patterns_21_0= rulePattern ) ) )* otherlv_22= '}'
                    {
                    otherlv_17=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_17, grammarAccess.getHomeAccess().getPatternsKeyword_6_0());
                    			
                    otherlv_18=(Token)match(input,12,FOLLOW_12); 

                    				newLeafNode(otherlv_18, grammarAccess.getHomeAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalDsl.g:245:4: ( (lv_patterns_19_0= rulePattern ) )
                    // InternalDsl.g:246:5: (lv_patterns_19_0= rulePattern )
                    {
                    // InternalDsl.g:246:5: (lv_patterns_19_0= rulePattern )
                    // InternalDsl.g:247:6: lv_patterns_19_0= rulePattern
                    {

                    						newCompositeNode(grammarAccess.getHomeAccess().getPatternsPatternParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_patterns_19_0=rulePattern();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getHomeRule());
                    						}
                    						add(
                    							current,
                    							"patterns",
                    							lv_patterns_19_0,
                    							"smarthome.dsl.Dsl.Pattern");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:264:4: (otherlv_20= ',' ( (lv_patterns_21_0= rulePattern ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==15) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalDsl.g:265:5: otherlv_20= ',' ( (lv_patterns_21_0= rulePattern ) )
                    	    {
                    	    otherlv_20=(Token)match(input,15,FOLLOW_12); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getHomeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalDsl.g:269:5: ( (lv_patterns_21_0= rulePattern ) )
                    	    // InternalDsl.g:270:6: (lv_patterns_21_0= rulePattern )
                    	    {
                    	    // InternalDsl.g:270:6: (lv_patterns_21_0= rulePattern )
                    	    // InternalDsl.g:271:7: lv_patterns_21_0= rulePattern
                    	    {

                    	    							newCompositeNode(grammarAccess.getHomeAccess().getPatternsPatternParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_patterns_21_0=rulePattern();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getHomeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"patterns",
                    	    								lv_patterns_21_0,
                    	    								"smarthome.dsl.Dsl.Pattern");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,16,FOLLOW_13); 

                    				newLeafNode(otherlv_22, grammarAccess.getHomeAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalDsl.g:294:3: (otherlv_23= 'monitor' ( ( ruleEString ) ) (otherlv_25= ',' ( ( ruleEString ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDsl.g:295:4: otherlv_23= 'monitor' ( ( ruleEString ) ) (otherlv_25= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_23=(Token)match(input,19,FOLLOW_5); 

                    				newLeafNode(otherlv_23, grammarAccess.getHomeAccess().getMonitorKeyword_7_0());
                    			
                    // InternalDsl.g:299:4: ( ( ruleEString ) )
                    // InternalDsl.g:300:5: ( ruleEString )
                    {
                    // InternalDsl.g:300:5: ( ruleEString )
                    // InternalDsl.g:301:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getHomeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getHomeAccess().getMonitoredEntitiesNamedEntityCrossReference_7_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:315:4: (otherlv_25= ',' ( ( ruleEString ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==15) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalDsl.g:316:5: otherlv_25= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_25=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_25, grammarAccess.getHomeAccess().getCommaKeyword_7_2_0());
                    	    				
                    	    // InternalDsl.g:320:5: ( ( ruleEString ) )
                    	    // InternalDsl.g:321:6: ( ruleEString )
                    	    {
                    	    // InternalDsl.g:321:6: ( ruleEString )
                    	    // InternalDsl.g:322:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getHomeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getHomeAccess().getMonitoredEntitiesNamedEntityCrossReference_7_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_27=(Token)match(input,20,FOLLOW_15); 

            			newLeafNode(otherlv_27, grammarAccess.getHomeAccess().getStartKeyword_8());
            		
            otherlv_28=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_28, grammarAccess.getHomeAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHome"


    // $ANTLR start "entryRuleSensor"
    // InternalDsl.g:350:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalDsl.g:350:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalDsl.g:351:2: iv_ruleSensor= ruleSensor EOF
            {
             newCompositeNode(grammarAccess.getSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSensor=ruleSensor();

            state._fsp--;

             current =iv_ruleSensor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSensor"


    // $ANTLR start "ruleSensor"
    // InternalDsl.g:357:1: ruleSensor returns [EObject current=null] : (this_AnalogSensor_0= ruleAnalogSensor | this_DigitalSensor_1= ruleDigitalSensor ) ;
    public final EObject ruleSensor() throws RecognitionException {
        EObject current = null;

        EObject this_AnalogSensor_0 = null;

        EObject this_DigitalSensor_1 = null;



        	enterRule();

        try {
            // InternalDsl.g:363:2: ( (this_AnalogSensor_0= ruleAnalogSensor | this_DigitalSensor_1= ruleDigitalSensor ) )
            // InternalDsl.g:364:2: (this_AnalogSensor_0= ruleAnalogSensor | this_DigitalSensor_1= ruleDigitalSensor )
            {
            // InternalDsl.g:364:2: (this_AnalogSensor_0= ruleAnalogSensor | this_DigitalSensor_1= ruleDigitalSensor )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==29) ) {
                alt9=1;
            }
            else if ( (LA9_0==30) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalDsl.g:365:3: this_AnalogSensor_0= ruleAnalogSensor
                    {

                    			newCompositeNode(grammarAccess.getSensorAccess().getAnalogSensorParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AnalogSensor_0=ruleAnalogSensor();

                    state._fsp--;


                    			current = this_AnalogSensor_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:374:3: this_DigitalSensor_1= ruleDigitalSensor
                    {

                    			newCompositeNode(grammarAccess.getSensorAccess().getDigitalSensorParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DigitalSensor_1=ruleDigitalSensor();

                    state._fsp--;


                    			current = this_DigitalSensor_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSensor"


    // $ANTLR start "entryRulePredicate"
    // InternalDsl.g:386:1: entryRulePredicate returns [EObject current=null] : iv_rulePredicate= rulePredicate EOF ;
    public final EObject entryRulePredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicate = null;


        try {
            // InternalDsl.g:386:50: (iv_rulePredicate= rulePredicate EOF )
            // InternalDsl.g:387:2: iv_rulePredicate= rulePredicate EOF
            {
             newCompositeNode(grammarAccess.getPredicateRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePredicate=rulePredicate();

            state._fsp--;

             current =iv_rulePredicate; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePredicate"


    // $ANTLR start "rulePredicate"
    // InternalDsl.g:393:1: rulePredicate returns [EObject current=null] : (this_SensorPredicate_0= ruleSensorPredicate | this_PersonPredicate_1= rulePersonPredicate ) ;
    public final EObject rulePredicate() throws RecognitionException {
        EObject current = null;

        EObject this_SensorPredicate_0 = null;

        EObject this_PersonPredicate_1 = null;



        	enterRule();

        try {
            // InternalDsl.g:399:2: ( (this_SensorPredicate_0= ruleSensorPredicate | this_PersonPredicate_1= rulePersonPredicate ) )
            // InternalDsl.g:400:2: (this_SensorPredicate_0= ruleSensorPredicate | this_PersonPredicate_1= rulePersonPredicate )
            {
            // InternalDsl.g:400:2: (this_SensorPredicate_0= ruleSensorPredicate | this_PersonPredicate_1= rulePersonPredicate )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                int LA10_1 = input.LA(2);

                if ( ((LA10_1>=41 && LA10_1<=43)) ) {
                    alt10=1;
                }
                else if ( (LA10_1==40) ) {
                    alt10=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA10_0==RULE_ID) ) {
                int LA10_2 = input.LA(2);

                if ( (LA10_2==40) ) {
                    alt10=2;
                }
                else if ( ((LA10_2>=41 && LA10_2<=43)) ) {
                    alt10=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalDsl.g:401:3: this_SensorPredicate_0= ruleSensorPredicate
                    {

                    			newCompositeNode(grammarAccess.getPredicateAccess().getSensorPredicateParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SensorPredicate_0=ruleSensorPredicate();

                    state._fsp--;


                    			current = this_SensorPredicate_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:410:3: this_PersonPredicate_1= rulePersonPredicate
                    {

                    			newCompositeNode(grammarAccess.getPredicateAccess().getPersonPredicateParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PersonPredicate_1=rulePersonPredicate();

                    state._fsp--;


                    			current = this_PersonPredicate_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePredicate"


    // $ANTLR start "entryRuleRoom"
    // InternalDsl.g:422:1: entryRuleRoom returns [EObject current=null] : iv_ruleRoom= ruleRoom EOF ;
    public final EObject entryRuleRoom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoom = null;


        try {
            // InternalDsl.g:422:45: (iv_ruleRoom= ruleRoom EOF )
            // InternalDsl.g:423:2: iv_ruleRoom= ruleRoom EOF
            {
             newCompositeNode(grammarAccess.getRoomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoom=ruleRoom();

            state._fsp--;

             current =iv_ruleRoom; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRoom"


    // $ANTLR start "ruleRoom"
    // InternalDsl.g:429:1: ruleRoom returns [EObject current=null] : ( () otherlv_1= 'Room' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_sensors_4_0= ruleSensor ) ) (otherlv_5= ',' ( (lv_sensors_6_0= ruleSensor ) ) )* )? otherlv_7= '}' ) ;
    public final EObject ruleRoom() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_sensors_4_0 = null;

        EObject lv_sensors_6_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:435:2: ( ( () otherlv_1= 'Room' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_sensors_4_0= ruleSensor ) ) (otherlv_5= ',' ( (lv_sensors_6_0= ruleSensor ) ) )* )? otherlv_7= '}' ) )
            // InternalDsl.g:436:2: ( () otherlv_1= 'Room' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_sensors_4_0= ruleSensor ) ) (otherlv_5= ',' ( (lv_sensors_6_0= ruleSensor ) ) )* )? otherlv_7= '}' )
            {
            // InternalDsl.g:436:2: ( () otherlv_1= 'Room' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_sensors_4_0= ruleSensor ) ) (otherlv_5= ',' ( (lv_sensors_6_0= ruleSensor ) ) )* )? otherlv_7= '}' )
            // InternalDsl.g:437:3: () otherlv_1= 'Room' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_sensors_4_0= ruleSensor ) ) (otherlv_5= ',' ( (lv_sensors_6_0= ruleSensor ) ) )* )? otherlv_7= '}'
            {
            // InternalDsl.g:437:3: ()
            // InternalDsl.g:438:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRoomAccess().getRoomAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getRoomAccess().getRoomKeyword_1());
            		
            // InternalDsl.g:448:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDsl.g:449:4: (lv_name_2_0= ruleEString )
            {
            // InternalDsl.g:449:4: (lv_name_2_0= ruleEString )
            // InternalDsl.g:450:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRoomAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRoomRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"smarthome.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getRoomAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDsl.g:471:3: ( ( (lv_sensors_4_0= ruleSensor ) ) (otherlv_5= ',' ( (lv_sensors_6_0= ruleSensor ) ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=29 && LA12_0<=30)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDsl.g:472:4: ( (lv_sensors_4_0= ruleSensor ) ) (otherlv_5= ',' ( (lv_sensors_6_0= ruleSensor ) ) )*
                    {
                    // InternalDsl.g:472:4: ( (lv_sensors_4_0= ruleSensor ) )
                    // InternalDsl.g:473:5: (lv_sensors_4_0= ruleSensor )
                    {
                    // InternalDsl.g:473:5: (lv_sensors_4_0= ruleSensor )
                    // InternalDsl.g:474:6: lv_sensors_4_0= ruleSensor
                    {

                    						newCompositeNode(grammarAccess.getRoomAccess().getSensorsSensorParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_sensors_4_0=ruleSensor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRoomRule());
                    						}
                    						add(
                    							current,
                    							"sensors",
                    							lv_sensors_4_0,
                    							"smarthome.dsl.Dsl.Sensor");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:491:4: (otherlv_5= ',' ( (lv_sensors_6_0= ruleSensor ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==15) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalDsl.g:492:5: otherlv_5= ',' ( (lv_sensors_6_0= ruleSensor ) )
                    	    {
                    	    otherlv_5=(Token)match(input,15,FOLLOW_17); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getRoomAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalDsl.g:496:5: ( (lv_sensors_6_0= ruleSensor ) )
                    	    // InternalDsl.g:497:6: (lv_sensors_6_0= ruleSensor )
                    	    {
                    	    // InternalDsl.g:497:6: (lv_sensors_6_0= ruleSensor )
                    	    // InternalDsl.g:498:7: lv_sensors_6_0= ruleSensor
                    	    {

                    	    							newCompositeNode(grammarAccess.getRoomAccess().getSensorsSensorParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_sensors_6_0=ruleSensor();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRoomRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"sensors",
                    	    								lv_sensors_6_0,
                    	    								"smarthome.dsl.Dsl.Sensor");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getRoomAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRoom"


    // $ANTLR start "entryRulePerson"
    // InternalDsl.g:525:1: entryRulePerson returns [EObject current=null] : iv_rulePerson= rulePerson EOF ;
    public final EObject entryRulePerson() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerson = null;


        try {
            // InternalDsl.g:525:47: (iv_rulePerson= rulePerson EOF )
            // InternalDsl.g:526:2: iv_rulePerson= rulePerson EOF
            {
             newCompositeNode(grammarAccess.getPersonRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePerson=rulePerson();

            state._fsp--;

             current =iv_rulePerson; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePerson"


    // $ANTLR start "rulePerson"
    // InternalDsl.g:532:1: rulePerson returns [EObject current=null] : ( () otherlv_1= 'Person' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'left-ankle' ( (lv_ankleLeft_5_0= ruleTag ) ) otherlv_6= 'right-ankle' ( (lv_ankleRight_7_0= ruleTag ) ) otherlv_8= 'belt' ( (lv_belt_9_0= ruleTag ) ) otherlv_10= 'chest' ( (lv_chest_11_0= ruleTag ) ) otherlv_12= '}' ) ;
    public final EObject rulePerson() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_ankleLeft_5_0 = null;

        EObject lv_ankleRight_7_0 = null;

        EObject lv_belt_9_0 = null;

        EObject lv_chest_11_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:538:2: ( ( () otherlv_1= 'Person' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'left-ankle' ( (lv_ankleLeft_5_0= ruleTag ) ) otherlv_6= 'right-ankle' ( (lv_ankleRight_7_0= ruleTag ) ) otherlv_8= 'belt' ( (lv_belt_9_0= ruleTag ) ) otherlv_10= 'chest' ( (lv_chest_11_0= ruleTag ) ) otherlv_12= '}' ) )
            // InternalDsl.g:539:2: ( () otherlv_1= 'Person' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'left-ankle' ( (lv_ankleLeft_5_0= ruleTag ) ) otherlv_6= 'right-ankle' ( (lv_ankleRight_7_0= ruleTag ) ) otherlv_8= 'belt' ( (lv_belt_9_0= ruleTag ) ) otherlv_10= 'chest' ( (lv_chest_11_0= ruleTag ) ) otherlv_12= '}' )
            {
            // InternalDsl.g:539:2: ( () otherlv_1= 'Person' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'left-ankle' ( (lv_ankleLeft_5_0= ruleTag ) ) otherlv_6= 'right-ankle' ( (lv_ankleRight_7_0= ruleTag ) ) otherlv_8= 'belt' ( (lv_belt_9_0= ruleTag ) ) otherlv_10= 'chest' ( (lv_chest_11_0= ruleTag ) ) otherlv_12= '}' )
            // InternalDsl.g:540:3: () otherlv_1= 'Person' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'left-ankle' ( (lv_ankleLeft_5_0= ruleTag ) ) otherlv_6= 'right-ankle' ( (lv_ankleRight_7_0= ruleTag ) ) otherlv_8= 'belt' ( (lv_belt_9_0= ruleTag ) ) otherlv_10= 'chest' ( (lv_chest_11_0= ruleTag ) ) otherlv_12= '}'
            {
            // InternalDsl.g:540:3: ()
            // InternalDsl.g:541:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPersonAccess().getPersonAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getPersonAccess().getPersonKeyword_1());
            		
            // InternalDsl.g:551:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDsl.g:552:4: (lv_name_2_0= ruleEString )
            {
            // InternalDsl.g:552:4: (lv_name_2_0= ruleEString )
            // InternalDsl.g:553:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPersonAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPersonRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"smarthome.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getPersonAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,23,FOLLOW_19); 

            			newLeafNode(otherlv_4, grammarAccess.getPersonAccess().getLeftAnkleKeyword_4());
            		
            // InternalDsl.g:578:3: ( (lv_ankleLeft_5_0= ruleTag ) )
            // InternalDsl.g:579:4: (lv_ankleLeft_5_0= ruleTag )
            {
            // InternalDsl.g:579:4: (lv_ankleLeft_5_0= ruleTag )
            // InternalDsl.g:580:5: lv_ankleLeft_5_0= ruleTag
            {

            					newCompositeNode(grammarAccess.getPersonAccess().getAnkleLeftTagParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_20);
            lv_ankleLeft_5_0=ruleTag();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPersonRule());
            					}
            					set(
            						current,
            						"ankleLeft",
            						lv_ankleLeft_5_0,
            						"smarthome.dsl.Dsl.Tag");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,24,FOLLOW_19); 

            			newLeafNode(otherlv_6, grammarAccess.getPersonAccess().getRightAnkleKeyword_6());
            		
            // InternalDsl.g:601:3: ( (lv_ankleRight_7_0= ruleTag ) )
            // InternalDsl.g:602:4: (lv_ankleRight_7_0= ruleTag )
            {
            // InternalDsl.g:602:4: (lv_ankleRight_7_0= ruleTag )
            // InternalDsl.g:603:5: lv_ankleRight_7_0= ruleTag
            {

            					newCompositeNode(grammarAccess.getPersonAccess().getAnkleRightTagParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_21);
            lv_ankleRight_7_0=ruleTag();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPersonRule());
            					}
            					set(
            						current,
            						"ankleRight",
            						lv_ankleRight_7_0,
            						"smarthome.dsl.Dsl.Tag");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_8, grammarAccess.getPersonAccess().getBeltKeyword_8());
            		
            // InternalDsl.g:624:3: ( (lv_belt_9_0= ruleTag ) )
            // InternalDsl.g:625:4: (lv_belt_9_0= ruleTag )
            {
            // InternalDsl.g:625:4: (lv_belt_9_0= ruleTag )
            // InternalDsl.g:626:5: lv_belt_9_0= ruleTag
            {

            					newCompositeNode(grammarAccess.getPersonAccess().getBeltTagParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_22);
            lv_belt_9_0=ruleTag();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPersonRule());
            					}
            					set(
            						current,
            						"belt",
            						lv_belt_9_0,
            						"smarthome.dsl.Dsl.Tag");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,26,FOLLOW_19); 

            			newLeafNode(otherlv_10, grammarAccess.getPersonAccess().getChestKeyword_10());
            		
            // InternalDsl.g:647:3: ( (lv_chest_11_0= ruleTag ) )
            // InternalDsl.g:648:4: (lv_chest_11_0= ruleTag )
            {
            // InternalDsl.g:648:4: (lv_chest_11_0= ruleTag )
            // InternalDsl.g:649:5: lv_chest_11_0= ruleTag
            {

            					newCompositeNode(grammarAccess.getPersonAccess().getChestTagParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_15);
            lv_chest_11_0=ruleTag();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPersonRule());
            					}
            					set(
            						current,
            						"chest",
            						lv_chest_11_0,
            						"smarthome.dsl.Dsl.Tag");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getPersonAccess().getRightCurlyBracketKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePerson"


    // $ANTLR start "entryRuleTag"
    // InternalDsl.g:674:1: entryRuleTag returns [EObject current=null] : iv_ruleTag= ruleTag EOF ;
    public final EObject entryRuleTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTag = null;


        try {
            // InternalDsl.g:674:44: (iv_ruleTag= ruleTag EOF )
            // InternalDsl.g:675:2: iv_ruleTag= ruleTag EOF
            {
             newCompositeNode(grammarAccess.getTagRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTag=ruleTag();

            state._fsp--;

             current =iv_ruleTag; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTag"


    // $ANTLR start "ruleTag"
    // InternalDsl.g:681:1: ruleTag returns [EObject current=null] : ( () otherlv_1= 'ID' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleTag() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:687:2: ( ( () otherlv_1= 'ID' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalDsl.g:688:2: ( () otherlv_1= 'ID' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalDsl.g:688:2: ( () otherlv_1= 'ID' ( (lv_name_2_0= ruleEString ) ) )
            // InternalDsl.g:689:3: () otherlv_1= 'ID' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalDsl.g:689:3: ()
            // InternalDsl.g:690:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTagAccess().getTagAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getTagAccess().getIDKeyword_1());
            		
            // InternalDsl.g:700:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDsl.g:701:4: (lv_name_2_0= ruleEString )
            {
            // InternalDsl.g:701:4: (lv_name_2_0= ruleEString )
            // InternalDsl.g:702:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTagAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTagRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"smarthome.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTag"


    // $ANTLR start "entryRulePattern"
    // InternalDsl.g:723:1: entryRulePattern returns [EObject current=null] : iv_rulePattern= rulePattern EOF ;
    public final EObject entryRulePattern() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePattern = null;


        try {
            // InternalDsl.g:723:48: (iv_rulePattern= rulePattern EOF )
            // InternalDsl.g:724:2: iv_rulePattern= rulePattern EOF
            {
             newCompositeNode(grammarAccess.getPatternRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePattern=rulePattern();

            state._fsp--;

             current =iv_rulePattern; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePattern"


    // $ANTLR start "rulePattern"
    // InternalDsl.g:730:1: rulePattern returns [EObject current=null] : ( () otherlv_1= 'Pattern' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_rules_4_0= ruleRule ) ) (otherlv_5= ',' ( (lv_rules_6_0= ruleRule ) ) )* )? otherlv_7= '}' ) ;
    public final EObject rulePattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_rules_4_0 = null;

        EObject lv_rules_6_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:736:2: ( ( () otherlv_1= 'Pattern' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_rules_4_0= ruleRule ) ) (otherlv_5= ',' ( (lv_rules_6_0= ruleRule ) ) )* )? otherlv_7= '}' ) )
            // InternalDsl.g:737:2: ( () otherlv_1= 'Pattern' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_rules_4_0= ruleRule ) ) (otherlv_5= ',' ( (lv_rules_6_0= ruleRule ) ) )* )? otherlv_7= '}' )
            {
            // InternalDsl.g:737:2: ( () otherlv_1= 'Pattern' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_rules_4_0= ruleRule ) ) (otherlv_5= ',' ( (lv_rules_6_0= ruleRule ) ) )* )? otherlv_7= '}' )
            // InternalDsl.g:738:3: () otherlv_1= 'Pattern' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_rules_4_0= ruleRule ) ) (otherlv_5= ',' ( (lv_rules_6_0= ruleRule ) ) )* )? otherlv_7= '}'
            {
            // InternalDsl.g:738:3: ()
            // InternalDsl.g:739:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPatternAccess().getPatternAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getPatternAccess().getPatternKeyword_1());
            		
            // InternalDsl.g:749:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDsl.g:750:4: (lv_name_2_0= ruleEString )
            {
            // InternalDsl.g:750:4: (lv_name_2_0= ruleEString )
            // InternalDsl.g:751:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPatternAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPatternRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"smarthome.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getPatternAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDsl.g:772:3: ( ( (lv_rules_4_0= ruleRule ) ) (otherlv_5= ',' ( (lv_rules_6_0= ruleRule ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==12) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDsl.g:773:4: ( (lv_rules_4_0= ruleRule ) ) (otherlv_5= ',' ( (lv_rules_6_0= ruleRule ) ) )*
                    {
                    // InternalDsl.g:773:4: ( (lv_rules_4_0= ruleRule ) )
                    // InternalDsl.g:774:5: (lv_rules_4_0= ruleRule )
                    {
                    // InternalDsl.g:774:5: (lv_rules_4_0= ruleRule )
                    // InternalDsl.g:775:6: lv_rules_4_0= ruleRule
                    {

                    						newCompositeNode(grammarAccess.getPatternAccess().getRulesRuleParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_rules_4_0=ruleRule();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPatternRule());
                    						}
                    						add(
                    							current,
                    							"rules",
                    							lv_rules_4_0,
                    							"smarthome.dsl.Dsl.Rule");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:792:4: (otherlv_5= ',' ( (lv_rules_6_0= ruleRule ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==15) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalDsl.g:793:5: otherlv_5= ',' ( (lv_rules_6_0= ruleRule ) )
                    	    {
                    	    otherlv_5=(Token)match(input,15,FOLLOW_3); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getPatternAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalDsl.g:797:5: ( (lv_rules_6_0= ruleRule ) )
                    	    // InternalDsl.g:798:6: (lv_rules_6_0= ruleRule )
                    	    {
                    	    // InternalDsl.g:798:6: (lv_rules_6_0= ruleRule )
                    	    // InternalDsl.g:799:7: lv_rules_6_0= ruleRule
                    	    {

                    	    							newCompositeNode(grammarAccess.getPatternAccess().getRulesRuleParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_rules_6_0=ruleRule();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPatternRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"rules",
                    	    								lv_rules_6_0,
                    	    								"smarthome.dsl.Dsl.Rule");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getPatternAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePattern"


    // $ANTLR start "entryRuleEString"
    // InternalDsl.g:826:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalDsl.g:826:47: (iv_ruleEString= ruleEString EOF )
            // InternalDsl.g:827:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalDsl.g:833:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalDsl.g:839:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalDsl.g:840:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalDsl.g:840:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_ID) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalDsl.g:841:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:849:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleAnalogSensor"
    // InternalDsl.g:860:1: entryRuleAnalogSensor returns [EObject current=null] : iv_ruleAnalogSensor= ruleAnalogSensor EOF ;
    public final EObject entryRuleAnalogSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnalogSensor = null;


        try {
            // InternalDsl.g:860:53: (iv_ruleAnalogSensor= ruleAnalogSensor EOF )
            // InternalDsl.g:861:2: iv_ruleAnalogSensor= ruleAnalogSensor EOF
            {
             newCompositeNode(grammarAccess.getAnalogSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnalogSensor=ruleAnalogSensor();

            state._fsp--;

             current =iv_ruleAnalogSensor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnalogSensor"


    // $ANTLR start "ruleAnalogSensor"
    // InternalDsl.g:867:1: ruleAnalogSensor returns [EObject current=null] : ( () otherlv_1= 'AnalogSensor' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleAnalogSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:873:2: ( ( () otherlv_1= 'AnalogSensor' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalDsl.g:874:2: ( () otherlv_1= 'AnalogSensor' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalDsl.g:874:2: ( () otherlv_1= 'AnalogSensor' ( (lv_name_2_0= ruleEString ) ) )
            // InternalDsl.g:875:3: () otherlv_1= 'AnalogSensor' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalDsl.g:875:3: ()
            // InternalDsl.g:876:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAnalogSensorAccess().getAnalogSensorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getAnalogSensorAccess().getAnalogSensorKeyword_1());
            		
            // InternalDsl.g:886:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDsl.g:887:4: (lv_name_2_0= ruleEString )
            {
            // InternalDsl.g:887:4: (lv_name_2_0= ruleEString )
            // InternalDsl.g:888:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAnalogSensorAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAnalogSensorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"smarthome.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnalogSensor"


    // $ANTLR start "entryRuleDigitalSensor"
    // InternalDsl.g:909:1: entryRuleDigitalSensor returns [EObject current=null] : iv_ruleDigitalSensor= ruleDigitalSensor EOF ;
    public final EObject entryRuleDigitalSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDigitalSensor = null;


        try {
            // InternalDsl.g:909:54: (iv_ruleDigitalSensor= ruleDigitalSensor EOF )
            // InternalDsl.g:910:2: iv_ruleDigitalSensor= ruleDigitalSensor EOF
            {
             newCompositeNode(grammarAccess.getDigitalSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDigitalSensor=ruleDigitalSensor();

            state._fsp--;

             current =iv_ruleDigitalSensor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDigitalSensor"


    // $ANTLR start "ruleDigitalSensor"
    // InternalDsl.g:916:1: ruleDigitalSensor returns [EObject current=null] : ( () otherlv_1= 'DigitalSensor' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleDigitalSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:922:2: ( ( () otherlv_1= 'DigitalSensor' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalDsl.g:923:2: ( () otherlv_1= 'DigitalSensor' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalDsl.g:923:2: ( () otherlv_1= 'DigitalSensor' ( (lv_name_2_0= ruleEString ) ) )
            // InternalDsl.g:924:3: () otherlv_1= 'DigitalSensor' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalDsl.g:924:3: ()
            // InternalDsl.g:925:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDigitalSensorAccess().getDigitalSensorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getDigitalSensorAccess().getDigitalSensorKeyword_1());
            		
            // InternalDsl.g:935:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDsl.g:936:4: (lv_name_2_0= ruleEString )
            {
            // InternalDsl.g:936:4: (lv_name_2_0= ruleEString )
            // InternalDsl.g:937:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDigitalSensorAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDigitalSensorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"smarthome.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDigitalSensor"


    // $ANTLR start "entryRuleEDouble"
    // InternalDsl.g:958:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalDsl.g:958:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalDsl.g:959:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalDsl.g:965:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalDsl.g:971:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalDsl.g:972:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalDsl.g:972:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalDsl.g:973:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalDsl.g:973:3: (kw= '-' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==31) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDsl.g:974:4: kw= '-'
                    {
                    kw=(Token)match(input,31,FOLLOW_24); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalDsl.g:980:3: (this_INT_1= RULE_INT )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_INT) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalDsl.g:981:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_25); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,32,FOLLOW_26); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_27); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalDsl.g:1001:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=33 && LA20_0<=34)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalDsl.g:1002:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalDsl.g:1002:4: (kw= 'E' | kw= 'e' )
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==33) ) {
                        alt18=1;
                    }
                    else if ( (LA18_0==34) ) {
                        alt18=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 0, input);

                        throw nvae;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalDsl.g:1003:5: kw= 'E'
                            {
                            kw=(Token)match(input,33,FOLLOW_28); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalDsl.g:1009:5: kw= 'e'
                            {
                            kw=(Token)match(input,34,FOLLOW_28); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalDsl.g:1015:4: (kw= '-' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==31) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalDsl.g:1016:5: kw= '-'
                            {
                            kw=(Token)match(input,31,FOLLOW_26); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleRule"
    // InternalDsl.g:1034:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalDsl.g:1034:45: (iv_ruleRule= ruleRule EOF )
            // InternalDsl.g:1035:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalDsl.g:1041:1: ruleRule returns [EObject current=null] : ( () otherlv_1= '{' (otherlv_2= '(' ( (lv_predicates_3_0= rulePredicate ) ) (otherlv_4= 'and' ( (lv_predicates_5_0= rulePredicate ) ) )* otherlv_6= ')' )? ( (otherlv_7= 'for' | otherlv_8= 'since' ) ( (lv_duration_9_0= ruleDuration ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_predicates_3_0 = null;

        EObject lv_predicates_5_0 = null;

        EObject lv_duration_9_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1047:2: ( ( () otherlv_1= '{' (otherlv_2= '(' ( (lv_predicates_3_0= rulePredicate ) ) (otherlv_4= 'and' ( (lv_predicates_5_0= rulePredicate ) ) )* otherlv_6= ')' )? ( (otherlv_7= 'for' | otherlv_8= 'since' ) ( (lv_duration_9_0= ruleDuration ) ) )? otherlv_10= '}' ) )
            // InternalDsl.g:1048:2: ( () otherlv_1= '{' (otherlv_2= '(' ( (lv_predicates_3_0= rulePredicate ) ) (otherlv_4= 'and' ( (lv_predicates_5_0= rulePredicate ) ) )* otherlv_6= ')' )? ( (otherlv_7= 'for' | otherlv_8= 'since' ) ( (lv_duration_9_0= ruleDuration ) ) )? otherlv_10= '}' )
            {
            // InternalDsl.g:1048:2: ( () otherlv_1= '{' (otherlv_2= '(' ( (lv_predicates_3_0= rulePredicate ) ) (otherlv_4= 'and' ( (lv_predicates_5_0= rulePredicate ) ) )* otherlv_6= ')' )? ( (otherlv_7= 'for' | otherlv_8= 'since' ) ( (lv_duration_9_0= ruleDuration ) ) )? otherlv_10= '}' )
            // InternalDsl.g:1049:3: () otherlv_1= '{' (otherlv_2= '(' ( (lv_predicates_3_0= rulePredicate ) ) (otherlv_4= 'and' ( (lv_predicates_5_0= rulePredicate ) ) )* otherlv_6= ')' )? ( (otherlv_7= 'for' | otherlv_8= 'since' ) ( (lv_duration_9_0= ruleDuration ) ) )? otherlv_10= '}'
            {
            // InternalDsl.g:1049:3: ()
            // InternalDsl.g:1050:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRuleAccess().getRuleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalDsl.g:1060:3: (otherlv_2= '(' ( (lv_predicates_3_0= rulePredicate ) ) (otherlv_4= 'and' ( (lv_predicates_5_0= rulePredicate ) ) )* otherlv_6= ')' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==35) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalDsl.g:1061:4: otherlv_2= '(' ( (lv_predicates_3_0= rulePredicate ) ) (otherlv_4= 'and' ( (lv_predicates_5_0= rulePredicate ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,35,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalDsl.g:1065:4: ( (lv_predicates_3_0= rulePredicate ) )
                    // InternalDsl.g:1066:5: (lv_predicates_3_0= rulePredicate )
                    {
                    // InternalDsl.g:1066:5: (lv_predicates_3_0= rulePredicate )
                    // InternalDsl.g:1067:6: lv_predicates_3_0= rulePredicate
                    {

                    						newCompositeNode(grammarAccess.getRuleAccess().getPredicatesPredicateParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_predicates_3_0=rulePredicate();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRuleRule());
                    						}
                    						add(
                    							current,
                    							"predicates",
                    							lv_predicates_3_0,
                    							"smarthome.dsl.Dsl.Predicate");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:1084:4: (otherlv_4= 'and' ( (lv_predicates_5_0= rulePredicate ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==36) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalDsl.g:1085:5: otherlv_4= 'and' ( (lv_predicates_5_0= rulePredicate ) )
                    	    {
                    	    otherlv_4=(Token)match(input,36,FOLLOW_5); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getRuleAccess().getAndKeyword_2_2_0());
                    	    				
                    	    // InternalDsl.g:1089:5: ( (lv_predicates_5_0= rulePredicate ) )
                    	    // InternalDsl.g:1090:6: (lv_predicates_5_0= rulePredicate )
                    	    {
                    	    // InternalDsl.g:1090:6: (lv_predicates_5_0= rulePredicate )
                    	    // InternalDsl.g:1091:7: lv_predicates_5_0= rulePredicate
                    	    {

                    	    							newCompositeNode(grammarAccess.getRuleAccess().getPredicatesPredicateParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_30);
                    	    lv_predicates_5_0=rulePredicate();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRuleRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"predicates",
                    	    								lv_predicates_5_0,
                    	    								"smarthome.dsl.Dsl.Predicate");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,37,FOLLOW_31); 

                    				newLeafNode(otherlv_6, grammarAccess.getRuleAccess().getRightParenthesisKeyword_2_3());
                    			

                    }
                    break;

            }

            // InternalDsl.g:1114:3: ( (otherlv_7= 'for' | otherlv_8= 'since' ) ( (lv_duration_9_0= ruleDuration ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=38 && LA24_0<=39)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalDsl.g:1115:4: (otherlv_7= 'for' | otherlv_8= 'since' ) ( (lv_duration_9_0= ruleDuration ) )
                    {
                    // InternalDsl.g:1115:4: (otherlv_7= 'for' | otherlv_8= 'since' )
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==38) ) {
                        alt23=1;
                    }
                    else if ( (LA23_0==39) ) {
                        alt23=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 0, input);

                        throw nvae;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalDsl.g:1116:5: otherlv_7= 'for'
                            {
                            otherlv_7=(Token)match(input,38,FOLLOW_28); 

                            					newLeafNode(otherlv_7, grammarAccess.getRuleAccess().getForKeyword_3_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalDsl.g:1121:5: otherlv_8= 'since'
                            {
                            otherlv_8=(Token)match(input,39,FOLLOW_28); 

                            					newLeafNode(otherlv_8, grammarAccess.getRuleAccess().getSinceKeyword_3_0_1());
                            				

                            }
                            break;

                    }

                    // InternalDsl.g:1126:4: ( (lv_duration_9_0= ruleDuration ) )
                    // InternalDsl.g:1127:5: (lv_duration_9_0= ruleDuration )
                    {
                    // InternalDsl.g:1127:5: (lv_duration_9_0= ruleDuration )
                    // InternalDsl.g:1128:6: lv_duration_9_0= ruleDuration
                    {

                    						newCompositeNode(grammarAccess.getRuleAccess().getDurationDurationParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_duration_9_0=ruleDuration();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRuleRule());
                    						}
                    						set(
                    							current,
                    							"duration",
                    							lv_duration_9_0,
                    							"smarthome.dsl.Dsl.Duration");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleDuration"
    // InternalDsl.g:1154:1: entryRuleDuration returns [EObject current=null] : iv_ruleDuration= ruleDuration EOF ;
    public final EObject entryRuleDuration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDuration = null;


        try {
            // InternalDsl.g:1154:49: (iv_ruleDuration= ruleDuration EOF )
            // InternalDsl.g:1155:2: iv_ruleDuration= ruleDuration EOF
            {
             newCompositeNode(grammarAccess.getDurationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDuration=ruleDuration();

            state._fsp--;

             current =iv_ruleDuration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDuration"


    // $ANTLR start "ruleDuration"
    // InternalDsl.g:1161:1: ruleDuration returns [EObject current=null] : ( () ( (lv_time_1_0= ruleEInt ) ) ( (lv_precision_2_0= rulePrecision ) ) ) ;
    public final EObject ruleDuration() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_time_1_0 = null;

        Enumerator lv_precision_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1167:2: ( ( () ( (lv_time_1_0= ruleEInt ) ) ( (lv_precision_2_0= rulePrecision ) ) ) )
            // InternalDsl.g:1168:2: ( () ( (lv_time_1_0= ruleEInt ) ) ( (lv_precision_2_0= rulePrecision ) ) )
            {
            // InternalDsl.g:1168:2: ( () ( (lv_time_1_0= ruleEInt ) ) ( (lv_precision_2_0= rulePrecision ) ) )
            // InternalDsl.g:1169:3: () ( (lv_time_1_0= ruleEInt ) ) ( (lv_precision_2_0= rulePrecision ) )
            {
            // InternalDsl.g:1169:3: ()
            // InternalDsl.g:1170:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDurationAccess().getDurationAction_0(),
            					current);
            			

            }

            // InternalDsl.g:1176:3: ( (lv_time_1_0= ruleEInt ) )
            // InternalDsl.g:1177:4: (lv_time_1_0= ruleEInt )
            {
            // InternalDsl.g:1177:4: (lv_time_1_0= ruleEInt )
            // InternalDsl.g:1178:5: lv_time_1_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getDurationAccess().getTimeEIntParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_32);
            lv_time_1_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDurationRule());
            					}
            					set(
            						current,
            						"time",
            						lv_time_1_0,
            						"smarthome.dsl.Dsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:1195:3: ( (lv_precision_2_0= rulePrecision ) )
            // InternalDsl.g:1196:4: (lv_precision_2_0= rulePrecision )
            {
            // InternalDsl.g:1196:4: (lv_precision_2_0= rulePrecision )
            // InternalDsl.g:1197:5: lv_precision_2_0= rulePrecision
            {

            					newCompositeNode(grammarAccess.getDurationAccess().getPrecisionPrecisionEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_precision_2_0=rulePrecision();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDurationRule());
            					}
            					set(
            						current,
            						"precision",
            						lv_precision_2_0,
            						"smarthome.dsl.Dsl.Precision");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDuration"


    // $ANTLR start "entryRuleSensorPredicate"
    // InternalDsl.g:1218:1: entryRuleSensorPredicate returns [EObject current=null] : iv_ruleSensorPredicate= ruleSensorPredicate EOF ;
    public final EObject entryRuleSensorPredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorPredicate = null;


        try {
            // InternalDsl.g:1218:56: (iv_ruleSensorPredicate= ruleSensorPredicate EOF )
            // InternalDsl.g:1219:2: iv_ruleSensorPredicate= ruleSensorPredicate EOF
            {
             newCompositeNode(grammarAccess.getSensorPredicateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSensorPredicate=ruleSensorPredicate();

            state._fsp--;

             current =iv_ruleSensorPredicate; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSensorPredicate"


    // $ANTLR start "ruleSensorPredicate"
    // InternalDsl.g:1225:1: ruleSensorPredicate returns [EObject current=null] : ( () ( ( ruleEString ) ) ( (lv_operator_2_0= ruleOperator ) ) ( (lv_value_3_0= ruleEDouble ) ) ) ;
    public final EObject ruleSensorPredicate() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_2_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1231:2: ( ( () ( ( ruleEString ) ) ( (lv_operator_2_0= ruleOperator ) ) ( (lv_value_3_0= ruleEDouble ) ) ) )
            // InternalDsl.g:1232:2: ( () ( ( ruleEString ) ) ( (lv_operator_2_0= ruleOperator ) ) ( (lv_value_3_0= ruleEDouble ) ) )
            {
            // InternalDsl.g:1232:2: ( () ( ( ruleEString ) ) ( (lv_operator_2_0= ruleOperator ) ) ( (lv_value_3_0= ruleEDouble ) ) )
            // InternalDsl.g:1233:3: () ( ( ruleEString ) ) ( (lv_operator_2_0= ruleOperator ) ) ( (lv_value_3_0= ruleEDouble ) )
            {
            // InternalDsl.g:1233:3: ()
            // InternalDsl.g:1234:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSensorPredicateAccess().getSensorPredicateAction_0(),
            					current);
            			

            }

            // InternalDsl.g:1240:3: ( ( ruleEString ) )
            // InternalDsl.g:1241:4: ( ruleEString )
            {
            // InternalDsl.g:1241:4: ( ruleEString )
            // InternalDsl.g:1242:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSensorPredicateRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSensorPredicateAccess().getSensorSensorCrossReference_1_0());
            				
            pushFollow(FOLLOW_33);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:1256:3: ( (lv_operator_2_0= ruleOperator ) )
            // InternalDsl.g:1257:4: (lv_operator_2_0= ruleOperator )
            {
            // InternalDsl.g:1257:4: (lv_operator_2_0= ruleOperator )
            // InternalDsl.g:1258:5: lv_operator_2_0= ruleOperator
            {

            					newCompositeNode(grammarAccess.getSensorPredicateAccess().getOperatorOperatorEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_34);
            lv_operator_2_0=ruleOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSensorPredicateRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_2_0,
            						"smarthome.dsl.Dsl.Operator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:1275:3: ( (lv_value_3_0= ruleEDouble ) )
            // InternalDsl.g:1276:4: (lv_value_3_0= ruleEDouble )
            {
            // InternalDsl.g:1276:4: (lv_value_3_0= ruleEDouble )
            // InternalDsl.g:1277:5: lv_value_3_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getSensorPredicateAccess().getValueEDoubleParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_3_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSensorPredicateRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"smarthome.dsl.Dsl.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSensorPredicate"


    // $ANTLR start "entryRulePersonPredicate"
    // InternalDsl.g:1298:1: entryRulePersonPredicate returns [EObject current=null] : iv_rulePersonPredicate= rulePersonPredicate EOF ;
    public final EObject entryRulePersonPredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePersonPredicate = null;


        try {
            // InternalDsl.g:1298:56: (iv_rulePersonPredicate= rulePersonPredicate EOF )
            // InternalDsl.g:1299:2: iv_rulePersonPredicate= rulePersonPredicate EOF
            {
             newCompositeNode(grammarAccess.getPersonPredicateRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePersonPredicate=rulePersonPredicate();

            state._fsp--;

             current =iv_rulePersonPredicate; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePersonPredicate"


    // $ANTLR start "rulePersonPredicate"
    // InternalDsl.g:1305:1: rulePersonPredicate returns [EObject current=null] : ( () ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_activity_3_0= ruleActivity ) ) ) ;
    public final EObject rulePersonPredicate() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Enumerator lv_activity_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1311:2: ( ( () ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_activity_3_0= ruleActivity ) ) ) )
            // InternalDsl.g:1312:2: ( () ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_activity_3_0= ruleActivity ) ) )
            {
            // InternalDsl.g:1312:2: ( () ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_activity_3_0= ruleActivity ) ) )
            // InternalDsl.g:1313:3: () ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_activity_3_0= ruleActivity ) )
            {
            // InternalDsl.g:1313:3: ()
            // InternalDsl.g:1314:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPersonPredicateAccess().getPersonPredicateAction_0(),
            					current);
            			

            }

            // InternalDsl.g:1320:3: ( ( ruleEString ) )
            // InternalDsl.g:1321:4: ( ruleEString )
            {
            // InternalDsl.g:1321:4: ( ruleEString )
            // InternalDsl.g:1322:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPersonPredicateRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPersonPredicateAccess().getPersonPersonCrossReference_1_0());
            				
            pushFollow(FOLLOW_35);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,40,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getPersonPredicateAccess().getIsKeyword_2());
            		
            // InternalDsl.g:1340:3: ( (lv_activity_3_0= ruleActivity ) )
            // InternalDsl.g:1341:4: (lv_activity_3_0= ruleActivity )
            {
            // InternalDsl.g:1341:4: (lv_activity_3_0= ruleActivity )
            // InternalDsl.g:1342:5: lv_activity_3_0= ruleActivity
            {

            					newCompositeNode(grammarAccess.getPersonPredicateAccess().getActivityActivityEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_activity_3_0=ruleActivity();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPersonPredicateRule());
            					}
            					set(
            						current,
            						"activity",
            						lv_activity_3_0,
            						"smarthome.dsl.Dsl.Activity");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePersonPredicate"


    // $ANTLR start "entryRuleEInt"
    // InternalDsl.g:1363:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalDsl.g:1363:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalDsl.g:1364:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalDsl.g:1370:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalDsl.g:1376:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalDsl.g:1377:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalDsl.g:1377:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalDsl.g:1378:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalDsl.g:1378:3: (kw= '-' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==31) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalDsl.g:1379:4: kw= '-'
                    {
                    kw=(Token)match(input,31,FOLLOW_26); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "ruleOperator"
    // InternalDsl.g:1396:1: ruleOperator returns [Enumerator current=null] : ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '=' ) ) ;
    public final Enumerator ruleOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDsl.g:1402:2: ( ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '=' ) ) )
            // InternalDsl.g:1403:2: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '=' ) )
            {
            // InternalDsl.g:1403:2: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '=' ) )
            int alt26=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt26=1;
                }
                break;
            case 42:
                {
                alt26=2;
                }
                break;
            case 43:
                {
                alt26=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalDsl.g:1404:3: (enumLiteral_0= '>' )
                    {
                    // InternalDsl.g:1404:3: (enumLiteral_0= '>' )
                    // InternalDsl.g:1405:4: enumLiteral_0= '>'
                    {
                    enumLiteral_0=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getSuperiorEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOperatorAccess().getSuperiorEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1412:3: (enumLiteral_1= '<' )
                    {
                    // InternalDsl.g:1412:3: (enumLiteral_1= '<' )
                    // InternalDsl.g:1413:4: enumLiteral_1= '<'
                    {
                    enumLiteral_1=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getInferiorEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOperatorAccess().getInferiorEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:1420:3: (enumLiteral_2= '=' )
                    {
                    // InternalDsl.g:1420:3: (enumLiteral_2= '=' )
                    // InternalDsl.g:1421:4: enumLiteral_2= '='
                    {
                    enumLiteral_2=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getEqualEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getOperatorAccess().getEqualEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperator"


    // $ANTLR start "ruleActivity"
    // InternalDsl.g:1431:1: ruleActivity returns [Enumerator current=null] : ( (enumLiteral_0= 'standing' ) | (enumLiteral_1= 'laying' ) | (enumLiteral_2= 'sitting' ) ) ;
    public final Enumerator ruleActivity() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDsl.g:1437:2: ( ( (enumLiteral_0= 'standing' ) | (enumLiteral_1= 'laying' ) | (enumLiteral_2= 'sitting' ) ) )
            // InternalDsl.g:1438:2: ( (enumLiteral_0= 'standing' ) | (enumLiteral_1= 'laying' ) | (enumLiteral_2= 'sitting' ) )
            {
            // InternalDsl.g:1438:2: ( (enumLiteral_0= 'standing' ) | (enumLiteral_1= 'laying' ) | (enumLiteral_2= 'sitting' ) )
            int alt27=3;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt27=1;
                }
                break;
            case 45:
                {
                alt27=2;
                }
                break;
            case 46:
                {
                alt27=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalDsl.g:1439:3: (enumLiteral_0= 'standing' )
                    {
                    // InternalDsl.g:1439:3: (enumLiteral_0= 'standing' )
                    // InternalDsl.g:1440:4: enumLiteral_0= 'standing'
                    {
                    enumLiteral_0=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getActivityAccess().getStandingEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getActivityAccess().getStandingEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1447:3: (enumLiteral_1= 'laying' )
                    {
                    // InternalDsl.g:1447:3: (enumLiteral_1= 'laying' )
                    // InternalDsl.g:1448:4: enumLiteral_1= 'laying'
                    {
                    enumLiteral_1=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getActivityAccess().getLayingEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getActivityAccess().getLayingEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:1455:3: (enumLiteral_2= 'sitting' )
                    {
                    // InternalDsl.g:1455:3: (enumLiteral_2= 'sitting' )
                    // InternalDsl.g:1456:4: enumLiteral_2= 'sitting'
                    {
                    enumLiteral_2=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getActivityAccess().getSittingEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getActivityAccess().getSittingEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActivity"


    // $ANTLR start "rulePrecision"
    // InternalDsl.g:1466:1: rulePrecision returns [Enumerator current=null] : ( (enumLiteral_0= 'millis' ) | (enumLiteral_1= 'seconds' ) | (enumLiteral_2= 'minutes' ) ) ;
    public final Enumerator rulePrecision() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDsl.g:1472:2: ( ( (enumLiteral_0= 'millis' ) | (enumLiteral_1= 'seconds' ) | (enumLiteral_2= 'minutes' ) ) )
            // InternalDsl.g:1473:2: ( (enumLiteral_0= 'millis' ) | (enumLiteral_1= 'seconds' ) | (enumLiteral_2= 'minutes' ) )
            {
            // InternalDsl.g:1473:2: ( (enumLiteral_0= 'millis' ) | (enumLiteral_1= 'seconds' ) | (enumLiteral_2= 'minutes' ) )
            int alt28=3;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt28=1;
                }
                break;
            case 48:
                {
                alt28=2;
                }
                break;
            case 49:
                {
                alt28=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalDsl.g:1474:3: (enumLiteral_0= 'millis' )
                    {
                    // InternalDsl.g:1474:3: (enumLiteral_0= 'millis' )
                    // InternalDsl.g:1475:4: enumLiteral_0= 'millis'
                    {
                    enumLiteral_0=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getPrecisionAccess().getMsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPrecisionAccess().getMsEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1482:3: (enumLiteral_1= 'seconds' )
                    {
                    // InternalDsl.g:1482:3: (enumLiteral_1= 'seconds' )
                    // InternalDsl.g:1483:4: enumLiteral_1= 'seconds'
                    {
                    enumLiteral_1=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getPrecisionAccess().getSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPrecisionAccess().getSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:1490:3: (enumLiteral_2= 'minutes' )
                    {
                    // InternalDsl.g:1490:3: (enumLiteral_2= 'minutes' )
                    // InternalDsl.g:1491:4: enumLiteral_2= 'minutes'
                    {
                    enumLiteral_2=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getPrecisionAccess().getMEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPrecisionAccess().getMEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrecision"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000001E4000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000001E0000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000060010000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080000040L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000000C800010000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000000C000010000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0003800000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00000E0000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000180000040L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000700000000000L});

}