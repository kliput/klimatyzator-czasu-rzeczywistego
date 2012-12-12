/*********************************************************************
	Rhapsody	: 7.6.1
	Login		: Kuba
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Kompresor
//!	Generated Date	: Wed, 12, Dec 2012 
	File Path	: DefaultComponent/DefaultConfig/Default/Kompresor.java
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
// Default/Kompresor.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class Kompresor 
public class Kompresor implements RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassKompresor = new AnimClass("Default.Kompresor",false);
    //#]
    
    public Reactive reactive;		//## ignore 
    
    protected static final double MAX_MOC = 100;		//## attribute MAX_MOC 
    
    protected Klimatyzator klimatyzator;		//## attribute klimatyzator 
    
    protected double moc = 0;		//## attribute moc 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int main=1;
    public static final int state_7=2;
    public static final int ustawiono_param=3;
    public static final int set_start=4;
    public static final int sendaction_12=5;
    public static final int accepteventaction_9=6;
    public static final int state_6=7;
    public static final int start=8;
    public static final int stan_ok=9;
    public static final int sendaction_2=10;
    public static final int moc_awaryjna=11;
    //#]
    protected int rootState_subState;		//## ignore 
    
    protected int rootState_active;		//## ignore 
    
    protected int state_7_subState;		//## ignore 
    
    protected int state_7_active;		//## ignore 
    
    protected int state_6_subState;		//## ignore 
    
    protected int state_6_active;		//## ignore 
    
    public static final int Kompresor_Timeout_stan_ok_id = 1;		//## ignore 
    
    
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
    
    //## operation Kompresor() 
    public  Kompresor(RiJThread p_thread) {
        System.out.println("  -> Kompresor");;
        try {
            animInstance().notifyConstructorEntered(animClassKompresor.getUserClass(),
               new ArgData[] {
               });
        
        reactive = new Reactive(p_thread);
        //#[ operation Kompresor() 
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    /**
     * @param klimatyzator
    */
    //## operation setKlimatyzator(Klimatyzator) 
    public void setKlimatyzator(final Klimatyzator klimatyzator) {
        try {
            animInstance().notifyMethodEntered("setKlimatyzator",
               new ArgData[] {
                   new ArgData(Klimatyzator.class, "klimatyzator", AnimInstance.animToString(klimatyzator))
               });
        
        //#[ operation setKlimatyzator(Klimatyzator) 
        this.klimatyzator = klimatyzator;
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
        public int state_7_dispatchEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            switch (state_7_active) {
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
            animStates.add("ROOT.main.state_7.ustawiono_param");
        }
        
        //## statechart_method 
        public void set_start_add(AnimStates animStates) {
            animStates.add("ROOT.main.state_7.set_start");
        }
        
        //## statechart_method 
        public void sendaction_12_add(AnimStates animStates) {
            animStates.add("ROOT.main.state_7.sendaction_12");
        }
        
        //## statechart_method 
        public void accepteventaction_9_add(AnimStates animStates) {
            animStates.add("ROOT.main.state_7.accepteventaction_9");
        }
        
        //## statechart_method 
        public void state_6_add(AnimStates animStates) {
            animStates.add("ROOT.main.state_6");
            switch (state_6_subState) {
                case sendaction_2:
                {
                    sendaction_2_add(animStates);
                }
                break;
                case moc_awaryjna:
                {
                    moc_awaryjna_add(animStates);
                }
                break;
                case stan_ok:
                {
                    stan_ok_add(animStates);
                }
                break;
                case start:
                {
                    start_add(animStates);
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
                case sendaction_2:
                {
                    res = sendaction_2_takeEvent(id);
                }
                break;
                case moc_awaryjna:
                {
                    res = moc_awaryjna_takeEvent(id);
                }
                break;
                case stan_ok:
                {
                    res = stan_ok_takeEvent(id);
                }
                break;
                case start:
                {
                    res = start_takeEvent(id);
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
        public void stan_ok_add(AnimStates animStates) {
            animStates.add("ROOT.main.state_6.stan_ok");
        }
        
        //## statechart_method 
        public void sendaction_2_add(AnimStates animStates) {
            animStates.add("ROOT.main.state_6.sendaction_2");
        }
        
        //## statechart_method 
        public void moc_awaryjna_add(AnimStates animStates) {
            animStates.add("ROOT.main.state_6.moc_awaryjna");
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
        public void sendaction_2Exit() {
        }
        
        //## statechart_method 
        public void start_exit() {
            popNullConfig();
            startExit();
            animInstance().notifyStateExited("ROOT.main.state_6.start");
        }
        
        //## statechart_method 
        public void sendaction_2_exit() {
            popNullConfig();
            sendaction_2Exit();
            animInstance().notifyStateExited("ROOT.main.state_6.sendaction_2");
        }
        
        //## statechart_method 
        public void state_6_entDef() {
            state_6_enter();
            state_6EntDef();
        }
        
        //## statechart_method 
        public void sendaction_12Enter() {
            //#[ state ROOT.main.state_7.sendaction_12.(Entry) 
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
            animInstance().notifyStateExited("ROOT.main.state_7.ustawiono_param");
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
                    res = state_6_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void state_6EntDef() {
            animInstance().notifyTransitionStarted("0");
            start_entDef();
            animInstance().notifyTransitionEnded("0");
        }
        
        //## statechart_method 
        public int accepteventaction_9TakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("8");
            accepteventaction_9_exit();
            //#[ transition 8 
            moc = params.dane;
            //#]
            ustawiono_param_entDef();
            animInstance().notifyTransitionEnded("8");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void state_7EntDef() {
            animInstance().notifyTransitionStarted("11");
            set_start_entDef();
            animInstance().notifyTransitionEnded("11");
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
                    res = state_6_takeEvent(id);
                }
            return res;
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
        public int main_takeEvent(short id) {
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
            animInstance().notifyStateExited("ROOT.main.state_7.sendaction_12");
        }
        
        //## statechart_method 
        public void ustawiono_param_entDef() {
            ustawiono_param_enter();
        }
        
        //## statechart_method 
        public void sendaction_2_enter() {
            animInstance().notifyStateEntered("ROOT.main.state_6.sendaction_2");
            pushNullConfig();
            state_6_subState = sendaction_2;
            state_6_active = sendaction_2;
            sendaction_2Enter();
        }
        
        //## statechart_method 
        public void stan_ok_enter() {
            animInstance().notifyStateEntered("ROOT.main.state_6.stan_ok");
            state_6_subState = stan_ok;
            state_6_active = stan_ok;
            stan_okEnter();
        }
        
        //## statechart_method 
        public void stan_okEnter() {
            itsRiJThread.schedTimeout(500, Kompresor_Timeout_stan_ok_id, this, "ROOT.main.state_6.stan_ok");
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
                    res = state_7_takeEvent(id);
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
                    res = state_6_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void moc_awaryjna_enter() {
            animInstance().notifyStateEntered("ROOT.main.state_6.moc_awaryjna");
            pushNullConfig();
            state_6_subState = moc_awaryjna;
            state_6_active = moc_awaryjna;
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
                    res = state_7_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void sendaction_12Exit() {
        }
        
        //## statechart_method 
        public void sendaction_12_enter() {
            animInstance().notifyStateEntered("ROOT.main.state_7.sendaction_12");
            pushNullConfig();
            state_7_subState = sendaction_12;
            state_7_active = sendaction_12;
            sendaction_12Enter();
        }
        
        //## statechart_method 
        public void ustawiono_param_enter() {
            animInstance().notifyStateEntered("ROOT.main.state_7.ustawiono_param");
            pushNullConfig();
            state_7_subState = ustawiono_param;
            state_7_active = ustawiono_param;
            ustawiono_paramEnter();
        }
        
        //## statechart_method 
        public int rootState_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void moc_awaryjnaEnter() {
            //#[ state ROOT.main.state_6.moc_awaryjna.(Entry) 
            moc = MAX_MOC - 1;
            double mocTmp = moc;
            System.out.println("Kompresor: current moc > MAX_MOC ("+ mocTmp +" > " + MAX_MOC +")");
            //#]
        }
        
        //## statechart_method 
        public void state_7_entDef() {
            state_7_enter();
            state_7EntDef();
        }
        
        //## statechart_method 
        public void stan_ok_exit() {
            stan_okExit();
            animInstance().notifyStateExited("ROOT.main.state_6.stan_ok");
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
            if(event.getTimeoutId() == Kompresor_Timeout_stan_ok_id)
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
            itsRiJThread.unschedTimeout(Kompresor_Timeout_stan_ok_id, this);
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
            animInstance().notifyStateEntered("ROOT.main.state_7.accepteventaction_9");
            pushNullConfig();
            state_7_subState = accepteventaction_9;
            state_7_active = accepteventaction_9;
            accepteventaction_9Enter();
        }
        
        //## statechart_method 
        public int sendaction_12TakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("10");
            sendaction_12_exit();
            set_start_entDef();
            animInstance().notifyTransitionEnded("10");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void mainEnter() {
        }
        
        //## statechart_method 
        public void moc_awaryjna_exit() {
            popNullConfig();
            moc_awaryjnaExit();
            animInstance().notifyStateExited("ROOT.main.state_6.moc_awaryjna");
        }
        
        //## statechart_method 
        public int startTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            //## transition 3 
            if(moc > MAX_MOC || moc < 0)
                {
                    animInstance().notifyTransitionStarted("1");
                    animInstance().notifyTransitionStarted("3");
                    start_exit();
                    sendaction_2_entDef();
                    animInstance().notifyTransitionEnded("3");
                    animInstance().notifyTransitionEnded("1");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            else
                {
                    animInstance().notifyTransitionStarted("1");
                    animInstance().notifyTransitionStarted("2");
                    start_exit();
                    stan_ok_entDef();
                    animInstance().notifyTransitionEnded("2");
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
                    res = state_6_takeEvent(id);
                }
            return res;
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
        public void state_6Enter() {
        }
        
        //## statechart_method 
        public void set_start_entDef() {
            set_start_enter();
        }
        
        //## statechart_method 
        public int ustawiono_paramTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("9");
            ustawiono_param_exit();
            sendaction_12_entDef();
            animInstance().notifyTransitionEnded("9");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void main_exit() {
            state_6_exit();
            state_7_exit();
            mainExit();
            animInstance().notifyStateExited("ROOT.main");
        }
        
        //## statechart_method 
        public void moc_awaryjnaExit() {
        }
        
        //## statechart_method 
        public void state_6Exit() {
        }
        
        //## statechart_method 
        public void accepteventaction_9_exit() {
            popNullConfig();
            accepteventaction_9Exit();
            animInstance().notifyStateExited("ROOT.main.state_7.accepteventaction_9");
        }
        
        //## statechart_method 
        public void set_start_enter() {
            animInstance().notifyStateEntered("ROOT.main.state_7.set_start");
            state_7_subState = set_start;
            state_7_active = set_start;
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
                    res = state_7_takeEvent(id);
                }
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
        public int state_7_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void state_7_exit() {
            switch (state_7_subState) {
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
        public void sendaction_2Enter() {
            //#[ state ROOT.main.state_6.sendaction_2.(Entry) 
            klimatyzator.gen(new Default.awaria());
            //#]
        }
        
        //## statechart_method 
        public void sendaction_2_entDef() {
            sendaction_2_enter();
        }
        
        //## statechart_method 
        public void state_6_exit() {
            switch (state_6_subState) {
                case sendaction_2:
                {
                    sendaction_2_exit();
                }
                break;
                case moc_awaryjna:
                {
                    moc_awaryjna_exit();
                }
                break;
                case stan_ok:
                {
                    stan_ok_exit();
                }
                break;
                case start:
                {
                    start_exit();
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
        public int set_startTakeodbiorDanych() {
            odbiorDanych params = (odbiorDanych) event;
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("7");
            set_start_exit();
            accepteventaction_9_entDef();
            animInstance().notifyTransitionEnded("7");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void ustawiono_paramEnter() {
        }
        
        //## statechart_method 
        public void mainExit() {
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
        public void set_start_exit() {
            set_startExit();
            animInstance().notifyStateExited("ROOT.main.state_7.set_start");
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
            return Kompresor.this.animInstance(); 
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassKompresor; 
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
            super(Kompresor.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            Kompresor.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            Kompresor.this.addRelations(msg);
        }
        
        public void addStates(AnimStates msg) {
            if ((reactive != null) && (reactive.isTerminated() == false))
              reactive.rootState_add(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/Kompresor.java
*********************************************************************/

