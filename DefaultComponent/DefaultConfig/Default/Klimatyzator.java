/*********************************************************************
	Rhapsody	: 8.0
	Login		: Piotrek
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Klimatyzator
//!	Generated Date	: Tue, 11, Dec 2012 
	File Path	: DefaultComponent/DefaultConfig/Default/Klimatyzator.java
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
// Default/Klimatyzator.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class Klimatyzator 
public class Klimatyzator implements RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassKlimatyzator = new AnimClass("Default.Klimatyzator",false);
    //#]
    
    public Reactive reactive;		//## ignore 
    
    protected int chcianaTemp;		//## attribute chcianaTemp 
    
    protected Klimatyzator klimatyzator;		//## attribute klimatyzator 
    
    protected Pomieszczenie pomieszczenie;		//## attribute pomieszczenie 
    
    protected double tmpObecnaTemp;		//## attribute tmpObecnaTemp 
    
    protected CzujnikTemp itsCzujnikTemp;		//## classInstance itsCzujnikTemp 
    
    protected Wiatrak itsDmuchawa;		//## classInstance itsDmuchawa 
    
    protected Grzalka itsGrzalka;		//## classInstance itsGrzalka 
    
    protected Kompresor itsKompresor;		//## classInstance itsKompresor 
    
    protected OdbiornikIRDA itsOdbiornikIRDA;		//## classInstance itsOdbiornikIRDA 
    
    protected Pilot itsPilot;		//## classInstance itsPilot 
    
    protected Wentyl itsWentyl;		//## classInstance itsWentyl 
    
    protected Wiatrak itsWentylator;		//## classInstance itsWentylator 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int main=1;
    public static final int state_29=2;
    public static final int debug_1=3;
    public static final int state_28=4;
    public static final int test_1=5;
    public static final int start=6;
    public static final int pobieranie_temperatury=7;
    public static final int state_7=8;
    public static final int probuj_pobrac_temperature=9;
    public static final int pobierz_temperature=10;
    public static final int temp_czas_start=11;
    public static final int temp_czas_koniec=12;
    public static final int awaria=13;
    //#]
    protected int rootState_subState;		//## ignore 
    
    protected int rootState_active;		//## ignore 
    
    protected int state_29_subState;		//## ignore 
    
    protected int state_29_active;		//## ignore 
    
    public static final int Klimatyzator_Timeout_debug_1_id = 1;		//## ignore 
    
    protected int state_28_subState;		//## ignore 
    
    protected int state_28_active;		//## ignore 
    
    protected int state_7_subState;		//## ignore 
    
    protected int state_7_active;		//## ignore 
    
    protected int pobierz_temperature_subState;		//## ignore 
    
    protected int pobierz_temperature_active;		//## ignore 
    
    public static final int Klimatyzator_Timeout_temp_czas_start_id = 2;		//## ignore 
    
    
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
        try {
            animInstance().notifyConstructorEntered(animClassKlimatyzator.getUserClass(),
               new ArgData[] {
               });
        
        reactive = new Reactive(p_thread);
        initRelations(p_thread);
        //#[ operation Klimatyzator() 
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
        this.pomieszczenie = pomieszczenie; 
        this.itsCzujnikTemp.setPomieszczenie(pomieszczenie);
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public int getChcianaTemp() {
        return chcianaTemp;
    }
    
    //## auto_generated 
    public void setChcianaTemp(int p_chcianaTemp) {
        try {
        chcianaTemp = p_chcianaTemp;
        }
        finally {
            animInstance().notifyUpdatedAttr();
        }
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
    public Pomieszczenie getPomieszczenie() {
        return pomieszczenie;
    }
    
    //## auto_generated 
    private double getTmpObecnaTemp() {
        return tmpObecnaTemp;
    }
    
    //## auto_generated 
    private void setTmpObecnaTemp(double p_tmpObecnaTemp) {
        try {
        tmpObecnaTemp = p_tmpObecnaTemp;
        }
        finally {
            animInstance().notifyUpdatedAttr();
        }
    }
    
    //## auto_generated 
    public CzujnikTemp getItsCzujnikTemp() {
        return itsCzujnikTemp;
    }
    
    //## auto_generated 
    public CzujnikTemp newItsCzujnikTemp(RiJThread p_thread) {
        itsCzujnikTemp = new CzujnikTemp(p_thread);
        animInstance().notifyRelationAdded("itsCzujnikTemp", itsCzujnikTemp);
        return itsCzujnikTemp;
    }
    
    //## auto_generated 
    public void deleteItsCzujnikTemp() {
        animInstance().notifyRelationRemoved("itsCzujnikTemp", itsCzujnikTemp);
        itsCzujnikTemp=null;
    }
    
    //## auto_generated 
    public Wiatrak getItsDmuchawa() {
        return itsDmuchawa;
    }
    
    //## auto_generated 
    public Wiatrak newItsDmuchawa(RiJThread p_thread) {
        itsDmuchawa = new Wiatrak(p_thread);
        animInstance().notifyRelationAdded("itsDmuchawa", itsDmuchawa);
        return itsDmuchawa;
    }
    
    //## auto_generated 
    public void deleteItsDmuchawa() {
        animInstance().notifyRelationRemoved("itsDmuchawa", itsDmuchawa);
        itsDmuchawa=null;
    }
    
    //## auto_generated 
    public Grzalka getItsGrzalka() {
        return itsGrzalka;
    }
    
    //## auto_generated 
    public Grzalka newItsGrzalka() {
        itsGrzalka = new Grzalka();
        animInstance().notifyRelationAdded("itsGrzalka", itsGrzalka);
        return itsGrzalka;
    }
    
    //## auto_generated 
    public void deleteItsGrzalka() {
        animInstance().notifyRelationRemoved("itsGrzalka", itsGrzalka);
        itsGrzalka=null;
    }
    
    //## auto_generated 
    public Kompresor getItsKompresor() {
        return itsKompresor;
    }
    
    //## auto_generated 
    public Kompresor newItsKompresor() {
        itsKompresor = new Kompresor();
        animInstance().notifyRelationAdded("itsKompresor", itsKompresor);
        return itsKompresor;
    }
    
    //## auto_generated 
    public void deleteItsKompresor() {
        animInstance().notifyRelationRemoved("itsKompresor", itsKompresor);
        itsKompresor=null;
    }
    
    //## auto_generated 
    public OdbiornikIRDA getItsOdbiornikIRDA() {
        return itsOdbiornikIRDA;
    }
    
    //## auto_generated 
    public OdbiornikIRDA newItsOdbiornikIRDA(RiJThread p_thread) {
        itsOdbiornikIRDA = new OdbiornikIRDA(p_thread);
        animInstance().notifyRelationAdded("itsOdbiornikIRDA", itsOdbiornikIRDA);
        return itsOdbiornikIRDA;
    }
    
    //## auto_generated 
    public void deleteItsOdbiornikIRDA() {
        animInstance().notifyRelationRemoved("itsOdbiornikIRDA", itsOdbiornikIRDA);
        itsOdbiornikIRDA=null;
    }
    
    //## auto_generated 
    public Pilot getItsPilot() {
        return itsPilot;
    }
    
    //## auto_generated 
    public Pilot newItsPilot(RiJThread p_thread) {
        itsPilot = new Pilot(p_thread);
        animInstance().notifyRelationAdded("itsPilot", itsPilot);
        return itsPilot;
    }
    
    //## auto_generated 
    public void deleteItsPilot() {
        animInstance().notifyRelationRemoved("itsPilot", itsPilot);
        itsPilot=null;
    }
    
    //## auto_generated 
    public Wentyl getItsWentyl() {
        return itsWentyl;
    }
    
    //## auto_generated 
    public Wentyl newItsWentyl(RiJThread p_thread) {
        itsWentyl = new Wentyl(p_thread);
        animInstance().notifyRelationAdded("itsWentyl", itsWentyl);
        return itsWentyl;
    }
    
    //## auto_generated 
    public void deleteItsWentyl() {
        animInstance().notifyRelationRemoved("itsWentyl", itsWentyl);
        itsWentyl=null;
    }
    
    //## auto_generated 
    public Wiatrak getItsWentylator() {
        return itsWentylator;
    }
    
    //## auto_generated 
    public Wiatrak newItsWentylator(RiJThread p_thread) {
        itsWentylator = new Wiatrak(p_thread);
        animInstance().notifyRelationAdded("itsWentylator", itsWentylator);
        return itsWentylator;
    }
    
    //## auto_generated 
    public void deleteItsWentylator() {
        animInstance().notifyRelationRemoved("itsWentylator", itsWentylator);
        itsWentylator=null;
    }
    
    //## auto_generated 
    protected void initRelations(RiJThread p_thread) {
        itsCzujnikTemp = newItsCzujnikTemp(p_thread);
        itsDmuchawa = newItsDmuchawa(p_thread);
        itsGrzalka = newItsGrzalka();
        itsKompresor = newItsKompresor();
        itsOdbiornikIRDA = newItsOdbiornikIRDA(p_thread);
        itsPilot = newItsPilot(p_thread);
        itsWentyl = newItsWentyl(p_thread);
        itsWentylator = newItsWentylator(p_thread);
        {
            
            itsPilot.getNadajnik().setItsDefaultRequiredInterface(itsOdbiornikIRDA.getOdbiornik().getItsDefaultProvidedInterface());
            
        }{
            
            itsOdbiornikIRDA.getOdbiornik().setItsDefaultRequiredInterface(itsPilot.getNadajnik().getItsDefaultProvidedInterface());
            
        }
    }
    
    //## auto_generated 
    public boolean startBehavior() {
        boolean done = true;
        done &= itsCzujnikTemp.startBehavior();
        done &= itsDmuchawa.startBehavior();
        done &= itsOdbiornikIRDA.startBehavior();
        done &= itsPilot.startBehavior();
        done &= itsWentyl.startBehavior();
        done &= itsWentylator.startBehavior();
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
            if(pobierz_temperature == state)
                {
                    return isIn(pobieranie_temperatury);
                }
            if(pobierz_temperature_subState == state)
                {
                    return true;
                }
            if(state_7 == state)
                {
                    return isIn(pobieranie_temperatury);
                }
            if(state_7_subState == state)
                {
                    return true;
                }
            if(state_28 == state)
                {
                    return isIn(main);
                }
            if(state_28_subState == state)
                {
                    return true;
                }
            if(state_29 == state)
                {
                    return isIn(main);
                }
            if(state_29_subState == state)
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
            state_28_add(animStates);
            state_29_add(animStates);
        }
        
        //## statechart_method 
        public int main_dispatchEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(state_28_dispatchEvent(id) >= 0)
                {
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                    if(!isIn(main))
                        {
                            return res;
                        }
                }
            if(state_29_dispatchEvent(id) >= 0)
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
        public void state_29_add(AnimStates animStates) {
            animStates.add("ROOT.main.state_29");
            if(state_29_subState == debug_1)
                {
                    debug_1_add(animStates);
                }
        }
        
        //## statechart_method 
        public int state_29_dispatchEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(state_29_active == debug_1)
                {
                    res = debug_1_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void debug_1_add(AnimStates animStates) {
            animStates.add("ROOT.main.state_29.debug_1");
        }
        
        //## statechart_method 
        public void state_28_add(AnimStates animStates) {
            animStates.add("ROOT.main.state_28");
            switch (state_28_subState) {
                case start:
                {
                    start_add(animStates);
                }
                break;
                case pobieranie_temperatury:
                {
                    pobieranie_temperatury_add(animStates);
                }
                break;
                case awaria:
                {
                    awaria_add(animStates);
                }
                break;
                case test_1:
                {
                    test_1_add(animStates);
                }
                break;
                default:
                    break;
            }
        }
        
        //## statechart_method 
        public int state_28_dispatchEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            switch (state_28_active) {
                case start:
                {
                    res = start_takeEvent(id);
                }
                break;
                case pobieranie_temperatury:
                {
                    res = pobieranie_temperatury_dispatchEvent(id);
                }
                break;
                case awaria:
                {
                    res = awaria_takeEvent(id);
                }
                break;
                case test_1:
                {
                    res = test_1_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## statechart_method 
        public void test_1_add(AnimStates animStates) {
            animStates.add("ROOT.main.state_28.test_1");
        }
        
        //## statechart_method 
        public void start_add(AnimStates animStates) {
            animStates.add("ROOT.main.state_28.start");
        }
        
        //## statechart_method 
        public void pobieranie_temperatury_add(AnimStates animStates) {
            animStates.add("ROOT.main.state_28.pobieranie_temperatury");
            pobierz_temperature_add(animStates);
            state_7_add(animStates);
        }
        
        //## statechart_method 
        public int pobieranie_temperatury_dispatchEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(pobierz_temperature_dispatchEvent(id) >= 0)
                {
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                    if(!isIn(pobieranie_temperatury))
                        {
                            return res;
                        }
                }
            if(state_7_dispatchEvent(id) >= 0)
                {
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                    if(!isIn(pobieranie_temperatury))
                        {
                            return res;
                        }
                }
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = pobieranie_temperatury_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void state_7_add(AnimStates animStates) {
            animStates.add("ROOT.main.state_28.pobieranie_temperatury.state_7");
            if(state_7_subState == probuj_pobrac_temperature)
                {
                    probuj_pobrac_temperature_add(animStates);
                }
        }
        
        //## statechart_method 
        public int state_7_dispatchEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(state_7_active == probuj_pobrac_temperature)
                {
                    res = probuj_pobrac_temperature_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void probuj_pobrac_temperature_add(AnimStates animStates) {
            animStates.add("ROOT.main.state_28.pobieranie_temperatury.state_7.probuj_pobrac_temperature");
        }
        
        //## statechart_method 
        public void pobierz_temperature_add(AnimStates animStates) {
            animStates.add("ROOT.main.state_28.pobieranie_temperatury.pobierz_temperature");
            switch (pobierz_temperature_subState) {
                case temp_czas_start:
                {
                    temp_czas_start_add(animStates);
                }
                break;
                case temp_czas_koniec:
                {
                    temp_czas_koniec_add(animStates);
                }
                break;
                default:
                    break;
            }
        }
        
        //## statechart_method 
        public int pobierz_temperature_dispatchEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            switch (pobierz_temperature_active) {
                case temp_czas_start:
                {
                    res = temp_czas_start_takeEvent(id);
                }
                break;
                case temp_czas_koniec:
                {
                    res = temp_czas_koniec_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## statechart_method 
        public void temp_czas_start_add(AnimStates animStates) {
            animStates.add("ROOT.main.state_28.pobieranie_temperatury.pobierz_temperature.temp_czas_start");
        }
        
        //## statechart_method 
        public void temp_czas_koniec_add(AnimStates animStates) {
            animStates.add("ROOT.main.state_28.pobieranie_temperatury.pobierz_temperature.temp_czas_koniec");
        }
        
        //## statechart_method 
        public void awaria_add(AnimStates animStates) {
            animStates.add("ROOT.main.state_28.awaria");
        }
        
        //## auto_generated 
        protected void initStatechart() {
            rootState_subState = RiJNonState;
            rootState_active = RiJNonState;
            state_29_subState = RiJNonState;
            state_29_active = RiJNonState;
            state_28_subState = RiJNonState;
            state_28_active = RiJNonState;
            state_7_subState = RiJNonState;
            state_7_active = RiJNonState;
            pobierz_temperature_subState = RiJNonState;
            pobierz_temperature_active = RiJNonState;
        }
        
        //## statechart_method 
        public void temp_czas_koniecEnter() {
            //#[ state ROOT.main.state_28.pobieranie_temperatury.pobierz_temperature.temp_czas_koniec.(Entry) 
            System.out.println("Klima: przekroczono czas pobierania temperatury");
            //#]
        }
        
        //## statechart_method 
        public void pobierz_temperature_entDef() {
            pobierz_temperature_enter();
            pobierz_temperatureEntDef();
        }
        
        //## statechart_method 
        public int probuj_pobrac_temperatureTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("5");
            pobieranie_temperatury_exit();
            test_1_entDef();
            animInstance().notifyTransitionEnded("5");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void start_exit() {
            popNullConfig();
            startExit();
            animInstance().notifyStateExited("ROOT.main.state_28.start");
        }
        
        //## statechart_method 
        public void debug_1_enter() {
            animInstance().notifyStateEntered("ROOT.main.state_29.debug_1");
            state_29_subState = debug_1;
            state_29_active = debug_1;
            debug_1Enter();
        }
        
        //## statechart_method 
        public void state_29_entDef() {
            state_29_enter();
            state_29EntDef();
        }
        
        //## statechart_method 
        public void awaria_enter() {
            animInstance().notifyStateEntered("ROOT.main.state_28.awaria");
            state_28_subState = awaria;
            state_28_active = awaria;
            awariaEnter();
        }
        
        //## statechart_method 
        public void awaria_entDef() {
            awaria_enter();
        }
        
        //## statechart_method 
        public void pobieranie_temperaturyEnter() {
        }
        
        //## statechart_method 
        public void temp_czas_koniec_entDef() {
            temp_czas_koniec_enter();
        }
        
        //## statechart_method 
        public int temp_czas_start_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.TIMEOUT_EVENT_ID))
                {
                    res = temp_czas_startTakeRiJTimeout();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = pobierz_temperature_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void probuj_pobrac_temperature_enter() {
            animInstance().notifyStateEntered("ROOT.main.state_28.pobieranie_temperatury.state_7.probuj_pobrac_temperature");
            pushNullConfig();
            state_7_subState = probuj_pobrac_temperature;
            state_7_active = probuj_pobrac_temperature;
            probuj_pobrac_temperatureEnter();
        }
        
        //## statechart_method 
        public void state_7EntDef() {
            animInstance().notifyTransitionStarted("1");
            probuj_pobrac_temperature_entDef();
            animInstance().notifyTransitionEnded("1");
        }
        
        //## statechart_method 
        public void debug_1_entDef() {
            debug_1_enter();
        }
        
        //## statechart_method 
        public int state_29_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void state_29Enter() {
        }
        
        //## statechart_method 
        public void awariaEnter() {
            //#[ state ROOT.main.state_28.awaria.(Entry) 
            System.out.println("AWARIA!!!");
            //#]
        }
        
        //## statechart_method 
        public void temp_czas_koniec_exit() {
            popNullConfig();
            temp_czas_koniecExit();
            animInstance().notifyStateExited("ROOT.main.state_28.pobieranie_temperatury.pobierz_temperature.temp_czas_koniec");
        }
        
        //## statechart_method 
        public void temp_czas_koniec_enter() {
            animInstance().notifyStateEntered("ROOT.main.state_28.pobieranie_temperatury.pobierz_temperature.temp_czas_koniec");
            pushNullConfig();
            pobierz_temperature_subState = temp_czas_koniec;
            pobierz_temperature_active = temp_czas_koniec;
            temp_czas_koniecEnter();
        }
        
        //## statechart_method 
        public void state_28Enter() {
        }
        
        //## statechart_method 
        public void debug_1Exit() {
            itsRiJThread.unschedTimeout(Klimatyzator_Timeout_debug_1_id, this);
        }
        
        //## statechart_method 
        public int main_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public int temp_czas_koniec_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = temp_czas_koniecTakeNull();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = pobierz_temperature_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public int temp_czas_koniecTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("6");
            pobieranie_temperatury_exit();
            awaria_entDef();
            animInstance().notifyTransitionEnded("6");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void probuj_pobrac_temperatureEnter() {
            //#[ state ROOT.main.state_28.pobieranie_temperatury.state_7.probuj_pobrac_temperature.(Entry) 
            System.out.println("proba");
            //#]
        }
        
        //## statechart_method 
        public void pobieranie_temperatury_exit() {
            pobierz_temperature_exit();
            state_7_exit();
            pobieranie_temperaturyExit();
            animInstance().notifyStateExited("ROOT.main.state_28.pobieranie_temperatury");
        }
        
        //## statechart_method 
        public void pobieranie_temperaturyExit() {
        }
        
        //## statechart_method 
        public void start_entDef() {
            start_enter();
        }
        
        //## statechart_method 
        public void test_1Enter() {
            //#[ state ROOT.main.state_28.test_1.(Entry) 
            System.out.println("Klima: pobrano temperature: " + tmpObecnaTemp);
            //#]
        }
        
        //## statechart_method 
        public void test_1Exit() {
        }
        
        //## statechart_method 
        public void state_29_exit() {
            if(state_29_subState == debug_1)
                {
                    debug_1_exit();
                }
            state_29_subState = RiJNonState;
            state_29Exit();
            animInstance().notifyStateExited("ROOT.main.state_29");
        }
        
        //## statechart_method 
        public void awaria_exit() {
            awariaExit();
            animInstance().notifyStateExited("ROOT.main.state_28.awaria");
        }
        
        //## statechart_method 
        public void probuj_pobrac_temperatureExit() {
        }
        
        //## statechart_method 
        public void state_28_exit() {
            switch (state_28_subState) {
                case start:
                {
                    start_exit();
                }
                break;
                case pobieranie_temperatury:
                {
                    pobieranie_temperatury_exit();
                }
                break;
                case awaria:
                {
                    awaria_exit();
                }
                break;
                case test_1:
                {
                    test_1_exit();
                }
                break;
                default:
                    break;
            }
            state_28_subState = RiJNonState;
            state_28Exit();
            animInstance().notifyStateExited("ROOT.main.state_28");
        }
        
        //## statechart_method 
        public int rootState_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void probuj_pobrac_temperature_exit() {
            popNullConfig();
            probuj_pobrac_temperatureExit();
            animInstance().notifyStateExited("ROOT.main.state_28.pobieranie_temperatury.state_7.probuj_pobrac_temperature");
        }
        
        //## statechart_method 
        public void state_7_entDef() {
            state_7_enter();
            state_7EntDef();
        }
        
        //## statechart_method 
        public int test_1_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            res = state_28_takeEvent(id);
            return res;
        }
        
        //## statechart_method 
        public void test_1_exit() {
            test_1Exit();
            animInstance().notifyStateExited("ROOT.main.state_28.test_1");
        }
        
        //## statechart_method 
        public int debug_1_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.TIMEOUT_EVENT_ID))
                {
                    res = debug_1TakeRiJTimeout();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = state_29_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void temp_czas_start_enter() {
            animInstance().notifyStateEntered("ROOT.main.state_28.pobieranie_temperatury.pobierz_temperature.temp_czas_start");
            pobierz_temperature_subState = temp_czas_start;
            pobierz_temperature_active = temp_czas_start;
            temp_czas_startEnter();
        }
        
        //## statechart_method 
        public int pobierz_temperature_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void pobierz_temperature_enter() {
            animInstance().notifyStateEntered("ROOT.main.state_28.pobieranie_temperatury.pobierz_temperature");
            pobierz_temperatureEnter();
        }
        
        //## statechart_method 
        public int state_28_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void debug_1Enter() {
            //#[ state ROOT.main.state_29.debug_1.(Entry) 
            System.out.println("#### " + chcianaTemp);
            //#]
            itsRiJThread.schedTimeout(2000, Klimatyzator_Timeout_debug_1_id, this, "ROOT.main.state_29.debug_1");
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
        public int temp_czas_startTakeRiJTimeout() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.getTimeoutId() == Klimatyzator_Timeout_temp_czas_start_id)
                {
                    animInstance().notifyTransitionStarted("2");
                    temp_czas_start_exit();
                    temp_czas_koniec_entDef();
                    animInstance().notifyTransitionEnded("2");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public void pobierz_temperatureEnter() {
        }
        
        //## statechart_method 
        public void mainEnter() {
        }
        
        //## statechart_method 
        public void temp_czas_startEnter() {
            //#[ state ROOT.main.state_28.pobieranie_temperatury.pobierz_temperature.temp_czas_start.(Entry) 
            System.out.println("timer start!!!");
            //#]
            itsRiJThread.schedTimeout(1000, Klimatyzator_Timeout_temp_czas_start_id, this, "ROOT.main.state_28.pobieranie_temperatury.pobierz_temperature.temp_czas_start");
        }
        
        //## statechart_method 
        public int startTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("4");
            start_exit();
            pobieranie_temperatury_entDef();
            animInstance().notifyTransitionEnded("4");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void test_1_enter() {
            animInstance().notifyStateEntered("ROOT.main.state_28.test_1");
            state_28_subState = test_1;
            state_28_active = test_1;
            test_1Enter();
        }
        
        //## statechart_method 
        public int awaria_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            res = state_28_takeEvent(id);
            return res;
        }
        
        //## statechart_method 
        public void temp_czas_startExit() {
            itsRiJThread.unschedTimeout(Klimatyzator_Timeout_temp_czas_start_id, this);
        }
        
        //## statechart_method 
        public void temp_czas_start_entDef() {
            temp_czas_start_enter();
        }
        
        //## statechart_method 
        public int probuj_pobrac_temperature_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = probuj_pobrac_temperatureTakeNull();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = state_7_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void state_7Enter() {
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
                    res = state_28_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void state_28_entDef() {
            state_28_enter();
            state_28EntDef();
        }
        
        //## statechart_method 
        public void debug_1_exit() {
            debug_1Exit();
            animInstance().notifyStateExited("ROOT.main.state_29.debug_1");
        }
        
        //## statechart_method 
        public void main_entDef() {
            main_enter();
            state_28_entDef();
            state_29_entDef();
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            animInstance().notifyTransitionStarted("0");
            main_entDef();
            animInstance().notifyTransitionEnded("0");
        }
        
        //## statechart_method 
        public void temp_czas_koniecExit() {
        }
        
        //## statechart_method 
        public void pobierz_temperature_exit() {
            switch (pobierz_temperature_subState) {
                case temp_czas_start:
                {
                    temp_czas_start_exit();
                }
                break;
                case temp_czas_koniec:
                {
                    temp_czas_koniec_exit();
                }
                break;
                default:
                    break;
            }
            pobierz_temperature_subState = RiJNonState;
            pobierz_temperatureExit();
            animInstance().notifyStateExited("ROOT.main.state_28.pobieranie_temperatury.pobierz_temperature");
        }
        
        //## statechart_method 
        public void pobierz_temperatureEntDef() {
            animInstance().notifyTransitionStarted("3");
            temp_czas_start_entDef();
            animInstance().notifyTransitionEnded("3");
        }
        
        //## statechart_method 
        public int pobieranie_temperatury_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            res = state_28_takeEvent(id);
            return res;
        }
        
        //## statechart_method 
        public void pobieranie_temperatury_enter() {
            animInstance().notifyStateEntered("ROOT.main.state_28.pobieranie_temperatury");
            state_28_subState = pobieranie_temperatury;
            state_28_active = pobieranie_temperatury;
            pobieranie_temperaturyEnter();
        }
        
        //## statechart_method 
        public void state_28_enter() {
            animInstance().notifyStateEntered("ROOT.main.state_28");
            state_28Enter();
        }
        
        //## statechart_method 
        public void main_exit() {
            state_28_exit();
            state_29_exit();
            mainExit();
            animInstance().notifyStateExited("ROOT.main");
        }
        
        //## statechart_method 
        public void awariaExit() {
        }
        
        //## statechart_method 
        public void temp_czas_start_exit() {
            temp_czas_startExit();
            animInstance().notifyStateExited("ROOT.main.state_28.pobieranie_temperatury.pobierz_temperature.temp_czas_start");
        }
        
        //## statechart_method 
        public void pobierz_temperatureExit() {
        }
        
        //## statechart_method 
        public void probuj_pobrac_temperature_entDef() {
            probuj_pobrac_temperature_enter();
        }
        
        //## statechart_method 
        public void state_28Exit() {
        }
        
        //## statechart_method 
        public void state_29_enter() {
            animInstance().notifyStateEntered("ROOT.main.state_29");
            state_29Enter();
        }
        
        //## statechart_method 
        public void main_enter() {
            animInstance().notifyStateEntered("ROOT.main");
            rootState_subState = main;
            rootState_active = main;
            mainEnter();
        }
        
        //## statechart_method 
        public int state_7_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void state_7_exit() {
            if(state_7_subState == probuj_pobrac_temperature)
                {
                    probuj_pobrac_temperature_exit();
                }
            state_7_subState = RiJNonState;
            state_7Exit();
            animInstance().notifyStateExited("ROOT.main.state_28.pobieranie_temperatury.state_7");
        }
        
        //## statechart_method 
        public void state_7Exit() {
        }
        
        //## statechart_method 
        public void startExit() {
        }
        
        //## statechart_method 
        public void startEnter() {
            //#[ state ROOT.main.state_28.start.(Entry) 
            itsCzujnikTemp.setKlimatyzator(klimatyzator); 
            itsWentylator.setKlimatyzator(klimatyzator);
            itsDmuchawa.setKlimatyzator(klimatyzator); 
            itsOdbiornikIRDA.setKlimatyzator(klimatyzator);
            //#]
        }
        
        //## statechart_method 
        public int debug_1TakeRiJTimeout() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.getTimeoutId() == Klimatyzator_Timeout_debug_1_id)
                {
                    animInstance().notifyTransitionStarted("8");
                    debug_1_exit();
                    debug_1_entDef();
                    animInstance().notifyTransitionEnded("8");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public void state_29Exit() {
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public void pobieranie_temperatury_entDef() {
            pobieranie_temperatury_enter();
            pobierz_temperature_entDef();
            state_7_entDef();
        }
        
        //## statechart_method 
        public void state_28EntDef() {
            animInstance().notifyTransitionStarted("7");
            start_entDef();
            animInstance().notifyTransitionEnded("7");
        }
        
        //## statechart_method 
        public void mainExit() {
        }
        
        //## statechart_method 
        public void state_7_enter() {
            animInstance().notifyStateEntered("ROOT.main.state_28.pobieranie_temperatury.state_7");
            state_7Enter();
        }
        
        //## statechart_method 
        public void start_enter() {
            animInstance().notifyStateEntered("ROOT.main.state_28.start");
            pushNullConfig();
            state_28_subState = start;
            state_28_active = start;
            startEnter();
        }
        
        //## statechart_method 
        public void test_1_entDef() {
            test_1_enter();
        }
        
        //## statechart_method 
        public void state_29EntDef() {
            debug_1_entDef();
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
            return Klimatyzator.this.animInstance(); 
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassKlimatyzator; 
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
        
        msg.add("tmpObecnaTemp", tmpObecnaTemp);
        msg.add("chcianaTemp", chcianaTemp);
        msg.add("klimatyzator", klimatyzator);
        msg.add("pomieszczenie", pomieszczenie);
    }
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public void addRelations(AnimRelations msg) {
        
        msg.add("itsCzujnikTemp", true, true, itsCzujnikTemp);
        msg.add("itsDmuchawa", true, true, itsDmuchawa);
        msg.add("itsGrzalka", true, true, itsGrzalka);
        msg.add("itsKompresor", true, true, itsKompresor);
        msg.add("itsWentyl", true, true, itsWentyl);
        msg.add("itsWentylator", true, true, itsWentylator);
        msg.add("itsOdbiornikIRDA", true, true, itsOdbiornikIRDA);
        msg.add("itsPilot", true, true, itsPilot);
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(Klimatyzator.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            Klimatyzator.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            Klimatyzator.this.addRelations(msg);
        }
        
        public void addStates(AnimStates msg) {
            if ((reactive != null) && (reactive.isTerminated() == false))
              reactive.rootState_add(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/Klimatyzator.java
*********************************************************************/

