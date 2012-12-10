/*********************************************************************
	Rhapsody	: 7.6.1
	Login		: Kuba
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: wentylNotify
//!	Generated Date	: Mon, 10, Dec 2012 
	File Path	: DefaultComponent/DefaultConfig/Default/wentylNotify.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/wentylNotify.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## event wentylNotify(double) 
public class wentylNotify extends RiJEvent implements AnimatedEvent {
    
    public static final int wentylNotify_Default_id = 18617;		//## ignore 
    
    public double procentOtw;
    
    // Constructors
    
    public  wentylNotify() {
        lId = wentylNotify_Default_id;
    }
    public  wentylNotify(double p_procentOtw) {
        lId = wentylNotify_Default_id;
        procentOtw = p_procentOtw;
    }
    
    public boolean isTypeOf(long id) {
        return (wentylNotify_Default_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("Default.wentylNotify");
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
          msg.add("procentOtw", procentOtw);
    }
    public String toString() {
          String s="wentylNotify(";      
          s += "procentOtw=" + AnimInstance.animToString(procentOtw) + " ";
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/wentylNotify.java
*********************************************************************/

