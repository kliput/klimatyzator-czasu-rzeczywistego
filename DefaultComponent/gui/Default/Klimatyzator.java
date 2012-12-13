/*********************************************************************
	Rhapsody	: 8.0
	Login		: Piotrek
	Component	: DefaultComponent
	Configuration 	: gui
	Model Element	: Klimatyzator
//!	Generated Date	: Thu, 13, Dec 2012 
	File Path	: DefaultComponent/gui/Default/Klimatyzator.java
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
    
    protected double chcianaTemp = 16;		//## attribute chcianaTemp 
    
    protected boolean czyAwaria = false;		//## attribute czyAwaria 
    
    protected Klimatyzator klimatyzator;		//## attribute klimatyzator 
    
    protected Pomieszczenie pomieszczenie;		//## attribute pomieszczenie 
    
    protected double tmpCzynnik;		//## attribute tmpCzynnik 
    
    protected double tmpObecnaTemp;		//## attribute tmpObecnaTemp 
    
    protected double tmpUstaw;		//## attribute tmpUstaw 
    
    protected double tmpUstaw2;		//## attribute tmpUstaw2 
    
    protected boolean wlaczony = false;		//## attribute wlaczony 
    
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
    public static final int wylacz=1;
    public static final int s1_awaria=2;
    public static final int on_off=3;
    public static final int main=4;
    public static final int state_47=5;
    public static final int sprawdz_on_off=6;
    public static final int state_29=7;
    public static final int sprawdzanie_awarii_start=8;
    public static final int accepteventaction_36=9;
    public static final int state_28=10;
    public static final int ustawianie_kompresora=11;
    public static final int state_55=12;
    public static final int sendaction_58=13;
    public static final int accepteventaction_59=14;
    public static final int state_54=15;
    public static final int state_54_temp_czas_start=16;
    public static final int komp_timeout=17;
    public static final int ustawianie_grzalki=18;
    public static final int ustawianie_grzalki_state_55=19;
    public static final int state_55_sendaction_58=20;
    public static final int state_55_accepteventaction_59=21;
    public static final int ustawianie_grzalki_state_54=22;
    public static final int state_54_state_54_temp_czas_start=23;
    public static final int state_54_komp_timeout=24;
    public static final int ustaw_wiatraki=25;
    public static final int ustaw_wentyl=26;
    public static final int ustaw_grzalke=27;
    public static final int start=28;
    public static final int sprawdz_temperature=29;
    public static final int pobieranie_temperatury=30;
    public static final int state_7=31;
    public static final int wyslano_zadanie=32;
    public static final int sendaction_41=33;
    public static final int accepteventaction_43=34;
    public static final int pobierz_temperature=35;
    public static final int temp_czas_start=36;
    public static final int temp_czas_koniec=37;
    public static final int oblicz_kompresor=38;
    public static final int oblicz_czynnik=39;
    public static final int czekaj=40;
    public static final int accepteventaction_45=41;
    //#]
    protected int rootState_subState;		//## ignore 
    
    protected int rootState_active;		//## ignore 
    
    protected int state_47_subState;		//## ignore 
    
    protected int state_47_active;		//## ignore 
    
    public static final int Klimatyzator_Timeout_sprawdz_on_off_id = 1;		//## ignore 
    
    protected int state_29_subState;		//## ignore 
    
    protected int state_29_active;		//## ignore 
    
    protected int state_28_subState;		//## ignore 
    
    protected int state_28_active;		//## ignore 
    
    protected int state_55_subState;		//## ignore 
    
    protected int state_55_active;		//## ignore 
    
    protected int state_54_subState;		//## ignore 
    
    protected int state_54_active;		//## ignore 
    
    public static final int Klimatyzator_Timeout_state_54_temp_czas_start_id = 2;		//## ignore 
    
    protected int ustawianie_grzalki_state_55_subState;		//## ignore 
    
    protected int ustawianie_grzalki_state_55_active;		//## ignore 
    
    protected int ustawianie_grzalki_state_54_subState;		//## ignore 
    
    protected int ustawianie_grzalki_state_54_active;		//## ignore 
    
    public static final int Klimatyzator_Timeout_state_54_state_54_temp_czas_start_id = 3;		//## ignore 
    
    public static final int Klimatyzator_Timeout_ustaw_wentyl_id = 4;		//## ignore 
    
    protected int state_7_subState;		//## ignore 
    
    protected int state_7_active;		//## ignore 
    
    protected int pobierz_temperature_subState;		//## ignore 
    
    protected int pobierz_temperature_active;		//## ignore 
    
    public static final int Klimatyzator_Timeout_temp_czas_start_id = 5;		//## ignore 
    
    public static final int Klimatyzator_Timeout_czekaj_id = 6;		//## ignore 
    
    
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
        klimatyzator = this;
        System.out.println("-> Klimatyzator: " + klimatyzator);;
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
    public double getChcianaTemp() {
        return chcianaTemp;
    }
    
    //## auto_generated 
    public void setChcianaTemp(double p_chcianaTemp) {
        try {
        chcianaTemp = p_chcianaTemp;
        }
        finally {
            animInstance().notifyUpdatedAttr();
        }
    }
    
    //## auto_generated 
    public boolean getCzyAwaria() {
        return czyAwaria;
    }
    
    //## auto_generated 
    public void setCzyAwaria(boolean p_czyAwaria) {
        try {
        czyAwaria = p_czyAwaria;
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
    public double getTmpCzynnik() {
        return tmpCzynnik;
    }
    
    //## auto_generated 
    public void setTmpCzynnik(double p_tmpCzynnik) {
        tmpCzynnik = p_tmpCzynnik;
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
    public double getTmpUstaw() {
        return tmpUstaw;
    }
    
    //## auto_generated 
    public void setTmpUstaw(double p_tmpUstaw) {
        tmpUstaw = p_tmpUstaw;
    }
    
    //## auto_generated 
    public double getTmpUstaw2() {
        return tmpUstaw2;
    }
    
    //## auto_generated 
    public void setTmpUstaw2(double p_tmpUstaw2) {
        tmpUstaw2 = p_tmpUstaw2;
    }
    
    //## auto_generated 
    public boolean getWlaczony() {
        return wlaczony;
    }
    
    //## auto_generated 
    public void setWlaczony(boolean p_wlaczony) {
        try {
        wlaczony = p_wlaczony;
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
    public Grzalka newItsGrzalka(RiJThread p_thread) {
        itsGrzalka = new Grzalka(p_thread);
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
    public Kompresor newItsKompresor(RiJThread p_thread) {
        itsKompresor = new Kompresor(p_thread);
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
        itsGrzalka = newItsGrzalka(p_thread);
        itsKompresor = newItsKompresor(p_thread);
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
        done &= itsGrzalka.startBehavior();
        done &= itsKompresor.startBehavior();
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
            if(ustawianie_grzalki_state_54 == state)
                {
                    return isIn(ustawianie_grzalki);
                }
            if(ustawianie_grzalki_state_54_subState == state)
                {
                    return true;
                }
            if(ustawianie_grzalki_state_55 == state)
                {
                    return isIn(ustawianie_grzalki);
                }
            if(ustawianie_grzalki_state_55_subState == state)
                {
                    return true;
                }
            if(state_54 == state)
                {
                    return isIn(ustawianie_kompresora);
                }
            if(state_54_subState == state)
                {
                    return true;
                }
            if(state_55 == state)
                {
                    return isIn(ustawianie_kompresora);
                }
            if(state_55_subState == state)
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
            if(state_47 == state)
                {
                    return isIn(main);
                }
            if(state_47_subState == state)
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
            switch (rootState_subState) {
                case s1_awaria:
                {
                    s1_awaria_add(animStates);
                }
                break;
                case main:
                {
                    main_add(animStates);
                }
                break;
                case accepteventaction_45:
                {
                    accepteventaction_45_add(animStates);
                }
                break;
                case czekaj:
                {
                    czekaj_add(animStates);
                }
                break;
                case on_off:
                {
                    on_off_add(animStates);
                }
                break;
                case wylacz:
                {
                    wylacz_add(animStates);
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
                case s1_awaria:
                {
                    res = s1_awaria_takeEvent(id);
                }
                break;
                case main:
                {
                    res = main_dispatchEvent(id);
                }
                break;
                case accepteventaction_45:
                {
                    res = accepteventaction_45_takeEvent(id);
                }
                break;
                case czekaj:
                {
                    res = czekaj_takeEvent(id);
                }
                break;
                case on_off:
                {
                    res = on_off_takeEvent(id);
                }
                break;
                case wylacz:
                {
                    res = wylacz_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## statechart_method 
        public void wylacz_add(AnimStates animStates) {
            animStates.add("ROOT.wylacz");
        }
        
        //## statechart_method 
        public void s1_awaria_add(AnimStates animStates) {
            animStates.add("ROOT.s1_awaria");
        }
        
        //## statechart_method 
        public void on_off_add(AnimStates animStates) {
            animStates.add("ROOT.on_off");
        }
        
        //## statechart_method 
        public void main_add(AnimStates animStates) {
            animStates.add("ROOT.main");
            state_28_add(animStates);
            state_29_add(animStates);
            state_47_add(animStates);
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
            if(state_47_dispatchEvent(id) >= 0)
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
        public void state_47_add(AnimStates animStates) {
            animStates.add("ROOT.main.state_47");
            if(state_47_subState == sprawdz_on_off)
                {
                    sprawdz_on_off_add(animStates);
                }
        }
        
        //## statechart_method 
        public int state_47_dispatchEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(state_47_active == sprawdz_on_off)
                {
                    res = sprawdz_on_off_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void sprawdz_on_off_add(AnimStates animStates) {
            animStates.add("ROOT.main.state_47.sprawdz_on_off");
        }
        
        //## statechart_method 
        public void state_29_add(AnimStates animStates) {
            animStates.add("ROOT.main.state_29");
            switch (state_29_subState) {
                case accepteventaction_36:
                {
                    accepteventaction_36_add(animStates);
                }
                break;
                case sprawdzanie_awarii_start:
                {
                    sprawdzanie_awarii_start_add(animStates);
                }
                break;
                default:
                    break;
            }
        }
        
        //## statechart_method 
        public int state_29_dispatchEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            switch (state_29_active) {
                case accepteventaction_36:
                {
                    res = accepteventaction_36_takeEvent(id);
                }
                break;
                case sprawdzanie_awarii_start:
                {
                    res = sprawdzanie_awarii_start_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## statechart_method 
        public void sprawdzanie_awarii_start_add(AnimStates animStates) {
            animStates.add("ROOT.main.state_29.sprawdzanie_awarii_start");
        }
        
        //## statechart_method 
        public void accepteventaction_36_add(AnimStates animStates) {
            animStates.add("ROOT.main.state_29.accepteventaction_36");
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
                case oblicz_kompresor:
                {
                    oblicz_kompresor_add(animStates);
                }
                break;
                case ustaw_wiatraki:
                {
                    ustaw_wiatraki_add(animStates);
                }
                break;
                case oblicz_czynnik:
                {
                    oblicz_czynnik_add(animStates);
                }
                break;
                case ustaw_grzalke:
                {
                    ustaw_grzalke_add(animStates);
                }
                break;
                case sprawdz_temperature:
                {
                    sprawdz_temperature_add(animStates);
                }
                break;
                case ustaw_wentyl:
                {
                    ustaw_wentyl_add(animStates);
                }
                break;
                case ustawianie_kompresora:
                {
                    ustawianie_kompresora_add(animStates);
                }
                break;
                case ustawianie_grzalki:
                {
                    ustawianie_grzalki_add(animStates);
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
                case oblicz_kompresor:
                {
                    res = oblicz_kompresor_takeEvent(id);
                }
                break;
                case ustaw_wiatraki:
                {
                    res = ustaw_wiatraki_takeEvent(id);
                }
                break;
                case oblicz_czynnik:
                {
                    res = oblicz_czynnik_takeEvent(id);
                }
                break;
                case ustaw_grzalke:
                {
                    res = ustaw_grzalke_takeEvent(id);
                }
                break;
                case sprawdz_temperature:
                {
                    res = sprawdz_temperature_takeEvent(id);
                }
                break;
                case ustaw_wentyl:
                {
                    res = ustaw_wentyl_takeEvent(id);
                }
                break;
                case ustawianie_kompresora:
                {
                    res = ustawianie_kompresora_dispatchEvent(id);
                }
                break;
                case ustawianie_grzalki:
                {
                    res = ustawianie_grzalki_dispatchEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## statechart_method 
        public void ustawianie_kompresora_add(AnimStates animStates) {
            animStates.add("ROOT.main.state_28.ustawianie_kompresora");
            state_54_add(animStates);
            state_55_add(animStates);
        }
        
        //## statechart_method 
        public int ustawianie_kompresora_dispatchEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(state_54_dispatchEvent(id) >= 0)
                {
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                    if(!isIn(ustawianie_kompresora))
                        {
                            return res;
                        }
                }
            if(state_55_dispatchEvent(id) >= 0)
                {
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                    if(!isIn(ustawianie_kompresora))
                        {
                            return res;
                        }
                }
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = ustawianie_kompresora_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void state_55_add(AnimStates animStates) {
            animStates.add("ROOT.main.state_28.ustawianie_kompresora.state_55");
            switch (state_55_subState) {
                case sendaction_58:
                {
                    sendaction_58_add(animStates);
                }
                break;
                case accepteventaction_59:
                {
                    accepteventaction_59_add(animStates);
                }
                break;
                default:
                    break;
            }
        }
        
        //## statechart_method 
        public int state_55_dispatchEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            switch (state_55_active) {
                case sendaction_58:
                {
                    res = sendaction_58_takeEvent(id);
                }
                break;
                case accepteventaction_59:
                {
                    res = accepteventaction_59_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## statechart_method 
        public void sendaction_58_add(AnimStates animStates) {
            animStates.add("ROOT.main.state_28.ustawianie_kompresora.state_55.sendaction_58");
        }
        
        //## statechart_method 
        public void accepteventaction_59_add(AnimStates animStates) {
            animStates.add("ROOT.main.state_28.ustawianie_kompresora.state_55.accepteventaction_59");
        }
        
        //## statechart_method 
        public void state_54_add(AnimStates animStates) {
            animStates.add("ROOT.main.state_28.ustawianie_kompresora.state_54");
            switch (state_54_subState) {
                case state_54_temp_czas_start:
                {
                    state_54_temp_czas_start_add(animStates);
                }
                break;
                case komp_timeout:
                {
                    komp_timeout_add(animStates);
                }
                break;
                default:
                    break;
            }
        }
        
        //## statechart_method 
        public int state_54_dispatchEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            switch (state_54_active) {
                case state_54_temp_czas_start:
                {
                    res = state_54_temp_czas_start_takeEvent(id);
                }
                break;
                case komp_timeout:
                {
                    res = komp_timeout_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## statechart_method 
        public void state_54_temp_czas_start_add(AnimStates animStates) {
            animStates.add("ROOT.main.state_28.ustawianie_kompresora.state_54.temp_czas_start");
        }
        
        //## statechart_method 
        public void komp_timeout_add(AnimStates animStates) {
            animStates.add("ROOT.main.state_28.ustawianie_kompresora.state_54.komp_timeout");
        }
        
        //## statechart_method 
        public void ustawianie_grzalki_add(AnimStates animStates) {
            animStates.add("ROOT.main.state_28.ustawianie_grzalki");
            ustawianie_grzalki_state_54_add(animStates);
            ustawianie_grzalki_state_55_add(animStates);
        }
        
        //## statechart_method 
        public int ustawianie_grzalki_dispatchEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(ustawianie_grzalki_state_54_dispatchEvent(id) >= 0)
                {
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                    if(!isIn(ustawianie_grzalki))
                        {
                            return res;
                        }
                }
            if(ustawianie_grzalki_state_55_dispatchEvent(id) >= 0)
                {
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                    if(!isIn(ustawianie_grzalki))
                        {
                            return res;
                        }
                }
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = ustawianie_grzalki_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void ustawianie_grzalki_state_55_add(AnimStates animStates) {
            animStates.add("ROOT.main.state_28.ustawianie_grzalki.state_55");
            switch (ustawianie_grzalki_state_55_subState) {
                case state_55_sendaction_58:
                {
                    state_55_sendaction_58_add(animStates);
                }
                break;
                case state_55_accepteventaction_59:
                {
                    state_55_accepteventaction_59_add(animStates);
                }
                break;
                default:
                    break;
            }
        }
        
        //## statechart_method 
        public int ustawianie_grzalki_state_55_dispatchEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            switch (ustawianie_grzalki_state_55_active) {
                case state_55_sendaction_58:
                {
                    res = state_55_sendaction_58_takeEvent(id);
                }
                break;
                case state_55_accepteventaction_59:
                {
                    res = state_55_accepteventaction_59_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## statechart_method 
        public void state_55_sendaction_58_add(AnimStates animStates) {
            animStates.add("ROOT.main.state_28.ustawianie_grzalki.state_55.sendaction_58");
        }
        
        //## statechart_method 
        public void state_55_accepteventaction_59_add(AnimStates animStates) {
            animStates.add("ROOT.main.state_28.ustawianie_grzalki.state_55.accepteventaction_59");
        }
        
        //## statechart_method 
        public void ustawianie_grzalki_state_54_add(AnimStates animStates) {
            animStates.add("ROOT.main.state_28.ustawianie_grzalki.state_54");
            switch (ustawianie_grzalki_state_54_subState) {
                case state_54_komp_timeout:
                {
                    state_54_komp_timeout_add(animStates);
                }
                break;
                case state_54_state_54_temp_czas_start:
                {
                    state_54_state_54_temp_czas_start_add(animStates);
                }
                break;
                default:
                    break;
            }
        }
        
        //## statechart_method 
        public int ustawianie_grzalki_state_54_dispatchEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            switch (ustawianie_grzalki_state_54_active) {
                case state_54_komp_timeout:
                {
                    res = state_54_komp_timeout_takeEvent(id);
                }
                break;
                case state_54_state_54_temp_czas_start:
                {
                    res = state_54_state_54_temp_czas_start_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## statechart_method 
        public void state_54_state_54_temp_czas_start_add(AnimStates animStates) {
            animStates.add("ROOT.main.state_28.ustawianie_grzalki.state_54.temp_czas_start");
        }
        
        //## statechart_method 
        public void state_54_komp_timeout_add(AnimStates animStates) {
            animStates.add("ROOT.main.state_28.ustawianie_grzalki.state_54.komp_timeout");
        }
        
        //## statechart_method 
        public void ustaw_wiatraki_add(AnimStates animStates) {
            animStates.add("ROOT.main.state_28.ustaw_wiatraki");
        }
        
        //## statechart_method 
        public void ustaw_wentyl_add(AnimStates animStates) {
            animStates.add("ROOT.main.state_28.ustaw_wentyl");
        }
        
        //## statechart_method 
        public void ustaw_grzalke_add(AnimStates animStates) {
            animStates.add("ROOT.main.state_28.ustaw_grzalke");
        }
        
        //## statechart_method 
        public void start_add(AnimStates animStates) {
            animStates.add("ROOT.main.state_28.start");
        }
        
        //## statechart_method 
        public void sprawdz_temperature_add(AnimStates animStates) {
            animStates.add("ROOT.main.state_28.sprawdz_temperature");
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
            switch (state_7_subState) {
                case sendaction_41:
                {
                    sendaction_41_add(animStates);
                }
                break;
                case wyslano_zadanie:
                {
                    wyslano_zadanie_add(animStates);
                }
                break;
                case accepteventaction_43:
                {
                    accepteventaction_43_add(animStates);
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
                case sendaction_41:
                {
                    res = sendaction_41_takeEvent(id);
                }
                break;
                case wyslano_zadanie:
                {
                    res = wyslano_zadanie_takeEvent(id);
                }
                break;
                case accepteventaction_43:
                {
                    res = accepteventaction_43_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## statechart_method 
        public void wyslano_zadanie_add(AnimStates animStates) {
            animStates.add("ROOT.main.state_28.pobieranie_temperatury.state_7.wyslano_zadanie");
        }
        
        //## statechart_method 
        public void sendaction_41_add(AnimStates animStates) {
            animStates.add("ROOT.main.state_28.pobieranie_temperatury.state_7.sendaction_41");
        }
        
        //## statechart_method 
        public void accepteventaction_43_add(AnimStates animStates) {
            animStates.add("ROOT.main.state_28.pobieranie_temperatury.state_7.accepteventaction_43");
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
        public void oblicz_kompresor_add(AnimStates animStates) {
            animStates.add("ROOT.main.state_28.oblicz_kompresor");
        }
        
        //## statechart_method 
        public void oblicz_czynnik_add(AnimStates animStates) {
            animStates.add("ROOT.main.state_28.oblicz_czynnik");
        }
        
        //## statechart_method 
        public void czekaj_add(AnimStates animStates) {
            animStates.add("ROOT.czekaj");
        }
        
        //## statechart_method 
        public void accepteventaction_45_add(AnimStates animStates) {
            animStates.add("ROOT.accepteventaction_45");
        }
        
        //## auto_generated 
        protected void initStatechart() {
            rootState_subState = RiJNonState;
            rootState_active = RiJNonState;
            state_47_subState = RiJNonState;
            state_47_active = RiJNonState;
            state_29_subState = RiJNonState;
            state_29_active = RiJNonState;
            state_28_subState = RiJNonState;
            state_28_active = RiJNonState;
            state_55_subState = RiJNonState;
            state_55_active = RiJNonState;
            state_54_subState = RiJNonState;
            state_54_active = RiJNonState;
            ustawianie_grzalki_state_55_subState = RiJNonState;
            ustawianie_grzalki_state_55_active = RiJNonState;
            ustawianie_grzalki_state_54_subState = RiJNonState;
            ustawianie_grzalki_state_54_active = RiJNonState;
            state_7_subState = RiJNonState;
            state_7_active = RiJNonState;
            pobierz_temperature_subState = RiJNonState;
            pobierz_temperature_active = RiJNonState;
        }
        
        //## statechart_method 
        public int oblicz_kompresorTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("7");
            oblicz_kompresor_exit();
            ustawianie_kompresora_entDef();
            animInstance().notifyTransitionEnded("7");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void oblicz_kompresor_entDef() {
            oblicz_kompresor_enter();
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
        public void wyslano_zadanie_exit() {
            wyslano_zadanieExit();
            animInstance().notifyStateExited("ROOT.main.state_28.pobieranie_temperatury.state_7.wyslano_zadanie");
        }
        
        //## statechart_method 
        public void start_exit() {
            popNullConfig();
            startExit();
            animInstance().notifyStateExited("ROOT.main.state_28.start");
        }
        
        //## statechart_method 
        public void ustaw_wiatraki_enter() {
            animInstance().notifyStateEntered("ROOT.main.state_28.ustaw_wiatraki");
            pushNullConfig();
            state_28_subState = ustaw_wiatraki;
            state_28_active = ustaw_wiatraki;
            ustaw_wiatrakiEnter();
        }
        
        //## statechart_method 
        public void state_54_komp_timeoutEnter() {
            //#[ state ROOT.main.state_28.ustawianie_grzalki.state_54.komp_timeout.(Entry) 
            System.out.println("Klima: przekroczono czas ustawiania grzalki");
            //#]
        }
        
        //## statechart_method 
        public void ustawianie_grzalki_state_54_enter() {
            animInstance().notifyStateEntered("ROOT.main.state_28.ustawianie_grzalki.state_54");
            ustawianie_grzalki_state_54Enter();
        }
        
        //## statechart_method 
        public int state_55_sendaction_58_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(odbiorDanych.odbiorDanych_Default_id))
                {
                    res = state_55_sendaction_58TakeodbiorDanych();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = ustawianie_grzalki_state_55_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void ustawianie_grzalki_enter() {
            animInstance().notifyStateEntered("ROOT.main.state_28.ustawianie_grzalki");
            state_28_subState = ustawianie_grzalki;
            state_28_active = ustawianie_grzalki;
            ustawianie_grzalkiEnter();
        }
        
        //## statechart_method 
        public void komp_timeout_entDef() {
            komp_timeout_enter();
        }
        
        //## statechart_method 
        public void state_54_temp_czas_startEnter() {
            //#[ state ROOT.main.state_28.ustawianie_kompresora.state_54.temp_czas_start.(Entry) 
            //System.out.println("timer start!!!");
            //#]
            itsRiJThread.schedTimeout(1000, Klimatyzator_Timeout_state_54_temp_czas_start_id, this, "ROOT.main.state_28.ustawianie_kompresora.state_54.temp_czas_start");
        }
        
        //## statechart_method 
        public void accepteventaction_59_entDef() {
            accepteventaction_59_enter();
        }
        
        //## statechart_method 
        public void state_29_entDef() {
            state_29_enter();
            state_29EntDef();
        }
        
        //## statechart_method 
        public void czekaj_entDef() {
            czekaj_enter();
        }
        
        //## statechart_method 
        public void oblicz_kompresorEnter() {
            //#[ state ROOT.main.state_28.oblicz_kompresor.(Entry) 
            if (tmpCzynnik < 0) {
                double max = Math.abs(20*tmpCzynnik);
                if (max >= Kompresor.MAX_MOC) max = Kompresor.MAX_MOC-1;
            
                tmpUstaw = max;
            } else {
                tmpUstaw = 0;
            }
            //#]
        }
        
        //## statechart_method 
        public void accepteventaction_43Enter() {
        }
        
        //## statechart_method 
        public void accepteventaction_43_entDef() {
            accepteventaction_43_enter();
        }
        
        //## statechart_method 
        public void wyslano_zadanie_enter() {
            animInstance().notifyStateEntered("ROOT.main.state_28.pobieranie_temperatury.state_7.wyslano_zadanie");
            state_7_subState = wyslano_zadanie;
            state_7_active = wyslano_zadanie;
            wyslano_zadanieEnter();
        }
        
        //## statechart_method 
        public void pobieranie_temperaturyEnter() {
        }
        
        //## statechart_method 
        public void ustaw_grzalkeExit() {
        }
        
        //## statechart_method 
        public void ustawianie_grzalki_state_54_entDef() {
            ustawianie_grzalki_state_54_enter();
            ustawianie_grzalki_state_54EntDef();
        }
        
        //## statechart_method 
        public void ustawianie_grzalki_state_55_enter() {
            animInstance().notifyStateEntered("ROOT.main.state_28.ustawianie_grzalki.state_55");
            ustawianie_grzalki_state_55Enter();
        }
        
        //## statechart_method 
        public void sendaction_58_exit() {
            sendaction_58Exit();
            animInstance().notifyStateExited("ROOT.main.state_28.ustawianie_kompresora.state_55.sendaction_58");
        }
        
        //## statechart_method 
        public void sendaction_58_enter() {
            animInstance().notifyStateEntered("ROOT.main.state_28.ustawianie_kompresora.state_55.sendaction_58");
            state_55_subState = sendaction_58;
            state_55_active = sendaction_58;
            sendaction_58Enter();
        }
        
        //## statechart_method 
        public void accepteventaction_36_exit() {
            popNullConfig();
            accepteventaction_36Exit();
            animInstance().notifyStateExited("ROOT.main.state_29.accepteventaction_36");
        }
        
        //## statechart_method 
        public void accepteventaction_36_enter() {
            animInstance().notifyStateEntered("ROOT.main.state_29.accepteventaction_36");
            pushNullConfig();
            state_29_subState = accepteventaction_36;
            state_29_active = accepteventaction_36;
            accepteventaction_36Enter();
        }
        
        //## statechart_method 
        public void on_off_enter() {
            animInstance().notifyStateEntered("ROOT.on_off");
            pushNullConfig();
            rootState_subState = on_off;
            rootState_active = on_off;
            on_offEnter();
        }
        
        //## statechart_method 
        public int s1_awariaTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("19");
            s1_awaria_exit();
            wylacz_entDef();
            animInstance().notifyTransitionEnded("19");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int accepteventaction_45_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = accepteventaction_45TakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void accepteventaction_45_exit() {
            popNullConfig();
            accepteventaction_45Exit();
            animInstance().notifyStateExited("ROOT.accepteventaction_45");
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
        public void sendaction_41Exit() {
        }
        
        //## statechart_method 
        public void state_7EntDef() {
            animInstance().notifyTransitionStarted("0");
            sendaction_41_entDef();
            animInstance().notifyTransitionEnded("0");
        }
        
        //## statechart_method 
        public void state_54_komp_timeout_entDef() {
            state_54_komp_timeout_enter();
        }
        
        //## statechart_method 
        public int ustawianie_grzalki_state_55_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void ustawianie_grzalki_state_55Enter() {
        }
        
        //## statechart_method 
        public int ustawianie_grzalki_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            res = state_28_takeEvent(id);
            return res;
        }
        
        //## statechart_method 
        public int accepteventaction_59_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = accepteventaction_59TakeNull();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = state_55_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public int sprawdzanie_awarii_start_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(awaria.awaria_Default_id))
                {
                    res = sprawdzanie_awarii_startTakeawaria();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = state_29_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void sprawdzanie_awarii_startEnter() {
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
        public void sprawdz_on_offExit() {
            itsRiJThread.unschedTimeout(Klimatyzator_Timeout_sprawdz_on_off_id, this);
        }
        
        //## statechart_method 
        public void on_off_exit() {
            popNullConfig();
            on_offExit();
            animInstance().notifyStateExited("ROOT.on_off");
        }
        
        //## statechart_method 
        public int accepteventaction_45TakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("20");
            accepteventaction_45_exit();
            //#[ transition 20 
            czyAwaria=false;        
            chcianaTemp = tmpObecnaTemp; 
            System.out.println("tutaj");
            //#]
            main_enter();
            state_29_entDef();
            state_47_entDef();
            state_28_enter();
            pobieranie_temperatury_entDef();
            animInstance().notifyTransitionEnded("20");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void oblicz_czynnik_enter() {
            animInstance().notifyStateEntered("ROOT.main.state_28.oblicz_czynnik");
            pushNullConfig();
            state_28_subState = oblicz_czynnik;
            state_28_active = oblicz_czynnik;
            oblicz_czynnikEnter();
        }
        
        //## statechart_method 
        public void oblicz_czynnikEnter() {
            //#[ state ROOT.main.state_28.oblicz_czynnik.(Entry) 
            tmpCzynnik = chcianaTemp - tmpObecnaTemp;
            //#]
        }
        
        //## statechart_method 
        public int oblicz_kompresor_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = oblicz_kompresorTakeNull();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = state_28_takeEvent(id);
                }
            return res;
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
        public int wyslano_zadanieTakeodbiorDanych() {
            odbiorDanych params = (odbiorDanych) event;
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("14");
            wyslano_zadanie_exit();
            //#[ transition 14 
            tmpObecnaTemp = params.dane;
            //#]
            accepteventaction_43_entDef();
            animInstance().notifyTransitionEnded("14");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void state_54_komp_timeout_exit() {
            popNullConfig();
            state_54_komp_timeoutExit();
            animInstance().notifyStateExited("ROOT.main.state_28.ustawianie_grzalki.state_54.komp_timeout");
        }
        
        //## statechart_method 
        public void ustawianie_grzalki_state_54Enter() {
        }
        
        //## statechart_method 
        public void ustawianie_grzalki_state_54EntDef() {
            animInstance().notifyTransitionStarted("39");
            state_54_state_54_temp_czas_start_entDef();
            animInstance().notifyTransitionEnded("39");
        }
        
        //## statechart_method 
        public void komp_timeoutEnter() {
            //#[ state ROOT.main.state_28.ustawianie_kompresora.state_54.komp_timeout.(Entry) 
            System.out.println("Klima: przekroczono czas ustawiania kompresora");
            //#]
        }
        
        //## statechart_method 
        public int state_54_temp_czas_start_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.TIMEOUT_EVENT_ID))
                {
                    res = state_54_temp_czas_startTakeRiJTimeout();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = state_54_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void state_54_temp_czas_start_exit() {
            state_54_temp_czas_startExit();
            animInstance().notifyStateExited("ROOT.main.state_28.ustawianie_kompresora.state_54.temp_czas_start");
        }
        
        //## statechart_method 
        public void state_28Enter() {
        }
        
        //## statechart_method 
        public int main_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void s1_awaria_entDef() {
            s1_awaria_enter();
        }
        
        //## statechart_method 
        public void wylacz_enter() {
            animInstance().notifyStateEntered("ROOT.wylacz");
            rootState_subState = wylacz;
            rootState_active = wylacz;
            wylaczEnter();
        }
        
        //## statechart_method 
        public int czekaj_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.TIMEOUT_EVENT_ID))
                {
                    res = czekajTakeRiJTimeout();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int czekajTakeRiJTimeout() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.getTimeoutId() == Klimatyzator_Timeout_czekaj_id)
                {
                    animInstance().notifyTransitionStarted("25");
                    czekaj_exit();
                    on_off_entDef();
                    animInstance().notifyTransitionEnded("25");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public void czekajEnter() {
            itsRiJThread.schedTimeout(100, Klimatyzator_Timeout_czekaj_id, this, "ROOT.czekaj");
        }
        
        //## statechart_method 
        public void oblicz_czynnik_entDef() {
            oblicz_czynnik_enter();
        }
        
        //## statechart_method 
        public void oblicz_kompresor_exit() {
            popNullConfig();
            oblicz_kompresorExit();
            animInstance().notifyStateExited("ROOT.main.state_28.oblicz_kompresor");
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
            animInstance().notifyTransitionStarted("5");
            main_exit();
            s1_awaria_entDef();
            animInstance().notifyTransitionEnded("5");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void accepteventaction_43_exit() {
            popNullConfig();
            accepteventaction_43Exit();
            animInstance().notifyStateExited("ROOT.main.state_28.pobieranie_temperatury.state_7.accepteventaction_43");
        }
        
        //## statechart_method 
        public void sendaction_41Enter() {
            //#[ state ROOT.main.state_28.pobieranie_temperatury.state_7.sendaction_41.(Entry) 
            itsCzujnikTemp.gen(new Default.pobierzDane());
            //#]
        }
        
        //## statechart_method 
        public void wyslano_zadanieExit() {
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
        public void sprawdz_temperatureExit() {
        }
        
        //## statechart_method 
        public void sprawdz_temperatureEnter() {
        }
        
        //## statechart_method 
        public void sprawdz_temperature_entDef() {
            sprawdz_temperature_enter();
        }
        
        //## statechart_method 
        public void start_entDef() {
            start_enter();
        }
        
        //## statechart_method 
        public int ustaw_wiatraki_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = ustaw_wiatrakiTakeNull();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = state_28_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void state_55_accepteventaction_59Enter() {
        }
        
        //## statechart_method 
        public void state_55_sendaction_58Exit() {
        }
        
        //## statechart_method 
        public void ustawianie_grzalki_state_55EntDef() {
            animInstance().notifyTransitionStarted("46");
            state_55_sendaction_58_entDef();
            animInstance().notifyTransitionEnded("46");
        }
        
        //## statechart_method 
        public void sprawdz_on_off_enter() {
            animInstance().notifyStateEntered("ROOT.main.state_47.sprawdz_on_off");
            state_47_subState = sprawdz_on_off;
            state_47_active = sprawdz_on_off;
            sprawdz_on_offEnter();
        }
        
        //## statechart_method 
        public void accepteventaction_43_enter() {
            animInstance().notifyStateEntered("ROOT.main.state_28.pobieranie_temperatury.state_7.accepteventaction_43");
            pushNullConfig();
            state_7_subState = accepteventaction_43;
            state_7_active = accepteventaction_43;
            accepteventaction_43Enter();
        }
        
        //## statechart_method 
        public int wyslano_zadanie_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(odbiorDanych.odbiorDanych_Default_id))
                {
                    res = wyslano_zadanieTakeodbiorDanych();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = state_7_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public int ustaw_grzalke_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = ustaw_grzalkeTakeNull();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = state_28_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void ustaw_wiatrakiEnter() {
            //#[ state ROOT.main.state_28.ustaw_wiatraki.(Entry) 
            int max = (int)Math.abs(80* tmpCzynnik);
            
            if (max >= Wiatrak.MAX_RPM) {
                max = Wiatrak.MAX_RPM-1;
            }
            
            itsDmuchawa.rpm = max;
            
            // dla temperatur dodatnich wentylator ma byæ zatrzymany
            if (tmpCzynnik > 0) {
                itsWentylator.rpm = 0;
            } else {
                itsWentylator.rpm = max;
            }
            
            //#]
        }
        
        //## statechart_method 
        public void ustawianie_grzalki_state_54Exit() {
        }
        
        //## statechart_method 
        public void state_55_accepteventaction_59Exit() {
        }
        
        //## statechart_method 
        public void ustawianie_grzalki_state_55_exit() {
            switch (ustawianie_grzalki_state_55_subState) {
                case state_55_sendaction_58:
                {
                    state_55_sendaction_58_exit();
                }
                break;
                case state_55_accepteventaction_59:
                {
                    state_55_accepteventaction_59_exit();
                }
                break;
                default:
                    break;
            }
            ustawianie_grzalki_state_55_subState = RiJNonState;
            ustawianie_grzalki_state_55Exit();
            animInstance().notifyStateExited("ROOT.main.state_28.ustawianie_grzalki.state_55");
        }
        
        //## statechart_method 
        public void state_54Exit() {
        }
        
        //## statechart_method 
        public int state_55_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public int ustawianie_kompresora_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            res = state_28_takeEvent(id);
            return res;
        }
        
        //## statechart_method 
        public void sprawdzanie_awarii_start_exit() {
            sprawdzanie_awarii_startExit();
            animInstance().notifyStateExited("ROOT.main.state_29.sprawdzanie_awarii_start");
        }
        
        //## statechart_method 
        public void state_29_exit() {
            switch (state_29_subState) {
                case accepteventaction_36:
                {
                    accepteventaction_36_exit();
                }
                break;
                case sprawdzanie_awarii_start:
                {
                    sprawdzanie_awarii_start_exit();
                }
                break;
                default:
                    break;
            }
            state_29_subState = RiJNonState;
            state_29Exit();
            animInstance().notifyStateExited("ROOT.main.state_29");
        }
        
        //## statechart_method 
        public void s1_awariaExit() {
        }
        
        //## statechart_method 
        public void accepteventaction_45_enter() {
            animInstance().notifyStateEntered("ROOT.accepteventaction_45");
            pushNullConfig();
            rootState_subState = accepteventaction_45;
            rootState_active = accepteventaction_45;
            accepteventaction_45Enter();
        }
        
        //## statechart_method 
        public void oblicz_czynnik_exit() {
            popNullConfig();
            oblicz_czynnikExit();
            animInstance().notifyStateExited("ROOT.main.state_28.oblicz_czynnik");
        }
        
        //## statechart_method 
        public void accepteventaction_43Exit() {
        }
        
        //## statechart_method 
        public int ustaw_wentyl_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.TIMEOUT_EVENT_ID))
                {
                    res = ustaw_wentylTakeRiJTimeout();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = state_28_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void ustaw_wentylEnter() {
            //#[ state ROOT.main.state_28.ustaw_wentyl.(Entry) 
            if (tmpCzynnik < 0) {
            	itsWentyl.gen(new wentylNotify(Math.abs(10 * tmpCzynnik)));
            }else{                                                      
            	itsWentyl.gen(new wentylNotify(0));
            }
            //#]
            itsRiJThread.schedTimeout(1000, Klimatyzator_Timeout_ustaw_wentyl_id, this, "ROOT.main.state_28.ustaw_wentyl");
        }
        
        //## statechart_method 
        public void ustaw_wiatraki_entDef() {
            ustaw_wiatraki_enter();
        }
        
        //## statechart_method 
        public void state_54_state_54_temp_czas_start_entDef() {
            state_54_state_54_temp_czas_start_enter();
        }
        
        //## statechart_method 
        public void ustawianie_grzalki_state_54_exit() {
            switch (ustawianie_grzalki_state_54_subState) {
                case state_54_komp_timeout:
                {
                    state_54_komp_timeout_exit();
                }
                break;
                case state_54_state_54_temp_czas_start:
                {
                    state_54_state_54_temp_czas_start_exit();
                }
                break;
                default:
                    break;
            }
            ustawianie_grzalki_state_54_subState = RiJNonState;
            ustawianie_grzalki_state_54Exit();
            animInstance().notifyStateExited("ROOT.main.state_28.ustawianie_grzalki.state_54");
        }
        
        //## statechart_method 
        public void ustawianie_grzalki_state_55Exit() {
        }
        
        //## statechart_method 
        public void komp_timeout_exit() {
            popNullConfig();
            komp_timeoutExit();
            animInstance().notifyStateExited("ROOT.main.state_28.ustawianie_kompresora.state_54.komp_timeout");
        }
        
        //## statechart_method 
        public void state_55Exit() {
        }
        
        //## statechart_method 
        public void ustawianie_kompresora_entDef() {
            ustawianie_kompresora_enter();
            state_54_entDef();
            state_55_entDef();
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
                case oblicz_kompresor:
                {
                    oblicz_kompresor_exit();
                }
                break;
                case ustaw_wiatraki:
                {
                    ustaw_wiatraki_exit();
                }
                break;
                case oblicz_czynnik:
                {
                    oblicz_czynnik_exit();
                }
                break;
                case ustaw_grzalke:
                {
                    ustaw_grzalke_exit();
                }
                break;
                case sprawdz_temperature:
                {
                    sprawdz_temperature_exit();
                }
                break;
                case ustaw_wentyl:
                {
                    ustaw_wentyl_exit();
                }
                break;
                case ustawianie_kompresora:
                {
                    ustawianie_kompresora_exit();
                }
                break;
                case ustawianie_grzalki:
                {
                    ustawianie_grzalki_exit();
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
        public void accepteventaction_36_entDef() {
            accepteventaction_36_enter();
        }
        
        //## statechart_method 
        public int sprawdz_on_offTakeRiJTimeout() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.getTimeoutId() == Klimatyzator_Timeout_sprawdz_on_off_id)
                {
                    //## transition 29 
                    if(wlaczony == true)
                        {
                            animInstance().notifyTransitionStarted("28");
                            animInstance().notifyTransitionStarted("29");
                            sprawdz_on_off_exit();
                            sprawdz_on_off_entDef();
                            animInstance().notifyTransitionEnded("29");
                            animInstance().notifyTransitionEnded("28");
                            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                        }
                    else
                        {
                            //## transition 30 
                            if(wlaczony==false)
                                {
                                    animInstance().notifyTransitionStarted("28");
                                    animInstance().notifyTransitionStarted("30");
                                    main_exit();
                                    on_off_entDef();
                                    animInstance().notifyTransitionEnded("30");
                                    animInstance().notifyTransitionEnded("28");
                                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                                }
                        }
                }
            return res;
        }
        
        //## statechart_method 
        public void sprawdz_on_off_entDef() {
            sprawdz_on_off_enter();
        }
        
        //## statechart_method 
        public int state_47_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void state_47Enter() {
        }
        
        //## statechart_method 
        public void on_offExit() {
        }
        
        //## statechart_method 
        public void on_off_entDef() {
            on_off_enter();
        }
        
        //## statechart_method 
        public int rootState_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void czekaj_exit() {
            czekajExit();
            animInstance().notifyStateExited("ROOT.czekaj");
        }
        
        //## statechart_method 
        public void sendaction_41_exit() {
            popNullConfig();
            sendaction_41Exit();
            animInstance().notifyStateExited("ROOT.main.state_28.pobieranie_temperatury.state_7.sendaction_41");
        }
        
        //## statechart_method 
        public void sendaction_41_enter() {
            animInstance().notifyStateEntered("ROOT.main.state_28.pobieranie_temperatury.state_7.sendaction_41");
            pushNullConfig();
            state_7_subState = sendaction_41;
            state_7_active = sendaction_41;
            sendaction_41Enter();
        }
        
        //## statechart_method 
        public void state_7_entDef() {
            state_7_enter();
            state_7EntDef();
        }
        
        //## statechart_method 
        public void sprawdz_temperature_exit() {
            popNullConfig();
            sprawdz_temperatureExit();
            animInstance().notifyStateExited("ROOT.main.state_28.sprawdz_temperature");
        }
        
        //## statechart_method 
        public int ustaw_wentylTakeRiJTimeout() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.getTimeoutId() == Klimatyzator_Timeout_ustaw_wentyl_id)
                {
                    animInstance().notifyTransitionStarted("9");
                    ustaw_wentyl_exit();
                    start_entDef();
                    animInstance().notifyTransitionEnded("9");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public int state_54_state_54_temp_czas_startTakeRiJTimeout() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.getTimeoutId() == Klimatyzator_Timeout_state_54_state_54_temp_czas_start_id)
                {
                    animInstance().notifyTransitionStarted("40");
                    state_54_state_54_temp_czas_start_exit();
                    state_54_komp_timeout_entDef();
                    animInstance().notifyTransitionEnded("40");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public void state_55_accepteventaction_59_exit() {
            popNullConfig();
            state_55_accepteventaction_59Exit();
            animInstance().notifyStateExited("ROOT.main.state_28.ustawianie_grzalki.state_55.accepteventaction_59");
        }
        
        //## statechart_method 
        public int state_55_sendaction_58TakeodbiorDanych() {
            odbiorDanych params = (odbiorDanych) event;
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("41");
            state_55_sendaction_58_exit();
            //#[ transition 41 
            tmpUstaw2 = params.dane;
            //#]
            state_55_accepteventaction_59_entDef();
            animInstance().notifyTransitionEnded("41");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void state_55_sendaction_58Enter() {
            //#[ state ROOT.main.state_28.ustawianie_grzalki.state_55.sendaction_58.(Entry) 
            itsGrzalka.gen(new Default.odbiorDanych(tmpUstaw));
            //#]
        }
        
        //## statechart_method 
        public void ustawianie_grzalki_state_55_entDef() {
            ustawianie_grzalki_state_55_enter();
            ustawianie_grzalki_state_55EntDef();
        }
        
        //## statechart_method 
        public int sprawdzanie_awarii_startTakeawaria() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("13");
            sprawdzanie_awarii_start_exit();
            accepteventaction_36_entDef();
            animInstance().notifyTransitionEnded("13");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void sprawdz_on_offEnter() {
            itsRiJThread.schedTimeout(100, Klimatyzator_Timeout_sprawdz_on_off_id, this, "ROOT.main.state_47.sprawdz_on_off");
        }
        
        //## statechart_method 
        public void state_47_enter() {
            animInstance().notifyStateEntered("ROOT.main.state_47");
            state_47Enter();
        }
        
        //## statechart_method 
        public void accepteventaction_45Exit() {
        }
        
        //## statechart_method 
        public void oblicz_czynnikExit() {
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
        public int sprawdz_temperatureTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            //## transition 18 
            if(tmpObecnaTemp < -40 || tmpObecnaTemp > 40)
                {
                    animInstance().notifyTransitionStarted("16");
                    animInstance().notifyTransitionStarted("18");
                    main_exit();
                    s1_awaria_entDef();
                    animInstance().notifyTransitionEnded("18");
                    animInstance().notifyTransitionEnded("16");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            else
                {
                    animInstance().notifyTransitionStarted("16");
                    animInstance().notifyTransitionStarted("17");
                    sprawdz_temperature_exit();
                    oblicz_czynnik_entDef();
                    animInstance().notifyTransitionEnded("17");
                    animInstance().notifyTransitionEnded("16");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public void ustaw_grzalke_entDef() {
            ustaw_grzalke_enter();
        }
        
        //## statechart_method 
        public int ustaw_wiatrakiTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("21");
            ustaw_wiatraki_exit();
            ustaw_wentyl_entDef();
            animInstance().notifyTransitionEnded("21");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void ustaw_wiatraki_exit() {
            popNullConfig();
            ustaw_wiatrakiExit();
            animInstance().notifyStateExited("ROOT.main.state_28.ustaw_wiatraki");
        }
        
        //## statechart_method 
        public void state_54_state_54_temp_czas_startEnter() {
            //#[ state ROOT.main.state_28.ustawianie_grzalki.state_54.temp_czas_start.(Entry) 
            //System.out.println("timer start!!!");
            //#]
            itsRiJThread.schedTimeout(1000, Klimatyzator_Timeout_state_54_state_54_temp_czas_start_id, this, "ROOT.main.state_28.ustawianie_grzalki.state_54.temp_czas_start");
        }
        
        //## statechart_method 
        public int ustawianie_grzalki_state_54_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public int state_55_accepteventaction_59TakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            //## transition 43 
            if(tmpUstaw != tmpUstaw2)
                {
                    animInstance().notifyTransitionStarted("42");
                    animInstance().notifyTransitionStarted("43");
                    main_exit();
                    s1_awaria_entDef();
                    animInstance().notifyTransitionEnded("43");
                    animInstance().notifyTransitionEnded("42");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            else
                {
                    animInstance().notifyTransitionStarted("42");
                    animInstance().notifyTransitionStarted("44");
                    ustawianie_grzalki_exit();
                    ustaw_wiatraki_entDef();
                    animInstance().notifyTransitionEnded("44");
                    animInstance().notifyTransitionEnded("42");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public void ustawianie_grzalkiEnter() {
        }
        
        //## statechart_method 
        public void sendaction_58Exit() {
        }
        
        //## statechart_method 
        public void state_55Enter() {
        }
        
        //## statechart_method 
        public int state_28_takeEvent(short id) {
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
        public int temp_czas_startTakeRiJTimeout() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.getTimeoutId() == Klimatyzator_Timeout_temp_czas_start_id)
                {
                    animInstance().notifyTransitionStarted("1");
                    temp_czas_start_exit();
                    temp_czas_koniec_entDef();
                    animInstance().notifyTransitionEnded("1");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public void pobierz_temperatureEnter() {
        }
        
        //## statechart_method 
        public int sendaction_41_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = sendaction_41TakeNull();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = state_7_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void sendaction_41_entDef() {
            sendaction_41_enter();
        }
        
        //## statechart_method 
        public void ustaw_wentyl_exit() {
            ustaw_wentylExit();
            animInstance().notifyStateExited("ROOT.main.state_28.ustaw_wentyl");
        }
        
        //## statechart_method 
        public int state_54_komp_timeout_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = state_54_komp_timeoutTakeNull();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = ustawianie_grzalki_state_54_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public int komp_timeoutTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("34");
            main_exit();
            s1_awaria_entDef();
            animInstance().notifyTransitionEnded("34");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void state_54Enter() {
        }
        
        //## statechart_method 
        public int sendaction_58_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(odbiorDanych.odbiorDanych_Default_id))
                {
                    res = sendaction_58TakeodbiorDanych();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = state_55_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public int accepteventaction_36_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = accepteventaction_36TakeNull();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = state_29_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void state_47_exit() {
            if(state_47_subState == sprawdz_on_off)
                {
                    sprawdz_on_off_exit();
                }
            state_47_subState = RiJNonState;
            state_47Exit();
            animInstance().notifyStateExited("ROOT.main.state_47");
        }
        
        //## statechart_method 
        public void mainEnter() {
        }
        
        //## statechart_method 
        public void temp_czas_startEnter() {
            //#[ state ROOT.main.state_28.pobieranie_temperatury.pobierz_temperature.temp_czas_start.(Entry) 
            //System.out.println("timer start!!!");
            //#]
            itsRiJThread.schedTimeout(1000, Klimatyzator_Timeout_temp_czas_start_id, this, "ROOT.main.state_28.pobieranie_temperatury.pobierz_temperature.temp_czas_start");
        }
        
        //## statechart_method 
        public int accepteventaction_43TakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("15");
            pobieranie_temperatury_exit();
            sprawdz_temperature_entDef();
            animInstance().notifyTransitionEnded("15");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int sendaction_41TakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("4");
            sendaction_41_exit();
            wyslano_zadanie_entDef();
            animInstance().notifyTransitionEnded("4");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int startTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("3");
            start_exit();
            pobieranie_temperatury_entDef();
            animInstance().notifyTransitionEnded("3");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void ustaw_wentylExit() {
            itsRiJThread.unschedTimeout(Klimatyzator_Timeout_ustaw_wentyl_id, this);
        }
        
        //## statechart_method 
        public int state_55_accepteventaction_59_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = state_55_accepteventaction_59TakeNull();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = ustawianie_grzalki_state_55_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void state_55_sendaction_58_exit() {
            state_55_sendaction_58Exit();
            animInstance().notifyStateExited("ROOT.main.state_28.ustawianie_grzalki.state_55.sendaction_58");
        }
        
        //## statechart_method 
        public int komp_timeout_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = komp_timeoutTakeNull();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = state_54_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void state_54_temp_czas_start_entDef() {
            state_54_temp_czas_start_enter();
        }
        
        //## statechart_method 
        public int state_54_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void state_54_entDef() {
            state_54_enter();
            state_54EntDef();
        }
        
        //## statechart_method 
        public void ustawianie_kompresoraExit() {
        }
        
        //## statechart_method 
        public void accepteventaction_36Exit() {
        }
        
        //## statechart_method 
        public void sprawdz_on_off_exit() {
            sprawdz_on_offExit();
            animInstance().notifyStateExited("ROOT.main.state_47.sprawdz_on_off");
        }
        
        //## statechart_method 
        public void state_47Exit() {
        }
        
        //## statechart_method 
        public void state_47EntDef() {
            animInstance().notifyTransitionStarted("22");
            sprawdz_on_off_entDef();
            animInstance().notifyTransitionEnded("22");
        }
        
        //## statechart_method 
        public void s1_awaria_enter() {
            animInstance().notifyStateEntered("ROOT.s1_awaria");
            pushNullConfig();
            rootState_subState = s1_awaria;
            rootState_active = s1_awaria;
            s1_awariaEnter();
        }
        
        //## statechart_method 
        public void wylaczEnter() {
            //#[ state ROOT.wylacz.(Entry) 
            chcianaTemp = 0;
            wlaczony = false;
            tmpObecnaTemp = 0;
            itsDmuchawa.rpm = 0;
            itsGrzalka.moc = 0;
            itsKompresor.moc = 0;
            itsWentylator.rpm = 0;
            itsWentyl.gen(new wentylNotify(0));
            //#]
        }
        
        //## statechart_method 
        public void wylacz_entDef() {
            wylacz_enter();
        }
        
        //## statechart_method 
        public void oblicz_kompresorExit() {
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
        public void state_7Enter() {
        }
        
        //## statechart_method 
        public int sprawdz_temperature_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = sprawdz_temperatureTakeNull();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = state_28_takeEvent(id);
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
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = state_28_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void ustaw_grzalkeEnter() {
            //#[ state ROOT.main.state_28.ustaw_grzalke.(Entry) 
            if (tmpCzynnik > 0) {
                double max = Math.abs(20*tmpCzynnik);
                if (max >= Grzalka.MAX_MOC) max = Grzalka.MAX_MOC-1;
            
                tmpUstaw = max;
            } else {
                tmpUstaw = 0;
            }
            //#]
        }
        
        //## statechart_method 
        public int state_54_state_54_temp_czas_start_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.TIMEOUT_EVENT_ID))
                {
                    res = state_54_state_54_temp_czas_startTakeRiJTimeout();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = ustawianie_grzalki_state_54_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void state_54_state_54_temp_czas_start_exit() {
            state_54_state_54_temp_czas_startExit();
            animInstance().notifyStateExited("ROOT.main.state_28.ustawianie_grzalki.state_54.temp_czas_start");
        }
        
        //## statechart_method 
        public void ustawianie_grzalki_exit() {
            ustawianie_grzalki_state_54_exit();
            ustawianie_grzalki_state_55_exit();
            ustawianie_grzalkiExit();
            animInstance().notifyStateExited("ROOT.main.state_28.ustawianie_grzalki");
        }
        
        //## statechart_method 
        public void state_54_enter() {
            animInstance().notifyStateEntered("ROOT.main.state_28.ustawianie_kompresora.state_54");
            state_54Enter();
        }
        
        //## statechart_method 
        public int accepteventaction_59TakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            //## transition 37 
            if(tmpUstaw != tmpUstaw2)
                {
                    animInstance().notifyTransitionStarted("36");
                    animInstance().notifyTransitionStarted("37");
                    main_exit();
                    s1_awaria_entDef();
                    animInstance().notifyTransitionEnded("37");
                    animInstance().notifyTransitionEnded("36");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            else
                {
                    animInstance().notifyTransitionStarted("36");
                    animInstance().notifyTransitionStarted("38");
                    ustawianie_kompresora_exit();
                    ustaw_grzalke_entDef();
                    animInstance().notifyTransitionEnded("38");
                    animInstance().notifyTransitionEnded("36");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public void accepteventaction_59Exit() {
        }
        
        //## statechart_method 
        public void state_55_exit() {
            switch (state_55_subState) {
                case sendaction_58:
                {
                    sendaction_58_exit();
                }
                break;
                case accepteventaction_59:
                {
                    accepteventaction_59_exit();
                }
                break;
                default:
                    break;
            }
            state_55_subState = RiJNonState;
            state_55Exit();
            animInstance().notifyStateExited("ROOT.main.state_28.ustawianie_kompresora.state_55");
        }
        
        //## statechart_method 
        public void state_55_enter() {
            animInstance().notifyStateEntered("ROOT.main.state_28.ustawianie_kompresora.state_55");
            state_55Enter();
        }
        
        //## statechart_method 
        public void ustawianie_kompresoraEnter() {
        }
        
        //## statechart_method 
        public void state_28_entDef() {
            state_28_enter();
            state_28EntDef();
        }
        
        //## statechart_method 
        public int accepteventaction_36TakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("12");
            main_exit();
            s1_awaria_entDef();
            animInstance().notifyTransitionEnded("12");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void sprawdzanie_awarii_startExit() {
        }
        
        //## statechart_method 
        public void main_entDef() {
            main_enter();
            state_28_entDef();
            state_29_entDef();
            state_47_entDef();
        }
        
        //## statechart_method 
        public int s1_awaria_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = s1_awariaTakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void s1_awariaEnter() {
            //#[ state ROOT.s1_awaria.(Entry) 
            System.out.println("AWARIA!!!");     
            czyAwaria = true;
            //#]
        }
        
        //## statechart_method 
        public int wylaczTakereset() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("31");
            wylacz_exit();
            accepteventaction_45_entDef();
            animInstance().notifyTransitionEnded("31");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            animInstance().notifyTransitionStarted("27");
            on_off_entDef();
            animInstance().notifyTransitionEnded("27");
        }
        
        //## statechart_method 
        public void czekaj_enter() {
            animInstance().notifyStateEntered("ROOT.czekaj");
            rootState_subState = czekaj;
            rootState_active = czekaj;
            czekajEnter();
        }
        
        //## statechart_method 
        public void oblicz_kompresor_enter() {
            animInstance().notifyStateEntered("ROOT.main.state_28.oblicz_kompresor");
            pushNullConfig();
            state_28_subState = oblicz_kompresor;
            state_28_active = oblicz_kompresor;
            oblicz_kompresorEnter();
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
            animInstance().notifyTransitionStarted("2");
            temp_czas_start_entDef();
            animInstance().notifyTransitionEnded("2");
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
        public void sprawdz_temperature_enter() {
            animInstance().notifyStateEntered("ROOT.main.state_28.sprawdz_temperature");
            pushNullConfig();
            state_28_subState = sprawdz_temperature;
            state_28_active = sprawdz_temperature;
            sprawdz_temperatureEnter();
        }
        
        //## statechart_method 
        public void ustaw_wentyl_entDef() {
            ustaw_wentyl_enter();
        }
        
        //## statechart_method 
        public void state_55_accepteventaction_59_enter() {
            animInstance().notifyStateEntered("ROOT.main.state_28.ustawianie_grzalki.state_55.accepteventaction_59");
            pushNullConfig();
            ustawianie_grzalki_state_55_subState = state_55_accepteventaction_59;
            ustawianie_grzalki_state_55_active = state_55_accepteventaction_59;
            state_55_accepteventaction_59Enter();
        }
        
        //## statechart_method 
        public void state_55_accepteventaction_59_entDef() {
            state_55_accepteventaction_59_enter();
        }
        
        //## statechart_method 
        public void state_54_temp_czas_startExit() {
            itsRiJThread.unschedTimeout(Klimatyzator_Timeout_state_54_temp_czas_start_id, this);
        }
        
        //## statechart_method 
        public void state_54_exit() {
            switch (state_54_subState) {
                case state_54_temp_czas_start:
                {
                    state_54_temp_czas_start_exit();
                }
                break;
                case komp_timeout:
                {
                    komp_timeout_exit();
                }
                break;
                default:
                    break;
            }
            state_54_subState = RiJNonState;
            state_54Exit();
            animInstance().notifyStateExited("ROOT.main.state_28.ustawianie_kompresora.state_54");
        }
        
        //## statechart_method 
        public void state_28_enter() {
            animInstance().notifyStateEntered("ROOT.main.state_28");
            state_28Enter();
        }
        
        //## statechart_method 
        public void sprawdzanie_awarii_start_entDef() {
            sprawdzanie_awarii_start_enter();
        }
        
        //## statechart_method 
        public void main_exit() {
            state_28_exit();
            state_29_exit();
            state_47_exit();
            mainExit();
            animInstance().notifyStateExited("ROOT.main");
        }
        
        //## statechart_method 
        public int wylacz_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(reset.reset_Default_id))
                {
                    res = wylaczTakereset();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void accepteventaction_45_entDef() {
            accepteventaction_45_enter();
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
        public int accepteventaction_43_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = accepteventaction_43TakeNull();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = state_7_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public int ustaw_grzalkeTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("11");
            ustaw_grzalke_exit();
            ustawianie_grzalki_entDef();
            animInstance().notifyTransitionEnded("11");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void state_54_state_54_temp_czas_startExit() {
            itsRiJThread.unschedTimeout(Klimatyzator_Timeout_state_54_state_54_temp_czas_start_id, this);
        }
        
        //## statechart_method 
        public void accepteventaction_59Enter() {
        }
        
        //## statechart_method 
        public void state_28Exit() {
        }
        
        //## statechart_method 
        public void sprawdzanie_awarii_start_enter() {
            animInstance().notifyStateEntered("ROOT.main.state_29.sprawdzanie_awarii_start");
            state_29_subState = sprawdzanie_awarii_start;
            state_29_active = sprawdzanie_awarii_start;
            sprawdzanie_awarii_startEnter();
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
        public int on_offTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            //## transition 23 
            if(wlaczony == true)
                {
                    animInstance().notifyTransitionStarted("26");
                    animInstance().notifyTransitionStarted("23");
                    on_off_exit();
                    //#[ transition 23 
                    chcianaTemp = 16;
                    //#]
                    main_entDef();
                    animInstance().notifyTransitionEnded("23");
                    animInstance().notifyTransitionEnded("26");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            else
                {
                    //## transition 24 
                    if(wlaczony == false)
                        {
                            animInstance().notifyTransitionStarted("26");
                            animInstance().notifyTransitionStarted("24");
                            on_off_exit();
                            czekaj_entDef();
                            animInstance().notifyTransitionEnded("24");
                            animInstance().notifyTransitionEnded("26");
                            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                        }
                }
            return res;
        }
        
        //## statechart_method 
        public void wylacz_exit() {
            wylaczExit();
            animInstance().notifyStateExited("ROOT.wylacz");
        }
        
        //## statechart_method 
        public void wyslano_zadanieEnter() {
        }
        
        //## statechart_method 
        public int state_7_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void state_7_exit() {
            switch (state_7_subState) {
                case sendaction_41:
                {
                    sendaction_41_exit();
                }
                break;
                case wyslano_zadanie:
                {
                    wyslano_zadanie_exit();
                }
                break;
                case accepteventaction_43:
                {
                    accepteventaction_43_exit();
                }
                break;
                default:
                    break;
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
            //klimatyzator = this;
            System.out.println("-> Klimatyzator start: " + klimatyzator);
            
            //#]
        }
        
        //## statechart_method 
        public void ustaw_grzalke_exit() {
            popNullConfig();
            ustaw_grzalkeExit();
            animInstance().notifyStateExited("ROOT.main.state_28.ustaw_grzalke");
        }
        
        //## statechart_method 
        public void ustaw_grzalke_enter() {
            animInstance().notifyStateEntered("ROOT.main.state_28.ustaw_grzalke");
            pushNullConfig();
            state_28_subState = ustaw_grzalke;
            state_28_active = ustaw_grzalke;
            ustaw_grzalkeEnter();
        }
        
        //## statechart_method 
        public void state_54_komp_timeout_enter() {
            animInstance().notifyStateEntered("ROOT.main.state_28.ustawianie_grzalki.state_54.komp_timeout");
            pushNullConfig();
            ustawianie_grzalki_state_54_subState = state_54_komp_timeout;
            ustawianie_grzalki_state_54_active = state_54_komp_timeout;
            state_54_komp_timeoutEnter();
        }
        
        //## statechart_method 
        public void state_54_temp_czas_start_enter() {
            animInstance().notifyStateEntered("ROOT.main.state_28.ustawianie_kompresora.state_54.temp_czas_start");
            state_54_subState = state_54_temp_czas_start;
            state_54_active = state_54_temp_czas_start;
            state_54_temp_czas_startEnter();
        }
        
        //## statechart_method 
        public void state_54EntDef() {
            animInstance().notifyTransitionStarted("32");
            state_54_temp_czas_start_entDef();
            animInstance().notifyTransitionEnded("32");
        }
        
        //## statechart_method 
        public void sendaction_58_entDef() {
            sendaction_58_enter();
        }
        
        //## statechart_method 
        public void ustawianie_kompresora_exit() {
            state_54_exit();
            state_55_exit();
            ustawianie_kompresoraExit();
            animInstance().notifyStateExited("ROOT.main.state_28.ustawianie_kompresora");
        }
        
        //## statechart_method 
        public void state_29Exit() {
        }
        
        //## statechart_method 
        public void s1_awaria_exit() {
            popNullConfig();
            s1_awariaExit();
            animInstance().notifyStateExited("ROOT.s1_awaria");
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public void czekajExit() {
            itsRiJThread.unschedTimeout(Klimatyzator_Timeout_czekaj_id, this);
        }
        
        //## statechart_method 
        public int oblicz_czynnik_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = oblicz_czynnikTakeNull();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = state_28_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void pobieranie_temperatury_entDef() {
            pobieranie_temperatury_enter();
            pobierz_temperature_entDef();
            state_7_entDef();
        }
        
        //## statechart_method 
        public void state_54_state_54_temp_czas_start_enter() {
            animInstance().notifyStateEntered("ROOT.main.state_28.ustawianie_grzalki.state_54.temp_czas_start");
            ustawianie_grzalki_state_54_subState = state_54_state_54_temp_czas_start;
            ustawianie_grzalki_state_54_active = state_54_state_54_temp_czas_start;
            state_54_state_54_temp_czas_startEnter();
        }
        
        //## statechart_method 
        public void state_55_sendaction_58_enter() {
            animInstance().notifyStateEntered("ROOT.main.state_28.ustawianie_grzalki.state_55.sendaction_58");
            ustawianie_grzalki_state_55_subState = state_55_sendaction_58;
            ustawianie_grzalki_state_55_active = state_55_sendaction_58;
            state_55_sendaction_58Enter();
        }
        
        //## statechart_method 
        public void state_55_sendaction_58_entDef() {
            state_55_sendaction_58_enter();
        }
        
        //## statechart_method 
        public void ustawianie_grzalkiExit() {
        }
        
        //## statechart_method 
        public void ustawianie_grzalki_entDef() {
            ustawianie_grzalki_enter();
            ustawianie_grzalki_state_54_entDef();
            ustawianie_grzalki_state_55_entDef();
        }
        
        //## statechart_method 
        public void komp_timeout_enter() {
            animInstance().notifyStateEntered("ROOT.main.state_28.ustawianie_kompresora.state_54.komp_timeout");
            pushNullConfig();
            state_54_subState = komp_timeout;
            state_54_active = komp_timeout;
            komp_timeoutEnter();
        }
        
        //## statechart_method 
        public void accepteventaction_59_enter() {
            animInstance().notifyStateEntered("ROOT.main.state_28.ustawianie_kompresora.state_55.accepteventaction_59");
            pushNullConfig();
            state_55_subState = accepteventaction_59;
            state_55_active = accepteventaction_59;
            accepteventaction_59Enter();
        }
        
        //## statechart_method 
        public void sendaction_58Enter() {
            //#[ state ROOT.main.state_28.ustawianie_kompresora.state_55.sendaction_58.(Entry) 
            itsKompresor.gen(new Default.odbiorDanych(tmpUstaw));
            //#]
        }
        
        //## statechart_method 
        public void state_55EntDef() {
            animInstance().notifyTransitionStarted("47");
            sendaction_58_entDef();
            animInstance().notifyTransitionEnded("47");
        }
        
        //## statechart_method 
        public void state_28EntDef() {
            animInstance().notifyTransitionStarted("6");
            start_entDef();
            animInstance().notifyTransitionEnded("6");
        }
        
        //## statechart_method 
        public void accepteventaction_36Enter() {
        }
        
        //## statechart_method 
        public void state_47_entDef() {
            state_47_enter();
            state_47EntDef();
        }
        
        //## statechart_method 
        public void mainExit() {
        }
        
        //## statechart_method 
        public int on_off_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = on_offTakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void wylaczExit() {
        }
        
        //## statechart_method 
        public void accepteventaction_45Enter() {
        }
        
        //## statechart_method 
        public int oblicz_czynnikTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("10");
            oblicz_czynnik_exit();
            oblicz_kompresor_entDef();
            animInstance().notifyTransitionEnded("10");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void wyslano_zadanie_entDef() {
            wyslano_zadanie_enter();
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
        public void ustaw_wentyl_enter() {
            animInstance().notifyStateEntered("ROOT.main.state_28.ustaw_wentyl");
            state_28_subState = ustaw_wentyl;
            state_28_active = ustaw_wentyl;
            ustaw_wentylEnter();
        }
        
        //## statechart_method 
        public void ustaw_wiatrakiExit() {
        }
        
        //## statechart_method 
        public int state_54_komp_timeoutTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("45");
            main_exit();
            s1_awaria_entDef();
            animInstance().notifyTransitionEnded("45");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void state_54_komp_timeoutExit() {
        }
        
        //## statechart_method 
        public void komp_timeoutExit() {
        }
        
        //## statechart_method 
        public int state_54_temp_czas_startTakeRiJTimeout() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.getTimeoutId() == Klimatyzator_Timeout_state_54_temp_czas_start_id)
                {
                    animInstance().notifyTransitionStarted("33");
                    state_54_temp_czas_start_exit();
                    komp_timeout_entDef();
                    animInstance().notifyTransitionEnded("33");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public void accepteventaction_59_exit() {
            popNullConfig();
            accepteventaction_59Exit();
            animInstance().notifyStateExited("ROOT.main.state_28.ustawianie_kompresora.state_55.accepteventaction_59");
        }
        
        //## statechart_method 
        public int sendaction_58TakeodbiorDanych() {
            odbiorDanych params = (odbiorDanych) event;
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("35");
            sendaction_58_exit();
            //#[ transition 35 
            tmpUstaw2 = params.dane;
            //#]
            accepteventaction_59_entDef();
            animInstance().notifyTransitionEnded("35");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void state_55_entDef() {
            state_55_enter();
            state_55EntDef();
        }
        
        //## statechart_method 
        public void ustawianie_kompresora_enter() {
            animInstance().notifyStateEntered("ROOT.main.state_28.ustawianie_kompresora");
            state_28_subState = ustawianie_kompresora;
            state_28_active = ustawianie_kompresora;
            ustawianie_kompresoraEnter();
        }
        
        //## statechart_method 
        public void state_29EntDef() {
            animInstance().notifyTransitionStarted("8");
            sprawdzanie_awarii_start_entDef();
            animInstance().notifyTransitionEnded("8");
        }
        
        //## statechart_method 
        public int sprawdz_on_off_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.TIMEOUT_EVENT_ID))
                {
                    res = sprawdz_on_offTakeRiJTimeout();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = state_47_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void on_offEnter() {
            //#[ state ROOT.on_off.(Entry) 
            chcianaTemp = 0;
            czyAwaria = false;
            tmpObecnaTemp = 0;
            itsDmuchawa.rpm = 0;
            itsGrzalka.moc = 0;
            itsKompresor.moc = 0;
            itsWentylator.rpm = 0;
            itsWentyl.gen(new wentylNotify(0));
            
            itsCzujnikTemp.setKlimatyzator(klimatyzator); 
            itsWentylator.setKlimatyzator(klimatyzator);
            itsDmuchawa.setKlimatyzator(klimatyzator); 
            itsKompresor.setKlimatyzator(klimatyzator);
            itsOdbiornikIRDA.setKlimatyzator(klimatyzator);
            itsGrzalka.setKlimatyzator(klimatyzator);
            //#]
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
        msg.add("tmpUstaw", tmpUstaw);
        msg.add("tmpCzynnik", tmpCzynnik);
        msg.add("czyAwaria", czyAwaria);
        msg.add("wlaczony", wlaczony);
        msg.add("tmpUstaw2", tmpUstaw2);
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
	File Path	: DefaultComponent/gui/Default/Klimatyzator.java
*********************************************************************/

