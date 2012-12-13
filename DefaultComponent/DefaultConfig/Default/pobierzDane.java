/*********************************************************************
	Rhapsody	: 8.0
	Login		: Piotrek
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: pobierzDane
//!	Generated Date	: Thu, 13, Dec 2012 
	File Path	: DefaultComponent/DefaultConfig/Default/pobierzDane.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/pobierzDane.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## event pobierzDane() 
public class pobierzDane extends RiJEvent implements AnimatedEvent {
    
    public static final int pobierzDane_Default_id = 18622;		//## ignore 
    
    
    // Constructors
    
    public  pobierzDane() {
        lId = pobierzDane_Default_id;
    }
    
    public boolean isTypeOf(long id) {
        return (pobierzDane_Default_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("Default.pobierzDane");
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
          String s="pobierzDane(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/pobierzDane.java
*********************************************************************/

