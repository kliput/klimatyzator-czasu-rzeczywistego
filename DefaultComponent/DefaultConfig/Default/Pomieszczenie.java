/*********************************************************************
	Rhapsody	: 8.0
	Login		: Piotrek
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Pomieszczenie
//!	Generated Date	: Tue, 4, Dec 2012 
	File Path	: DefaultComponent/DefaultConfig/Default/Pomieszczenie.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.oxf.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.states.*;

//----------------------------------------------------------------------------
// Default/Pomieszczenie.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class Pomieszczenie 
public class Pomieszczenie implements RiJStateConcept {
    
    public Reactive reactive;		//## ignore 
    
    protected Pomieszczenie self;		//## attribute self 
    
    protected int temperatura;		//## attribute temperatura 
    
    protected double wielkosc;		//## attribute wielkosc 
    
    protected Klimatyzator itsKlimatyzator;		//## classInstance itsKlimatyzator 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int start=1;
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
    
    //## operation Pomieszczenie() 
    public  Pomieszczenie(RiJThread p_thread) {
        self = this;;
        reactive = new Reactive(p_thread);
        initRelations(p_thread);
        //#[ operation Pomieszczenie() 
        //#]
    }
    
    /**
     * @param energia
    */
    //## operation zmienEnergie(double) 
    public void zmienEnergie(double energia) {
        //#[ operation zmienEnergie(double) 
        //#]
    }
    
    //## auto_generated 
    public Pomieszczenie getSelf() {
        return self;
    }
    
    //## auto_generated 
    public void setSelf(Pomieszczenie p_self) {
        self = p_self;
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
    public double getWielkosc() {
        return wielkosc;
    }
    
    //## auto_generated 
    public void setWielkosc(double p_wielkosc) {
        wielkosc = p_wielkosc;
    }
    
    //## auto_generated 
    public Klimatyzator getItsKlimatyzator() {
        return itsKlimatyzator;
    }
    
    //## auto_generated 
    public Klimatyzator newItsKlimatyzator(RiJThread p_thread) {
        itsKlimatyzator = new Klimatyzator(p_thread);
        return itsKlimatyzator;
    }
    
    //## auto_generated 
    public void deleteItsKlimatyzator() {
        itsKlimatyzator=null;
    }
    
    //## auto_generated 
    protected void initRelations(RiJThread p_thread) {
        itsKlimatyzator = newItsKlimatyzator(p_thread);
    }
    
    //## auto_generated 
    public boolean startBehavior() {
        boolean done = true;
        done &= itsKlimatyzator.startBehavior();
        done &= reactive.startBehavior();
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
            return res;
        }
        
        //## auto_generated 
        protected void initStatechart() {
            rootState_subState = RiJNonState;
            rootState_active = RiJNonState;
        }
        
        //## statechart_method 
        public void start_exit() {
            startExit();
        }
        
        //## statechart_method 
        public void start_entDef() {
            start_enter();
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
        public int start_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            start_entDef();
        }
        
        //## statechart_method 
        public void startExit() {
        }
        
        //## statechart_method 
        public void startEnter() {
            //#[ state ROOT.start.(Entry) 
            itsKlimatyzator.setPomieszczenie(self);
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
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/Pomieszczenie.java
*********************************************************************/

