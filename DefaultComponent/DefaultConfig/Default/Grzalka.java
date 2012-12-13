/*********************************************************************
	Rhapsody	: 8.0
	Login		: Piotrek
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Grzalka
//!	Generated Date	: Thu, 13, Dec 2012 
	File Path	: DefaultComponent/DefaultConfig/Default/Grzalka.java
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
// Default/Grzalka.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class Grzalka 
public class Grzalka implements RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassGrzalka = new AnimClass("Default.Grzalka",false);
    //#]
    
    public Reactive reactive;		//## ignore 
    
    protected static final double MAX_MOC = 100;		//## attribute MAX_MOC 
    
    protected Klimatyzator klimatyzator;		//## attribute klimatyzator 
    
    protected double moc = 0;		//## attribute moc 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int state_4=1;
    public static final int state_6=2;
    public static final int ustawiono_param=3;
    public static final int set_start=4;
    public static final int sendaction_12=5;
    public static final int accepteventaction_9=6;
    public static final int state_5=7;
    public static final int start=8;
    public static final int stan_ok=9;
    public static final int sendaction_2=10;
    public static final int moc_awaryjna=11;
    //#]
    protected int rootState_subState;		//## ignore 
    
    protected int rootState_active;		//## ignore 
    
    protected int state_6_subState;		//## ignore 
    
    protected int state_6_active;		//## ignore 
    
    protected int state_5_subState;		//## ignore 
    
    protected int state_5_active;		//## ignore 
    
    public static final int Grzalka_Timeout_stan_ok_id = 1;		//## ignore 
    
    
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
    
    //## operation Grzalka() 
    public  Grzalka(RiJThread p_thread) {
        System.out.println("  -> Grzalka");;
        try {
            animInstance().notifyConstructorEntered(animClassGrzalka.getUserClass(),
               new ArgData[] {
               });
        
        reactive = new Reactive(p_thread);
        //#[ operation Grzalka() 
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
    
    //## auto_generated 
    public static final double getMAX_MOC() {
        return MAX_MOC;
    }
    
    //## auto_generated 
    public Klimatyzator getKlimatyzator() {
        return klimatyzator;
    }
    
    //## auto_generated 
    public double getMoc() {
        return moc;
    }
    
    //## auto_generated 
    public void setMoc(double p_moc) {
        try {
        moc = p_moc;
        }
        finally {
            animInstance().notifyUpdatedAttr();
        }
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
            if(state_5 == state)
                {
                    return isIn(state_4);
                }
            if(state_5_subState == state)
                {
                    return true;
                }
            if(state_6 == state)
                {
                    return isIn(state_4);
                }
            if(state_6_subState == state)
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
            if(rootState_subState == state_4)
                {
                    state_4_add(animStates);
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
            if(rootState_active == state_4)
                {
                    res = state_4_dispatchEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void state_4_add(AnimStates animStates) {
            animStates.add("ROOT.state_4");
            state_5_add(animStates);
            state_6_add(animStates);
        }
        
        //## statechart_method 
        public int state_4_dispatchEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(state_5_dispatchEvent(id) >= 0)
                {
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                    if(!isIn(state_4))
                        {
                            return res;
                        }
                }
            if(state_6_dispatchEvent(id) >= 0)
                {
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                    if(!isIn(state_4))
                        {
                            return res;
                        }
                }
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = state_4_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void state_6_add(AnimStates animStates) {
            animStates.add("ROOT.state_4.state_6");
            switch (state_6_subState) {
                case set_start:
                {
                    set_start_add(animStates);
                }
                break;
                case accepteventaction_9:
                {
                    accepteventaction_9_add(animStates);
                }
                break;
                case ustawiono_param:
                {
                    ustawiono_param_add(animStates);
                }
                break;
                case sendaction_12:
                {
                    sendaction_12_add(animStates);
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
                case set_start:
                {
                    res = set_start_takeEvent(id);
                }
                break;
                case accepteventaction_9:
                {
                    res = accepteventaction_9_takeEvent(id);
                }
                break;
                case ustawiono_param:
                {
                    res = ustawiono_param_takeEvent(id);
                }
                break;
                case sendaction_12:
                {
                    res = sendaction_12_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## statechart_method 
        public void ustawiono_param_add(AnimStates animStates) {
            animStates.add("ROOT.state_4.state_6.ustawiono_param");
        }
        
        //## statechart_method 
        public void set_start_add(AnimStates animStates) {
            animStates.add("ROOT.state_4.state_6.set_start");
        }
        
        //## statechart_method 
        public void sendaction_12_add(AnimStates animStates) {
            animStates.add("ROOT.state_4.state_6.sendaction_12");
        }
        
        //## statechart_method 
        public void accepteventaction_9_add(AnimStates animStates) {
            animStates.add("ROOT.state_4.state_6.accepteventaction_9");
        }
        
        //## statechart_method 
        public void state_5_add(AnimStates animStates) {
            animStates.add("ROOT.state_4.state_5");
            switch (state_5_subState) {
                case start:
                {
                    start_add(animStates);
                }
                break;
                case sendaction_2:
                {
                    sendaction_2_add(animStates);
                }
                break;
                case stan_ok:
                {
                    stan_ok_add(animStates);
                }
                break;
                case moc_awaryjna:
                {
                    moc_awaryjna_add(animStates);
                }
                break;
                default:
                    break;
            }
        }
        
        //## statechart_method 
        public int state_5_dispatchEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            switch (state_5_active) {
                case start:
                {
                    res = start_takeEvent(id);
                }
                break;
                case sendaction_2:
                {
                    res = sendaction_2_takeEvent(id);
                }
                break;
                case stan_ok:
                {
                    res = stan_ok_takeEvent(id);
                }
                break;
                case moc_awaryjna:
                {
                    res = moc_awaryjna_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## statechart_method 
        public void start_add(AnimStates animStates) {
            animStates.add("ROOT.state_4.state_5.start");
        }
        
        //## statechart_method 
        public void stan_ok_add(AnimStates animStates) {
            animStates.add("ROOT.state_4.state_5.stan_ok");
        }
        
        //## statechart_method 
        public void sendaction_2_add(AnimStates animStates) {
            animStates.add("ROOT.state_4.state_5.sendaction_2");
        }
        
        //## statechart_method 
        public void moc_awaryjna_add(AnimStates animStates) {
            animStates.add("ROOT.state_4.state_5.moc_awaryjna");
        }
        
        //## auto_generated 
        protected void initStatechart() {
            rootState_subState = RiJNonState;
            rootState_active = RiJNonState;
            state_6_subState = RiJNonState;
            state_6_active = RiJNonState;
            state_5_subState = RiJNonState;
            state_5_active = RiJNonState;
        }
        
        //## statechart_method 
        public void sendaction_2Exit() {
        }
        
        //## statechart_method 
        public void start_exit() {
            popNullConfig();
            startExit();
            animInstance().notifyStateExited("ROOT.state_4.state_5.start");
        }
        
        //## statechart_method 
        public void state_4_exit() {
            state_5_exit();
            state_6_exit();
            state_4Exit();
            animInstance().notifyStateExited("ROOT.state_4");
        }
        
        //## statechart_method 
        public void sendaction_2_exit() {
            popNullConfig();
            sendaction_2Exit();
            animInstance().notifyStateExited("ROOT.state_4.state_5.sendaction_2");
        }
        
        //## statechart_method 
        public void state_5EntDef() {
            animInstance().notifyTransitionStarted("0");
            start_entDef();
            animInstance().notifyTransitionEnded("0");
        }
        
        //## statechart_method 
        public void sendaction_12Enter() {
            //#[ state ROOT.state_4.state_6.sendaction_12.(Entry) 
            klimatyzator.gen(new Default.odbiorDanych(moc));
            //#]
        }
        
        //## statechart_method 
        public void set_startExit() {
        }
        
        //## statechart_method 
        public void ustawiono_param_exit() {
            popNullConfig();
            ustawiono_paramExit();
            animInstance().notifyStateExited("ROOT.state_4.state_6.ustawiono_param");
        }
        
        //## statechart_method 
        public void state_6_entDef() {
            state_6_enter();
            state_6EntDef();
        }
        
        //## statechart_method 
        public int sendaction_2_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = sendaction_2TakeNull();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = state_5_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public int accepteventaction_9TakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("9");
            accepteventaction_9_exit();
            ustawiono_param_entDef();
            animInstance().notifyTransitionEnded("9");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void state_6EntDef() {
            animInstance().notifyTransitionStarted("7");
            set_start_entDef();
            animInstance().notifyTransitionEnded("7");
        }
        
        //## statechart_method 
        public int stan_ok_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.TIMEOUT_EVENT_ID))
                {
                    res = stan_okTakeRiJTimeout();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = state_5_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void accepteventaction_9_entDef() {
            accepteventaction_9_enter();
        }
        
        //## statechart_method 
        public int state_6_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void start_entDef() {
            start_enter();
        }
        
        //## statechart_method 
        public void sendaction_12_exit() {
            popNullConfig();
            sendaction_12Exit();
            animInstance().notifyStateExited("ROOT.state_4.state_6.sendaction_12");
        }
        
        //## statechart_method 
        public void ustawiono_param_entDef() {
            ustawiono_param_enter();
        }
        
        //## statechart_method 
        public void sendaction_2_enter() {
            animInstance().notifyStateEntered("ROOT.state_4.state_5.sendaction_2");
            pushNullConfig();
            state_5_subState = sendaction_2;
            state_5_active = sendaction_2;
            sendaction_2Enter();
        }
        
        //## statechart_method 
        public void stan_ok_enter() {
            animInstance().notifyStateEntered("ROOT.state_4.state_5.stan_ok");
            state_5_subState = stan_ok;
            state_5_active = stan_ok;
            stan_okEnter();
        }
        
        //## statechart_method 
        public void stan_okEnter() {
            itsRiJThread.schedTimeout(500, Grzalka_Timeout_stan_ok_id, this, "ROOT.state_4.state_5.stan_ok");
        }
        
        //## statechart_method 
        public int set_start_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(odbiorDanych.odbiorDanych_Default_id))
                {
                    res = set_startTakeodbiorDanych();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = state_6_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public int moc_awaryjna_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = moc_awaryjnaTakeNull();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = state_5_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void moc_awaryjna_enter() {
            animInstance().notifyStateEntered("ROOT.state_4.state_5.moc_awaryjna");
            pushNullConfig();
            state_5_subState = moc_awaryjna;
            state_5_active = moc_awaryjna;
            moc_awaryjnaEnter();
        }
        
        //## statechart_method 
        public int sendaction_12_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = sendaction_12TakeNull();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = state_6_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void sendaction_12Exit() {
        }
        
        //## statechart_method 
        public void sendaction_12_enter() {
            animInstance().notifyStateEntered("ROOT.state_4.state_6.sendaction_12");
            pushNullConfig();
            state_6_subState = sendaction_12;
            state_6_active = sendaction_12;
            sendaction_12Enter();
        }
        
        //## statechart_method 
        public void ustawiono_param_enter() {
            animInstance().notifyStateEntered("ROOT.state_4.state_6.ustawiono_param");
            pushNullConfig();
            state_6_subState = ustawiono_param;
            state_6_active = ustawiono_param;
            ustawiono_paramEnter();
        }
        
        //## statechart_method 
        public void state_4_entDef() {
            state_4_enter();
            state_5_entDef();
            state_6_entDef();
        }
        
        //## statechart_method 
        public int rootState_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void moc_awaryjnaEnter() {
            //#[ state ROOT.state_4.state_5.moc_awaryjna.(Entry) 
            moc = MAX_MOC - 1;
            double mocTmp = moc;
            System.out.println("Kompresor: current moc > MAX_MOC ("+ mocTmp +" > " + MAX_MOC +")");
            //#]
        }
        
        //## statechart_method 
        public void stan_ok_exit() {
            stan_okExit();
            animInstance().notifyStateExited("ROOT.state_4.state_5.stan_ok");
        }
        
        //## statechart_method 
        public int state_5_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void sendaction_12_entDef() {
            sendaction_12_enter();
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
        public int stan_okTakeRiJTimeout() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.getTimeoutId() == Grzalka_Timeout_stan_ok_id)
                {
                    animInstance().notifyTransitionStarted("4");
                    stan_ok_exit();
                    start_entDef();
                    animInstance().notifyTransitionEnded("4");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public void stan_okExit() {
            itsRiJThread.unschedTimeout(Grzalka_Timeout_stan_ok_id, this);
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
                    res = state_6_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void accepteventaction_9Exit() {
        }
        
        //## statechart_method 
        public void accepteventaction_9_enter() {
            animInstance().notifyStateEntered("ROOT.state_4.state_6.accepteventaction_9");
            pushNullConfig();
            state_6_subState = accepteventaction_9;
            state_6_active = accepteventaction_9;
            accepteventaction_9Enter();
        }
        
        //## statechart_method 
        public int sendaction_12TakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("11");
            sendaction_12_exit();
            set_start_entDef();
            animInstance().notifyTransitionEnded("11");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void moc_awaryjna_exit() {
            popNullConfig();
            moc_awaryjnaExit();
            animInstance().notifyStateExited("ROOT.state_4.state_5.moc_awaryjna");
        }
        
        //## statechart_method 
        public int startTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            //## transition 2 
            if(moc > MAX_MOC || moc < 0)
                {
                    animInstance().notifyTransitionStarted("1");
                    animInstance().notifyTransitionStarted("2");
                    start_exit();
                    sendaction_2_entDef();
                    animInstance().notifyTransitionEnded("2");
                    animInstance().notifyTransitionEnded("1");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            else
                {
                    animInstance().notifyTransitionStarted("1");
                    animInstance().notifyTransitionStarted("3");
                    start_exit();
                    stan_ok_entDef();
                    animInstance().notifyTransitionEnded("3");
                    animInstance().notifyTransitionEnded("1");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public void accepteventaction_9Enter() {
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
                    res = state_5_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void state_4Exit() {
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            state_4_entDef();
        }
        
        //## statechart_method 
        public int sendaction_2TakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("6");
            sendaction_2_exit();
            moc_awaryjna_entDef();
            animInstance().notifyTransitionEnded("6");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void state_5Exit() {
        }
        
        //## statechart_method 
        public void state_5_entDef() {
            state_5_enter();
            state_5EntDef();
        }
        
        //## statechart_method 
        public void set_start_entDef() {
            set_start_enter();
        }
        
        //## statechart_method 
        public int ustawiono_paramTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("10");
            ustawiono_param_exit();
            sendaction_12_entDef();
            animInstance().notifyTransitionEnded("10");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void state_6Enter() {
        }
        
        //## statechart_method 
        public void moc_awaryjnaExit() {
        }
        
        //## statechart_method 
        public void state_5Enter() {
        }
        
        //## statechart_method 
        public void accepteventaction_9_exit() {
            popNullConfig();
            accepteventaction_9Exit();
            animInstance().notifyStateExited("ROOT.state_4.state_6.accepteventaction_9");
        }
        
        //## statechart_method 
        public void set_start_enter() {
            animInstance().notifyStateEntered("ROOT.state_4.state_6.set_start");
            state_6_subState = set_start;
            state_6_active = set_start;
            set_startEnter();
        }
        
        //## statechart_method 
        public void set_startEnter() {
        }
        
        //## statechart_method 
        public int ustawiono_param_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = ustawiono_paramTakeNull();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = state_6_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void state_6Exit() {
        }
        
        //## statechart_method 
        public void moc_awaryjna_entDef() {
            moc_awaryjna_enter();
        }
        
        //## statechart_method 
        public void startExit() {
        }
        
        //## statechart_method 
        public void startEnter() {
        }
        
        //## statechart_method 
        public void ustawiono_paramExit() {
        }
        
        //## statechart_method 
        public int state_4_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void state_4_enter() {
            animInstance().notifyStateEntered("ROOT.state_4");
            rootState_subState = state_4;
            rootState_active = state_4;
            state_4Enter();
        }
        
        //## statechart_method 
        public void state_4Enter() {
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public void sendaction_2Enter() {
            //#[ state ROOT.state_4.state_5.sendaction_2.(Entry) 
            klimatyzator.gen(new Default.awaria());
            //#]
        }
        
        //## statechart_method 
        public void sendaction_2_entDef() {
            sendaction_2_enter();
        }
        
        //## statechart_method 
        public void state_5_enter() {
            animInstance().notifyStateEntered("ROOT.state_4.state_5");
            state_5Enter();
        }
        
        //## statechart_method 
        public int set_startTakeodbiorDanych() {
            odbiorDanych params = (odbiorDanych) event;
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("8");
            set_start_exit();
            //#[ transition 8 
            moc = params.dane;
            //#]
            accepteventaction_9_entDef();
            animInstance().notifyTransitionEnded("8");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void ustawiono_paramEnter() {
        }
        
        //## statechart_method 
        public void state_6_exit() {
            switch (state_6_subState) {
                case set_start:
                {
                    set_start_exit();
                }
                break;
                case accepteventaction_9:
                {
                    accepteventaction_9_exit();
                }
                break;
                case ustawiono_param:
                {
                    ustawiono_param_exit();
                }
                break;
                case sendaction_12:
                {
                    sendaction_12_exit();
                }
                break;
                default:
                    break;
            }
            state_6_subState = RiJNonState;
            state_6Exit();
            animInstance().notifyStateExited("ROOT.state_4.state_6");
        }
        
        //## statechart_method 
        public int moc_awaryjnaTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("5");
            moc_awaryjna_exit();
            start_entDef();
            animInstance().notifyTransitionEnded("5");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void stan_ok_entDef() {
            stan_ok_enter();
        }
        
        //## statechart_method 
        public void start_enter() {
            animInstance().notifyStateEntered("ROOT.state_4.state_5.start");
            pushNullConfig();
            state_5_subState = start;
            state_5_active = start;
            startEnter();
        }
        
        //## statechart_method 
        public void state_5_exit() {
            switch (state_5_subState) {
                case start:
                {
                    start_exit();
                }
                break;
                case sendaction_2:
                {
                    sendaction_2_exit();
                }
                break;
                case stan_ok:
                {
                    stan_ok_exit();
                }
                break;
                case moc_awaryjna:
                {
                    moc_awaryjna_exit();
                }
                break;
                default:
                    break;
            }
            state_5_subState = RiJNonState;
            state_5Exit();
            animInstance().notifyStateExited("ROOT.state_4.state_5");
        }
        
        //## statechart_method 
        public void set_start_exit() {
            set_startExit();
            animInstance().notifyStateExited("ROOT.state_4.state_6.set_start");
        }
        
        //## statechart_method 
        public void state_6_enter() {
            animInstance().notifyStateEntered("ROOT.state_4.state_6");
            state_6Enter();
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
            return Grzalka.this.animInstance(); 
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassGrzalka; 
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
        
        msg.add("moc", moc);
        msg.add("MAX_MOC", MAX_MOC);
        msg.add("klimatyzator", klimatyzator);
    }
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public void addRelations(AnimRelations msg) {
        
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(Grzalka.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            Grzalka.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            Grzalka.this.addRelations(msg);
        }
        
        public void addStates(AnimStates msg) {
            if ((reactive != null) && (reactive.isTerminated() == false))
              reactive.rootState_add(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/Grzalka.java
*********************************************************************/

