/*********************************************************************
	Rhapsody	: 7.6.1
	Login		: Kuba
	Component	: DefaultComponent
	Configuration 	: gui
	Model Element	: temperatureNotify
//!	Generated Date	: Mon, 10, Dec 2012 
	File Path	: DefaultComponent/gui/Default/temperatureNotify.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/temperatureNotify.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## event temperatureNotify(int) 
public class temperatureNotify extends RiJEvent implements AnimatedEvent {
    
    public static final int temperatureNotify_Default_id = 18616;		//## ignore 
    
    public int temperatura;
    
    // Constructors
    
    public  temperatureNotify() {
        lId = temperatureNotify_Default_id;
    }
    public  temperatureNotify(int p_temperatura) {
        lId = temperatureNotify_Default_id;
        temperatura = p_temperatura;
    }
    
    public boolean isTypeOf(long id) {
        return (temperatureNotify_Default_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("Default.temperatureNotify");
    /**  see com.ibm.rational.rhapsody.animation.AnimatedEvent interface */
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
    /**  see com.ibm.rational.rhapsody.animation.AnimatedEvent interface */
    public void addAttributes(AnimAttributes msg) {      
          msg.add("temperatura", temperatura);
    }
    public String toString() {
          String s="temperatureNotify(";      
          s += "temperatura=" + AnimInstance.animToString(temperatura) + " ";
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/gui/Default/temperatureNotify.java
*********************************************************************/

