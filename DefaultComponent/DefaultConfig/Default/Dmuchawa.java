/*********************************************************************
	Rhapsody	: 7.6.1
	Login		: Kuba
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Dmuchawa
//!	Generated Date	: Fri, 7, Dec 2012 
	File Path	: DefaultComponent/DefaultConfig/Default/Dmuchawa.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/Dmuchawa.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class Dmuchawa 
public class Dmuchawa implements Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassDmuchawa = new AnimClass("Default.Dmuchawa",false);
    //#]
    
    protected static final int MAX_RPM = 2000;		//## attribute MAX_RPM 
    
    protected int rpm = 0;		//## attribute rpm 
    
    
    // Constructors
    
    //## operation Dmuchawa() 
    public  Dmuchawa() {
        System.out.println("  -> Dmuchawa");;
        try {
            animInstance().notifyConstructorEntered(animClassDmuchawa.getUserClass(),
               new ArgData[] {
               });
        
        //#[ operation Dmuchawa() 
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public static final int getMAX_RPM() {
        return MAX_RPM;
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
        return animClassDmuchawa; 
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
        msg.add("MAX_RPM", MAX_RPM);
    }
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public void addRelations(AnimRelations msg) {
        
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(Dmuchawa.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            Dmuchawa.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            Dmuchawa.this.addRelations(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/Dmuchawa.java
*********************************************************************/

