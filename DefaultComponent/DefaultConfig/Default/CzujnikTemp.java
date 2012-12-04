/*********************************************************************
	Rhapsody	: 8.0
	Login		: Piotrek
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: CzujnikTemp
//!	Generated Date	: Tue, 4, Dec 2012 
	File Path	: DefaultComponent/DefaultConfig/Default/CzujnikTemp.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.oxf.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.states.*;

//----------------------------------------------------------------------------
// Default/CzujnikTemp.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class CzujnikTemp 
public class CzujnikTemp implements RiJStateConcept {
    
    public Reactive reactive;		//## ignore 
    
    protected CzujnikTemp.portWentyl_C portWentyl;		//## ignore 
    
    protected Klimatyzator parent;		//## attribute parent 
    
    protected Pomieszczenie pomieszczenie;		//## attribute pomieszczenie 
    
    protected int temperatura;		//## attribute temperatura 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int zmierz=1;
    public static final int start=2;
    public static final int sendNotify=3;
    //#]
    protected int rootState_subState;		//## ignore 
    
    protected int rootState_active;		//## ignore 
    
    public static final int CzujnikTemp_Timeout_sendNotify_id = 1;		//## ignore 
    
    
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
    
    //## operation CzujnikTemp() 
    public  CzujnikTemp(RiJThread p_thread) {
        System.out.println("  -> Czujnik temperatury");
        temperatura = 20;;
        reactive = new Reactive(p_thread);
        initRelations(p_thread);
        //#[ operation CzujnikTemp() 
        //#]
    }
    
    //## auto_generated 
    public CzujnikTemp.portWentyl_C getPortWentyl() {
        return portWentyl;
    }
    
    //## auto_generated 
    public CzujnikTemp.portWentyl_C get_portWentyl() {
        return portWentyl;
    }
    
    //## auto_generated 
    public CzujnikTemp.portWentyl_C newPortWentyl() {
        portWentyl = new CzujnikTemp.portWentyl_C();
        return portWentyl;
    }
    
    //## auto_generated 
    public void deletePortWentyl() {
        portWentyl=null;
    }
    
    /**
     * @param parent
    */
    //## operation setParent(Klimatyzator) 
    public void setParent(final Klimatyzator parent) {
        //#[ operation setParent(Klimatyzator) 
        this.parent = parent;
        //#]
    }
    
    /**
     * @param pomieszczenie
    */
    //## operation setPomieszczenie(Pomieszczenie) 
    public void setPomieszczenie(final Pomieszczenie pomieszczenie) {
        //#[ operation setPomieszczenie(Pomieszczenie) 
        this.pomieszczenie=pomieszczenie;
        //#]
    }
    
    //## auto_generated 
    public Klimatyzator getParent() {
        return parent;
    }
    
    //## auto_generated 
    public Pomieszczenie getPomieszczenie() {
        return pomieszczenie;
    }
    
    //## auto_generated 
    public int getTemperatura() {
        return temperatura;
    }
    
    //## auto_generated 
    public void setTemperatura(int p_temperatura) {
        temperatura = p_temperatura;
    }
    
    //## auto_generated 
    protected void initRelations(RiJThread p_thread) {
        portWentyl = newPortWentyl();
        if(getPortWentyl() != null)
           getPortWentyl().connectCzujnikTemp(this);
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
                case zmierz:
                {
                    res = zmierz_takeEvent(id);
                }
                break;
                case sendNotify:
                {
                    res = sendNotify_takeEvent(id);
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
        public void sendNotify_entDef() {
            sendNotify_enter();
        }
        
        //## statechart_method 
        public int sendNotify_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.TIMEOUT_EVENT_ID))
                {
                    res = sendNotifyTakeRiJTimeout();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void start_entDef() {
            start_enter();
        }
        
        //## statechart_method 
        public void zmierz_entDef() {
            zmierz_enter();
        }
        
        //## statechart_method 
        public int rootState_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void sendNotify_enter() {
            rootState_subState = sendNotify;
            rootState_active = sendNotify;
            sendNotifyEnter();
        }
        
        //## statechart_method 
        public void zmierzExit() {
        }
        
        //## statechart_method 
        public void sendNotifyExit() {
            itsRiJThread.unschedTimeout(CzujnikTemp_Timeout_sendNotify_id, this);
        }
        
        //## statechart_method 
        public int zmierzTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            zmierz_exit();
            sendNotify_entDef();
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
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
        public int startTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            start_exit();
            zmierz_entDef();
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void zmierz_enter() {
            pushNullConfig();
            rootState_subState = zmierz;
            rootState_active = zmierz;
            zmierzEnter();
        }
        
        //## statechart_method 
        public void sendNotifyEnter() {
            //#[ state ROOT.sendNotify.(Entry) 
             parent.gen(new temperatureNotify(temperatura));
             double r = Math.random();
             System.out.println("$$$ : " + r);
             portWentyl.gen(new wentylNotify(r));
            //#]
            itsRiJThread.schedTimeout(1000, CzujnikTemp_Timeout_sendNotify_id, this, null);
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
            start_entDef();
        }
        
        //## statechart_method 
        public void zmierzEnter() {
            //#[ state ROOT.zmierz.(Entry) 
            temperatura += pomieszczenie.temperatura;
            //#]
        }
        
        //## statechart_method 
        public void sendNotify_exit() {
            sendNotifyExit();
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
        public int sendNotifyTakeRiJTimeout() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.getTimeoutId() == CzujnikTemp_Timeout_sendNotify_id)
                {
                    sendNotify_exit();
                    zmierz_entDef();
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public void start_enter() {
            pushNullConfig();
            rootState_subState = start;
            rootState_active = start;
            startEnter();
        }
        
        //## statechart_method 
        public int zmierz_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = zmierzTakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void zmierz_exit() {
            popNullConfig();
            zmierzExit();
        }
        
    }
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class portWentyl_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  portWentyl_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectCzujnikTemp(CzujnikTemp) 
        public void connectCzujnikTemp(CzujnikTemp part) {
            //#[ operation connectCzujnikTemp(CzujnikTemp) 
            InBound.setItsDefaultProvidedInterface(part);
            InBound.setPort(this); // for IS_PORT macro support
            
            //#]
        }
        
    }
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/CzujnikTemp.java
*********************************************************************/

