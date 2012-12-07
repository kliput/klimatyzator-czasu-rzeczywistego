/*********************************************************************
	Rhapsody	: 7.6.1
	Login		: Kuba
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Wentylator
//!	Generated Date	: Fri, 7, Dec 2012 
	File Path	: DefaultComponent/DefaultConfig/Default/Wentylator.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/Wentylator.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class Wentylator 
public class Wentylator implements Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassWentylator = new AnimClass("Default.Wentylator",false);
    //#]
    
    protected int rpm = 0;		//## attribute rpm 
    
    
    // Constructors
    
    //## operation Wentylator() 
    public  Wentylator() {
        System.out.println("  -> Wentylator");;
        try {
            animInstance().notifyConstructorEntered(animClassWentylator.getUserClass(),
               new ArgData[] {
               });
        
        //#[ operation Wentylator() 
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public int getRpm() {
        return rpm;
    }
    
    //## auto_generated 
    public void setRpm(int p_rpm) {
        rpm = p_rpm;
    }
    
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassWentylator; 
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
        
        msg.add("rpm", rpm);
    }
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public void addRelations(AnimRelations msg) {
        
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(Wentylator.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            Wentylator.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            Wentylator.this.addRelations(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/Wentylator.java
*********************************************************************/

