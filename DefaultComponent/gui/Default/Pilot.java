/*********************************************************************
	Rhapsody	: 7.6.1
	Login		: Kuba
	Component	: DefaultComponent
	Configuration 	: gui
	Model Element	: Pilot
//!	Generated Date	: Wed, 12, Dec 2012 
	File Path	: DefaultComponent/gui/Default/Pilot.java
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
// Default/Pilot.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class Pilot 
public class Pilot implements RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassPilot = new AnimClass("Default.Pilot",false);
    //#]
    
    public Reactive reactive;		//## ignore 
    
    protected Pilot.nadajnik_C nadajnik;		//## ignore 
    
    protected String ostatni_przycisk;		//## attribute ostatni_przycisk 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int start=1;
    public static final int sendaction_3=2;
    public static final int oczekuj_na_przycisk=3;
    public static final int state_7=4;
    public static final int start_minus=5;
    public static final int odebrano_minus=6;
    public static final int accepteventaction_9=7;
    public static final int state_6=8;
    public static final int start_plus=9;
    public static final int odebrano_plus=10;
    public static final int accepteventaction_0=11;
    public static final int nadano_sygnal=12;
    public static final int nacisnieto_przycisk=13;
    //#]
    protected int rootState_subState;		//## ignore 
    
    protected int rootState_active;		//## ignore 
    
    public static final int Pilot_Timeout_sendaction_3_id = 1;		//## ignore 
    
    protected int state_7_subState;		//## ignore 
    
    protected int state_7_active;		//## ignore 
    
    protected int state_6_subState;		//## ignore 
    
    protected int state_6_active;		//## ignore 
    
    
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
    public  Pilot(RiJThread p_thread) {
        try {
            animInstance().notifyConstructorEntered(animClassPilot.getUserClass(),
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
    public Pilot.nadajnik_C getNadajnik() {
        return nadajnik;
    }
    
    //## auto_generated 
    public Pilot.nadajnik_C get_nadajnik() {
        return nadajnik;
    }
    
    //## auto_generated 
    public Pilot.nadajnik_C newNadajnik() {
        nadajnik = new Pilot.nadajnik_C();
        return nadajnik;
    }
    
    //## auto_generated 
    public void deleteNadajnik() {
        nadajnik=null;
    }
    
    //## auto_generated 
    private String getOstatni_przycisk() {
        return ostatni_przycisk;
    }
    
    //## auto_generated 
    private void setOstatni_przycisk(String p_ostatni_przycisk) {
        ostatni_przycisk = p_ostatni_przycisk;
    }
    
    //## auto_generated 
    protected void initRelations(RiJThread p_thread) {
        nadajnik = newNadajnik();
        if(getNadajnik() != null)
           getNadajnik().connectPilot(this);
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
            if(state_6 == state)
                {
                    return isIn(oczekuj_na_przycisk);
                }
            if(state_6_subState == state)
                {
                    return true;
                }
            if(state_7 == state)
                {
                    return isIn(oczekuj_na_przycisk);
                }
            if(state_7_subState == state)
                {
                    return true;
                }
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
                case start:
                {
                    start_add(animStates);
                }
                break;
                case sendaction_3:
                {
                    sendaction_3_add(animStates);
                }
                break;
                case nadano_sygnal:
                {
                    nadano_sygnal_add(animStates);
                }
                break;
                case oczekuj_na_przycisk:
                {
                    oczekuj_na_przycisk_add(animStates);
                }
                break;
                case nacisnieto_przycisk:
                {
                    nacisnieto_przycisk_add(animStates);
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
                case start:
                {
                    res = start_takeEvent(id);
                }
                break;
                case sendaction_3:
                {
                    res = sendaction_3_takeEvent(id);
                }
                break;
                case nadano_sygnal:
                {
                    res = nadano_sygnal_takeEvent(id);
                }
                break;
                case oczekuj_na_przycisk:
                {
                    res = oczekuj_na_przycisk_dispatchEvent(id);
                }
                break;
                case nacisnieto_przycisk:
                {
                    res = nacisnieto_przycisk_takeEvent(id);
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
        public void sendaction_3_add(AnimStates animStates) {
            animStates.add("ROOT.sendaction_3");
        }
        
        //## statechart_method 
        public void oczekuj_na_przycisk_add(AnimStates animStates) {
            animStates.add("ROOT.oczekuj_na_przycisk");
            state_6_add(animStates);
            state_7_add(animStates);
        }
        
        //## statechart_method 
        public int oczekuj_na_przycisk_dispatchEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(state_6_dispatchEvent(id) >= 0)
                {
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                    if(!isIn(oczekuj_na_przycisk))
                        {
                            return res;
                        }
                }
            if(state_7_dispatchEvent(id) >= 0)
                {
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                    if(!isIn(oczekuj_na_przycisk))
                        {
                            return res;
                        }
                }
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = oczekuj_na_przycisk_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void state_7_add(AnimStates animStates) {
            animStates.add("ROOT.oczekuj_na_przycisk.state_7");
            switch (state_7_subState) {
                case accepteventaction_9:
                {
                    accepteventaction_9_add(animStates);
                }
                break;
                case odebrano_minus:
                {
                    odebrano_minus_add(animStates);
                }
                break;
                case start_minus:
                {
                    start_minus_add(animStates);
                }
                break;
                default:
                    break;
            }
        }
        
        //## statechart_method 
        public int state_7_dispatchEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            switch (state_7_active) {
                case accepteventaction_9:
                {
                    res = accepteventaction_9_takeEvent(id);
                }
                break;
                case odebrano_minus:
                {
                    res = odebrano_minus_takeEvent(id);
                }
                break;
                case start_minus:
                {
                    res = start_minus_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## statechart_method 
        public void start_minus_add(AnimStates animStates) {
            animStates.add("ROOT.oczekuj_na_przycisk.state_7.start_minus");
        }
        
        //## statechart_method 
        public void odebrano_minus_add(AnimStates animStates) {
            animStates.add("ROOT.oczekuj_na_przycisk.state_7.odebrano_minus");
        }
        
        //## statechart_method 
        public void accepteventaction_9_add(AnimStates animStates) {
            animStates.add("ROOT.oczekuj_na_przycisk.state_7.accepteventaction_9");
        }
        
        //## statechart_method 
        public void state_6_add(AnimStates animStates) {
            animStates.add("ROOT.oczekuj_na_przycisk.state_6");
            switch (state_6_subState) {
                case accepteventaction_0:
                {
                    accepteventaction_0_add(animStates);
                }
                break;
                case odebrano_plus:
                {
                    odebrano_plus_add(animStates);
                }
                break;
                case start_plus:
                {
                    start_plus_add(animStates);
                }
                break;
                default:
                    break;
            }
        }
        
        //## statechart_method 
        public int state_6_dispatchEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            switch (state_6_active) {
                case accepteventaction_0:
                {
                    res = accepteventaction_0_takeEvent(id);
                }
                break;
                case odebrano_plus:
                {
                    res = odebrano_plus_takeEvent(id);
                }
                break;
                case start_plus:
                {
                    res = start_plus_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## statechart_method 
        public void start_plus_add(AnimStates animStates) {
            animStates.add("ROOT.oczekuj_na_przycisk.state_6.start_plus");
        }
        
        //## statechart_method 
        public void odebrano_plus_add(AnimStates animStates) {
            animStates.add("ROOT.oczekuj_na_przycisk.state_6.odebrano_plus");
        }
        
        //## statechart_method 
        public void accepteventaction_0_add(AnimStates animStates) {
            animStates.add("ROOT.oczekuj_na_przycisk.state_6.accepteventaction_0");
        }
        
        //## statechart_method 
        public void nadano_sygnal_add(AnimStates animStates) {
            animStates.add("ROOT.nadano_sygnal");
        }
        
        //## statechart_method 
        public void nacisnieto_przycisk_add(AnimStates animStates) {
            animStates.add("ROOT.nacisnieto_przycisk");
        }
        
        //## auto_generated 
        protected void initStatechart() {
            rootState_subState = RiJNonState;
            rootState_active = RiJNonState;
            state_7_subState = RiJNonState;
            state_7_active = RiJNonState;
            state_6_subState = RiJNonState;
            state_6_active = RiJNonState;
        }
        
        //## statechart_method 
        public void accepteventaction_0Exit() {
        }
        
        //## statechart_method 
        public void sendaction_3_exit() {
            sendaction_3Exit();
            animInstance().notifyStateExited("ROOT.sendaction_3");
        }
        
        //## statechart_method 
        public void start_exit() {
            popNullConfig();
            startExit();
            animInstance().notifyStateExited("ROOT.start");
        }
        
        //## statechart_method 
        public void nacisnieto_przyciskEnter() {
            //#[ state ROOT.nacisnieto_przycisk.(Entry) 
            System.out.println("Pilot: nacisnieto przycisk: " + ostatni_przycisk + " , nadawanie sygnalu...");
            //#]
        }
        
        //## statechart_method 
        public void odebrano_plusExit() {
        }
        
        //## statechart_method 
        public void state_6_entDef() {
            state_6_enter();
            state_6EntDef();
        }
        
        //## statechart_method 
        public void sendaction_3Exit() {
            itsRiJThread.unschedTimeout(Pilot_Timeout_sendaction_3_id, this);
        }
        
        //## statechart_method 
        public int nacisnieto_przyciskTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("7");
            nacisnieto_przycisk_exit();
            sendaction_3_entDef();
            animInstance().notifyTransitionEnded("7");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void accepteventaction_0Enter() {
        }
        
        //## statechart_method 
        public void start_plusExit() {
        }
        
        //## statechart_method 
        public void start_plus_entDef() {
            start_plus_enter();
        }
        
        //## statechart_method 
        public void state_6EntDef() {
            animInstance().notifyTransitionStarted("6");
            start_plus_entDef();
            animInstance().notifyTransitionEnded("6");
        }
        
        //## statechart_method 
        public int accepteventaction_9TakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("9");
            accepteventaction_9_exit();
            odebrano_minus_entDef();
            animInstance().notifyTransitionEnded("9");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void start_minusExit() {
        }
        
        //## statechart_method 
        public void state_7EntDef() {
            animInstance().notifyTransitionStarted("8");
            start_minus_entDef();
            animInstance().notifyTransitionEnded("8");
        }
        
        //## statechart_method 
        public void nacisnieto_przycisk_entDef() {
            nacisnieto_przycisk_enter();
        }
        
        //## statechart_method 
        public void nadano_sygnalExit() {
        }
        
        //## statechart_method 
        public void accepteventaction_0_enter() {
            animInstance().notifyStateEntered("ROOT.oczekuj_na_przycisk.state_6.accepteventaction_0");
            pushNullConfig();
            state_6_subState = accepteventaction_0;
            state_6_active = accepteventaction_0;
            accepteventaction_0Enter();
        }
        
        //## statechart_method 
        public void start_plus_enter() {
            animInstance().notifyStateEntered("ROOT.oczekuj_na_przycisk.state_6.start_plus");
            state_6_subState = start_plus;
            state_6_active = start_plus;
            start_plusEnter();
        }
        
        //## statechart_method 
        public int state_6_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void accepteventaction_9_entDef() {
            accepteventaction_9_enter();
        }
        
        //## statechart_method 
        public void odebrano_minusEnter() {
            //#[ state ROOT.oczekuj_na_przycisk.state_7.odebrano_minus.(Entry) 
            ostatni_przycisk = "-";
            //#]
        }
        
        //## statechart_method 
        public void nacisnieto_przycisk_exit() {
            popNullConfig();
            nacisnieto_przyciskExit();
            animInstance().notifyStateExited("ROOT.nacisnieto_przycisk");
        }
        
        //## statechart_method 
        public void nacisnieto_przyciskExit() {
        }
        
        //## statechart_method 
        public int nadano_sygnal_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = nadano_sygnalTakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void sendaction_3_entDef() {
            sendaction_3_enter();
        }
        
        //## statechart_method 
        public void start_entDef() {
            start_enter();
        }
        
        //## statechart_method 
        public void accepteventaction_0_exit() {
            popNullConfig();
            accepteventaction_0Exit();
            animInstance().notifyStateExited("ROOT.oczekuj_na_przycisk.state_6.accepteventaction_0");
        }
        
        //## statechart_method 
        public void nadano_sygnal_enter() {
            animInstance().notifyStateEntered("ROOT.nadano_sygnal");
            pushNullConfig();
            rootState_subState = nadano_sygnal;
            rootState_active = nadano_sygnal;
            nadano_sygnalEnter();
        }
        
        //## statechart_method 
        public void nadano_sygnalEnter() {
        }
        
        //## statechart_method 
        public void nadano_sygnal_entDef() {
            nadano_sygnal_enter();
        }
        
        //## statechart_method 
        public int odebrano_minus_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = odebrano_minusTakeNull();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = state_7_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void odebrano_minus_exit() {
            popNullConfig();
            odebrano_minusExit();
            animInstance().notifyStateExited("ROOT.oczekuj_na_przycisk.state_7.odebrano_minus");
        }
        
        //## statechart_method 
        public void odebrano_minus_entDef() {
            odebrano_minus_enter();
        }
        
        //## statechart_method 
        public void start_minus_entDef() {
            start_minus_enter();
        }
        
        //## statechart_method 
        public void sendaction_3_enter() {
            animInstance().notifyStateEntered("ROOT.sendaction_3");
            rootState_subState = sendaction_3;
            rootState_active = sendaction_3;
            sendaction_3Enter();
        }
        
        //## statechart_method 
        public int rootState_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void odebrano_minus_enter() {
            animInstance().notifyStateEntered("ROOT.oczekuj_na_przycisk.state_7.odebrano_minus");
            pushNullConfig();
            state_7_subState = odebrano_minus;
            state_7_active = odebrano_minus;
            odebrano_minusEnter();
        }
        
        //## statechart_method 
        public void start_minusEnter() {
        }
        
        //## statechart_method 
        public void state_7_entDef() {
            state_7_enter();
            state_7EntDef();
        }
        
        //## statechart_method 
        public int nacisnieto_przycisk_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = nacisnieto_przyciskTakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int nadano_sygnalTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("5");
            nadano_sygnal_exit();
            start_entDef();
            animInstance().notifyTransitionEnded("5");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void nadano_sygnal_exit() {
            popNullConfig();
            nadano_sygnalExit();
            animInstance().notifyStateExited("ROOT.nadano_sygnal");
        }
        
        //## statechart_method 
        public int accepteventaction_0_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = accepteventaction_0TakeNull();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = state_6_takeEvent(id);
                }
            return res;
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
        public void odebrano_plusEnter() {
            //#[ state ROOT.oczekuj_na_przycisk.state_6.odebrano_plus.(Entry) 
            ostatni_przycisk = "+";
            //#]
        }
        
        //## statechart_method 
        public int accepteventaction_9_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = accepteventaction_9TakeNull();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = state_7_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void accepteventaction_9Exit() {
        }
        
        //## statechart_method 
        public void accepteventaction_9_enter() {
            animInstance().notifyStateEntered("ROOT.oczekuj_na_przycisk.state_7.accepteventaction_9");
            pushNullConfig();
            state_7_subState = accepteventaction_9;
            state_7_active = accepteventaction_9;
            accepteventaction_9Enter();
        }
        
        //## statechart_method 
        public void accepteventaction_9Enter() {
        }
        
        //## statechart_method 
        public int start_minusTakeprzycisk_minus() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("11");
            start_minus_exit();
            accepteventaction_9_entDef();
            animInstance().notifyTransitionEnded("11");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void start_minus_exit() {
            start_minusExit();
            animInstance().notifyStateExited("ROOT.oczekuj_na_przycisk.state_7.start_minus");
        }
        
        //## statechart_method 
        public void oczekuj_na_przyciskEnter() {
        }
        
        //## statechart_method 
        public int startTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("1");
            start_exit();
            oczekuj_na_przycisk_entDef();
            animInstance().notifyTransitionEnded("1");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void nacisnieto_przycisk_enter() {
            animInstance().notifyStateEntered("ROOT.nacisnieto_przycisk");
            pushNullConfig();
            rootState_subState = nacisnieto_przycisk;
            rootState_active = nacisnieto_przycisk;
            nacisnieto_przyciskEnter();
        }
        
        //## statechart_method 
        public void odebrano_plus_entDef() {
            odebrano_plus_enter();
        }
        
        //## statechart_method 
        public int start_plus_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(przycisk_plus.przycisk_plus_Default_id))
                {
                    res = start_plusTakeprzycisk_plus();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = state_6_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public int odebrano_minusTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("12");
            oczekuj_na_przycisk_exit();
            nacisnieto_przycisk_entDef();
            animInstance().notifyTransitionEnded("12");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int start_minus_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(przycisk_minus.przycisk_minus_Default_id))
                {
                    res = start_minusTakeprzycisk_minus();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = state_7_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void state_7Enter() {
        }
        
        //## statechart_method 
        public int oczekuj_na_przycisk_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public int start_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = startTakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            animInstance().notifyTransitionStarted("0");
            start_entDef();
            animInstance().notifyTransitionEnded("0");
        }
        
        //## statechart_method 
        public void odebrano_plus_exit() {
            popNullConfig();
            odebrano_plusExit();
            animInstance().notifyStateExited("ROOT.oczekuj_na_przycisk.state_6.odebrano_plus");
        }
        
        //## statechart_method 
        public void state_6Enter() {
        }
        
        //## statechart_method 
        public int odebrano_plus_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = odebrano_plusTakeNull();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = state_6_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void start_plusEnter() {
        }
        
        //## statechart_method 
        public void state_6Exit() {
        }
        
        //## statechart_method 
        public void accepteventaction_9_exit() {
            popNullConfig();
            accepteventaction_9Exit();
            animInstance().notifyStateExited("ROOT.oczekuj_na_przycisk.state_7.accepteventaction_9");
        }
        
        //## statechart_method 
        public void oczekuj_na_przycisk_exit() {
            state_6_exit();
            state_7_exit();
            oczekuj_na_przyciskExit();
            animInstance().notifyStateExited("ROOT.oczekuj_na_przycisk");
        }
        
        //## statechart_method 
        public void oczekuj_na_przyciskExit() {
        }
        
        //## statechart_method 
        public int sendaction_3_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.TIMEOUT_EVENT_ID))
                {
                    res = sendaction_3TakeRiJTimeout();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int state_7_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void state_7_exit() {
            switch (state_7_subState) {
                case accepteventaction_9:
                {
                    accepteventaction_9_exit();
                }
                break;
                case odebrano_minus:
                {
                    odebrano_minus_exit();
                }
                break;
                case start_minus:
                {
                    start_minus_exit();
                }
                break;
                default:
                    break;
            }
            state_7_subState = RiJNonState;
            state_7Exit();
            animInstance().notifyStateExited("ROOT.oczekuj_na_przycisk.state_7");
        }
        
        //## statechart_method 
        public void state_7Exit() {
        }
        
        //## statechart_method 
        public void sendaction_3Enter() {
            //#[ state ROOT.sendaction_3.(Entry) 
            nadajnik.gen(new Default.przycisk_nacisniety(ostatni_przycisk));
            //#]
            itsRiJThread.schedTimeout(10, Pilot_Timeout_sendaction_3_id, this, "ROOT.sendaction_3");
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
        public int odebrano_plusTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("3");
            oczekuj_na_przycisk_exit();
            nacisnieto_przycisk_entDef();
            animInstance().notifyTransitionEnded("3");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int start_plusTakeprzycisk_plus() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("10");
            start_plus_exit();
            accepteventaction_0_entDef();
            animInstance().notifyTransitionEnded("10");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void state_6_exit() {
            switch (state_6_subState) {
                case accepteventaction_0:
                {
                    accepteventaction_0_exit();
                }
                break;
                case odebrano_plus:
                {
                    odebrano_plus_exit();
                }
                break;
                case start_plus:
                {
                    start_plus_exit();
                }
                break;
                default:
                    break;
            }
            state_6_subState = RiJNonState;
            state_6Exit();
            animInstance().notifyStateExited("ROOT.oczekuj_na_przycisk.state_6");
        }
        
        //## statechart_method 
        public void odebrano_minusExit() {
        }
        
        //## statechart_method 
        public void start_minus_enter() {
            animInstance().notifyStateEntered("ROOT.oczekuj_na_przycisk.state_7.start_minus");
            state_7_subState = start_minus;
            state_7_active = start_minus;
            start_minusEnter();
        }
        
        //## statechart_method 
        public void oczekuj_na_przycisk_enter() {
            animInstance().notifyStateEntered("ROOT.oczekuj_na_przycisk");
            rootState_subState = oczekuj_na_przycisk;
            rootState_active = oczekuj_na_przycisk;
            oczekuj_na_przyciskEnter();
        }
        
        //## statechart_method 
        public int accepteventaction_0TakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("2");
            accepteventaction_0_exit();
            odebrano_plus_entDef();
            animInstance().notifyTransitionEnded("2");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void accepteventaction_0_entDef() {
            accepteventaction_0_enter();
        }
        
        //## statechart_method 
        public void odebrano_plus_enter() {
            animInstance().notifyStateEntered("ROOT.oczekuj_na_przycisk.state_6.odebrano_plus");
            pushNullConfig();
            state_6_subState = odebrano_plus;
            state_6_active = odebrano_plus;
            odebrano_plusEnter();
        }
        
        //## statechart_method 
        public void start_plus_exit() {
            start_plusExit();
            animInstance().notifyStateExited("ROOT.oczekuj_na_przycisk.state_6.start_plus");
        }
        
        //## statechart_method 
        public void state_6_enter() {
            animInstance().notifyStateEntered("ROOT.oczekuj_na_przycisk.state_6");
            state_6Enter();
        }
        
        //## statechart_method 
        public void state_7_enter() {
            animInstance().notifyStateEntered("ROOT.oczekuj_na_przycisk.state_7");
            state_7Enter();
        }
        
        //## statechart_method 
        public void oczekuj_na_przycisk_entDef() {
            oczekuj_na_przycisk_enter();
            state_6_entDef();
            state_7_entDef();
        }
        
        //## statechart_method 
        public int sendaction_3TakeRiJTimeout() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.getTimeoutId() == Pilot_Timeout_sendaction_3_id)
                {
                    animInstance().notifyTransitionStarted("4");
                    sendaction_3_exit();
                    nadano_sygnal_entDef();
                    animInstance().notifyTransitionEnded("4");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public void start_enter() {
            animInstance().notifyStateEntered("ROOT.start");
            pushNullConfig();
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
            return Pilot.this.animInstance(); 
        }
        
    }
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class nadajnik_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  nadajnik_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectPilot(Pilot) 
        public void connectPilot(Pilot part) {
            //#[ operation connectPilot(Pilot) 
            InBound.setItsDefaultProvidedInterface(part);
            InBound.setPort(this); // for IS_PORT macro support
            
            //#]
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassPilot; 
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
        
        msg.add("ostatni_przycisk", ostatni_przycisk);
    }
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public void addRelations(AnimRelations msg) {
        
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(Pilot.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            Pilot.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            Pilot.this.addRelations(msg);
        }
        
        public void addStates(AnimStates msg) {
            if ((reactive != null) && (reactive.isTerminated() == false))
              reactive.rootState_add(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/gui/Default/Pilot.java
*********************************************************************/

