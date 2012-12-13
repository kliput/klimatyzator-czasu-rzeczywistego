/*********************************************************************
	Rhapsody	: 8.0
	Login		: Piotrek
	Component	: DefaultComponent
	Configuration 	: gui
	Model Element	: przycisk_minus
//!	Generated Date	: Thu, 13, Dec 2012 
	File Path	: DefaultComponent/gui/Default/przycisk_minus.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/przycisk_minus.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## event przycisk_minus() 
public class przycisk_minus extends RiJEvent implements AnimatedEvent {
    
    public static final int przycisk_minus_Default_id = 18620;		//## ignore 
    
    
    // Constructors
    
    public  przycisk_minus() {
        lId = przycisk_minus_Default_id;
    }
    
    public boolean isTypeOf(long id) {
        return (przycisk_minus_Default_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("Default.przycisk_minus");
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
    }
    public String toString() {
          String s="przycisk_minus(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/gui/Default/przycisk_minus.java
*********************************************************************/

