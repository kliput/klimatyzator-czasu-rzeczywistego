/*********************************************************************
	Rhapsody	: 7.6.1
	Login		: Kuba
	Component	: DefaultComponent
	Configuration 	: gui
	Model Element	: przycisk_plus
//!	Generated Date	: Tue, 11, Dec 2012 
	File Path	: DefaultComponent/gui/Default/przycisk_plus.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/przycisk_plus.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## event przycisk_plus() 
public class przycisk_plus extends RiJEvent implements AnimatedEvent {
    
    public static final int przycisk_plus_Default_id = 18619;		//## ignore 
    
    
    // Constructors
    
    public  przycisk_plus() {
        lId = przycisk_plus_Default_id;
    }
    
    public boolean isTypeOf(long id) {
        return (przycisk_plus_Default_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("Default.przycisk_plus");
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
          String s="przycisk_plus(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/gui/Default/przycisk_plus.java
*********************************************************************/

