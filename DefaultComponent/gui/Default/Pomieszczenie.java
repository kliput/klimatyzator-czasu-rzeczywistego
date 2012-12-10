/*********************************************************************
	Rhapsody	: 7.6.1
	Login		: Kuba
	Component	: DefaultComponent
	Configuration 	: gui
	Model Element	: Pomieszczenie
//!	Generated Date	: Mon, 10, Dec 2012 
	File Path	: DefaultComponent/gui/Default/Pomieszczenie.java
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
// Default/Pomieszczenie.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class Pomieszczenie 
public class Pomieszczenie implements RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassPomieszczenie = new AnimClass("Default.Pomieszczenie",false);
    //#]
    
    public Reactive reactive;		//## ignore 
    
    protected static java.util.logging.Logger log = java.util.logging.Logger.global;		//## attribute log 
    
    protected Pomieszczenie self;		//## attribute self 
    
    protected double temperatura = 18;		//## attribute temperatura 
    
    protected double wielkosc = 20;		//## attribute wielkosc 
    
    protected Klimatyzator itsKlimatyzator;		//## classInstance itsKlimatyzator 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int start=1;
    public static final int aktualizuj_temperature=2;
    //#]
    protected int rootState_subState;		//## ignore 
    
    protected int rootState_active;		//## ignore 
    
    public static final int Pomieszczenie_Timeout_aktualizuj_temperature_id = 1;		//## ignore 
    
    
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
        try {
            animInstance().notifyConstructorEntered(animClassPomieszczenie.getUserClass(),
               new ArgData[] {
               });
        
        reactive = new Reactive(p_thread);
        initRelations(p_thread);
        //#[ operation Pomieszczenie() 
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    private static java.util.logging.Logger getLog() {
        return log;
    }
    
    //## auto_generated 
    private static void setLog(java.util.logging.Logger p_log) {
        log = p_log;
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
    public double getTemperatura() {
        return temperatura;
    }
    
    //## auto_generated 
    public void setTemperatura(double p_temperatura) {
        try {
        temperatura = p_temperatura;
        }
        finally {
            animInstance().notifyUpdatedAttr();
        }
    }
    
    //## auto_generated 
    public double getWielkosc() {
        return wielkosc;
    }
    
    //## auto_generated 
    public void setWielkosc(double p_wielkosc) {
        try {
        wielkosc = p_wielkosc;
        }
        finally {
            animInstance().notifyUpdatedAttr();
        }
    }
    
    //## auto_generated 
    public Klimatyzator getItsKlimatyzator() {
        return itsKlimatyzator;
    }
    
    //## auto_generated 
    public Klimatyzator newItsKlimatyzator(RiJThread p_thread) {
        itsKlimatyzator = new Klimatyzator(p_thread);
        animInstance().notifyRelationAdded("itsKlimatyzator", itsKlimatyzator);
        return itsKlimatyzator;
    }
    
    //## auto_generated 
    public void deleteItsKlimatyzator() {
        animInstance().notifyRelationRemoved("itsKlimatyzator", itsKlimatyzator);
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
                case aktualizuj_temperature:
                {
                    aktualizuj_temperature_add(animStates);
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
                case aktualizuj_temperature:
                {
                    res = aktualizuj_temperature_takeEvent(id);
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
        public void aktualizuj_temperature_add(AnimStates animStates) {
            animStates.add("ROOT.aktualizuj_temperature");
        }
        
        //## auto_generated 
        protected void initStatechart() {
            rootState_subState = RiJNonState;
            rootState_active = RiJNonState;
        }
        
        //## statechart_method 
        public void aktualizuj_temperature_entDef() {
            aktualizuj_temperature_enter();
        }
        
        //## statechart_method 
        public void start_exit() {
            popNullConfig();
            startExit();
            animInstance().notifyStateExited("ROOT.start");
        }
        
        //## statechart_method 
        public void aktualizuj_temperatureEnter() {
            //#[ state ROOT.aktualizuj_temperature.(Entry) 
            double zmianaTemperatury = 0;
            
            double mocKompresora = itsKlimatyzator.itsKompresor.moc;
            int rpmDmuchawy = itsKlimatyzator.itsDmuchawa.rpm;
            double mocGrzalki = itsKlimatyzator.itsGrzalka.moc;
            
            double bilansMocy = mocGrzalki-mocKompresora;
            
            zmianaTemperatury = (1/wielkosc)*(bilansMocy);
            
            //System.out.println("pomieszczenie: zmiana temperatury 1: " + zmianaTemperatury);
            
            // im wiekszy bilans mocy, tym wiekszy musi byc rpm,
            // wiec trzeba obliczyc roznice procentowego wykorzystania bilansu i rpm
            
            double relRpm = rpmDmuchawy / Wiatrak.MAX_RPM;
            double relBilans;
            if (bilansMocy >= 0) {
            	relBilans = bilansMocy / Grzalka.MAX_MOC;	                    
            } else {
            	relBilans = bilansMocy / Kompresor.MAX_MOC;
            }
            
            // w tej sytuacji (wieksza moc niz wydajnosc wentylatora)
            // zmniejszamy predkosc zmiany temperatury w otoczeniu
            if (relBilans > relRpm){
            	zmianaTemperatury *= (100-(relBilans-relRpm))/100;
            }
            
            //System.out.println("pomieszczenie: zmiana temperatury 2: " + zmianaTemperatury);
            
            temperatura += zmianaTemperatury;
            
            //System.out.println("pomieszczenie: nowa temperatura: " + temperatura);
            //#]
            itsRiJThread.schedTimeout(1000, Pomieszczenie_Timeout_aktualizuj_temperature_id, this, "ROOT.aktualizuj_temperature");
        }
        
        //## statechart_method 
        public void aktualizuj_temperature_exit() {
            aktualizuj_temperatureExit();
            animInstance().notifyStateExited("ROOT.aktualizuj_temperature");
        }
        
        //## statechart_method 
        public void aktualizuj_temperatureExit() {
            itsRiJThread.unschedTimeout(Pomieszczenie_Timeout_aktualizuj_temperature_id, this);
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
            animInstance().notifyStateEntered("ROOT");
            rootStateEnter();
        }
        
        //## statechart_method 
        public void rootStateEnter() {
        }
        
        //## statechart_method 
        public int aktualizuj_temperatureTakeRiJTimeout() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.getTimeoutId() == Pomieszczenie_Timeout_aktualizuj_temperature_id)
                {
                    animInstance().notifyTransitionStarted("2");
                    aktualizuj_temperature_exit();
                    aktualizuj_temperature_entDef();
                    animInstance().notifyTransitionEnded("2");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public int startTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("1");
            start_exit();
            aktualizuj_temperature_entDef();
            animInstance().notifyTransitionEnded("1");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int aktualizuj_temperature_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.TIMEOUT_EVENT_ID))
                {
                    res = aktualizuj_temperatureTakeRiJTimeout();
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
        public void aktualizuj_temperature_enter() {
            animInstance().notifyStateEntered("ROOT.aktualizuj_temperature");
            rootState_subState = aktualizuj_temperature;
            rootState_active = aktualizuj_temperature;
            aktualizuj_temperatureEnter();
        }
        
        //## statechart_method 
        public void startExit() {
        }
        
        //## statechart_method 
        public void startEnter() {
            //#[ state ROOT.start.(Entry) 
            itsKlimatyzator.setPomieszczenie(self);
            itsKlimatyzator.itsCzujnikTemp.setPomieszczenie(self);
            
            System.out.println("Pomieszczenie: start");
            //#]
        }
        
        //## statechart_method 
        public void rootStateExit() {
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
            return Pomieszczenie.this.animInstance(); 
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassPomieszczenie; 
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
        
        msg.add("wielkosc", wielkosc);
        msg.add("temperatura", temperatura);
        msg.add("log", log);
        msg.add("self", self);
    }
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public void addRelations(AnimRelations msg) {
        
        msg.add("itsKlimatyzator", true, true, itsKlimatyzator);
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(Pomieszczenie.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            Pomieszczenie.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            Pomieszczenie.this.addRelations(msg);
        }
        
        public void addStates(AnimStates msg) {
            if ((reactive != null) && (reactive.isTerminated() == false))
              reactive.rootState_add(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/gui/Default/Pomieszczenie.java
*********************************************************************/

