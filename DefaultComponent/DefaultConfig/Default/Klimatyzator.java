/*********************************************************************
	Rhapsody	: 8.0
	Login		: Piotrek
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Klimatyzator
//!	Generated Date	: Thu, 29, Nov 2012 
	File Path	: DefaultComponent/DefaultConfig/Default/Klimatyzator.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.oxf.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.states.*;

//----------------------------------------------------------------------------
// Default/Klimatyzator.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class Klimatyzator 
public class Klimatyzator implements RiJStateConcept {
    
    public Reactive reactive;		//## ignore 
    
    protected int chcianaTemp;		//## attribute chcianaTemp 
    
    protected Klimatyzator klimatyzator;		//## attribute klimatyzator 
    
    protected double obecnaTemp;		//## attribute obecnaTemp 
    
    protected CzujnikTemp itsCzujnikTemp;		//## classInstance itsCzujnikTemp 
    
    protected Dmuchawa itsDmuchawa;		//## classInstance itsDmuchawa 
    
    protected Grzalka itsGrzalka;		//## classInstance itsGrzalka 
    
    protected Kompresor itsKompresor;		//## classInstance itsKompresor 
    
    protected Wentyl itsWentyl;		//## classInstance itsWentyl 
    
    protected Wentylator itsWentylator;		//## classInstance itsWentylator 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int start=1;
    public static final int dwa=2;
    public static final int accepteventaction_2=3;
    //#]
    protected int rootState_subState;		//## ignore 
    
    protected int rootState_active;		//## ignore 
    
    public static final int Klimatyzator_Timeout_start_id = 1;		//## ignore 
    
    
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
    
    //## operation Klimatyzator() 
    public  Klimatyzator(RiJThread p_thread) {
        System.out.println("-> Klimatyzator");     
        klimatyzator = this;;
        reactive = new Reactive(p_thread);
        initRelations(p_thread);
        //#[ operation Klimatyzator() 
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
    public Klimatyzator getKlimatyzator() {
        return klimatyzator;
    }
    
    //## auto_generated 
    public void setKlimatyzator(Klimatyzator p_klimatyzator) {
        klimatyzator = p_klimatyzator;
    }
    
    //## auto_generated 
    public double getObecnaTemp() {
        return obecnaTemp;
    }
    
    //## auto_generated 
    public void setObecnaTemp(double p_obecnaTemp) {
        obecnaTemp = p_obecnaTemp;
    }
    
    //## auto_generated 
    public CzujnikTemp getItsCzujnikTemp() {
        return itsCzujnikTemp;
    }
    
    //## auto_generated 
    public CzujnikTemp newItsCzujnikTemp(RiJThread p_thread) {
        itsCzujnikTemp = new CzujnikTemp(p_thread);
        return itsCzujnikTemp;
    }
    
    //## auto_generated 
    public void deleteItsCzujnikTemp() {
        itsCzujnikTemp=null;
    }
    
    //## auto_generated 
    public Dmuchawa getItsDmuchawa() {
        return itsDmuchawa;
    }
    
    //## auto_generated 
    public Dmuchawa newItsDmuchawa() {
        itsDmuchawa = new Dmuchawa();
        return itsDmuchawa;
    }
    
    //## auto_generated 
    public void deleteItsDmuchawa() {
        itsDmuchawa=null;
    }
    
    //## auto_generated 
    public Grzalka getItsGrzalka() {
        return itsGrzalka;
    }
    
    //## auto_generated 
    public Grzalka newItsGrzalka(RiJThread p_thread) {
        itsGrzalka = new Grzalka(p_thread);
        return itsGrzalka;
    }
    
    //## auto_generated 
    public void deleteItsGrzalka() {
        itsGrzalka=null;
    }
    
    //## auto_generated 
    public Kompresor getItsKompresor() {
        return itsKompresor;
    }
    
    //## auto_generated 
    public Kompresor newItsKompresor() {
        itsKompresor = new Kompresor();
        return itsKompresor;
    }
    
    //## auto_generated 
    public void deleteItsKompresor() {
        itsKompresor=null;
    }
    
    //## auto_generated 
    public Wentyl getItsWentyl() {
        return itsWentyl;
    }
    
    //## auto_generated 
    public Wentyl newItsWentyl(RiJThread p_thread) {
        itsWentyl = new Wentyl(p_thread);
        return itsWentyl;
    }
    
    //## auto_generated 
    public void deleteItsWentyl() {
        itsWentyl=null;
    }
    
    //## auto_generated 
    public Wentylator getItsWentylator() {
        return itsWentylator;
    }
    
    //## auto_generated 
    public Wentylator newItsWentylator() {
        itsWentylator = new Wentylator();
        return itsWentylator;
    }
    
    //## auto_generated 
    public void deleteItsWentylator() {
        itsWentylator=null;
    }
    
    //## auto_generated 
    protected void initRelations(RiJThread p_thread) {
        itsCzujnikTemp = newItsCzujnikTemp(p_thread);
        itsDmuchawa = newItsDmuchawa();
        itsGrzalka = newItsGrzalka(p_thread);
        itsKompresor = newItsKompresor();
        itsWentyl = newItsWentyl(p_thread);
        itsWentylator = newItsWentylator();
    }
    
    //## auto_generated 
    public boolean startBehavior() {
        boolean done = true;
        done &= itsCzujnikTemp.startBehavior();
        done &= itsGrzalka.startBehavior();
        done &= itsWentyl.startBehavior();
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
            switch (rootState_active) {
                case start:
                {
                    res = start_takeEvent(id);
                }
                break;
                case dwa:
                {
                    res = dwa_takeEvent(id);
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
        public void dwaEnter() {
            //#[ state ROOT.dwa.(Entry) 
            itsGrzalka.ustawChcianaTemp(999);
            //#]
        }
        
        //## statechart_method 
        public int startTakeRiJTimeout() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.getTimeoutId() == Klimatyzator_Timeout_start_id)
                {
                    start_exit();
                    dwa_entDef();
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public void accepteventaction_2_exit() {
            accepteventaction_2Exit();
        }
        
        //## statechart_method 
        public int accepteventaction_2TaketemperatureNotify() {
            temperatureNotify params = (temperatureNotify) event;
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            accepteventaction_2_exit();
            //#[ transition 3 
            chcianaTemp = params.temperatura;
            System.out.println("Nowa temperatura!  " + params.temperatura);
            //#]
            accepteventaction_2_entDef();
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void start_entDef() {
            start_enter();
        }
        
        //## statechart_method 
        public void accepteventaction_2_enter() {
            rootState_subState = accepteventaction_2;
            rootState_active = accepteventaction_2;
            accepteventaction_2Enter();
        }
        
        //## statechart_method 
        public void dwa_exit() {
            dwaExit();
        }
        
        //## statechart_method 
        public int rootState_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public int dwa_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(temperatureNotify.temperatureNotify_Default_id))
                {
                    res = dwaTaketemperatureNotify();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void dwaExit() {
        }
        
        //## statechart_method 
        public void dwa_entDef() {
            dwa_enter();
        }
        
        //## statechart_method 
        public void rootState_enter() {
            rootStateEnter();
        }
        
        //## statechart_method 
        public void rootStateEnter() {
        }
        
        //## statechart_method 
        public void accepteventaction_2_entDef() {
            accepteventaction_2_enter();
        }
        
        //## statechart_method 
        public void dwa_enter() {
            rootState_subState = dwa;
            rootState_active = dwa;
            dwaEnter();
        }
        
        //## statechart_method 
        public int start_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.TIMEOUT_EVENT_ID))
                {
                    res = startTakeRiJTimeout();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            start_entDef();
        }
        
        //## statechart_method 
        public int dwaTaketemperatureNotify() {
            temperatureNotify params = (temperatureNotify) event;
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            dwa_exit();
            accepteventaction_2_entDef();
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int accepteventaction_2_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(temperatureNotify.temperatureNotify_Default_id))
                {
                    res = accepteventaction_2TaketemperatureNotify();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void startExit() {
            itsRiJThread.unschedTimeout(Klimatyzator_Timeout_start_id, this);
        }
        
        //## statechart_method 
        public void startEnter() {
            //#[ state ROOT.start.(Entry) 
            itsGrzalka.ustawChcianaTemp(200);  
            itsCzujnikTemp.setParent(klimatyzator);
            //#]
            itsRiJThread.schedTimeout(5000, Klimatyzator_Timeout_start_id, this, null);
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
	File Path	: DefaultComponent/DefaultConfig/Default/Klimatyzator.java
*********************************************************************/

