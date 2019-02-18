package smarthome.dsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import smarthome.dsl.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "'for'", "'since'", "'>'", "'<'", "'='", "'standing'", "'laying'", "'sitting'", "'millis'", "'seconds'", "'minutes'", "'Home'", "'{'", "'start'", "'}'", "'eventFile'", "'rooms'", "','", "'persons'", "'patterns'", "'monitor'", "'Room'", "'Person'", "'left-ankle'", "'right-ankle'", "'belt'", "'chest'", "'ID'", "'Pattern'", "'AnalogSensor'", "'DigitalSensor'", "'-'", "'.'", "'('", "')'", "'and'", "'is'"
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

    	public void setGrammarAccess(DslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleHome"
    // InternalDsl.g:53:1: entryRuleHome : ruleHome EOF ;
    public final void entryRuleHome() throws RecognitionException {
        try {
            // InternalDsl.g:54:1: ( ruleHome EOF )
            // InternalDsl.g:55:1: ruleHome EOF
            {
             before(grammarAccess.getHomeRule()); 
            pushFollow(FOLLOW_1);
            ruleHome();

            state._fsp--;

             after(grammarAccess.getHomeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHome"


    // $ANTLR start "ruleHome"
    // InternalDsl.g:62:1: ruleHome : ( ( rule__Home__Group__0 ) ) ;
    public final void ruleHome() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:66:2: ( ( ( rule__Home__Group__0 ) ) )
            // InternalDsl.g:67:2: ( ( rule__Home__Group__0 ) )
            {
            // InternalDsl.g:67:2: ( ( rule__Home__Group__0 ) )
            // InternalDsl.g:68:3: ( rule__Home__Group__0 )
            {
             before(grammarAccess.getHomeAccess().getGroup()); 
            // InternalDsl.g:69:3: ( rule__Home__Group__0 )
            // InternalDsl.g:69:4: rule__Home__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Home__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHomeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHome"


    // $ANTLR start "entryRuleSensor"
    // InternalDsl.g:78:1: entryRuleSensor : ruleSensor EOF ;
    public final void entryRuleSensor() throws RecognitionException {
        try {
            // InternalDsl.g:79:1: ( ruleSensor EOF )
            // InternalDsl.g:80:1: ruleSensor EOF
            {
             before(grammarAccess.getSensorRule()); 
            pushFollow(FOLLOW_1);
            ruleSensor();

            state._fsp--;

             after(grammarAccess.getSensorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSensor"


    // $ANTLR start "ruleSensor"
    // InternalDsl.g:87:1: ruleSensor : ( ( rule__Sensor__Alternatives ) ) ;
    public final void ruleSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:91:2: ( ( ( rule__Sensor__Alternatives ) ) )
            // InternalDsl.g:92:2: ( ( rule__Sensor__Alternatives ) )
            {
            // InternalDsl.g:92:2: ( ( rule__Sensor__Alternatives ) )
            // InternalDsl.g:93:3: ( rule__Sensor__Alternatives )
            {
             before(grammarAccess.getSensorAccess().getAlternatives()); 
            // InternalDsl.g:94:3: ( rule__Sensor__Alternatives )
            // InternalDsl.g:94:4: rule__Sensor__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSensor"


    // $ANTLR start "entryRulePredicate"
    // InternalDsl.g:103:1: entryRulePredicate : rulePredicate EOF ;
    public final void entryRulePredicate() throws RecognitionException {
        try {
            // InternalDsl.g:104:1: ( rulePredicate EOF )
            // InternalDsl.g:105:1: rulePredicate EOF
            {
             before(grammarAccess.getPredicateRule()); 
            pushFollow(FOLLOW_1);
            rulePredicate();

            state._fsp--;

             after(grammarAccess.getPredicateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePredicate"


    // $ANTLR start "rulePredicate"
    // InternalDsl.g:112:1: rulePredicate : ( ( rule__Predicate__Alternatives ) ) ;
    public final void rulePredicate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:116:2: ( ( ( rule__Predicate__Alternatives ) ) )
            // InternalDsl.g:117:2: ( ( rule__Predicate__Alternatives ) )
            {
            // InternalDsl.g:117:2: ( ( rule__Predicate__Alternatives ) )
            // InternalDsl.g:118:3: ( rule__Predicate__Alternatives )
            {
             before(grammarAccess.getPredicateAccess().getAlternatives()); 
            // InternalDsl.g:119:3: ( rule__Predicate__Alternatives )
            // InternalDsl.g:119:4: rule__Predicate__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Predicate__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPredicateAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePredicate"


    // $ANTLR start "entryRuleRoom"
    // InternalDsl.g:128:1: entryRuleRoom : ruleRoom EOF ;
    public final void entryRuleRoom() throws RecognitionException {
        try {
            // InternalDsl.g:129:1: ( ruleRoom EOF )
            // InternalDsl.g:130:1: ruleRoom EOF
            {
             before(grammarAccess.getRoomRule()); 
            pushFollow(FOLLOW_1);
            ruleRoom();

            state._fsp--;

             after(grammarAccess.getRoomRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRoom"


    // $ANTLR start "ruleRoom"
    // InternalDsl.g:137:1: ruleRoom : ( ( rule__Room__Group__0 ) ) ;
    public final void ruleRoom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:141:2: ( ( ( rule__Room__Group__0 ) ) )
            // InternalDsl.g:142:2: ( ( rule__Room__Group__0 ) )
            {
            // InternalDsl.g:142:2: ( ( rule__Room__Group__0 ) )
            // InternalDsl.g:143:3: ( rule__Room__Group__0 )
            {
             before(grammarAccess.getRoomAccess().getGroup()); 
            // InternalDsl.g:144:3: ( rule__Room__Group__0 )
            // InternalDsl.g:144:4: rule__Room__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Room__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRoom"


    // $ANTLR start "entryRulePerson"
    // InternalDsl.g:153:1: entryRulePerson : rulePerson EOF ;
    public final void entryRulePerson() throws RecognitionException {
        try {
            // InternalDsl.g:154:1: ( rulePerson EOF )
            // InternalDsl.g:155:1: rulePerson EOF
            {
             before(grammarAccess.getPersonRule()); 
            pushFollow(FOLLOW_1);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getPersonRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePerson"


    // $ANTLR start "rulePerson"
    // InternalDsl.g:162:1: rulePerson : ( ( rule__Person__Group__0 ) ) ;
    public final void rulePerson() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:166:2: ( ( ( rule__Person__Group__0 ) ) )
            // InternalDsl.g:167:2: ( ( rule__Person__Group__0 ) )
            {
            // InternalDsl.g:167:2: ( ( rule__Person__Group__0 ) )
            // InternalDsl.g:168:3: ( rule__Person__Group__0 )
            {
             before(grammarAccess.getPersonAccess().getGroup()); 
            // InternalDsl.g:169:3: ( rule__Person__Group__0 )
            // InternalDsl.g:169:4: rule__Person__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Person__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePerson"


    // $ANTLR start "entryRuleTag"
    // InternalDsl.g:178:1: entryRuleTag : ruleTag EOF ;
    public final void entryRuleTag() throws RecognitionException {
        try {
            // InternalDsl.g:179:1: ( ruleTag EOF )
            // InternalDsl.g:180:1: ruleTag EOF
            {
             before(grammarAccess.getTagRule()); 
            pushFollow(FOLLOW_1);
            ruleTag();

            state._fsp--;

             after(grammarAccess.getTagRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTag"


    // $ANTLR start "ruleTag"
    // InternalDsl.g:187:1: ruleTag : ( ( rule__Tag__Group__0 ) ) ;
    public final void ruleTag() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:191:2: ( ( ( rule__Tag__Group__0 ) ) )
            // InternalDsl.g:192:2: ( ( rule__Tag__Group__0 ) )
            {
            // InternalDsl.g:192:2: ( ( rule__Tag__Group__0 ) )
            // InternalDsl.g:193:3: ( rule__Tag__Group__0 )
            {
             before(grammarAccess.getTagAccess().getGroup()); 
            // InternalDsl.g:194:3: ( rule__Tag__Group__0 )
            // InternalDsl.g:194:4: rule__Tag__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Tag__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTagAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTag"


    // $ANTLR start "entryRulePattern"
    // InternalDsl.g:203:1: entryRulePattern : rulePattern EOF ;
    public final void entryRulePattern() throws RecognitionException {
        try {
            // InternalDsl.g:204:1: ( rulePattern EOF )
            // InternalDsl.g:205:1: rulePattern EOF
            {
             before(grammarAccess.getPatternRule()); 
            pushFollow(FOLLOW_1);
            rulePattern();

            state._fsp--;

             after(grammarAccess.getPatternRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePattern"


    // $ANTLR start "rulePattern"
    // InternalDsl.g:212:1: rulePattern : ( ( rule__Pattern__Group__0 ) ) ;
    public final void rulePattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:216:2: ( ( ( rule__Pattern__Group__0 ) ) )
            // InternalDsl.g:217:2: ( ( rule__Pattern__Group__0 ) )
            {
            // InternalDsl.g:217:2: ( ( rule__Pattern__Group__0 ) )
            // InternalDsl.g:218:3: ( rule__Pattern__Group__0 )
            {
             before(grammarAccess.getPatternAccess().getGroup()); 
            // InternalDsl.g:219:3: ( rule__Pattern__Group__0 )
            // InternalDsl.g:219:4: rule__Pattern__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPatternAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePattern"


    // $ANTLR start "entryRuleEString"
    // InternalDsl.g:228:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalDsl.g:229:1: ( ruleEString EOF )
            // InternalDsl.g:230:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalDsl.g:237:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:241:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalDsl.g:242:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalDsl.g:242:2: ( ( rule__EString__Alternatives ) )
            // InternalDsl.g:243:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalDsl.g:244:3: ( rule__EString__Alternatives )
            // InternalDsl.g:244:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleAnalogSensor"
    // InternalDsl.g:253:1: entryRuleAnalogSensor : ruleAnalogSensor EOF ;
    public final void entryRuleAnalogSensor() throws RecognitionException {
        try {
            // InternalDsl.g:254:1: ( ruleAnalogSensor EOF )
            // InternalDsl.g:255:1: ruleAnalogSensor EOF
            {
             before(grammarAccess.getAnalogSensorRule()); 
            pushFollow(FOLLOW_1);
            ruleAnalogSensor();

            state._fsp--;

             after(grammarAccess.getAnalogSensorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAnalogSensor"


    // $ANTLR start "ruleAnalogSensor"
    // InternalDsl.g:262:1: ruleAnalogSensor : ( ( rule__AnalogSensor__Group__0 ) ) ;
    public final void ruleAnalogSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:266:2: ( ( ( rule__AnalogSensor__Group__0 ) ) )
            // InternalDsl.g:267:2: ( ( rule__AnalogSensor__Group__0 ) )
            {
            // InternalDsl.g:267:2: ( ( rule__AnalogSensor__Group__0 ) )
            // InternalDsl.g:268:3: ( rule__AnalogSensor__Group__0 )
            {
             before(grammarAccess.getAnalogSensorAccess().getGroup()); 
            // InternalDsl.g:269:3: ( rule__AnalogSensor__Group__0 )
            // InternalDsl.g:269:4: rule__AnalogSensor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AnalogSensor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnalogSensorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnalogSensor"


    // $ANTLR start "entryRuleDigitalSensor"
    // InternalDsl.g:278:1: entryRuleDigitalSensor : ruleDigitalSensor EOF ;
    public final void entryRuleDigitalSensor() throws RecognitionException {
        try {
            // InternalDsl.g:279:1: ( ruleDigitalSensor EOF )
            // InternalDsl.g:280:1: ruleDigitalSensor EOF
            {
             before(grammarAccess.getDigitalSensorRule()); 
            pushFollow(FOLLOW_1);
            ruleDigitalSensor();

            state._fsp--;

             after(grammarAccess.getDigitalSensorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDigitalSensor"


    // $ANTLR start "ruleDigitalSensor"
    // InternalDsl.g:287:1: ruleDigitalSensor : ( ( rule__DigitalSensor__Group__0 ) ) ;
    public final void ruleDigitalSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:291:2: ( ( ( rule__DigitalSensor__Group__0 ) ) )
            // InternalDsl.g:292:2: ( ( rule__DigitalSensor__Group__0 ) )
            {
            // InternalDsl.g:292:2: ( ( rule__DigitalSensor__Group__0 ) )
            // InternalDsl.g:293:3: ( rule__DigitalSensor__Group__0 )
            {
             before(grammarAccess.getDigitalSensorAccess().getGroup()); 
            // InternalDsl.g:294:3: ( rule__DigitalSensor__Group__0 )
            // InternalDsl.g:294:4: rule__DigitalSensor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DigitalSensor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDigitalSensorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDigitalSensor"


    // $ANTLR start "entryRuleEDouble"
    // InternalDsl.g:303:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalDsl.g:304:1: ( ruleEDouble EOF )
            // InternalDsl.g:305:1: ruleEDouble EOF
            {
             before(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getEDoubleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalDsl.g:312:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:316:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // InternalDsl.g:317:2: ( ( rule__EDouble__Group__0 ) )
            {
            // InternalDsl.g:317:2: ( ( rule__EDouble__Group__0 ) )
            // InternalDsl.g:318:3: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // InternalDsl.g:319:3: ( rule__EDouble__Group__0 )
            // InternalDsl.g:319:4: rule__EDouble__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleRule"
    // InternalDsl.g:328:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalDsl.g:329:1: ( ruleRule EOF )
            // InternalDsl.g:330:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalDsl.g:337:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:341:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalDsl.g:342:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalDsl.g:342:2: ( ( rule__Rule__Group__0 ) )
            // InternalDsl.g:343:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalDsl.g:344:3: ( rule__Rule__Group__0 )
            // InternalDsl.g:344:4: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleDuration"
    // InternalDsl.g:353:1: entryRuleDuration : ruleDuration EOF ;
    public final void entryRuleDuration() throws RecognitionException {
        try {
            // InternalDsl.g:354:1: ( ruleDuration EOF )
            // InternalDsl.g:355:1: ruleDuration EOF
            {
             before(grammarAccess.getDurationRule()); 
            pushFollow(FOLLOW_1);
            ruleDuration();

            state._fsp--;

             after(grammarAccess.getDurationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDuration"


    // $ANTLR start "ruleDuration"
    // InternalDsl.g:362:1: ruleDuration : ( ( rule__Duration__Group__0 ) ) ;
    public final void ruleDuration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:366:2: ( ( ( rule__Duration__Group__0 ) ) )
            // InternalDsl.g:367:2: ( ( rule__Duration__Group__0 ) )
            {
            // InternalDsl.g:367:2: ( ( rule__Duration__Group__0 ) )
            // InternalDsl.g:368:3: ( rule__Duration__Group__0 )
            {
             before(grammarAccess.getDurationAccess().getGroup()); 
            // InternalDsl.g:369:3: ( rule__Duration__Group__0 )
            // InternalDsl.g:369:4: rule__Duration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Duration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDurationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDuration"


    // $ANTLR start "entryRuleSensorPredicate"
    // InternalDsl.g:378:1: entryRuleSensorPredicate : ruleSensorPredicate EOF ;
    public final void entryRuleSensorPredicate() throws RecognitionException {
        try {
            // InternalDsl.g:379:1: ( ruleSensorPredicate EOF )
            // InternalDsl.g:380:1: ruleSensorPredicate EOF
            {
             before(grammarAccess.getSensorPredicateRule()); 
            pushFollow(FOLLOW_1);
            ruleSensorPredicate();

            state._fsp--;

             after(grammarAccess.getSensorPredicateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSensorPredicate"


    // $ANTLR start "ruleSensorPredicate"
    // InternalDsl.g:387:1: ruleSensorPredicate : ( ( rule__SensorPredicate__Group__0 ) ) ;
    public final void ruleSensorPredicate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:391:2: ( ( ( rule__SensorPredicate__Group__0 ) ) )
            // InternalDsl.g:392:2: ( ( rule__SensorPredicate__Group__0 ) )
            {
            // InternalDsl.g:392:2: ( ( rule__SensorPredicate__Group__0 ) )
            // InternalDsl.g:393:3: ( rule__SensorPredicate__Group__0 )
            {
             before(grammarAccess.getSensorPredicateAccess().getGroup()); 
            // InternalDsl.g:394:3: ( rule__SensorPredicate__Group__0 )
            // InternalDsl.g:394:4: rule__SensorPredicate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SensorPredicate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSensorPredicateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSensorPredicate"


    // $ANTLR start "entryRulePersonPredicate"
    // InternalDsl.g:403:1: entryRulePersonPredicate : rulePersonPredicate EOF ;
    public final void entryRulePersonPredicate() throws RecognitionException {
        try {
            // InternalDsl.g:404:1: ( rulePersonPredicate EOF )
            // InternalDsl.g:405:1: rulePersonPredicate EOF
            {
             before(grammarAccess.getPersonPredicateRule()); 
            pushFollow(FOLLOW_1);
            rulePersonPredicate();

            state._fsp--;

             after(grammarAccess.getPersonPredicateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePersonPredicate"


    // $ANTLR start "rulePersonPredicate"
    // InternalDsl.g:412:1: rulePersonPredicate : ( ( rule__PersonPredicate__Group__0 ) ) ;
    public final void rulePersonPredicate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:416:2: ( ( ( rule__PersonPredicate__Group__0 ) ) )
            // InternalDsl.g:417:2: ( ( rule__PersonPredicate__Group__0 ) )
            {
            // InternalDsl.g:417:2: ( ( rule__PersonPredicate__Group__0 ) )
            // InternalDsl.g:418:3: ( rule__PersonPredicate__Group__0 )
            {
             before(grammarAccess.getPersonPredicateAccess().getGroup()); 
            // InternalDsl.g:419:3: ( rule__PersonPredicate__Group__0 )
            // InternalDsl.g:419:4: rule__PersonPredicate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PersonPredicate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPersonPredicateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePersonPredicate"


    // $ANTLR start "entryRuleEInt"
    // InternalDsl.g:428:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalDsl.g:429:1: ( ruleEInt EOF )
            // InternalDsl.g:430:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalDsl.g:437:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:441:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalDsl.g:442:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalDsl.g:442:2: ( ( rule__EInt__Group__0 ) )
            // InternalDsl.g:443:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalDsl.g:444:3: ( rule__EInt__Group__0 )
            // InternalDsl.g:444:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "ruleOperator"
    // InternalDsl.g:453:1: ruleOperator : ( ( rule__Operator__Alternatives ) ) ;
    public final void ruleOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:457:1: ( ( ( rule__Operator__Alternatives ) ) )
            // InternalDsl.g:458:2: ( ( rule__Operator__Alternatives ) )
            {
            // InternalDsl.g:458:2: ( ( rule__Operator__Alternatives ) )
            // InternalDsl.g:459:3: ( rule__Operator__Alternatives )
            {
             before(grammarAccess.getOperatorAccess().getAlternatives()); 
            // InternalDsl.g:460:3: ( rule__Operator__Alternatives )
            // InternalDsl.g:460:4: rule__Operator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Operator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperator"


    // $ANTLR start "ruleActivity"
    // InternalDsl.g:469:1: ruleActivity : ( ( rule__Activity__Alternatives ) ) ;
    public final void ruleActivity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:473:1: ( ( ( rule__Activity__Alternatives ) ) )
            // InternalDsl.g:474:2: ( ( rule__Activity__Alternatives ) )
            {
            // InternalDsl.g:474:2: ( ( rule__Activity__Alternatives ) )
            // InternalDsl.g:475:3: ( rule__Activity__Alternatives )
            {
             before(grammarAccess.getActivityAccess().getAlternatives()); 
            // InternalDsl.g:476:3: ( rule__Activity__Alternatives )
            // InternalDsl.g:476:4: rule__Activity__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Activity__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActivity"


    // $ANTLR start "rulePrecision"
    // InternalDsl.g:485:1: rulePrecision : ( ( rule__Precision__Alternatives ) ) ;
    public final void rulePrecision() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:489:1: ( ( ( rule__Precision__Alternatives ) ) )
            // InternalDsl.g:490:2: ( ( rule__Precision__Alternatives ) )
            {
            // InternalDsl.g:490:2: ( ( rule__Precision__Alternatives ) )
            // InternalDsl.g:491:3: ( rule__Precision__Alternatives )
            {
             before(grammarAccess.getPrecisionAccess().getAlternatives()); 
            // InternalDsl.g:492:3: ( rule__Precision__Alternatives )
            // InternalDsl.g:492:4: rule__Precision__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Precision__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrecisionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrecision"


    // $ANTLR start "rule__Sensor__Alternatives"
    // InternalDsl.g:500:1: rule__Sensor__Alternatives : ( ( ruleAnalogSensor ) | ( ruleDigitalSensor ) );
    public final void rule__Sensor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:504:1: ( ( ruleAnalogSensor ) | ( ruleDigitalSensor ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==42) ) {
                alt1=1;
            }
            else if ( (LA1_0==43) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalDsl.g:505:2: ( ruleAnalogSensor )
                    {
                    // InternalDsl.g:505:2: ( ruleAnalogSensor )
                    // InternalDsl.g:506:3: ruleAnalogSensor
                    {
                     before(grammarAccess.getSensorAccess().getAnalogSensorParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAnalogSensor();

                    state._fsp--;

                     after(grammarAccess.getSensorAccess().getAnalogSensorParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:511:2: ( ruleDigitalSensor )
                    {
                    // InternalDsl.g:511:2: ( ruleDigitalSensor )
                    // InternalDsl.g:512:3: ruleDigitalSensor
                    {
                     before(grammarAccess.getSensorAccess().getDigitalSensorParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDigitalSensor();

                    state._fsp--;

                     after(grammarAccess.getSensorAccess().getDigitalSensorParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Alternatives"


    // $ANTLR start "rule__Predicate__Alternatives"
    // InternalDsl.g:521:1: rule__Predicate__Alternatives : ( ( ruleSensorPredicate ) | ( rulePersonPredicate ) );
    public final void rule__Predicate__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:525:1: ( ( ruleSensorPredicate ) | ( rulePersonPredicate ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==49) ) {
                    alt2=2;
                }
                else if ( ((LA2_1>=15 && LA2_1<=17)) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==RULE_ID) ) {
                int LA2_2 = input.LA(2);

                if ( ((LA2_2>=15 && LA2_2<=17)) ) {
                    alt2=1;
                }
                else if ( (LA2_2==49) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDsl.g:526:2: ( ruleSensorPredicate )
                    {
                    // InternalDsl.g:526:2: ( ruleSensorPredicate )
                    // InternalDsl.g:527:3: ruleSensorPredicate
                    {
                     before(grammarAccess.getPredicateAccess().getSensorPredicateParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSensorPredicate();

                    state._fsp--;

                     after(grammarAccess.getPredicateAccess().getSensorPredicateParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:532:2: ( rulePersonPredicate )
                    {
                    // InternalDsl.g:532:2: ( rulePersonPredicate )
                    // InternalDsl.g:533:3: rulePersonPredicate
                    {
                     before(grammarAccess.getPredicateAccess().getPersonPredicateParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePersonPredicate();

                    state._fsp--;

                     after(grammarAccess.getPredicateAccess().getPersonPredicateParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalDsl.g:542:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:546:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalDsl.g:547:2: ( RULE_STRING )
                    {
                    // InternalDsl.g:547:2: ( RULE_STRING )
                    // InternalDsl.g:548:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:553:2: ( RULE_ID )
                    {
                    // InternalDsl.g:553:2: ( RULE_ID )
                    // InternalDsl.g:554:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__EDouble__Alternatives_4_0"
    // InternalDsl.g:563:1: rule__EDouble__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:567:1: ( ( 'E' ) | ( 'e' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDsl.g:568:2: ( 'E' )
                    {
                    // InternalDsl.g:568:2: ( 'E' )
                    // InternalDsl.g:569:3: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:574:2: ( 'e' )
                    {
                    // InternalDsl.g:574:2: ( 'e' )
                    // InternalDsl.g:575:3: 'e'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Alternatives_4_0"


    // $ANTLR start "rule__Rule__Alternatives_3_0"
    // InternalDsl.g:584:1: rule__Rule__Alternatives_3_0 : ( ( 'for' ) | ( 'since' ) );
    public final void rule__Rule__Alternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:588:1: ( ( 'for' ) | ( 'since' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            else if ( (LA5_0==14) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalDsl.g:589:2: ( 'for' )
                    {
                    // InternalDsl.g:589:2: ( 'for' )
                    // InternalDsl.g:590:3: 'for'
                    {
                     before(grammarAccess.getRuleAccess().getForKeyword_3_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getRuleAccess().getForKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:595:2: ( 'since' )
                    {
                    // InternalDsl.g:595:2: ( 'since' )
                    // InternalDsl.g:596:3: 'since'
                    {
                     before(grammarAccess.getRuleAccess().getSinceKeyword_3_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getRuleAccess().getSinceKeyword_3_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Alternatives_3_0"


    // $ANTLR start "rule__Operator__Alternatives"
    // InternalDsl.g:605:1: rule__Operator__Alternatives : ( ( ( '>' ) ) | ( ( '<' ) ) | ( ( '=' ) ) );
    public final void rule__Operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:609:1: ( ( ( '>' ) ) | ( ( '<' ) ) | ( ( '=' ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt6=1;
                }
                break;
            case 16:
                {
                alt6=2;
                }
                break;
            case 17:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalDsl.g:610:2: ( ( '>' ) )
                    {
                    // InternalDsl.g:610:2: ( ( '>' ) )
                    // InternalDsl.g:611:3: ( '>' )
                    {
                     before(grammarAccess.getOperatorAccess().getSuperiorEnumLiteralDeclaration_0()); 
                    // InternalDsl.g:612:3: ( '>' )
                    // InternalDsl.g:612:4: '>'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getSuperiorEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:616:2: ( ( '<' ) )
                    {
                    // InternalDsl.g:616:2: ( ( '<' ) )
                    // InternalDsl.g:617:3: ( '<' )
                    {
                     before(grammarAccess.getOperatorAccess().getInferiorEnumLiteralDeclaration_1()); 
                    // InternalDsl.g:618:3: ( '<' )
                    // InternalDsl.g:618:4: '<'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getInferiorEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:622:2: ( ( '=' ) )
                    {
                    // InternalDsl.g:622:2: ( ( '=' ) )
                    // InternalDsl.g:623:3: ( '=' )
                    {
                     before(grammarAccess.getOperatorAccess().getEqualEnumLiteralDeclaration_2()); 
                    // InternalDsl.g:624:3: ( '=' )
                    // InternalDsl.g:624:4: '='
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getEqualEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Alternatives"


    // $ANTLR start "rule__Activity__Alternatives"
    // InternalDsl.g:632:1: rule__Activity__Alternatives : ( ( ( 'standing' ) ) | ( ( 'laying' ) ) | ( ( 'sitting' ) ) );
    public final void rule__Activity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:636:1: ( ( ( 'standing' ) ) | ( ( 'laying' ) ) | ( ( 'sitting' ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt7=1;
                }
                break;
            case 19:
                {
                alt7=2;
                }
                break;
            case 20:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalDsl.g:637:2: ( ( 'standing' ) )
                    {
                    // InternalDsl.g:637:2: ( ( 'standing' ) )
                    // InternalDsl.g:638:3: ( 'standing' )
                    {
                     before(grammarAccess.getActivityAccess().getStandingEnumLiteralDeclaration_0()); 
                    // InternalDsl.g:639:3: ( 'standing' )
                    // InternalDsl.g:639:4: 'standing'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getActivityAccess().getStandingEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:643:2: ( ( 'laying' ) )
                    {
                    // InternalDsl.g:643:2: ( ( 'laying' ) )
                    // InternalDsl.g:644:3: ( 'laying' )
                    {
                     before(grammarAccess.getActivityAccess().getLayingEnumLiteralDeclaration_1()); 
                    // InternalDsl.g:645:3: ( 'laying' )
                    // InternalDsl.g:645:4: 'laying'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getActivityAccess().getLayingEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:649:2: ( ( 'sitting' ) )
                    {
                    // InternalDsl.g:649:2: ( ( 'sitting' ) )
                    // InternalDsl.g:650:3: ( 'sitting' )
                    {
                     before(grammarAccess.getActivityAccess().getSittingEnumLiteralDeclaration_2()); 
                    // InternalDsl.g:651:3: ( 'sitting' )
                    // InternalDsl.g:651:4: 'sitting'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getActivityAccess().getSittingEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Alternatives"


    // $ANTLR start "rule__Precision__Alternatives"
    // InternalDsl.g:659:1: rule__Precision__Alternatives : ( ( ( 'millis' ) ) | ( ( 'seconds' ) ) | ( ( 'minutes' ) ) );
    public final void rule__Precision__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:663:1: ( ( ( 'millis' ) ) | ( ( 'seconds' ) ) | ( ( 'minutes' ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt8=1;
                }
                break;
            case 22:
                {
                alt8=2;
                }
                break;
            case 23:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalDsl.g:664:2: ( ( 'millis' ) )
                    {
                    // InternalDsl.g:664:2: ( ( 'millis' ) )
                    // InternalDsl.g:665:3: ( 'millis' )
                    {
                     before(grammarAccess.getPrecisionAccess().getMsEnumLiteralDeclaration_0()); 
                    // InternalDsl.g:666:3: ( 'millis' )
                    // InternalDsl.g:666:4: 'millis'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getPrecisionAccess().getMsEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:670:2: ( ( 'seconds' ) )
                    {
                    // InternalDsl.g:670:2: ( ( 'seconds' ) )
                    // InternalDsl.g:671:3: ( 'seconds' )
                    {
                     before(grammarAccess.getPrecisionAccess().getSEnumLiteralDeclaration_1()); 
                    // InternalDsl.g:672:3: ( 'seconds' )
                    // InternalDsl.g:672:4: 'seconds'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getPrecisionAccess().getSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:676:2: ( ( 'minutes' ) )
                    {
                    // InternalDsl.g:676:2: ( ( 'minutes' ) )
                    // InternalDsl.g:677:3: ( 'minutes' )
                    {
                     before(grammarAccess.getPrecisionAccess().getMEnumLiteralDeclaration_2()); 
                    // InternalDsl.g:678:3: ( 'minutes' )
                    // InternalDsl.g:678:4: 'minutes'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getPrecisionAccess().getMEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precision__Alternatives"


    // $ANTLR start "rule__Home__Group__0"
    // InternalDsl.g:686:1: rule__Home__Group__0 : rule__Home__Group__0__Impl rule__Home__Group__1 ;
    public final void rule__Home__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:690:1: ( rule__Home__Group__0__Impl rule__Home__Group__1 )
            // InternalDsl.g:691:2: rule__Home__Group__0__Impl rule__Home__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Home__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Home__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group__0"


    // $ANTLR start "rule__Home__Group__0__Impl"
    // InternalDsl.g:698:1: rule__Home__Group__0__Impl : ( () ) ;
    public final void rule__Home__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:702:1: ( ( () ) )
            // InternalDsl.g:703:1: ( () )
            {
            // InternalDsl.g:703:1: ( () )
            // InternalDsl.g:704:2: ()
            {
             before(grammarAccess.getHomeAccess().getHomeAction_0()); 
            // InternalDsl.g:705:2: ()
            // InternalDsl.g:705:3: 
            {
            }

             after(grammarAccess.getHomeAccess().getHomeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group__0__Impl"


    // $ANTLR start "rule__Home__Group__1"
    // InternalDsl.g:713:1: rule__Home__Group__1 : rule__Home__Group__1__Impl rule__Home__Group__2 ;
    public final void rule__Home__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:717:1: ( rule__Home__Group__1__Impl rule__Home__Group__2 )
            // InternalDsl.g:718:2: rule__Home__Group__1__Impl rule__Home__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Home__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Home__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group__1"


    // $ANTLR start "rule__Home__Group__1__Impl"
    // InternalDsl.g:725:1: rule__Home__Group__1__Impl : ( 'Home' ) ;
    public final void rule__Home__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:729:1: ( ( 'Home' ) )
            // InternalDsl.g:730:1: ( 'Home' )
            {
            // InternalDsl.g:730:1: ( 'Home' )
            // InternalDsl.g:731:2: 'Home'
            {
             before(grammarAccess.getHomeAccess().getHomeKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getHomeAccess().getHomeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group__1__Impl"


    // $ANTLR start "rule__Home__Group__2"
    // InternalDsl.g:740:1: rule__Home__Group__2 : rule__Home__Group__2__Impl rule__Home__Group__3 ;
    public final void rule__Home__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:744:1: ( rule__Home__Group__2__Impl rule__Home__Group__3 )
            // InternalDsl.g:745:2: rule__Home__Group__2__Impl rule__Home__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Home__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Home__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group__2"


    // $ANTLR start "rule__Home__Group__2__Impl"
    // InternalDsl.g:752:1: rule__Home__Group__2__Impl : ( '{' ) ;
    public final void rule__Home__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:756:1: ( ( '{' ) )
            // InternalDsl.g:757:1: ( '{' )
            {
            // InternalDsl.g:757:1: ( '{' )
            // InternalDsl.g:758:2: '{'
            {
             before(grammarAccess.getHomeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getHomeAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group__2__Impl"


    // $ANTLR start "rule__Home__Group__3"
    // InternalDsl.g:767:1: rule__Home__Group__3 : rule__Home__Group__3__Impl rule__Home__Group__4 ;
    public final void rule__Home__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:771:1: ( rule__Home__Group__3__Impl rule__Home__Group__4 )
            // InternalDsl.g:772:2: rule__Home__Group__3__Impl rule__Home__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Home__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Home__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group__3"


    // $ANTLR start "rule__Home__Group__3__Impl"
    // InternalDsl.g:779:1: rule__Home__Group__3__Impl : ( ( rule__Home__Group_3__0 ) ) ;
    public final void rule__Home__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:783:1: ( ( ( rule__Home__Group_3__0 ) ) )
            // InternalDsl.g:784:1: ( ( rule__Home__Group_3__0 ) )
            {
            // InternalDsl.g:784:1: ( ( rule__Home__Group_3__0 ) )
            // InternalDsl.g:785:2: ( rule__Home__Group_3__0 )
            {
             before(grammarAccess.getHomeAccess().getGroup_3()); 
            // InternalDsl.g:786:2: ( rule__Home__Group_3__0 )
            // InternalDsl.g:786:3: rule__Home__Group_3__0
            {
            pushFollow(FOLLOW_2);
            rule__Home__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getHomeAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group__3__Impl"


    // $ANTLR start "rule__Home__Group__4"
    // InternalDsl.g:794:1: rule__Home__Group__4 : rule__Home__Group__4__Impl rule__Home__Group__5 ;
    public final void rule__Home__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:798:1: ( rule__Home__Group__4__Impl rule__Home__Group__5 )
            // InternalDsl.g:799:2: rule__Home__Group__4__Impl rule__Home__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Home__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Home__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group__4"


    // $ANTLR start "rule__Home__Group__4__Impl"
    // InternalDsl.g:806:1: rule__Home__Group__4__Impl : ( ( rule__Home__Group_4__0 )? ) ;
    public final void rule__Home__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:810:1: ( ( ( rule__Home__Group_4__0 )? ) )
            // InternalDsl.g:811:1: ( ( rule__Home__Group_4__0 )? )
            {
            // InternalDsl.g:811:1: ( ( rule__Home__Group_4__0 )? )
            // InternalDsl.g:812:2: ( rule__Home__Group_4__0 )?
            {
             before(grammarAccess.getHomeAccess().getGroup_4()); 
            // InternalDsl.g:813:2: ( rule__Home__Group_4__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==29) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDsl.g:813:3: rule__Home__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Home__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHomeAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group__4__Impl"


    // $ANTLR start "rule__Home__Group__5"
    // InternalDsl.g:821:1: rule__Home__Group__5 : rule__Home__Group__5__Impl rule__Home__Group__6 ;
    public final void rule__Home__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:825:1: ( rule__Home__Group__5__Impl rule__Home__Group__6 )
            // InternalDsl.g:826:2: rule__Home__Group__5__Impl rule__Home__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Home__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Home__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group__5"


    // $ANTLR start "rule__Home__Group__5__Impl"
    // InternalDsl.g:833:1: rule__Home__Group__5__Impl : ( ( rule__Home__Group_5__0 )? ) ;
    public final void rule__Home__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:837:1: ( ( ( rule__Home__Group_5__0 )? ) )
            // InternalDsl.g:838:1: ( ( rule__Home__Group_5__0 )? )
            {
            // InternalDsl.g:838:1: ( ( rule__Home__Group_5__0 )? )
            // InternalDsl.g:839:2: ( rule__Home__Group_5__0 )?
            {
             before(grammarAccess.getHomeAccess().getGroup_5()); 
            // InternalDsl.g:840:2: ( rule__Home__Group_5__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==31) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDsl.g:840:3: rule__Home__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Home__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHomeAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group__5__Impl"


    // $ANTLR start "rule__Home__Group__6"
    // InternalDsl.g:848:1: rule__Home__Group__6 : rule__Home__Group__6__Impl rule__Home__Group__7 ;
    public final void rule__Home__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:852:1: ( rule__Home__Group__6__Impl rule__Home__Group__7 )
            // InternalDsl.g:853:2: rule__Home__Group__6__Impl rule__Home__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__Home__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Home__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group__6"


    // $ANTLR start "rule__Home__Group__6__Impl"
    // InternalDsl.g:860:1: rule__Home__Group__6__Impl : ( ( rule__Home__Group_6__0 )? ) ;
    public final void rule__Home__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:864:1: ( ( ( rule__Home__Group_6__0 )? ) )
            // InternalDsl.g:865:1: ( ( rule__Home__Group_6__0 )? )
            {
            // InternalDsl.g:865:1: ( ( rule__Home__Group_6__0 )? )
            // InternalDsl.g:866:2: ( rule__Home__Group_6__0 )?
            {
             before(grammarAccess.getHomeAccess().getGroup_6()); 
            // InternalDsl.g:867:2: ( rule__Home__Group_6__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==32) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDsl.g:867:3: rule__Home__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Home__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHomeAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group__6__Impl"


    // $ANTLR start "rule__Home__Group__7"
    // InternalDsl.g:875:1: rule__Home__Group__7 : rule__Home__Group__7__Impl rule__Home__Group__8 ;
    public final void rule__Home__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:879:1: ( rule__Home__Group__7__Impl rule__Home__Group__8 )
            // InternalDsl.g:880:2: rule__Home__Group__7__Impl rule__Home__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__Home__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Home__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group__7"


    // $ANTLR start "rule__Home__Group__7__Impl"
    // InternalDsl.g:887:1: rule__Home__Group__7__Impl : ( ( rule__Home__Group_7__0 )? ) ;
    public final void rule__Home__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:891:1: ( ( ( rule__Home__Group_7__0 )? ) )
            // InternalDsl.g:892:1: ( ( rule__Home__Group_7__0 )? )
            {
            // InternalDsl.g:892:1: ( ( rule__Home__Group_7__0 )? )
            // InternalDsl.g:893:2: ( rule__Home__Group_7__0 )?
            {
             before(grammarAccess.getHomeAccess().getGroup_7()); 
            // InternalDsl.g:894:2: ( rule__Home__Group_7__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==33) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDsl.g:894:3: rule__Home__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Home__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHomeAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group__7__Impl"


    // $ANTLR start "rule__Home__Group__8"
    // InternalDsl.g:902:1: rule__Home__Group__8 : rule__Home__Group__8__Impl rule__Home__Group__9 ;
    public final void rule__Home__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:906:1: ( rule__Home__Group__8__Impl rule__Home__Group__9 )
            // InternalDsl.g:907:2: rule__Home__Group__8__Impl rule__Home__Group__9
            {
            pushFollow(FOLLOW_7);
            rule__Home__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Home__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group__8"


    // $ANTLR start "rule__Home__Group__8__Impl"
    // InternalDsl.g:914:1: rule__Home__Group__8__Impl : ( 'start' ) ;
    public final void rule__Home__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:918:1: ( ( 'start' ) )
            // InternalDsl.g:919:1: ( 'start' )
            {
            // InternalDsl.g:919:1: ( 'start' )
            // InternalDsl.g:920:2: 'start'
            {
             before(grammarAccess.getHomeAccess().getStartKeyword_8()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getHomeAccess().getStartKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group__8__Impl"


    // $ANTLR start "rule__Home__Group__9"
    // InternalDsl.g:929:1: rule__Home__Group__9 : rule__Home__Group__9__Impl ;
    public final void rule__Home__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:933:1: ( rule__Home__Group__9__Impl )
            // InternalDsl.g:934:2: rule__Home__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Home__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group__9"


    // $ANTLR start "rule__Home__Group__9__Impl"
    // InternalDsl.g:940:1: rule__Home__Group__9__Impl : ( '}' ) ;
    public final void rule__Home__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:944:1: ( ( '}' ) )
            // InternalDsl.g:945:1: ( '}' )
            {
            // InternalDsl.g:945:1: ( '}' )
            // InternalDsl.g:946:2: '}'
            {
             before(grammarAccess.getHomeAccess().getRightCurlyBracketKeyword_9()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getHomeAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group__9__Impl"


    // $ANTLR start "rule__Home__Group_3__0"
    // InternalDsl.g:956:1: rule__Home__Group_3__0 : rule__Home__Group_3__0__Impl rule__Home__Group_3__1 ;
    public final void rule__Home__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:960:1: ( rule__Home__Group_3__0__Impl rule__Home__Group_3__1 )
            // InternalDsl.g:961:2: rule__Home__Group_3__0__Impl rule__Home__Group_3__1
            {
            pushFollow(FOLLOW_8);
            rule__Home__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Home__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_3__0"


    // $ANTLR start "rule__Home__Group_3__0__Impl"
    // InternalDsl.g:968:1: rule__Home__Group_3__0__Impl : ( 'eventFile' ) ;
    public final void rule__Home__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:972:1: ( ( 'eventFile' ) )
            // InternalDsl.g:973:1: ( 'eventFile' )
            {
            // InternalDsl.g:973:1: ( 'eventFile' )
            // InternalDsl.g:974:2: 'eventFile'
            {
             before(grammarAccess.getHomeAccess().getEventFileKeyword_3_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getHomeAccess().getEventFileKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_3__0__Impl"


    // $ANTLR start "rule__Home__Group_3__1"
    // InternalDsl.g:983:1: rule__Home__Group_3__1 : rule__Home__Group_3__1__Impl ;
    public final void rule__Home__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:987:1: ( rule__Home__Group_3__1__Impl )
            // InternalDsl.g:988:2: rule__Home__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Home__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_3__1"


    // $ANTLR start "rule__Home__Group_3__1__Impl"
    // InternalDsl.g:994:1: rule__Home__Group_3__1__Impl : ( ( rule__Home__FileEventsAssignment_3_1 ) ) ;
    public final void rule__Home__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:998:1: ( ( ( rule__Home__FileEventsAssignment_3_1 ) ) )
            // InternalDsl.g:999:1: ( ( rule__Home__FileEventsAssignment_3_1 ) )
            {
            // InternalDsl.g:999:1: ( ( rule__Home__FileEventsAssignment_3_1 ) )
            // InternalDsl.g:1000:2: ( rule__Home__FileEventsAssignment_3_1 )
            {
             before(grammarAccess.getHomeAccess().getFileEventsAssignment_3_1()); 
            // InternalDsl.g:1001:2: ( rule__Home__FileEventsAssignment_3_1 )
            // InternalDsl.g:1001:3: rule__Home__FileEventsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Home__FileEventsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getHomeAccess().getFileEventsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_3__1__Impl"


    // $ANTLR start "rule__Home__Group_4__0"
    // InternalDsl.g:1010:1: rule__Home__Group_4__0 : rule__Home__Group_4__0__Impl rule__Home__Group_4__1 ;
    public final void rule__Home__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1014:1: ( rule__Home__Group_4__0__Impl rule__Home__Group_4__1 )
            // InternalDsl.g:1015:2: rule__Home__Group_4__0__Impl rule__Home__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Home__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Home__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_4__0"


    // $ANTLR start "rule__Home__Group_4__0__Impl"
    // InternalDsl.g:1022:1: rule__Home__Group_4__0__Impl : ( 'rooms' ) ;
    public final void rule__Home__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1026:1: ( ( 'rooms' ) )
            // InternalDsl.g:1027:1: ( 'rooms' )
            {
            // InternalDsl.g:1027:1: ( 'rooms' )
            // InternalDsl.g:1028:2: 'rooms'
            {
             before(grammarAccess.getHomeAccess().getRoomsKeyword_4_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getHomeAccess().getRoomsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_4__0__Impl"


    // $ANTLR start "rule__Home__Group_4__1"
    // InternalDsl.g:1037:1: rule__Home__Group_4__1 : rule__Home__Group_4__1__Impl rule__Home__Group_4__2 ;
    public final void rule__Home__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1041:1: ( rule__Home__Group_4__1__Impl rule__Home__Group_4__2 )
            // InternalDsl.g:1042:2: rule__Home__Group_4__1__Impl rule__Home__Group_4__2
            {
            pushFollow(FOLLOW_9);
            rule__Home__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Home__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_4__1"


    // $ANTLR start "rule__Home__Group_4__1__Impl"
    // InternalDsl.g:1049:1: rule__Home__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Home__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1053:1: ( ( '{' ) )
            // InternalDsl.g:1054:1: ( '{' )
            {
            // InternalDsl.g:1054:1: ( '{' )
            // InternalDsl.g:1055:2: '{'
            {
             before(grammarAccess.getHomeAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getHomeAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_4__1__Impl"


    // $ANTLR start "rule__Home__Group_4__2"
    // InternalDsl.g:1064:1: rule__Home__Group_4__2 : rule__Home__Group_4__2__Impl rule__Home__Group_4__3 ;
    public final void rule__Home__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1068:1: ( rule__Home__Group_4__2__Impl rule__Home__Group_4__3 )
            // InternalDsl.g:1069:2: rule__Home__Group_4__2__Impl rule__Home__Group_4__3
            {
            pushFollow(FOLLOW_10);
            rule__Home__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Home__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_4__2"


    // $ANTLR start "rule__Home__Group_4__2__Impl"
    // InternalDsl.g:1076:1: rule__Home__Group_4__2__Impl : ( ( rule__Home__RoomsAssignment_4_2 ) ) ;
    public final void rule__Home__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1080:1: ( ( ( rule__Home__RoomsAssignment_4_2 ) ) )
            // InternalDsl.g:1081:1: ( ( rule__Home__RoomsAssignment_4_2 ) )
            {
            // InternalDsl.g:1081:1: ( ( rule__Home__RoomsAssignment_4_2 ) )
            // InternalDsl.g:1082:2: ( rule__Home__RoomsAssignment_4_2 )
            {
             before(grammarAccess.getHomeAccess().getRoomsAssignment_4_2()); 
            // InternalDsl.g:1083:2: ( rule__Home__RoomsAssignment_4_2 )
            // InternalDsl.g:1083:3: rule__Home__RoomsAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Home__RoomsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getHomeAccess().getRoomsAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_4__2__Impl"


    // $ANTLR start "rule__Home__Group_4__3"
    // InternalDsl.g:1091:1: rule__Home__Group_4__3 : rule__Home__Group_4__3__Impl rule__Home__Group_4__4 ;
    public final void rule__Home__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1095:1: ( rule__Home__Group_4__3__Impl rule__Home__Group_4__4 )
            // InternalDsl.g:1096:2: rule__Home__Group_4__3__Impl rule__Home__Group_4__4
            {
            pushFollow(FOLLOW_10);
            rule__Home__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Home__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_4__3"


    // $ANTLR start "rule__Home__Group_4__3__Impl"
    // InternalDsl.g:1103:1: rule__Home__Group_4__3__Impl : ( ( rule__Home__Group_4_3__0 )* ) ;
    public final void rule__Home__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1107:1: ( ( ( rule__Home__Group_4_3__0 )* ) )
            // InternalDsl.g:1108:1: ( ( rule__Home__Group_4_3__0 )* )
            {
            // InternalDsl.g:1108:1: ( ( rule__Home__Group_4_3__0 )* )
            // InternalDsl.g:1109:2: ( rule__Home__Group_4_3__0 )*
            {
             before(grammarAccess.getHomeAccess().getGroup_4_3()); 
            // InternalDsl.g:1110:2: ( rule__Home__Group_4_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==30) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDsl.g:1110:3: rule__Home__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Home__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getHomeAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_4__3__Impl"


    // $ANTLR start "rule__Home__Group_4__4"
    // InternalDsl.g:1118:1: rule__Home__Group_4__4 : rule__Home__Group_4__4__Impl ;
    public final void rule__Home__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1122:1: ( rule__Home__Group_4__4__Impl )
            // InternalDsl.g:1123:2: rule__Home__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Home__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_4__4"


    // $ANTLR start "rule__Home__Group_4__4__Impl"
    // InternalDsl.g:1129:1: rule__Home__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Home__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1133:1: ( ( '}' ) )
            // InternalDsl.g:1134:1: ( '}' )
            {
            // InternalDsl.g:1134:1: ( '}' )
            // InternalDsl.g:1135:2: '}'
            {
             before(grammarAccess.getHomeAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getHomeAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_4__4__Impl"


    // $ANTLR start "rule__Home__Group_4_3__0"
    // InternalDsl.g:1145:1: rule__Home__Group_4_3__0 : rule__Home__Group_4_3__0__Impl rule__Home__Group_4_3__1 ;
    public final void rule__Home__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1149:1: ( rule__Home__Group_4_3__0__Impl rule__Home__Group_4_3__1 )
            // InternalDsl.g:1150:2: rule__Home__Group_4_3__0__Impl rule__Home__Group_4_3__1
            {
            pushFollow(FOLLOW_9);
            rule__Home__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Home__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_4_3__0"


    // $ANTLR start "rule__Home__Group_4_3__0__Impl"
    // InternalDsl.g:1157:1: rule__Home__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Home__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1161:1: ( ( ',' ) )
            // InternalDsl.g:1162:1: ( ',' )
            {
            // InternalDsl.g:1162:1: ( ',' )
            // InternalDsl.g:1163:2: ','
            {
             before(grammarAccess.getHomeAccess().getCommaKeyword_4_3_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getHomeAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_4_3__0__Impl"


    // $ANTLR start "rule__Home__Group_4_3__1"
    // InternalDsl.g:1172:1: rule__Home__Group_4_3__1 : rule__Home__Group_4_3__1__Impl ;
    public final void rule__Home__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1176:1: ( rule__Home__Group_4_3__1__Impl )
            // InternalDsl.g:1177:2: rule__Home__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Home__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_4_3__1"


    // $ANTLR start "rule__Home__Group_4_3__1__Impl"
    // InternalDsl.g:1183:1: rule__Home__Group_4_3__1__Impl : ( ( rule__Home__RoomsAssignment_4_3_1 ) ) ;
    public final void rule__Home__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1187:1: ( ( ( rule__Home__RoomsAssignment_4_3_1 ) ) )
            // InternalDsl.g:1188:1: ( ( rule__Home__RoomsAssignment_4_3_1 ) )
            {
            // InternalDsl.g:1188:1: ( ( rule__Home__RoomsAssignment_4_3_1 ) )
            // InternalDsl.g:1189:2: ( rule__Home__RoomsAssignment_4_3_1 )
            {
             before(grammarAccess.getHomeAccess().getRoomsAssignment_4_3_1()); 
            // InternalDsl.g:1190:2: ( rule__Home__RoomsAssignment_4_3_1 )
            // InternalDsl.g:1190:3: rule__Home__RoomsAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Home__RoomsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getHomeAccess().getRoomsAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_4_3__1__Impl"


    // $ANTLR start "rule__Home__Group_5__0"
    // InternalDsl.g:1199:1: rule__Home__Group_5__0 : rule__Home__Group_5__0__Impl rule__Home__Group_5__1 ;
    public final void rule__Home__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1203:1: ( rule__Home__Group_5__0__Impl rule__Home__Group_5__1 )
            // InternalDsl.g:1204:2: rule__Home__Group_5__0__Impl rule__Home__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__Home__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Home__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_5__0"


    // $ANTLR start "rule__Home__Group_5__0__Impl"
    // InternalDsl.g:1211:1: rule__Home__Group_5__0__Impl : ( 'persons' ) ;
    public final void rule__Home__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1215:1: ( ( 'persons' ) )
            // InternalDsl.g:1216:1: ( 'persons' )
            {
            // InternalDsl.g:1216:1: ( 'persons' )
            // InternalDsl.g:1217:2: 'persons'
            {
             before(grammarAccess.getHomeAccess().getPersonsKeyword_5_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getHomeAccess().getPersonsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_5__0__Impl"


    // $ANTLR start "rule__Home__Group_5__1"
    // InternalDsl.g:1226:1: rule__Home__Group_5__1 : rule__Home__Group_5__1__Impl rule__Home__Group_5__2 ;
    public final void rule__Home__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1230:1: ( rule__Home__Group_5__1__Impl rule__Home__Group_5__2 )
            // InternalDsl.g:1231:2: rule__Home__Group_5__1__Impl rule__Home__Group_5__2
            {
            pushFollow(FOLLOW_12);
            rule__Home__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Home__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_5__1"


    // $ANTLR start "rule__Home__Group_5__1__Impl"
    // InternalDsl.g:1238:1: rule__Home__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Home__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1242:1: ( ( '{' ) )
            // InternalDsl.g:1243:1: ( '{' )
            {
            // InternalDsl.g:1243:1: ( '{' )
            // InternalDsl.g:1244:2: '{'
            {
             before(grammarAccess.getHomeAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getHomeAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_5__1__Impl"


    // $ANTLR start "rule__Home__Group_5__2"
    // InternalDsl.g:1253:1: rule__Home__Group_5__2 : rule__Home__Group_5__2__Impl rule__Home__Group_5__3 ;
    public final void rule__Home__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1257:1: ( rule__Home__Group_5__2__Impl rule__Home__Group_5__3 )
            // InternalDsl.g:1258:2: rule__Home__Group_5__2__Impl rule__Home__Group_5__3
            {
            pushFollow(FOLLOW_10);
            rule__Home__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Home__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_5__2"


    // $ANTLR start "rule__Home__Group_5__2__Impl"
    // InternalDsl.g:1265:1: rule__Home__Group_5__2__Impl : ( ( rule__Home__PersonsAssignment_5_2 ) ) ;
    public final void rule__Home__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1269:1: ( ( ( rule__Home__PersonsAssignment_5_2 ) ) )
            // InternalDsl.g:1270:1: ( ( rule__Home__PersonsAssignment_5_2 ) )
            {
            // InternalDsl.g:1270:1: ( ( rule__Home__PersonsAssignment_5_2 ) )
            // InternalDsl.g:1271:2: ( rule__Home__PersonsAssignment_5_2 )
            {
             before(grammarAccess.getHomeAccess().getPersonsAssignment_5_2()); 
            // InternalDsl.g:1272:2: ( rule__Home__PersonsAssignment_5_2 )
            // InternalDsl.g:1272:3: rule__Home__PersonsAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Home__PersonsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getHomeAccess().getPersonsAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_5__2__Impl"


    // $ANTLR start "rule__Home__Group_5__3"
    // InternalDsl.g:1280:1: rule__Home__Group_5__3 : rule__Home__Group_5__3__Impl rule__Home__Group_5__4 ;
    public final void rule__Home__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1284:1: ( rule__Home__Group_5__3__Impl rule__Home__Group_5__4 )
            // InternalDsl.g:1285:2: rule__Home__Group_5__3__Impl rule__Home__Group_5__4
            {
            pushFollow(FOLLOW_10);
            rule__Home__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Home__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_5__3"


    // $ANTLR start "rule__Home__Group_5__3__Impl"
    // InternalDsl.g:1292:1: rule__Home__Group_5__3__Impl : ( ( rule__Home__Group_5_3__0 )* ) ;
    public final void rule__Home__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1296:1: ( ( ( rule__Home__Group_5_3__0 )* ) )
            // InternalDsl.g:1297:1: ( ( rule__Home__Group_5_3__0 )* )
            {
            // InternalDsl.g:1297:1: ( ( rule__Home__Group_5_3__0 )* )
            // InternalDsl.g:1298:2: ( rule__Home__Group_5_3__0 )*
            {
             before(grammarAccess.getHomeAccess().getGroup_5_3()); 
            // InternalDsl.g:1299:2: ( rule__Home__Group_5_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==30) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDsl.g:1299:3: rule__Home__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Home__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getHomeAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_5__3__Impl"


    // $ANTLR start "rule__Home__Group_5__4"
    // InternalDsl.g:1307:1: rule__Home__Group_5__4 : rule__Home__Group_5__4__Impl ;
    public final void rule__Home__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1311:1: ( rule__Home__Group_5__4__Impl )
            // InternalDsl.g:1312:2: rule__Home__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Home__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_5__4"


    // $ANTLR start "rule__Home__Group_5__4__Impl"
    // InternalDsl.g:1318:1: rule__Home__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Home__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1322:1: ( ( '}' ) )
            // InternalDsl.g:1323:1: ( '}' )
            {
            // InternalDsl.g:1323:1: ( '}' )
            // InternalDsl.g:1324:2: '}'
            {
             before(grammarAccess.getHomeAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getHomeAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_5__4__Impl"


    // $ANTLR start "rule__Home__Group_5_3__0"
    // InternalDsl.g:1334:1: rule__Home__Group_5_3__0 : rule__Home__Group_5_3__0__Impl rule__Home__Group_5_3__1 ;
    public final void rule__Home__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1338:1: ( rule__Home__Group_5_3__0__Impl rule__Home__Group_5_3__1 )
            // InternalDsl.g:1339:2: rule__Home__Group_5_3__0__Impl rule__Home__Group_5_3__1
            {
            pushFollow(FOLLOW_12);
            rule__Home__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Home__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_5_3__0"


    // $ANTLR start "rule__Home__Group_5_3__0__Impl"
    // InternalDsl.g:1346:1: rule__Home__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Home__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1350:1: ( ( ',' ) )
            // InternalDsl.g:1351:1: ( ',' )
            {
            // InternalDsl.g:1351:1: ( ',' )
            // InternalDsl.g:1352:2: ','
            {
             before(grammarAccess.getHomeAccess().getCommaKeyword_5_3_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getHomeAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_5_3__0__Impl"


    // $ANTLR start "rule__Home__Group_5_3__1"
    // InternalDsl.g:1361:1: rule__Home__Group_5_3__1 : rule__Home__Group_5_3__1__Impl ;
    public final void rule__Home__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1365:1: ( rule__Home__Group_5_3__1__Impl )
            // InternalDsl.g:1366:2: rule__Home__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Home__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_5_3__1"


    // $ANTLR start "rule__Home__Group_5_3__1__Impl"
    // InternalDsl.g:1372:1: rule__Home__Group_5_3__1__Impl : ( ( rule__Home__PersonsAssignment_5_3_1 ) ) ;
    public final void rule__Home__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1376:1: ( ( ( rule__Home__PersonsAssignment_5_3_1 ) ) )
            // InternalDsl.g:1377:1: ( ( rule__Home__PersonsAssignment_5_3_1 ) )
            {
            // InternalDsl.g:1377:1: ( ( rule__Home__PersonsAssignment_5_3_1 ) )
            // InternalDsl.g:1378:2: ( rule__Home__PersonsAssignment_5_3_1 )
            {
             before(grammarAccess.getHomeAccess().getPersonsAssignment_5_3_1()); 
            // InternalDsl.g:1379:2: ( rule__Home__PersonsAssignment_5_3_1 )
            // InternalDsl.g:1379:3: rule__Home__PersonsAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Home__PersonsAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getHomeAccess().getPersonsAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_5_3__1__Impl"


    // $ANTLR start "rule__Home__Group_6__0"
    // InternalDsl.g:1388:1: rule__Home__Group_6__0 : rule__Home__Group_6__0__Impl rule__Home__Group_6__1 ;
    public final void rule__Home__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1392:1: ( rule__Home__Group_6__0__Impl rule__Home__Group_6__1 )
            // InternalDsl.g:1393:2: rule__Home__Group_6__0__Impl rule__Home__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__Home__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Home__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_6__0"


    // $ANTLR start "rule__Home__Group_6__0__Impl"
    // InternalDsl.g:1400:1: rule__Home__Group_6__0__Impl : ( 'patterns' ) ;
    public final void rule__Home__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1404:1: ( ( 'patterns' ) )
            // InternalDsl.g:1405:1: ( 'patterns' )
            {
            // InternalDsl.g:1405:1: ( 'patterns' )
            // InternalDsl.g:1406:2: 'patterns'
            {
             before(grammarAccess.getHomeAccess().getPatternsKeyword_6_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getHomeAccess().getPatternsKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_6__0__Impl"


    // $ANTLR start "rule__Home__Group_6__1"
    // InternalDsl.g:1415:1: rule__Home__Group_6__1 : rule__Home__Group_6__1__Impl rule__Home__Group_6__2 ;
    public final void rule__Home__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1419:1: ( rule__Home__Group_6__1__Impl rule__Home__Group_6__2 )
            // InternalDsl.g:1420:2: rule__Home__Group_6__1__Impl rule__Home__Group_6__2
            {
            pushFollow(FOLLOW_13);
            rule__Home__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Home__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_6__1"


    // $ANTLR start "rule__Home__Group_6__1__Impl"
    // InternalDsl.g:1427:1: rule__Home__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Home__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1431:1: ( ( '{' ) )
            // InternalDsl.g:1432:1: ( '{' )
            {
            // InternalDsl.g:1432:1: ( '{' )
            // InternalDsl.g:1433:2: '{'
            {
             before(grammarAccess.getHomeAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getHomeAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_6__1__Impl"


    // $ANTLR start "rule__Home__Group_6__2"
    // InternalDsl.g:1442:1: rule__Home__Group_6__2 : rule__Home__Group_6__2__Impl rule__Home__Group_6__3 ;
    public final void rule__Home__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1446:1: ( rule__Home__Group_6__2__Impl rule__Home__Group_6__3 )
            // InternalDsl.g:1447:2: rule__Home__Group_6__2__Impl rule__Home__Group_6__3
            {
            pushFollow(FOLLOW_10);
            rule__Home__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Home__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_6__2"


    // $ANTLR start "rule__Home__Group_6__2__Impl"
    // InternalDsl.g:1454:1: rule__Home__Group_6__2__Impl : ( ( rule__Home__PatternsAssignment_6_2 ) ) ;
    public final void rule__Home__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1458:1: ( ( ( rule__Home__PatternsAssignment_6_2 ) ) )
            // InternalDsl.g:1459:1: ( ( rule__Home__PatternsAssignment_6_2 ) )
            {
            // InternalDsl.g:1459:1: ( ( rule__Home__PatternsAssignment_6_2 ) )
            // InternalDsl.g:1460:2: ( rule__Home__PatternsAssignment_6_2 )
            {
             before(grammarAccess.getHomeAccess().getPatternsAssignment_6_2()); 
            // InternalDsl.g:1461:2: ( rule__Home__PatternsAssignment_6_2 )
            // InternalDsl.g:1461:3: rule__Home__PatternsAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__Home__PatternsAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getHomeAccess().getPatternsAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_6__2__Impl"


    // $ANTLR start "rule__Home__Group_6__3"
    // InternalDsl.g:1469:1: rule__Home__Group_6__3 : rule__Home__Group_6__3__Impl rule__Home__Group_6__4 ;
    public final void rule__Home__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1473:1: ( rule__Home__Group_6__3__Impl rule__Home__Group_6__4 )
            // InternalDsl.g:1474:2: rule__Home__Group_6__3__Impl rule__Home__Group_6__4
            {
            pushFollow(FOLLOW_10);
            rule__Home__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Home__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_6__3"


    // $ANTLR start "rule__Home__Group_6__3__Impl"
    // InternalDsl.g:1481:1: rule__Home__Group_6__3__Impl : ( ( rule__Home__Group_6_3__0 )* ) ;
    public final void rule__Home__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1485:1: ( ( ( rule__Home__Group_6_3__0 )* ) )
            // InternalDsl.g:1486:1: ( ( rule__Home__Group_6_3__0 )* )
            {
            // InternalDsl.g:1486:1: ( ( rule__Home__Group_6_3__0 )* )
            // InternalDsl.g:1487:2: ( rule__Home__Group_6_3__0 )*
            {
             before(grammarAccess.getHomeAccess().getGroup_6_3()); 
            // InternalDsl.g:1488:2: ( rule__Home__Group_6_3__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==30) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDsl.g:1488:3: rule__Home__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Home__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getHomeAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_6__3__Impl"


    // $ANTLR start "rule__Home__Group_6__4"
    // InternalDsl.g:1496:1: rule__Home__Group_6__4 : rule__Home__Group_6__4__Impl ;
    public final void rule__Home__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1500:1: ( rule__Home__Group_6__4__Impl )
            // InternalDsl.g:1501:2: rule__Home__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Home__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_6__4"


    // $ANTLR start "rule__Home__Group_6__4__Impl"
    // InternalDsl.g:1507:1: rule__Home__Group_6__4__Impl : ( '}' ) ;
    public final void rule__Home__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1511:1: ( ( '}' ) )
            // InternalDsl.g:1512:1: ( '}' )
            {
            // InternalDsl.g:1512:1: ( '}' )
            // InternalDsl.g:1513:2: '}'
            {
             before(grammarAccess.getHomeAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getHomeAccess().getRightCurlyBracketKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_6__4__Impl"


    // $ANTLR start "rule__Home__Group_6_3__0"
    // InternalDsl.g:1523:1: rule__Home__Group_6_3__0 : rule__Home__Group_6_3__0__Impl rule__Home__Group_6_3__1 ;
    public final void rule__Home__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1527:1: ( rule__Home__Group_6_3__0__Impl rule__Home__Group_6_3__1 )
            // InternalDsl.g:1528:2: rule__Home__Group_6_3__0__Impl rule__Home__Group_6_3__1
            {
            pushFollow(FOLLOW_13);
            rule__Home__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Home__Group_6_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_6_3__0"


    // $ANTLR start "rule__Home__Group_6_3__0__Impl"
    // InternalDsl.g:1535:1: rule__Home__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__Home__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1539:1: ( ( ',' ) )
            // InternalDsl.g:1540:1: ( ',' )
            {
            // InternalDsl.g:1540:1: ( ',' )
            // InternalDsl.g:1541:2: ','
            {
             before(grammarAccess.getHomeAccess().getCommaKeyword_6_3_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getHomeAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_6_3__0__Impl"


    // $ANTLR start "rule__Home__Group_6_3__1"
    // InternalDsl.g:1550:1: rule__Home__Group_6_3__1 : rule__Home__Group_6_3__1__Impl ;
    public final void rule__Home__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1554:1: ( rule__Home__Group_6_3__1__Impl )
            // InternalDsl.g:1555:2: rule__Home__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Home__Group_6_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_6_3__1"


    // $ANTLR start "rule__Home__Group_6_3__1__Impl"
    // InternalDsl.g:1561:1: rule__Home__Group_6_3__1__Impl : ( ( rule__Home__PatternsAssignment_6_3_1 ) ) ;
    public final void rule__Home__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1565:1: ( ( ( rule__Home__PatternsAssignment_6_3_1 ) ) )
            // InternalDsl.g:1566:1: ( ( rule__Home__PatternsAssignment_6_3_1 ) )
            {
            // InternalDsl.g:1566:1: ( ( rule__Home__PatternsAssignment_6_3_1 ) )
            // InternalDsl.g:1567:2: ( rule__Home__PatternsAssignment_6_3_1 )
            {
             before(grammarAccess.getHomeAccess().getPatternsAssignment_6_3_1()); 
            // InternalDsl.g:1568:2: ( rule__Home__PatternsAssignment_6_3_1 )
            // InternalDsl.g:1568:3: rule__Home__PatternsAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Home__PatternsAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getHomeAccess().getPatternsAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_6_3__1__Impl"


    // $ANTLR start "rule__Home__Group_7__0"
    // InternalDsl.g:1577:1: rule__Home__Group_7__0 : rule__Home__Group_7__0__Impl rule__Home__Group_7__1 ;
    public final void rule__Home__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1581:1: ( rule__Home__Group_7__0__Impl rule__Home__Group_7__1 )
            // InternalDsl.g:1582:2: rule__Home__Group_7__0__Impl rule__Home__Group_7__1
            {
            pushFollow(FOLLOW_8);
            rule__Home__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Home__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_7__0"


    // $ANTLR start "rule__Home__Group_7__0__Impl"
    // InternalDsl.g:1589:1: rule__Home__Group_7__0__Impl : ( 'monitor' ) ;
    public final void rule__Home__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1593:1: ( ( 'monitor' ) )
            // InternalDsl.g:1594:1: ( 'monitor' )
            {
            // InternalDsl.g:1594:1: ( 'monitor' )
            // InternalDsl.g:1595:2: 'monitor'
            {
             before(grammarAccess.getHomeAccess().getMonitorKeyword_7_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getHomeAccess().getMonitorKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_7__0__Impl"


    // $ANTLR start "rule__Home__Group_7__1"
    // InternalDsl.g:1604:1: rule__Home__Group_7__1 : rule__Home__Group_7__1__Impl rule__Home__Group_7__2 ;
    public final void rule__Home__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1608:1: ( rule__Home__Group_7__1__Impl rule__Home__Group_7__2 )
            // InternalDsl.g:1609:2: rule__Home__Group_7__1__Impl rule__Home__Group_7__2
            {
            pushFollow(FOLLOW_14);
            rule__Home__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Home__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_7__1"


    // $ANTLR start "rule__Home__Group_7__1__Impl"
    // InternalDsl.g:1616:1: rule__Home__Group_7__1__Impl : ( ( rule__Home__MonitoredEntitiesAssignment_7_1 ) ) ;
    public final void rule__Home__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1620:1: ( ( ( rule__Home__MonitoredEntitiesAssignment_7_1 ) ) )
            // InternalDsl.g:1621:1: ( ( rule__Home__MonitoredEntitiesAssignment_7_1 ) )
            {
            // InternalDsl.g:1621:1: ( ( rule__Home__MonitoredEntitiesAssignment_7_1 ) )
            // InternalDsl.g:1622:2: ( rule__Home__MonitoredEntitiesAssignment_7_1 )
            {
             before(grammarAccess.getHomeAccess().getMonitoredEntitiesAssignment_7_1()); 
            // InternalDsl.g:1623:2: ( rule__Home__MonitoredEntitiesAssignment_7_1 )
            // InternalDsl.g:1623:3: rule__Home__MonitoredEntitiesAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Home__MonitoredEntitiesAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getHomeAccess().getMonitoredEntitiesAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_7__1__Impl"


    // $ANTLR start "rule__Home__Group_7__2"
    // InternalDsl.g:1631:1: rule__Home__Group_7__2 : rule__Home__Group_7__2__Impl ;
    public final void rule__Home__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1635:1: ( rule__Home__Group_7__2__Impl )
            // InternalDsl.g:1636:2: rule__Home__Group_7__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Home__Group_7__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_7__2"


    // $ANTLR start "rule__Home__Group_7__2__Impl"
    // InternalDsl.g:1642:1: rule__Home__Group_7__2__Impl : ( ( rule__Home__Group_7_2__0 )* ) ;
    public final void rule__Home__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1646:1: ( ( ( rule__Home__Group_7_2__0 )* ) )
            // InternalDsl.g:1647:1: ( ( rule__Home__Group_7_2__0 )* )
            {
            // InternalDsl.g:1647:1: ( ( rule__Home__Group_7_2__0 )* )
            // InternalDsl.g:1648:2: ( rule__Home__Group_7_2__0 )*
            {
             before(grammarAccess.getHomeAccess().getGroup_7_2()); 
            // InternalDsl.g:1649:2: ( rule__Home__Group_7_2__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==30) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalDsl.g:1649:3: rule__Home__Group_7_2__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Home__Group_7_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getHomeAccess().getGroup_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_7__2__Impl"


    // $ANTLR start "rule__Home__Group_7_2__0"
    // InternalDsl.g:1658:1: rule__Home__Group_7_2__0 : rule__Home__Group_7_2__0__Impl rule__Home__Group_7_2__1 ;
    public final void rule__Home__Group_7_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1662:1: ( rule__Home__Group_7_2__0__Impl rule__Home__Group_7_2__1 )
            // InternalDsl.g:1663:2: rule__Home__Group_7_2__0__Impl rule__Home__Group_7_2__1
            {
            pushFollow(FOLLOW_8);
            rule__Home__Group_7_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Home__Group_7_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_7_2__0"


    // $ANTLR start "rule__Home__Group_7_2__0__Impl"
    // InternalDsl.g:1670:1: rule__Home__Group_7_2__0__Impl : ( ',' ) ;
    public final void rule__Home__Group_7_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1674:1: ( ( ',' ) )
            // InternalDsl.g:1675:1: ( ',' )
            {
            // InternalDsl.g:1675:1: ( ',' )
            // InternalDsl.g:1676:2: ','
            {
             before(grammarAccess.getHomeAccess().getCommaKeyword_7_2_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getHomeAccess().getCommaKeyword_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_7_2__0__Impl"


    // $ANTLR start "rule__Home__Group_7_2__1"
    // InternalDsl.g:1685:1: rule__Home__Group_7_2__1 : rule__Home__Group_7_2__1__Impl ;
    public final void rule__Home__Group_7_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1689:1: ( rule__Home__Group_7_2__1__Impl )
            // InternalDsl.g:1690:2: rule__Home__Group_7_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Home__Group_7_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_7_2__1"


    // $ANTLR start "rule__Home__Group_7_2__1__Impl"
    // InternalDsl.g:1696:1: rule__Home__Group_7_2__1__Impl : ( ( rule__Home__MonitoredEntitiesAssignment_7_2_1 ) ) ;
    public final void rule__Home__Group_7_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1700:1: ( ( ( rule__Home__MonitoredEntitiesAssignment_7_2_1 ) ) )
            // InternalDsl.g:1701:1: ( ( rule__Home__MonitoredEntitiesAssignment_7_2_1 ) )
            {
            // InternalDsl.g:1701:1: ( ( rule__Home__MonitoredEntitiesAssignment_7_2_1 ) )
            // InternalDsl.g:1702:2: ( rule__Home__MonitoredEntitiesAssignment_7_2_1 )
            {
             before(grammarAccess.getHomeAccess().getMonitoredEntitiesAssignment_7_2_1()); 
            // InternalDsl.g:1703:2: ( rule__Home__MonitoredEntitiesAssignment_7_2_1 )
            // InternalDsl.g:1703:3: rule__Home__MonitoredEntitiesAssignment_7_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Home__MonitoredEntitiesAssignment_7_2_1();

            state._fsp--;


            }

             after(grammarAccess.getHomeAccess().getMonitoredEntitiesAssignment_7_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_7_2__1__Impl"


    // $ANTLR start "rule__Room__Group__0"
    // InternalDsl.g:1712:1: rule__Room__Group__0 : rule__Room__Group__0__Impl rule__Room__Group__1 ;
    public final void rule__Room__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1716:1: ( rule__Room__Group__0__Impl rule__Room__Group__1 )
            // InternalDsl.g:1717:2: rule__Room__Group__0__Impl rule__Room__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Room__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__0"


    // $ANTLR start "rule__Room__Group__0__Impl"
    // InternalDsl.g:1724:1: rule__Room__Group__0__Impl : ( () ) ;
    public final void rule__Room__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1728:1: ( ( () ) )
            // InternalDsl.g:1729:1: ( () )
            {
            // InternalDsl.g:1729:1: ( () )
            // InternalDsl.g:1730:2: ()
            {
             before(grammarAccess.getRoomAccess().getRoomAction_0()); 
            // InternalDsl.g:1731:2: ()
            // InternalDsl.g:1731:3: 
            {
            }

             after(grammarAccess.getRoomAccess().getRoomAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__0__Impl"


    // $ANTLR start "rule__Room__Group__1"
    // InternalDsl.g:1739:1: rule__Room__Group__1 : rule__Room__Group__1__Impl rule__Room__Group__2 ;
    public final void rule__Room__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1743:1: ( rule__Room__Group__1__Impl rule__Room__Group__2 )
            // InternalDsl.g:1744:2: rule__Room__Group__1__Impl rule__Room__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Room__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__1"


    // $ANTLR start "rule__Room__Group__1__Impl"
    // InternalDsl.g:1751:1: rule__Room__Group__1__Impl : ( 'Room' ) ;
    public final void rule__Room__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1755:1: ( ( 'Room' ) )
            // InternalDsl.g:1756:1: ( 'Room' )
            {
            // InternalDsl.g:1756:1: ( 'Room' )
            // InternalDsl.g:1757:2: 'Room'
            {
             before(grammarAccess.getRoomAccess().getRoomKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getRoomKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__1__Impl"


    // $ANTLR start "rule__Room__Group__2"
    // InternalDsl.g:1766:1: rule__Room__Group__2 : rule__Room__Group__2__Impl rule__Room__Group__3 ;
    public final void rule__Room__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1770:1: ( rule__Room__Group__2__Impl rule__Room__Group__3 )
            // InternalDsl.g:1771:2: rule__Room__Group__2__Impl rule__Room__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Room__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__2"


    // $ANTLR start "rule__Room__Group__2__Impl"
    // InternalDsl.g:1778:1: rule__Room__Group__2__Impl : ( ( rule__Room__NameAssignment_2 ) ) ;
    public final void rule__Room__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1782:1: ( ( ( rule__Room__NameAssignment_2 ) ) )
            // InternalDsl.g:1783:1: ( ( rule__Room__NameAssignment_2 ) )
            {
            // InternalDsl.g:1783:1: ( ( rule__Room__NameAssignment_2 ) )
            // InternalDsl.g:1784:2: ( rule__Room__NameAssignment_2 )
            {
             before(grammarAccess.getRoomAccess().getNameAssignment_2()); 
            // InternalDsl.g:1785:2: ( rule__Room__NameAssignment_2 )
            // InternalDsl.g:1785:3: rule__Room__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Room__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__2__Impl"


    // $ANTLR start "rule__Room__Group__3"
    // InternalDsl.g:1793:1: rule__Room__Group__3 : rule__Room__Group__3__Impl rule__Room__Group__4 ;
    public final void rule__Room__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1797:1: ( rule__Room__Group__3__Impl rule__Room__Group__4 )
            // InternalDsl.g:1798:2: rule__Room__Group__3__Impl rule__Room__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Room__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__3"


    // $ANTLR start "rule__Room__Group__3__Impl"
    // InternalDsl.g:1805:1: rule__Room__Group__3__Impl : ( '{' ) ;
    public final void rule__Room__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1809:1: ( ( '{' ) )
            // InternalDsl.g:1810:1: ( '{' )
            {
            // InternalDsl.g:1810:1: ( '{' )
            // InternalDsl.g:1811:2: '{'
            {
             before(grammarAccess.getRoomAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__3__Impl"


    // $ANTLR start "rule__Room__Group__4"
    // InternalDsl.g:1820:1: rule__Room__Group__4 : rule__Room__Group__4__Impl rule__Room__Group__5 ;
    public final void rule__Room__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1824:1: ( rule__Room__Group__4__Impl rule__Room__Group__5 )
            // InternalDsl.g:1825:2: rule__Room__Group__4__Impl rule__Room__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__Room__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__4"


    // $ANTLR start "rule__Room__Group__4__Impl"
    // InternalDsl.g:1832:1: rule__Room__Group__4__Impl : ( ( rule__Room__Group_4__0 )? ) ;
    public final void rule__Room__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1836:1: ( ( ( rule__Room__Group_4__0 )? ) )
            // InternalDsl.g:1837:1: ( ( rule__Room__Group_4__0 )? )
            {
            // InternalDsl.g:1837:1: ( ( rule__Room__Group_4__0 )? )
            // InternalDsl.g:1838:2: ( rule__Room__Group_4__0 )?
            {
             before(grammarAccess.getRoomAccess().getGroup_4()); 
            // InternalDsl.g:1839:2: ( rule__Room__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=42 && LA17_0<=43)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalDsl.g:1839:3: rule__Room__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Room__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRoomAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__4__Impl"


    // $ANTLR start "rule__Room__Group__5"
    // InternalDsl.g:1847:1: rule__Room__Group__5 : rule__Room__Group__5__Impl ;
    public final void rule__Room__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1851:1: ( rule__Room__Group__5__Impl )
            // InternalDsl.g:1852:2: rule__Room__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Room__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__5"


    // $ANTLR start "rule__Room__Group__5__Impl"
    // InternalDsl.g:1858:1: rule__Room__Group__5__Impl : ( '}' ) ;
    public final void rule__Room__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1862:1: ( ( '}' ) )
            // InternalDsl.g:1863:1: ( '}' )
            {
            // InternalDsl.g:1863:1: ( '}' )
            // InternalDsl.g:1864:2: '}'
            {
             before(grammarAccess.getRoomAccess().getRightCurlyBracketKeyword_5()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__5__Impl"


    // $ANTLR start "rule__Room__Group_4__0"
    // InternalDsl.g:1874:1: rule__Room__Group_4__0 : rule__Room__Group_4__0__Impl rule__Room__Group_4__1 ;
    public final void rule__Room__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1878:1: ( rule__Room__Group_4__0__Impl rule__Room__Group_4__1 )
            // InternalDsl.g:1879:2: rule__Room__Group_4__0__Impl rule__Room__Group_4__1
            {
            pushFollow(FOLLOW_14);
            rule__Room__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_4__0"


    // $ANTLR start "rule__Room__Group_4__0__Impl"
    // InternalDsl.g:1886:1: rule__Room__Group_4__0__Impl : ( ( rule__Room__SensorsAssignment_4_0 ) ) ;
    public final void rule__Room__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1890:1: ( ( ( rule__Room__SensorsAssignment_4_0 ) ) )
            // InternalDsl.g:1891:1: ( ( rule__Room__SensorsAssignment_4_0 ) )
            {
            // InternalDsl.g:1891:1: ( ( rule__Room__SensorsAssignment_4_0 ) )
            // InternalDsl.g:1892:2: ( rule__Room__SensorsAssignment_4_0 )
            {
             before(grammarAccess.getRoomAccess().getSensorsAssignment_4_0()); 
            // InternalDsl.g:1893:2: ( rule__Room__SensorsAssignment_4_0 )
            // InternalDsl.g:1893:3: rule__Room__SensorsAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__Room__SensorsAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getSensorsAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_4__0__Impl"


    // $ANTLR start "rule__Room__Group_4__1"
    // InternalDsl.g:1901:1: rule__Room__Group_4__1 : rule__Room__Group_4__1__Impl ;
    public final void rule__Room__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1905:1: ( rule__Room__Group_4__1__Impl )
            // InternalDsl.g:1906:2: rule__Room__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Room__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_4__1"


    // $ANTLR start "rule__Room__Group_4__1__Impl"
    // InternalDsl.g:1912:1: rule__Room__Group_4__1__Impl : ( ( rule__Room__Group_4_1__0 )* ) ;
    public final void rule__Room__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1916:1: ( ( ( rule__Room__Group_4_1__0 )* ) )
            // InternalDsl.g:1917:1: ( ( rule__Room__Group_4_1__0 )* )
            {
            // InternalDsl.g:1917:1: ( ( rule__Room__Group_4_1__0 )* )
            // InternalDsl.g:1918:2: ( rule__Room__Group_4_1__0 )*
            {
             before(grammarAccess.getRoomAccess().getGroup_4_1()); 
            // InternalDsl.g:1919:2: ( rule__Room__Group_4_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==30) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalDsl.g:1919:3: rule__Room__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Room__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getRoomAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_4__1__Impl"


    // $ANTLR start "rule__Room__Group_4_1__0"
    // InternalDsl.g:1928:1: rule__Room__Group_4_1__0 : rule__Room__Group_4_1__0__Impl rule__Room__Group_4_1__1 ;
    public final void rule__Room__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1932:1: ( rule__Room__Group_4_1__0__Impl rule__Room__Group_4_1__1 )
            // InternalDsl.g:1933:2: rule__Room__Group_4_1__0__Impl rule__Room__Group_4_1__1
            {
            pushFollow(FOLLOW_16);
            rule__Room__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_4_1__0"


    // $ANTLR start "rule__Room__Group_4_1__0__Impl"
    // InternalDsl.g:1940:1: rule__Room__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__Room__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1944:1: ( ( ',' ) )
            // InternalDsl.g:1945:1: ( ',' )
            {
            // InternalDsl.g:1945:1: ( ',' )
            // InternalDsl.g:1946:2: ','
            {
             before(grammarAccess.getRoomAccess().getCommaKeyword_4_1_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getCommaKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_4_1__0__Impl"


    // $ANTLR start "rule__Room__Group_4_1__1"
    // InternalDsl.g:1955:1: rule__Room__Group_4_1__1 : rule__Room__Group_4_1__1__Impl ;
    public final void rule__Room__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1959:1: ( rule__Room__Group_4_1__1__Impl )
            // InternalDsl.g:1960:2: rule__Room__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Room__Group_4_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_4_1__1"


    // $ANTLR start "rule__Room__Group_4_1__1__Impl"
    // InternalDsl.g:1966:1: rule__Room__Group_4_1__1__Impl : ( ( rule__Room__SensorsAssignment_4_1_1 ) ) ;
    public final void rule__Room__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1970:1: ( ( ( rule__Room__SensorsAssignment_4_1_1 ) ) )
            // InternalDsl.g:1971:1: ( ( rule__Room__SensorsAssignment_4_1_1 ) )
            {
            // InternalDsl.g:1971:1: ( ( rule__Room__SensorsAssignment_4_1_1 ) )
            // InternalDsl.g:1972:2: ( rule__Room__SensorsAssignment_4_1_1 )
            {
             before(grammarAccess.getRoomAccess().getSensorsAssignment_4_1_1()); 
            // InternalDsl.g:1973:2: ( rule__Room__SensorsAssignment_4_1_1 )
            // InternalDsl.g:1973:3: rule__Room__SensorsAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Room__SensorsAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getSensorsAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_4_1__1__Impl"


    // $ANTLR start "rule__Person__Group__0"
    // InternalDsl.g:1982:1: rule__Person__Group__0 : rule__Person__Group__0__Impl rule__Person__Group__1 ;
    public final void rule__Person__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1986:1: ( rule__Person__Group__0__Impl rule__Person__Group__1 )
            // InternalDsl.g:1987:2: rule__Person__Group__0__Impl rule__Person__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Person__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__0"


    // $ANTLR start "rule__Person__Group__0__Impl"
    // InternalDsl.g:1994:1: rule__Person__Group__0__Impl : ( () ) ;
    public final void rule__Person__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1998:1: ( ( () ) )
            // InternalDsl.g:1999:1: ( () )
            {
            // InternalDsl.g:1999:1: ( () )
            // InternalDsl.g:2000:2: ()
            {
             before(grammarAccess.getPersonAccess().getPersonAction_0()); 
            // InternalDsl.g:2001:2: ()
            // InternalDsl.g:2001:3: 
            {
            }

             after(grammarAccess.getPersonAccess().getPersonAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__0__Impl"


    // $ANTLR start "rule__Person__Group__1"
    // InternalDsl.g:2009:1: rule__Person__Group__1 : rule__Person__Group__1__Impl rule__Person__Group__2 ;
    public final void rule__Person__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2013:1: ( rule__Person__Group__1__Impl rule__Person__Group__2 )
            // InternalDsl.g:2014:2: rule__Person__Group__1__Impl rule__Person__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Person__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__1"


    // $ANTLR start "rule__Person__Group__1__Impl"
    // InternalDsl.g:2021:1: rule__Person__Group__1__Impl : ( 'Person' ) ;
    public final void rule__Person__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2025:1: ( ( 'Person' ) )
            // InternalDsl.g:2026:1: ( 'Person' )
            {
            // InternalDsl.g:2026:1: ( 'Person' )
            // InternalDsl.g:2027:2: 'Person'
            {
             before(grammarAccess.getPersonAccess().getPersonKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getPersonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__1__Impl"


    // $ANTLR start "rule__Person__Group__2"
    // InternalDsl.g:2036:1: rule__Person__Group__2 : rule__Person__Group__2__Impl rule__Person__Group__3 ;
    public final void rule__Person__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2040:1: ( rule__Person__Group__2__Impl rule__Person__Group__3 )
            // InternalDsl.g:2041:2: rule__Person__Group__2__Impl rule__Person__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Person__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__2"


    // $ANTLR start "rule__Person__Group__2__Impl"
    // InternalDsl.g:2048:1: rule__Person__Group__2__Impl : ( ( rule__Person__NameAssignment_2 ) ) ;
    public final void rule__Person__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2052:1: ( ( ( rule__Person__NameAssignment_2 ) ) )
            // InternalDsl.g:2053:1: ( ( rule__Person__NameAssignment_2 ) )
            {
            // InternalDsl.g:2053:1: ( ( rule__Person__NameAssignment_2 ) )
            // InternalDsl.g:2054:2: ( rule__Person__NameAssignment_2 )
            {
             before(grammarAccess.getPersonAccess().getNameAssignment_2()); 
            // InternalDsl.g:2055:2: ( rule__Person__NameAssignment_2 )
            // InternalDsl.g:2055:3: rule__Person__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Person__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__2__Impl"


    // $ANTLR start "rule__Person__Group__3"
    // InternalDsl.g:2063:1: rule__Person__Group__3 : rule__Person__Group__3__Impl rule__Person__Group__4 ;
    public final void rule__Person__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2067:1: ( rule__Person__Group__3__Impl rule__Person__Group__4 )
            // InternalDsl.g:2068:2: rule__Person__Group__3__Impl rule__Person__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Person__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__3"


    // $ANTLR start "rule__Person__Group__3__Impl"
    // InternalDsl.g:2075:1: rule__Person__Group__3__Impl : ( '{' ) ;
    public final void rule__Person__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2079:1: ( ( '{' ) )
            // InternalDsl.g:2080:1: ( '{' )
            {
            // InternalDsl.g:2080:1: ( '{' )
            // InternalDsl.g:2081:2: '{'
            {
             before(grammarAccess.getPersonAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__3__Impl"


    // $ANTLR start "rule__Person__Group__4"
    // InternalDsl.g:2090:1: rule__Person__Group__4 : rule__Person__Group__4__Impl rule__Person__Group__5 ;
    public final void rule__Person__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2094:1: ( rule__Person__Group__4__Impl rule__Person__Group__5 )
            // InternalDsl.g:2095:2: rule__Person__Group__4__Impl rule__Person__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__Person__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__4"


    // $ANTLR start "rule__Person__Group__4__Impl"
    // InternalDsl.g:2102:1: rule__Person__Group__4__Impl : ( 'left-ankle' ) ;
    public final void rule__Person__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2106:1: ( ( 'left-ankle' ) )
            // InternalDsl.g:2107:1: ( 'left-ankle' )
            {
            // InternalDsl.g:2107:1: ( 'left-ankle' )
            // InternalDsl.g:2108:2: 'left-ankle'
            {
             before(grammarAccess.getPersonAccess().getLeftAnkleKeyword_4()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getLeftAnkleKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__4__Impl"


    // $ANTLR start "rule__Person__Group__5"
    // InternalDsl.g:2117:1: rule__Person__Group__5 : rule__Person__Group__5__Impl rule__Person__Group__6 ;
    public final void rule__Person__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2121:1: ( rule__Person__Group__5__Impl rule__Person__Group__6 )
            // InternalDsl.g:2122:2: rule__Person__Group__5__Impl rule__Person__Group__6
            {
            pushFollow(FOLLOW_19);
            rule__Person__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__5"


    // $ANTLR start "rule__Person__Group__5__Impl"
    // InternalDsl.g:2129:1: rule__Person__Group__5__Impl : ( ( rule__Person__AnkleLeftAssignment_5 ) ) ;
    public final void rule__Person__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2133:1: ( ( ( rule__Person__AnkleLeftAssignment_5 ) ) )
            // InternalDsl.g:2134:1: ( ( rule__Person__AnkleLeftAssignment_5 ) )
            {
            // InternalDsl.g:2134:1: ( ( rule__Person__AnkleLeftAssignment_5 ) )
            // InternalDsl.g:2135:2: ( rule__Person__AnkleLeftAssignment_5 )
            {
             before(grammarAccess.getPersonAccess().getAnkleLeftAssignment_5()); 
            // InternalDsl.g:2136:2: ( rule__Person__AnkleLeftAssignment_5 )
            // InternalDsl.g:2136:3: rule__Person__AnkleLeftAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Person__AnkleLeftAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getAnkleLeftAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__5__Impl"


    // $ANTLR start "rule__Person__Group__6"
    // InternalDsl.g:2144:1: rule__Person__Group__6 : rule__Person__Group__6__Impl rule__Person__Group__7 ;
    public final void rule__Person__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2148:1: ( rule__Person__Group__6__Impl rule__Person__Group__7 )
            // InternalDsl.g:2149:2: rule__Person__Group__6__Impl rule__Person__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__Person__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__6"


    // $ANTLR start "rule__Person__Group__6__Impl"
    // InternalDsl.g:2156:1: rule__Person__Group__6__Impl : ( 'right-ankle' ) ;
    public final void rule__Person__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2160:1: ( ( 'right-ankle' ) )
            // InternalDsl.g:2161:1: ( 'right-ankle' )
            {
            // InternalDsl.g:2161:1: ( 'right-ankle' )
            // InternalDsl.g:2162:2: 'right-ankle'
            {
             before(grammarAccess.getPersonAccess().getRightAnkleKeyword_6()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getRightAnkleKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__6__Impl"


    // $ANTLR start "rule__Person__Group__7"
    // InternalDsl.g:2171:1: rule__Person__Group__7 : rule__Person__Group__7__Impl rule__Person__Group__8 ;
    public final void rule__Person__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2175:1: ( rule__Person__Group__7__Impl rule__Person__Group__8 )
            // InternalDsl.g:2176:2: rule__Person__Group__7__Impl rule__Person__Group__8
            {
            pushFollow(FOLLOW_20);
            rule__Person__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__7"


    // $ANTLR start "rule__Person__Group__7__Impl"
    // InternalDsl.g:2183:1: rule__Person__Group__7__Impl : ( ( rule__Person__AnkleRightAssignment_7 ) ) ;
    public final void rule__Person__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2187:1: ( ( ( rule__Person__AnkleRightAssignment_7 ) ) )
            // InternalDsl.g:2188:1: ( ( rule__Person__AnkleRightAssignment_7 ) )
            {
            // InternalDsl.g:2188:1: ( ( rule__Person__AnkleRightAssignment_7 ) )
            // InternalDsl.g:2189:2: ( rule__Person__AnkleRightAssignment_7 )
            {
             before(grammarAccess.getPersonAccess().getAnkleRightAssignment_7()); 
            // InternalDsl.g:2190:2: ( rule__Person__AnkleRightAssignment_7 )
            // InternalDsl.g:2190:3: rule__Person__AnkleRightAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Person__AnkleRightAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getAnkleRightAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__7__Impl"


    // $ANTLR start "rule__Person__Group__8"
    // InternalDsl.g:2198:1: rule__Person__Group__8 : rule__Person__Group__8__Impl rule__Person__Group__9 ;
    public final void rule__Person__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2202:1: ( rule__Person__Group__8__Impl rule__Person__Group__9 )
            // InternalDsl.g:2203:2: rule__Person__Group__8__Impl rule__Person__Group__9
            {
            pushFollow(FOLLOW_18);
            rule__Person__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__8"


    // $ANTLR start "rule__Person__Group__8__Impl"
    // InternalDsl.g:2210:1: rule__Person__Group__8__Impl : ( 'belt' ) ;
    public final void rule__Person__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2214:1: ( ( 'belt' ) )
            // InternalDsl.g:2215:1: ( 'belt' )
            {
            // InternalDsl.g:2215:1: ( 'belt' )
            // InternalDsl.g:2216:2: 'belt'
            {
             before(grammarAccess.getPersonAccess().getBeltKeyword_8()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getBeltKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__8__Impl"


    // $ANTLR start "rule__Person__Group__9"
    // InternalDsl.g:2225:1: rule__Person__Group__9 : rule__Person__Group__9__Impl rule__Person__Group__10 ;
    public final void rule__Person__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2229:1: ( rule__Person__Group__9__Impl rule__Person__Group__10 )
            // InternalDsl.g:2230:2: rule__Person__Group__9__Impl rule__Person__Group__10
            {
            pushFollow(FOLLOW_21);
            rule__Person__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__9"


    // $ANTLR start "rule__Person__Group__9__Impl"
    // InternalDsl.g:2237:1: rule__Person__Group__9__Impl : ( ( rule__Person__BeltAssignment_9 ) ) ;
    public final void rule__Person__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2241:1: ( ( ( rule__Person__BeltAssignment_9 ) ) )
            // InternalDsl.g:2242:1: ( ( rule__Person__BeltAssignment_9 ) )
            {
            // InternalDsl.g:2242:1: ( ( rule__Person__BeltAssignment_9 ) )
            // InternalDsl.g:2243:2: ( rule__Person__BeltAssignment_9 )
            {
             before(grammarAccess.getPersonAccess().getBeltAssignment_9()); 
            // InternalDsl.g:2244:2: ( rule__Person__BeltAssignment_9 )
            // InternalDsl.g:2244:3: rule__Person__BeltAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Person__BeltAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getBeltAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__9__Impl"


    // $ANTLR start "rule__Person__Group__10"
    // InternalDsl.g:2252:1: rule__Person__Group__10 : rule__Person__Group__10__Impl rule__Person__Group__11 ;
    public final void rule__Person__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2256:1: ( rule__Person__Group__10__Impl rule__Person__Group__11 )
            // InternalDsl.g:2257:2: rule__Person__Group__10__Impl rule__Person__Group__11
            {
            pushFollow(FOLLOW_18);
            rule__Person__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__10"


    // $ANTLR start "rule__Person__Group__10__Impl"
    // InternalDsl.g:2264:1: rule__Person__Group__10__Impl : ( 'chest' ) ;
    public final void rule__Person__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2268:1: ( ( 'chest' ) )
            // InternalDsl.g:2269:1: ( 'chest' )
            {
            // InternalDsl.g:2269:1: ( 'chest' )
            // InternalDsl.g:2270:2: 'chest'
            {
             before(grammarAccess.getPersonAccess().getChestKeyword_10()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getChestKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__10__Impl"


    // $ANTLR start "rule__Person__Group__11"
    // InternalDsl.g:2279:1: rule__Person__Group__11 : rule__Person__Group__11__Impl rule__Person__Group__12 ;
    public final void rule__Person__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2283:1: ( rule__Person__Group__11__Impl rule__Person__Group__12 )
            // InternalDsl.g:2284:2: rule__Person__Group__11__Impl rule__Person__Group__12
            {
            pushFollow(FOLLOW_7);
            rule__Person__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__11"


    // $ANTLR start "rule__Person__Group__11__Impl"
    // InternalDsl.g:2291:1: rule__Person__Group__11__Impl : ( ( rule__Person__ChestAssignment_11 ) ) ;
    public final void rule__Person__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2295:1: ( ( ( rule__Person__ChestAssignment_11 ) ) )
            // InternalDsl.g:2296:1: ( ( rule__Person__ChestAssignment_11 ) )
            {
            // InternalDsl.g:2296:1: ( ( rule__Person__ChestAssignment_11 ) )
            // InternalDsl.g:2297:2: ( rule__Person__ChestAssignment_11 )
            {
             before(grammarAccess.getPersonAccess().getChestAssignment_11()); 
            // InternalDsl.g:2298:2: ( rule__Person__ChestAssignment_11 )
            // InternalDsl.g:2298:3: rule__Person__ChestAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Person__ChestAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getChestAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__11__Impl"


    // $ANTLR start "rule__Person__Group__12"
    // InternalDsl.g:2306:1: rule__Person__Group__12 : rule__Person__Group__12__Impl ;
    public final void rule__Person__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2310:1: ( rule__Person__Group__12__Impl )
            // InternalDsl.g:2311:2: rule__Person__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Person__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__12"


    // $ANTLR start "rule__Person__Group__12__Impl"
    // InternalDsl.g:2317:1: rule__Person__Group__12__Impl : ( '}' ) ;
    public final void rule__Person__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2321:1: ( ( '}' ) )
            // InternalDsl.g:2322:1: ( '}' )
            {
            // InternalDsl.g:2322:1: ( '}' )
            // InternalDsl.g:2323:2: '}'
            {
             before(grammarAccess.getPersonAccess().getRightCurlyBracketKeyword_12()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__12__Impl"


    // $ANTLR start "rule__Tag__Group__0"
    // InternalDsl.g:2333:1: rule__Tag__Group__0 : rule__Tag__Group__0__Impl rule__Tag__Group__1 ;
    public final void rule__Tag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2337:1: ( rule__Tag__Group__0__Impl rule__Tag__Group__1 )
            // InternalDsl.g:2338:2: rule__Tag__Group__0__Impl rule__Tag__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Tag__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tag__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group__0"


    // $ANTLR start "rule__Tag__Group__0__Impl"
    // InternalDsl.g:2345:1: rule__Tag__Group__0__Impl : ( () ) ;
    public final void rule__Tag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2349:1: ( ( () ) )
            // InternalDsl.g:2350:1: ( () )
            {
            // InternalDsl.g:2350:1: ( () )
            // InternalDsl.g:2351:2: ()
            {
             before(grammarAccess.getTagAccess().getTagAction_0()); 
            // InternalDsl.g:2352:2: ()
            // InternalDsl.g:2352:3: 
            {
            }

             after(grammarAccess.getTagAccess().getTagAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group__0__Impl"


    // $ANTLR start "rule__Tag__Group__1"
    // InternalDsl.g:2360:1: rule__Tag__Group__1 : rule__Tag__Group__1__Impl rule__Tag__Group__2 ;
    public final void rule__Tag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2364:1: ( rule__Tag__Group__1__Impl rule__Tag__Group__2 )
            // InternalDsl.g:2365:2: rule__Tag__Group__1__Impl rule__Tag__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Tag__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tag__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group__1"


    // $ANTLR start "rule__Tag__Group__1__Impl"
    // InternalDsl.g:2372:1: rule__Tag__Group__1__Impl : ( 'ID' ) ;
    public final void rule__Tag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2376:1: ( ( 'ID' ) )
            // InternalDsl.g:2377:1: ( 'ID' )
            {
            // InternalDsl.g:2377:1: ( 'ID' )
            // InternalDsl.g:2378:2: 'ID'
            {
             before(grammarAccess.getTagAccess().getIDKeyword_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getTagAccess().getIDKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group__1__Impl"


    // $ANTLR start "rule__Tag__Group__2"
    // InternalDsl.g:2387:1: rule__Tag__Group__2 : rule__Tag__Group__2__Impl ;
    public final void rule__Tag__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2391:1: ( rule__Tag__Group__2__Impl )
            // InternalDsl.g:2392:2: rule__Tag__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tag__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group__2"


    // $ANTLR start "rule__Tag__Group__2__Impl"
    // InternalDsl.g:2398:1: rule__Tag__Group__2__Impl : ( ( rule__Tag__NameAssignment_2 ) ) ;
    public final void rule__Tag__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2402:1: ( ( ( rule__Tag__NameAssignment_2 ) ) )
            // InternalDsl.g:2403:1: ( ( rule__Tag__NameAssignment_2 ) )
            {
            // InternalDsl.g:2403:1: ( ( rule__Tag__NameAssignment_2 ) )
            // InternalDsl.g:2404:2: ( rule__Tag__NameAssignment_2 )
            {
             before(grammarAccess.getTagAccess().getNameAssignment_2()); 
            // InternalDsl.g:2405:2: ( rule__Tag__NameAssignment_2 )
            // InternalDsl.g:2405:3: rule__Tag__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Tag__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTagAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group__2__Impl"


    // $ANTLR start "rule__Pattern__Group__0"
    // InternalDsl.g:2414:1: rule__Pattern__Group__0 : rule__Pattern__Group__0__Impl rule__Pattern__Group__1 ;
    public final void rule__Pattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2418:1: ( rule__Pattern__Group__0__Impl rule__Pattern__Group__1 )
            // InternalDsl.g:2419:2: rule__Pattern__Group__0__Impl rule__Pattern__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Pattern__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__0"


    // $ANTLR start "rule__Pattern__Group__0__Impl"
    // InternalDsl.g:2426:1: rule__Pattern__Group__0__Impl : ( () ) ;
    public final void rule__Pattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2430:1: ( ( () ) )
            // InternalDsl.g:2431:1: ( () )
            {
            // InternalDsl.g:2431:1: ( () )
            // InternalDsl.g:2432:2: ()
            {
             before(grammarAccess.getPatternAccess().getPatternAction_0()); 
            // InternalDsl.g:2433:2: ()
            // InternalDsl.g:2433:3: 
            {
            }

             after(grammarAccess.getPatternAccess().getPatternAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__0__Impl"


    // $ANTLR start "rule__Pattern__Group__1"
    // InternalDsl.g:2441:1: rule__Pattern__Group__1 : rule__Pattern__Group__1__Impl rule__Pattern__Group__2 ;
    public final void rule__Pattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2445:1: ( rule__Pattern__Group__1__Impl rule__Pattern__Group__2 )
            // InternalDsl.g:2446:2: rule__Pattern__Group__1__Impl rule__Pattern__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Pattern__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__1"


    // $ANTLR start "rule__Pattern__Group__1__Impl"
    // InternalDsl.g:2453:1: rule__Pattern__Group__1__Impl : ( 'Pattern' ) ;
    public final void rule__Pattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2457:1: ( ( 'Pattern' ) )
            // InternalDsl.g:2458:1: ( 'Pattern' )
            {
            // InternalDsl.g:2458:1: ( 'Pattern' )
            // InternalDsl.g:2459:2: 'Pattern'
            {
             before(grammarAccess.getPatternAccess().getPatternKeyword_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getPatternKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__1__Impl"


    // $ANTLR start "rule__Pattern__Group__2"
    // InternalDsl.g:2468:1: rule__Pattern__Group__2 : rule__Pattern__Group__2__Impl rule__Pattern__Group__3 ;
    public final void rule__Pattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2472:1: ( rule__Pattern__Group__2__Impl rule__Pattern__Group__3 )
            // InternalDsl.g:2473:2: rule__Pattern__Group__2__Impl rule__Pattern__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Pattern__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__2"


    // $ANTLR start "rule__Pattern__Group__2__Impl"
    // InternalDsl.g:2480:1: rule__Pattern__Group__2__Impl : ( ( rule__Pattern__NameAssignment_2 ) ) ;
    public final void rule__Pattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2484:1: ( ( ( rule__Pattern__NameAssignment_2 ) ) )
            // InternalDsl.g:2485:1: ( ( rule__Pattern__NameAssignment_2 ) )
            {
            // InternalDsl.g:2485:1: ( ( rule__Pattern__NameAssignment_2 ) )
            // InternalDsl.g:2486:2: ( rule__Pattern__NameAssignment_2 )
            {
             before(grammarAccess.getPatternAccess().getNameAssignment_2()); 
            // InternalDsl.g:2487:2: ( rule__Pattern__NameAssignment_2 )
            // InternalDsl.g:2487:3: rule__Pattern__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPatternAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__2__Impl"


    // $ANTLR start "rule__Pattern__Group__3"
    // InternalDsl.g:2495:1: rule__Pattern__Group__3 : rule__Pattern__Group__3__Impl rule__Pattern__Group__4 ;
    public final void rule__Pattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2499:1: ( rule__Pattern__Group__3__Impl rule__Pattern__Group__4 )
            // InternalDsl.g:2500:2: rule__Pattern__Group__3__Impl rule__Pattern__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__Pattern__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__3"


    // $ANTLR start "rule__Pattern__Group__3__Impl"
    // InternalDsl.g:2507:1: rule__Pattern__Group__3__Impl : ( '{' ) ;
    public final void rule__Pattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2511:1: ( ( '{' ) )
            // InternalDsl.g:2512:1: ( '{' )
            {
            // InternalDsl.g:2512:1: ( '{' )
            // InternalDsl.g:2513:2: '{'
            {
             before(grammarAccess.getPatternAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__3__Impl"


    // $ANTLR start "rule__Pattern__Group__4"
    // InternalDsl.g:2522:1: rule__Pattern__Group__4 : rule__Pattern__Group__4__Impl rule__Pattern__Group__5 ;
    public final void rule__Pattern__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2526:1: ( rule__Pattern__Group__4__Impl rule__Pattern__Group__5 )
            // InternalDsl.g:2527:2: rule__Pattern__Group__4__Impl rule__Pattern__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__Pattern__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__4"


    // $ANTLR start "rule__Pattern__Group__4__Impl"
    // InternalDsl.g:2534:1: rule__Pattern__Group__4__Impl : ( ( rule__Pattern__Group_4__0 )? ) ;
    public final void rule__Pattern__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2538:1: ( ( ( rule__Pattern__Group_4__0 )? ) )
            // InternalDsl.g:2539:1: ( ( rule__Pattern__Group_4__0 )? )
            {
            // InternalDsl.g:2539:1: ( ( rule__Pattern__Group_4__0 )? )
            // InternalDsl.g:2540:2: ( rule__Pattern__Group_4__0 )?
            {
             before(grammarAccess.getPatternAccess().getGroup_4()); 
            // InternalDsl.g:2541:2: ( rule__Pattern__Group_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==25) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalDsl.g:2541:3: rule__Pattern__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pattern__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPatternAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__4__Impl"


    // $ANTLR start "rule__Pattern__Group__5"
    // InternalDsl.g:2549:1: rule__Pattern__Group__5 : rule__Pattern__Group__5__Impl ;
    public final void rule__Pattern__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2553:1: ( rule__Pattern__Group__5__Impl )
            // InternalDsl.g:2554:2: rule__Pattern__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__5"


    // $ANTLR start "rule__Pattern__Group__5__Impl"
    // InternalDsl.g:2560:1: rule__Pattern__Group__5__Impl : ( '}' ) ;
    public final void rule__Pattern__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2564:1: ( ( '}' ) )
            // InternalDsl.g:2565:1: ( '}' )
            {
            // InternalDsl.g:2565:1: ( '}' )
            // InternalDsl.g:2566:2: '}'
            {
             before(grammarAccess.getPatternAccess().getRightCurlyBracketKeyword_5()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__5__Impl"


    // $ANTLR start "rule__Pattern__Group_4__0"
    // InternalDsl.g:2576:1: rule__Pattern__Group_4__0 : rule__Pattern__Group_4__0__Impl rule__Pattern__Group_4__1 ;
    public final void rule__Pattern__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2580:1: ( rule__Pattern__Group_4__0__Impl rule__Pattern__Group_4__1 )
            // InternalDsl.g:2581:2: rule__Pattern__Group_4__0__Impl rule__Pattern__Group_4__1
            {
            pushFollow(FOLLOW_14);
            rule__Pattern__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_4__0"


    // $ANTLR start "rule__Pattern__Group_4__0__Impl"
    // InternalDsl.g:2588:1: rule__Pattern__Group_4__0__Impl : ( ( rule__Pattern__RulesAssignment_4_0 ) ) ;
    public final void rule__Pattern__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2592:1: ( ( ( rule__Pattern__RulesAssignment_4_0 ) ) )
            // InternalDsl.g:2593:1: ( ( rule__Pattern__RulesAssignment_4_0 ) )
            {
            // InternalDsl.g:2593:1: ( ( rule__Pattern__RulesAssignment_4_0 ) )
            // InternalDsl.g:2594:2: ( rule__Pattern__RulesAssignment_4_0 )
            {
             before(grammarAccess.getPatternAccess().getRulesAssignment_4_0()); 
            // InternalDsl.g:2595:2: ( rule__Pattern__RulesAssignment_4_0 )
            // InternalDsl.g:2595:3: rule__Pattern__RulesAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__RulesAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getPatternAccess().getRulesAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_4__0__Impl"


    // $ANTLR start "rule__Pattern__Group_4__1"
    // InternalDsl.g:2603:1: rule__Pattern__Group_4__1 : rule__Pattern__Group_4__1__Impl ;
    public final void rule__Pattern__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2607:1: ( rule__Pattern__Group_4__1__Impl )
            // InternalDsl.g:2608:2: rule__Pattern__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_4__1"


    // $ANTLR start "rule__Pattern__Group_4__1__Impl"
    // InternalDsl.g:2614:1: rule__Pattern__Group_4__1__Impl : ( ( rule__Pattern__Group_4_1__0 )* ) ;
    public final void rule__Pattern__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2618:1: ( ( ( rule__Pattern__Group_4_1__0 )* ) )
            // InternalDsl.g:2619:1: ( ( rule__Pattern__Group_4_1__0 )* )
            {
            // InternalDsl.g:2619:1: ( ( rule__Pattern__Group_4_1__0 )* )
            // InternalDsl.g:2620:2: ( rule__Pattern__Group_4_1__0 )*
            {
             before(grammarAccess.getPatternAccess().getGroup_4_1()); 
            // InternalDsl.g:2621:2: ( rule__Pattern__Group_4_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==30) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalDsl.g:2621:3: rule__Pattern__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Pattern__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getPatternAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_4__1__Impl"


    // $ANTLR start "rule__Pattern__Group_4_1__0"
    // InternalDsl.g:2630:1: rule__Pattern__Group_4_1__0 : rule__Pattern__Group_4_1__0__Impl rule__Pattern__Group_4_1__1 ;
    public final void rule__Pattern__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2634:1: ( rule__Pattern__Group_4_1__0__Impl rule__Pattern__Group_4_1__1 )
            // InternalDsl.g:2635:2: rule__Pattern__Group_4_1__0__Impl rule__Pattern__Group_4_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Pattern__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_4_1__0"


    // $ANTLR start "rule__Pattern__Group_4_1__0__Impl"
    // InternalDsl.g:2642:1: rule__Pattern__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__Pattern__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2646:1: ( ( ',' ) )
            // InternalDsl.g:2647:1: ( ',' )
            {
            // InternalDsl.g:2647:1: ( ',' )
            // InternalDsl.g:2648:2: ','
            {
             before(grammarAccess.getPatternAccess().getCommaKeyword_4_1_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getCommaKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_4_1__0__Impl"


    // $ANTLR start "rule__Pattern__Group_4_1__1"
    // InternalDsl.g:2657:1: rule__Pattern__Group_4_1__1 : rule__Pattern__Group_4_1__1__Impl ;
    public final void rule__Pattern__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2661:1: ( rule__Pattern__Group_4_1__1__Impl )
            // InternalDsl.g:2662:2: rule__Pattern__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group_4_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_4_1__1"


    // $ANTLR start "rule__Pattern__Group_4_1__1__Impl"
    // InternalDsl.g:2668:1: rule__Pattern__Group_4_1__1__Impl : ( ( rule__Pattern__RulesAssignment_4_1_1 ) ) ;
    public final void rule__Pattern__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2672:1: ( ( ( rule__Pattern__RulesAssignment_4_1_1 ) ) )
            // InternalDsl.g:2673:1: ( ( rule__Pattern__RulesAssignment_4_1_1 ) )
            {
            // InternalDsl.g:2673:1: ( ( rule__Pattern__RulesAssignment_4_1_1 ) )
            // InternalDsl.g:2674:2: ( rule__Pattern__RulesAssignment_4_1_1 )
            {
             before(grammarAccess.getPatternAccess().getRulesAssignment_4_1_1()); 
            // InternalDsl.g:2675:2: ( rule__Pattern__RulesAssignment_4_1_1 )
            // InternalDsl.g:2675:3: rule__Pattern__RulesAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__RulesAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPatternAccess().getRulesAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_4_1__1__Impl"


    // $ANTLR start "rule__AnalogSensor__Group__0"
    // InternalDsl.g:2684:1: rule__AnalogSensor__Group__0 : rule__AnalogSensor__Group__0__Impl rule__AnalogSensor__Group__1 ;
    public final void rule__AnalogSensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2688:1: ( rule__AnalogSensor__Group__0__Impl rule__AnalogSensor__Group__1 )
            // InternalDsl.g:2689:2: rule__AnalogSensor__Group__0__Impl rule__AnalogSensor__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__AnalogSensor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AnalogSensor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnalogSensor__Group__0"


    // $ANTLR start "rule__AnalogSensor__Group__0__Impl"
    // InternalDsl.g:2696:1: rule__AnalogSensor__Group__0__Impl : ( () ) ;
    public final void rule__AnalogSensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2700:1: ( ( () ) )
            // InternalDsl.g:2701:1: ( () )
            {
            // InternalDsl.g:2701:1: ( () )
            // InternalDsl.g:2702:2: ()
            {
             before(grammarAccess.getAnalogSensorAccess().getAnalogSensorAction_0()); 
            // InternalDsl.g:2703:2: ()
            // InternalDsl.g:2703:3: 
            {
            }

             after(grammarAccess.getAnalogSensorAccess().getAnalogSensorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnalogSensor__Group__0__Impl"


    // $ANTLR start "rule__AnalogSensor__Group__1"
    // InternalDsl.g:2711:1: rule__AnalogSensor__Group__1 : rule__AnalogSensor__Group__1__Impl rule__AnalogSensor__Group__2 ;
    public final void rule__AnalogSensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2715:1: ( rule__AnalogSensor__Group__1__Impl rule__AnalogSensor__Group__2 )
            // InternalDsl.g:2716:2: rule__AnalogSensor__Group__1__Impl rule__AnalogSensor__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__AnalogSensor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AnalogSensor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnalogSensor__Group__1"


    // $ANTLR start "rule__AnalogSensor__Group__1__Impl"
    // InternalDsl.g:2723:1: rule__AnalogSensor__Group__1__Impl : ( 'AnalogSensor' ) ;
    public final void rule__AnalogSensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2727:1: ( ( 'AnalogSensor' ) )
            // InternalDsl.g:2728:1: ( 'AnalogSensor' )
            {
            // InternalDsl.g:2728:1: ( 'AnalogSensor' )
            // InternalDsl.g:2729:2: 'AnalogSensor'
            {
             before(grammarAccess.getAnalogSensorAccess().getAnalogSensorKeyword_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getAnalogSensorAccess().getAnalogSensorKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnalogSensor__Group__1__Impl"


    // $ANTLR start "rule__AnalogSensor__Group__2"
    // InternalDsl.g:2738:1: rule__AnalogSensor__Group__2 : rule__AnalogSensor__Group__2__Impl ;
    public final void rule__AnalogSensor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2742:1: ( rule__AnalogSensor__Group__2__Impl )
            // InternalDsl.g:2743:2: rule__AnalogSensor__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AnalogSensor__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnalogSensor__Group__2"


    // $ANTLR start "rule__AnalogSensor__Group__2__Impl"
    // InternalDsl.g:2749:1: rule__AnalogSensor__Group__2__Impl : ( ( rule__AnalogSensor__NameAssignment_2 ) ) ;
    public final void rule__AnalogSensor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2753:1: ( ( ( rule__AnalogSensor__NameAssignment_2 ) ) )
            // InternalDsl.g:2754:1: ( ( rule__AnalogSensor__NameAssignment_2 ) )
            {
            // InternalDsl.g:2754:1: ( ( rule__AnalogSensor__NameAssignment_2 ) )
            // InternalDsl.g:2755:2: ( rule__AnalogSensor__NameAssignment_2 )
            {
             before(grammarAccess.getAnalogSensorAccess().getNameAssignment_2()); 
            // InternalDsl.g:2756:2: ( rule__AnalogSensor__NameAssignment_2 )
            // InternalDsl.g:2756:3: rule__AnalogSensor__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AnalogSensor__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAnalogSensorAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnalogSensor__Group__2__Impl"


    // $ANTLR start "rule__DigitalSensor__Group__0"
    // InternalDsl.g:2765:1: rule__DigitalSensor__Group__0 : rule__DigitalSensor__Group__0__Impl rule__DigitalSensor__Group__1 ;
    public final void rule__DigitalSensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2769:1: ( rule__DigitalSensor__Group__0__Impl rule__DigitalSensor__Group__1 )
            // InternalDsl.g:2770:2: rule__DigitalSensor__Group__0__Impl rule__DigitalSensor__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__DigitalSensor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DigitalSensor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DigitalSensor__Group__0"


    // $ANTLR start "rule__DigitalSensor__Group__0__Impl"
    // InternalDsl.g:2777:1: rule__DigitalSensor__Group__0__Impl : ( () ) ;
    public final void rule__DigitalSensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2781:1: ( ( () ) )
            // InternalDsl.g:2782:1: ( () )
            {
            // InternalDsl.g:2782:1: ( () )
            // InternalDsl.g:2783:2: ()
            {
             before(grammarAccess.getDigitalSensorAccess().getDigitalSensorAction_0()); 
            // InternalDsl.g:2784:2: ()
            // InternalDsl.g:2784:3: 
            {
            }

             after(grammarAccess.getDigitalSensorAccess().getDigitalSensorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DigitalSensor__Group__0__Impl"


    // $ANTLR start "rule__DigitalSensor__Group__1"
    // InternalDsl.g:2792:1: rule__DigitalSensor__Group__1 : rule__DigitalSensor__Group__1__Impl rule__DigitalSensor__Group__2 ;
    public final void rule__DigitalSensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2796:1: ( rule__DigitalSensor__Group__1__Impl rule__DigitalSensor__Group__2 )
            // InternalDsl.g:2797:2: rule__DigitalSensor__Group__1__Impl rule__DigitalSensor__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__DigitalSensor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DigitalSensor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DigitalSensor__Group__1"


    // $ANTLR start "rule__DigitalSensor__Group__1__Impl"
    // InternalDsl.g:2804:1: rule__DigitalSensor__Group__1__Impl : ( 'DigitalSensor' ) ;
    public final void rule__DigitalSensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2808:1: ( ( 'DigitalSensor' ) )
            // InternalDsl.g:2809:1: ( 'DigitalSensor' )
            {
            // InternalDsl.g:2809:1: ( 'DigitalSensor' )
            // InternalDsl.g:2810:2: 'DigitalSensor'
            {
             before(grammarAccess.getDigitalSensorAccess().getDigitalSensorKeyword_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getDigitalSensorAccess().getDigitalSensorKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DigitalSensor__Group__1__Impl"


    // $ANTLR start "rule__DigitalSensor__Group__2"
    // InternalDsl.g:2819:1: rule__DigitalSensor__Group__2 : rule__DigitalSensor__Group__2__Impl ;
    public final void rule__DigitalSensor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2823:1: ( rule__DigitalSensor__Group__2__Impl )
            // InternalDsl.g:2824:2: rule__DigitalSensor__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DigitalSensor__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DigitalSensor__Group__2"


    // $ANTLR start "rule__DigitalSensor__Group__2__Impl"
    // InternalDsl.g:2830:1: rule__DigitalSensor__Group__2__Impl : ( ( rule__DigitalSensor__NameAssignment_2 ) ) ;
    public final void rule__DigitalSensor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2834:1: ( ( ( rule__DigitalSensor__NameAssignment_2 ) ) )
            // InternalDsl.g:2835:1: ( ( rule__DigitalSensor__NameAssignment_2 ) )
            {
            // InternalDsl.g:2835:1: ( ( rule__DigitalSensor__NameAssignment_2 ) )
            // InternalDsl.g:2836:2: ( rule__DigitalSensor__NameAssignment_2 )
            {
             before(grammarAccess.getDigitalSensorAccess().getNameAssignment_2()); 
            // InternalDsl.g:2837:2: ( rule__DigitalSensor__NameAssignment_2 )
            // InternalDsl.g:2837:3: rule__DigitalSensor__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DigitalSensor__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDigitalSensorAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DigitalSensor__Group__2__Impl"


    // $ANTLR start "rule__EDouble__Group__0"
    // InternalDsl.g:2846:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2850:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // InternalDsl.g:2851:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__EDouble__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__0"


    // $ANTLR start "rule__EDouble__Group__0__Impl"
    // InternalDsl.g:2858:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2862:1: ( ( ( '-' )? ) )
            // InternalDsl.g:2863:1: ( ( '-' )? )
            {
            // InternalDsl.g:2863:1: ( ( '-' )? )
            // InternalDsl.g:2864:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // InternalDsl.g:2865:2: ( '-' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==44) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalDsl.g:2865:3: '-'
                    {
                    match(input,44,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__0__Impl"


    // $ANTLR start "rule__EDouble__Group__1"
    // InternalDsl.g:2873:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2877:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // InternalDsl.g:2878:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__EDouble__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__1"


    // $ANTLR start "rule__EDouble__Group__1__Impl"
    // InternalDsl.g:2885:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2889:1: ( ( ( RULE_INT )? ) )
            // InternalDsl.g:2890:1: ( ( RULE_INT )? )
            {
            // InternalDsl.g:2890:1: ( ( RULE_INT )? )
            // InternalDsl.g:2891:2: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            // InternalDsl.g:2892:2: ( RULE_INT )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_INT) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalDsl.g:2892:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__1__Impl"


    // $ANTLR start "rule__EDouble__Group__2"
    // InternalDsl.g:2900:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2904:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // InternalDsl.g:2905:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__EDouble__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__2"


    // $ANTLR start "rule__EDouble__Group__2__Impl"
    // InternalDsl.g:2912:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2916:1: ( ( '.' ) )
            // InternalDsl.g:2917:1: ( '.' )
            {
            // InternalDsl.g:2917:1: ( '.' )
            // InternalDsl.g:2918:2: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__2__Impl"


    // $ANTLR start "rule__EDouble__Group__3"
    // InternalDsl.g:2927:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2931:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // InternalDsl.g:2932:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__EDouble__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__3"


    // $ANTLR start "rule__EDouble__Group__3__Impl"
    // InternalDsl.g:2939:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2943:1: ( ( RULE_INT ) )
            // InternalDsl.g:2944:1: ( RULE_INT )
            {
            // InternalDsl.g:2944:1: ( RULE_INT )
            // InternalDsl.g:2945:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__3__Impl"


    // $ANTLR start "rule__EDouble__Group__4"
    // InternalDsl.g:2954:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2958:1: ( rule__EDouble__Group__4__Impl )
            // InternalDsl.g:2959:2: rule__EDouble__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__4"


    // $ANTLR start "rule__EDouble__Group__4__Impl"
    // InternalDsl.g:2965:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2969:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // InternalDsl.g:2970:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // InternalDsl.g:2970:1: ( ( rule__EDouble__Group_4__0 )? )
            // InternalDsl.g:2971:2: ( rule__EDouble__Group_4__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            // InternalDsl.g:2972:2: ( rule__EDouble__Group_4__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=11 && LA23_0<=12)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalDsl.g:2972:3: rule__EDouble__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EDouble__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__4__Impl"


    // $ANTLR start "rule__EDouble__Group_4__0"
    // InternalDsl.g:2981:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2985:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // InternalDsl.g:2986:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
            {
            pushFollow(FOLLOW_27);
            rule__EDouble__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__0"


    // $ANTLR start "rule__EDouble__Group_4__0__Impl"
    // InternalDsl.g:2993:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2997:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // InternalDsl.g:2998:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // InternalDsl.g:2998:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // InternalDsl.g:2999:2: ( rule__EDouble__Alternatives_4_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            // InternalDsl.g:3000:2: ( rule__EDouble__Alternatives_4_0 )
            // InternalDsl.g:3000:3: rule__EDouble__Alternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__0__Impl"


    // $ANTLR start "rule__EDouble__Group_4__1"
    // InternalDsl.g:3008:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3012:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // InternalDsl.g:3013:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
            {
            pushFollow(FOLLOW_27);
            rule__EDouble__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__1"


    // $ANTLR start "rule__EDouble__Group_4__1__Impl"
    // InternalDsl.g:3020:1: rule__EDouble__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3024:1: ( ( ( '-' )? ) )
            // InternalDsl.g:3025:1: ( ( '-' )? )
            {
            // InternalDsl.g:3025:1: ( ( '-' )? )
            // InternalDsl.g:3026:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            // InternalDsl.g:3027:2: ( '-' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==44) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalDsl.g:3027:3: '-'
                    {
                    match(input,44,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__1__Impl"


    // $ANTLR start "rule__EDouble__Group_4__2"
    // InternalDsl.g:3035:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3039:1: ( rule__EDouble__Group_4__2__Impl )
            // InternalDsl.g:3040:2: rule__EDouble__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__2"


    // $ANTLR start "rule__EDouble__Group_4__2__Impl"
    // InternalDsl.g:3046:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3050:1: ( ( RULE_INT ) )
            // InternalDsl.g:3051:1: ( RULE_INT )
            {
            // InternalDsl.g:3051:1: ( RULE_INT )
            // InternalDsl.g:3052:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__2__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // InternalDsl.g:3062:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3066:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalDsl.g:3067:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // InternalDsl.g:3074:1: rule__Rule__Group__0__Impl : ( () ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3078:1: ( ( () ) )
            // InternalDsl.g:3079:1: ( () )
            {
            // InternalDsl.g:3079:1: ( () )
            // InternalDsl.g:3080:2: ()
            {
             before(grammarAccess.getRuleAccess().getRuleAction_0()); 
            // InternalDsl.g:3081:2: ()
            // InternalDsl.g:3081:3: 
            {
            }

             after(grammarAccess.getRuleAccess().getRuleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // InternalDsl.g:3089:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3093:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalDsl.g:3094:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // InternalDsl.g:3101:1: rule__Rule__Group__1__Impl : ( '{' ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3105:1: ( ( '{' ) )
            // InternalDsl.g:3106:1: ( '{' )
            {
            // InternalDsl.g:3106:1: ( '{' )
            // InternalDsl.g:3107:2: '{'
            {
             before(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__2"
    // InternalDsl.g:3116:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3120:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalDsl.g:3121:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__Rule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2"


    // $ANTLR start "rule__Rule__Group__2__Impl"
    // InternalDsl.g:3128:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__Group_2__0 )? ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3132:1: ( ( ( rule__Rule__Group_2__0 )? ) )
            // InternalDsl.g:3133:1: ( ( rule__Rule__Group_2__0 )? )
            {
            // InternalDsl.g:3133:1: ( ( rule__Rule__Group_2__0 )? )
            // InternalDsl.g:3134:2: ( rule__Rule__Group_2__0 )?
            {
             before(grammarAccess.getRuleAccess().getGroup_2()); 
            // InternalDsl.g:3135:2: ( rule__Rule__Group_2__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==46) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalDsl.g:3135:3: rule__Rule__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rule__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group__3"
    // InternalDsl.g:3143:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3147:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // InternalDsl.g:3148:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__Rule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3"


    // $ANTLR start "rule__Rule__Group__3__Impl"
    // InternalDsl.g:3155:1: rule__Rule__Group__3__Impl : ( ( rule__Rule__Group_3__0 )? ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3159:1: ( ( ( rule__Rule__Group_3__0 )? ) )
            // InternalDsl.g:3160:1: ( ( rule__Rule__Group_3__0 )? )
            {
            // InternalDsl.g:3160:1: ( ( rule__Rule__Group_3__0 )? )
            // InternalDsl.g:3161:2: ( rule__Rule__Group_3__0 )?
            {
             before(grammarAccess.getRuleAccess().getGroup_3()); 
            // InternalDsl.g:3162:2: ( rule__Rule__Group_3__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=13 && LA26_0<=14)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalDsl.g:3162:3: rule__Rule__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rule__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3__Impl"


    // $ANTLR start "rule__Rule__Group__4"
    // InternalDsl.g:3170:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3174:1: ( rule__Rule__Group__4__Impl )
            // InternalDsl.g:3175:2: rule__Rule__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__4"


    // $ANTLR start "rule__Rule__Group__4__Impl"
    // InternalDsl.g:3181:1: rule__Rule__Group__4__Impl : ( '}' ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3185:1: ( ( '}' ) )
            // InternalDsl.g:3186:1: ( '}' )
            {
            // InternalDsl.g:3186:1: ( '}' )
            // InternalDsl.g:3187:2: '}'
            {
             before(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__4__Impl"


    // $ANTLR start "rule__Rule__Group_2__0"
    // InternalDsl.g:3197:1: rule__Rule__Group_2__0 : rule__Rule__Group_2__0__Impl rule__Rule__Group_2__1 ;
    public final void rule__Rule__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3201:1: ( rule__Rule__Group_2__0__Impl rule__Rule__Group_2__1 )
            // InternalDsl.g:3202:2: rule__Rule__Group_2__0__Impl rule__Rule__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__Rule__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_2__0"


    // $ANTLR start "rule__Rule__Group_2__0__Impl"
    // InternalDsl.g:3209:1: rule__Rule__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Rule__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3213:1: ( ( '(' ) )
            // InternalDsl.g:3214:1: ( '(' )
            {
            // InternalDsl.g:3214:1: ( '(' )
            // InternalDsl.g:3215:2: '('
            {
             before(grammarAccess.getRuleAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_2__0__Impl"


    // $ANTLR start "rule__Rule__Group_2__1"
    // InternalDsl.g:3224:1: rule__Rule__Group_2__1 : rule__Rule__Group_2__1__Impl rule__Rule__Group_2__2 ;
    public final void rule__Rule__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3228:1: ( rule__Rule__Group_2__1__Impl rule__Rule__Group_2__2 )
            // InternalDsl.g:3229:2: rule__Rule__Group_2__1__Impl rule__Rule__Group_2__2
            {
            pushFollow(FOLLOW_29);
            rule__Rule__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_2__1"


    // $ANTLR start "rule__Rule__Group_2__1__Impl"
    // InternalDsl.g:3236:1: rule__Rule__Group_2__1__Impl : ( ( rule__Rule__PredicatesAssignment_2_1 ) ) ;
    public final void rule__Rule__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3240:1: ( ( ( rule__Rule__PredicatesAssignment_2_1 ) ) )
            // InternalDsl.g:3241:1: ( ( rule__Rule__PredicatesAssignment_2_1 ) )
            {
            // InternalDsl.g:3241:1: ( ( rule__Rule__PredicatesAssignment_2_1 ) )
            // InternalDsl.g:3242:2: ( rule__Rule__PredicatesAssignment_2_1 )
            {
             before(grammarAccess.getRuleAccess().getPredicatesAssignment_2_1()); 
            // InternalDsl.g:3243:2: ( rule__Rule__PredicatesAssignment_2_1 )
            // InternalDsl.g:3243:3: rule__Rule__PredicatesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__PredicatesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getPredicatesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_2__1__Impl"


    // $ANTLR start "rule__Rule__Group_2__2"
    // InternalDsl.g:3251:1: rule__Rule__Group_2__2 : rule__Rule__Group_2__2__Impl rule__Rule__Group_2__3 ;
    public final void rule__Rule__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3255:1: ( rule__Rule__Group_2__2__Impl rule__Rule__Group_2__3 )
            // InternalDsl.g:3256:2: rule__Rule__Group_2__2__Impl rule__Rule__Group_2__3
            {
            pushFollow(FOLLOW_29);
            rule__Rule__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_2__2"


    // $ANTLR start "rule__Rule__Group_2__2__Impl"
    // InternalDsl.g:3263:1: rule__Rule__Group_2__2__Impl : ( ( rule__Rule__Group_2_2__0 )* ) ;
    public final void rule__Rule__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3267:1: ( ( ( rule__Rule__Group_2_2__0 )* ) )
            // InternalDsl.g:3268:1: ( ( rule__Rule__Group_2_2__0 )* )
            {
            // InternalDsl.g:3268:1: ( ( rule__Rule__Group_2_2__0 )* )
            // InternalDsl.g:3269:2: ( rule__Rule__Group_2_2__0 )*
            {
             before(grammarAccess.getRuleAccess().getGroup_2_2()); 
            // InternalDsl.g:3270:2: ( rule__Rule__Group_2_2__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==48) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalDsl.g:3270:3: rule__Rule__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__Rule__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getRuleAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_2__2__Impl"


    // $ANTLR start "rule__Rule__Group_2__3"
    // InternalDsl.g:3278:1: rule__Rule__Group_2__3 : rule__Rule__Group_2__3__Impl ;
    public final void rule__Rule__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3282:1: ( rule__Rule__Group_2__3__Impl )
            // InternalDsl.g:3283:2: rule__Rule__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_2__3"


    // $ANTLR start "rule__Rule__Group_2__3__Impl"
    // InternalDsl.g:3289:1: rule__Rule__Group_2__3__Impl : ( ')' ) ;
    public final void rule__Rule__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3293:1: ( ( ')' ) )
            // InternalDsl.g:3294:1: ( ')' )
            {
            // InternalDsl.g:3294:1: ( ')' )
            // InternalDsl.g:3295:2: ')'
            {
             before(grammarAccess.getRuleAccess().getRightParenthesisKeyword_2_3()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getRightParenthesisKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_2__3__Impl"


    // $ANTLR start "rule__Rule__Group_2_2__0"
    // InternalDsl.g:3305:1: rule__Rule__Group_2_2__0 : rule__Rule__Group_2_2__0__Impl rule__Rule__Group_2_2__1 ;
    public final void rule__Rule__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3309:1: ( rule__Rule__Group_2_2__0__Impl rule__Rule__Group_2_2__1 )
            // InternalDsl.g:3310:2: rule__Rule__Group_2_2__0__Impl rule__Rule__Group_2_2__1
            {
            pushFollow(FOLLOW_8);
            rule__Rule__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_2_2__0"


    // $ANTLR start "rule__Rule__Group_2_2__0__Impl"
    // InternalDsl.g:3317:1: rule__Rule__Group_2_2__0__Impl : ( 'and' ) ;
    public final void rule__Rule__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3321:1: ( ( 'and' ) )
            // InternalDsl.g:3322:1: ( 'and' )
            {
            // InternalDsl.g:3322:1: ( 'and' )
            // InternalDsl.g:3323:2: 'and'
            {
             before(grammarAccess.getRuleAccess().getAndKeyword_2_2_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getAndKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_2_2__0__Impl"


    // $ANTLR start "rule__Rule__Group_2_2__1"
    // InternalDsl.g:3332:1: rule__Rule__Group_2_2__1 : rule__Rule__Group_2_2__1__Impl ;
    public final void rule__Rule__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3336:1: ( rule__Rule__Group_2_2__1__Impl )
            // InternalDsl.g:3337:2: rule__Rule__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_2_2__1"


    // $ANTLR start "rule__Rule__Group_2_2__1__Impl"
    // InternalDsl.g:3343:1: rule__Rule__Group_2_2__1__Impl : ( ( rule__Rule__PredicatesAssignment_2_2_1 ) ) ;
    public final void rule__Rule__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3347:1: ( ( ( rule__Rule__PredicatesAssignment_2_2_1 ) ) )
            // InternalDsl.g:3348:1: ( ( rule__Rule__PredicatesAssignment_2_2_1 ) )
            {
            // InternalDsl.g:3348:1: ( ( rule__Rule__PredicatesAssignment_2_2_1 ) )
            // InternalDsl.g:3349:2: ( rule__Rule__PredicatesAssignment_2_2_1 )
            {
             before(grammarAccess.getRuleAccess().getPredicatesAssignment_2_2_1()); 
            // InternalDsl.g:3350:2: ( rule__Rule__PredicatesAssignment_2_2_1 )
            // InternalDsl.g:3350:3: rule__Rule__PredicatesAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__PredicatesAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getPredicatesAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_2_2__1__Impl"


    // $ANTLR start "rule__Rule__Group_3__0"
    // InternalDsl.g:3359:1: rule__Rule__Group_3__0 : rule__Rule__Group_3__0__Impl rule__Rule__Group_3__1 ;
    public final void rule__Rule__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3363:1: ( rule__Rule__Group_3__0__Impl rule__Rule__Group_3__1 )
            // InternalDsl.g:3364:2: rule__Rule__Group_3__0__Impl rule__Rule__Group_3__1
            {
            pushFollow(FOLLOW_27);
            rule__Rule__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_3__0"


    // $ANTLR start "rule__Rule__Group_3__0__Impl"
    // InternalDsl.g:3371:1: rule__Rule__Group_3__0__Impl : ( ( rule__Rule__Alternatives_3_0 ) ) ;
    public final void rule__Rule__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3375:1: ( ( ( rule__Rule__Alternatives_3_0 ) ) )
            // InternalDsl.g:3376:1: ( ( rule__Rule__Alternatives_3_0 ) )
            {
            // InternalDsl.g:3376:1: ( ( rule__Rule__Alternatives_3_0 ) )
            // InternalDsl.g:3377:2: ( rule__Rule__Alternatives_3_0 )
            {
             before(grammarAccess.getRuleAccess().getAlternatives_3_0()); 
            // InternalDsl.g:3378:2: ( rule__Rule__Alternatives_3_0 )
            // InternalDsl.g:3378:3: rule__Rule__Alternatives_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Alternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getAlternatives_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_3__0__Impl"


    // $ANTLR start "rule__Rule__Group_3__1"
    // InternalDsl.g:3386:1: rule__Rule__Group_3__1 : rule__Rule__Group_3__1__Impl ;
    public final void rule__Rule__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3390:1: ( rule__Rule__Group_3__1__Impl )
            // InternalDsl.g:3391:2: rule__Rule__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_3__1"


    // $ANTLR start "rule__Rule__Group_3__1__Impl"
    // InternalDsl.g:3397:1: rule__Rule__Group_3__1__Impl : ( ( rule__Rule__DurationAssignment_3_1 ) ) ;
    public final void rule__Rule__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3401:1: ( ( ( rule__Rule__DurationAssignment_3_1 ) ) )
            // InternalDsl.g:3402:1: ( ( rule__Rule__DurationAssignment_3_1 ) )
            {
            // InternalDsl.g:3402:1: ( ( rule__Rule__DurationAssignment_3_1 ) )
            // InternalDsl.g:3403:2: ( rule__Rule__DurationAssignment_3_1 )
            {
             before(grammarAccess.getRuleAccess().getDurationAssignment_3_1()); 
            // InternalDsl.g:3404:2: ( rule__Rule__DurationAssignment_3_1 )
            // InternalDsl.g:3404:3: rule__Rule__DurationAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__DurationAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getDurationAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_3__1__Impl"


    // $ANTLR start "rule__Duration__Group__0"
    // InternalDsl.g:3413:1: rule__Duration__Group__0 : rule__Duration__Group__0__Impl rule__Duration__Group__1 ;
    public final void rule__Duration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3417:1: ( rule__Duration__Group__0__Impl rule__Duration__Group__1 )
            // InternalDsl.g:3418:2: rule__Duration__Group__0__Impl rule__Duration__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__Duration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Duration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duration__Group__0"


    // $ANTLR start "rule__Duration__Group__0__Impl"
    // InternalDsl.g:3425:1: rule__Duration__Group__0__Impl : ( () ) ;
    public final void rule__Duration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3429:1: ( ( () ) )
            // InternalDsl.g:3430:1: ( () )
            {
            // InternalDsl.g:3430:1: ( () )
            // InternalDsl.g:3431:2: ()
            {
             before(grammarAccess.getDurationAccess().getDurationAction_0()); 
            // InternalDsl.g:3432:2: ()
            // InternalDsl.g:3432:3: 
            {
            }

             after(grammarAccess.getDurationAccess().getDurationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duration__Group__0__Impl"


    // $ANTLR start "rule__Duration__Group__1"
    // InternalDsl.g:3440:1: rule__Duration__Group__1 : rule__Duration__Group__1__Impl rule__Duration__Group__2 ;
    public final void rule__Duration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3444:1: ( rule__Duration__Group__1__Impl rule__Duration__Group__2 )
            // InternalDsl.g:3445:2: rule__Duration__Group__1__Impl rule__Duration__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__Duration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Duration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duration__Group__1"


    // $ANTLR start "rule__Duration__Group__1__Impl"
    // InternalDsl.g:3452:1: rule__Duration__Group__1__Impl : ( ( rule__Duration__TimeAssignment_1 ) ) ;
    public final void rule__Duration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3456:1: ( ( ( rule__Duration__TimeAssignment_1 ) ) )
            // InternalDsl.g:3457:1: ( ( rule__Duration__TimeAssignment_1 ) )
            {
            // InternalDsl.g:3457:1: ( ( rule__Duration__TimeAssignment_1 ) )
            // InternalDsl.g:3458:2: ( rule__Duration__TimeAssignment_1 )
            {
             before(grammarAccess.getDurationAccess().getTimeAssignment_1()); 
            // InternalDsl.g:3459:2: ( rule__Duration__TimeAssignment_1 )
            // InternalDsl.g:3459:3: rule__Duration__TimeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Duration__TimeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDurationAccess().getTimeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duration__Group__1__Impl"


    // $ANTLR start "rule__Duration__Group__2"
    // InternalDsl.g:3467:1: rule__Duration__Group__2 : rule__Duration__Group__2__Impl ;
    public final void rule__Duration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3471:1: ( rule__Duration__Group__2__Impl )
            // InternalDsl.g:3472:2: rule__Duration__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Duration__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duration__Group__2"


    // $ANTLR start "rule__Duration__Group__2__Impl"
    // InternalDsl.g:3478:1: rule__Duration__Group__2__Impl : ( ( rule__Duration__PrecisionAssignment_2 ) ) ;
    public final void rule__Duration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3482:1: ( ( ( rule__Duration__PrecisionAssignment_2 ) ) )
            // InternalDsl.g:3483:1: ( ( rule__Duration__PrecisionAssignment_2 ) )
            {
            // InternalDsl.g:3483:1: ( ( rule__Duration__PrecisionAssignment_2 ) )
            // InternalDsl.g:3484:2: ( rule__Duration__PrecisionAssignment_2 )
            {
             before(grammarAccess.getDurationAccess().getPrecisionAssignment_2()); 
            // InternalDsl.g:3485:2: ( rule__Duration__PrecisionAssignment_2 )
            // InternalDsl.g:3485:3: rule__Duration__PrecisionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Duration__PrecisionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDurationAccess().getPrecisionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duration__Group__2__Impl"


    // $ANTLR start "rule__SensorPredicate__Group__0"
    // InternalDsl.g:3494:1: rule__SensorPredicate__Group__0 : rule__SensorPredicate__Group__0__Impl rule__SensorPredicate__Group__1 ;
    public final void rule__SensorPredicate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3498:1: ( rule__SensorPredicate__Group__0__Impl rule__SensorPredicate__Group__1 )
            // InternalDsl.g:3499:2: rule__SensorPredicate__Group__0__Impl rule__SensorPredicate__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__SensorPredicate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorPredicate__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorPredicate__Group__0"


    // $ANTLR start "rule__SensorPredicate__Group__0__Impl"
    // InternalDsl.g:3506:1: rule__SensorPredicate__Group__0__Impl : ( () ) ;
    public final void rule__SensorPredicate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3510:1: ( ( () ) )
            // InternalDsl.g:3511:1: ( () )
            {
            // InternalDsl.g:3511:1: ( () )
            // InternalDsl.g:3512:2: ()
            {
             before(grammarAccess.getSensorPredicateAccess().getSensorPredicateAction_0()); 
            // InternalDsl.g:3513:2: ()
            // InternalDsl.g:3513:3: 
            {
            }

             after(grammarAccess.getSensorPredicateAccess().getSensorPredicateAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorPredicate__Group__0__Impl"


    // $ANTLR start "rule__SensorPredicate__Group__1"
    // InternalDsl.g:3521:1: rule__SensorPredicate__Group__1 : rule__SensorPredicate__Group__1__Impl rule__SensorPredicate__Group__2 ;
    public final void rule__SensorPredicate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3525:1: ( rule__SensorPredicate__Group__1__Impl rule__SensorPredicate__Group__2 )
            // InternalDsl.g:3526:2: rule__SensorPredicate__Group__1__Impl rule__SensorPredicate__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__SensorPredicate__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorPredicate__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorPredicate__Group__1"


    // $ANTLR start "rule__SensorPredicate__Group__1__Impl"
    // InternalDsl.g:3533:1: rule__SensorPredicate__Group__1__Impl : ( ( rule__SensorPredicate__SensorAssignment_1 ) ) ;
    public final void rule__SensorPredicate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3537:1: ( ( ( rule__SensorPredicate__SensorAssignment_1 ) ) )
            // InternalDsl.g:3538:1: ( ( rule__SensorPredicate__SensorAssignment_1 ) )
            {
            // InternalDsl.g:3538:1: ( ( rule__SensorPredicate__SensorAssignment_1 ) )
            // InternalDsl.g:3539:2: ( rule__SensorPredicate__SensorAssignment_1 )
            {
             before(grammarAccess.getSensorPredicateAccess().getSensorAssignment_1()); 
            // InternalDsl.g:3540:2: ( rule__SensorPredicate__SensorAssignment_1 )
            // InternalDsl.g:3540:3: rule__SensorPredicate__SensorAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SensorPredicate__SensorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSensorPredicateAccess().getSensorAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorPredicate__Group__1__Impl"


    // $ANTLR start "rule__SensorPredicate__Group__2"
    // InternalDsl.g:3548:1: rule__SensorPredicate__Group__2 : rule__SensorPredicate__Group__2__Impl rule__SensorPredicate__Group__3 ;
    public final void rule__SensorPredicate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3552:1: ( rule__SensorPredicate__Group__2__Impl rule__SensorPredicate__Group__3 )
            // InternalDsl.g:3553:2: rule__SensorPredicate__Group__2__Impl rule__SensorPredicate__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__SensorPredicate__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorPredicate__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorPredicate__Group__2"


    // $ANTLR start "rule__SensorPredicate__Group__2__Impl"
    // InternalDsl.g:3560:1: rule__SensorPredicate__Group__2__Impl : ( ( rule__SensorPredicate__OperatorAssignment_2 ) ) ;
    public final void rule__SensorPredicate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3564:1: ( ( ( rule__SensorPredicate__OperatorAssignment_2 ) ) )
            // InternalDsl.g:3565:1: ( ( rule__SensorPredicate__OperatorAssignment_2 ) )
            {
            // InternalDsl.g:3565:1: ( ( rule__SensorPredicate__OperatorAssignment_2 ) )
            // InternalDsl.g:3566:2: ( rule__SensorPredicate__OperatorAssignment_2 )
            {
             before(grammarAccess.getSensorPredicateAccess().getOperatorAssignment_2()); 
            // InternalDsl.g:3567:2: ( rule__SensorPredicate__OperatorAssignment_2 )
            // InternalDsl.g:3567:3: rule__SensorPredicate__OperatorAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SensorPredicate__OperatorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSensorPredicateAccess().getOperatorAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorPredicate__Group__2__Impl"


    // $ANTLR start "rule__SensorPredicate__Group__3"
    // InternalDsl.g:3575:1: rule__SensorPredicate__Group__3 : rule__SensorPredicate__Group__3__Impl ;
    public final void rule__SensorPredicate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3579:1: ( rule__SensorPredicate__Group__3__Impl )
            // InternalDsl.g:3580:2: rule__SensorPredicate__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SensorPredicate__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorPredicate__Group__3"


    // $ANTLR start "rule__SensorPredicate__Group__3__Impl"
    // InternalDsl.g:3586:1: rule__SensorPredicate__Group__3__Impl : ( ( rule__SensorPredicate__ValueAssignment_3 ) ) ;
    public final void rule__SensorPredicate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3590:1: ( ( ( rule__SensorPredicate__ValueAssignment_3 ) ) )
            // InternalDsl.g:3591:1: ( ( rule__SensorPredicate__ValueAssignment_3 ) )
            {
            // InternalDsl.g:3591:1: ( ( rule__SensorPredicate__ValueAssignment_3 ) )
            // InternalDsl.g:3592:2: ( rule__SensorPredicate__ValueAssignment_3 )
            {
             before(grammarAccess.getSensorPredicateAccess().getValueAssignment_3()); 
            // InternalDsl.g:3593:2: ( rule__SensorPredicate__ValueAssignment_3 )
            // InternalDsl.g:3593:3: rule__SensorPredicate__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SensorPredicate__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSensorPredicateAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorPredicate__Group__3__Impl"


    // $ANTLR start "rule__PersonPredicate__Group__0"
    // InternalDsl.g:3602:1: rule__PersonPredicate__Group__0 : rule__PersonPredicate__Group__0__Impl rule__PersonPredicate__Group__1 ;
    public final void rule__PersonPredicate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3606:1: ( rule__PersonPredicate__Group__0__Impl rule__PersonPredicate__Group__1 )
            // InternalDsl.g:3607:2: rule__PersonPredicate__Group__0__Impl rule__PersonPredicate__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__PersonPredicate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PersonPredicate__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PersonPredicate__Group__0"


    // $ANTLR start "rule__PersonPredicate__Group__0__Impl"
    // InternalDsl.g:3614:1: rule__PersonPredicate__Group__0__Impl : ( () ) ;
    public final void rule__PersonPredicate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3618:1: ( ( () ) )
            // InternalDsl.g:3619:1: ( () )
            {
            // InternalDsl.g:3619:1: ( () )
            // InternalDsl.g:3620:2: ()
            {
             before(grammarAccess.getPersonPredicateAccess().getPersonPredicateAction_0()); 
            // InternalDsl.g:3621:2: ()
            // InternalDsl.g:3621:3: 
            {
            }

             after(grammarAccess.getPersonPredicateAccess().getPersonPredicateAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PersonPredicate__Group__0__Impl"


    // $ANTLR start "rule__PersonPredicate__Group__1"
    // InternalDsl.g:3629:1: rule__PersonPredicate__Group__1 : rule__PersonPredicate__Group__1__Impl rule__PersonPredicate__Group__2 ;
    public final void rule__PersonPredicate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3633:1: ( rule__PersonPredicate__Group__1__Impl rule__PersonPredicate__Group__2 )
            // InternalDsl.g:3634:2: rule__PersonPredicate__Group__1__Impl rule__PersonPredicate__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__PersonPredicate__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PersonPredicate__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PersonPredicate__Group__1"


    // $ANTLR start "rule__PersonPredicate__Group__1__Impl"
    // InternalDsl.g:3641:1: rule__PersonPredicate__Group__1__Impl : ( ( rule__PersonPredicate__PersonAssignment_1 ) ) ;
    public final void rule__PersonPredicate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3645:1: ( ( ( rule__PersonPredicate__PersonAssignment_1 ) ) )
            // InternalDsl.g:3646:1: ( ( rule__PersonPredicate__PersonAssignment_1 ) )
            {
            // InternalDsl.g:3646:1: ( ( rule__PersonPredicate__PersonAssignment_1 ) )
            // InternalDsl.g:3647:2: ( rule__PersonPredicate__PersonAssignment_1 )
            {
             before(grammarAccess.getPersonPredicateAccess().getPersonAssignment_1()); 
            // InternalDsl.g:3648:2: ( rule__PersonPredicate__PersonAssignment_1 )
            // InternalDsl.g:3648:3: rule__PersonPredicate__PersonAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PersonPredicate__PersonAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPersonPredicateAccess().getPersonAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PersonPredicate__Group__1__Impl"


    // $ANTLR start "rule__PersonPredicate__Group__2"
    // InternalDsl.g:3656:1: rule__PersonPredicate__Group__2 : rule__PersonPredicate__Group__2__Impl rule__PersonPredicate__Group__3 ;
    public final void rule__PersonPredicate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3660:1: ( rule__PersonPredicate__Group__2__Impl rule__PersonPredicate__Group__3 )
            // InternalDsl.g:3661:2: rule__PersonPredicate__Group__2__Impl rule__PersonPredicate__Group__3
            {
            pushFollow(FOLLOW_35);
            rule__PersonPredicate__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PersonPredicate__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PersonPredicate__Group__2"


    // $ANTLR start "rule__PersonPredicate__Group__2__Impl"
    // InternalDsl.g:3668:1: rule__PersonPredicate__Group__2__Impl : ( 'is' ) ;
    public final void rule__PersonPredicate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3672:1: ( ( 'is' ) )
            // InternalDsl.g:3673:1: ( 'is' )
            {
            // InternalDsl.g:3673:1: ( 'is' )
            // InternalDsl.g:3674:2: 'is'
            {
             before(grammarAccess.getPersonPredicateAccess().getIsKeyword_2()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getPersonPredicateAccess().getIsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PersonPredicate__Group__2__Impl"


    // $ANTLR start "rule__PersonPredicate__Group__3"
    // InternalDsl.g:3683:1: rule__PersonPredicate__Group__3 : rule__PersonPredicate__Group__3__Impl ;
    public final void rule__PersonPredicate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3687:1: ( rule__PersonPredicate__Group__3__Impl )
            // InternalDsl.g:3688:2: rule__PersonPredicate__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PersonPredicate__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PersonPredicate__Group__3"


    // $ANTLR start "rule__PersonPredicate__Group__3__Impl"
    // InternalDsl.g:3694:1: rule__PersonPredicate__Group__3__Impl : ( ( rule__PersonPredicate__ActivityAssignment_3 ) ) ;
    public final void rule__PersonPredicate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3698:1: ( ( ( rule__PersonPredicate__ActivityAssignment_3 ) ) )
            // InternalDsl.g:3699:1: ( ( rule__PersonPredicate__ActivityAssignment_3 ) )
            {
            // InternalDsl.g:3699:1: ( ( rule__PersonPredicate__ActivityAssignment_3 ) )
            // InternalDsl.g:3700:2: ( rule__PersonPredicate__ActivityAssignment_3 )
            {
             before(grammarAccess.getPersonPredicateAccess().getActivityAssignment_3()); 
            // InternalDsl.g:3701:2: ( rule__PersonPredicate__ActivityAssignment_3 )
            // InternalDsl.g:3701:3: rule__PersonPredicate__ActivityAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__PersonPredicate__ActivityAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPersonPredicateAccess().getActivityAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PersonPredicate__Group__3__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalDsl.g:3710:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3714:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalDsl.g:3715:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalDsl.g:3722:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3726:1: ( ( ( '-' )? ) )
            // InternalDsl.g:3727:1: ( ( '-' )? )
            {
            // InternalDsl.g:3727:1: ( ( '-' )? )
            // InternalDsl.g:3728:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalDsl.g:3729:2: ( '-' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==44) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalDsl.g:3729:3: '-'
                    {
                    match(input,44,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalDsl.g:3737:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3741:1: ( rule__EInt__Group__1__Impl )
            // InternalDsl.g:3742:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalDsl.g:3748:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3752:1: ( ( RULE_INT ) )
            // InternalDsl.g:3753:1: ( RULE_INT )
            {
            // InternalDsl.g:3753:1: ( RULE_INT )
            // InternalDsl.g:3754:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__Home__FileEventsAssignment_3_1"
    // InternalDsl.g:3764:1: rule__Home__FileEventsAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Home__FileEventsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3768:1: ( ( ruleEString ) )
            // InternalDsl.g:3769:2: ( ruleEString )
            {
            // InternalDsl.g:3769:2: ( ruleEString )
            // InternalDsl.g:3770:3: ruleEString
            {
             before(grammarAccess.getHomeAccess().getFileEventsEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getHomeAccess().getFileEventsEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__FileEventsAssignment_3_1"


    // $ANTLR start "rule__Home__RoomsAssignment_4_2"
    // InternalDsl.g:3779:1: rule__Home__RoomsAssignment_4_2 : ( ruleRoom ) ;
    public final void rule__Home__RoomsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3783:1: ( ( ruleRoom ) )
            // InternalDsl.g:3784:2: ( ruleRoom )
            {
            // InternalDsl.g:3784:2: ( ruleRoom )
            // InternalDsl.g:3785:3: ruleRoom
            {
             before(grammarAccess.getHomeAccess().getRoomsRoomParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRoom();

            state._fsp--;

             after(grammarAccess.getHomeAccess().getRoomsRoomParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__RoomsAssignment_4_2"


    // $ANTLR start "rule__Home__RoomsAssignment_4_3_1"
    // InternalDsl.g:3794:1: rule__Home__RoomsAssignment_4_3_1 : ( ruleRoom ) ;
    public final void rule__Home__RoomsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3798:1: ( ( ruleRoom ) )
            // InternalDsl.g:3799:2: ( ruleRoom )
            {
            // InternalDsl.g:3799:2: ( ruleRoom )
            // InternalDsl.g:3800:3: ruleRoom
            {
             before(grammarAccess.getHomeAccess().getRoomsRoomParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRoom();

            state._fsp--;

             after(grammarAccess.getHomeAccess().getRoomsRoomParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__RoomsAssignment_4_3_1"


    // $ANTLR start "rule__Home__PersonsAssignment_5_2"
    // InternalDsl.g:3809:1: rule__Home__PersonsAssignment_5_2 : ( rulePerson ) ;
    public final void rule__Home__PersonsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3813:1: ( ( rulePerson ) )
            // InternalDsl.g:3814:2: ( rulePerson )
            {
            // InternalDsl.g:3814:2: ( rulePerson )
            // InternalDsl.g:3815:3: rulePerson
            {
             before(grammarAccess.getHomeAccess().getPersonsPersonParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getHomeAccess().getPersonsPersonParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__PersonsAssignment_5_2"


    // $ANTLR start "rule__Home__PersonsAssignment_5_3_1"
    // InternalDsl.g:3824:1: rule__Home__PersonsAssignment_5_3_1 : ( rulePerson ) ;
    public final void rule__Home__PersonsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3828:1: ( ( rulePerson ) )
            // InternalDsl.g:3829:2: ( rulePerson )
            {
            // InternalDsl.g:3829:2: ( rulePerson )
            // InternalDsl.g:3830:3: rulePerson
            {
             before(grammarAccess.getHomeAccess().getPersonsPersonParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getHomeAccess().getPersonsPersonParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__PersonsAssignment_5_3_1"


    // $ANTLR start "rule__Home__PatternsAssignment_6_2"
    // InternalDsl.g:3839:1: rule__Home__PatternsAssignment_6_2 : ( rulePattern ) ;
    public final void rule__Home__PatternsAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3843:1: ( ( rulePattern ) )
            // InternalDsl.g:3844:2: ( rulePattern )
            {
            // InternalDsl.g:3844:2: ( rulePattern )
            // InternalDsl.g:3845:3: rulePattern
            {
             before(grammarAccess.getHomeAccess().getPatternsPatternParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            rulePattern();

            state._fsp--;

             after(grammarAccess.getHomeAccess().getPatternsPatternParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__PatternsAssignment_6_2"


    // $ANTLR start "rule__Home__PatternsAssignment_6_3_1"
    // InternalDsl.g:3854:1: rule__Home__PatternsAssignment_6_3_1 : ( rulePattern ) ;
    public final void rule__Home__PatternsAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3858:1: ( ( rulePattern ) )
            // InternalDsl.g:3859:2: ( rulePattern )
            {
            // InternalDsl.g:3859:2: ( rulePattern )
            // InternalDsl.g:3860:3: rulePattern
            {
             before(grammarAccess.getHomeAccess().getPatternsPatternParserRuleCall_6_3_1_0()); 
            pushFollow(FOLLOW_2);
            rulePattern();

            state._fsp--;

             after(grammarAccess.getHomeAccess().getPatternsPatternParserRuleCall_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__PatternsAssignment_6_3_1"


    // $ANTLR start "rule__Home__MonitoredEntitiesAssignment_7_1"
    // InternalDsl.g:3869:1: rule__Home__MonitoredEntitiesAssignment_7_1 : ( ( ruleEString ) ) ;
    public final void rule__Home__MonitoredEntitiesAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3873:1: ( ( ( ruleEString ) ) )
            // InternalDsl.g:3874:2: ( ( ruleEString ) )
            {
            // InternalDsl.g:3874:2: ( ( ruleEString ) )
            // InternalDsl.g:3875:3: ( ruleEString )
            {
             before(grammarAccess.getHomeAccess().getMonitoredEntitiesNamedEntityCrossReference_7_1_0()); 
            // InternalDsl.g:3876:3: ( ruleEString )
            // InternalDsl.g:3877:4: ruleEString
            {
             before(grammarAccess.getHomeAccess().getMonitoredEntitiesNamedEntityEStringParserRuleCall_7_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getHomeAccess().getMonitoredEntitiesNamedEntityEStringParserRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getHomeAccess().getMonitoredEntitiesNamedEntityCrossReference_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__MonitoredEntitiesAssignment_7_1"


    // $ANTLR start "rule__Home__MonitoredEntitiesAssignment_7_2_1"
    // InternalDsl.g:3888:1: rule__Home__MonitoredEntitiesAssignment_7_2_1 : ( ( ruleEString ) ) ;
    public final void rule__Home__MonitoredEntitiesAssignment_7_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3892:1: ( ( ( ruleEString ) ) )
            // InternalDsl.g:3893:2: ( ( ruleEString ) )
            {
            // InternalDsl.g:3893:2: ( ( ruleEString ) )
            // InternalDsl.g:3894:3: ( ruleEString )
            {
             before(grammarAccess.getHomeAccess().getMonitoredEntitiesNamedEntityCrossReference_7_2_1_0()); 
            // InternalDsl.g:3895:3: ( ruleEString )
            // InternalDsl.g:3896:4: ruleEString
            {
             before(grammarAccess.getHomeAccess().getMonitoredEntitiesNamedEntityEStringParserRuleCall_7_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getHomeAccess().getMonitoredEntitiesNamedEntityEStringParserRuleCall_7_2_1_0_1()); 

            }

             after(grammarAccess.getHomeAccess().getMonitoredEntitiesNamedEntityCrossReference_7_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__MonitoredEntitiesAssignment_7_2_1"


    // $ANTLR start "rule__Room__NameAssignment_2"
    // InternalDsl.g:3907:1: rule__Room__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Room__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3911:1: ( ( ruleEString ) )
            // InternalDsl.g:3912:2: ( ruleEString )
            {
            // InternalDsl.g:3912:2: ( ruleEString )
            // InternalDsl.g:3913:3: ruleEString
            {
             before(grammarAccess.getRoomAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRoomAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__NameAssignment_2"


    // $ANTLR start "rule__Room__SensorsAssignment_4_0"
    // InternalDsl.g:3922:1: rule__Room__SensorsAssignment_4_0 : ( ruleSensor ) ;
    public final void rule__Room__SensorsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3926:1: ( ( ruleSensor ) )
            // InternalDsl.g:3927:2: ( ruleSensor )
            {
            // InternalDsl.g:3927:2: ( ruleSensor )
            // InternalDsl.g:3928:3: ruleSensor
            {
             before(grammarAccess.getRoomAccess().getSensorsSensorParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSensor();

            state._fsp--;

             after(grammarAccess.getRoomAccess().getSensorsSensorParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__SensorsAssignment_4_0"


    // $ANTLR start "rule__Room__SensorsAssignment_4_1_1"
    // InternalDsl.g:3937:1: rule__Room__SensorsAssignment_4_1_1 : ( ruleSensor ) ;
    public final void rule__Room__SensorsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3941:1: ( ( ruleSensor ) )
            // InternalDsl.g:3942:2: ( ruleSensor )
            {
            // InternalDsl.g:3942:2: ( ruleSensor )
            // InternalDsl.g:3943:3: ruleSensor
            {
             before(grammarAccess.getRoomAccess().getSensorsSensorParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSensor();

            state._fsp--;

             after(grammarAccess.getRoomAccess().getSensorsSensorParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__SensorsAssignment_4_1_1"


    // $ANTLR start "rule__Person__NameAssignment_2"
    // InternalDsl.g:3952:1: rule__Person__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Person__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3956:1: ( ( ruleEString ) )
            // InternalDsl.g:3957:2: ( ruleEString )
            {
            // InternalDsl.g:3957:2: ( ruleEString )
            // InternalDsl.g:3958:3: ruleEString
            {
             before(grammarAccess.getPersonAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPersonAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__NameAssignment_2"


    // $ANTLR start "rule__Person__AnkleLeftAssignment_5"
    // InternalDsl.g:3967:1: rule__Person__AnkleLeftAssignment_5 : ( ruleTag ) ;
    public final void rule__Person__AnkleLeftAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3971:1: ( ( ruleTag ) )
            // InternalDsl.g:3972:2: ( ruleTag )
            {
            // InternalDsl.g:3972:2: ( ruleTag )
            // InternalDsl.g:3973:3: ruleTag
            {
             before(grammarAccess.getPersonAccess().getAnkleLeftTagParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleTag();

            state._fsp--;

             after(grammarAccess.getPersonAccess().getAnkleLeftTagParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__AnkleLeftAssignment_5"


    // $ANTLR start "rule__Person__AnkleRightAssignment_7"
    // InternalDsl.g:3982:1: rule__Person__AnkleRightAssignment_7 : ( ruleTag ) ;
    public final void rule__Person__AnkleRightAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3986:1: ( ( ruleTag ) )
            // InternalDsl.g:3987:2: ( ruleTag )
            {
            // InternalDsl.g:3987:2: ( ruleTag )
            // InternalDsl.g:3988:3: ruleTag
            {
             before(grammarAccess.getPersonAccess().getAnkleRightTagParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleTag();

            state._fsp--;

             after(grammarAccess.getPersonAccess().getAnkleRightTagParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__AnkleRightAssignment_7"


    // $ANTLR start "rule__Person__BeltAssignment_9"
    // InternalDsl.g:3997:1: rule__Person__BeltAssignment_9 : ( ruleTag ) ;
    public final void rule__Person__BeltAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4001:1: ( ( ruleTag ) )
            // InternalDsl.g:4002:2: ( ruleTag )
            {
            // InternalDsl.g:4002:2: ( ruleTag )
            // InternalDsl.g:4003:3: ruleTag
            {
             before(grammarAccess.getPersonAccess().getBeltTagParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleTag();

            state._fsp--;

             after(grammarAccess.getPersonAccess().getBeltTagParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__BeltAssignment_9"


    // $ANTLR start "rule__Person__ChestAssignment_11"
    // InternalDsl.g:4012:1: rule__Person__ChestAssignment_11 : ( ruleTag ) ;
    public final void rule__Person__ChestAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4016:1: ( ( ruleTag ) )
            // InternalDsl.g:4017:2: ( ruleTag )
            {
            // InternalDsl.g:4017:2: ( ruleTag )
            // InternalDsl.g:4018:3: ruleTag
            {
             before(grammarAccess.getPersonAccess().getChestTagParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleTag();

            state._fsp--;

             after(grammarAccess.getPersonAccess().getChestTagParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__ChestAssignment_11"


    // $ANTLR start "rule__Tag__NameAssignment_2"
    // InternalDsl.g:4027:1: rule__Tag__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Tag__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4031:1: ( ( ruleEString ) )
            // InternalDsl.g:4032:2: ( ruleEString )
            {
            // InternalDsl.g:4032:2: ( ruleEString )
            // InternalDsl.g:4033:3: ruleEString
            {
             before(grammarAccess.getTagAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTagAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__NameAssignment_2"


    // $ANTLR start "rule__Pattern__NameAssignment_2"
    // InternalDsl.g:4042:1: rule__Pattern__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Pattern__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4046:1: ( ( ruleEString ) )
            // InternalDsl.g:4047:2: ( ruleEString )
            {
            // InternalDsl.g:4047:2: ( ruleEString )
            // InternalDsl.g:4048:3: ruleEString
            {
             before(grammarAccess.getPatternAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPatternAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__NameAssignment_2"


    // $ANTLR start "rule__Pattern__RulesAssignment_4_0"
    // InternalDsl.g:4057:1: rule__Pattern__RulesAssignment_4_0 : ( ruleRule ) ;
    public final void rule__Pattern__RulesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4061:1: ( ( ruleRule ) )
            // InternalDsl.g:4062:2: ( ruleRule )
            {
            // InternalDsl.g:4062:2: ( ruleRule )
            // InternalDsl.g:4063:3: ruleRule
            {
             before(grammarAccess.getPatternAccess().getRulesRuleParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getPatternAccess().getRulesRuleParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__RulesAssignment_4_0"


    // $ANTLR start "rule__Pattern__RulesAssignment_4_1_1"
    // InternalDsl.g:4072:1: rule__Pattern__RulesAssignment_4_1_1 : ( ruleRule ) ;
    public final void rule__Pattern__RulesAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4076:1: ( ( ruleRule ) )
            // InternalDsl.g:4077:2: ( ruleRule )
            {
            // InternalDsl.g:4077:2: ( ruleRule )
            // InternalDsl.g:4078:3: ruleRule
            {
             before(grammarAccess.getPatternAccess().getRulesRuleParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getPatternAccess().getRulesRuleParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__RulesAssignment_4_1_1"


    // $ANTLR start "rule__AnalogSensor__NameAssignment_2"
    // InternalDsl.g:4087:1: rule__AnalogSensor__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__AnalogSensor__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4091:1: ( ( ruleEString ) )
            // InternalDsl.g:4092:2: ( ruleEString )
            {
            // InternalDsl.g:4092:2: ( ruleEString )
            // InternalDsl.g:4093:3: ruleEString
            {
             before(grammarAccess.getAnalogSensorAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAnalogSensorAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnalogSensor__NameAssignment_2"


    // $ANTLR start "rule__DigitalSensor__NameAssignment_2"
    // InternalDsl.g:4102:1: rule__DigitalSensor__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__DigitalSensor__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4106:1: ( ( ruleEString ) )
            // InternalDsl.g:4107:2: ( ruleEString )
            {
            // InternalDsl.g:4107:2: ( ruleEString )
            // InternalDsl.g:4108:3: ruleEString
            {
             before(grammarAccess.getDigitalSensorAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDigitalSensorAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DigitalSensor__NameAssignment_2"


    // $ANTLR start "rule__Rule__PredicatesAssignment_2_1"
    // InternalDsl.g:4117:1: rule__Rule__PredicatesAssignment_2_1 : ( rulePredicate ) ;
    public final void rule__Rule__PredicatesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4121:1: ( ( rulePredicate ) )
            // InternalDsl.g:4122:2: ( rulePredicate )
            {
            // InternalDsl.g:4122:2: ( rulePredicate )
            // InternalDsl.g:4123:3: rulePredicate
            {
             before(grammarAccess.getRuleAccess().getPredicatesPredicateParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            rulePredicate();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getPredicatesPredicateParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__PredicatesAssignment_2_1"


    // $ANTLR start "rule__Rule__PredicatesAssignment_2_2_1"
    // InternalDsl.g:4132:1: rule__Rule__PredicatesAssignment_2_2_1 : ( rulePredicate ) ;
    public final void rule__Rule__PredicatesAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4136:1: ( ( rulePredicate ) )
            // InternalDsl.g:4137:2: ( rulePredicate )
            {
            // InternalDsl.g:4137:2: ( rulePredicate )
            // InternalDsl.g:4138:3: rulePredicate
            {
             before(grammarAccess.getRuleAccess().getPredicatesPredicateParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_2);
            rulePredicate();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getPredicatesPredicateParserRuleCall_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__PredicatesAssignment_2_2_1"


    // $ANTLR start "rule__Rule__DurationAssignment_3_1"
    // InternalDsl.g:4147:1: rule__Rule__DurationAssignment_3_1 : ( ruleDuration ) ;
    public final void rule__Rule__DurationAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4151:1: ( ( ruleDuration ) )
            // InternalDsl.g:4152:2: ( ruleDuration )
            {
            // InternalDsl.g:4152:2: ( ruleDuration )
            // InternalDsl.g:4153:3: ruleDuration
            {
             before(grammarAccess.getRuleAccess().getDurationDurationParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDuration();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getDurationDurationParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__DurationAssignment_3_1"


    // $ANTLR start "rule__Duration__TimeAssignment_1"
    // InternalDsl.g:4162:1: rule__Duration__TimeAssignment_1 : ( ruleEInt ) ;
    public final void rule__Duration__TimeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4166:1: ( ( ruleEInt ) )
            // InternalDsl.g:4167:2: ( ruleEInt )
            {
            // InternalDsl.g:4167:2: ( ruleEInt )
            // InternalDsl.g:4168:3: ruleEInt
            {
             before(grammarAccess.getDurationAccess().getTimeEIntParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getDurationAccess().getTimeEIntParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duration__TimeAssignment_1"


    // $ANTLR start "rule__Duration__PrecisionAssignment_2"
    // InternalDsl.g:4177:1: rule__Duration__PrecisionAssignment_2 : ( rulePrecision ) ;
    public final void rule__Duration__PrecisionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4181:1: ( ( rulePrecision ) )
            // InternalDsl.g:4182:2: ( rulePrecision )
            {
            // InternalDsl.g:4182:2: ( rulePrecision )
            // InternalDsl.g:4183:3: rulePrecision
            {
             before(grammarAccess.getDurationAccess().getPrecisionPrecisionEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrecision();

            state._fsp--;

             after(grammarAccess.getDurationAccess().getPrecisionPrecisionEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duration__PrecisionAssignment_2"


    // $ANTLR start "rule__SensorPredicate__SensorAssignment_1"
    // InternalDsl.g:4192:1: rule__SensorPredicate__SensorAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__SensorPredicate__SensorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4196:1: ( ( ( ruleEString ) ) )
            // InternalDsl.g:4197:2: ( ( ruleEString ) )
            {
            // InternalDsl.g:4197:2: ( ( ruleEString ) )
            // InternalDsl.g:4198:3: ( ruleEString )
            {
             before(grammarAccess.getSensorPredicateAccess().getSensorSensorCrossReference_1_0()); 
            // InternalDsl.g:4199:3: ( ruleEString )
            // InternalDsl.g:4200:4: ruleEString
            {
             before(grammarAccess.getSensorPredicateAccess().getSensorSensorEStringParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSensorPredicateAccess().getSensorSensorEStringParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getSensorPredicateAccess().getSensorSensorCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorPredicate__SensorAssignment_1"


    // $ANTLR start "rule__SensorPredicate__OperatorAssignment_2"
    // InternalDsl.g:4211:1: rule__SensorPredicate__OperatorAssignment_2 : ( ruleOperator ) ;
    public final void rule__SensorPredicate__OperatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4215:1: ( ( ruleOperator ) )
            // InternalDsl.g:4216:2: ( ruleOperator )
            {
            // InternalDsl.g:4216:2: ( ruleOperator )
            // InternalDsl.g:4217:3: ruleOperator
            {
             before(grammarAccess.getSensorPredicateAccess().getOperatorOperatorEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getSensorPredicateAccess().getOperatorOperatorEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorPredicate__OperatorAssignment_2"


    // $ANTLR start "rule__SensorPredicate__ValueAssignment_3"
    // InternalDsl.g:4226:1: rule__SensorPredicate__ValueAssignment_3 : ( ruleEDouble ) ;
    public final void rule__SensorPredicate__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4230:1: ( ( ruleEDouble ) )
            // InternalDsl.g:4231:2: ( ruleEDouble )
            {
            // InternalDsl.g:4231:2: ( ruleEDouble )
            // InternalDsl.g:4232:3: ruleEDouble
            {
             before(grammarAccess.getSensorPredicateAccess().getValueEDoubleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getSensorPredicateAccess().getValueEDoubleParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorPredicate__ValueAssignment_3"


    // $ANTLR start "rule__PersonPredicate__PersonAssignment_1"
    // InternalDsl.g:4241:1: rule__PersonPredicate__PersonAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__PersonPredicate__PersonAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4245:1: ( ( ( ruleEString ) ) )
            // InternalDsl.g:4246:2: ( ( ruleEString ) )
            {
            // InternalDsl.g:4246:2: ( ( ruleEString ) )
            // InternalDsl.g:4247:3: ( ruleEString )
            {
             before(grammarAccess.getPersonPredicateAccess().getPersonPersonCrossReference_1_0()); 
            // InternalDsl.g:4248:3: ( ruleEString )
            // InternalDsl.g:4249:4: ruleEString
            {
             before(grammarAccess.getPersonPredicateAccess().getPersonPersonEStringParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPersonPredicateAccess().getPersonPersonEStringParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getPersonPredicateAccess().getPersonPersonCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PersonPredicate__PersonAssignment_1"


    // $ANTLR start "rule__PersonPredicate__ActivityAssignment_3"
    // InternalDsl.g:4260:1: rule__PersonPredicate__ActivityAssignment_3 : ( ruleActivity ) ;
    public final void rule__PersonPredicate__ActivityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4264:1: ( ( ruleActivity ) )
            // InternalDsl.g:4265:2: ( ruleActivity )
            {
            // InternalDsl.g:4265:2: ( ruleActivity )
            // InternalDsl.g:4266:3: ruleActivity
            {
             before(grammarAccess.getPersonPredicateAccess().getActivityActivityEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleActivity();

            state._fsp--;

             after(grammarAccess.getPersonPredicateAccess().getActivityActivityEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PersonPredicate__ActivityAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000003A4000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000048000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000C0008000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000200000000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000100000000040L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000400008006000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000300000000040L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00000000001C0000L});

}