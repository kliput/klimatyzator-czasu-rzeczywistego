/*********************************************************************
	Rhapsody	: 8.0
	Login		: Piotrek
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Wentyl
//!	Generated Date	: Tue, 4, Dec 2012 
	File Path	: DefaultComponent/DefaultConfig/Default/Wentyl.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.oxf.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.states.*;

//----------------------------------------------------------------------------
// Default/Wentyl.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class Wentyl 
public class Wentyl implements RiJStateConcept {
    
    public Reactive reactive;		//## ignore 
    
    protected Wentyl.port_C port;		//## ignore 
    
    protected double procOtwarcia;		//## attribute procOtwarcia 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int start=1;
    public static final int accepteventaction_2=2;
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
    
    //## operation Wentyl() 
    public  Wentyl(RiJThread p_thread) {
        System.out.println("  -> Wentyl");;
        reactive = new Reactive(p_thread);
        initRelations(p_thread);
        //#[ operation Wentyl() 
        //#]
    }
    
    //## auto_generated 
    public Wentyl.port_C getPort() {
        return port;
    }
    
    //## auto_generated 
    public Wentyl.port_C get_port() {
        return port;
    }
    
    //## auto_generated 
    public Wentyl.port_C newPort() {
        port = new Wentyl.port_C();
        return port;
    }
    
    //## auto_generated 
    public void deletePort() {
        port=null;
    }
    
    //## auto_generated 
    public double getProcOtwarcia() {
        return procOtwarcia;
    }
    
    //## auto_generated 
    public void setProcOtwarcia(double p_procOtwarcia) {
        procOtwarcia = p_procOtwarcia;
    }
    
    //## auto_generated 
    protected void initRelations(RiJThread p_thread) {
        port = newPort();
        if(getPort() != null)
           getPort().connectWentyl(this);
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
                case accepteventaction_2:
                {
                    res = accepteventaction_2_takeEvent(id);
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
        public void accepteventaction_2Enter() {
        }
        
        //## statechart_method 
        public void start_exit() {
            startExit();
        }
        
        //## statechart_method 
        public void accepteventaction_2Exit() {
        }
        
        //## statechart_method 
        public void accepteventaction_2_exit() {
            popNullConfig();
            accepteventaction_2Exit();
        }
        
        //## statechart_method 
        public void start_entDef() {
            start_enter();
        }
        
        //## statechart_method 
        public void accepteventaction_2_enter() {
            pushNullConfig();
            rootState_subState = accepteventaction_2;
            rootState_active = accepteventaction_2;
            accepteventaction_2Enter();
        }
        
        //## statechart_method 
        public int startTakewentylNotify() {
            wentylNotify params = (wentylNotify) event;
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            start_exit();
            //#[ transition 1 
            procOtwarcia = params.procentOtw;
            //#]
            accepteventaction_2_entDef();
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
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
        public int accepteventaction_2TakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            accepteventaction_2_exit();
            start_entDef();
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void accepteventaction_2_entDef() {
            accepteventaction_2_enter();
        }
        
        //## statechart_method 
        public int start_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(wentylNotify.wentylNotify_Default_id))
                {
                    res = startTakewentylNotify();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            start_entDef();
        }
        
        //## statechart_method 
        public int accepteventaction_2_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = accepteventaction_2TakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void startExit() {
        }
        
        //## statechart_method 
        public void startEnter() {
            //#[ state ROOT.start.(Entry) 
            System.err.println("*** : " + procOtwarcia);
            //#]
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public void start_enter() {
            rootState_subState = start;
            rootState_active = start;
            startEnter();
        }
        
    }
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class port_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  port_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectWentyl(Wentyl) 
        public void connectWentyl(Wentyl part) {
            //#[ operation connectWentyl(Wentyl) 
            InBound.setItsDefaultProvidedInterface(part);
            InBound.setPort(this); // for IS_PORT macro support
            
            //#]
        }
        
    }
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/Wentyl.java
*********************************************************************/

