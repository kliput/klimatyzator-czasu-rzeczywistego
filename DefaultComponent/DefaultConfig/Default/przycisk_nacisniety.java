/*********************************************************************
	Rhapsody	: 8.0
	Login		: Piotrek
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: przycisk_nacisniety
//!	Generated Date	: Tue, 11, Dec 2012 
	File Path	: DefaultComponent/DefaultConfig/Default/przycisk_nacisniety.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/przycisk_nacisniety.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## event przycisk_nacisniety(String) 
public class przycisk_nacisniety extends RiJEvent implements AnimatedEvent {
    
    public static final int przycisk_nacisniety_Default_id = 18618;		//## ignore 
    
    public String przycisk;
    
    // Constructors
    
    public  przycisk_nacisniety() {
        lId = przycisk_nacisniety_Default_id;
    }
    public  przycisk_nacisniety(String p_przycisk) {
        lId = przycisk_nacisniety_Default_id;
        przycisk = p_przycisk;
    }
    
    public boolean isTypeOf(long id) {
        return (przycisk_nacisniety_Default_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("Default.przycisk_nacisniety");
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
          msg.add("przycisk", przycisk);
    }
    public String toString() {
          String s="przycisk_nacisniety(";      
          s += "przycisk=" + AnimInstance.animToString(przycisk) + " ";
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/przycisk_nacisniety.java
*********************************************************************/

