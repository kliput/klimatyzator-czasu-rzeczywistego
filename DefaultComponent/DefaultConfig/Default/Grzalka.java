/*********************************************************************
	Rhapsody	: 8.0
	Login		: Piotrek
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Grzalka
//!	Generated Date	: Thu, 22, Nov 2012 
	File Path	: DefaultComponent/DefaultConfig/Default/Grzalka.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.oxf.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.states.*;

//----------------------------------------------------------------------------
// Default/Grzalka.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class Grzalka 
public class Grzalka implements RiJStateConcept {
    
    public Reactive reactive;		//## ignore 
    
    protected int chcianaTemp;		//## attribute chcianaTemp 
    
    protected double mocGrzania;		//## attribute mocGrzania 
    
    protected int obecnaTemp;		//## attribute obecnaTemp 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int zwieksz_moc=1;
    public static final int zmniejsz_moc=2;
    public static final int start=3;
    public static final int check=4;
    //#]
    protected int rootState_subState;		//## ignore 
    
    protected int rootState_active;		//## ignore 
    
    public static final int Grzalka_Timeout_check_id = 1;		//## ignore 
    
    
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
        reactive = new Reactive(p_thread);
        //#[ operation Grzalka() 
        //#]
    }
    
    /**
     * @param chcianaTemp
    */
    //## operation ustawChcianaTemp(int) 
    public void ustawChcianaTemp(int chcianaTemp) {
        //#[ operation ustawChcianaTemp(int) 
        this.chcianaTemp = chcianaTemp;
        //#]
    }
    
    //## auto_generated 
    public int getChcianaTemp() {
        return chcianaTemp;
    }
    
    //## auto_generated 
    public void setChcianaTemp(int p_chcianaTemp) {
        chcianaTemp = p_chcianaTemp;
    }
    
    //## auto_generated 
    public double getMocGrzania() {
        return mocGrzania;
    }
    
    //## auto_generated 
    public void setMocGrzania(double p_mocGrzania) {
        mocGrzania = p_mocGrzania;
    }
    
    //## auto_generated 
    public int getObecnaTemp() {
        return obecnaTemp;
    }
    
    //## auto_generated 
    public void setObecnaTemp(int p_obecnaTemp) {
        obecnaTemp = p_obecnaTemp;
    }
    
    //## auto_generated 
    public boolean startBehavior() {
        boolean done = false;
        done = reactive.startBehavior();
        return done;
    }
    
    //## ignore 
    public class Reactive extends RiJStateReactive {
        
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
                case zmniejsz_moc:
                {
                    res = zmniejsz_moc_takeEvent(id);
                }
                break;
                case zwieksz_moc:
                {
                    res = zwieksz_moc_takeEvent(id);
                }
                break;
                case check:
                {
                    res = check_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## auto_generated 
        protected void initStatechart() {
            rootState_subState = RiJNonState;
            rootState_active = RiJNonState;
        }
        
        //## statechart_method 
        public void start_exit() {
            popNullConfig();
            startExit();
        }
        
        //## statechart_method 
        public void check_enter() {
            rootState_subState = check;
            rootState_active = check;
            checkEnter();
        }
        
        //## statechart_method 
        public int zwieksz_mocTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            zwieksz_moc_exit();
            check_entDef();
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void check_exit() {
            checkExit();
        }
        
        //## statechart_method 
        public void zmniejsz_moc_exit() {
            popNullConfig();
            zmniejsz_mocExit();
        }
        
        //## statechart_method 
        public void zmniejsz_moc_entDef() {
            zmniejsz_moc_enter();
        }
        
        //## statechart_method 
        public int check_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.TIMEOUT_EVENT_ID))
                {
                    res = checkTakeRiJTimeout();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void start_entDef() {
            start_enter();
        }
        
        //## statechart_method 
        public void checkExit() {
            itsRiJThread.unschedTimeout(Grzalka_Timeout_check_id, this);
        }
        
        //## statechart_method 
        public int checkTakeRiJTimeout() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.getTimeoutId() == Grzalka_Timeout_check_id)
                {
                    //## transition 1 
                    if(chcianaTemp <= obecnaTemp)
                        {
                            check_exit();
                            zmniejsz_moc_entDef();
                            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                        }
                    else
                        {
                            //## transition 2 
                            if(chcianaTemp > obecnaTemp)
                                {
                                    check_exit();
                                    zwieksz_moc_entDef();
                                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                                }
                        }
                }
            return res;
        }
        
        //## statechart_method 
        public int zmniejsz_moc_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = zmniejsz_mocTakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void zmniejsz_moc_enter() {
            pushNullConfig();
            rootState_subState = zmniejsz_moc;
            rootState_active = zmniejsz_moc;
            zmniejsz_mocEnter();
        }
        
        //## statechart_method 
        public int rootState_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void rootState_enter() {
            rootStateEnter();
        }
        
        //## statechart_method 
        public void rootStateEnter() {
        }
        
        //## statechart_method 
        public void zmniejsz_mocExit() {
        }
        
        //## statechart_method 
        public void zwieksz_moc_enter() {
            pushNullConfig();
            rootState_subState = zwieksz_moc;
            rootState_active = zwieksz_moc;
            zwieksz_mocEnter();
        }
        
        //## statechart_method 
        public void zwieksz_moc_entDef() {
            zwieksz_moc_enter();
        }
        
        //## statechart_method 
        public void check_entDef() {
            check_enter();
        }
        
        //## statechart_method 
        public int startTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            start_exit();
            check_entDef();
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
            
            return res;
        }
        
        //## statechart_method 
        public void zwieksz_mocExit() {
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            start_entDef();
        }
        
        //## statechart_method 
        public void zwieksz_mocEnter() {
            //#[ state zwieksz_moc.(Entry) 
            mocGrzania = 0.1;
            //#]
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
        public int zmniejsz_mocTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            zmniejsz_moc_exit();
            check_entDef();
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int zwieksz_moc_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = zwieksz_mocTakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void zwieksz_moc_exit() {
            popNullConfig();
            zwieksz_mocExit();
        }
        
        //## statechart_method 
        public void checkEnter() {
            //#[ state check.(Entry) 
            obecnaTemp += mocGrzania * chcianaTemp;
            System.out.println(chcianaTemp + " "+ obecnaTemp + " " + mocGrzania);
            //#]
            itsRiJThread.schedTimeout(100, Grzalka_Timeout_check_id, this, null);
        }
        
        //## statechart_method 
        public void start_enter() {
            pushNullConfig();
            rootState_subState = start;
            rootState_active = start;
            startEnter();
        }
        
        //## statechart_method 
        public void zmniejsz_mocEnter() {
            //#[ state zmniejsz_moc.(Entry) 
            mocGrzania = -0.1;
            //#]
        }
        
    }
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/Grzalka.java
*********************************************************************/

