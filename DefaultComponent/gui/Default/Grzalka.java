/*********************************************************************
	Rhapsody	: 8.0
	Login		: Piotrek
	Component	: DefaultComponent
	Configuration 	: gui
	Model Element	: Grzalka
//!	Generated Date	: Wed, 12, Dec 2012 
	File Path	: DefaultComponent/gui/Default/Grzalka.java
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
    public static final int start=1;
    public static final int stan_ok=2;
    public static final int sendaction_2=3;
    public static final int moc_awaryjna=4;
    //#]
    protected int rootState_subState;		//## ignore 
    
    protected int rootState_active;		//## ignore 
    
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
            animStates.add("ROOT.start");
        }
        
        //## statechart_method 
        public void stan_ok_add(AnimStates animStates) {
            animStates.add("ROOT.stan_ok");
        }
        
        //## statechart_method 
        public void sendaction_2_add(AnimStates animStates) {
            animStates.add("ROOT.sendaction_2");
        }
        
        //## statechart_method 
        public void moc_awaryjna_add(AnimStates animStates) {
            animStates.add("ROOT.moc_awaryjna");
        }
        
        //## auto_generated 
        protected void initStatechart() {
            rootState_subState = RiJNonState;
            rootState_active = RiJNonState;
        }
        
        //## statechart_method 
        public void sendaction_2Exit() {
        }
        
        //## statechart_method 
        public void start_exit() {
            popNullConfig();
            startExit();
            animInstance().notifyStateExited("ROOT.start");
        }
        
        //## statechart_method 
        public void sendaction_2_exit() {
            popNullConfig();
            sendaction_2Exit();
            animInstance().notifyStateExited("ROOT.sendaction_2");
        }
        
        //## statechart_method 
        public int sendaction_2_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = sendaction_2TakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int stan_ok_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.TIMEOUT_EVENT_ID))
                {
                    res = stan_okTakeRiJTimeout();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void start_entDef() {
            start_enter();
        }
        
        //## statechart_method 
        public void sendaction_2_enter() {
            animInstance().notifyStateEntered("ROOT.sendaction_2");
            pushNullConfig();
            rootState_subState = sendaction_2;
            rootState_active = sendaction_2;
            sendaction_2Enter();
        }
        
        //## statechart_method 
        public void stan_ok_enter() {
            animInstance().notifyStateEntered("ROOT.stan_ok");
            rootState_subState = stan_ok;
            rootState_active = stan_ok;
            stan_okEnter();
        }
        
        //## statechart_method 
        public void stan_okEnter() {
            itsRiJThread.schedTimeout(500, Grzalka_Timeout_stan_ok_id, this, "ROOT.stan_ok");
        }
        
        //## statechart_method 
        public int moc_awaryjna_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = moc_awaryjnaTakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void moc_awaryjna_enter() {
            animInstance().notifyStateEntered("ROOT.moc_awaryjna");
            pushNullConfig();
            rootState_subState = moc_awaryjna;
            rootState_active = moc_awaryjna;
            moc_awaryjnaEnter();
        }
        
        //## statechart_method 
        public int rootState_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void moc_awaryjnaEnter() {
            //#[ state ROOT.moc_awaryjna.(Entry) 
            moc = MAX_MOC - 1;
            double mocTmp = moc;
            System.out.println("Kompresor: current moc > MAX_MOC ("+ mocTmp +" > " + MAX_MOC +")");
            //#]
        }
        
        //## statechart_method 
        public void stan_ok_exit() {
            stan_okExit();
            animInstance().notifyStateExited("ROOT.stan_ok");
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
        public void moc_awaryjna_exit() {
            popNullConfig();
            moc_awaryjnaExit();
            animInstance().notifyStateExited("ROOT.moc_awaryjna");
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
        public void moc_awaryjnaExit() {
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
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public void sendaction_2Enter() {
            //#[ state ROOT.sendaction_2.(Entry) 
            klimatyzator.gen(new Default.awaria());
            //#]
        }
        
        //## statechart_method 
        public void sendaction_2_entDef() {
            sendaction_2_enter();
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
	File Path	: DefaultComponent/gui/Default/Grzalka.java
*********************************************************************/

