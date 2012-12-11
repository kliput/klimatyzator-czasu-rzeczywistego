/*********************************************************************
	Rhapsody	: 8.0
	Login		: Piotrek
	Component	: DefaultComponent
	Configuration 	: gui
	Model Element	: OdbiornikIRDA
//!	Generated Date	: Tue, 11, Dec 2012 
	File Path	: DefaultComponent/gui/Default/OdbiornikIRDA.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.oxf.*;
//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.states.*;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/OdbiornikIRDA.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class OdbiornikIRDA 
public class OdbiornikIRDA implements RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassOdbiornikIRDA = new AnimClass("Default.OdbiornikIRDA",false);
    //#]
    
    public Reactive reactive;		//## ignore 
    
    protected OdbiornikIRDA.odbiornik_C odbiornik;		//## ignore 
    
    protected String jaki_przycisk;		//## attribute jaki_przycisk 
    
    protected Klimatyzator klimatyzator;		//## attribute klimatyzator 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int start=1;
    public static final int odebrano_sygnal=2;
    public static final int nieznany_przycisk=3;
    public static final int chciana_temp_inc=4;
    public static final int chciana_temp_dec=5;
    public static final int accepteventaction_1=6;
    //#]
    protected int rootState_subState;		//## ignore 
    
    protected int rootState_active;		//## ignore 
    
    
    //## statechart_method 
    public RiJThread getThread() {
        return reactive.getThread();
    }
    
    //## statechart_method 
    public void schedTimeout(long delay, long tmID, RiJStateReactive reactive) {
        getThread().schedTimeout(delay, tmID, reactive);
    }
    
    //## statechart_method 
    public void unschedTimeout(long tmID, RiJStateReactive reactive) {
        getThread().unschedTimeout(tmID, reactive);
    }
    
    //## statechart_method 
    public boolean isIn(int state) {
        return reactive.isIn(state);
    }
    
    //## statechart_method 
    public boolean isPort(Object port) {
        return reactive.isPort(port);
    }
    
    //## statechart_method 
    public boolean isCompleted(int state) {
        return reactive.isCompleted(state);
    }
    
    //## statechart_method 
    public RiJEventConsumer getEventConsumer() {
        return (RiJEventConsumer)reactive;
    }
    
    //## statechart_method 
    public void gen(RiJEvent event) {
        reactive._gen(event);
    }
    
    //## statechart_method 
    public void queueEvent(RiJEvent event) {
        reactive.queueEvent(event);
    }
    
    //## statechart_method 
    public int takeEvent(RiJEvent event) {
        return reactive.takeEvent(event);
    }
    
    // Constructors
    
    //## auto_generated 
    public  OdbiornikIRDA(RiJThread p_thread) {
        try {
            animInstance().notifyConstructorEntered(animClassOdbiornikIRDA.getUserClass(),
               new ArgData[] {
               });
        
        reactive = new Reactive(p_thread);
        initRelations(p_thread);
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public OdbiornikIRDA.odbiornik_C getOdbiornik() {
        return odbiornik;
    }
    
    //## auto_generated 
    public OdbiornikIRDA.odbiornik_C get_odbiornik() {
        return odbiornik;
    }
    
    //## auto_generated 
    public OdbiornikIRDA.odbiornik_C newOdbiornik() {
        odbiornik = new OdbiornikIRDA.odbiornik_C();
        return odbiornik;
    }
    
    //## auto_generated 
    public void deleteOdbiornik() {
        odbiornik=null;
    }
    
    /**
     * @param _klima
    */
    //## operation setKlimatyzator(Klimatyzator) 
    public void setKlimatyzator(final Klimatyzator _klima) {
        try {
            animInstance().notifyMethodEntered("setKlimatyzator",
               new ArgData[] {
                   new ArgData(Klimatyzator.class, "_klima", AnimInstance.animToString(_klima))
               });
        
        //#[ operation setKlimatyzator(Klimatyzator) 
        klimatyzator = _klima;
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public String getJaki_przycisk() {
        return jaki_przycisk;
    }
    
    //## auto_generated 
    public void setJaki_przycisk(String p_jaki_przycisk) {
        jaki_przycisk = p_jaki_przycisk;
    }
    
    //## auto_generated 
    private Klimatyzator getKlimatyzator() {
        return klimatyzator;
    }
    
    //## auto_generated 
    protected void initRelations(RiJThread p_thread) {
        odbiornik = newOdbiornik();
        if(getOdbiornik() != null)
           getOdbiornik().connectOdbiornikIRDA(this);
    }
    
    //## auto_generated 
    public boolean startBehavior() {
        boolean done = false;
        done = reactive.startBehavior();
        return done;
    }
    
    //## ignore 
    public class Reactive extends RiJStateReactive implements AnimatedReactive {
        
        // Default constructor 
        public Reactive() {
            this(RiJMainThread.instance());
        }
        
        
        // Constructors
        
        public  Reactive(RiJThread p_thread) {
            super(p_thread);
            initStatechart();
        }
        
        //## statechart_method 
        public boolean isIn(int state) {
            if(rootState_subState == state)
                {
                    return true;
                }
            return false;
        }
        
        //## statechart_method 
        public boolean isCompleted(int state) {
            return true;
        }
        
        //## statechart_method 
        public void rootState_add(AnimStates animStates) {
            animStates.add("ROOT");
            switch (rootState_subState) {
                case accepteventaction_1:
                {
                    accepteventaction_1_add(animStates);
                }
                break;
                case odebrano_sygnal:
                {
                    odebrano_sygnal_add(animStates);
                }
                break;
                case start:
                {
                    start_add(animStates);
                }
                break;
                case nieznany_przycisk:
                {
                    nieznany_przycisk_add(animStates);
                }
                break;
                case chciana_temp_inc:
                {
                    chciana_temp_inc_add(animStates);
                }
                break;
                case chciana_temp_dec:
                {
                    chciana_temp_dec_add(animStates);
                }
                break;
                default:
                    break;
            }
        }
        
        //## statechart_method 
        public void rootState_entDef() {
            {
                rootState_enter();
                rootStateEntDef();
            }
        }
        
        //## statechart_method 
        public int rootState_dispatchEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            switch (rootState_active) {
                case accepteventaction_1:
                {
                    res = accepteventaction_1_takeEvent(id);
                }
                break;
                case odebrano_sygnal:
                {
                    res = odebrano_sygnal_takeEvent(id);
                }
                break;
                case start:
                {
                    res = start_takeEvent(id);
                }
                break;
                case nieznany_przycisk:
                {
                    res = nieznany_przycisk_takeEvent(id);
                }
                break;
                case chciana_temp_inc:
                {
                    res = chciana_temp_inc_takeEvent(id);
                }
                break;
                case chciana_temp_dec:
                {
                    res = chciana_temp_dec_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## statechart_method 
        public void start_add(AnimStates animStates) {
            animStates.add("ROOT.start");
        }
        
        //## statechart_method 
        public void odebrano_sygnal_add(AnimStates animStates) {
            animStates.add("ROOT.odebrano_sygnal");
        }
        
        //## statechart_method 
        public void nieznany_przycisk_add(AnimStates animStates) {
            animStates.add("ROOT.nieznany_przycisk");
        }
        
        //## statechart_method 
        public void chciana_temp_inc_add(AnimStates animStates) {
            animStates.add("ROOT.chciana_temp_inc");
        }
        
        //## statechart_method 
        public void chciana_temp_dec_add(AnimStates animStates) {
            animStates.add("ROOT.chciana_temp_dec");
        }
        
        //## statechart_method 
        public void accepteventaction_1_add(AnimStates animStates) {
            animStates.add("ROOT.accepteventaction_1");
        }
        
        //## auto_generated 
        protected void initStatechart() {
            rootState_subState = RiJNonState;
            rootState_active = RiJNonState;
        }
        
        //## statechart_method 
        public void chciana_temp_incEnter() {
            //#[ state ROOT.chciana_temp_inc.(Entry) 
            klimatyzator.chcianaTemp += 1;
            //#]
        }
        
        //## statechart_method 
        public void nieznany_przycisk_enter() {
            animInstance().notifyStateEntered("ROOT.nieznany_przycisk");
            pushNullConfig();
            rootState_subState = nieznany_przycisk;
            rootState_active = nieznany_przycisk;
            nieznany_przyciskEnter();
        }
        
        //## statechart_method 
        public int startTakeprzycisk_nacisniety() {
            przycisk_nacisniety params = (przycisk_nacisniety) event;
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("2");
            start_exit();
            //#[ transition 2 
            jaki_przycisk = params.przycisk;
            //#]
            accepteventaction_1_entDef();
            animInstance().notifyTransitionEnded("2");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void start_exit() {
            startExit();
            animInstance().notifyStateExited("ROOT.start");
        }
        
        //## statechart_method 
        public void accepteventaction_1Exit() {
        }
        
        //## statechart_method 
        public void accepteventaction_1Enter() {
        }
        
        //## statechart_method 
        public int chciana_temp_decTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("7");
            chciana_temp_dec_exit();
            start_entDef();
            animInstance().notifyTransitionEnded("7");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void chciana_temp_dec_exit() {
            popNullConfig();
            chciana_temp_decExit();
            animInstance().notifyStateExited("ROOT.chciana_temp_dec");
        }
        
        //## statechart_method 
        public int chciana_temp_incTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("8");
            chciana_temp_inc_exit();
            start_entDef();
            animInstance().notifyTransitionEnded("8");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void chciana_temp_inc_entDef() {
            chciana_temp_inc_enter();
        }
        
        //## statechart_method 
        public int odebrano_sygnal_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = odebrano_sygnalTakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void odebrano_sygnal_enter() {
            animInstance().notifyStateEntered("ROOT.odebrano_sygnal");
            pushNullConfig();
            rootState_subState = odebrano_sygnal;
            rootState_active = odebrano_sygnal;
            odebrano_sygnalEnter();
        }
        
        //## statechart_method 
        public int accepteventaction_1_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = accepteventaction_1TakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void chciana_temp_decExit() {
        }
        
        //## statechart_method 
        public int nieznany_przyciskTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("9");
            nieznany_przycisk_exit();
            start_entDef();
            animInstance().notifyTransitionEnded("9");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void chciana_temp_inc_exit() {
            popNullConfig();
            chciana_temp_incExit();
            animInstance().notifyStateExited("ROOT.chciana_temp_inc");
        }
        
        //## statechart_method 
        public void accepteventaction_1_exit() {
            popNullConfig();
            accepteventaction_1Exit();
            animInstance().notifyStateExited("ROOT.accepteventaction_1");
        }
        
        //## statechart_method 
        public void accepteventaction_1_enter() {
            animInstance().notifyStateEntered("ROOT.accepteventaction_1");
            pushNullConfig();
            rootState_subState = accepteventaction_1;
            rootState_active = accepteventaction_1;
            accepteventaction_1Enter();
        }
        
        //## statechart_method 
        public void nieznany_przyciskEnter() {
        }
        
        //## statechart_method 
        public void start_entDef() {
            start_enter();
        }
        
        //## statechart_method 
        public void accepteventaction_1_entDef() {
            accepteventaction_1_enter();
        }
        
        //## statechart_method 
        public int nieznany_przycisk_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = nieznany_przyciskTakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int rootState_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void chciana_temp_dec_enter() {
            animInstance().notifyStateEntered("ROOT.chciana_temp_dec");
            pushNullConfig();
            rootState_subState = chciana_temp_dec;
            rootState_active = chciana_temp_dec;
            chciana_temp_decEnter();
        }
        
        //## statechart_method 
        public void chciana_temp_dec_entDef() {
            chciana_temp_dec_enter();
        }
        
        //## statechart_method 
        public void nieznany_przycisk_exit() {
            popNullConfig();
            nieznany_przyciskExit();
            animInstance().notifyStateExited("ROOT.nieznany_przycisk");
        }
        
        //## statechart_method 
        public void odebrano_sygnal_entDef() {
            odebrano_sygnal_enter();
        }
        
        //## statechart_method 
        public void rootState_enter() {
            animInstance().notifyStateEntered("ROOT");
            rootStateEnter();
        }
        
        //## statechart_method 
        public void rootStateEnter() {
        }
        
        //## statechart_method 
        public void nieznany_przycisk_entDef() {
            nieznany_przycisk_enter();
        }
        
        //## statechart_method 
        public int odebrano_sygnalTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            //## transition 4 
            if(jaki_przycisk.equals("+"))
                {
                    animInstance().notifyTransitionStarted("3");
                    animInstance().notifyTransitionStarted("4");
                    odebrano_sygnal_exit();
                    chciana_temp_inc_entDef();
                    animInstance().notifyTransitionEnded("4");
                    animInstance().notifyTransitionEnded("3");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            else
                {
                    //## transition 5 
                    if(jaki_przycisk.equals("-"))
                        {
                            animInstance().notifyTransitionStarted("3");
                            animInstance().notifyTransitionStarted("5");
                            odebrano_sygnal_exit();
                            chciana_temp_dec_entDef();
                            animInstance().notifyTransitionEnded("5");
                            animInstance().notifyTransitionEnded("3");
                            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                        }
                    else
                        {
                            animInstance().notifyTransitionStarted("3");
                            animInstance().notifyTransitionStarted("6");
                            odebrano_sygnal_exit();
                            nieznany_przycisk_entDef();
                            animInstance().notifyTransitionEnded("6");
                            animInstance().notifyTransitionEnded("3");
                            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                        }
                }
            return res;
        }
        
        //## statechart_method 
        public void chciana_temp_inc_enter() {
            animInstance().notifyStateEntered("ROOT.chciana_temp_inc");
            pushNullConfig();
            rootState_subState = chciana_temp_inc;
            rootState_active = chciana_temp_inc;
            chciana_temp_incEnter();
        }
        
        //## statechart_method 
        public int start_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(przycisk_nacisniety.przycisk_nacisniety_Default_id))
                {
                    res = startTakeprzycisk_nacisniety();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            animInstance().notifyTransitionStarted("1");
            start_entDef();
            animInstance().notifyTransitionEnded("1");
        }
        
        //## statechart_method 
        public int accepteventaction_1TakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("0");
            accepteventaction_1_exit();
            odebrano_sygnal_entDef();
            animInstance().notifyTransitionEnded("0");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int chciana_temp_dec_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = chciana_temp_decTakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void odebrano_sygnalEnter() {
            //#[ state ROOT.odebrano_sygnal.(Entry) 
            System.out.println("IRDA: Odebrano sygnal: " + jaki_przycisk);
            //#]
        }
        
        //## statechart_method 
        public void chciana_temp_incExit() {
        }
        
        //## statechart_method 
        public void nieznany_przyciskExit() {
        }
        
        //## statechart_method 
        public void odebrano_sygnalExit() {
        }
        
        //## statechart_method 
        public void startExit() {
        }
        
        //## statechart_method 
        public void startEnter() {
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public void chciana_temp_decEnter() {
            //#[ state ROOT.chciana_temp_dec.(Entry) 
            klimatyzator.chcianaTemp -= 1;
            //#]
        }
        
        //## statechart_method 
        public int chciana_temp_inc_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = chciana_temp_incTakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void odebrano_sygnal_exit() {
            popNullConfig();
            odebrano_sygnalExit();
            animInstance().notifyStateExited("ROOT.odebrano_sygnal");
        }
        
        //## statechart_method 
        public void start_enter() {
            animInstance().notifyStateEntered("ROOT.start");
            rootState_subState = start;
            rootState_active = start;
            startEnter();
        }
        
        /**  methods added just for design level debugging instrumentation */
        public boolean startBehavior() {
            try {
              animInstance().notifyBehavioralMethodEntered("startBehavior",
                  new ArgData[] {
                   });
              return super.startBehavior();
            }
            finally {
              animInstance().notifyMethodExit();
            }
        }
        public int takeEvent(RiJEvent event) { 
            try { 
              //animInstance().notifyTakeEvent(new AnimEvent(event));
              animInstance().notifyBehavioralMethodEntered("takeEvent",
                  new ArgData[] { new ArgData(RiJEvent.class, "event", event.toString())
                   });
              return super.takeEvent(event); 
            }
            finally { 
              animInstance().notifyMethodExit();
            }
        }
        /**  see com.ibm.rational.rhapsody.animation.AnimatedReactive interface */
        public AnimInstance animInstance() { 
            return OdbiornikIRDA.this.animInstance(); 
        }
        
    }
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class odbiornik_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  odbiornik_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectOdbiornikIRDA(OdbiornikIRDA) 
        public void connectOdbiornikIRDA(OdbiornikIRDA part) {
            //#[ operation connectOdbiornikIRDA(OdbiornikIRDA) 
            InBound.setItsDefaultProvidedInterface(part);
            InBound.setPort(this); // for IS_PORT macro support
            
            //#]
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassOdbiornikIRDA; 
    }
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public Object getFieldValue(java.lang.reflect.Field f, Object userInstance) { 
         Object obj = null;
         try {
             obj = f.get(userInstance);
         } catch(Exception e) {
              java.lang.System.err.println("Exception: getting Field value: " + e);
              e.printStackTrace();
         }
         return obj;
    }
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimInstance animInstance() {
        if (animate == null) 
            animate = new Animate(); 
        return animate; 
    } 
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public void addAttributes(AnimAttributes msg) {
        
        msg.add("jaki_przycisk", jaki_przycisk);
        msg.add("klimatyzator", klimatyzator);
    }
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public void addRelations(AnimRelations msg) {
        
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(OdbiornikIRDA.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            OdbiornikIRDA.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            OdbiornikIRDA.this.addRelations(msg);
        }
        
        public void addStates(AnimStates msg) {
            if ((reactive != null) && (reactive.isTerminated() == false))
              reactive.rootState_add(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/gui/Default/OdbiornikIRDA.java
*********************************************************************/

