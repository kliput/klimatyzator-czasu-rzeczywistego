/*********************************************************************
	Rhapsody	: 7.6.1
	Login		: Kuba
	Component	: DefaultComponent
	Configuration 	: gui
	Model Element	: gui
//!	Generated Date	: Wed, 12, Dec 2012 
	File Path	: DefaultComponent/gui/MainDefaultComponent.java
*********************************************************************/


//## auto_generated
import Default.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.*;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.*;

//----------------------------------------------------------------------------
// MainDefaultComponent.java                                                                  
//----------------------------------------------------------------------------


//## ignore 
public class MainDefaultComponent {
    
    //#[ ignore
    // link with events in order to register them in the animation browser
    static {
      // Setting Animation Default Port 
      AnimTcpIpConnection.setDefaultPort(6423);
      // Registering Events 
      try {
        
            Class.forName("Default.awaria");
            Class.forName("Default.odbiorDanych");
            Class.forName("Default.pobierzDane");
            Class.forName("Default.przycisk_minus");
            Class.forName("Default.przycisk_nacisniety");
            Class.forName("Default.przycisk_plus");
            Class.forName("Default.reset");
            Class.forName("Default.temperatureNotify");
            Class.forName("Default.wentylNotify");
    
        // Registering Static Classes 
        
      }
      catch(Exception e) { 
         java.lang.System.err.println(e.toString());
         e.printStackTrace(java.lang.System.err);
      }
    }
    //#]
    
    protected static Pomieszczenie p_Pomieszczenie = null;
    
    //## configuration DefaultComponent::gui 
    public static void main(String[] args) {
        RiJOXF.Init(null, 0, 0, true, args);
        MainDefaultComponent initializer_DefaultComponent = new MainDefaultComponent();
        p_Pomieszczenie = new Pomieszczenie(RiJMainThread.instance());
        p_Pomieszczenie.startBehavior();
        //#[ configuration DefaultComponent::gui 
        //#]
        RiJOXF.Start();
        p_Pomieszczenie=null;
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/gui/MainDefaultComponent.java
*********************************************************************/

