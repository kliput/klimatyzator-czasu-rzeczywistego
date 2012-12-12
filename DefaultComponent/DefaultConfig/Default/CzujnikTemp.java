/*********************************************************************
	Rhapsody	: 8.0
	Login		: Piotrek
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: CzujnikTemp
//!	Generated Date	: Wed, 12, Dec 2012 
	File Path	: DefaultComponent/DefaultConfig/Default/CzujnikTemp.java
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
// Default/CzujnikTemp.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class CzujnikTemp 
public class CzujnikTemp implements RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassCzujnikTemp = new AnimClass("Default.CzujnikTemp",false);
    //#]
    
    public Reactive reactive;		//## ignore 
    
    protected Klimatyzator klimatyzator;		//## attribute klimatyzator 
    
    protected Pomieszczenie pomieszczenie;		//## attribute pomieszczenie 
    
    protected double temperatura = 0;		//## attribute temperatura 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int main=1;
    public static final int state_7=2;
    public static final int zadanie=3;
    public static final int sendaction_10=4;
    public static final int komunikacja_start=5;
    public static final int accepteventaction_8=6;
    public static final int state_6=7;
    public static final int start=8;
    public static final int pobierz_temperature_otoczenia=9;
    //#]
    protected int rootState_subState;		//## ignore 
    
    protected int rootState_active;		//## ignore 
    
    protected int state_7_subState;		//## ignore 
    
    protected int state_7_active;		//## ignore 
    
    protected int state_6_subState;		//## ignore 
    
    protected int state_6_active;		//## ignore 
    
    public static final int CzujnikTemp_Timeout_pobierz_temperature_otoczenia_id = 1;		//## ignore 
    
    
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
    
    //## operation CzujnikTemp() 
    public  CzujnikTemp(RiJThread p_thread) {
        System.out.println("  -> Czujnik temperatury");;
        try {
            animInstance().notifyConstructorEntered(animClassCzujnikTemp.getUserClass(),
               new ArgData[] {
               });
        
        reactive = new Reactive(p_thread);
        //#[ operation CzujnikTemp() 
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
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
    
    /**
     * @param pomieszczenie
    */
    //## operation setPomieszczenie(Pomieszczenie) 
    public void setPomieszczenie(final Pomieszczenie pomieszczenie) {
        try {
            animInstance().notifyMethodEntered("setPomieszczenie",
               new ArgData[] {
                   new ArgData(Pomieszczenie.class, "pomieszczenie", AnimInstance.animToString(pomieszczenie))
               });
        
        //#[ operation setPomieszczenie(Pomieszczenie) 
        this.pomieszczenie=pomieszczenie;
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    private Klimatyzator getKlimatyzator() {
        return klimatyzator;
    }
    
    //## auto_generated 
    private Pomieszczenie getPomieszczenie() {
        return pomieszczenie;
    }
    
    //## auto_generated 
    private double getTemperatura() {
        return temperatura;
    }
    
    //## auto_generated 
    private void setTemperatura(double p_temperatura) {
        temperatura = p_temperatura;
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
                    return isIn(main);
                }
            if(state_6_subState == state)
                {
                    return true;
                }
            if(state_7 == state)
                {
                    return isIn(main);
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
            if(rootState_subState == main)
                {
                    main_add(animStates);
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
            if(rootState_active == main)
                {
                    res = main_dispatchEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void main_add(AnimStates animStates) {
            animStates.add("ROOT.main");
            state_6_add(animStates);
            state_7_add(animStates);
        }
        
        //## statechart_method 
        public int main_dispatchEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(state_6_dispatchEvent(id) >= 0)
                {
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                    if(!isIn(main))
                        {
                            return res;
                        }
                }
            if(state_7_dispatchEvent(id) >= 0)
                {
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                    if(!isIn(main))
                        {
                            return res;
                        }
                }
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = main_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void state_7_add(AnimStates animStates) {
            animStates.add("ROOT.main.state_7");
            switch (state_7_subState) {
                case accepteventaction_8:
                {
                    accepteventaction_8_add(animStates);
                }
                break;
                case komunikacja_start:
                {
                    komunikacja_start_add(animStates);
                }
                break;
                case sendaction_10:
                {
                    sendaction_10_add(animStates);
                }
                break;
                case zadanie:
                {
                    zadanie_add(animStates);
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
                case accepteventaction_8:
                {
                    res = accepteventaction_8_takeEvent(id);
                }
                break;
                case komunikacja_start:
                {
                    res = komunikacja_start_takeEvent(id);
                }
                break;
                case sendaction_10:
                {
                    res = sendaction_10_takeEvent(id);
                }
                break;
                case zadanie:
                {
                    res = zadanie_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## statechart_method 
        public void zadanie_add(AnimStates animStates) {
            animStates.add("ROOT.main.state_7.zadanie");
        }
        
        //## statechart_method 
        public void sendaction_10_add(AnimStates animStates) {
            animStates.add("ROOT.main.state_7.sendaction_10");
        }
        
        //## statechart_method 
        public void komunikacja_start_add(AnimStates animStates) {
            animStates.add("ROOT.main.state_7.komunikacja_start");
        }
        
        //## statechart_method 
        public void accepteventaction_8_add(AnimStates animStates) {
            animStates.add("ROOT.main.state_7.accepteventaction_8");
        }
        
        //## statechart_method 
        public void state_6_add(AnimStates animStates) {
            animStates.add("ROOT.main.state_6");
            switch (state_6_subState) {
                case start:
                {
                    start_add(animStates);
                }
                break;
                case pobierz_temperature_otoczenia:
                {
                    pobierz_temperature_otoczenia_add(animStates);
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
                case start:
                {
                    res = start_takeEvent(id);
                }
                break;
                case pobierz_temperature_otoczenia:
                {
                    res = pobierz_temperature_otoczenia_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## statechart_method 
        public void start_add(AnimStates animStates) {
            animStates.add("ROOT.main.state_6.start");
        }
        
        //## statechart_method 
        public void pobierz_temperature_otoczenia_add(AnimStates animStates) {
            animStates.add("ROOT.main.state_6.pobierz_temperature_otoczenia");
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
        public void pobierz_temperature_otoczenia_exit() {
            pobierz_temperature_otoczeniaExit();
            animInstance().notifyStateExited("ROOT.main.state_6.pobierz_temperature_otoczenia");
        }
        
        //## statechart_method 
        public void start_exit() {
            popNullConfig();
            startExit();
            animInstance().notifyStateExited("ROOT.main.state_6.start");
        }
        
        //## statechart_method 
        public int sendaction_10_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = sendaction_10TakeNull();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = state_7_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void zadanie_enter() {
            animInstance().notifyStateEntered("ROOT.main.state_7.zadanie");
            pushNullConfig();
            state_7_subState = zadanie;
            state_7_active = zadanie;
            zadanieEnter();
        }
        
        //## statechart_method 
        public void state_6_entDef() {
            state_6_enter();
            state_6EntDef();
        }
        
        //## statechart_method 
        public int komunikacja_start_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(pobierzDane.pobierzDane_Default_id))
                {
                    res = komunikacja_startTakepobierzDane();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = state_7_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void zadanieExit() {
        }
        
        //## statechart_method 
        public void pobierz_temperature_otoczenia_entDef() {
            pobierz_temperature_otoczenia_enter();
        }
        
        //## statechart_method 
        public void state_6EntDef() {
            animInstance().notifyTransitionStarted("0");
            start_entDef();
            animInstance().notifyTransitionEnded("0");
        }
        
        //## statechart_method 
        public void state_7EntDef() {
            animInstance().notifyTransitionStarted("3");
            komunikacja_start_entDef();
            animInstance().notifyTransitionEnded("3");
        }
        
        //## statechart_method 
        public int state_6_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void sendaction_10Enter() {
            //#[ state ROOT.main.state_7.sendaction_10.(Entry) 
            klimatyzator.gen(new Default.odbiorDanych(temperatura));
            //#]
        }
        
        //## statechart_method 
        public int main_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void start_entDef() {
            start_enter();
        }
        
        //## statechart_method 
        public void sendaction_10Exit() {
        }
        
        //## statechart_method 
        public int accepteventaction_8TakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("5");
            accepteventaction_8_exit();
            zadanie_entDef();
            animInstance().notifyTransitionEnded("5");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void sendaction_10_enter() {
            animInstance().notifyStateEntered("ROOT.main.state_7.sendaction_10");
            pushNullConfig();
            state_7_subState = sendaction_10;
            state_7_active = sendaction_10;
            sendaction_10Enter();
        }
        
        //## statechart_method 
        public int pobierz_temperature_otoczenia_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.TIMEOUT_EVENT_ID))
                {
                    res = pobierz_temperature_otoczeniaTakeRiJTimeout();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = state_6_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public int komunikacja_startTakepobierzDane() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("4");
            komunikacja_start_exit();
            accepteventaction_8_entDef();
            animInstance().notifyTransitionEnded("4");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void komunikacja_startExit() {
        }
        
        //## statechart_method 
        public void sendaction_10_exit() {
            popNullConfig();
            sendaction_10Exit();
            animInstance().notifyStateExited("ROOT.main.state_7.sendaction_10");
        }
        
        //## statechart_method 
        public int rootState_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void zadanie_entDef() {
            zadanie_enter();
        }
        
        //## statechart_method 
        public void state_7_entDef() {
            state_7_enter();
            state_7EntDef();
        }
        
        //## statechart_method 
        public void pobierz_temperature_otoczeniaExit() {
            itsRiJThread.unschedTimeout(CzujnikTemp_Timeout_pobierz_temperature_otoczenia_id, this);
        }
        
        //## statechart_method 
        public void accepteventaction_8Exit() {
        }
        
        //## statechart_method 
        public void zadanieEnter() {
            //#[ state ROOT.main.state_7.zadanie.(Entry) 
            System.out.println("wysylanie danych do: " + klimatyzator);
            //#]
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
        public void accepteventaction_8_enter() {
            animInstance().notifyStateEntered("ROOT.main.state_7.accepteventaction_8");
            pushNullConfig();
            state_7_subState = accepteventaction_8;
            state_7_active = accepteventaction_8;
            accepteventaction_8Enter();
        }
        
        //## statechart_method 
        public void mainEnter() {
        }
        
        //## statechart_method 
        public int startTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("1");
            start_exit();
            pobierz_temperature_otoczenia_entDef();
            animInstance().notifyTransitionEnded("1");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int start_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = startTakeNull();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = state_6_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void accepteventaction_8Enter() {
        }
        
        //## statechart_method 
        public int zadanie_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = zadanieTakeNull();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = state_7_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void zadanie_exit() {
            popNullConfig();
            zadanieExit();
            animInstance().notifyStateExited("ROOT.main.state_7.zadanie");
        }
        
        //## statechart_method 
        public void state_7Enter() {
        }
        
        //## statechart_method 
        public void main_entDef() {
            main_enter();
            state_6_entDef();
            state_7_entDef();
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            main_entDef();
        }
        
        //## statechart_method 
        public void state_6Enter() {
        }
        
        //## statechart_method 
        public void komunikacja_startEnter() {
        }
        
        //## statechart_method 
        public void main_exit() {
            state_6_exit();
            state_7_exit();
            mainExit();
            animInstance().notifyStateExited("ROOT.main");
        }
        
        //## statechart_method 
        public void state_6Exit() {
        }
        
        //## statechart_method 
        public void komunikacja_start_enter() {
            animInstance().notifyStateEntered("ROOT.main.state_7.komunikacja_start");
            state_7_subState = komunikacja_start;
            state_7_active = komunikacja_start;
            komunikacja_startEnter();
        }
        
        //## statechart_method 
        public void sendaction_10_entDef() {
            sendaction_10_enter();
        }
        
        //## statechart_method 
        public int zadanieTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("6");
            zadanie_exit();
            sendaction_10_entDef();
            animInstance().notifyTransitionEnded("6");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void main_enter() {
            animInstance().notifyStateEntered("ROOT.main");
            rootState_subState = main;
            rootState_active = main;
            mainEnter();
        }
        
        //## statechart_method 
        public void pobierz_temperature_otoczeniaEnter() {
            //#[ state ROOT.main.state_6.pobierz_temperature_otoczenia.(Entry) 
            temperatura = pomieszczenie.temperatura;
            
            //System.out.println("czujnikTemp: aktualizacja temperatury: " + temperatura);
            //#]
            itsRiJThread.schedTimeout(1000, CzujnikTemp_Timeout_pobierz_temperature_otoczenia_id, this, "ROOT.main.state_6.pobierz_temperature_otoczenia");
        }
        
        //## statechart_method 
        public void startExit() {
        }
        
        //## statechart_method 
        public void startEnter() {
        }
        
        //## statechart_method 
        public int accepteventaction_8_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = accepteventaction_8TakeNull();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = state_7_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void accepteventaction_8_exit() {
            popNullConfig();
            accepteventaction_8Exit();
            animInstance().notifyStateExited("ROOT.main.state_7.accepteventaction_8");
        }
        
        //## statechart_method 
        public void accepteventaction_8_entDef() {
            accepteventaction_8_enter();
        }
        
        //## statechart_method 
        public void komunikacja_start_entDef() {
            komunikacja_start_enter();
        }
        
        //## statechart_method 
        public int state_7_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void state_7_exit() {
            switch (state_7_subState) {
                case accepteventaction_8:
                {
                    accepteventaction_8_exit();
                }
                break;
                case komunikacja_start:
                {
                    komunikacja_start_exit();
                }
                break;
                case sendaction_10:
                {
                    sendaction_10_exit();
                }
                break;
                case zadanie:
                {
                    zadanie_exit();
                }
                break;
                default:
                    break;
            }
            state_7_subState = RiJNonState;
            state_7Exit();
            animInstance().notifyStateExited("ROOT.main.state_7");
        }
        
        //## statechart_method 
        public void state_7Exit() {
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public int pobierz_temperature_otoczeniaTakeRiJTimeout() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.getTimeoutId() == CzujnikTemp_Timeout_pobierz_temperature_otoczenia_id)
                {
                    animInstance().notifyTransitionStarted("2");
                    pobierz_temperature_otoczenia_exit();
                    pobierz_temperature_otoczenia_entDef();
                    animInstance().notifyTransitionEnded("2");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public void state_6_exit() {
            switch (state_6_subState) {
                case start:
                {
                    start_exit();
                }
                break;
                case pobierz_temperature_otoczenia:
                {
                    pobierz_temperature_otoczenia_exit();
                }
                break;
                default:
                    break;
            }
            state_6_subState = RiJNonState;
            state_6Exit();
            animInstance().notifyStateExited("ROOT.main.state_6");
        }
        
        //## statechart_method 
        public void komunikacja_start_exit() {
            komunikacja_startExit();
            animInstance().notifyStateExited("ROOT.main.state_7.komunikacja_start");
        }
        
        //## statechart_method 
        public void mainExit() {
        }
        
        //## statechart_method 
        public void pobierz_temperature_otoczenia_enter() {
            animInstance().notifyStateEntered("ROOT.main.state_6.pobierz_temperature_otoczenia");
            state_6_subState = pobierz_temperature_otoczenia;
            state_6_active = pobierz_temperature_otoczenia;
            pobierz_temperature_otoczeniaEnter();
        }
        
        //## statechart_method 
        public void start_enter() {
            animInstance().notifyStateEntered("ROOT.main.state_6.start");
            pushNullConfig();
            state_6_subState = start;
            state_6_active = start;
            startEnter();
        }
        
        //## statechart_method 
        public void state_6_enter() {
            animInstance().notifyStateEntered("ROOT.main.state_6");
            state_6Enter();
        }
        
        //## statechart_method 
        public int sendaction_10TakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("7");
            sendaction_10_exit();
            komunikacja_start_entDef();
            animInstance().notifyTransitionEnded("7");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void state_7_enter() {
            animInstance().notifyStateEntered("ROOT.main.state_7");
            state_7Enter();
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
            return CzujnikTemp.this.animInstance(); 
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassCzujnikTemp; 
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
        
        msg.add("temperatura", temperatura);
        msg.add("klimatyzator", klimatyzator);
        msg.add("pomieszczenie", pomieszczenie);
    }
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public void addRelations(AnimRelations msg) {
        
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(CzujnikTemp.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            CzujnikTemp.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            CzujnikTemp.this.addRelations(msg);
        }
        
        public void addStates(AnimStates msg) {
            if ((reactive != null) && (reactive.isTerminated() == false))
              reactive.rootState_add(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/CzujnikTemp.java
*********************************************************************/

