/*********************************************************************
	Rhapsody	: 8.0
	Login		: Piotrek
	Component	: DefaultComponent
	Configuration 	: gui
	Model Element	: odbiorDanych
//!	Generated Date	: Wed, 12, Dec 2012 
	File Path	: DefaultComponent/gui/Default/odbiorDanych.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/odbiorDanych.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## event odbiorDanych(double) 
public class odbiorDanych extends RiJEvent implements AnimatedEvent {
    
    public static final int odbiorDanych_Default_id = 18623;		//## ignore 
    
    public double dane;
    
    // Constructors
    
    public  odbiorDanych() {
        lId = odbiorDanych_Default_id;
    }
    public  odbiorDanych(double p_dane) {
        lId = odbiorDanych_Default_id;
        dane = p_dane;
    }
    
    public boolean isTypeOf(long id) {
        return (odbiorDanych_Default_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("Default.odbiorDanych");
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
          msg.add("dane", dane);
    }
    public String toString() {
          String s="odbiorDanych(";      
          s += "dane=" + AnimInstance.animToString(dane) + " ";
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/gui/Default/odbiorDanych.java
*********************************************************************/

